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
import java.util.NoSuchElementException;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class AssignmentFeatureCallArguments implements IFeatureCallArguments, IFeatureCallArgumentSlot {

	private XExpression expression;
	private LightweightTypeReference type;
	private boolean processed = false;
	
	public AssignmentFeatureCallArguments(XExpression expression, /* @Nullable */ LightweightTypeReference type) {
		this.expression = expression;
		this.type = type;
	}
	
	@Override
	public boolean hasUnprocessedArguments() {
		return !processed;
	}

	@Override
	public IFeatureCallArgumentSlot getNextUnprocessedArgumentSlot() {
		if (hasUnprocessedArguments())
			return this;
		throw new NoSuchElementException();
	}

	@Override
	public XExpression getArgument(int idx) {
		return expression;
	}
	
	@Override
	public LightweightTypeReference getDeclaredTypeForLambda(int idx) {
		return type;
	}

	@Override
	public int getArgumentCount() {
		return 1;
	}

	@Override
	public boolean isProcessed(int argumentIndex) {
		return processed;
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
		return Collections.singletonList(expression);
	}

	@Override
	public XExpression getArgumentExpression() {
		return expression;
	}

	/* @Nullable */
	@Override
	public LightweightTypeReference getDeclaredType() {
		return type;
	}

	@Override
	public void markProcessed() {
		this.processed = true;
	}
	
	@Override
	public boolean hasEmptyTrailingVarArg() {
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("AssignmentFeatureCallArguments for %s [processed = %s]", expression, String.valueOf(processed));
	}

}
