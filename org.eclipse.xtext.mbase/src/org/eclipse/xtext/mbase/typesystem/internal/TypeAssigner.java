/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.mbase.typesystem.computation.ITypeAssigner;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 * TODO JavaDoc, toString
 */
public class TypeAssigner implements ITypeAssigner {
	private final AbstractTypeComputationState state;

	protected TypeAssigner(AbstractTypeComputationState state) {
		this.state = state;
	}

	@Override
	public AbstractTypeComputationState getForkedState() {
		return state;
	}

	@Override
	public void assignType(JvmIdentifiableElement element, /* @Nullable */ LightweightTypeReference actualType) {
		assignType(element, actualType, true);
	}
	
	protected void assignType(JvmIdentifiableElement element, /* @Nullable */ LightweightTypeReference actualType, boolean addToChildScope) {
		if (actualType != null) {
			state.getResolvedTypes().setType(element, actualType);
		} else {
			state.getResolvedTypes().setType(element, state.getReferenceOwner().newAnyTypeReference());
		}
		if (addToChildScope)
			state.addLocalToCurrentScope(element);
	}

	@Override
	public ITypeReferenceOwner getReferenceOwner() {
		return state.getReferenceOwner();
	}

	@Override
	public LightweightTypeReference toLightweightTypeReference(JvmTypeReference reference) {
		return getReferenceOwner().toLightweightTypeReference(reference);
	}
}