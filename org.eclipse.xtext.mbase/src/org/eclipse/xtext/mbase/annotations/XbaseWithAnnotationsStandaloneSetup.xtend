/** 
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.annotations

import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotationsPackage
import com.google.inject.Injector

/** 
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
class mbaseWithAnnotationsStandaloneSetup extends MbaseWithAnnotationsStandaloneSetupGenerated {

	def static void doSetup() {
		new mbaseWithAnnotationsStandaloneSetup().createInjectorAndDoEMFRegistration()
	}

	override Injector createInjectorAndDoEMFRegistration() {
		EPackage.Registry.INSTANCE.put(XAnnotationsPackage.eINSTANCE.getNsURI(), XAnnotationsPackage.eINSTANCE)
		return super.createInjectorAndDoEMFRegistration()
	}
}
