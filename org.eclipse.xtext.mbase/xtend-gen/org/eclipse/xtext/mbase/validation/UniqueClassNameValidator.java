/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.validation;

import org.eclipse.xtext.mbase.jvmmodel.IJvmModelAssociations;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class UniqueClassNameValidator /* implements AbstractDeclarativeValidator  */{
  /* @Inject
   */private /* ResourceDescriptionsProvider */Object resourceDescriptionsProvider;
  
  /* @Inject
   */private /* IQualifiedNameProvider */Object qualifiedNameProvider;
  
  /* @Inject
   */private IJvmModelAssociations associations;
  
  @Override
  public Object register(final /* EValidatorRegistrar */Object registrar) {
    return null;
  }
  
  /* @Inject
   */protected void register(final /* EValidatorRegistrar */Object registrar, final /* IGrammarAccess */Object grammarAccess) {
    throw new Error("Unresolved compilation problems:"
      + "\nParserRule cannot be resolved to a type."
      + "\ngrammar cannot be resolved"
      + "\nrules cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nregister cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nclassifier cannot be resolved"
      + "\nEPackage cannot be resolved");
  }
  
  /* @Check
   */public void checkUniqueName(final /* EObject */Object root) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field JvmDeclaredType is undefined"
      + "\nThe method doCheckUniqueName(JvmDeclaredType) from the type UniqueClassNameValidator refers to the missing type JvmDeclaredType"
      + "\neContainer cannot be resolved"
      + "\n=== cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nhead cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void doCheckUniqueName(final /* JvmDeclaredType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field UniqueClassNameValidator.qualifiedNameProvider refers to the missing type IQualifiedNameProvider"
      + "\nThe method doCheckUniqueName(QualifiedName, JvmDeclaredType) from the type UniqueClassNameValidator refers to the missing type QualifiedName"
      + "\neContainer cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ngetFullyQualifiedName cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  protected boolean doCheckUniqueName(final /* QualifiedName */Object name, final /* JvmDeclaredType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field TypesPackage is undefined"
      + "\nThe field UniqueClassNameValidator.resourceDescriptionsProvider refers to the missing type ResourceDescriptionsProvider"
      + "\nThe method checkUniqueInIndex(JvmDeclaredType, Iterable<IEObjectDescription>) from the type UniqueClassNameValidator refers to the missing type JvmDeclaredType"
      + "\ngetResourceDescriptions cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ngetExportedObjects cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_DECLARED_TYPE cannot be resolved");
  }
  
  protected boolean checkUniqueInIndex(final /* JvmDeclaredType */Object type, final /* Iterable<IEObjectDescription> */Object descriptions) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method map(Object) is undefined for the type Iterable<IEObjectDescription>"
      + "\nThe method or field EObjectURI is undefined"
      + "\nThe method addIssue(JvmDeclaredType, String) from the type UniqueClassNameValidator refers to the missing type JvmDeclaredType"
      + "\ntrimFragment cannot be resolved"
      + "\ntoSet cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\n!= cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nURI cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nlastSegment cannot be resolved");
  }
  
  protected void addIssue(final /* JvmDeclaredType */Object type, final String fileName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getPrimarySourceElement(JvmDeclaredType) is undefined for the type IJvmModelAssociations"
      + "\nInvalid number of arguments. The method addIssue(JvmDeclaredType, String) is not applicable for the arguments (CharSequence,JvmDeclaredType,String)"
      + "\nInvalid number of arguments. The method addIssue(JvmDeclaredType, String) is not applicable for the arguments (CharSequence,Object,Object,String)"
      + "\nThe method addIssue(JvmDeclaredType, String) from the type UniqueClassNameValidator refers to the missing type JvmDeclaredType"
      + "\nThe method addIssue(JvmDeclaredType, String) from the type UniqueClassNameValidator refers to the missing type JvmDeclaredType"
      + "\n=== cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetEStructuralFeature cannot be resolved");
  }
}
