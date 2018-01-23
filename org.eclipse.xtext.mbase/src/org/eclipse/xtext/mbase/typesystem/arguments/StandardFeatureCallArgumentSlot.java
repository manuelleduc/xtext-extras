/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.arguments;

import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class StandardFeatureCallArgumentSlot implements IFeatureCallArgumentSlot {

	protected final StandardFeatureCallArguments parent;
	protected final int idx;

	protected StandardFeatureCallArgumentSlot(StandardFeatureCallArguments parent, int idx) {
		this.parent = parent;
		this.idx = idx;
	}
	
	@Override
	public boolean isVarArg() {
		return false;
	}

	@Override
	public boolean isSuperfluous() {
		return false;
	}

	@Override
	public List<XExpression> getArgumentExpressions() {
		return Collections.singletonList(getArgumentExpression());
	}

	/* @Nullable */
	@Override
	public XExpression getArgumentExpression() {
		return parent.internalGetArgument(idx);
	}

	/* @Nullable */
	@Override
	public LightweightTypeReference getDeclaredType() {
		return parent.internalGetParameterType(idx);
	}

	@Override
	public void markProcessed() {
		parent.markProcessed(idx);
	}
	
	@Override
	public String toString() {
		return String.format("%s @ %d for %s", getClass().getSimpleName(), idx, getArgumentExpressions());
	}

}
