/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.imports;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.ImplementedBy;

/**
 * Language dependent configuration for the 'import' related things.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
@ImplementedBy(DefaultImportsConfiguration.class)
public interface IImportsConfiguration {

	int getImportSectionOffset(XtextResource resource);

	Set<String> getImplicitlyImportedPackages(XtextResource resource);

	Iterable<JvmDeclaredType> getLocallyDefinedTypes(XtextResource resource);
	
	JvmDeclaredType getContextJvmDeclaredType(EObject model);

	String getPackageName(XtextResource xtextResource);
}
