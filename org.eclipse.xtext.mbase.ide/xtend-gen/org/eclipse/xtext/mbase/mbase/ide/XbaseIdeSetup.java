/**
 * Copyright (c) 2010-2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.mbase.mbaseRuntimeModule;
import org.eclipse.xtext.mbase.mbaseStandaloneSetup;
import org.eclipse.xtext.mbase.ide.mbaseIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class mbaseIdeSetup extends mbaseStandaloneSetup {
  @Override
  public Injector createInjector() {
    mbaseRuntimeModule _mbaseRuntimeModule = new mbaseRuntimeModule();
    mbaseIdeModule _mbaseIdeModule = new mbaseIdeModule();
    return Guice.createInjector(Modules2.mixin(_mbaseRuntimeModule, _mbaseIdeModule));
  }
}
