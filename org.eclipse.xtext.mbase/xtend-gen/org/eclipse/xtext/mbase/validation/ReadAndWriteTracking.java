/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.validation;

import java.util.Set;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public class ReadAndWriteTracking {
  protected static class InitializedMarker /* implements AdapterImpl  */{
    private /* Set<JvmConstructor> */Object byConstructors /* Skipped initializer because of errors */;
    
    public boolean isInitialized(final /* JvmConstructor */Object constructor) {
      throw new Error("Unresolved compilation problems:"
        + "\nThe field ReadAndWriteTracking.InitializedMarker.byConstructors refers to the missing type JvmConstructor");
    }
    
    public boolean markInitialized(final /* JvmConstructor */Object constructor) {
      throw new Error("Unresolved compilation problems:"
        + "\nThe field ReadAndWriteTracking.InitializedMarker.byConstructors refers to the missing type JvmConstructor");
    }
  }
  
  public Object markReadAccess(final /* EObject */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method isRead(EObject) from the type ReadAndWriteTracking refers to the missing type Object"
      + "\nThe field ReadAndWriteTracking.READMARKER refers to the missing type Object"
      + "\n! cannot be resolved"
      + "\neAdapters cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public Object isRead(final /* EObject */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ReadAndWriteTracking.READMARKER refers to the missing type Object"
      + "\neAdapters cannot be resolved"
      + "\ncontains cannot be resolved");
  }
  
  private final static Object READMARKER /* Skipped initializer because of errors */;
  
  public Object markInitialized(final /* EObject */Object it, final /* JvmConstructor */Object constructor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getInitializedMarker(EObject) from the type ReadAndWriteTracking refers to the missing type Object"
      + "\nThe method newInitalizedMarker(EObject) from the type ReadAndWriteTracking refers to the missing type EObject"
      + "\n?: cannot be resolved"
      + "\nmarkInitialized cannot be resolved");
  }
  
  public Object isInitialized(final /* EObject */Object it, final /* JvmConstructor */Object constructor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getInitializedMarker(EObject) from the type ReadAndWriteTracking refers to the missing type Object"
      + "\nisInitialized cannot be resolved");
  }
  
  protected ReadAndWriteTracking.InitializedMarker newInitalizedMarker(final /* EObject */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eAdapters is undefined"
      + "\nadd cannot be resolved");
  }
  
  protected Object getInitializedMarker(final /* EObject */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\neAdapters cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nhead cannot be resolved");
  }
}
