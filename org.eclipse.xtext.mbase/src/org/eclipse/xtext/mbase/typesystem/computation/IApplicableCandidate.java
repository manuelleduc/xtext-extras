/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.computation;

import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;


/**
 * A candidate encapsulates intermediate computation results. It may represent a not yet
 * applied linking candidate or other derived properties that are pending to be written
 * into the model, e.g. the implicit parameters of closures. 
 * 
 * @see ILinkingCandidate
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public interface IApplicableCandidate {

	/**
	 * Injects the resolved information into the model.
	 */
	void applyToModel(IResolvedTypes resolvedTypes);
	
	// TODO we should use a smarter acceptor here
	// e.g. it should be possible to suppress diagnostics for children of certain expressions
	// and therefore it should expose something like 'isSuppressed()'
	/**
	 * Produce diagnostics for this condidate. It is not the responsibility of this
	 * candidate to propagate the acceptor to its children.
	 * @return <code>true</code> if further validation should be performed.
	 */
	boolean validate(IAcceptor<? super AbstractDiagnostic> result);
}
