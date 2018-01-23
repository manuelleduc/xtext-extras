/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.contentassist;

@SuppressWarnings("all")
public class mbaseIdeCrossrefProposalProvider /* implements IdeCrossrefProposalProvider  */{
  public static class ProposalBracketInfo {
    private String brackets = "";
    
    private int selectionOffset = 0;
    
    private int selectionLength = 0;
    
    private int caretOffset = 0;
  }
  
  /* @Inject
   */private /* CommonTypeComputationServices */Object typeComputationServices;
  
  @Override
  public Object createProposal(final /* IEObjectDescription */Object candidate, final /* CrossReference */Object crossRef, final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nIIdentifiableElementDescription cannot be resolved to a type."
      + "\nJvmFeature cannot be resolved to a type."
      + "\nJvmExecutable cannot be resolved to a type."
      + "\nThe method or field qualifiedNameConverter is undefined"
      + "\nThe method or field proposalCreator is undefined"
      + "\nThe method or field qualifiedNameConverter is undefined"
      + "\nThe method or field nullOrEmpty is undefined for the type String"
      + "\nThe method or field qualifiedNameConverter is undefined"
      + "\nThe method or field qualifiedNameConverter is undefined"
      + "\nThe method or field qualifiedNameConverter is undefined"
      + "\n!= cannot be resolved."
      + "\nTextRegion cannot be resolved."
      + "\nThe method or field super is undefined"
      + "\nThe method getProposalBracketInfo(IEObjectDescription, ContentAssistContext) from the type mbaseIdeCrossrefProposalProvider refers to the missing type IEObjectDescription"
      + "\nThe method getTypeConverter(XtextResource) from the type mbaseIdeCrossrefProposalProvider refers to the missing type Object"
      + "\nThe method addNameAndDescription(ContentAssistEntry, JvmFeature, boolean, int, String, LightweightTypeReferenceFactory) from the type mbaseIdeCrossrefProposalProvider refers to the missing type Object"
      + "\nThe method addNameAndDescription(ContentAssistEntry, JvmFeature, boolean, int, String, LightweightTypeReferenceFactory) from the type mbaseIdeCrossrefProposalProvider refers to the missing type Object"
      + "\nThe method addNameAndDescription(ContentAssistEntry, EObject, String, String) from the type mbaseIdeCrossrefProposalProvider refers to the missing type Object"
      + "\nThe method appendParameters(StringBuilder, JvmExecutable, int, LightweightTypeReferenceFactory) from the type mbaseIdeCrossrefProposalProvider refers to the missing type JvmExecutable"
      + "\nhasIdRule cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nnumberOfIrrelevantParameters cannot be resolved"
      + "\nresource cannot be resolved"
      + "\ngetEObjectOrProxy cannot be resolved"
      + "\ncreateProposal cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n! cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nname cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n- cannot be resolved"
      + "\nprefix cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlength cannot be resolved"
      + "\nescapePosition cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+= cannot be resolved"
      + "\neditPositions cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ncreateProposal cannot be resolved");
  }
  
  protected Object hasIdRule(final /* CrossReference */Object crossRef) {
    throw new Error("Unresolved compilation problems:"
      + "\nRuleCall cannot be resolved to a type."
      + "\nRuleCall cannot be resolved to a type."
      + "\nterminal cannot be resolved"
      + "\nterminal cannot be resolved"
      + "\nrule cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  protected mbaseIdeCrossrefProposalProvider.ProposalBracketInfo getProposalBracketInfo(final /* IEObjectDescription */Object proposedDescription, final /* ContentAssistContext */Object contentAssistContext) {
    throw new Error("Unresolved compilation problems:"
      + "\nIIdentifiableElementDescription cannot be resolved to a type."
      + "\nJvmExecutable cannot be resolved to a type."
      + "\n- cannot be resolved."
      + "\n- cannot be resolved."
      + "\n- cannot be resolved."
      + "\n< cannot be resolved."
      + "\n!= cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n++ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n- cannot be resolved."
      + "\n- cannot be resolved."
      + "\n- cannot be resolved."
      + "\nThe method getTypeConverter(XtextResource) from the type mbaseIdeCrossrefProposalProvider refers to the missing type Object"
      + "\nThe method isExplicitOperationCall(IIdentifiableElementDescription) from the type mbaseIdeCrossrefProposalProvider refers to the missing type Object"
      + "\nelementOrProxy cannot be resolved"
      + "\nparameters cannot be resolved"
      + "\nnumberOfParameters cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfirstSegment cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\n! cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\nresource cannot be resolved"
      + "\ntoLightweightReference cannot be resolved"
      + "\nisFunctionType cannot be resolved"
      + "\nasFunctionTypeReference cannot be resolved"
      + "\nparameterTypes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\n== cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n- cannot be resolved");
  }
  
  protected Object getTypeConverter(final /* XtextResource */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmParameterizedTypeReference cannot be resolved to a type."
      + "\nLightweightTypeReferenceFactory cannot be resolved."
      + "\nStandardTypeReferenceOwner cannot be resolved."
      + "\nThe method doVisitParameterizedTypeReference(JvmParameterizedTypeReference) is undefined for the type Object"
      + "\nThe method doVisitParameterizedTypeReference(JvmParameterizedTypeReference) of type new Object(){} must override a superclass method."
      + "\nThe field mbaseIdeCrossrefProposalProvider.typeComputationServices refers to the missing type CommonTypeComputationServices"
      + "\nisFunctionType cannot be resolved"
      + "\ntryConvertToFunctionTypeReference cannot be resolved");
  }
  
  protected Object addNameAndDescription(final /* ContentAssistEntry */Object entry, final /* JvmFeature */Object feature, final boolean withParents, final int insignificantParameters, final String shortName, final /* LightweightTypeReferenceFactory */Object converter) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmOperation cannot be resolved to a type."
      + "\nJvmField cannot be resolved to a type."
      + "\nJvmConstructor cannot be resolved to a type."
      + "\n! cannot be resolved."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nThe method appendParameters(StringBuilder, JvmExecutable, int, LightweightTypeReferenceFactory) from the type mbaseIdeCrossrefProposalProvider refers to the missing type JvmExecutable"
      + "\nThe method appendParameters(StringBuilder, JvmExecutable, int, LightweightTypeReferenceFactory) from the type mbaseIdeCrossrefProposalProvider refers to the missing type JvmExecutable"
      + "\nreturnType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntoLightweightReference cannot be resolved"
      + "\nhumanReadableName cannot be resolved"
      + "\ntoPlainTypeReference cannot be resolved"
      + "\ndeclaringType cannot be resolved"
      + "\nhumanReadableName cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntoLightweightReference cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nhumanReadableName cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntoPlainTypeReference cannot be resolved"
      + "\ndeclaringType cannot be resolved"
      + "\nhumanReadableName cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ndescription cannot be resolved");
  }
  
  protected Object addNameAndDescription(final /* ContentAssistEntry */Object entry, final /* EObject */Object element, final String qualifiedNameAsString, final String shortName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field qualifiedNameConverter is undefined"
      + "\ntoQualifiedName cannot be resolved"
      + "\nsegmentCount cannot be resolved"
      + "\n> cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlastSegment cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nlabel cannot be resolved");
  }
  
  protected void appendParameters(final StringBuilder result, final /* JvmExecutable */Object executable, final int insignificantParameters, final /* LightweightTypeReferenceFactory */Object ownedConverter) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmGenericArrayTypeReference cannot be resolved to a type."
      + "\nJvmGenericArrayTypeReference cannot be resolved to a type."
      + "\n< cannot be resolved."
      + "\n!= cannot be resolved."
      + "\n== cannot be resolved."
      + "\n++ cannot be resolved."
      + "\nparameters cannot be resolved"
      + "\nsubList cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nget cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n- cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nisVarArgs cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\ntoLightweightReference cannot be resolved"
      + "\ncomponentType cannot be resolved"
      + "\nhumanReadableName cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ntoLightweightReference cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\nhumanReadableName cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected Object isExplicitOperationCall(final /* IIdentifiableElementDescription */Object desc) {
    throw new Error("Unresolved compilation problems:"
      + "\nnumberOfParameters cannot be resolved"
      + "\n> cannot be resolved");
  }
}
