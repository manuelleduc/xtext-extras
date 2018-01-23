/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.references;

import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReferenceFactory;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.impl.XFunctionTypeRefImplCustom;

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class IndexingLightweightTypeReferenceFactory extends LightweightTypeReferenceFactory {
  public IndexingLightweightTypeReferenceFactory(final ITypeReferenceOwner owner) {
    super(owner);
  }
  
  public IndexingLightweightTypeReferenceFactory(final ITypeReferenceOwner owner, final boolean keepUnboundWildcards) {
    super(owner, keepUnboundWildcards);
  }
  
  protected /* JvmType */Object _getType(final /* JvmTypeReference */Object it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("It is not possible to get a type for the given jvm type reference: �it.class.name�");
    throw new UnsupportedOperationException(_builder.toString());
  }
  
  protected /* JvmType */Object _getType(final /* JvmGenericArrayTypeReferenceImplCustom */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmComponentType cannot be resolved to a type."
      + "\nThe method or field componentType is undefined"
      + "\nThe method getType(XFunctionTypeRef) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmType"
      + "\n=== cannot be resolved"
      + "\narrayType cannot be resolved");
  }
  
  protected /* JvmType */Object _getType(final /* JvmParameterizedTypeReference */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE is undefined"
      + "\nThe method getType(XFunctionTypeRef) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmType");
  }
  
  protected /* JvmType */Object _getType(final XFunctionTypeRef it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field XFUNCTION_TYPE_REF__TYPE is undefined"
      + "\nThe method getType(XFunctionTypeRef) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmType");
  }
  
  protected /* JvmType */Object _getType(final XFunctionTypeRefImplCustom it) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nThe method or field paramTypes is undefined"
      + "\nThe method or field eResource is undefined"
      + "\nThe method computeTypeUri(boolean, int) from the type XFunctionTypeRefs refers to the missing type Object"
      + "\nsize cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\ngetEObject cannot be resolved");
  }
  
  public boolean isProcedure(final XFunctionTypeRefImplCustom it) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmVoid cannot be resolved to a type."
      + "\nThe method or field returnType is undefined"
      + "\nThe method getType(XFunctionTypeRef) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmType"
      + "\n=== cannot be resolved"
      + "\n=== cannot be resolved"
      + "\neIsProxy cannot be resolved");
  }
  
  public /* JvmType */Object getType(final /* EObject */Object it, final /* EReference */Object reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nEObject cannot be resolved to a type."
      + "\nInternalEObject cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\nThe method eGet(EReference, boolean) is undefined"
      + "\nThe method or field eResource is undefined"
      + "\neIsProxy cannot be resolved"
      + "\neProxyURI cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\ngetEObject cannot be resolved");
  }
  
  @Override
  public LightweightTypeReference doVisitFunctionTypeReference(final XFunctionTypeRef reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmTypeReference cannot be resolved to a type."
      + "\nFunctionTypeReference cannot be resolved."
      + "\nThe method getParamTypes() is undefined for the type XFunctionTypeRef"
      + "\nThe method visit(JvmTypeReference) is undefined"
      + "\nThe method getReturnType() is undefined for the type XFunctionTypeRef"
      + "\nThe method visit(JvmTypeReference) is undefined"
      + "\nThe method getReturnType() is undefined for the type XFunctionTypeRef"
      + "\nThe method getType(XFunctionTypeRef) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmType"
      + "\nThe method wrapIfNecessary(JvmTypeReference) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmTypeReference"
      + "\nThe method wrapIfNecessary(JvmTypeReference) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmTypeReference"
      + "\naddParameterType cannot be resolved"
      + "\naddTypeArgument cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nsetReturnType cannot be resolved"
      + "\naddTypeArgument cannot be resolved");
  }
  
  public /* JvmTypeReference */Object wrapIfNecessary(final /* JvmTypeReference */Object reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getType(XFunctionTypeRef) from the type IndexingLightweightTypeReferenceFactory refers to the missing type JvmType"
      + "\n=== cannot be resolved"
      + "\nwrapIfNecessary cannot be resolved");
  }
  
  protected LightweightTypeReference getJavaLangObjectTypeReference() {
    return this.getOwner().newReferenceToObject();
  }
  
  public JvmType getType(final XFunctionTypeRef it) {
    if (it instanceof XFunctionTypeRefImplCustom) {
      return _getType((XFunctionTypeRefImplCustom)it);
    } else if (it != null) {
      return _getType(it);
    } else if (it != null) {
      return _getType(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
