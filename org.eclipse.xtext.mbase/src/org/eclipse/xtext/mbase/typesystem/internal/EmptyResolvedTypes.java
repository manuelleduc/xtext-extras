/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.mbase.scoping.batch.FeatureScopes;
import org.eclipse.xtext.mbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.mbase.typesystem.IExpressionScope;
import org.eclipse.xtext.mbase.typesystem.IExpressionScope.Anchor;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class EmptyResolvedTypes extends ForwardingResolvedTypes {

	private final FeatureScopes featureScopes;
	private final IFeatureScopeSession session;
	private final ITypeReferenceOwner owner;

	public EmptyResolvedTypes(IFeatureScopeSession session, FeatureScopes featureScopes, ITypeReferenceOwner owner) {
		this.session = session;
		this.featureScopes = featureScopes;
		this.owner = owner;
	}
	
	@Override
	protected IResolvedTypes delegate() {
		return IResolvedTypes.NULL;
	}
	
	@Override
	public IExpressionScope getExpressionScope(EObject context, Anchor anchor) {
		ExpressionScope result = new ExpressionScope(featureScopes, context, anchor, owner);
		result.addData(session, this);
		return result;
	}

}
