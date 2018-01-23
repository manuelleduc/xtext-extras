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

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.computation.ILinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractNullLinkingCandidate implements ILinkingCandidate {

	protected final XExpression featureOrConstructorCall;

	protected AbstractNullLinkingCandidate(XExpression featureOrConstructorCall) {
		this.featureOrConstructorCall = featureOrConstructorCall;
	}
	
	@Override
	public void applyToModel(IResolvedTypes resolvedTypes) {
		// no op
	}
	
	@Override
	public boolean validate(IAcceptor<? super AbstractDiagnostic> result) {
		// no op
		return true;
	}
	
	@Override
	public XExpression getExpression() {
		return featureOrConstructorCall;
	}

	@Override
	public JvmIdentifiableElement getFeature() {
		return null;
	}

	@Override
	public List<LightweightTypeReference> getTypeArguments() {
		return Collections.emptyList();
	}
	
}
