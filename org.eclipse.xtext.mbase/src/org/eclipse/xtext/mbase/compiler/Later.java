/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.compiler;

import org.eclipse.xtext.mbase.compiler.output.ITreeAppendable;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public interface Later {
	void exec(ITreeAppendable appendable);
}
