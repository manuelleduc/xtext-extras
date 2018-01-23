/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.scoping.batch;

import org.eclipse.xtext.mbase.scoping.batch.TypeBucket;

/**
 * A type bucket that was produced from the synonym of a type.
 * It tracks the conformance flags for a synonym, e.g. boxing or unboxing information.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class SynonymTypeBucket extends TypeBucket {
  private int flags;
}
