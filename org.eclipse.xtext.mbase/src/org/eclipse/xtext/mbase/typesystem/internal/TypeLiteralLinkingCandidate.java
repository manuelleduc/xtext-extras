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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.EObjectDiagnosticImpl;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.MbasePackage;
import org.eclipse.xtext.mbase.scoping.batch.IIdentifiableElementDescription;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.computation.IFeatureLinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.computation.ILinkingCandidate;
import org.eclipse.xtext.mbase.typesystem.computation.ITypeExpectation;
import org.eclipse.xtext.mbase.typesystem.conformance.ConformanceFlags;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.util.TypeLiteralLinkingCandidateResolver;
import org.eclipse.xtext.mbase.validation.IssueCodes;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * TODO JavaDoc, toString
 */
public class TypeLiteralLinkingCandidate extends AbstractPendingLinkingCandidate<XAbstractFeatureCall> implements ITypeLiteralLinkingCandidate {

	private TypeLiteralHelper helper;

	public TypeLiteralLinkingCandidate(
			XAbstractFeatureCall featureCall, 
			IIdentifiableElementDescription description,
			ITypeExpectation expectation, 
			final ExpressionTypeComputationState state) {
		super(featureCall, description, expectation, state, new TypeLiteralLinkingCandidateResolver(featureCall) {
			
			@Override
			protected IFeatureLinkingCandidate getLinkingCandidate(XExpression target) {
				return state.getResolvedTypes().getLinkingCandidate((XAbstractFeatureCall) target);
			}
			
		});
		if (featureCall.isExplicitOperationCallOrBuilderSyntax()) {
			throw new IllegalArgumentException("Cannot be a type literal: " + String.valueOf(featureCall));
		}
		this.helper = new TypeLiteralHelper(state);
	}
	
	@Override
	public void computeArgumentTypes() {
		// nothing to do
	}
	
	// TODO java.awt.List / java.util.List
	@Override
	protected ILinkingCandidate createAmbiguousLinkingCandidate(AbstractPendingLinkingCandidate<?> second) {
		return this;
	}

	/**
	 * Returns the actual arguments of the expression. These do not include the
	 * receiver.  
	 */
	@Override
	protected List<XExpression> getArguments() {
		return Collections.emptyList();
	}

	@Override
	protected String getFeatureTypeName() {
		return "type";
	}

	@Override
	public int getArityMismatch() {
		return 0;
	}
	
	@Override
	protected List<XExpression> getSyntacticArguments() {
		return Collections.emptyList();
	}
	
	@Override
	public boolean isExtension() {
		return false;
	}
	
	@Override
	protected boolean hasReceiver() {
		return false;
	}
	
	@Override
	public boolean isStatic() {
		return false;
	}
	
	@Override
	public boolean isTypeLiteral() {
		return true;
	}

	@Override
	public XAbstractFeatureCall getFeatureCall() {
		return getExpression();
	}
	
	@Override
	protected List<JvmTypeReference> getPlainSyntacticTypeArguments() {
		return Collections.emptyList();
	}
	
	@Override
	protected int getConformanceFlags(int idx, boolean recompute) {
		if (idx == -1) {
			return ConformanceFlags.CHECKED_SUCCESS;
		}
		return super.getConformanceFlags(idx, recompute);
	}
	
	@Override
	protected LightweightTypeReference getSubstitutedExpectedType(int argumentIndex) {
		return null;
	}
	
	@Override
	protected boolean validateTypeArity(IAcceptor<? super AbstractDiagnostic> result) {
		int numberOfTypeArgs = getFeatureCall().getTypeArguments().size();
		if (numberOfTypeArgs != 0) {
			String message = String.format("Invalid type %1$s. Type arguments cannot be applied to the type literal %2$s",
					numberOfTypeArgs == 1 ? "argument" : "arguments",
					getFeature().getSimpleName());
			AbstractDiagnostic diagnostic = new EObjectDiagnosticImpl(
					Severity.ERROR, 
					IssueCodes.INVALID_TYPE_ARGUMENTS_ON_TYPE_LITERAL, 
					message, 
					getExpression(),
					MbasePackage.Literals.XABSTRACT_FEATURE_CALL__TYPE_ARGUMENTS,
					-1, null) {
				
				ICompositeNode node = NodeModelUtils.getNode(getFeatureCall());
				
				@Override
				public int getLength() {
					for(INode child: node.getChildren()) {
						EObject grammarElement = child.getGrammarElement();
						if (grammarElement instanceof Keyword) {
							if (">".equals(((Keyword) grammarElement).getValue())) {
								return child.getEndOffset() - getOffset();
							}
						}
					}
					return 0;
				}
				@Override
				public int getOffset() {
					for(INode child: node.getChildren()) {
						EObject grammarElement = child.getGrammarElement();
						if (grammarElement instanceof Keyword) {
							if ("<".equals(((Keyword) grammarElement).getValue())) {
								return child.getOffset();
							}
						}
					}
					return 0;
				}
				
				@Override
				public int getLine() {
					for(INode child: node.getChildren()) {
						EObject grammarElement = child.getGrammarElement();
						if (grammarElement instanceof Keyword) {
							if ("<".equals(((Keyword) grammarElement).getValue())) {
								return child.getStartLine();
							}
						}
					}
					return 0;
				}
			};
			result.accept(diagnostic);
			return false;
		}
		return true;
	}
	
	@Override
	protected LightweightTypeReference getDeclaredType(JvmIdentifiableElement feature) {
		return helper.getAsClassLiteral(feature);
	}
	
	@Override
	protected List<JvmTypeParameter> getDeclaredTypeParameters() {
		return Collections.emptyList();
	}
	
	@Override
	public int getTypeArityMismatch() {
		return 0;
	}
	
	@Override
	protected int getTypeArgumentConformanceFailures(/* @Nullable */ IAcceptor<? super AbstractDiagnostic> acceptor) {
		return 0;
	}
	
	@Override
	public List<LightweightTypeReference> getTypeArguments() {
		return Collections.emptyList();
	}
	
	@Override
	protected void preApply() {
		XAbstractFeatureCall expression = getExpression();
		JvmType type = getType();
		if (expression instanceof XMemberFeatureCall) {
			if (type instanceof JvmDeclaredType) {
				JvmDeclaredType declaredType = (JvmDeclaredType) type;
				if (declaredType.getDeclaringType() == null) {
					helper.applyPackageFragment((XMemberFeatureCall) expression, declaredType);
				} else {
					String queriedName = description.getName().toString(); // may be Map$Entry
					String qualifiedName = declaredType.getIdentifier();
					String packageName = Strings.emptyIfNull(declaredType.getPackageName());
					if (packageName.length() + 1 + queriedName.length() == qualifiedName.length()) {
						helper.applyPackageFragment((XMemberFeatureCall) expression, declaredType);
					}
				}
			}
		}
	}
	
	@Override
	public JvmType getType() {
		return (JvmType) getFeature();
	}
	
	@Override
	public void applyToModel(IResolvedTypes resolvedTypes) {
		resolveLinkingProxy(MbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, MbasePackage.XABSTRACT_FEATURE_CALL__FEATURE);
	}

}
