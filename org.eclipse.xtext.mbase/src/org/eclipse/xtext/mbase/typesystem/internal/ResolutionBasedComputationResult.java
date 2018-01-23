/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import java.util.EnumSet;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.computation.ITypeComputationResult;
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceFlags;
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceHint;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * TODO JavaDoc, toString
 */
public class ResolutionBasedComputationResult implements ITypeComputationResult {

	private final XExpression expression;
	private final ResolvedTypes resolution;

	public ResolutionBasedComputationResult(XExpression expression, ResolvedTypes resolution) {
		this.expression = expression;
		this.resolution = resolution;
	}

	/* @Nullable */
	@Override
	public LightweightTypeReference getActualExpressionType() {
		return resolution.getActualType(expression);
	}
	
	/* @Nullable */
	@Override
	public LightweightTypeReference getReturnType() {
		return resolution.getReturnType(expression);
	}

	/* @NonNull */
	@Override
	public XExpression getExpression() {
		return expression;
	}

	/* @Nullable */
	@Override
	public LightweightTypeReference getExpectedExpressionType() {
		return resolution.getExpectedType(expression);
	}
	
	/* @Nullable */
	@Override
	public LightweightTypeReference getExpectedReturnType() {
		return resolution.getExpectedReturnType(expression);
	}
	
	/* @NonNull */
	@Override
	public EnumSet<ConformanceHint> getConformanceHints() {
		return ConformanceHint.fromFlags(getConformanceFlags());
	}
	
	@Override
	public int getConformanceFlags() {
		TypeData typeData = resolution.getTypeData(expression, false);
		if (typeData == null)
			return ConformanceFlags.NONE;
		return typeData.getConformanceFlags();
	}

	/* @NonNull */
	@Override
	public EnumSet<ConformanceHint> getCheckedConformanceHints() {
		return ConformanceHint.fromFlags(getCheckedConformanceFlags());
	}
	
	@Override
	public int getCheckedConformanceFlags() {
		TypeData typeData = resolution.getTypeData(expression, false);
		if (typeData == null)
			return ConformanceFlags.NONE;
		return resolution.getConformanceFlags(typeData, false);
	}
	
	@Override
	public String toString() {
		return String.format("Result %s for %s", getActualExpressionType(), expression);
	}

}
