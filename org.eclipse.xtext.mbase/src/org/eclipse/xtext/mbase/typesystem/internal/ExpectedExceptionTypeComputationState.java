/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
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
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class ExpectedExceptionTypeComputationState extends AbstractStackedTypeComputationState {

	protected ExpectedExceptionTypeComputationState(ResolvedTypes resolvedTypes, IFeatureScopeSession featureScopeSession, AbstractTypeComputationState parent,
			List<LightweightTypeReference> exceptions) {
		super(resolvedTypes.pushExpectedExceptions(exceptions), featureScopeSession, parent);
	}
	
	@Override
	protected LightweightTypeReference acceptType(ResolvedTypes types, AbstractTypeExpectation expectation, LightweightTypeReference type, boolean returnType,
			int flags) {
		return getParent().acceptType(types, expectation, type, returnType, flags);
	}

	@Override
	protected LightweightTypeReference acceptType(XExpression alreadyHandled, ResolvedTypes types, AbstractTypeExpectation expectation,
			LightweightTypeReference type, boolean returnType, int flags) {
		return getParent().acceptType(alreadyHandled, types, expectation, type, returnType, flags);
	}

}
