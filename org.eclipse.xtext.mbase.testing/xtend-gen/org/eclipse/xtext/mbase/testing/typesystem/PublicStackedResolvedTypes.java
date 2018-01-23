/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.testing.typesystem;

import org.eclipse.xtext.mbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.internal.StackedResolvedTypes;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class PublicStackedResolvedTypes extends StackedResolvedTypes {
  public PublicStackedResolvedTypes(final ResolvedTypes parent) {
    super(parent);
  }
}
