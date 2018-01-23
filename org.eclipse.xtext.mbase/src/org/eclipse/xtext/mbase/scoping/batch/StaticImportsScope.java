/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.List;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;

/**
 * A scope for the statically imported features.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class StaticImportsScope extends AbstractStaticImportsScope {
	
	public StaticImportsScope(IScope parent, IFeatureScopeSession session, XAbstractFeatureCall context) {
		super(parent, session, context, null);
	}

	@Override
	protected List<TypeBucket> getBuckets() {
		return getSession().getStaticallyImportedTypes();
	}
	
	@Override
	protected BucketedEObjectDescription createDescription(QualifiedName name, JvmFeature feature, TypeBucket bucket) {
		return new StaticFeatureDescription(name, feature, bucket.getId(), getSession().isVisible(feature));
	}
	
	
}
