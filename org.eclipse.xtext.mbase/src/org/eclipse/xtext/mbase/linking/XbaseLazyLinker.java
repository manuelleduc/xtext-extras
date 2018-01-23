/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.linking;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmSpecializedTypeReference;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XAssignment;
import org.eclipse.xtext.mbase.XClosure;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XFeatureCall;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.mbasePackage;
import org.eclipse.xtext.xtype.XtypePackage;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class mbaseLazyLinker extends LazyLinker {
	
	@Override
	protected void clearReference(EObject obj, EReference ref) {
		super.clearReference(obj, ref);
		if (obj instanceof XAbstractFeatureCall) {
			XAbstractFeatureCall featureCall = (XAbstractFeatureCall) obj;
			featureCall.setImplicitReceiver(null);
			featureCall.setInvalidFeatureIssueCode(null);
			featureCall.setImplicitFirstArgument(null);
			if (featureCall instanceof XFeatureCall) {
				XFeatureCall casted = (XFeatureCall) featureCall;
				casted.setTypeLiteral(false);
				casted.setPackageFragment(false);
			} else if (featureCall instanceof XMemberFeatureCall) {
				XMemberFeatureCall casted = (XMemberFeatureCall) featureCall;
				casted.setTypeLiteral(false);
				casted.setPackageFragment(false);
				casted.setStaticWithDeclaringType(false);
			} else if (featureCall instanceof XAssignment) {
				((XAssignment) featureCall).setStaticWithDeclaringType(false);
			}
		} else if (obj instanceof JvmSpecializedTypeReference) {
			((JvmSpecializedTypeReference) obj).setEquivalent(null);
			if (ref == XtypePackage.Literals.XFUNCTION_TYPE_REF__TYPE) {
				obj.eUnset(ref);
			}
		} else if (obj instanceof XClosure) {
			// EMF 2.5 does not dive into derived contained things thus we do it explicitly
			obj.eUnset(mbasePackage.Literals.XCLOSURE__IMPLICIT_FORMAL_PARAMETERS);
		} else if (obj instanceof XConstructorCall) {
			((XConstructorCall) obj).setAnonymousClassConstructorCall(false);
		}
	}
	
	@Override
	protected TreeIterator<EObject> getAllLinkableContents(EObject model) {
		return EcoreUtil2.getAllNonDerivedContents(model, true);
	}
}
