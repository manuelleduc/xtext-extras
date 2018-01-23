/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.List;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.scoping.featurecalls.OperatorMapping;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractStaticOrInstanceFeatureScope extends AbstractSessionBasedExecutableScope {

	protected AbstractStaticOrInstanceFeatureScope(IScope parent, IFeatureScopeSession session, XAbstractFeatureCall featureCall, OperatorMapping operatorMapping) {
		super(parent, session, featureCall, operatorMapping);
	}
	
	protected void addDescriptions(JvmFeature feature, List<IEObjectDescription> result) {
		String simpleName = feature.getSimpleName();
		QualifiedName featureName = QualifiedName.create(simpleName);
		addDescription(featureName, feature, result);
		QualifiedName operator = getOperatorMapping().getOperator(featureName);
		if (operator != null) {
			addDescription(operator, feature, result);
			QualifiedName compoundOperator = getOperatorMapping().getCompoundOperator(operator);
			if (compoundOperator != null) {
				addDescription(compoundOperator, feature, result);	
			}
		}
		String propertyName = toProperty(simpleName, feature);
		if (propertyName != null) {
			addDescription(QualifiedName.create(propertyName), feature, result);	
		}
	}

	protected abstract void addDescription(QualifiedName name, JvmFeature feature, List<IEObjectDescription> result);
	
}
