/**
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase;

import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.mbase.AbstractMbaseRuntimeModule;
import org.eclipse.xtext.mbase.formatting.MbaseFormatter;

/**
 * Use this class to register components to be used without the IDE.
 * @noreference This class is not intended to be referenced by clients.
 * @since 2.7
 */
@SuppressWarnings("all")
public class MbaseRuntimeModule extends AbstractMbaseRuntimeModule {
  @Deprecated
  @Override
  public Class<? extends IFormatter> bindIFormatter() {
    return MbaseFormatter.class;
  }
}
