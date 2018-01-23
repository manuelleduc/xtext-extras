/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.List;

/**
 * A type bucket collects a number of types that originate in the
 * very same source, e.g. all implicit receiver types are contained
 * in the very same bucket.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Data */@SuppressWarnings("all")
public class TypeReferenceBucket {
  private int id;
  
  private /* List<JvmTypeReference> */Object types;
}
