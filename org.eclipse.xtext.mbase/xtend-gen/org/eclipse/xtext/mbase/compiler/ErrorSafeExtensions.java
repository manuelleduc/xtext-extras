/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler;

import org.eclipse.xtext.mbase.compiler.IElementIssueProvider;
import org.eclipse.xtext.mbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.mbase.compiler.output.ITreeAppendable;

/**
 * @author Jan Koehnlein
 */
@SuppressWarnings("all")
public class ErrorSafeExtensions {
  /* @Inject
   */private TypeReferenceSerializer _typeReferenceSerializer;
  
  /* @Inject
   */private IElementIssueProvider.Factory issueProviderFactory;
  
  public /* Iterable<Issue> */Object getErrors(final /* EObject */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method get(Object) is undefined for the type Factory"
      + "\nThe method or field severity is undefined"
      + "\nThe method or field Severity is undefined"
      + "\neResource cannot be resolved"
      + "\ngetIssues cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\n== cannot be resolved"
      + "\nERROR cannot be resolved");
  }
  
  public boolean hasErrors(final /* EObject */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method get(Object) is undefined for the type Factory"
      + "\nThe method or field Severity is undefined"
      + "\neResource cannot be resolved"
      + "\ngetIssues cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nseverity cannot be resolved"
      + "\n== cannot be resolved"
      + "\nERROR cannot be resolved");
  }
  
  public <T/*  extends EObject */> void forEachSafely(final ITreeAppendable appendable, final Iterable<T> elements, final /*  */Object loopInitializer, final /*  */Object body) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field empty is undefined for the type Iterable<T>"
      + "\n=> cannot be resolved."
      + "\nThe method filter(Object) is undefined for the type Iterable<T>"
      + "\nThe method or field size is undefined for the type Iterable<T>"
      + "\n! cannot be resolved."
      + "\n! cannot be resolved."
      + "\n! cannot be resolved."
      + "\n! cannot be resolved."
      + "\nThe method hasErrors(EObject) from the type ErrorSafeExtensions refers to the missing type EObject"
      + "\nhasErrors cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\nappendPrefix cannot be resolved"
      + "\nappendSeparator cannot be resolved"
      + "\napply cannot be resolved"
      + "\n! cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nappendSeparator cannot be resolved"
      + "\napply cannot be resolved"
      + "\nappendSuffix cannot be resolved");
  }
  
  protected ITreeAppendable openErrorAppendable(final ITreeAppendable parent, final ITreeAppendable child) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved.");
  }
  
  protected ITreeAppendable closeErrorAppendable(final ITreeAppendable parent, final ITreeAppendable child) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\n!= cannot be resolved.");
  }
  
  public void serializeSafely(final /* JvmTypeReference */Object typeRef, final ITreeAppendable appendable) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method serializeSafely(JvmTypeReference, String, ITreeAppendable) from the type ErrorSafeExtensions refers to the missing type JvmTypeReference");
  }
  
  public void serializeSafely(final /* JvmTypeReference */Object typeRef, final String surrogateType, final ITreeAppendable appendable) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmSpecializedTypeReference cannot be resolved to a type."
      + "\nJvmUnknownTypeReference cannot be resolved to a type."
      + "\nThe method serialize(JvmTypeReference, Object, ITreeAppendable) is undefined"
      + "\n!== cannot be resolved."
      + "\nThe method serialize(JvmTypeReference, Object, ITreeAppendable) is undefined"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nequivalent cannot be resolved"
      + "\nserializeSafely cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\naccept cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved");
  }
  
  public void serializeSafely(final /* JvmAnnotationReference */Object annotationRef, final ITreeAppendable appendable, final /*  */Object onSuccess) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nannotation cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nannotation cannot be resolved"
      + "\neIsProxy cannot be resolved"
      + "\nannotation cannot be resolved"
      + "\nannotation cannot be resolved"
      + "\napply cannot be resolved");
  }
}
