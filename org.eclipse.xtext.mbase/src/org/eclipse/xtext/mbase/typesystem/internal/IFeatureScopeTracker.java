/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.mbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.mbase.typesystem.IExpressionScope;
import org.eclipse.xtext.mbase.typesystem.IExpressionScope.Anchor;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;

import com.google.inject.ImplementedBy;

/**
 * Externalized tracking logic for feature scopes that are created during batch linking.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public interface IFeatureScopeTracker {

	/**
	 * Allows to obtain a {@link IFeatureScopeTracker} for a given context.
	 * 
	 * @author Sebastian Zarnekow - Initial contribution and API
	 */
	@ImplementedBy(NullFeatureScopeTrackerProvider.class)
	interface Provider {
		/**
		 * Provide a tracker for the given root object of a batch resolution.
		 * @param root the context information to deduce the right tracking logic from.
		 */
		IFeatureScopeTracker track(EObject root);
	}
	
	/**
	 * @see IResolvedTypes#getExpressionScope(EObject, Anchor)
	 */
	IExpressionScope getExpressionScope(EObject context, IExpressionScope.Anchor anchor);

	/**
	 * @see IResolvedTypes#hasExpressionScope(EObject, Anchor)
	 */
	boolean hasExpressionScope(EObject context, IExpressionScope.Anchor anchor);
	
	/**
	 * Stores the given information about the current scope.
	 */
	void addExpressionScope(ResolvedTypes current, EObject context, IFeatureScopeSession session, IExpressionScope.Anchor anchor);
	
	/**
	 * Replace previously recorded information about the current scope.
	 */
	void replacePreviousExpressionScope(EObject context, IFeatureScopeSession session, IExpressionScope.Anchor anchor);

	IFeatureScopeTracker NULL = new IFeatureScopeTracker() {

		@Override
		public IExpressionScope getExpressionScope(EObject context, Anchor anchor) {
			throw new UnsupportedOperationException("The resource '"+context.eResource().getURI()+"' has been loaded without tracking the feature scope. Please check the implementation of IFeatureScopeTracker.Provider.");
		}

		@Override
		public boolean hasExpressionScope(EObject context, Anchor anchor) {
			throw new UnsupportedOperationException("The resource '"+context.eResource().getURI()+"' has been loaded without tracking the feature scope. Please check the implementation of IFeatureScopeTracker.Provider.");
		}

		@Override
		public void addExpressionScope(ResolvedTypes current, EObject context, IFeatureScopeSession session, Anchor anchor) {
		}

		@Override
		public void replacePreviousExpressionScope(EObject context, IFeatureScopeSession session, Anchor anchor) {
		}
		
	};
	
	
}
