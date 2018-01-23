package org.eclipse.xtext.mbase.formatting;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XAssignment;
import org.eclipse.xtext.mbase.XBasicForLoopExpression;
import org.eclipse.xtext.mbase.XBinaryOperation;
import org.eclipse.xtext.mbase.XBlockExpression;
import org.eclipse.xtext.mbase.XCatchClause;
import org.eclipse.xtext.mbase.XClosure;
import org.eclipse.xtext.mbase.XCollectionLiteral;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XDoWhileExpression;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XFeatureCall;
import org.eclipse.xtext.mbase.XForLoopExpression;
import org.eclipse.xtext.mbase.XIfExpression;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.XReturnExpression;
import org.eclipse.xtext.mbase.XSwitchExpression;
import org.eclipse.xtext.mbase.XSynchronizedExpression;
import org.eclipse.xtext.mbase.XThrowExpression;
import org.eclipse.xtext.mbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.XVariableDeclaration;
import org.eclipse.xtext.mbase.XWhileExpression;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.mbase.formatting.AbstractFormatter;
import org.eclipse.xtext.mbase.formatting.FormattableDocument;
import org.eclipse.xtext.mbase.formatting.FormattingDataFactory;
import org.eclipse.xtext.mbase.formatting.HiddenLeafAccess;
import org.eclipse.xtext.mbase.formatting.NodeModelAccess;
import org.eclipse.xtext.mbase.formatting2.mbaseFormatter;
import org.eclipse.xtext.mbase.services.mbaseGrammarAccess;
import org.eclipse.xtext.xtype.XFunctionTypeRef;

/**
 * @deprecated use {@link mbaseFormatter}
 */
@Deprecated
@SuppressWarnings("all")
public class mbaseFormatter2 extends AbstractFormatter {
  /* @Inject
   */private NodeModelAccess _nodeModelAccess;
  
  /* @Inject
   */private HiddenLeafAccess _hiddenLeafAccess;
  
  /* @Inject
   */private FormattingDataFactory _formattingDataFactory;
  
  /* @Inject
   */private mbaseGrammarAccess _mbaseGrammarAccess;
  
  protected void _format(final XCollectionLiteral literal, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XCollectionLiteral"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XCollectionLiteral"
      + "\nThe method nodeForKeyword(String) is undefined for the type XCollectionLiteral"
      + "\nThe method nodeForKeyword(String) is undefined for the type XCollectionLiteral"
      + "\nThe method nodeForKeyword(String) is undefined for the type XCollectionLiteral"
      + "\nThe method or field elements is undefined for the type XCollectionLiteral"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method formatCommaSeparatedList(Collection<? extends EObject>, INode, INode, FormattableDocument) from the type mbaseFormatter2 refers to the missing type EObject"
      + "\nappend cannot be resolved"
      + "\n?: cannot be resolved"
      + "\n?: cannot be resolved");
  }
  
  protected Object formatCommaSeparatedList(final /* Collection<? extends EObject> */Object elements, final /* INode */Object open, final /* INode */Object close, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nINode cannot be resolved to a type."
      + "\nINode cannot be resolved to a type."
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field head is undefined for the type Collection<? extends EObject>"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field last is undefined for the type Collection<? extends EObject>"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\n> cannot be resolved."
      + "\nThe method or field last is undefined for the type Collection<? extends EObject>"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method fitsIntoLine(FormattableDocument, EObject) from the type mbaseFormatter2 refers to the missing type EObject"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\nnewLines cannot be resolved"
      + "\n> cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n== cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XAnnotation ann, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XAnnotation"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XAnnotation"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method nodeForKeyword(String) is undefined for the type XAnnotation"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field elementValuePairs is undefined for the type XAnnotation"
      + "\nThe method or field elementValuePairs is undefined for the type XAnnotation"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XAnnotation"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nnodeForKeyword cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n=> cannot be resolved");
  }
  
  protected void _format(final /* JvmGenericArrayTypeReference */Object array, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nnodeForKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nnodeForKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\ncomponentType cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XFunctionTypeRef func, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XFunctionTypeRef"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field paramTypes is undefined for the type XFunctionTypeRef"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XFunctionTypeRef"
      + "\nThe method or field paramTypes is undefined for the type XFunctionTypeRef"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XFunctionTypeRef"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field returnType is undefined for the type XFunctionTypeRef"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final /* JvmTypeParameter */Object ref, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nconstraints cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final /* JvmParameterizedTypeReference */Object ref, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nnodeForKeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\narguments cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\narguments cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nnodeForKeyword cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void _format(final /* JvmWildcardTypeReference */Object ref, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nconstraints cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nnodeForKeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nconstraints cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final /* JvmTypeConstraint */Object constraint, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field JVM_TYPE_CONSTRAINT__TYPE_REFERENCE is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nnodeForFeature cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\ntypeReference cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XVariableDeclaration expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XVariableDeclaration"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XVariableDeclaration"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForFeature(Object) is undefined for the type XVariableDeclaration"
      + "\nThe method or field XVARIABLE_DECLARATION__TYPE is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XVariableDeclaration"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field type is undefined for the type XVariableDeclaration"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XAssignment expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XAssignment"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XAssignment"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nsurround cannot be resolved"
      + "\nsurround cannot be resolved");
  }
  
  protected void formatStaticQualifier(final /* INode */Object node, final FormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nICompositeNode cannot be resolved to a type."
      + "\nKeyword cannot be resolved to a type."
      + "\n&& cannot be resolved."
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nleafNodes cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\ntext cannot be resolved"
      + "\n== cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected boolean fitsIntoLine(final FormattableDocument fmt, final /* EObject */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nThe field cfg is not visible"
      + "\nThe method lookahead(FormattableDocument, EObject) from the type mbaseFormatter2 refers to the missing type EObject"
      + "\nnodeForEObject cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n<= cannot be resolved");
  }
  
  protected String lookahead(final FormattableDocument fmt, final /* EObject */Object expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nnodeForEObject cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntextRegion cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nlength cannot be resolved");
  }
  
  protected void formatFeatureCallParamsWrapIfNeeded(final /* INode */Object open, final List<XExpression> params, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nINode cannot be resolved to a type."
      + "\nThe method or field empty is undefined for the type Iterable<XExpression>"
      + "\nThe method or field noSpace is undefined"
      + "\n== cannot be resolved."
      + "\nThe method or field head is undefined for the type Iterable<XExpression>"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\n== cannot be resolved."
      + "\nThe method or field last is undefined for the type Iterable<XExpression>"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field last is undefined for the type Iterable<XExpression>"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field nodeForEObject is undefined for the type XClosure"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method fitsIntoLine(FormattableDocument, EObject) from the type mbaseFormatter2 refers to the missing type EObject"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method fitsIntoLine(FormattableDocument, EObject) from the type mbaseFormatter2 refers to the missing type EObject"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected XClosure builder(final List<XExpression> params) {
    throw new Error("Unresolved compilation problems:"
      + "\nICompositeNode cannot be resolved to a type."
      + "\nThe method or field last is undefined for the type List<XExpression>"
      + "\nThe method or field last is undefined for the type List<XExpression>"
      + "\nThe method or field XMemberFeatureCallAccess is undefined"
      + "\nThe method or field XFeatureCallAccess is undefined"
      + "\nThe method or field XConstructorCallAccess is undefined"
      + "\nThe method or field last is undefined for the type List<XExpression>"
      + "\n!== cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nfirstChild cannot be resolved"
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
  
  protected void formatFeatureCallParamsMultiline(final /* INode */Object open, final List<XExpression> params, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nINode cannot be resolved to a type."
      + "\nThe method or field empty is undefined for the type Iterable<XExpression>"
      + "\nThe method or field noSpace is undefined"
      + "\n== cannot be resolved."
      + "\nThe method or field head is undefined for the type Iterable<XExpression>"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n== cannot be resolved."
      + "\nThe method or field last is undefined for the type Iterable<XExpression>"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field nodeForEObject is undefined for the type XClosure"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  /**
   * checks whether the given lambda should be formatted as a block.
   * That includes newlines after and before the brackets, and a fresh line for each expression.
   */
  protected boolean isMultilineLambda(final XClosure closure) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XClosure"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\nnewLines cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\n&& cannot be resolved"
      + "\neachExpressionInOwnLine cannot be resolved");
  }
  
  protected boolean isEachExpressionInOwnLine(final Iterable<? extends XExpression> expressions) {
    throw new Error("Unresolved compilation problems:"
      + "\n- cannot be resolved."
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\n== cannot be resolved"
      + "\nstartLine cannot be resolved"
      + "\nendLine cannot be resolved");
  }
  
  protected void _format(final XConstructorCall expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForFeature(Object) is undefined for the type XConstructorCall"
      + "\nThe method or field XCONSTRUCTOR_CALL__CONSTRUCTOR is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field typeArguments is undefined for the type XConstructorCall"
      + "\nThe method nodeForKeyword(String) is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field typeArguments is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XConstructorCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field arguments is undefined for the type XConstructorCall"
      + "\nThe method or field arguments is undefined for the type XConstructorCall"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method formatFeatureCallParamsMultiline(INode, List<XExpression>, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nThe method formatFeatureCallParamsWrapIfNeeded(INode, List<XExpression>, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nprepend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void formatFeatureCallTypeParameters(final XAbstractFeatureCall expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field typeArguments is undefined for the type XAbstractFeatureCall"
      + "\nThe method nodeForKeyword(String) is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field typeArguments is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nsurround cannot be resolved");
  }
  
  protected void _format(final XFeatureCall expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XFeatureCall"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field featureCallArguments is undefined for the type XFeatureCall"
      + "\nThe method or field featureCallArguments is undefined for the type XFeatureCall"
      + "\nThe method or field featureCallArguments is undefined for the type XFeatureCall"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method formatFeatureCallParamsMultiline(INode, List<XExpression>, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nThe method formatFeatureCallParamsWrapIfNeeded(INode, List<XExpression>, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nprepend cannot be resolved");
  }
  
  protected boolean _isMultiParamInOwnLine(final XMemberFeatureCall fc, final FormattableDocument doc) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XMemberFeatureCall"
      + "\nThe method or field memberCallArguments is undefined for the type XMemberFeatureCall"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\nnewLines cannot be resolved"
      + "\n> cannot be resolved"
      + "\nexplicitParams cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\n&& cannot be resolved"
      + "\neachExpressionInOwnLine cannot be resolved");
  }
  
  protected boolean _isMultiParamInOwnLine(final XFeatureCall fc, final FormattableDocument doc) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XFeatureCall"
      + "\nThe method or field featureCallArguments is undefined for the type XFeatureCall"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\nnewLines cannot be resolved"
      + "\n> cannot be resolved"
      + "\nexplicitParams cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\n&& cannot be resolved"
      + "\neachExpressionInOwnLine cannot be resolved");
  }
  
  protected boolean _isMultiParamInOwnLine(final XConstructorCall fc, final FormattableDocument doc) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XConstructorCall"
      + "\nThe method or field arguments is undefined for the type XConstructorCall"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\nnewLines cannot be resolved"
      + "\n> cannot be resolved"
      + "\nexplicitParams cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\n&& cannot be resolved"
      + "\neachExpressionInOwnLine cannot be resolved");
  }
  
  protected void _format(final XMemberFeatureCall expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nEObject cannot be resolved to a type."
      + "\nThe method newArrayList() is undefined"
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined"
      + "\nThe method or field nullSafe is undefined"
      + "\nThe method or field explicitStatic is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\n+ cannot be resolved."
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n+ cannot be resolved."
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\n+ cannot be resolved."
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe field cfg is not visible"
      + "\nThe field cfg is not visible"
      + "\nThe field cfg is not visible"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method formatFeatureCallParamsMultiline(INode, List<XExpression>, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nThe method fitsIntoLine(int, int, Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method formatFeatureCallParamsWrapIfNeeded(INode, List<XExpression>, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method formatFeatureCallParamsWrapIfNeeded(INode, List<XExpression>, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\n+= cannot be resolved"
      + "\nmemberCallTarget cannot be resolved"
      + "\nreverse cannot be resolved"
      + "\nnodeForFeature cannot be resolved"
      + "\nmemberCallTarget cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\nnodeForKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nexplicitOperationCall cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\n- cannot be resolved"
      + "\nnodeForKeyword cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nisMultiParamInOwnLine cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n< cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmemberCallArguments cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n* cannot be resolved"
      + "\n< cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmemberCallArguments cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmemberCallArguments cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n< cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmemberCallArguments cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nmemberCallArguments cannot be resolved"
      + "\nbuilder cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nmultilineLambda cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected /* AbstractRule */Object binaryOperationPrecedence(final /* EObject */Object op) {
    throw new Error("Unresolved compilation problems:"
      + "\nCrossReference cannot be resolved to a type."
      + "\nCrossReference cannot be resolved to a type."
      + "\nRuleCall cannot be resolved to a type."
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined"
      + "\nnodeForFeature cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\nterminal cannot be resolved"
      + "\nrule cannot be resolved");
  }
  
  protected boolean isMultiline(final XExpression expression, final FormattableDocument doc) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntextRegionWithLineInformation cannot be resolved"
      + "\nlineNumber cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nendLineNumber cannot be resolved");
  }
  
  protected void _format(final XBinaryOperation expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nEObject cannot be resolved to a type."
      + "\nThe method newArrayList() is undefined"
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method binaryOperationPrecedence(EObject) from the type mbaseFormatter2 refers to the missing type AbstractRule"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method fitsIntoLine(FormattableDocument, EObject) from the type mbaseFormatter2 refers to the missing type EObject"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nbinaryOperationPrecedence cannot be resolved"
      + "\n== cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nreverse cannot be resolved"
      + "\nnodeForFeature cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nrightOperand cannot be resolved"
      + "\nisMultiline cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nrightOperand cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nrightOperand cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XSynchronizedExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eContainer is undefined for the type XSynchronizedExpression"
      + "\nThe method nodeForKeyword(String) is undefined for the type XSynchronizedExpression"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XSynchronizedExpression"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method nodeForFeature(Object) is undefined for the type XSynchronizedExpression"
      + "\nThe method or field XSYNCHRONIZED_EXPRESSION__PARAM is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\n|| cannot be resolved."
      + "\nThe method nodeForKeyword(String) is undefined for the type XSynchronizedExpression"
      + "\nThe method cfg(WhitespaceKey) is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XSynchronizedExpression"
      + "\nThe method cfg(WhitespaceKey) is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ntrim cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\nnewLines cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XIfExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eContainer is undefined for the type XIfExpression"
      + "\nThe method nodeForKeyword(String) is undefined for the type XIfExpression"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XIfExpression"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method nodeForFeature(Object) is undefined for the type XIfExpression"
      + "\nThe method or field XIF_EXPRESSION__IF is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\n|| cannot be resolved."
      + "\nThe method nodeForKeyword(String) is undefined for the type XIfExpression"
      + "\nThe method cfg(WhitespaceKey) is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XIfExpression"
      + "\nThe method cfg(WhitespaceKey) is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\n|| cannot be resolved."
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ntrim cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nhiddenLeafsBefore cannot be resolved"
      + "\nnewLines cannot be resolved"
      + "\n> cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ntrim cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XForLoopExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XForLoopExpression"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field declaredParam is undefined for the type XForLoopExpression"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\n=> cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XBasicForLoopExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nINode cannot be resolved to a type."
      + "\nThe method nodeForKeyword(String) is undefined for the type XBasicForLoopExpression"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field initExpressions is undefined for the type XBasicForLoopExpression"
      + "\nThe method or field initExpressions is undefined for the type XBasicForLoopExpression"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field updateExpressions is undefined for the type XBasicForLoopExpression"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\n=> cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\n== cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XWhileExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XWhileExpression"
      + "\nThe method cfg(WhitespaceKey) is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XDoWhileExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XDoWhileExpression"
      + "\nThe method cfg(WhitespaceKey) is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XBlockExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XBlockExpression"
      + "\nThe method or field eContainer is undefined for the type XBlockExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XBlockExpression"
      + "\n! cannot be resolved."
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method cfg(BlankLineKey) is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method cfg(BlankLineKey) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method cfg(BlankLineKey) is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\n=== cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nhiddenLeafsAfter cannot be resolved"
      + "\ncontainsComment cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected boolean isSingleLineBlock(final XBlockExpression expr, final FormattableDocument format) {
    return false;
  }
  
  protected void _format(final XTypeLiteral expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForFeature(Object) is undefined for the type XTypeLiteral"
      + "\nThe method or field XTYPE_LITERAL__TYPE is undefined"
      + "\nThe method nodeForKeyword(String) is undefined for the type XTypeLiteral"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XThrowExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nprepend cannot be resolved");
  }
  
  protected void _format(final XReturnExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nprepend cannot be resolved");
  }
  
  protected void _format(final XTryCatchFinallyExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field catchClauses is undefined for the type XTryCatchFinallyExpression"
      + "\nThe method or field catchClauses is undefined for the type XTryCatchFinallyExpression"
      + "\n!== cannot be resolved."
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void _format(final XCatchClause expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XCatchClause"
      + "\nThe method cfg(WhitespaceKey) is undefined"
      + "\nThe method or field declaredParam is undefined for the type XCatchClause"
      + "\nThe method prepend(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method append(Object) is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field declaredParam is undefined for the type XCatchClause"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final /* JvmFormalParameter */Object expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nparameterType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eContents is undefined for the type XExpression"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XSwitchExpression expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field then is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XSwitchExpression"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\n!== cannot be resolved."
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field nodeForEObject is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method nodeForKeyword(String) is undefined for the type XSwitchExpression"
      + "\nThe method nodeForKeyword(String) is undefined for the type XSwitchExpression"
      + "\nThe method nodeForKeyword(String) is undefined for the type XSwitchExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method nodeForKeyword(String) is undefined for the type XSwitchExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method nodeForKeyword(String) is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\n!== cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field XCASE_PART__FALL_THROUGH is undefined"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method decreaseIndentationChange(Object) is undefined"
      + "\n- cannot be resolved."
      + "\n!== cannot be resolved."
      + "\nThe method nodeForKeyword(String) is undefined for the type XSwitchExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method cfg(NewLineKey) is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method decreaseIndentationChange(Object) is undefined"
      + "\n- cannot be resolved."
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field XCASE_PART__TYPE_GUARD is undefined"
      + "\nThe method or field XCASE_PART__CASE is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field XCASE_PART__TYPE_GUARD is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field XCASE_PART__CASE is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nexists cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ntrim cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n! cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nexists cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ntrim cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntext cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n! cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nthen cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\n?: cannot be resolved"
      + "\nnodeForFeature cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nisFallThrough cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\nsurround cannot be resolved"
      + "\ntypeGuard cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n^case cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nnodeForFeature cannot be resolved"
      + "\nnodeForFeature cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntypeGuard cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nnodeForFeature cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n^case cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nnodeForFeature cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n^case cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nthen cannot be resolved"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final XClosure expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForKeyword(String) is undefined for the type XClosure"
      + "\nThe method nodeForKeyword(String) is undefined for the type XClosure"
      + "\nThe method or field expressions is undefined for the type XBlockExpression"
      + "\nThe method newArrayList(XExpression) is undefined"
      + "\nThe method or field declaredFormalParameters is undefined for the type XClosure"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method formatClosureMultiLine(XClosure, INode, Collection<XExpression>, INode, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nThe method formatClosureWrapIfNeeded(XClosure, INode, Collection<XExpression>, INode, FormattableDocument) from the type mbaseFormatter2 refers to the missing type INode"
      + "\nempty cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nhiddenLeafsAfter cannot be resolved"
      + "\ncontainsComment cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected void formatClosureMultiLine(final XClosure expr, final /* INode */Object open, final Collection<XExpression> children, final /* INode */Object close, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method nodeForFeature(Object) is undefined for the type XClosure"
      + "\nThe method or field XCLOSURE__EXPLICIT_SYNTAX is undefined"
      + "\nThe method or field declaredFormalParameters is undefined for the type XClosure"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\n!= cannot be resolved."
      + "\nThe method or field last is undefined for the type Collection<XExpression>"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\n!== cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\n?: cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void formatClosureParameters(final XClosure expr, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field declaredFormalParameters is undefined for the type XClosure"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nformat cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\nsurround cannot be resolved");
  }
  
  protected void formatClosureWrapIfNeeded(final XClosure expr, final /* INode */Object open, final Collection<XExpression> children, final /* INode */Object close, final FormattableDocument format) {
    throw new Error("Unresolved compilation problems:"
      + "\nINode cannot be resolved to a type."
      + "\nThe method or field noSpace is undefined"
      + "\nThe method nodeForFeature(Object) is undefined for the type XClosure"
      + "\nThe method or field XCLOSURE__EXPLICIT_SYNTAX is undefined"
      + "\nThe method or field declaredFormalParameters is undefined for the type XClosure"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field head is undefined for the type Collection<XExpression>"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field oneSpace is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field increaseIndentation is undefined"
      + "\nThe method or field newLine is undefined"
      + "\nThe method or field nodeForEObject is undefined for the type XExpression"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method or field last is undefined for the type Collection<XExpression>"
      + "\nThe method or field decreaseIndentation is undefined"
      + "\nThe method or field noSpace is undefined"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method fitsIntoLine(FormattableDocument, EObject) from the type mbaseFormatter2 refers to the missing type EObject"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method format(Object, FormattableDocument) from the type mbaseFormatter2 refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\nappend cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nimmediatelyFollowingKeyword cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nprepend cannot be resolved"
      + "\nnodeForEObject cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nprepend cannot be resolved");
  }
  
  protected void format(final Object expr, final FormattableDocument format) {
    if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr == null) {
      _format(null, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else if (expr != null) {
      _format(expr, format);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, format).toString());
    }
  }
  
  protected boolean isMultiParamInOwnLine(final XExpression fc, final FormattableDocument doc) {
    if (fc instanceof XFeatureCall) {
      return _isMultiParamInOwnLine((XFeatureCall)fc, doc);
    } else if (fc instanceof XMemberFeatureCall) {
      return _isMultiParamInOwnLine((XMemberFeatureCall)fc, doc);
    } else if (fc instanceof XConstructorCall) {
      return _isMultiParamInOwnLine((XConstructorCall)fc, doc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fc, doc).toString());
    }
  }
}
