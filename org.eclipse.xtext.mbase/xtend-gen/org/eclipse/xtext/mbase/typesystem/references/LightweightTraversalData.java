/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.references;

import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.mbase.typesystem.references.LightweightMergedBoundTypeArgument;

/**
 * Small utility data structure to carry around in the type reference visitors.
 * May help to guard against infinite recursion and to collect type parameter data.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class LightweightTraversalData {
  private /* Set<JvmType> */Object visited /* Skipped initializer because of errors */;
  
  private /* Map<JvmTypeParameter, LightweightMergedBoundTypeArgument> */Object typeParameterMapping /* Skipped initializer because of errors */;
}
