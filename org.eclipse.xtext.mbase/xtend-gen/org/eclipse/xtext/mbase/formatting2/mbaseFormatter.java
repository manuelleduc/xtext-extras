/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import java.util.Collection;
import java.util.List;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XAssignment;
import org.eclipse.xtext.mbase.XBasicForLoopExpression;
import org.eclipse.xtext.mbase.XBinaryOperation;
import org.eclipse.xtext.mbase.XBlockExpression;
import org.eclipse.xtext.mbase.XCastedExpression;
import org.eclipse.xtext.mbase.XClosure;
import org.eclipse.xtext.mbase.XCollectionLiteral;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XDoWhileExpression;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XFeatureCall;
import org.eclipse.xtext.mbase.XForLoopExpression;
import org.eclipse.xtext.mbase.XIfExpression;
import org.eclipse.xtext.mbase.XInstanceOfExpression;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.XPostfixOperation;
import org.eclipse.xtext.mbase.XReturnExpression;
import org.eclipse.xtext.mbase.XSwitchExpression;
import org.eclipse.xtext.mbase.XSynchronizedExpression;
import org.eclipse.xtext.mbase.XThrowExpression;
import org.eclipse.xtext.mbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.XVariableDeclaration;
import org.eclipse.xtext.mbase.XWhileExpression;
import org.eclipse.xtext.mbase.formatting2.XtypeFormatter;
import org.eclipse.xtext.mbase.services.mbaseGrammarAccess;

/**
 * @author Moritz Eysholdt - Initial implementation and API
 * @author Lorenzo Bettini - https://bugs.eclipse.org/bugs/show_bug.cgi?id=471239
 */
@SuppressWarnings("all")
public class mbaseFormatter extends XtypeFormatter {
  /* @Inject
  @Accessors(/* name is null */)
   */private mbaseGrammarAccess grammar;
  
  protected void _format(final XCollectionLiteral literal, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XCollectionLiteral"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XCollectionLiteral"
      + "\nThe method or field regionFor is undefined for the type XCollectionLiteral"
      + "\nThe method or field regionFor is undefined for the type XCollectionLiteral"
      + "\nThe method or field regionFor is undefined for the type XCollectionLiteral"
      + "\nThe method or field elements is undefined for the type XCollectionLiteral"
      + "\nThe method formatCommaSeparatedList(Collection<? extends EObject>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type EObject"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n?: cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n?: cannot be resolved"
      + "\nkeyword cannot be resolved");
  }
  
  protected void formatCommaSeparatedList(final /* Collection<? extends EObject> */Object elements, final /* ISemanticRegion */Object open, final /* ISemanticRegion */Object close, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nEObject cannot be resolved to a type."
      + "\nISemanticRegion cannot be resolved to a type."
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field last is undefined for the type Collection<? extends EObject>"
      + "\nThe method or field newLine is undefined"
      + "\nThe method interior(ISemanticRegion, ISemanticRegion, Object) is undefined"
      + "\nThe method or field indent is undefined"
      + "\nTextSegment cannot be resolved."
      + "\nThe method or field textRegionAccess is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method autowrap(Object) is undefined"
      + "\nThe method onAutowrap(IndentOnceAutowrapFormatter) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method autowrap(Object) is undefined"
      + "\nThe method onAutowrap(IndentOnceAutowrapFormatter) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nInvalid number of arguments. The constructor IndentOnceAutowrapFormatter() is not applicable for the arguments (Object)"
      + "\nInvalid number of arguments. The constructor SeparatorRegions<T, R>() is not applicable for the arguments (Object)"
      + "\nThe field separator is not visible"
      + "\nThe field object is not visible"
      + "\nThe field object is not visible"
      + "\nThe method getRegion() from the type ObjectEntry refers to the missing type Object"
      + "\nThe method getRegion() from the type ObjectEntry refers to the missing type Object"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nmultiline cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowing cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n- cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\nimmediatelyFollowing cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprependNewLineIfMultiline cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nlength cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nlength cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void _format(final /* JvmGenericArrayTypeReference */Object array, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method addReplacer(ArrayBracketsFormattingReplacer) is undefined"
      + "\nThe method or field arrayBracketsRule is undefined"
      + "\nInvalid number of arguments. The constructor ArrayBracketsFormattingReplacer() is not applicable for the arguments (Object)"
      + "\nregionFor cannot be resolved"
      + "\nruleCallTo cannot be resolved"
      + "\ncomponentType cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final /* JvmTypeConstraint */Object constraint, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field oneSpace is undefined"
      + "\ntypeReference cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XVariableDeclaration expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XVariableDeclaration"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XVariableDeclaration"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field type is undefined for the type XVariableDeclaration"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XVariableDeclaration"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field type is undefined for the type XVariableDeclaration"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XAssignment expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XAssignment"
      + "\nThe method or field opSingleAssignRule is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XAssignment"
      + "\nThe method or field noSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nruleCallTo cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nsurround cannot be resolved");
  }
  
  protected void formatFeatureCallParams(final List<XExpression> params, final /* ISemanticRegion */Object open, final /* ISemanticRegion */Object close, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field toList is undefined for the type Iterable<XExpression>"
      + "\nThe method formatCommaSeparatedList(Collection<? extends EObject>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type EObject"
      + "\nThe method formatBuilderWithLeadingGap(XClosure, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument");
  }
  
  protected void formatBuilderWithLeadingGap(final XClosure closure, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\nThe method or field previousHiddenRegion is undefined for the type XClosure"
      + "\nThe method or field nextHiddenRegion is undefined for the type XClosure"
      + "\nThe method formatConditionally(Object, Object, Object, Object) is undefined"
      + "\nThe method prepend(Object) is undefined for the type XClosure"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method prepend(Object) is undefined for the type XClosure"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XClosure)"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XClosure)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\noffset cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n- cannot be resolved"
      + "\nrequireFitsInLine cannot be resolved");
  }
  
  protected XClosure builder(final List<XExpression> params) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field last is undefined for the type List<XExpression>"
      + "\nThe method or field last is undefined for the type List<XExpression>"
      + "\nThe method or field XMemberFeatureCallAccess is undefined"
      + "\nThe method or field XFeatureCallAccess is undefined"
      + "\nThe method or field XConstructorCallAccess is undefined"
      + "\nThe method or field last is undefined for the type List<XExpression>"
      + "\n!== cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\n== cannot be resolved"
      + "\nmemberCallArgumentsXClosureParserRuleCall_1_1_4_0 cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n== cannot be resolved"
      + "\nfeatureCallArgumentsXClosureParserRuleCall_4_0 cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n== cannot be resolved"
      + "\nargumentsXClosureParserRuleCall_5_0 cannot be resolved");
  }
  
  protected Iterable<XExpression> explicitParams(final List<XExpression> params) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\nThe method take(Object) is undefined for the type List<XExpression>"
      + "\n- cannot be resolved.");
  }
  
  protected void _format(final XConstructorCall expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XConstructorCall"
      + "\nThe method or field XCONSTRUCTOR_CALL__CONSTRUCTOR is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field typeArguments is undefined for the type XConstructorCall"
      + "\nThe method or field regionFor is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field typeArguments is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XConstructorCall"
      + "\nThe method or field regionFor is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field arguments is undefined for the type XConstructorCall"
      + "\nThe method formatFeatureCallParams(List<XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nfeature cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowing cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void formatFeatureCallTypeParameters(final XAbstractFeatureCall expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field typeArguments is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field regionFor is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field typeArguments is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field noSpace is undefined"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowing cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nsurround cannot be resolved");
  }
  
  protected void _format(final XFeatureCall expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XFeatureCall"
      + "\nThe method or field explicitOperationCallLeftParenthesisKeyword_3_0_0 is undefined for the type mbaseGrammarAccess.XFeatureCallElements"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XFeatureCall"
      + "\nThe method or field rightParenthesisKeyword_3_2 is undefined for the type mbaseGrammarAccess.XFeatureCallElements"
      + "\nThe method or field featureCallArguments is undefined for the type XFeatureCall"
      + "\nThe method or field featureCallArguments is undefined for the type XFeatureCall"
      + "\nThe method formatFeatureCallTypeParameters(XAbstractFeatureCall, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nThe method formatFeatureCallParams(List<XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nkeyword cannot be resolved");
  }
  
  protected void _format(final XMemberFeatureCall expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nEObject cannot be resolved to a type."
      + "\nISemanticRegion cannot be resolved to a type."
      + "\nThe method or field regionForEObject is undefined for the type XMemberFeatureCall"
      + "\nThe method or field nullSafe is undefined"
      + "\nThe method or field explicitStatic is undefined"
      + "\nThe method or field nextHiddenRegion is undefined for the type XMemberFeatureCall"
      + "\nThe method or field regionFor is undefined for the type XMemberFeatureCall"
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method autowrap(int) is undefined"
      + "\nThe method onAutowrap(IndentOnceAutowrapFormatter) is undefined"
      + "\nThe method or field regionFor is undefined for the type XMemberFeatureCall"
      + "\nThe method or field explicitOperationCallLeftParenthesisKeyword_1_1_3_0_0 is undefined for the type mbaseGrammarAccess.XMemberFeatureCallElements"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XMemberFeatureCall"
      + "\nThe method or field rightParenthesisKeyword_1_1_3_2 is undefined for the type mbaseGrammarAccess.XMemberFeatureCallElements"
      + "\nThe method or field memberCallArguments is undefined for the type XMemberFeatureCall"
      + "\nThe method or field memberCallArguments is undefined for the type XMemberFeatureCall"
      + "\nThe method or field memberCallArguments is undefined for the type XMemberFeatureCall"
      + "\nInvalid number of arguments. The constructor SeparatorRegions<T, R>() is not applicable for the arguments (Object)"
      + "\nInvalid number of arguments. The constructor IndentOnceAutowrapFormatter() is not applicable for the arguments (Object)"
      + "\nThe field object is not visible"
      + "\nThe field separator is not visible"
      + "\nThe method formatFeatureCallTypeParameters(XAbstractFeatureCall, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nThe method getRegion() from the type ObjectEntry refers to the missing type Object"
      + "\nThe method formatFeatureCallParams(List<XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method formatBuilderWithLeadingGap(XClosure, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nregionFor cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nmemberCallTarget cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nlength cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n* cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nbuilder cannot be resolved");
  }
  
  protected /* AbstractRule */Object binaryOperationPrecedence(final /* EObject */Object op) {
    throw new Error("Unresolved compilation problems:"
      + "\nRuleCall cannot be resolved to a type."
      + "\nRuleCall cannot be resolved to a type."
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined"
      + "\nregionFor cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\nrule cannot be resolved");
  }
  
  protected void _format(final XBinaryOperation expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nISemanticRegion cannot be resolved to a type."
      + "\nEObject cannot be resolved to a type."
      + "\nThe method or field regionForEObject is undefined for the type XBinaryOperation"
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined"
      + "\nThe method or field nextHiddenRegion is undefined for the type XBinaryOperation"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method autowrap(Object) is undefined"
      + "\nThe method onAutowrap(IndentOnceAutowrapFormatter) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The constructor SeparatorRegions<T, R>() is not applicable for the arguments (Object)"
      + "\nInvalid number of arguments. The constructor IndentOnceAutowrapFormatter() is not applicable for the arguments (Object)"
      + "\nThe field separator is not visible"
      + "\nThe field object is not visible"
      + "\nThe field object is not visible"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method binaryOperationPrecedence(EObject) from the type mbaseFormatter refers to the missing type AbstractRule"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nThe method prependNewLineIfMultiline(EObject) from the type mbaseFormatter refers to the missing type EObject"
      + "\nThe method getRegion() from the type ObjectEntry refers to the missing type Object"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nbinaryOperationPrecedence cannot be resolved"
      + "\n== cannot be resolved"
      + "\nregionFor cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nlength cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected boolean prependNewLineIfMultiline(final /* EObject */Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nmemberCallArguments cannot be resolved"
      + "\nbuilder cannot be resolved"
      + "\nprependNewLineIfMultiline cannot be resolved");
  }
  
  protected void _format(final XSynchronizedExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eContainer is undefined for the type XSynchronizedExpression"
      + "\nThe method surround(Object) is undefined for the type XSynchronizedExpression"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field multiline is undefined for the type XExpression"
      + "\nThe method or field previousHiddenRegion is undefined for the type XExpression"
      + "\nThe method surround(Object) is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\n|| cannot be resolved."
      + "\nThe method or field regionFor is undefined for the type XSynchronizedExpression"
      + "\nThe method or field regionFor is undefined for the type XSynchronizedExpression"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nThe method formatBody(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\n|| cannot be resolved"
      + "\nmultiline cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XIfExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eContainer is undefined for the type XIfExpression"
      + "\nThe method surround(Object) is undefined for the type XIfExpression"
      + "\nThe method or field indent is undefined"
      + "\n|| cannot be resolved."
      + "\nThe method surround(Object) is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\n|| cannot be resolved."
      + "\nThe method or field regionFor is undefined for the type XIfExpression"
      + "\nThe method or field regionFor is undefined for the type XIfExpression"
      + "\n=== cannot be resolved."
      + "\n|| cannot be resolved."
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method isMultilineOrInNewLine(EObject) from the type mbaseFormatter refers to the missing type EObject"
      + "\nThe method isMultilineOrInNewLine(EObject) from the type mbaseFormatter refers to the missing type EObject"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nThe method formatBody(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nThe method formatBodyInline(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nThe method formatBody(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  protected void _format(final XForLoopExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XForLoopExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field declaredParam is undefined for the type XForLoopExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method formatBody(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XBasicForLoopExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XBasicForLoopExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XBasicForLoopExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XBasicForLoopExpression"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field lowPriority is undefined"
      + "\nThe method or field regionFor is undefined for the type XBasicForLoopExpression"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XBasicForLoopExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field initExpressions is undefined for the type XBasicForLoopExpression"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field updateExpressions is undefined for the type XBasicForLoopExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field updateExpressions is undefined for the type XBasicForLoopExpression"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nThe method formatBody(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeywords cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeywords cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XWhileExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XWhileExpression"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method formatBody(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XDoWhileExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XDoWhileExpression"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method formatBodyInline(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XBlockExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XBlockExpression"
      + "\nThe method or field regionFor is undefined for the type XBlockExpression"
      + "\nThe method or field eContainer is undefined for the type XBlockExpression"
      + "\nThe method surround(Object) is undefined for the type XBlockExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method formatConditionally(Object, Object) is undefined for the type XBlockExpression"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method formatExpressionsSingleline(Collection<? extends XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method formatExpressionsMultiline(Collection<? extends XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method formatExpressionsMultiline(Collection<? extends XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nkeyword cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nrequireFitsInLine cannot be resolved");
  }
  
  protected boolean isSingleLineBlock(final XBlockExpression expr) {
    return false;
  }
  
  protected void _format(final XTypeLiteral expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XTypeLiteral"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XTypeLiteral"
      + "\nThe method or field XTYPE_LITERAL__TYPE is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field regionFor is undefined for the type XTypeLiteral"
      + "\nThe method or field arrayBracketsRule is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method addReplacer(ArrayBracketsFormattingReplacer) is undefined"
      + "\nInvalid number of arguments. The constructor ArrayBracketsFormattingReplacer() is not applicable for the arguments (Object)"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nruleCallsTo cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XThrowExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object");
  }
  
  protected void _format(final XReturnExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object");
  }
  
  protected void _format(final XTryCatchFinallyExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eContainer is undefined for the type XTryCatchFinallyExpression"
      + "\nThe method surround(Object) is undefined for the type XTryCatchFinallyExpression"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field catchClauses is undefined for the type XTryCatchFinallyExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field catchClauses is undefined for the type XTryCatchFinallyExpression"
      + "\n!== cannot be resolved."
      + "\nThe method formatBodyInline(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nThe method formatBody(XExpression, boolean, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nregionFor cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ndeclaredParam cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\nformatBodyInline cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\nformatBody cannot be resolved");
  }
  
  protected void _format(final /* JvmFormalParameter */Object expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field oneSpace is undefined"
      + "\nparameterType cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eContents is undefined for the type XExpression"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XSwitchExpression expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field then is undefined"
      + "\nThe method or field multiline is undefined for the type XSwitchExpression"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\n!== cannot be resolved."
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field multiline is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field regionFor is undefined for the type XSwitchExpression"
      + "\nThe method or field regionFor is undefined for the type XSwitchExpression"
      + "\nThe method or field regionFor is undefined for the type XSwitchExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field regionFor is undefined for the type XSwitchExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method surround(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method interior(Object, Object, Object) is undefined"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field regionFor is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\n!== cannot be resolved."
      + "\nThe method interior(Object, Object, Object) is undefined"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field XCASE_PART__FALL_THROUGH is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field regionFor is undefined for the type XSwitchExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method isMultilineOrInNewLine(EObject) from the type mbaseFormatter refers to the missing type EObject"
      + "\nThe method formatBodyParagraph(XExpression, IFormattableDocument) from the type mbaseFormatter refers to the missing type IFormattableDocument"
      + "\nexists cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n! cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nexists cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n^case cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nthen cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n^case cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n^case cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nformatBodyParagraph cannot be resolved"
      + "\nregionFor cannot be resolved"
      + "\nfeature cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntypeGuard cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n^case cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntypeGuard cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n^case cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntypeGuard cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntypeGuard cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n^case cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n^case cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected /* ISemanticRegion */Object formatClosureParams(final XClosure expr, final /* ISemanticRegion */Object open, final /* IFormattableDocument */Object format, final /*  */Object init) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XClosure"
      + "\nThe method or field XCLOSURE__EXPLICIT_SYNTAX is undefined"
      + "\nThe method or field declaredFormalParameters is undefined for the type XClosure"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field declaredFormalParameters is undefined for the type XClosure"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field declaredFormalParameters is undefined for the type XClosure"
      + "\nfeature cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowing cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void _format(final XClosure expr, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XClosure"
      + "\nThe method or field immediatelyPreceding is undefined for the type XClosure"
      + "\nThe method or field regionFor is undefined for the type XClosure"
      + "\nThe method or field immediatelyFollowing is undefined for the type XClosure"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method newArrayList(XExpression) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method formatConditionally(Object, Object, Object, Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method formatClosureParams(XClosure, ISemanticRegion, IFormattableDocument, Object) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method formatExpressionsMultiline(Collection<? extends XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method formatClosureParams(XClosure, ISemanticRegion, IFormattableDocument, Object) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method formatClosureParams(XClosure, ISemanticRegion, IFormattableDocument, Object) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nThe method formatExpressionsMultiline(Collection<? extends XExpression>, ISemanticRegion, ISemanticRegion, IFormattableDocument) from the type mbaseFormatter refers to the missing type ISemanticRegion"
      + "\nkeyword cannot be resolved"
      + "\n?: cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n?: cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nnextHiddenRegion cannot be resolved"
      + "\ncontainsComment cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nmultiline cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nnextSemanticRegion cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n- cannot be resolved"
      + "\nrequireFitsInLine cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowing cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n== cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n== cannot be resolved"
      + "\nlast cannot be resolved");
  }
  
  protected void formatBody(final XExpression expr, final boolean forceMultiline, final /* IFormattableDocument */Object doc) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nThe method prepend(NewLineKey) is undefined for the type XBlockExpression"
      + "\n|| cannot be resolved."
      + "\nThe method or field previousHiddenRegion is undefined for the type XExpression"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field indent is undefined"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nisMultiline cannot be resolved"
      + "\nsurround cannot be resolved");
  }
  
  protected void formatBodyInline(final XExpression expr, final boolean forceMultiline, final /* IFormattableDocument */Object doc) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nThe method prepend(NewLineKey) is undefined for the type XBlockExpression"
      + "\n|| cannot be resolved."
      + "\nThe method or field previousHiddenRegion is undefined for the type XExpression"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method surround(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nisMultiline cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void formatBodyParagraph(final XExpression expr, final /* IFormattableDocument */Object doc) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nThe method prepend(NewLineKey) is undefined for the type XBlockExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method prepend(Object) is undefined for the type XExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XInstanceOfExpression expr, final /* IFormattableDocument */Object doc) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XInstanceOfExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field type is undefined for the type XInstanceOfExpression"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nkeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XCastedExpression expr, final /* IFormattableDocument */Object doc) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XCastedExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field type is undefined for the type XCastedExpression"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nkeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XPostfixOperation expr, final /* IFormattableDocument */Object doc) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field regionFor is undefined for the type XPostfixOperation"
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nfeature cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void formatExpressionsMultiline(final Collection<? extends XExpression> expressions, final /* ISemanticRegion */Object open, final /* ISemanticRegion */Object close, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method interior(ISemanticRegion, ISemanticRegion, Object) is undefined"
      + "\nThe method or field indent is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field immediatelyFollowing is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(BlankLineKey) is undefined for the type XExpression"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void formatExpressionsSingleline(final Collection<? extends XExpression> expressions, final /* ISemanticRegion */Object open, final /* ISemanticRegion */Object close, final /* IFormattableDocument */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field immediatelyFollowing is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method append(Object) is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nInvalid number of arguments. The method format(Object, Object) is not applicable for the arguments (XExpression)"
      + "\nThe method format(Object, Object) from the type mbaseFormatter refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nkeyword cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected boolean isMultilineOrInNewLine(final /* EObject */Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nmultiline cannot be resolved"
      + "\n|| cannot be resolved"
      + "\npreviousHiddenRegion cannot be resolved"
      + "\nmultiline cannot be resolved");
  }
  
  public Void format(final Object expr, final Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void"
      + "\nIncompatible return type of dispatch method. Expected Void but was void");
  }
}
