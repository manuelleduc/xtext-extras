/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.mbasePackage;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.computation.IFeatureLinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

import com.google.common.collect.Lists;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class FollowUpError extends AbstractUnresolvableReference implements IFeatureLinkingCandidate {

	public FollowUpError(XAbstractFeatureCall featureCall, ExpressionTypeComputationState state) {
		super(featureCall, state);
	}
	
	@Override
	public void applyToModel(IResolvedTypes resolvedTypes) {
		Resource resource = getExpression().eResource();
		if (resource instanceof LazyLinkingResource) {
			LazyLinkingResource lazyLinkingResource = (LazyLinkingResource) resource;
			EObject referenced = (InternalEObject) getExpression().eGet(getReference(), false);
			lazyLinkingResource.markUnresolvable(referenced);
		}
	}

	@Override
	public XAbstractFeatureCall getFeatureCall() {
		return (XAbstractFeatureCall) getExpression();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected List<XExpression> getArguments() {
		return getFeatureCall().getExplicitArguments();
	}

	@Override
	public boolean isStatic() {
		return false;
	}

	@Override
	public boolean isExtension() {
		return false;
	}
	
	@Override
	public boolean isTypeLiteral() {
		return false;
	}
	
	public EReference getReference() {
		return mbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE;
	}

	@Override
	public List<LightweightTypeReference> getTypeArguments() {
		XAbstractFeatureCall featureCall = getFeatureCall();
		List<JvmTypeReference> typeArguments = featureCall.getTypeArguments();
		if (typeArguments.isEmpty())
			return Collections.emptyList();
		List<LightweightTypeReference> result = Lists.newArrayList();
		for(JvmTypeReference typeArgument: typeArguments) {
			result.add(getState().getReferenceOwner().toLightweightTypeReference(typeArgument));
		}
		return result;
	}
	
	/* @Nullable */
	protected XExpression getSyntacticReceiver() {
		return new FeatureLinkHelper().getSyntacticReceiver(getFeatureCall());
	}

}
