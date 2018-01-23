/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.linking;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.mbasePackage;
import org.eclipse.xtext.mbase.typesystem.IBatchTypeResolver;

import com.google.inject.Inject;

/**
 * {@link XConstructorCall Constructor calls} may be unresolvable since
 * they may point to types that do not define any constructors. This helper
 * takes care of this semantic.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class BrokenConstructorCallAwareEObjectAtOffsetHelper extends EObjectAtOffsetHelper {

	@Inject
	private IBatchTypeResolver batchTypeResolver;
	
	@Override
	protected EObject resolveCrossReferencedElement(INode node) {
		EObject referenceOwner = NodeModelUtils.findActualSemanticObjectFor(node);
		if (referenceOwner != null) {
			EReference crossReference = GrammarUtil.getReference((CrossReference) node.getGrammarElement(),
					referenceOwner.eClass());
			if (!crossReference.isMany()) {
				EObject resultOrProxy = (EObject) referenceOwner.eGet(crossReference);
				if (resultOrProxy != null && resultOrProxy.eIsProxy() && crossReference == mbasePackage.Literals.XCONSTRUCTOR_CALL__CONSTRUCTOR) {
					if (referenceOwner instanceof XConstructorCall) {
						JvmIdentifiableElement linkedType = batchTypeResolver.resolveTypes(referenceOwner).getLinkedFeature((XConstructorCall)referenceOwner);
						if (linkedType != null)
							return linkedType;
					}
				} 
				return resultOrProxy;
			} else {
				return super.resolveCrossReferencedElement(node);
			}
		}
		return null;
	}	
	
}
