/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.util

import com.google.inject.Inject
import java.util.Collection
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.mbase.typesystem.util.CommonTypeComputationServices

import static org.eclipse.xtext.mbase.typesystem.conformance.RawTypeConformanceComputer.*

/**
 * Small utilitiy class that allows to check whether a given type was already handled in a chain
 * of instanceof checks, e.g to validate catch-clauses or switch expressions.
 * 
 * @author Anton Kosyakov - Initial contribution and API
 */
class TypesOrderUtil {

	@Inject
	CommonTypeComputationServices services

	def boolean isHandled(LightweightTypeReference actualTypeReference, Collection<LightweightTypeReference> collection) {
		for (previousTypeReference : collection) {
			if (isHandled(actualTypeReference, previousTypeReference)) {
				return true
			}
		}
		false
	}

	def boolean isHandled(LightweightTypeReference actualTypeReference, LightweightTypeReference previousTypeReference) {
		extension val typeConformanceComputer = services.typeConformanceComputer
		val conformant = previousTypeReference.isConformant(actualTypeReference,
			ALLOW_BOXING_UNBOXING.bitwiseOr(ALLOW_PRIMITIVE_WIDENING).bitwiseOr(ALLOW_RAW_TYPE_CONVERSION))
		conformant.bitwiseAnd(SUCCESS) != 0
	}

}
