/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.references;

/**
 * Functional interface that is used to initialize newly created type references
 * from {@link ITypeReferenceOwner#newReferenceTo(Class, TypeReferenceInitializer)}.
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public interface TypeReferenceInitializer<Ref extends LightweightTypeReference> {

	/**
	 * Enhance the given reference and return itself or a wrapper around it, e.g.
	 * a newly created wildcard.
	 */
	LightweightTypeReference enhance(Ref reference);
	
}
