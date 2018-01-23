/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.jvmmodel

import com.google.common.annotations.Beta
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.parser.antlr.IReferableElementsUnloader
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.JvmGenericType

/**
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noreference This class is not intended to be referenced by clients.
 * 
 * @since 2.7
 */
@Beta
class JvmElementsProxifyingUnloader implements IReferableElementsUnloader {
	
	override unloadRoot(EObject root) {
		switch root {
			JvmMember : unloadRecursively(root)	
		}
	}
	
	def protected void unloadRecursively(JvmIdentifiableElement element) {
		switch element {
			JvmDeclaredType : {
				for (child : element.members) {
					unloadRecursively(child)
				}
				switch element {
					JvmGenericType : {
						for (child : element.typeParameters) {
							unloadRecursively(child)
						}
					}
				}
			}
			JvmExecutable : {
				for (child : element.parameters) {
					unloadRecursively(child)
				}
				for (child : element.typeParameters) {
					unloadRecursively(child)
				}
			}
		}
		element.eAdapters.clear;
		(element as InternalEObject).eSetProxyURI(EcoreUtil.getURI(element))
	}
	
}