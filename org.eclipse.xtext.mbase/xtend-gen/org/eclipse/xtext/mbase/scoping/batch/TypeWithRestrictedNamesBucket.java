/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.mbase.scoping.batch.TypeBucket;
import org.eclipse.xtext.mbase.typesystem.override.IResolvedFeatures;

/**
 * A type bucket that 'exports' only a subset of all named features of
 * the contained types.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class TypeWithRestrictedNamesBucket extends TypeBucket {
  private /* Map<? extends JvmType, ? extends Set<String>> */Object typesToNames;
  
  public TypeWithRestrictedNamesBucket(final int id, final /* Map<? extends JvmType, ? extends Set<String>> */Object types, final IResolvedFeatures.Provider resolvedFeaturesProvider) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor TypeBucket() is not applicable for the arguments (int,null,Provider)"
      + "\nThe field TypeWithRestrictedNamesBucket.typesToNames refers to the missing type JvmType");
  }
  
  @Override
  public boolean isRestrictingNames() {
    return true;
  }
  
  @Override
  public /* ArrayList<JvmType> */Object getTypes() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field TypeWithRestrictedNamesBucket.typesToNames refers to the missing type JvmType");
  }
}
