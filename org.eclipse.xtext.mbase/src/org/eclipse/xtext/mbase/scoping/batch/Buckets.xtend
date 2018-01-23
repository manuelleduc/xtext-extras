/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.scoping.batch

import java.util.List
import java.util.Map
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.mbase.XExpression
import org.eclipse.xtext.mbase.typesystem.^override.IResolvedFeatures
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference
import java.util.Set
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceFlags

/**
 * A type bucket collects a number of types that originate in the 
 * very same source, e.g. all imported types are contained in the 
 * same bucket where all types that are available via wildcard imports
 * are contained in a different bucket.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Data
class TypeBucket {
	int id
	List<? extends JvmType> types
	IResolvedFeatures.Provider resolvedFeaturesProvider
	def getFlags() {
		return ConformanceFlags.CHECKED_SUCCESS
	}
	def Map<? extends JvmType, ? extends Set<String>> getTypesToNames() {
		return emptyMap
	}
	def boolean isRestrictingNames() {
		return false;
	}
}

/**
 * A type bucket that 'exports' only a subset of all named features of 
 * the contained types.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Data
class TypeWithRestrictedNamesBucket extends TypeBucket {
	Map<? extends JvmType, ? extends Set<String>> typesToNames
	new(int id, Map<? extends JvmType, ? extends Set<String>> types, IResolvedFeatures.Provider resolvedFeaturesProvider) {
		super(id, null, resolvedFeaturesProvider)
		this.typesToNames = types
	}
	override isRestrictingNames() {
		return true
	}
	override getTypes() {
		return new ArrayList(typesToNames.keySet)
	}
}

/**
 * A type bucket collects a number of types that originate in the 
 * very same source, e.g. all imported types are contained in the 
 * same bucket where all types that are available via wildcard imports
 * are contained in a different bucket.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Data
class ExpressionBucket {
    int id
    Map<XExpression, LightweightTypeReference> extensionProviders
    IResolvedFeatures.Provider resolvedFeaturesProvider
}

/**
 * A type bucket that was produced from the synonym of a type.
 * It tracks the conformance flags for a synonym, e.g. boxing or unboxing information.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Data
class SynonymTypeBucket extends TypeBucket {
	int flags
}

/**
 * A type bucket collects a number of types that originate in the 
 * very same source, e.g. all implicit receiver types are contained
 * in the very same bucket.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Data
class TypeReferenceBucket {
	int id
	List<JvmTypeReference> types
}