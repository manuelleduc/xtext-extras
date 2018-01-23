/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractReturnAwareTypeExpectation extends AbstractTypeExpectation {

	private final boolean returnType;
	
	protected AbstractReturnAwareTypeExpectation(AbstractTypeComputationState state, boolean returnType) {
		super(state);
		this.returnType = returnType;
	}

	@Override
	public void acceptActualType(LightweightTypeReference type, int flags) {
		getState().acceptType(getResolvedTypes(), this, type, returnType, flags);
	}
	
	protected boolean isReturnType() {
		return returnType;
	}

}
