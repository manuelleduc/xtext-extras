/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.util;

import org.eclipse.xtext.mbase.XCasePart;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XSwitchExpression;
import org.eclipse.xtext.mbase.interpreter.SwitchConstantExpressionsInterpreter;
import org.eclipse.xtext.mbase.typesystem.IBatchTypeResolver;

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class XSwitchExpressions {
  /* @Inject
   */private IBatchTypeResolver _iBatchTypeResolver;
  
  /* @Inject
   */private SwitchConstantExpressionsInterpreter _switchConstantExpressionsInterpreter;
  
  /**
   * Determine whether the given switch expression is valid for Java version 6 or lower.
   */
  public boolean isJavaSwitchExpression(final XSwitchExpression it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getSwitchVariableType(XSwitchExpression) from the type XSwitchExpressions refers to the missing type Object"
      + "\n=== cannot be resolved"
      + "\nisSubtypeOf cannot be resolved"
      + "\nisSubtypeOf cannot be resolved");
  }
  
  /**
   * Determine whether the given switch expression is valid for Java version 7 or higher.
   */
  public boolean isJava7SwitchExpression(final XSwitchExpression it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getSwitchVariableType(XSwitchExpression) from the type XSwitchExpressions refers to the missing type Object"
      + "\n=== cannot be resolved"
      + "\nisSubtypeOf cannot be resolved"
      + "\nisSubtypeOf cannot be resolved"
      + "\nisSubtypeOf cannot be resolved");
  }
  
  public boolean isJavaCaseExpression(final XSwitchExpression it, final XCasePart casePart) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field typeGuard is undefined for the type XCasePart"
      + "\n=== cannot be resolved."
      + "\nThe method or field resolveTypes is undefined"
      + "\nThe method or field actualType is undefined for the type XExpression"
      + "\nThe method getSwitchVariableType(XSwitchExpression) from the type XSwitchExpressions refers to the missing type Object"
      + "\n!== cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nisAssignableFrom cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public Object getSwitchVariableType(final XSwitchExpression it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field resolveTypes is undefined"
      + "\nThe method or field declaredParam is undefined"
      + "\nThe method or field actualType is undefined for the type XExpression"
      + "\nThe method or field actualType is undefined for the type XExpression"
      + "\n=== cannot be resolved"
      + "\nactualType cannot be resolved"
      + "\n?: cannot be resolved");
  }
  
  public boolean isConstant(final XCasePart casePart) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nThe method or field evaluate is undefined for the type XExpression");
  }
  
  public XExpression getThen(final XCasePart casePart, final XSwitchExpression switchExpression) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\n- cannot be resolved."
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nThe method or field cases is undefined for the type XSwitchExpression"
      + "\nindexOf cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\n- cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n< cannot be resolved"
      + "\nget cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ngetThen cannot be resolved");
  }
}
