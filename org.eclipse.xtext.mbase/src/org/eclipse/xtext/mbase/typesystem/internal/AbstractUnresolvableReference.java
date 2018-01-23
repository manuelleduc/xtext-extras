/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.computation.ILinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceFlags;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractUnresolvableReference implements ILinkingCandidate {
	private final XExpression expression;
	private final ExpressionTypeComputationState state;

	public AbstractUnresolvableReference(XExpression expression, ExpressionTypeComputationState state) {
		this.expression = expression;
		this.state = state;
	}

	@Override
	public XExpression getExpression() {
		return expression;
	}

	@Override
	public void applyToComputationState() {
		StackedResolvedTypes resolvedTypes = getResolvedTypes();
		resolvedTypes.acceptCandidate(expression, this);
		computeArgumentTypes();
		applyType();
		resolvedTypes.mergeIntoParent();
	}

	protected void applyType() {
		state.acceptActualType(state.getReferenceOwner().newUnknownTypeReference(), ConformanceFlags.CHECKED_SUCCESS);
	}
	
	protected ExpressionTypeComputationState getState() {
		return state;
	}

	protected StackedResolvedTypes getResolvedTypes() {
		return state.getStackedResolvedTypes();
	}
	
	@Override
	public boolean validate(IAcceptor<? super AbstractDiagnostic> result) {
		// nothing to do
		return true;
	}

	protected void computeArgumentTypes() {
		List<XExpression> arguments = getArguments();
		for (XExpression argument : arguments) {
			if (getResolvedTypes().doGetTypeData(argument) == null) {
				AbstractTypeComputationState argumentState = state.withNonVoidExpectation();
				argumentState.computeTypes(argument);
			}
		}
	}

	protected abstract List<XExpression> getArguments();

	@Override
	public ILinkingCandidate getPreferredCandidate(ILinkingCandidate other) {
		return other;
	}

	/* @Nullable */
	@Override
	public JvmIdentifiableElement getFeature() {
		return null;
	}
	
	public EObject getContext() {
		return expression;
	}
	
}
