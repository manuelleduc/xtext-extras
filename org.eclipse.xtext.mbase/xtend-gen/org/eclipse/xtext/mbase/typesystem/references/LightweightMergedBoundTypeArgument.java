/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.references;

import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.util.VarianceInfo;

/**
 * The result of a merge operation where different type bound type arguments are incorporated into
 * a result.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class LightweightMergedBoundTypeArgument {
  private LightweightTypeReference typeReference;
  
  private VarianceInfo variance;
}
