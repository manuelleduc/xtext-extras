/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceFlags;
import org.eclipse.xtext.mbase.typesystem.override.IResolvedFeatures;

/**
 * A type bucket collects a number of types that originate in the
 * very same source, e.g. all imported types are contained in the
 * same bucket where all types that are available via wildcard imports
 * are contained in a different bucket.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class TypeBucket {
  private int id;
  
  private /* List<? extends JvmType> */Object types;
  
  private IResolvedFeatures.Provider resolvedFeaturesProvider;
  
  public int getFlags() {
    return ConformanceFlags.CHECKED_SUCCESS;
  }
  
  public /* Map<? extends JvmType, ? extends Set<String>> */Object getTypesToNames() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field emptyMap is undefined");
  }
  
  public boolean isRestrictingNames() {
    return false;
  }
}
