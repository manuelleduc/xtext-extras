package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.mbase.formatting.LeafInfo;

@Deprecated/* 
@Data */
@SuppressWarnings("all")
public class CommentInfo extends LeafInfo {
  private boolean trailing;
  
  public Object endsWithNewLine() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field node is not visible"
      + "\nThe field LeafInfo.node refers to the missing type ILeafNode"
      + "\ntext cannot be resolved"
      + "\nendsWith cannot be resolved");
  }
  
  public Object isMultiline() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field node is not visible"
      + "\nThe method endsWithNewLine() from the type CommentInfo refers to the missing type Object"
      + "\nThe field LeafInfo.node refers to the missing type ILeafNode"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ncontains cannot be resolved");
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Comment: \"�node.text�\"");
    _builder.newLine();
    return _builder.toString();
  }
}
