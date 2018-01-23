/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import org.eclipse.xtext.mbase.formatting2.BlankLineKey;
import org.eclipse.xtext.mbase.formatting2.NewLineKey;
import org.eclipse.xtext.mbase.formatting2.NewLineOrPreserveKey;
import org.eclipse.xtext.mbase.formatting2.WhitespaceKey;

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
@SuppressWarnings("all")
public class mbaseFormatterPreferenceKeys /* implements FormatterPreferenceKeys  */{
  public final static Object preserveBlankLines /* Skipped initializer because of errors */;
  
  public final static BlankLineKey blankLinesAroundExpression = new BlankLineKey("blank.line.around.expressions", Integer.valueOf(0));
  
  public final static Object preserveNewLines /* Skipped initializer because of errors */;
  
  public final static NewLineOrPreserveKey newLineAfterClassAnnotations = new NewLineOrPreserveKey("newline.after.class.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterFieldAnnotations = new NewLineOrPreserveKey("newline.after.field.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterMethodAnnotations = new NewLineOrPreserveKey("newline.after.method.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterConstructorAnnotations = new NewLineOrPreserveKey("newline.after.constructor.annotations", Boolean.valueOf(false));
  
  public final static NewLineOrPreserveKey newLineAfterParameterAnnotations = new NewLineOrPreserveKey("newline.after.parameter.annotations", Boolean.valueOf(false));
  
  public final static WhitespaceKey whitespaceBetweenKeywordAndParenthesisSL = new WhitespaceKey("whitespace.between.keyword.and.parenthesis", Boolean.valueOf(false));
  
  public final static WhitespaceKey whitespaceBetweenKeywordAndParenthesisML = new WhitespaceKey("whitespace.between.keyword.and.parenthesis", Boolean.valueOf(true));
  
  public final static BlankLineKey blankLinesBetweenImports = new BlankLineKey("blank.lines.between.imports", Integer.valueOf(0));
  
  public final static BlankLineKey blankLinesAfterImports = new BlankLineKey("blank.lines.after.imports", Integer.valueOf(1));
  
  public final static NewLineKey bracesInNewLine = new NewLineKey("braces.in.new.line", Boolean.valueOf(false));
}
