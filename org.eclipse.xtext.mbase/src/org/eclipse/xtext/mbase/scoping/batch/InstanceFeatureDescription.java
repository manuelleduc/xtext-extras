/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.Map;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceFlags;
import org.eclipse.xtext.mbase.typesystem.references.LightweightMergedBoundTypeArgument;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class InstanceFeatureDescription extends BucketedEObjectDescription {

	private final XExpression receiver;
	private final LightweightTypeReference receiverType;
	private final Map<JvmTypeParameter, LightweightMergedBoundTypeArgument> receiverTypeParameterMapping;
	private final int receiverConformanceFlags;

	protected InstanceFeatureDescription(
			QualifiedName qualifiedName, 
			JvmFeature feature,
			XExpression receiver,
			LightweightTypeReference receiverType,
			Map<JvmTypeParameter, LightweightMergedBoundTypeArgument> receiverTypeParameterMapping,
			int receiverConformanceFlags,
			int bucketId,
			boolean visible) {
		super(qualifiedName, feature, bucketId, visible);
		if (feature.isStatic()) {
			throw new IllegalArgumentException(String.valueOf(feature));
		}
		if (receiverConformanceFlags == ConformanceFlags.NONE) {
			throw new IllegalArgumentException(String.valueOf(receiverConformanceFlags));
		}
		this.receiver = receiver;
		this.receiverType = receiverType;
		this.receiverTypeParameterMapping = receiverTypeParameterMapping;
		this.receiverConformanceFlags = receiverConformanceFlags;
	}
	
	@Override
	/* @Nullable */
	public XExpression getSyntacticReceiver() {
		return receiver;
	}
	
	@Override
	/* @Nullable */
	public LightweightTypeReference getSyntacticReceiverType() {
		return receiverType;
	}
	
	@Override
	public Map<JvmTypeParameter, LightweightMergedBoundTypeArgument> getSyntacticReceiverTypeParameterMapping() {
		return receiverTypeParameterMapping;
	}
	
	@Override
	public int getSyntacticReceiverConformanceFlags() {
		return receiverConformanceFlags;
	}
	
	@Override
	public boolean isStatic() {
		return false;
	}
	
	@Override
	public boolean isExtension() {
		return false;
	}

}
