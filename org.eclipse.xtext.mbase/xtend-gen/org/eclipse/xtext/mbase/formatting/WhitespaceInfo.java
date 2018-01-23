package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.mbase.formatting.CommentInfo;
import org.eclipse.xtext.mbase.formatting.LeafInfo;

@Deprecated/* 
@Data */
@SuppressWarnings("all")
public class WhitespaceInfo extends LeafInfo {
  private int offset;
  
  public Object getLength() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field node is not visible"
      + "\nThe field LeafInfo.node refers to the missing type ILeafNode"
      + "\nlength cannot be resolved");
  }
  
  public CommentInfo leadingComment() {
    throw new Error("Unresolved compilation problems:"
      + "\n- cannot be resolved."
      + "\nThe field container is not visible"
      + "\nThe field leafs is not visible"
      + "\nThe field container is not visible"
      + "\nThe field leafs is not visible"
      + "\n>= cannot be resolved");
  }
  
  public CommentInfo trailingComment() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nThe field container is not visible"
      + "\nThe field leafs is not visible"
      + "\nThe field container is not visible"
      + "\nThe field leafs is not visible"
      + "\nThe field container is not visible"
      + "\nThe field leafs is not visible"
      + "\n< cannot be resolved");
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("WS: \"�node?.text�\"");
    _builder.newLine();
    return _builder.toString();
  }
}
