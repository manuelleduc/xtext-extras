/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.interpreter;

import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.mbase.XExpression;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public interface IExpressionInterpreter {

	IEvaluationResult evaluate(XExpression expression);
	
	IEvaluationResult evaluate(XExpression expression, IEvaluationContext context, CancelIndicator cancelIndicator);
	
}
