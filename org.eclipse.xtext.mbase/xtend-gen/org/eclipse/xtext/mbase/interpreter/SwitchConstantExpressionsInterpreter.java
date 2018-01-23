/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.interpreter;

import java.util.Arrays;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XBinaryOperation;
import org.eclipse.xtext.mbase.XBooleanLiteral;
import org.eclipse.xtext.mbase.XCastedExpression;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XNumberLiteral;
import org.eclipse.xtext.mbase.XStringLiteral;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.XUnaryOperation;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.mbase.interpreter.AbstractConstantExpressionsInterpreter;
import org.eclipse.xtext.mbase.interpreter.Context;
import org.eclipse.xtext.mbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.mbase.typesystem.computation.NumberLiterals;

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class SwitchConstantExpressionsInterpreter extends AbstractConstantExpressionsInterpreter {
  /* @FinalFieldsConstructor
   */private static class SwitchContext extends Context {
    private boolean validationMode;
  }
  
  /* @Inject
   */private ILogicalContainerProvider _iLogicalContainerProvider;
  
  /* @Inject
   */private NumberLiterals numberLiterals;
  
  public Object evaluate(final XExpression it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field newHashSet is undefined"
      + "\nInvalid number of arguments. The constructor Context() is not applicable for the arguments (null,null,null,Object)");
  }
  
  public Object evaluate(final XExpression it, final boolean validationMode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field newHashSet is undefined"
      + "\nInvalid number of arguments. The constructor SwitchContext() is not applicable for the arguments (null,null,null,Object)");
  }
  
  protected Object _internalEvaluate(final XNumberLiteral it, final Context ctx) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method numberValue(Object) is undefined"
      + "\nThe method or field javaType is undefined");
  }
  
  protected Object _internalEvaluate(final XAbstractFeatureCall it, final Context ctx) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmEnumerationLiteral cannot be resolved to a type."
      + "\nJvmField cannot be resolved to a type."
      + "\nJvmFormalParameter cannot be resolved to a type."
      + "\nThe method or field feature is undefined"
      + "\n&& cannot be resolved."
      + "\n+ cannot be resolved."
      + "\nThe method or field feature is undefined"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method toTypeReference(JvmType, int) from the type AbstractConstantExpressionsInterpreter refers to the missing type JvmType"
      + "\nsetConstant cannot be resolved"
      + "\nconstant cannot be resolved"
      + "\nconstantValue cannot be resolved"
      + "\nfinal cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nstatic cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nassociatedExpression cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nevaluateAssociatedExpression cannot be resolved"
      + "\nwriteable cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nright cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nright cannot be resolved"
      + "\nevaluateAssociatedExpression cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\n^switch cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n^switch cannot be resolved"
      + "\nevaluate cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  public Object evaluateAssociatedExpression(final XExpression it, final Context ctx) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmEnumerationLiteral cannot be resolved to a type."
      + "\nThe method or field feature is undefined");
  }
  
  public Object internalEvaluate(final XExpression it, final Context ctx) {
    if (it instanceof XBinaryOperation) {
      return _internalEvaluate((XBinaryOperation)it, ctx);
    } else if (it instanceof XUnaryOperation) {
      return _internalEvaluate((XUnaryOperation)it, ctx);
    } else if (it instanceof XAbstractFeatureCall) {
      return _internalEvaluate((XAbstractFeatureCall)it, ctx);
    } else if (it instanceof XBooleanLiteral) {
      return _internalEvaluate((XBooleanLiteral)it, ctx);
    } else if (it instanceof XCastedExpression) {
      return _internalEvaluate((XCastedExpression)it, ctx);
    } else if (it instanceof XNumberLiteral) {
      return _internalEvaluate((XNumberLiteral)it, ctx);
    } else if (it instanceof XStringLiteral) {
      return _internalEvaluate((XStringLiteral)it, ctx);
    } else if (it instanceof XTypeLiteral) {
      return _internalEvaluate((XTypeLiteral)it, ctx);
    } else if (it instanceof XAnnotation) {
      return _internalEvaluate((XAnnotation)it, ctx);
    } else if (it == null) {
      return _internalEvaluate((Void)null, ctx);
    } else if (it != null) {
      return _internalEvaluate(it, ctx);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, ctx).toString());
    }
  }
}
