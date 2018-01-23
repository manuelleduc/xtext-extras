/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.scoping.batch;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class StaticFeatureDescriptionWithSyntacticReceiver extends StaticFeatureDescription {

	private XExpression receiver;
	private LightweightTypeReference receiverType;

	public StaticFeatureDescriptionWithSyntacticReceiver(QualifiedName qualifiedName, JvmFeature feature, 
			XExpression receiver, LightweightTypeReference receiverType,
			int bucketId, boolean visible) {
		super(qualifiedName, feature, bucketId, visible);
		this.receiver = receiver;
		this.receiverType = receiverType;
	}
	
	@Override
	public XExpression getSyntacticReceiver() {
		return receiver;
	}
	
	@Override
	public LightweightTypeReference getSyntacticReceiverType() {
		return receiverType;
	}
	
	@Override
	public boolean isValidStaticState() {
		return receiverType == null;
	}

}
