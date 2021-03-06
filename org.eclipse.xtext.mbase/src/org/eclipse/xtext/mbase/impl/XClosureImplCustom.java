/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.mbase.MbasePackage;
import org.eclipse.xtext.mbase.resource.BatchLinkableResource;
import com.google.common.base.Joiner;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class XClosureImplCustom extends XClosureImpl {

	private boolean linked;

	@Override
	public String toString() {
		String expressionAsString = Strings.emptyIfNull(expression == null ? null : expression.toString());
		if (isExplicitSyntax()) {
			return String.format("[%s | %s ]", Joiner.on(", ").join(getFormalParameters()), expressionAsString);
		} else {
			return String.format("[ %s ]", expressionAsString);
		}
	}
	
	@Override
	public EList<JvmFormalParameter> getFormalParameters() {
		if (isExplicitSyntax()) {
			return getDeclaredFormalParameters();
		}
		ensureLinked();
		return getImplicitFormalParameters();
	}

	private void ensureLinked() {
		if (!linked) {
			Resource resource = eResource();
			if (resource != null) {
				if (resource instanceof BatchLinkableResource) {
					((BatchLinkableResource) resource).resolveLazyCrossReferences(null);
				} else {
					EcoreUtil.resolveAll(resource);
				}
				linked = true;
			}
		}
	}
	
	public void setLinked(boolean linked) {
		this.linked = linked;
	}

	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case MbasePackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
				linked = false;
				getDeclaredFormalParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

}
