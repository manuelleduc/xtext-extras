/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.imports;

import java.util.Set;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;

/**
 * @author dhuebner - Initial contribution and API
 */
@SuppressWarnings("all")
public interface ImportsAcceptor {
  /* @Accessors(/* name is null */./* name is null */)
   */public static class DefaultImportsAcceptor implements ImportsAcceptor {
    private Set<String> types /* Skipped initializer because of errors */;
    
    private Set<String> staticImport /* Skipped initializer because of errors */;
    
    private Set<String> extensions /* Skipped initializer because of errors */;
    
    @Override
    public void acceptTypeImport(final /* JvmType */Object typeImport) {
      throw new Error("Unresolved compilation problems:"
        + "\nqualifiedNameWithout$ cannot be resolved");
    }
    
    @Override
    public void acceptStaticImport(final XAbstractFeatureCall statImport) {
      throw new Error("Unresolved compilation problems:"
        + "\nThe method or field feature is undefined for the type XAbstractFeatureCall"
        + "\nqualifiedNameWithout$ cannot be resolved");
    }
    
    @Override
    public void acceptStaticExtensionImport(final XAbstractFeatureCall extImport) {
      throw new Error("Unresolved compilation problems:"
        + "\nThe method or field feature is undefined for the type XAbstractFeatureCall"
        + "\nqualifiedNameWithout$ cannot be resolved");
    }
    
    private String qualifiedNameWithout$(final /* JvmIdentifiableElement */Object ele) {
      throw new Error("Unresolved compilation problems:"
        + "\ngetQualifiedName cannot be resolved");
    }
  }
  
  public abstract void acceptTypeImport(final /* JvmType */Object typeImport);
  
  public abstract void acceptStaticImport(final XAbstractFeatureCall staticImport);
  
  public abstract void acceptStaticExtensionImport(final XAbstractFeatureCall staticExtImport);
}
