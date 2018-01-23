/**
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase;

import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.mbase.mbasePackage;
import org.eclipse.xtext.mbase.mbaseStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 * @since 2.7
 */
@SuppressWarnings("all")
public class mbaseStandaloneSetup extends mbaseStandaloneSetupGenerated {
  public static void doSetup() {
    new mbaseStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    EPackage.Registry.INSTANCE.put(mbasePackage.eINSTANCE.getNsURI(), mbasePackage.eINSTANCE);
    return super.createInjectorAndDoEMFRegistration();
  }
}
