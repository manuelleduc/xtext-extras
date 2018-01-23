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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.MbasePackage;
import org.eclipse.xtext.mbase.typesystem.computation.IConstructorLinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

import com.google.common.collect.Lists;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class UnresolvableConstructorCall extends AbstractUnresolvableReferenceWithNode implements IConstructorLinkingCandidate {

	public UnresolvableConstructorCall(XConstructorCall constructorCall, INode node, String text, ExpressionTypeComputationState state) {
		super(constructorCall, node, text, state);
	}
	
	@Override
	public JvmConstructor getConstructor() {
		throw new UnsupportedOperationException("TODO return some error feature that is compatible to everything");
	}
	
	@Override
	public boolean isAnonymousClassConstructorCall() {
		return false;
	}
	
	@Override
	public XConstructorCall getConstructorCall() {
		return (XConstructorCall) getExpression();
	}
	
	@Override
	protected List<XExpression> getArguments() {
		return getConstructorCall().getArguments();
	}
	
	@Override
	public EReference getReference() {
		return MbasePackage.Literals.XCONSTRUCTOR_CALL__CONSTRUCTOR;
	}
	
	@Override
	public List<LightweightTypeReference> getTypeArguments() {
		XConstructorCall constructorCall = getConstructorCall();
		List<JvmTypeReference> typeArguments = constructorCall.getTypeArguments();
		if (typeArguments.isEmpty())
			return Collections.emptyList();
		List<LightweightTypeReference> result = Lists.newArrayList();
		for(JvmTypeReference typeArgument: typeArguments) {
			result.add(getState().getReferenceOwner().toLightweightTypeReference(typeArgument));
		}
		return result;
	}
	
}
