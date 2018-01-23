/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.interpreter.impl;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.mbase.interpreter.IEvaluationContext;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class NullEvaluationContext implements IEvaluationContext {

	@Override
	public Object getValue(QualifiedName qualifiedName) {
		return null;
	}

	@Override
	public void newValue(QualifiedName qualifiedName, Object value) {
		throw new IllegalStateException("Cannot create new value in null context.");
	}

	@Override
	public void assignValue(QualifiedName qualifiedName, Object value) {
		throw new IllegalStateException("Cannot assign a value in null context.");
	}

	@Override
	public IEvaluationContext fork() {
		throw new IllegalStateException("Cannot fork a null context.");
	}

}
