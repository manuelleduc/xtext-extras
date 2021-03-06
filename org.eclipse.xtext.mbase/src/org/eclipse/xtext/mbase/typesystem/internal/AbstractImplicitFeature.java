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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.EObjectDiagnosticImpl;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XVariableDeclaration;
import org.eclipse.xtext.mbase.MbasePackage;
import org.eclipse.xtext.mbase.typesystem.computation.IFeatureLinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.computation.ILinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.validation.IssueCodes;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractImplicitFeature implements IFeatureLinkingCandidate {

	private final XAbstractFeatureCall featureCall;
	private final XAbstractFeatureCall implicit;
	private final ExpressionTypeComputationState state;

	protected AbstractImplicitFeature(XAbstractFeatureCall featureCall, XAbstractFeatureCall implicit, ExpressionTypeComputationState state) {
		this.featureCall = featureCall;
		this.implicit = implicit;
		this.state = state;
	}
	
	protected ExpressionTypeComputationState getState() {
		return state;
	}
	
	@Override
	public void applyToComputationState() {
		state.acceptCandidate(implicit, this);
		getState().markAsRefinedTypeIfNecessary(this);
	}
	
	protected XAbstractFeatureCall getOwner() {
		return featureCall;
	}

	@Override
	public ILinkingCandidate getPreferredCandidate(ILinkingCandidate other) {
		return this;
	}

	@Override
	public JvmIdentifiableElement getFeature() {
		return implicit.getFeature();
	}
	
	@Override
	public boolean validate(IAcceptor<? super AbstractDiagnostic> result) {
		JvmIdentifiableElement implicitFeature = getFeature();
		if (implicitFeature instanceof XVariableDeclaration) {
			XVariableDeclaration casted = (XVariableDeclaration) implicitFeature;
			if (casted.isWriteable()) {
				String message = getState().getResolver().getInvalidWritableVariableAccessMessage(casted, getFeatureCall(), getState().getResolvedTypes());
				if (message != null) {
					AbstractDiagnostic diagnostic = new EObjectDiagnosticImpl(Severity.ERROR,
							IssueCodes.INVALID_MUTABLE_VARIABLE_ACCESS, message, getOwner(),
							MbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, -1, null);
					result.accept(diagnostic);
					return false;
				}
			}
			if (EcoreUtil.isAncestor(casted, getFeatureCall())) {
				String message = String.format("The implicitly referenced variable %s may not have been initialized", implicitFeature.getSimpleName());
				AbstractDiagnostic diagnostic = new EObjectDiagnosticImpl(Severity.ERROR,
						IssueCodes.ILLEGAL_FORWARD_REFERENCE, message, getOwner(),
						MbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, -1, null);
				result.accept(diagnostic);
				return false;
			}
		}
		return true;
	}

	@Override
	public List<LightweightTypeReference> getTypeArguments() {
		return Collections.emptyList();
	}

	@Override
	public XAbstractFeatureCall getFeatureCall() {
		return implicit;
	}
	
	@Override
	public XExpression getExpression() {
		return implicit;
	}

	@Override
	public boolean isStatic() {
		return false;
	}
	
	@Override
	public boolean isTypeLiteral() {
		return false;
	}

	@Override
	public boolean isExtension() {
		return false;
	}
	

}
