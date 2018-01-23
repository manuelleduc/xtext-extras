/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.override;

import java.util.EnumSet;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.mbase.typesystem.override.IOverrideCheckResult.OverrideCheckDetails;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * Resolved bottom representation of a {@link JvmOperation}.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class BottomResolvedOperation extends AbstractResolvedOperation {
	
	private OverrideTester overrideTester;
	
	public BottomResolvedOperation(JvmOperation declaration, LightweightTypeReference contextType, OverrideTester overrideTester) {
		super(declaration, contextType);
		this.overrideTester = overrideTester;
	}
	
	@Override
	public boolean isBottomInContext() {
		return true;
	}

	@Override
	public IResolvedOperation getAsBottom() {
		return this;
	}

	@Override
	protected BottomResolvedOperation getBottom() {
		return this;
	}

	@Override
	protected OverrideTester getOverrideTester() {
		return overrideTester;
	}
	
	@Override
	public IOverrideCheckResult getOverrideCheckResult() {
		return new LazyOverrideCheckResult(this, getDeclaration(), OverrideCheckDetails.CURRENT) {
			@Override
			public boolean hasProblems() {
				return false;
			}
			@Override
			public EnumSet<OverrideCheckDetails> getDetails() {
				return EnumSet.of(OverrideCheckDetails.CURRENT);
			}
		};
	}
}
