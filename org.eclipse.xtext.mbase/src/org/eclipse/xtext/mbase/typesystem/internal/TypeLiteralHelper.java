/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceFlags;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.ParameterizedTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.TypeReferenceInitializer;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class TypeLiteralHelper {
	
	private ExpressionTypeComputationState state;

	protected TypeLiteralHelper(ExpressionTypeComputationState state) {
		this.state = state;
	}

	/**
	 * @deprecated use {@link ITypeReferenceOwner#newReferenceTo(Class)} instead.
	 */
	@Deprecated
	/* @Nullable */
	protected LightweightTypeReference getRawTypeForName(Class<?> clazz, ITypeReferenceOwner owner) {
		return owner.newReferenceTo(clazz);
	}
	
	protected LightweightTypeReference getAsClassLiteral(final JvmIdentifiableElement feature) {
		if (feature instanceof JvmType) {
			final ITypeReferenceOwner owner = state.getReferenceOwner();
			return owner.newReferenceTo(Class.class, new TypeReferenceInitializer<ParameterizedTypeReference>() {
				@Override
				public LightweightTypeReference enhance(ParameterizedTypeReference reference) {
					LightweightTypeReference argumentType = owner.newParameterizedTypeReference((JvmType) feature);
					if (argumentType.isPrimitiveVoid()) {
						argumentType = owner.newReferenceTo(Void.class);
					} else {
						argumentType = argumentType.getWrapperTypeIfPrimitive();
					}
					reference.addTypeArgument(argumentType);
					return reference;
				}
			});
		}
		throw new IllegalArgumentException(String.valueOf(feature));
	}
	
	protected void applyPackageFragment(XMemberFeatureCall memberFeatureCall, JvmDeclaredType type) {
		XExpression target = memberFeatureCall.getMemberCallTarget();
		state.getResolvedTypes().acceptType(
				target, 
				new NoExpectation(state, false),
				state.getReferenceOwner().newParameterizedTypeReference(type),
				false,
				ConformanceFlags.CHECKED_SUCCESS);
		if (target instanceof XMemberFeatureCall) {
			applyPackageFragment((XMemberFeatureCall) target, type);
		}
	}
	
}
