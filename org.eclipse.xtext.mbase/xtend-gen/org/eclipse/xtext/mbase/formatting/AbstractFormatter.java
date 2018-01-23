package org.eclipse.xtext.mbase.formatting;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.mbase.formatting.FormattableDocument;
import org.eclipse.xtext.mbase.formatting.FormattingPreferenceValues;
import org.eclipse.xtext.mbase.formatting.IBasicFormatter;
import org.eclipse.xtext.mbase.formatting.TextReplacement;

/**
 * @deprecated use {@link AbstractFormatter2}
 */
@Deprecated
@SuppressWarnings("all")
public abstract class AbstractFormatter implements IBasicFormatter {
  /* @Accessors
   */private boolean allowIdentityEdits = false;
  
  /* @Accessors
   */private boolean diagnoseConflicts = true;
  
  private boolean conflictOccurred = false;
  
  @Override
  public List<TextReplacement> format(final /* XtextResource */Object res, final int offset, final int length, final FormattingPreferenceValues cfg) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\nThe method filter(Object) is undefined for the type List<TextReplacement>"
      + "\nThe method or field text is undefined"
      + "\nThe field conflictOccurred is not visible"
      + "\nThe field rootTrace is not visible"
      + "\nThe field conflictOccurred is not visible"
      + "\nThe method format(EObject, FormattableDocument) from the type AbstractFormatter refers to the missing type EObject"
      + "\nThe method format(EObject, FormattableDocument) from the type AbstractFormatter refers to the missing type EObject"
      + "\nparseResult cannot be resolved"
      + "\nrootNode cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nhead cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\noffset cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntoList cannot be resolved");
  }
  
  public boolean isConflictOccurred() {
    return this.conflictOccurred;
  }
  
  protected void _format(final Void expr, final FormattableDocument format) {
  }
  
  protected void _format(final /* EObject */Object expr, final FormattableDocument format) {
  }
  
  protected void format(final EObject expr, final FormattableDocument format) {
    if (expr == null) {
      _format(null, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, format).toString());
    }
  }
}
