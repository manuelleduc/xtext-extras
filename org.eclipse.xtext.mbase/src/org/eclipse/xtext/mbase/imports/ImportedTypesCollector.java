/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.imports;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.ITextRegion;


/**
 * @author Anton Kosyakov - Initial contribution and API
 */
public class ImportedTypesCollector extends TypeUsageCollector {
	
	@Override
	protected void acceptType(JvmType type, JvmType usedType, ITextRegion refRegion) {
		JvmMember currentContext = getCurrentContext();
		if (currentContext == null) {
			return;
		}
		if (type == null || type.eIsProxy()) {
			throw new IllegalArgumentException();
		}
		if (type instanceof JvmDeclaredType && !isIgnored(type, refRegion)) {
			getTypeUsages().addTypeUsage((JvmDeclaredType) type, (JvmDeclaredType) usedType, refRegion, currentContext);
		}
	}

	private boolean isIgnored(JvmType type, ITextRegion refRegion) {
		IParseResult parseResult = getResource().getParseResult();
		if (parseResult == null) {
			return false;
		}
		String completeText = parseResult.getRootNode().getText();
		CharSequence refText = completeText.subSequence(refRegion.getOffset(), refRegion.getOffset() + refRegion.getLength());
		return type.getQualifiedName().equals(refText);
	}

}
