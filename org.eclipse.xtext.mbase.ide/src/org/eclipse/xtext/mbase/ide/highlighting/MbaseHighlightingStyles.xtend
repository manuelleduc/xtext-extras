/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.ide.highlighting

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Christian Schneider
 */
interface MbaseHighlightingStyles extends HighlightingStyles {

	String INTERFACE = "mbase.interface";
	String ENUM = "mbase.enum";
	String CLASS = "mbase.class";
	String ABSTRACT_CLASS = "mbase.abstract.class";
	
	String ANNOTATION = "mbase.annotation";
	
	String FIELD = "mbase.field";
	String STATIC_FIELD = "mbase.static.field";
	String STATIC_FINAL_FIELD = "mbase.static.final.field";
	
	// not supported yet
	// String INHERITED_FIELD = "mbase.inherited.field";
	
	String METHOD = "mbase.method";
	String STATIC_METHOD_INVOCATION = "mbase.static.method.invocation";      
	String ABSTRACT_METHOD_INVOCATION = "mbase.abstract.method.invocation";
	String EXTENSION_METHOD_INVOCATION = "mbase.extension.method.invacation";
	
	// not supported yet
	// String INHERITED_METHOD_INVOCATION = "mbase.inherited.method.invacation";
	
	String DEPRECATED_MEMBERS = "mbase.deprecated.members";
	
	String LOCAL_VARIABLE = "mbase.local.variable";
	String LOCAL_VARIABLE_DECLARATION = "mbase.local.variable.declaration";
	String LOCAL_FINAL_VARIABLE = "mbase.local.final.variable"
	String LOCAL_FINAL_VARIABLE_DECLARATION = "mbase.local.final.variable.declaration"
	
	String PARAMETER_VARIABLE = "mbase.parameter.variable";
	String TYPE_VARIABLE = "mbase.type.variable";
	
	String TYPE_ARGUMENT = "mbase.type.argument";	
}