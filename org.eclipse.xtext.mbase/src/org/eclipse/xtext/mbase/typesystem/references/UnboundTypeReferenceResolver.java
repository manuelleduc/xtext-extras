/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.references;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.mbase.typesystem.util.AbstractReentrantTypeReferenceProvider;
import org.eclipse.xtext.xtype.impl.XComputedTypeReferenceImplCustom;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class UnboundTypeReferenceResolver extends AbstractReentrantTypeReferenceProvider {
	private UnboundTypeReference unboundTypeReference;

	public UnboundTypeReferenceResolver(UnboundTypeReference unboundTypeReference) {
		this.unboundTypeReference = unboundTypeReference;
	}

	@Override
	protected JvmTypeReference doGetTypeReference(XComputedTypeReferenceImplCustom context) {
		LightweightTypeReference resolvedTo = unboundTypeReference.resolve();
		return resolvedTo.toTypeReference();
	}
	
	public UnboundTypeReference getUnboundTypeReference() {
		return unboundTypeReference;
	}
}