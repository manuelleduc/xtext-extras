package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.BasicFormatterPreferenceKeys;
import org.eclipse.xtext.mbase.formatting.BlankLineKey;
import org.eclipse.xtext.mbase.formatting.BooleanKey;
import org.eclipse.xtext.mbase.formatting.IntegerKey;
import org.eclipse.xtext.mbase.formatting.NewLineKey;
import org.eclipse.xtext.mbase.formatting.NewLineOrPreserveKey;
import org.eclipse.xtext.mbase.formatting.WhitespaceKey;

/**
 * @deprecated use {@link org.eclipse.xtext.mbase.formatting2.mbaseFormatterPreferenceKeys}
 */
@Deprecated
@SuppressWarnings("all")
public class MbaseFormatterPreferenceKeys extends BasicFormatterPreferenceKeys {
  public final static IntegerKey preserveBlankLines = new IntegerKey("preserve.blank.lines", Integer.valueOf(1));
  
  public final static BlankLineKey blankLinesAroundExpression = new BlankLineKey("blank.line.around.expressions", Integer.valueOf(0));
  
  public final static BooleanKey preserveNewLines = new BooleanKey("preserve.new.lines", true);
  
  public final static NewLineOrPreserveKey newLineAfterClassAnnotations = new NewLineOrPreserveKey("newline.after.class.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterFieldAnnotations = new NewLineOrPreserveKey("newline.after.field.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterMethodAnnotations = new NewLineOrPreserveKey("newline.after.method.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterConstructorAnnotations = new NewLineOrPreserveKey("newline.after.constructor.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterParameterAnnotations = new NewLineOrPreserveKey("newline.after.parameter.annotations", Boolean.valueOf(false));
  
  public final static WhitespaceKey whitespaceBetweenKeywordAndParenthesisSL = new WhitespaceKey("whitespace.between.keyword.and.parenthesis", Boolean.valueOf(false));
  
  public final static WhitespaceKey whitespaceBetweenKeywordAndParenthesisML = new WhitespaceKey("whitespace.between.keyword.and.parenthesis", Boolean.valueOf(true));
  
  public final static NewLineKey bracesInNewLine = new NewLineKey("braces.in.new.line", Boolean.valueOf(false));
}
