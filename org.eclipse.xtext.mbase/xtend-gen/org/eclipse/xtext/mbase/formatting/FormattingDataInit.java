package org.eclipse.xtext.mbase.formatting;

/**
 * @deprecated use {@link IHiddenRegionFormatter}
 */
@Deprecated
@SuppressWarnings("all")
public class FormattingDataInit {
  public String space = null;
  
  public Integer newLines = null;
  
  public int increaseIndentationChange = 0;
  
  public int decreaseIndentationChange = 0;
  
  public /* PreferenceKey */Object key = null;
  
  public void cfg(final /* PreferenceKey */Object key) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field FormattingDataInit.key refers to the missing type PreferenceKey");
  }
  
  public void newLine() {
    this.newLines = Integer.valueOf(1);
  }
  
  public void noSpace() {
    this.space = "";
  }
  
  public void oneSpace() {
    this.space = " ";
  }
  
  public void increaseIndentation() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved.");
  }
  
  public void decreaseIndentation() {
    throw new Error("Unresolved compilation problems:"
      + "\n- cannot be resolved.");
  }
  
  @Override
  public String toString() {
    throw new Error("Unresolved compilation problems:"
      + "\nToStringBuilder cannot be resolved."
      + "\naddAllFields cannot be resolved"
      + "\ntoString cannot be resolved");
  }
}
