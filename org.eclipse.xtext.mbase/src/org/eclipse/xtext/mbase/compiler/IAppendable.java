/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.compiler;

import java.util.List;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public interface IAppendable extends ISourceAppender {
	
	@Override
	IAppendable append(CharSequence string);

	@Override
	IAppendable append(JvmType type);

	@Override
	IAppendable append(LightweightTypeReference typeRef);

	@Override
	IAppendable newLine();

	@Override
	IAppendable increaseIndentation();

	@Override
	IAppendable decreaseIndentation();
	
	/**
	 * @deprecated imports are handled by external components 
	 */
	@Deprecated
	List<String> getImports();

	/**
	 * opens a new scope, backed up by a  real Java Scope
	 */
	void openScope();
	
	/**
	 * opens a new variable scope, without having a new Java scope.
	 */
	void openPseudoScope();

	String declareVariable(Object key, String proposedName);
	
	/**
	 * Declares a synthetic variable, where the name is not used in the current or any parent scope
	 * except by other synthetic variables.
	 */
	String declareSyntheticVariable(Object key, String proposedName);
	
	/**
	 * Declares a variable with unique name, which is not used in the current or any parent scope.
	 * This is a workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=445949
	 */
	String declareUniqueNameVariable(Object key, String proposedName);
	
	String getName(Object key);
	
	String removeName(Object key) throws IllegalStateException;
	
	boolean hasName(Object key);
	
	Object getObject(String name);
	
	boolean hasObject(String name);

	void closeScope();
	
	int length();
	
	@Override
	String toString();
	
	String getContent();
	
	GeneratorConfig getGeneratorConfig();

}
