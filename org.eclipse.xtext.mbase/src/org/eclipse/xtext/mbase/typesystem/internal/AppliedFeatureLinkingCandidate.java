/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import java.util.List;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.computation.IFeatureLinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.computation.ILinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class AppliedFeatureLinkingCandidate implements IFeatureLinkingCandidate {

	private final IFeatureLinkingCandidate delegate;

	protected AppliedFeatureLinkingCandidate(IFeatureLinkingCandidate delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public void applyToComputationState() {
		// nothing to do
	}

	@Override
	public void applyToModel(IResolvedTypes resolvedTypes) {
		// nothing to do
	}
	
	@Override
	public boolean validate(IAcceptor<? super AbstractDiagnostic> result) {
		// nothing to do
		return true;
	}

	@Override
	public ILinkingCandidate getPreferredCandidate(ILinkingCandidate other) {
		return this;
	}

	/* @Nullable */
	@Override
	public JvmIdentifiableElement getFeature() {
		return delegate.getFeature();
	}

	@Override
	public List<LightweightTypeReference> getTypeArguments() {
		return delegate.getTypeArguments();
	}
	
	@Override
	public XExpression getExpression() {
		return delegate.getExpression();
	}

	@Override
	public XAbstractFeatureCall getFeatureCall() {
		return delegate.getFeatureCall();
	}

	@Override
	public boolean isStatic() {
		return delegate.isStatic();
	}

	@Override
	public boolean isExtension() {
		return delegate.isExtension();
	}
	
	@Override
	public boolean isTypeLiteral() {
		return delegate.isTypeLiteral();
	}

}
