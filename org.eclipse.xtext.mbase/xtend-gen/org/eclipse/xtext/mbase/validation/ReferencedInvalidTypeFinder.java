/**
 * Copyright (c) 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.validation;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.mbase.typesystem.references.ArrayTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.CompoundTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.ParameterizedTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.TypeReferenceVisitorWithResult;
import org.eclipse.xtext.mbase.typesystem.references.WildcardTypeReference;
import org.eclipse.xtext.mbase.typesystem.util.CommonTypeComputationServices;

/**
 * @author kosyakov - Initial contribution and API
 */
/* @Singleton */@SuppressWarnings("all")
public class ReferencedInvalidTypeFinder extends TypeReferenceVisitorWithResult<LightweightTypeReference> {
  /* @Inject
   */private CommonTypeComputationServices services;
  
  public LightweightTypeReference findReferencedInvalidType(final /* JvmIdentifiableElement */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\ninternalFindReferencedInvalidType cannot be resolved");
  }
  
  protected LightweightTypeReference _internalFindReferencedInvalidType(final /* JvmIdentifiableElement */Object field) {
    return null;
  }
  
  protected LightweightTypeReference _internalFindReferencedInvalidType(final Void field) {
    return null;
  }
  
  protected LightweightTypeReference _internalFindReferencedInvalidType(final /* JvmField */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\ntoLightweightTypeReference cannot be resolved"
      + "\nprimitiveVoid cannot be resolved"
      + "\nfindUnknownType cannot be resolved");
  }
  
  protected LightweightTypeReference _internalFindReferencedInvalidType(final /* JvmOperation */Object operation) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmExecutable cannot be resolved to a type."
      + "\nThe method _internalFindReferencedInvalidType(JvmIdentifiableElement) from the type ReferencedInvalidTypeFinder refers to the missing type JvmIdentifiableElement"
      + "\nreturnType cannot be resolved"
      + "\nfindUnknownType cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  protected LightweightTypeReference _internalFindReferencedInvalidType(final /* JvmExecutable */Object executable) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field constraints is undefined"
      + "\nThe method or field typeReference is undefined"
      + "\nThe method or field parameterType is undefined"
      + "\ntypeParameters cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nfindUnknownType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nparameters cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ntoLightweightTypeReference cannot be resolved"
      + "\nprimitiveVoid cannot be resolved"
      + "\nfindUnknownType cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nexceptions cannot be resolved"
      + "\nfindUnknownType cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  protected LightweightTypeReference findUnknownType(final /* JvmTypeReference */Object reference) {
    throw new Error("Unresolved compilation problems:"
      + "\ntoLightweightTypeReference cannot be resolved"
      + "\nfindUnknownType cannot be resolved");
  }
  
  protected LightweightTypeReference findUnknownType(final LightweightTypeReference type) {
    return type.<LightweightTypeReference>accept(this);
  }
  
  @Override
  protected LightweightTypeReference doVisitTypeReference(final LightweightTypeReference reference) {
    boolean _isUnknown = reference.isUnknown();
    if (_isUnknown) {
      return reference;
    }
    return null;
  }
  
  @Override
  protected LightweightTypeReference doVisitArrayTypeReference(final ArrayTypeReference reference) {
    return reference.getComponentType().<LightweightTypeReference>accept(this);
  }
  
  @Override
  protected LightweightTypeReference doVisitWildcardTypeReference(final WildcardTypeReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\n!== cannot be resolved.");
  }
  
  @Override
  protected LightweightTypeReference doVisitParameterizedTypeReference(final ParameterizedTypeReference reference) {
    return this.visit(reference.getTypeArguments());
  }
  
  @Override
  protected LightweightTypeReference doVisitCompoundTypeReference(final CompoundTypeReference reference) {
    return this.visit(reference.getMultiTypeComponents());
  }
  
  protected LightweightTypeReference visit(final List<LightweightTypeReference> references) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method map(Object) is undefined for the type List<LightweightTypeReference>"
      + "\nThe method accept(ReferencedInvalidTypeFinder) is undefined"
      + "\nfilterNull cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  protected LightweightTypeReference toLightweightTypeReference(final /* JvmTypeReference */Object typeRef) {
    throw new Error("Unresolved compilation problems:"
      + "\nStandardTypeReferenceOwner cannot be resolved."
      + "\ntoLightweightTypeReference cannot be resolved");
  }
  
  protected LightweightTypeReference internalFindReferencedInvalidType(final JvmIdentifiableElement field) {
    if (field == null) {
      return _internalFindReferencedInvalidType(null);
    } else if (field != null) {
      return _internalFindReferencedInvalidType(field);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(field).toString());
    }
  }
}
