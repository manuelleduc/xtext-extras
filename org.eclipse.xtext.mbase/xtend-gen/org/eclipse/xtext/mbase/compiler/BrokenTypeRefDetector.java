/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler;

/**
 * A visitor that detects broken type references. Returns <code>true</code> if a broken reference
 * was detected.
 */
@SuppressWarnings("all")
public class BrokenTypeRefDetector /* implements AbstractTypeReferenceVisitor.InheritanceAware<Boolean>  */{
  @Override
  protected boolean handleNullReference() {
    return true;
  }
  
  @Override
  public Object doVisitTypeReference(final /* JvmTypeReference */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined"
      + "\nThe method or field type is undefined"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\neIsProxy cannot be resolved");
  }
  
  @Override
  public Object doVisitCompoundTypeReference(final /* JvmCompoundTypeReference */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field references is undefined"
      + "\nThe method or field visit is undefined"
      + "\nThe method doVisitTypeReference(JvmTypeReference) from the type BrokenTypeRefDetector refers to the missing type Object"
      + "\n|| cannot be resolved"
      + "\nexists cannot be resolved");
  }
  
  @Override
  public Object doVisitParameterizedTypeReference(final /* JvmParameterizedTypeReference */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field arguments is undefined"
      + "\nThe method or field visit is undefined"
      + "\nThe method doVisitTypeReference(JvmTypeReference) from the type BrokenTypeRefDetector refers to the missing type Object"
      + "\n|| cannot be resolved"
      + "\nexists cannot be resolved");
  }
  
  @Override
  public Object doVisitWildcardTypeReference(final /* JvmWildcardTypeReference */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field constraints is undefined"
      + "\nThe method or field typeReference is undefined"
      + "\nexists cannot be resolved"
      + "\nvisit cannot be resolved");
  }
}
