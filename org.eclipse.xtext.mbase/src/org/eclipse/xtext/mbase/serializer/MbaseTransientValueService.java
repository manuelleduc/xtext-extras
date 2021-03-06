/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class MbaseTransientValueService extends LegacyTransientValueService {

	@Override
	public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {
		if (feature == TypesPackage.Literals.JVM_SPECIALIZED_TYPE_REFERENCE__EQUIVALENT) {
			return ValueTransient.YES;
		}
		return super.isValueTransient(semanticObject, feature);
	}
}
