/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.formatting2;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmTypeParameter
import org.eclipse.xtext.common.types.JvmWildcardTypeReference
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.xtype.XFunctionTypeRef

import static org.eclipse.xtext.mbase.formatting2.MbaseFormatterPreferenceKeys.*
import static org.eclipse.xtext.xtype.XtypePackage.Literals.*

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
class XtypeFormatter extends AbstractFormatter2 {

	def dispatch void format(XFunctionTypeRef func, extension IFormattableDocument document) {
		func.regionFor.keyword("(").append[noSpace]
		for (param : func.paramTypes) {
			param.format
			param.immediatelyFollowing.keyword(",").prepend[noSpace].append[oneSpace]
		}
		func.regionFor.keyword(")").prepend[if(!func.paramTypes.empty) noSpace].append[noSpace]
		func.regionFor.keyword("=>").append[noSpace]
		func.returnType.format
	}

	def dispatch void format(JvmParameterizedTypeReference ref, extension IFormattableDocument document) {
		ref.regionFor.keyword("<").surround[noSpace]
		for (arg : ref.arguments) {
			arg.format
			arg.immediatelyFollowing.keyword(",").prepend[noSpace].append[oneSpace]
		}
		if (!ref.arguments.empty)
			ref.regionFor.keyword(">").prepend[noSpace]
	}

	def dispatch void format(JvmWildcardTypeReference ref, extension IFormattableDocument document) {
		if (!ref.constraints.empty)
			ref.regionFor.keyword("?").append[oneSpace]
		for (c : ref.constraints)
			c.format
	}

	def dispatch void format(JvmTypeParameter ref, extension IFormattableDocument document) {
		for (c : ref.constraints) {
			c.prepend[oneSpace]
			c.format
		}
	}
}
