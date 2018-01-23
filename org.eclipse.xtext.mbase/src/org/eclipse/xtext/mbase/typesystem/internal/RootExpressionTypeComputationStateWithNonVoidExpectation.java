/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class RootExpressionTypeComputationStateWithNonVoidExpectation extends RootExpressionTypeComputationState {

	protected RootExpressionTypeComputationStateWithNonVoidExpectation(StackedResolvedTypes resolvedTypes, IFeatureScopeSession featureScopeSession,
			AbstractTypeComputationState parent, XExpression expression, /* @Nullable */ LightweightTypeReference expectedType) {
		super(resolvedTypes, featureScopeSession, parent, expression, expectedType);
	}
	
	@Override
	protected AbstractTypeExpectation createTypeExpectation(/* @Nullable */ LightweightTypeReference expectedType, AbstractTypeComputationState actualState, boolean voidAllowed, boolean returnType) {
		return super.createTypeExpectation(expectedType, actualState, false, returnType);
	}

}
