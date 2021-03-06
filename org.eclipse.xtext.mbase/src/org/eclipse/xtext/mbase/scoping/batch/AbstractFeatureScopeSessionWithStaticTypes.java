/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.List;

import org.eclipse.xtext.mbase.typesystem.override.IResolvedFeatures;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
abstract class AbstractFeatureScopeSessionWithStaticTypes<T> extends AbstractNestedFeatureScopeSession {

	private final T staticFeatureProviders;
	private final T extensionProviders;
	
	private List<TypeBucket> staticallyImportedTypes;
	private List<TypeBucket> staticallyImportedExtensions;
	private IResolvedFeatures.Provider resolvedFeaturesProvider;

	public AbstractFeatureScopeSessionWithStaticTypes(AbstractFeatureScopeSession featureScopeSession,
			T staticFeatureProviders,
			T extensionProviders,
			IResolvedFeatures.Provider resolvedFeaturesProvider) {
		super(featureScopeSession);
		this.staticFeatureProviders = staticFeatureProviders;
		this.extensionProviders = extensionProviders;
		this.resolvedFeaturesProvider = resolvedFeaturesProvider;
	}
	
	@Override
	public List<TypeBucket> getStaticallyImportedTypes() {
		if (staticallyImportedTypes != null)
			return staticallyImportedTypes;
		return staticallyImportedTypes = concatTypeBuckets(staticFeatureProviders, super.getStaticallyImportedTypes(), resolvedFeaturesProvider);
	}
	
	@Override
	public List<TypeBucket> getStaticallyImportedExtensionTypes() {
		if (staticallyImportedExtensions != null)
			return staticallyImportedExtensions;
		return staticallyImportedExtensions = concatTypeBuckets(extensionProviders, super.getStaticallyImportedExtensionTypes(), resolvedFeaturesProvider);
	}

	protected abstract List<TypeBucket> concatTypeBuckets(T types, List<TypeBucket> parentResult, IResolvedFeatures.Provider resolvedFeaturesProvider);

}

