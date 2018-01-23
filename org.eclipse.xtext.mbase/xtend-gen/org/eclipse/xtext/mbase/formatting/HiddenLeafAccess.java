package org.eclipse.xtext.mbase.formatting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.mbase.formatting.CommentInfo;
import org.eclipse.xtext.mbase.formatting.HiddenLeafs;
import org.eclipse.xtext.mbase.formatting.LeafInfo;
import org.eclipse.xtext.mbase.formatting.NodeModelAccess;
import org.eclipse.xtext.mbase.formatting.WhitespaceInfo;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parsetree.reconstr.impl.NodeIterator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * @deprecated use {@link ITextRegionAccess}
 */
@Deprecated
@SuppressWarnings("all")
public class HiddenLeafAccess {
  @Inject
  @Extension
  private NodeModelAccess _nodeModelAccess;
  
  public HiddenLeafs getHiddenLeafsBefore(final INode node) {
    HiddenLeafs _xblockexpression = null;
    {
      final Function1<ILeafNode, Boolean> _function = (ILeafNode it) -> {
        boolean _isHidden = it.isHidden();
        return Boolean.valueOf((!_isHidden));
      };
      final ILeafNode start = this._nodeModelAccess.findNextLeaf(node, _function);
      final List<ILeafNode> nodes = this.findPreviousHiddenLeafs(start);
      HiddenLeafs _xifexpression = null;
      if ((start != null)) {
        int _xifexpression_1 = (int) 0;
        boolean _isEmpty = nodes.isEmpty();
        if (_isEmpty) {
          _xifexpression_1 = start.getOffset();
        } else {
          _xifexpression_1 = IterableExtensions.<ILeafNode>head(nodes).getOffset();
        }
        _xifexpression = this.newHiddenLeafs(_xifexpression_1, nodes);
      } else {
        int _offset = 0;
        if (node!=null) {
          _offset=node.getOffset();
        }
        _xifexpression = new HiddenLeafs(_offset);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected HiddenLeafs newHiddenLeafs(final int offset, final List<ILeafNode> nodes) {
    HiddenLeafs _xblockexpression = null;
    {
      final HiddenLeafs result = new HiddenLeafs(offset);
      boolean trailing = true;
      for (final ILeafNode node : nodes) {
        {
          boolean comment = false;
          int newLines = 0;
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(node.getText());
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            int _length = node.getText().length();
            int _minus = (_length - 1);
            IntegerRange _upTo = new IntegerRange(0, _minus);
            for (final Integer i : _upTo) {
              {
                final char c = node.getText().charAt((i).intValue());
                String _string = Character.valueOf(c).toString();
                boolean _equals = Objects.equal(_string, "\n");
                if (_equals) {
                  newLines = (newLines + 1);
                } else {
                  boolean _isWhitespace = Character.isWhitespace(c);
                  boolean _not_1 = (!_isWhitespace);
                  if (_not_1) {
                    comment = true;
                  }
                }
              }
            }
          }
          if (comment) {
            LeafInfo _last = IterableExtensions.<LeafInfo>last(result.getLeafs());
            boolean _not_1 = (!(_last instanceof WhitespaceInfo));
            if (_not_1) {
              List<LeafInfo> _leafs = result.getLeafs();
              int _offset = node.getOffset();
              WhitespaceInfo _whitespaceInfo = new WhitespaceInfo(result, null, 0, _offset);
              _leafs.add(_whitespaceInfo);
            }
            List<LeafInfo> _leafs_1 = result.getLeafs();
            CommentInfo _commentInfo = new CommentInfo(result, node, newLines, trailing);
            _leafs_1.add(_commentInfo);
          } else {
            List<LeafInfo> _leafs_2 = result.getLeafs();
            int _offset_1 = node.getOffset();
            WhitespaceInfo _whitespaceInfo_1 = new WhitespaceInfo(result, node, newLines, _offset_1);
            _leafs_2.add(_whitespaceInfo_1);
          }
          if ((newLines > 0)) {
            trailing = false;
          }
        }
      }
      LeafInfo _last = IterableExtensions.<LeafInfo>last(result.getLeafs());
      boolean _not = (!(_last instanceof WhitespaceInfo));
      if (_not) {
        List<LeafInfo> _leafs = result.getLeafs();
        int _xifexpression = (int) 0;
        boolean _isEmpty = result.getLeafs().isEmpty();
        if (_isEmpty) {
          _xifexpression = offset;
        } else {
          _xifexpression = IterableExtensions.<LeafInfo>last(result.getLeafs()).getNode().getEndOffset();
        }
        WhitespaceInfo _whitespaceInfo = new WhitespaceInfo(result, null, 0, _xifexpression);
        _leafs.add(_whitespaceInfo);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public HiddenLeafs getHiddenLeafsAfter(final INode node) {
    HiddenLeafs _xblockexpression = null;
    {
      final Function1<ILeafNode, Boolean> _function = (ILeafNode it) -> {
        boolean _isHidden = it.isHidden();
        return Boolean.valueOf((!_isHidden));
      };
      final ILeafNode start = this.findPreviousLeaf(node, _function);
      HiddenLeafs _xifexpression = null;
      if ((start != null)) {
        _xifexpression = this.newHiddenLeafs(start.getEndOffset(), this.findNextHiddenLeafs(start));
      } else {
        int _offset = 0;
        if (node!=null) {
          _offset=node.getOffset();
        }
        _xifexpression = new HiddenLeafs(_offset);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected List<ILeafNode> findNextHiddenLeafs(final INode node) {
    ArrayList<ILeafNode> _xblockexpression = null;
    {
      final ArrayList<ILeafNode> result = CollectionLiterals.<ILeafNode>newArrayList();
      final NodeIterator ni = new NodeIterator(node);
      while (ni.hasNext()) {
        {
          final INode next = ni.next();
          if ((next instanceof ILeafNode)) {
            boolean _isHidden = ((ILeafNode)next).isHidden();
            if (_isHidden) {
              result.add(((ILeafNode)next));
            } else {
              return result;
            }
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected ILeafNode findPreviousLeaf(final INode node, final Function1<? super ILeafNode, ? extends Boolean> matches) {
    INode current = node;
    while ((current instanceof ICompositeNode)) {
      current = ((ICompositeNode)current).getLastChild();
    }
    if (((current instanceof ILeafNode) && (matches.apply(((ILeafNode) current))).booleanValue())) {
      return ((ILeafNode) current);
    }
    if ((current != null)) {
      final NodeIterator ni = new NodeIterator(current);
      while (ni.hasPrevious()) {
        {
          final INode previous = ni.previous();
          if (((previous instanceof ILeafNode) && (matches.apply(((ILeafNode) previous))).booleanValue())) {
            return ((ILeafNode) previous);
          }
        }
      }
    }
    return null;
  }
  
  protected List<ILeafNode> findPreviousHiddenLeafs(final INode node) {
    List<ILeafNode> _xblockexpression = null;
    {
      INode current = node;
      while ((current instanceof ICompositeNode)) {
        current = ((ICompositeNode)current).getLastChild();
      }
      final ArrayList<ILeafNode> result = CollectionLiterals.<ILeafNode>newArrayList();
      if ((current != null)) {
        final NodeIterator ni = new NodeIterator(current);
        while (ni.hasPrevious()) {
          {
            final INode previous = ni.previous();
            if (((!Objects.equal(previous, current)) && (previous instanceof ILeafNode))) {
              boolean _isHidden = ((ILeafNode) previous).isHidden();
              if (_isHidden) {
                result.add(((ILeafNode) previous));
              } else {
                return ListExtensions.<ILeafNode>reverse(result);
              }
            }
          }
        }
      }
      _xblockexpression = ListExtensions.<ILeafNode>reverse(result);
    }
    return _xblockexpression;
  }
}
