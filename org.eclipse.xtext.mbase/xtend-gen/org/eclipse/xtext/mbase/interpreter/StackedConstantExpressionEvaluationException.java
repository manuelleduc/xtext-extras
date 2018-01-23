/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.interpreter;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.interpreter.ConstantExpressionEvaluationException;

@SuppressWarnings("all")
public class StackedConstantExpressionEvaluationException extends ConstantExpressionEvaluationException {
  private /* JvmField */Object field;
  
  private ConstantExpressionEvaluationException cause;
  
  public StackedConstantExpressionEvaluationException(final XExpression expression, final /* JvmField */Object field, final ConstantExpressionEvaluationException cause) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nThe field StackedConstantExpressionEvaluationException.field refers to the missing type JvmField"
      + "\nsimpleName cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
}
