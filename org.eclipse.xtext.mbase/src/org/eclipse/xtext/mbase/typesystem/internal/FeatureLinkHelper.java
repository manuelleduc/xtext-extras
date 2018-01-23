/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.internal;

import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XAssignment;
import org.eclipse.xtext.mbase.XBinaryOperation;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XFeatureCall;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.XPostfixOperation;
import org.eclipse.xtext.mbase.XUnaryOperation;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

import com.google.common.collect.Lists;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class FeatureLinkHelper {
	
	/* @Nullable */
	public XExpression getSyntacticReceiver(XExpression expression) {
		if (expression instanceof XAbstractFeatureCall) {
			if (expression instanceof XFeatureCall) {
				return null;
			}
			if (expression instanceof XMemberFeatureCall) {
				return ((XMemberFeatureCall) expression).getMemberCallTarget();
			}
			if (expression instanceof XAssignment) {
				return ((XAssignment) expression).getAssignable();
			}
			if (expression instanceof XBinaryOperation) {
				return ((XBinaryOperation) expression).getLeftOperand();
			}
			if (expression instanceof XUnaryOperation) {
				return ((XUnaryOperation) expression).getOperand();
			}
			if (expression instanceof XPostfixOperation) {
				return ((XPostfixOperation) expression).getOperand();
			}
		}
		return null;
	}

	public List<XExpression> getSyntacticArguments(XAbstractFeatureCall expression) {
		if (expression instanceof XFeatureCall) {
			return ((XFeatureCall) expression).getFeatureCallArguments();
		}
		if (expression instanceof XMemberFeatureCall) {
			return ((XMemberFeatureCall) expression).getMemberCallArguments();
		}
		if (expression instanceof XAssignment) {
			return Collections.singletonList(((XAssignment) expression).getValue());
		}
		if (expression instanceof XBinaryOperation) {
			return Collections.singletonList(((XBinaryOperation) expression).getRightOperand());
		}
		// explicit condition to make sure we thought about it
		if (expression instanceof XUnaryOperation) {
			return Collections.emptyList();
		}
		if (expression instanceof XPostfixOperation) {
			return Collections.emptyList();
		}
		return Collections.emptyList();
	}
	
	public List<JvmTypeParameter> getDeclaredTypeParameters(JvmConstructor constructor) {
		List<JvmTypeParameter> constructorTypeParameters = constructor.getTypeParameters();
		if (constructorTypeParameters.isEmpty()) {
			JvmDeclaredType createdType = constructor.getDeclaringType();
			if (createdType instanceof JvmTypeParameterDeclarator) {
				return ((JvmTypeParameterDeclarator) createdType).getTypeParameters();
			}
		} else {
			JvmDeclaredType createdType = constructor.getDeclaringType();
			if (createdType instanceof JvmTypeParameterDeclarator) {
				List<JvmTypeParameter> typeParameters = ((JvmTypeParameterDeclarator) createdType).getTypeParameters();
				if (typeParameters.isEmpty()) {
					return constructorTypeParameters;
				}
				List<JvmTypeParameter> result = Lists.newArrayList(constructorTypeParameters);
				result.addAll(typeParameters);
				return result;
			}
			return constructorTypeParameters;
		}
		return Collections.emptyList();
	}
	
	/* @Nullable */
	public LightweightTypeReference getExpectedReceiverType(JvmIdentifiableElement linkedFeature, LightweightTypeReference receiverType) {
		if (receiverType.isMultiType() && linkedFeature instanceof JvmMember) {
			LightweightTypeReference declaratorReference = receiverType.getOwner().newParameterizedTypeReference(((JvmMember) linkedFeature).getDeclaringType());
			if (!declaratorReference.isAssignableFrom(receiverType.toJavaType())) {
				for(LightweightTypeReference multiTypeComponent: receiverType.getMultiTypeComponents()) {
					if (declaratorReference.isAssignableFrom(multiTypeComponent)) {
						return multiTypeComponent;
					}
				}
			} else {
				return declaratorReference;
			}
		} else if (receiverType.isSynonym() && linkedFeature instanceof JvmMember) {
			List<LightweightTypeReference> components = receiverType.getMultiTypeComponents();
			return components.get(components.size() - 1);
		}
		return receiverType;
	}
	
}
