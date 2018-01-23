/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.computation;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.mbase.scoping.batch.ITypeImporter;

/**
 * Imports the enum literals that are defined in a given enum type statically.
 * 
 * @since 2.7
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class EnumLiteralImporter implements ITypeImporter.Client {
	private JvmDeclaredType enumType;

	public EnumLiteralImporter(JvmDeclaredType enumType) {
		this.enumType = enumType;
	}

	@Override
	public void doAddImports(ITypeImporter importer) {
		for (JvmMember member : enumType.getMembers()) {
			if (member instanceof JvmEnumerationLiteral) {
				importer.importStatic(enumType, member.getSimpleName());
			}
		}
	}
}