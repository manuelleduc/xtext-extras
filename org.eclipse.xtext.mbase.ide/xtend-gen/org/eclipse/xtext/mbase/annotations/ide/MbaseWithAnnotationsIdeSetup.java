/**
 * Copyright (c) 2010-2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.annotations.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.mbase.annotations.MbaseWithAnnotationsRuntimeModule;
import org.eclipse.xtext.mbase.annotations.MbaseWithAnnotationsStandaloneSetup;
import org.eclipse.xtext.mbase.annotations.ide.MbaseWithAnnotationsIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MbaseWithAnnotationsIdeSetup extends MbaseWithAnnotationsStandaloneSetup {
  @Override
  public Injector createInjector() {
    MbaseWithAnnotationsRuntimeModule _mbaseWithAnnotationsRuntimeModule = new MbaseWithAnnotationsRuntimeModule();
    MbaseWithAnnotationsIdeModule _mbaseWithAnnotationsIdeModule = new MbaseWithAnnotationsIdeModule();
    return Guice.createInjector(Modules2.mixin(_mbaseWithAnnotationsRuntimeModule, _mbaseWithAnnotationsIdeModule));
  }
}
