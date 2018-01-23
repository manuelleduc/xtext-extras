/*******************************************************************************
 * Copyright (c) 2010-2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
 package org.eclipse.xtext.mbase.annotations.ide

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import org.eclipse.xtext.mbase.annotations.MbaseWithAnnotationsRuntimeModule
import org.eclipse.xtext.mbase.annotations.mbaseWithAnnotationsStandaloneSetup

/** 
 * Initialization support for running Xtext languages as language servers.
 */
class MbaseWithAnnotationsIdeSetup extends mbaseWithAnnotationsStandaloneSetup {
	override Injector createInjector() {
		return Guice.createInjector(
			Modules2.mixin(new MbaseWithAnnotationsRuntimeModule(), new MbaseWithAnnotationsIdeModule()))
	}
}
