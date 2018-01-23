/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.Map;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.override.IResolvedFeatures;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * A type bucket collects a number of types that originate in the
 * very same source, e.g. all imported types are contained in the
 * same bucket where all types that are available via wildcard imports
 * are contained in a different bucket.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class ExpressionBucket {
  private int id;
  
  private Map<XExpression, LightweightTypeReference> extensionProviders;
  
  private IResolvedFeatures.Provider resolvedFeaturesProvider;
}
