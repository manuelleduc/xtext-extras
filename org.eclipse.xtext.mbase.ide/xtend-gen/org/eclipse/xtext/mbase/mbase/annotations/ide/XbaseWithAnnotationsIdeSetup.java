/**
 * Copyright (c) 2010-2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.annotations.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.mbase.annotations.mbaseWithAnnotationsRuntimeModule;
import org.eclipse.xtext.mbase.annotations.mbaseWithAnnotationsStandaloneSetup;
import org.eclipse.xtext.mbase.annotations.ide.mbaseWithAnnotationsIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class mbaseWithAnnotationsIdeSetup extends mbaseWithAnnotationsStandaloneSetup {
  @Override
  public Injector createInjector() {
    mbaseWithAnnotationsRuntimeModule _mbaseWithAnnotationsRuntimeModule = new mbaseWithAnnotationsRuntimeModule();
    mbaseWithAnnotationsIdeModule _mbaseWithAnnotationsIdeModule = new mbaseWithAnnotationsIdeModule();
    return Guice.createInjector(
      Modules2.mixin(_mbaseWithAnnotationsRuntimeModule, _mbaseWithAnnotationsIdeModule));
  }
}
