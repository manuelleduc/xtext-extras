/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.computation.IConstructorLinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.computation.ILinkingCandidate;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class NullConstructorLinkingCandidate extends AbstractNullLinkingCandidate implements IConstructorLinkingCandidate {

	private AbstractTypeComputationState state;

	public NullConstructorLinkingCandidate(XConstructorCall constructorCall, AbstractTypeComputationState state) {
		super(constructorCall);
		this.state = state;
	}
	
	@Override
	public ILinkingCandidate getPreferredCandidate(ILinkingCandidate other) {
		return other;
	}

	@Override
	public XConstructorCall getConstructorCall() {
		return (XConstructorCall) featureOrConstructorCall;
	}

	@Override
	public JvmConstructor getConstructor() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean isAnonymousClassConstructorCall() {
		return false;
	}
	
	@Override
	public void applyToComputationState() {
		for(XExpression argument: getConstructorCall().getArguments()) {
			state.withNonVoidExpectation().computeTypes(argument);
		}
	}

}
