package org.eclipse.xtext.mbase.formatting;

/**
 * @deprecated use {@link IHiddenRegionFormatter}
 */
@Deprecated/* 
@Data */
@SuppressWarnings("all")
public abstract class FormattingData {
  private int offset;
  
  private int length;
  
  private int increaseIndentationChange;
  
  private int decreaseIndentationChange;
  
  private Throwable trace;
  
  public abstract boolean isEmpty();
  
  public Object getIndentationChange() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved.");
  }
}
