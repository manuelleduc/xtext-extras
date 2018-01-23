/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.controlflow;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.interpreter.SwitchConstantExpressionsInterpreter;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class EarlyExitInterpreter extends SwitchConstantExpressionsInterpreter {
  public boolean isConstant(final XExpression it, final Object value) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved.");
  }
}
