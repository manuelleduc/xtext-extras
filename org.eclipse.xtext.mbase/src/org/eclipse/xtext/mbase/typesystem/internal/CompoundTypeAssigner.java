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
import org.eclipse.xtext.mbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class CompoundTypeAssigner implements ITypeAssigner {

	private final TypeAssigner[] assigners;
	private final ITypeReferenceOwner owner;

	public CompoundTypeAssigner(ITypeReferenceOwner owner, TypeAssigner[] assigners) {
		this.owner = owner;
		this.assigners = assigners;
	}

	@Override
	public void assignType(JvmIdentifiableElement element, /* @Nullable */ LightweightTypeReference actualType) {
		for(ITypeAssigner assigner: assigners) {
			assigner.assignType(element, actualType);
		}
	}

	@Override
	public ITypeComputationState getForkedState() {
		AbstractTypeComputationState[] states = new AbstractTypeComputationState[assigners.length];
		for(int i = 0; i < states.length; i++) {
			states[i] = assigners[i].getForkedState();
		}
		return new CompoundTypeComputationState(owner, states);
	}

	@Override
	public LightweightTypeReference toLightweightTypeReference(JvmTypeReference reference) {
		return owner.toLightweightTypeReference(reference);
	}
	
	@Override
	public ITypeReferenceOwner getReferenceOwner() {
		return owner;
	}
	
}
