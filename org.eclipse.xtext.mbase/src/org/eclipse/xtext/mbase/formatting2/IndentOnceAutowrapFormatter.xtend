/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.formatting2

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.formatting2.IAutowrapFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.IHiddenRegionFormatting
import org.eclipse.xtext.formatting2.regionaccess.IHiddenRegion
import org.eclipse.xtext.formatting2.regionaccess.ITextSegment
import org.eclipse.xtext.formatting2.regionaccess.IHiddenRegionPart

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@FinalFieldsConstructor class IndentOnceAutowrapFormatter implements IAutowrapFormatter {
	val IHiddenRegion last
	var hasWrapped = false

	override format(ITextSegment region, IHiddenRegionFormatting wrapped, extension IFormattableDocument document) {
		if (!hasWrapped) {
			val hiddenRegion = switch region { IHiddenRegion: region IHiddenRegionPart: region.hiddenRegion }
			set(hiddenRegion, last)[indent]
			hasWrapped = true
		}
	}
}
