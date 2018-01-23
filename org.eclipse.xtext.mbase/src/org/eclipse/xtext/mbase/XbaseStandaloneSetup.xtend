/** 
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase

import org.eclipse.emf.ecore.EPackage
import com.google.inject.Injector

/** 
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 * @since 2.7
 */
class mbaseStandaloneSetup extends mbaseStandaloneSetupGenerated {

	def static void doSetup() {
		new mbaseStandaloneSetup().createInjectorAndDoEMFRegistration()
	}

	override Injector createInjectorAndDoEMFRegistration() {
		EPackage.Registry.INSTANCE.put(mbasePackage.eINSTANCE.getNsURI(), mbasePackage.eINSTANCE)
		return super.createInjectorAndDoEMFRegistration()
	}
}
