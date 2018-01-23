/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.legacy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.util.CommonTypeComputationServices;

/**
 * Plain instantiable implementation of the {@link ITypeReferenceOwner}.
 * It is not capable of handling reference resolution or unbound type argument hints.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @deprecated use org.eclipse.xtext.mbase.typesystem.references.StandardTypeReferenceOwner instead.
 */
@Deprecated
public class StandardTypeReferenceOwner extends org.eclipse.xtext.mbase.typesystem.references.StandardTypeReferenceOwner {

	public StandardTypeReferenceOwner(CommonTypeComputationServices services, EObject context) {
		super(services, context);
	}

	public StandardTypeReferenceOwner(CommonTypeComputationServices services, Resource context) {
		super(services, context);
	}

	public StandardTypeReferenceOwner(CommonTypeComputationServices services, ResourceSet context) {
		super(services, context);
	}

}