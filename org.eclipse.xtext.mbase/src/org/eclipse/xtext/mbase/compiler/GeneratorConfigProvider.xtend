/** 
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler

import com.google.inject.Inject
import com.google.inject.name.Named
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.Constants
import org.eclipse.xtext.util.internal.EmfAdaptable

/** 
 * @author Holger Schill - Initial contribution and API
 * @author Moritz Eysholdt - introduced adapter
 */
class GeneratorConfigProvider implements IGeneratorConfigProvider {
	
	@EmfAdaptable public static class GeneratorConfigAdapter {
		@Accessors val Map<String, GeneratorConfig> language2GeneratorConfig = newHashMap()
	}
	
	@Inject @Named(Constants.LANGUAGE_NAME) String languageId

	def GeneratorConfig install(ResourceSet resourceSet, GeneratorConfig config) {
		val adapter = GeneratorConfigAdapter.findInEmfObject(resourceSet) 
					  ?: 
					  (new GeneratorConfigAdapter() => [ attachToEmfObject(resourceSet) ])
		return adapter.language2GeneratorConfig.put(languageId, config)
	}

	override GeneratorConfig get(EObject context) {
		val resourceSet = context?.eResource?.resourceSet
		if (resourceSet !== null) {
			val adapter = GeneratorConfigAdapter.findInEmfObject(resourceSet)
			if (adapter !== null && adapter.language2GeneratorConfig.containsKey(languageId)) {
				return adapter.language2GeneratorConfig.get(languageId)
			}
		}
		return new GeneratorConfig
	}
}
