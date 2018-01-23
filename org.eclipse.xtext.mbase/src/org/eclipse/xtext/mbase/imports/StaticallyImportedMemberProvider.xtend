/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.imports

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmFeature
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.mbase.typesystem.^override.IResolvedFeatures
import org.eclipse.xtext.mbase.typesystem.util.ContextualVisibilityHelper
import org.eclipse.xtext.mbase.typesystem.util.IVisibilityHelper
import org.eclipse.xtext.common.types.JvmDeclaredType

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
class StaticallyImportedMemberProvider {

	@Inject
	extension IImportsConfiguration
	
	@Inject
	extension IResolvedFeatures.Provider

	@Inject
	IVisibilityHelper visibilityHelper


	def getAllFeatures(Resource resource, JvmDeclaredType importedType, boolean ^static, boolean ^extension, String memberName) {
		if (!static || importedType === null) {
			return <JvmFeature>emptyList
		}
		val visibilityHelper = resource.visibilityHelper
		val resolvedFeatures = importedType.resolvedFeatures
		resolvedFeatures.getAllFeatures(memberName).filter [ feature |
			feature.static && visibilityHelper.isVisible(feature) 
		]
	}

	def getVisibilityHelper(Resource resource) {
		switch resource {
			XtextResource: {
				val packageName = resource.packageName
				if (packageName === null) {
					visibilityHelper
				} else {
					new ContextualVisibilityHelper(visibilityHelper, packageName)
				}
			}
			default:
				visibilityHelper
		}
	}

}
