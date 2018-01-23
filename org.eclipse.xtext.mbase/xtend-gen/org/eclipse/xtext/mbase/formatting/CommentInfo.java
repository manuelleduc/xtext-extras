package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.mbase.formatting.HiddenLeafs;
import org.eclipse.xtext.mbase.formatting.LeafInfo;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.xbase.lib.Pure;

@Deprecated
@Data
@SuppressWarnings("all")
public class CommentInfo extends LeafInfo {
  private final boolean trailing;
  
  public boolean endsWithNewLine() {
    return this.getNode().getText().endsWith("\n");
  }
  
  public boolean isMultiline() {
    return ((!this.endsWithNewLine()) && this.getNode().getText().contains("\n"));
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Comment: \"�node.text�\"");
    _builder.newLine();
    return _builder.toString();
  }
  
  public CommentInfo(final HiddenLeafs container, final ILeafNode node, final int newLines, final boolean trailing) {
    super(container, node, newLines);
    this.trailing = trailing;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + (this.trailing ? 1231 : 1237);
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    if (!super.equals(obj))
      return false;
    CommentInfo other = (CommentInfo) obj;
    if (other.trailing != this.trailing)
      return false;
    return true;
  }
  
  @Pure
  public boolean isTrailing() {
    return this.trailing;
  }
}
