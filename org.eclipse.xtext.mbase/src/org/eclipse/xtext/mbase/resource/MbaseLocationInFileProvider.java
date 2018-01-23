/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.resource;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XAssignment;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XFeatureCall;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.MbasePackage;
import org.eclipse.xtext.mbase.conversion.MbaseQualifiedNameInStaticImportValueConverter;
import org.eclipse.xtext.mbase.util.FeatureCallAsTypeLiteralHelper;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XtypePackage;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author Jan Koehnlein - Initial contribution and API
 * @author Sebastian Zarnekow - Support linking of feature calls as type literals	
 */
@Singleton
public class MbaseLocationInFileProvider extends DefaultLocationInFileProvider {
	
	@Inject
	private FeatureCallAsTypeLiteralHelper typeLiteralHelper;
	
	@Inject
	private MbaseQualifiedNameInStaticImportValueConverter qualifiedNameInStaticImportValueConverter;
	
	@Override
	public ITextRegion getSignificantTextRegion(EObject element) {
		if (element instanceof XAbstractFeatureCall) {
			XAbstractFeatureCall typeLiteral = typeLiteralHelper.getRootTypeLiteral((XAbstractFeatureCall) element);
			if (typeLiteral != null) {
				if (typeLiteral instanceof XMemberFeatureCall) {
					XAbstractFeatureCall target = (XAbstractFeatureCall) ((XMemberFeatureCall) typeLiteral).getMemberCallTarget();
					if (target.isTypeLiteral()) {
						return super.getSignificantTextRegion(typeLiteral);
					}
				}
				INode node = NodeModelUtils.findActualNodeFor(typeLiteral);
				if (node != null) {
					return toZeroBasedRegion(node.getTextRegionWithLineInformation());
				}
			}
		}
		return super.getSignificantTextRegion(element);
	}
	
	@Override
	protected ITextRegion getLocationOfCrossReference(EObject owner, EReference reference, int indexInList,
			boolean isSignificant) {
		if (owner instanceof XMemberFeatureCall && reference == MbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE && ((XMemberFeatureCall) owner).isTypeLiteral()) {
			List<INode> featureNodes = NodeModelUtils.findNodesForFeature(owner, reference);
			ITextRegion result = ITextRegion.EMPTY_REGION;
			if (!featureNodes.isEmpty()) {
				INode featureNode = featureNodes.get(0);
				result = result.merge(toZeroBasedRegion(featureNode.getTextRegionWithLineInformation()));
				List<INode> targetNodes = NodeModelUtils.findNodesForFeature(owner, MbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET);
				if (!targetNodes.isEmpty()) {
					INode targetNode = targetNodes.get(0);
					result = result.merge(toZeroBasedRegion(targetNode.getTextRegionWithLineInformation()));
				}
				return result;
			}
		}
		if (isSignificant && owner instanceof XImportDeclaration && reference == XtypePackage.Literals.XIMPORT_DECLARATION__IMPORTED_TYPE) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(owner, reference);
			if (!nodes.isEmpty()) {
				INode qualifierNode = nodes.get(0);
				ITextRegion result = ITextRegion.EMPTY_REGION;
				INode pending = null;
				String delimiter = qualifiedNameInStaticImportValueConverter.getStringNamespaceDelimiter();
				for (INode node : qualifierNode.getLeafNodes()) {
					if (!isHidden(node)) {
						int length = node.getLength();
						if (length != 0) {
							if (pending != null) {
								result.merge(toZeroBasedRegion(pending.getTextRegionWithLineInformation()));
								pending = null;
							}
							if (delimiter.equals(node.getText())) {
								pending = node;
							} else {
								result = result.merge(toZeroBasedRegion(node.getTextRegionWithLineInformation()));
							}
						}
					}
				}
				return result;
			}
		}
		return super.getLocationOfCrossReference(owner, reference, indexInList, isSignificant);
	}
	
	@Override
	protected ITextRegion getLocationOfContainmentReference(EObject owner, EReference reference, int indexInList, RegionDescription query) {
		if (owner instanceof XMemberFeatureCall && reference == MbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET) {
			XMemberFeatureCall casted = (XMemberFeatureCall) owner;
			if (casted.isExplicitStatic() || casted.isStaticWithDeclaringType()) {
				XExpression target = ((XMemberFeatureCall) owner).getMemberCallTarget();
				return getTextRegion(target, query);
			}
		}
		return super.getLocationOfContainmentReference(owner, reference, indexInList, query);
	}
	
	@Override
	protected List<INode> getLocationNodes(EObject obj) {
		if (obj instanceof XMemberFeatureCall || obj instanceof XAssignment || obj instanceof XFeatureCall) {
			List<INode> resultNodes = Lists.newArrayList();
			final ICompositeNode startNode = findNodeFor(obj);
			boolean crossRefConsumed = false;
			for (INode child : startNode.getChildren()) {
				if (crossRefConsumed) {
					resultNodes.add(child);
				} else {
					EObject grammarElement = child.getGrammarElement();
					if (grammarElement instanceof CrossReference) {
						// We don't use the grammar access to be more robust against
						// overwriting grammars
						Assignment assignment = GrammarUtil.containingAssignment(grammarElement);
						if (MbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE.getName().equals(assignment.getFeature())) {
							crossRefConsumed = true;
							resultNodes.add(child);
						}
					}
				} 
			}
			if (!resultNodes.isEmpty())
				return resultNodes;
		}
		return super.getLocationNodes(obj);
	}
	
	@Override
	protected boolean useKeyword(Keyword keyword, EObject context) {
//		String value = keyword.getValue();
//		for(int i = 0; i < value.length(); i++) {
//			char c = value.charAt(i);
//			if (Character.isJavaIdentifierPart(c)) {
//				return true;
//			}
//		}
		return false;
	}

}
