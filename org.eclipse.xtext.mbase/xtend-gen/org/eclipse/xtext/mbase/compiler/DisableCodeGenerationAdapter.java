/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler;

@SuppressWarnings("all")
public class DisableCodeGenerationAdapter /* implements AdapterImpl  */{
  @Override
  public Object isAdapterForType(final Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getClass is undefined"
      + "\n== cannot be resolved");
  }
  
  public static boolean isDisabled(final /* JvmDeclaredType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getAdapter(JvmDeclaredType) from the type DisableCodeGenerationAdapter refers to the missing type Object"
      + "\n!== cannot be resolved");
  }
  
  public static void disableCodeGeneration(final /* JvmDeclaredType */Object declaredType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getAdapter(JvmDeclaredType) from the type DisableCodeGenerationAdapter refers to the missing type Object"
      + "\n=== cannot be resolved"
      + "\neAdapters cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public static void enableCodeGeneration(final /* JvmDeclaredType */Object declaredType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getAdapter(JvmDeclaredType) from the type DisableCodeGenerationAdapter refers to the missing type Object"
      + "\n!== cannot be resolved"
      + "\neAdapters cannot be resolved"
      + "\nremove cannot be resolved");
  }
  
  private static Object getAdapter(final /* JvmDeclaredType */Object declaredType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field EcoreUtil is undefined"
      + "\ngetAdapter cannot be resolved"
      + "\neAdapters cannot be resolved");
  }
}
