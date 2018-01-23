package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.FormattingData;

/**
 * @deprecated use {@link IHiddenRegionFormatter}
 */
@Deprecated/* 
@Data */
@SuppressWarnings("all")
public class WhitespaceData extends FormattingData {
  private String space;
  
  @Override
  public boolean isEmpty() {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved.");
  }
}
