/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.annotations.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation
import org.eclipse.xtext.mbase.formatting2.MbaseFormatter

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
class MbaseWithAnnotationsFormatter extends MbaseFormatter {

	def dispatch void format(XAnnotation ann, extension IFormattableDocument document) {
		ann.regionFor.keyword("@").append[noSpace]
		ann.regionFor.keyword("(").surround[noSpace]
		if (ann.value !== null) {
			ann.value.format
			ann.regionFor.keyword(")").prepend[noSpace]
		} else if (!ann.elementValuePairs.empty) {
			for (pair : ann.elementValuePairs) {
				pair.regionFor.keyword("=").surround[noSpace]
				pair.value.format
				pair.immediatelyFollowing.keyword(",").prepend[noSpace].append[oneSpace]
			}
			ann.regionFor.keyword(")").prepend[noSpace]
		}
	}

}
