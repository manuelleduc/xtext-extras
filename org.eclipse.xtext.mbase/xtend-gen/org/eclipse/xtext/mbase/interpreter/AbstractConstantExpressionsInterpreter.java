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
import org.eclipse.xtext.mbase.XStringLiteral;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.XUnaryOperation;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.mbase.interpreter.ConstantExpressionEvaluationException;
import org.eclipse.xtext.mbase.interpreter.ConstantOperators;
import org.eclipse.xtext.mbase.interpreter.Context;
import org.eclipse.xtext.mbase.scoping.featurecalls.OperatorMapping;

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class AbstractConstantExpressionsInterpreter {
  /* @Accessors(/* name is null */)
  @Inject
   */private ConstantOperators constantOperators;
  
  /* @Inject
   */private OperatorMapping operatorMapping;
  
  protected Object evaluate(final XExpression expression, final Context ctx) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field alreadyEvaluating is not visible"
      + "\nThe field alreadyEvaluating is not visible");
  }
  
  protected Object _internalEvaluate(final XExpression expression, final Context ctx) {
    throw this.notConstantExpression(expression);
  }
  
  protected Object _internalEvaluate(final Void nullValue, final Context ctx) {
    throw this.notConstantExpression(null);
  }
  
  public ConstantExpressionEvaluationException notConstantExpression(final XExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nThe method toText(XExpression) from the type AbstractConstantExpressionsInterpreter refers to the missing type Object"
      + "\n+ cannot be resolved");
  }
  
  protected Object _internalEvaluate(final XCastedExpression expression, final Context ctx) {
    return this.evaluate(expression.getTarget(), ctx);
  }
  
  protected Object _internalEvaluate(final XStringLiteral it, final Context ctx) {
    return it.getValue();
  }
  
  protected Object _internalEvaluate(final XBooleanLiteral it, final Context ctx) {
    return Boolean.valueOf(it.isIsTrue());
  }
  
  protected Object _internalEvaluate(final XAnnotation literal, final Context ctx) {
    return literal;
  }
  
  protected Object _internalEvaluate(final XTypeLiteral it, final Context ctx) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined"
      + "\nThe method or field arrayDimensions is undefined"
      + "\nThe method toTypeReference(JvmType, int) from the type AbstractConstantExpressionsInterpreter refers to the missing type JvmType"
      + "\nsize cannot be resolved");
  }
  
  protected Object toTypeReference(final /* JvmType */Object type, final int arrayDimensions) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmTypeReference cannot be resolved to a type."
      + "\nThe method or field TypesFactory is undefined"
      + "\n..< cannot be resolved."
      + "\nThe method or field TypesFactory is undefined"
      + "\n=== cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateJvmParameterizedTypeReference cannot be resolved"
      + "\n=> cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateJvmGenericArrayTypeReference cannot be resolved"
      + "\nsetComponentType cannot be resolved");
  }
  
  protected Object _internalEvaluate(final XBinaryOperation it, final Context ctx) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method cloneWithExpectation(JvmTypeReference) from the type Context refers to the missing type JvmTypeReference");
  }
  
  protected Object evaluateBinaryOperation(final XBinaryOperation binaryOperation, final Object left, final Object right) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nThe method and(Object, Object) from the type ConstantOperators refers to the missing type Object"
      + "\nThe method or(Object, Object) from the type ConstantOperators refers to the missing type Object"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  protected Object _internalEvaluate(final XUnaryOperation it, final Context ctx) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved."
      + "\n! cannot be resolved."
      + "\n== cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n&& cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  protected String getOperator(final XAbstractFeatureCall call) {
    throw new Error("Unresolved compilation problems:"
      + "\nStorageAwareResource cannot be resolved to a type."
      + "\nThe method or field eResource is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field QualifiedName is undefined"
      + "\nThe method or field feature is undefined for the type XAbstractFeatureCall"
      + "\nInvalid number of arguments. The method getOperator(XAbstractFeatureCall) is not applicable for the arguments (OperatorMapping,Object)"
      + "\nType mismatch: cannot convert from OperatorMapping to XAbstractFeatureCall"
      + "\nisLoadedFromStorage cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  protected Object toText(final XExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\ngetNode cannot be resolved"
      + "\ntext cannot be resolved");
  }
  
  public Object internalEvaluate(final XExpression it, final Context ctx) {
    if (it instanceof XBinaryOperation) {
      return _internalEvaluate((XBinaryOperation)it, ctx);
    } else if (it instanceof XUnaryOperation) {
      return _internalEvaluate((XUnaryOperation)it, ctx);
    } else if (it instanceof XBooleanLiteral) {
      return _internalEvaluate((XBooleanLiteral)it, ctx);
    } else if (it instanceof XCastedExpression) {
      return _internalEvaluate((XCastedExpression)it, ctx);
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
