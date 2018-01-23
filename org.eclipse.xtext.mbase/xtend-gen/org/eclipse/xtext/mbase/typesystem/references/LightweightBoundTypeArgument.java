/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.references;

import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.util.BoundTypeArgumentSource;
import org.eclipse.xtext.mbase.typesystem.util.VarianceInfo;

/**
 * Encapsulates the information that is collected as a type hint to later resolve an
 * unbound type reference.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class LightweightBoundTypeArgument {
  private LightweightTypeReference typeReference;
  
  private BoundTypeArgumentSource source;
  
  private Object origin;
  
  private VarianceInfo declaredVariance;
  
  private VarianceInfo actualVariance;
  
  public Object isValidVariancePair() {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved.");
  }
}
