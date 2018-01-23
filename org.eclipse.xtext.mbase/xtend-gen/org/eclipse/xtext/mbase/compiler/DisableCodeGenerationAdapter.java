/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler;

import com.google.common.base.Objects;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmDeclaredType;

@SuppressWarnings("all")
public class DisableCodeGenerationAdapter extends AdapterImpl {
  @Override
  public boolean isAdapterForType(final Object type) {
    Class<? extends DisableCodeGenerationAdapter> _class = this.getClass();
    return Objects.equal(_class, type);
  }
  
  public static boolean isDisabled(final JvmDeclaredType type) {
    Adapter _adapter = DisableCodeGenerationAdapter.getAdapter(type);
    return (_adapter != null);
  }
  
  public static void disableCodeGeneration(final JvmDeclaredType declaredType) {
    Adapter _adapter = DisableCodeGenerationAdapter.getAdapter(declaredType);
    boolean _tripleEquals = (_adapter == null);
    if (_tripleEquals) {
      EList<Adapter> _eAdapters = declaredType.eAdapters();
      DisableCodeGenerationAdapter _disableCodeGenerationAdapter = new DisableCodeGenerationAdapter();
      _eAdapters.add(_disableCodeGenerationAdapter);
    }
  }
  
  public static void enableCodeGeneration(final JvmDeclaredType declaredType) {
    final Adapter adapter = DisableCodeGenerationAdapter.getAdapter(declaredType);
    if ((adapter != null)) {
      declaredType.eAdapters().remove(adapter);
    }
  }
  
  private static Adapter getAdapter(final JvmDeclaredType declaredType) {
    return EcoreUtil.getAdapter(declaredType.eAdapters(), DisableCodeGenerationAdapter.class);
  }
}
