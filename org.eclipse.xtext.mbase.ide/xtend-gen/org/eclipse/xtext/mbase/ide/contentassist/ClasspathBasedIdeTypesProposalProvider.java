/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.contentassist;

import org.eclipse.xtext.mbase.ide.contentassist.IIdeTypesProposalProvider;
import org.eclipse.xtext.mbase.ide.types.ClasspathScanner;
import org.eclipse.xtext.mbase.ide.types.ITypeDescriptor;

@SuppressWarnings("all")
public class ClasspathBasedIdeTypesProposalProvider implements IIdeTypesProposalProvider {
  /* @Inject
   */private ClassLoader classLoader;
  
  /* @Inject
   */private ClasspathScanner classpathScanner;
  
  /* @Inject
   */private /* IdeContentProposalCreator */Object proposalCreator;
  
  /* @Inject
   */private /* IdeContentProposalPriorities */Object proposalPriorities;
  
  /* @Inject
   */private /* IQualifiedNameConverter */Object qualifiedNameConverter;
  
  /* @Inject
   */private /* IImportsConfiguration */Object importsConfiguration;
  
  /* @Inject
   */private /* ImportSectionRegionUtil */Object importSectionRegionUtil;
  
  @Override
  public void createTypeProposals(final /* EReference */Object reference, final /* ContentAssistContext */Object context, final /* Predicate<ITypeDescriptor> */Object filter, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nITextRegion cannot be resolved to a type."
      + "\nXImportSection cannot be resolved to a type."
      + "\nThe method isImportDeclaration(EReference, ContentAssistContext) from the type ClasspathBasedIdeTypesProposalProvider refers to the missing type Object"
      + "\nThe field ClasspathBasedIdeTypesProposalProvider.importsConfiguration refers to the missing type IImportsConfiguration"
      + "\nThe field ClasspathBasedIdeTypesProposalProvider.importSectionRegionUtil refers to the missing type ImportSectionRegionUtil"
      + "\nThe method canPropose(ITypeDescriptor, ContentAssistContext, Predicate) from the type ClasspathBasedIdeTypesProposalProvider refers to the missing type Object"
      + "\nThe method createProposal(EReference, ITypeDescriptor, ContentAssistContext, XImportSection, ITextRegion) from the type ClasspathBasedIdeTypesProposalProvider refers to the missing type ContentAssistEntry"
      + "\nThe method getTypeRefPriority(ITypeDescriptor, ContentAssistEntry) from the type mbaseIdeContentProposalPriorities refers to the missing type Object"
      + "\nThe field ClasspathBasedIdeTypesProposalProvider.proposalPriorities refers to the missing type IdeContentProposalPriorities"
      + "\n! cannot be resolved"
      + "\ngetImportSection cannot be resolved"
      + "\nresource cannot be resolved"
      + "\ncomputeRegion cannot be resolved"
      + "\nresource cannot be resolved"
      + "\ntypeDescriptors cannot be resolved"
      + "\ncanAcceptMoreProposals cannot be resolved"
      + "\n! cannot be resolved"
      + "\naccept cannot be resolved");
  }
  
  protected Object getTypeDescriptors(final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Iterables is undefined"
      + "\nclassLoader cannot be resolved"
      + "\nconcat cannot be resolved");
  }
  
  protected Object getClassLoader(final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nXtextResourceSet cannot be resolved to a type."
      + "\nresource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nclasspathURIContext cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nclassLoader cannot be resolved"
      + "\nclass cannot be resolved"
      + "\nclassLoader cannot be resolved");
  }
  
  protected Object canPropose(final ITypeDescriptor typeDesc, final /* ContentAssistContext */Object context, final /* Predicate<ITypeDescriptor> */Object filter) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method isVisible(ITypeDescriptor, ContentAssistContext) from the type ClasspathBasedIdeTypesProposalProvider refers to the missing type Object"
      + "\n&& cannot be resolved"
      + "\napply cannot be resolved");
  }
  
  protected Object isVisible(final ITypeDescriptor typeDesc, final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method bitwiseAnd(Object) is undefined for the type int"
      + "\nThe method or field Opcodes is undefined"
      + "\nACC_PUBLIC cannot be resolved"
      + "\n!= cannot be resolved");
  }
  
  protected /* ContentAssistEntry */Object createProposal(final /* EReference */Object reference, final ITypeDescriptor typeDesc, final /* ContentAssistContext */Object context, final /* XImportSection */Object importSection, final /* ITextRegion */Object importSectionRegion) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method label(String) is undefined"
      + "\nThe method description(Object) is undefined"
      + "\nThe method description(Object) is undefined"
      + "\nThe method isImportDeclaration(EReference, ContentAssistContext) from the type ClasspathBasedIdeTypesProposalProvider refers to the missing type Object"
      + "\nThe field ClasspathBasedIdeTypesProposalProvider.qualifiedNameConverter refers to the missing type IQualifiedNameConverter"
      + "\nThe method getQualifiedName() from the type ITypeDescriptor refers to the missing type QualifiedName"
      + "\nThe field ClasspathBasedIdeTypesProposalProvider.proposalCreator refers to the missing type IdeContentProposalCreator"
      + "\nThe method isImportDeclarationRequired(ITypeDescriptor, String, ContentAssistContext, XImportSection) from the type ClasspathBasedIdeTypesProposalProvider refers to the missing type Object"
      + "\nThe method addImportDeclaration(ContentAssistEntry, ITextRegion, ITypeDescriptor, String, ContentAssistContext) from the type ClasspathBasedIdeTypesProposalProvider refers to the missing type Object"
      + "\ntoString cannot be resolved"
      + "\ncreateProposal cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved");
  }
  
  protected Object isImportDeclaration(final /* EReference */Object reference, final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field XtypePackage is undefined"
      + "\n== cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nXIMPORT_DECLARATION__IMPORTED_TYPE cannot be resolved");
  }
  
  protected Object isImportDeclarationRequired(final ITypeDescriptor typeDesc, final String qualifiedName, final /* ContentAssistContext */Object context, final /* XImportSection */Object importSection) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\n== cannot be resolved."
      + "\nThe method or field importedType is undefined"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nimportDeclarations cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\n== cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  protected Object addImportDeclaration(final /* ContentAssistEntry */Object entry, final /* ITextRegion */Object importSectionRegion, final ITypeDescriptor typeDesc, final String qualifiedName, final /* ContentAssistContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nReplaceRegion cannot be resolved."
      + "\noffset cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlength cannot be resolved"
      + "\ntextReplacements cannot be resolved"
      + "\n+= cannot be resolved");
  }
}
