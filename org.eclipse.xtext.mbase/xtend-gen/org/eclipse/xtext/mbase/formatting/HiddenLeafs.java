package org.eclipse.xtext.mbase.formatting;

import java.util.List;
import org.eclipse.xtext.mbase.formatting.LeafInfo;

@Deprecated/* 
@Data */
@SuppressWarnings("all")
public class HiddenLeafs {
  private int offset;
  
  private List<LeafInfo> leafs /* Skipped initializer because of errors */;
  
  public boolean isSingleWhitespace() {
    throw new Error("Unresolved compilation problems:"
      + "\n|| cannot be resolved."
      + "\n== cannot be resolved."
      + "\nThe method or field head is undefined for the type List<LeafInfo>"
      + "\n&& cannot be resolved");
  }
  
  public int getLenght() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fold(int, Object) is undefined for the type List<LeafInfo>"
      + "\n+ cannot be resolved"
      + "\nnode cannot be resolved"
      + "\nlength cannot be resolved");
  }
  
  public int getNewLines() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method fold(int, Object) is undefined for the type List<LeafInfo>"
      + "\n+ cannot be resolved"
      + "\nnewLines cannot be resolved");
  }
  
  public int getNewLinesInComments() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method filter(Class<CommentInfo>) is undefined for the type List<LeafInfo>"
      + "\nfold cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nnewLines cannot be resolved");
  }
  
  public Object containsComment() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method filter(Class<CommentInfo>) is undefined for the type List<LeafInfo>"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved");
  }
}
