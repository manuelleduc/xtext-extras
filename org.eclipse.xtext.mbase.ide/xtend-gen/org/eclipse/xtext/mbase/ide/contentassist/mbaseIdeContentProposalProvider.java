/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.contentassist;

import java.util.Arrays;
import org.eclipse.xtext.mbase.ide.contentassist.IIdeTypesProposalProvider;
import org.eclipse.xtext.mbase.ide.types.ITypeDescriptor;

@SuppressWarnings("all")
public class mbaseIdeContentProposalProvider /* implements IdeContentProposalProvider  */{
  public static class ValidFeatureDescription /* implements Predicate<IEObjectDescription>  */{
    /* @Inject
     */private /* OperatorMapping */Object operatorMapping;
    
    @Override
    public boolean apply(final /* IEObjectDescription */Object input) {
      throw new Error("Unresolved compilation problems:"
        + "\nIIdentifiableElementDescription cannot be resolved to a type."
        + "\nThe field mbaseIdeContentProposalProvider.ValidFeatureDescription.operatorMapping refers to the missing type OperatorMapping"
        + "\nisVisible cannot be resolved"
        + "\n! cannot be resolved"
        + "\n|| cannot be resolved"
        + "\nisValidStaticState cannot be resolved"
        + "\n! cannot be resolved"
        + "\nname cannot be resolved"
        + "\nfirstSegment cannot be resolved"
        + "\nstartsWith cannot be resolved"
        + "\ngetOperator cannot be resolved"
        + "\nname cannot be resolved"
        + "\n=== cannot be resolved");
    }
  }
  
  /* @Inject
   */private /* mbaseGrammarAccess */Object _mbaseGrammarAccess;
  
  /* @Inject
   */private mbaseIdeContentProposalProvider.ValidFeatureDescription featureDescriptionPredicate;
  
  /* @Inject
   */private /* IBatchTypeResolver */Object typeResolver;
  
  /* @Inject
   */private IIdeTypesProposalProvider typesProposalProvider;
  
  /* @Inject
   */private /* SyntaxFilteredScopes */Object syntaxFilteredScopes;
  
  @Override
  public boolean filterKeyword(final /* Keyword */Object keyword, final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nXExpression cannot be resolved to a type."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe field mbaseIdeContentProposalProvider.typeResolver refers to the missing type IBatchTypeResolver"
      + "\nvalue cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n> cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ncharAt cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n== cannot be resolved"
      + "\npreviousModel cannot be resolved"
      + "\nprefix cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngetNode cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\n> cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nresolveTypes cannot be resolved"
      + "\ngetActualType cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nisPrimitiveVoid cannot be resolved");
  }
  
  @Override
  protected Object _createProposals(final /* RuleCall */Object ruleCall, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nGroup cannot be resolved to a type."
      + "\nThe method or field getXExpressionRule is undefined"
      + "\n&& cannot be resolved."
      + "\nThe method or field GrammarUtil is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field super is undefined"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nrule cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\ncontainingRule cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncurrentModel cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nWITHIN cannot be resolved"
      + "\n_createProposals cannot be resolved");
  }
  
  @Override
  protected Object _createProposals(final /* Assignment */Object assignment, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getXFeatureCallAccess is undefined"
      + "\nThe method or field getXMemberFeatureCallAccess is undefined"
      + "\nThe method or field getXMemberFeatureCallAccess is undefined"
      + "\nThe method or field getXBlockExpressionAccess is undefined"
      + "\nThe method or field getXExpressionInClosureAccess is undefined"
      + "\nThe method or field getXAssignmentAccess is undefined"
      + "\nThe method or field getXAssignmentAccess is undefined"
      + "\nThe method or field jvmParameterizedTypeReferenceAccess is undefined"
      + "\nThe method or field jvmParameterizedTypeReferenceAccess is undefined"
      + "\nThe method or field TypesPackage is undefined"
      + "\nThe method or field getXRelationalExpressionAccess is undefined"
      + "\nThe method or field TypesPackage is undefined"
      + "\nThe method or field getXImportDeclarationAccess is undefined"
      + "\nThe method or field getXImportDeclarationAccess is undefined"
      + "\nThe method or field XtypePackage is undefined"
      + "\nThe method or field getXTypeLiteralAccess is undefined"
      + "\nThe method or field mbasePackage is undefined"
      + "\nThe method or field getXConstructorCallAccess is undefined"
      + "\nThe method or field TypesPackage is undefined"
      + "\nThe method or field getXForLoopExpressionAccess is undefined"
      + "\nThe method or field getXSwitchExpressionAccess is undefined"
      + "\nThe method or field getXCasePartAccess is undefined"
      + "\nThe method or field getXCatchClauseAccess is undefined"
      + "\nThe method or field getXBasicForLoopExpressionAccess is undefined"
      + "\nThe method or field getXBasicForLoopExpressionAccess is undefined"
      + "\nThe method or field getXBasicForLoopExpressionAccess is undefined"
      + "\nThe method or field getXBasicForLoopExpressionAccess is undefined"
      + "\nThe method or field getXClosureAccess is undefined"
      + "\nThe method or field getXShortClosureAccess is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field getXForLoopExpressionAccess is undefined"
      + "\nThe method or field getXVariableDeclarationAccess is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field getXCasePartAccess is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field getXOrExpressionAccess is undefined"
      + "\nThe method or field getXAndExpressionAccess is undefined"
      + "\nThe method or field getXEqualityExpressionAccess is undefined"
      + "\nThe method or field getXRelationalExpressionAccess is undefined"
      + "\nThe method or field getXOtherOperatorExpressionAccess is undefined"
      + "\nThe method or field getXAdditiveExpressionAccess is undefined"
      + "\nThe method or field getXMultiplicativeExpressionAccess is undefined"
      + "\nThe method or field getXPostfixOperationAccess is undefined"
      + "\nThe method or field getXBasicForLoopExpressionAccess is undefined"
      + "\nThe method or field getXBasicForLoopExpressionAccess is undefined"
      + "\nThe method or field getXUnaryOperationAccess is undefined"
      + "\nThe method or field super is undefined"
      + "\nThe method completeXFeatureCall(EObject, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method completeXMemberFeatureCall(EObject, Assignment, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method completeWithinBlock(EObject, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method completeXAssignment(EObject, Assignment, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method completeJavaTypes(EReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EReference"
      + "\nThe method completeJavaTypes(EReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EReference"
      + "\nThe method completeJavaTypes(EReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EReference"
      + "\nThe method completeJavaTypes(EReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EReference"
      + "\nThe method completeJavaTypes(EReference, ContentAssistContext, Predicate, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EReference"
      + "\nThe field TypeFilters.NON_ABSTRACT refers to the missing type Predicate"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method completeBinaryOperation(EObject, Assignment, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method completeXBasicForLoopInit(EObject, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\ncurrentModel cannot be resolved"
      + "\nfeatureAssignment_2 cannot be resolved"
      + "\nfeatureAssignment_1_0_0_0_2 cannot be resolved"
      + "\nfeatureAssignment_1_1_2 cannot be resolved"
      + "\nexpressionsAssignment_2_0 cannot be resolved"
      + "\nexpressionsAssignment_1_0 cannot be resolved"
      + "\nfeatureAssignment_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_1_0_0_1 cannot be resolved"
      + "\ntypeAssignment_0 cannot be resolved"
      + "\ntypeAssignment_1_4_1 cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_PARAMETERIZED_TYPE_REFERENCE__TYPE cannot be resolved"
      + "\ntypeAssignment_1_0_1 cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_PARAMETERIZED_TYPE_REFERENCE__TYPE cannot be resolved"
      + "\nimportedTypeAssignment_1_0_2 cannot be resolved"
      + "\nimportedTypeAssignment_1_1 cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nXIMPORT_DECLARATION__IMPORTED_TYPE cannot be resolved"
      + "\ntypeAssignment_3 cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nXTYPE_LITERAL__TYPE cannot be resolved"
      + "\nconstructorAssignment_2 cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_PARAMETERIZED_TYPE_REFERENCE__TYPE cannot be resolved"
      + "\neachExpressionAssignment_3 cannot be resolved"
      + "\ndefaultAssignment_5_2 cannot be resolved"
      + "\ncaseAssignment_2_1 cannot be resolved"
      + "\nexpressionAssignment_4 cannot be resolved"
      + "\nupdateExpressionsAssignment_7_0 cannot be resolved"
      + "\nupdateExpressionsAssignment_7_1_1 cannot be resolved"
      + "\nexpressionAssignment_5 cannot be resolved"
      + "\neachExpressionAssignment_9 cannot be resolved"
      + "\nexpressionAssignment_2 cannot be resolved"
      + "\nexpressionAssignment_1 cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nWITHIN cannot be resolved"
      + "\nforExpressionAssignment_1 cannot be resolved"
      + "\nrightAssignment_3_1 cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nBEFORE cannot be resolved"
      + "\nthenAssignment_3_0_1 cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nAFTER cannot be resolved"
      + "\nfeatureAssignment_1_0_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_0_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_0_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_1_0_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_0_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_0_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_0_0_1 cannot be resolved"
      + "\nfeatureAssignment_1_0_1 cannot be resolved"
      + "\ninitExpressionsAssignment_3_0 cannot be resolved"
      + "\ninitExpressionsAssignment_3_1_1 cannot be resolved"
      + "\nfeatureAssignment_0_1 cannot be resolved"
      + "\n_createProposals cannot be resolved");
  }
  
  protected void completeJavaTypes(final /* EReference */Object reference, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Predicates is undefined"
      + "\nThe method completeJavaTypes(EReference, ContentAssistContext, Predicate, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EReference"
      + "\nalwaysTrue cannot be resolved");
  }
  
  protected void completeJavaTypes(final /* EReference */Object reference, final /* ContentAssistContext */Object context, final /* Predicate<ITypeDescriptor> */Object filter, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createTypeProposals(EReference, ContentAssistContext, Predicate, IIdeContentProposalAcceptor) from the type IIdeTypesProposalProvider refers to the missing type EReference");
  }
  
  protected void completeXFeatureCall(final /* EObject */Object model, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nXMemberFeatureCall cannot be resolved to a type."
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe field mbaseIdeContentProposalProvider.typeResolver refers to the missing type IBatchTypeResolver"
      + "\nThe method isInMemberFeatureCall(EObject, int, ContentAssistContext) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\n!== cannot be resolved"
      + "\nresolveTypes cannot be resolved"
      + "\nhasExpressionScope cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nWITHIN cannot be resolved"
      + "\ngetNode cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nAFTER cannot be resolved");
  }
  
  protected void completeWithinBlock(final /* EObject */Object model, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nXBlockExpression cannot be resolved to a type."
      + "\nXFeatureCall cannot be resolved to a type."
      + "\nXClosure cannot be resolved to a type."
      + "\nXClosure cannot be resolved to a type."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\n<= cannot be resolved."
      + "\n&& cannot be resolved."
      + "\n== cannot be resolved."
      + "\nThe method or field IExpressionScope is undefined"
      + "\n|| cannot be resolved."
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method isInMemberFeatureCall(EObject, int, ContentAssistContext) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method isInMemberFeatureCall(EObject, int, ContentAssistContext) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\ngetNode cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n>= cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nBEFORE cannot be resolved"
      + "\nexpressions cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n- cannot be resolved"
      + "\n>= cannot be resolved"
      + "\nget cannot be resolved"
      + "\ngetNode cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\n<= cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nAFTER cannot be resolved"
      + "\n-- cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\noffset cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\n|| cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nprefix cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n== cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nAFTER cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nBEFORE cannot be resolved");
  }
  
  protected boolean isInMemberFeatureCall(final /* EObject */Object model, final int endOffset, final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nXMemberFeatureCall cannot be resolved to a type."
      + "\n&& cannot be resolved."
      + "\n>= cannot be resolved."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field mbasePackage is undefined"
      + "\noffset cannot be resolved"
      + "\nfindNodesForFeature cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nXABSTRACT_FEATURE_CALL__FEATURE cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nhead cannot be resolved"
      + "\ntotalOffset cannot be resolved"
      + "\n< cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntotalEndOffset cannot be resolved"
      + "\n>= cannot be resolved"
      + "\noffset cannot be resolved");
  }
  
  protected void completeXAssignment(final /* EObject */Object model, final /* Assignment */Object assignment, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getConcreteSyntaxRuleName(Assignment) from the type mbaseIdeContentProposalProvider refers to the missing type Assignment"
      + "\nThe method completeBinaryOperation(EObject, Assignment, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject");
  }
  
  protected boolean isOperatorRule(final String ruleName) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\n&& cannot be resolved");
  }
  
  protected void completeBinaryOperation(final /* EObject */Object model, final /* Assignment */Object assignment, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nXBinaryOperation cannot be resolved to a type."
      + "\nCrossReference cannot be resolved to a type."
      + "\nXExpression cannot be resolved to a type."
      + "\nCrossReference cannot be resolved to a type."
      + "\nCrossReference cannot be resolved to a type."
      + "\nXExpression cannot be resolved to a type."
      + "\nCrossReference cannot be resolved to a type."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method createReceiverProposals(XExpression, CrossReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type XExpression"
      + "\nThe method createReceiverProposals(XExpression, CrossReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type XExpression"
      + "\nThe method createReceiverProposals(XExpression, CrossReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type XExpression"
      + "\nprefix cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ncurrentNode cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\n< cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n>= cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\nfindActualNodeFor cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\n<= cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nterminal cannot be resolved"
      + "\nleftOperand cannot be resolved"
      + "\nterminal cannot be resolved"
      + "\npreviousModel cannot be resolved"
      + "\nprefix cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngetNode cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\n> cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nterminal cannot be resolved");
  }
  
  protected void completeXBasicForLoopInit(final /* EObject */Object model, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nXBasicForLoopExpression cannot be resolved to a type."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method or field IExpressionScope is undefined"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\nThe method createLocalVariableAndImplicitProposals(EObject, Anchor, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type EObject"
      + "\ngetNode cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n>= cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nBEFORE cannot be resolved"
      + "\ninitExpressions cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n- cannot be resolved"
      + "\n>= cannot be resolved"
      + "\nget cannot be resolved"
      + "\ngetNode cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\n<= cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nAFTER cannot be resolved"
      + "\n-- cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nBEFORE cannot be resolved");
  }
  
  protected void completeXMemberFeatureCall(final /* EObject */Object model, final /* Assignment */Object assignment, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nXMemberFeatureCall cannot be resolved to a type."
      + "\nCrossReference cannot be resolved to a type."
      + "\nXAssignment cannot be resolved to a type."
      + "\nCrossReference cannot be resolved to a type."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nThe method createReceiverProposals(XExpression, CrossReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type XExpression"
      + "\nThe method createReceiverProposals(XExpression, CrossReference, ContentAssistContext, IIdeContentProposalAcceptor) from the type mbaseIdeContentProposalProvider refers to the missing type XExpression"
      + "\nmemberCallTarget cannot be resolved"
      + "\nterminal cannot be resolved"
      + "\nassignable cannot be resolved"
      + "\nterminal cannot be resolved");
  }
  
  protected void createLocalVariableAndImplicitProposals(final /* EObject */Object model, final /* IExpressionScope.Anchor */Object anchor, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\n> cannot be resolved."
      + "\n! cannot be resolved."
      + "\nThe method or field crossrefProposalProvider is undefined"
      + "\nThe method or field getXFeatureCallAccess is undefined"
      + "\nThe field mbaseIdeContentProposalProvider.typeResolver refers to the missing type IBatchTypeResolver"
      + "\nThe field mbaseIdeContentProposalProvider.typeResolver refers to the missing type IBatchTypeResolver"
      + "\nprefix cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nresolveTypes cannot be resolved"
      + "\nresolveTypes cannot be resolved"
      + "\nresource cannot be resolved"
      + "\ngetExpressionScope cannot be resolved"
      + "\nfeatureScope cannot be resolved"
      + "\nlookupCrossReference cannot be resolved"
      + "\nfeatureJvmIdentifiableElementCrossReference_2_0 cannot be resolved");
  }
  
  protected void createReceiverProposals(final /* XExpression */Object receiver, final /* CrossReference */Object crossReference, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nIScope cannot be resolved to a type."
      + "\nXMemberFeatureCall cannot be resolved to a type."
      + "\nXMemberFeatureCall cannot be resolved to a type."
      + "\nXAbstractFeatureCall cannot be resolved to a type."
      + "\nThe method or field IExpressionScope is undefined"
      + "\n&& cannot be resolved."
      + "\nThe method or field crossrefProposalProvider is undefined"
      + "\nThe field mbaseIdeContentProposalProvider.typeResolver refers to the missing type IBatchTypeResolver"
      + "\nThe field mbaseIdeContentProposalProvider.syntaxFilteredScopes refers to the missing type SyntaxFilteredScopes"
      + "\nThe field mbaseIdeContentProposalProvider.syntaxFilteredScopes refers to the missing type SyntaxFilteredScopes"
      + "\nThe field mbaseIdeContentProposalProvider.syntaxFilteredScopes refers to the missing type SyntaxFilteredScopes"
      + "\nresolveTypes cannot be resolved"
      + "\ngetActualType cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nisPrimitiveVoid cannot be resolved"
      + "\ngetExpressionScope cannot be resolved"
      + "\nAnchor cannot be resolved"
      + "\nRECEIVER cannot be resolved"
      + "\ncurrentModel cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nmemberCallTarget cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\ngetFeatureScope cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nfeatureScope cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nfeatureScope cannot be resolved"
      + "\nlookupCrossReference cannot be resolved");
  }
  
  protected String _getConcreteSyntaxRuleName(final /* Assignment */Object assignment) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getConcreteSyntaxRuleName(Assignment) from the type mbaseIdeContentProposalProvider refers to the missing type Assignment"
      + "\nterminal cannot be resolved");
  }
  
  protected String _getConcreteSyntaxRuleName(final /* CrossReference */Object crossReference) {
    throw new Error("Unresolved compilation problems:"
      + "\nRuleCall cannot be resolved to a type."
      + "\nThe method getConcreteSyntaxRuleName(Assignment) from the type mbaseIdeContentProposalProvider refers to the missing type Assignment"
      + "\nterminal cannot be resolved"
      + "\nterminal cannot be resolved");
  }
  
  protected String _getConcreteSyntaxRuleName(final /* RuleCall */Object ruleCall) {
    throw new Error("Unresolved compilation problems:"
      + "\nrule cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public Object createProposals(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method _createProposals(RuleCall, ContentAssistContext, IIdeContentProposalAcceptor) of type mbaseIdeContentProposalProvider must override a superclass method.");
  }
  
  protected String getConcreteSyntaxRuleName(final Assignment assignment) {
    if (assignment != null) {
      return _getConcreteSyntaxRuleName(assignment); else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(assignment).toString());
      }
    }
  }
  