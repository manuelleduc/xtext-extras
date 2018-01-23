/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.controlflow

import org.eclipse.xtext.mbase.XExpression
import org.eclipse.xtext.mbase.interpreter.ConstantExpressionEvaluationException
import org.eclipse.xtext.mbase.interpreter.SwitchConstantExpressionsInterpreter

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
class EarlyExitInterpreter extends SwitchConstantExpressionsInterpreter {
	
	def boolean isConstant(XExpression it, Object value) {
		try {
			val constant = evaluate
			return value == constant
		} catch (ConstantExpressionEvaluationException e) {
			return false;
		}
	}
	
}