/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import java.util.List;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * TODO JavaDoc, toString
 */
public class ReturnExpectationTypeComputationState extends AbstractStackedTypeComputationState {

	protected ReturnExpectationTypeComputationState(
			ResolvedTypes resolvedTypes,
			IFeatureScopeSession featureScopeSession,
			AbstractTypeComputationState parent) {
		super(resolvedTypes, featureScopeSession, parent);
	}

	@Override
	public List<AbstractTypeExpectation> getExpectations(AbstractTypeComputationState actualState) {
		return getReturnExpectations(actualState, true);
	}

	@Override
	protected LightweightTypeReference acceptType(ResolvedTypes types, AbstractTypeExpectation expectation,
			LightweightTypeReference type, boolean returnType, int flags) {
		if (returnType)
			return getParent().acceptType(types, expectation, type, returnType, flags);
		return type;
	}
	
	@Override
	protected LightweightTypeReference acceptType(XExpression alreadyHandled, ResolvedTypes types,
			AbstractTypeExpectation expectation, LightweightTypeReference type, boolean returnType,
			int flags) {
		if (returnType)
			return getParent().acceptType(alreadyHandled, types, expectation, type, returnType, flags);
		return type;
	}
}
