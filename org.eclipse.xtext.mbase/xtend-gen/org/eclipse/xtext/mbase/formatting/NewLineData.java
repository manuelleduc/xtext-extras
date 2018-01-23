package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.FormattingData;

/**
 * @deprecated use {@link IHiddenRegionFormatter}
 */
@Deprecated/* 
@Data */
@SuppressWarnings("all")
public class NewLineData extends FormattingData {
  private Integer newLines;
  
  @Override
  public boolean isEmpty() {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved.");
  }
}
