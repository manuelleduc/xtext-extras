/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.mbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.mbase.typesystem.computation.ITypeComputationResult;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * TODO JavaDoc, toString
 */
public class ConstructorBodyComputationState extends AbstractLogicalContainerAwareRootComputationState {

	public ConstructorBodyComputationState(ResolvedTypes resolvedTypes, IFeatureScopeSession featureScopeSession, JvmConstructor constructor) {
		super(resolvedTypes.pushExpectedExceptions(constructor), featureScopeSession, constructor);
		for(JvmFormalParameter parameter: constructor.getParameters()) {
			addLocalToCurrentScope(parameter);
		}
	}
	
	@Override
	protected List<AbstractTypeExpectation> getExpectations(AbstractTypeComputationState actualState, boolean returnType) {
		LightweightTypeReference voidType = getExpectedType();
		AbstractTypeExpectation result = returnType ? new TypeExpectation(voidType, actualState, returnType) : new RootTypeExpectation(voidType, actualState);
		return Collections.singletonList(result);
	}
	
	@Override
	protected LightweightTypeReference getExpectedType() {
		return getResolvedTypes().getReferenceOwner().toLightweightTypeReference(getTypeReferences().getTypeForName(Void.TYPE, getMember()));
	}
	
	@Override
	protected ITypeComputationResult createNoTypeResult() {
		return new NoTypeResult(getMember(), resolvedTypes.getReferenceOwner());
	}

}
