/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.controlflow;

import java.util.Arrays;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XBinaryOperation;
import org.eclipse.xtext.mbase.XBooleanLiteral;
import org.eclipse.xtext.mbase.XCastedExpression;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XNullLiteral;
import org.eclipse.xtext.mbase.XNumberLiteral;
import org.eclipse.xtext.mbase.XStringLiteral;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.XUnaryOperation;
import org.eclipse.xtext.mbase.controlflow.BooleanResult;
import org.eclipse.xtext.mbase.controlflow.EvaluationContext;
import org.eclipse.xtext.mbase.controlflow.EvaluationResult;
import org.eclipse.xtext.mbase.controlflow.IConstantEvaluationResult;
import org.eclipse.xtext.mbase.interpreter.ConstantExpressionEvaluationException;
import org.eclipse.xtext.mbase.interpreter.ConstantOperators;
import org.eclipse.xtext.mbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.mbase.typesystem.computation.NumberLiterals;

/**
 * Interpreter for expressions at development time that uses the static linking
 * information and hardcoded logic to apply binary operations on well known types.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Accessors(/* name is null */) */@SuppressWarnings("all")
public class ConstantConditionsInterpreter {
  /* @Inject
   */private ILogicalContainerProvider logicalContainerProvider;
  
  /* @Inject
   */private NumberLiterals numberLiterals;
  
  /* @Inject
   */private ConstantOperators constantOperators;
  
  /* @Accessors(/* name is null */)
  @Inject
   */private /* Provider<EvaluationContext> */Object evaluationContextProvider;
  
  public BooleanResult getBooleanConstantOrNull(final XExpression it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field rawValue is not visible"
      + "\nInvalid number of arguments. The constructor BooleanResult() is not applicable for the arguments (Boolean,boolean)"
      + "\nThe field rawValue is not visible");
  }
  
  public EvaluationContext newEvaluationContext() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConstantConditionsInterpreter.evaluationContextProvider refers to the missing type Provider"
      + "\nget cannot be resolved");
  }
  
  protected EvaluationResult doEvaluate(final XExpression expression, final EvaluationContext context) {
    boolean _tryNext = context.tryNext(expression);
    if (_tryNext) {
      try {
        return this.internalEvaluate(expression, context);
      } finally {
        context.done(expression);
      }
    } else {
      return EvaluationResult.NOT_A_CONSTANT;
    }
  }
  
  public IConstantEvaluationResult<Object> evaluate(final XExpression expression, final EvaluationContext context) {
    return this.doEvaluate(expression, context);
  }
  
  protected EvaluationResult _internalEvaluate(final XExpression expression, final EvaluationContext context) {
    return EvaluationResult.NOT_A_CONSTANT;
  }
  
  protected EvaluationResult _internalEvaluate(final Void nullValue, final EvaluationContext context) {
    throw new ConstantExpressionEvaluationException("null");
  }
  
  protected EvaluationResult _internalEvaluate(final XNumberLiteral it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method numberValue(Object) is undefined"
      + "\nThe method or field javaType is undefined"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)");
  }
  
  protected EvaluationResult _internalEvaluate(final XAbstractFeatureCall it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmEnumerationLiteral cannot be resolved to a type."
      + "\nJvmField cannot be resolved to a type."
      + "\nJvmIdentifiableElement cannot be resolved to a type."
      + "\nJvmFormalParameter cannot be resolved to a type."
      + "\n! cannot be resolved."
      + "\n!== cannot be resolved."
      + "\nThe method newArrayList(Object) is undefined"
      + "\nThe method newArrayList(JvmIdentifiableElement) is undefined"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (ThisReference,boolean)"
      + "\nInvalid number of arguments. The constructor ThisReference() is not applicable for the arguments (JvmIdentifiableElement)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (JvmIdentifiableElement,boolean)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nThe field rawValue is not visible"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (JvmIdentifiableElement,boolean)"
      + "\nThe method getFeature(XAbstractFeatureCall, EvaluationContext) from the type ConstantConditionsInterpreter refers to the missing type JvmIdentifiableElement"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\neIsProxy cannot be resolved"
      + "\nsetConstant cannot be resolved"
      + "\nconstant cannot be resolved"
      + "\nconstantValue cannot be resolved"
      + "\nfinal cannot be resolved"
      + "\nassociatedExpression cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nevaluateAssociatedExpression cannot be resolved"
      + "\nrawValue cannot be resolved"
      + "\nrawValue cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nassociatedExpression cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nevaluateAssociatedExpression cannot be resolved"
      + "\nrawValue cannot be resolved"
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
      + "\ndoEvaluate cannot be resolved");
  }
  
  public JvmIdentifiableElement getFeature(final XAbstractFeatureCall call, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmIdentifiableElement cannot be resolved to a type."
      + "\nThe method eGet(Object, boolean) is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field XABSTRACT_FEATURE_CALL__FEATURE is undefined for the type Class<Literals>"
      + "\nThe method getLinkedFeature(XAbstractFeatureCall) is undefined for the type IResolvedTypes"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\neIsProxy cannot be resolved");
  }
  
  public XExpression getAssociatedExpression(final /* JvmField */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\nStorageAwareResource cannot be resolved to a type."
      + "\nInvalid number of arguments. The method getAssociatedExpression(JvmField) is not applicable for the arguments (ILogicalContainerProvider,JvmField)"
      + "\nThe method getAssociatedExpression(JvmField) from the type ConstantConditionsInterpreter refers to the missing type JvmField"
      + "\neResource cannot be resolved"
      + "\nisLoadedFromStorage cannot be resolved");
  }
  
  public EvaluationResult evaluateAssociatedExpression(final XExpression it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmEnumerationLiteral cannot be resolved to a type."
      + "\nInvalid number of arguments. The method getFeature(XAbstractFeatureCall, EvaluationContext) is not applicable for the arguments (XAbstractFeatureCall)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nThe field rawValue is not visible"
      + "\nThe method getFeature(XAbstractFeatureCall, EvaluationContext) from the type ConstantConditionsInterpreter refers to the missing type JvmIdentifiableElement");
  }
  
  protected EvaluationResult _internalEvaluate(final XNullLiteral it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (null,boolean)");
  }
  
  private boolean isFrommbaseLibrary(final XAbstractFeatureCall it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmMember cannot be resolved to a type."
      + "\nThe method or field mbase_LIB is undefined for the type Class<XImportSectionNamespaceScopeProvider>"
      + "\nThe method getFeature(XAbstractFeatureCall, EvaluationContext) from the type ConstantConditionsInterpreter refers to the missing type JvmIdentifiableElement"
      + "\ndeclaringType cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  protected EvaluationResult _internalEvaluate(final XUnaryOperation it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved."
      + "\n! cannot be resolved."
      + "\n== cannot be resolved."
      + "\nThe field rawValue is not visible"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nThe field rawValue is not visible"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\n&& cannot be resolved"
      + "\n&& cannot be resolved");
  }
  
  protected EvaluationResult _internalEvaluate(final XBinaryOperation it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\n!== cannot be resolved."
      + "\n&& cannot be resolved."
      + "\n&& cannot be resolved."
      + "\n|| cannot be resolved."
      + "\n&& cannot be resolved."
      + "\n|| cannot be resolved."
      + "\n! cannot be resolved."
      + "\n&& cannot be resolved."
      + "\n&& cannot be resolved."
      + "\n&& cannot be resolved."
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nThe field rawValue is not visible"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,Object)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,Object)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,Object)"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,Object)");
  }
  
  protected EvaluationResult _internalLogicalAnd(final Object left, final Object right, final boolean compileTimeConstant) {
    return EvaluationResult.NOT_A_CONSTANT;
  }
  
  protected EvaluationResult _internalLogicalAnd(final Boolean left, final Boolean right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)");
  }
  
  protected EvaluationResult _internalLogicalAnd(final Boolean left, final Object right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Boolean,boolean)");
  }
  
  protected EvaluationResult _internalLogicalAnd(final Boolean left, final Void right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Boolean,boolean)");
  }
  
  protected EvaluationResult _internalLogicalAnd(final Object left, final Boolean right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Boolean,boolean)");
  }
  
  protected EvaluationResult _internalLogicalAnd(final Void left, final Boolean right, final boolean compileTimeConstant) {
    return EvaluationResult.NOT_A_CONSTANT;
  }
  
  protected EvaluationResult _internalLogicalOr(final Object left, final Object right, final boolean compileTimeConstant) {
    return EvaluationResult.NOT_A_CONSTANT;
  }
  
  protected EvaluationResult _internalLogicalOr(final Boolean left, final Boolean right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\n|| cannot be resolved."
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Object,boolean)");
  }
  
  protected EvaluationResult _internalLogicalOr(final Boolean left, final Object right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Boolean,boolean)");
  }
  
  protected EvaluationResult _internalLogicalOr(final Boolean left, final Void right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Boolean,boolean)");
  }
  
  protected EvaluationResult _internalLogicalOr(final Object left, final Boolean right, final boolean compileTimeConstant) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (Boolean,boolean)");
  }
  
  protected EvaluationResult _internalLogicalOr(final Void left, final Boolean right, final boolean compileTimeConstant) {
    return EvaluationResult.NOT_A_CONSTANT;
  }
  
  protected EvaluationResult _internalEvaluate(final XCastedExpression expression, final EvaluationContext context) {
    return this.doEvaluate(expression.getTarget(), context);
  }
  
  protected EvaluationResult _internalEvaluate(final XStringLiteral it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (String,boolean)");
  }
  
  protected EvaluationResult _internalEvaluate(final XBooleanLiteral it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (boolean,boolean)");
  }
  
  protected EvaluationResult _internalEvaluate(final XTypeLiteral it, final EvaluationContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor EvaluationResult() is not applicable for the arguments (XTypeLiteral,boolean)");
  }
  
  public EvaluationResult internalEvaluate(final XExpression it, final EvaluationContext context) {
    if (it instanceof XBinaryOperation) {
      return _internalEvaluate((XBinaryOperation)it, context);
    } else if (it instanceof XUnaryOperation) {
      return _internalEvaluate((XUnaryOperation)it, context);
    } else if (it instanceof XAbstractFeatureCall) {
      return _internalEvaluate((XAbstractFeatureCall)it, context);
    } else if (it instanceof XBooleanLiteral) {
      return _internalEvaluate((XBooleanLiteral)it, context);
    } else if (it instanceof XCastedExpression) {
      return _internalEvaluate((XCastedExpression)it, context);
    } else if (it instanceof XNullLiteral) {
      return _internalEvaluate((XNullLiteral)it, context);
    } else if (it instanceof XNumberLiteral) {
      return _internalEvaluate((XNumberLiteral)it, context);
    } else if (it instanceof XStringLiteral) {
      return _internalEvaluate((XStringLiteral)it, context);
    } else if (it instanceof XTypeLiteral) {
      return _internalEvaluate((XTypeLiteral)it, context);
    } else if (it == null) {
      return _internalEvaluate((Void)null, context);
    } else if (it != null) {
      return _internalEvaluate(it, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, context).toString());
    }
  }
  
  public EvaluationResult internalLogicalAnd(final Object left, final Object right, final boolean compileTimeConstant) {
    if (left instanceof Boolean
         && right instanceof Boolean) {
      return _internalLogicalAnd((Boolean)left, (Boolean)right, compileTimeConstant);
    } else if (left instanceof Boolean
         && right == null) {
      return _internalLogicalAnd((Boolean)left, (Void)null, compileTimeConstant);
    } else if (left instanceof Boolean
         && right != null) {
      return _internalLogicalAnd((Boolean)left, right, compileTimeConstant);
    } else if (left == null
         && right instanceof Boolean) {
      return _internalLogicalAnd((Void)null, (Boolean)right, compileTimeConstant);
    } else if (left != null
         && right instanceof Boolean) {
      return _internalLogicalAnd(left, (Boolean)right, compileTimeConstant);
    } else if (left != null
         && right != null) {
      return _internalLogicalAnd(left, right, compileTimeConstant);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(left, right, compileTimeConstant).toString());
    }
  }
  
  public EvaluationResult internalLogicalOr(final Object left, final Object right, final boolean compileTimeConstant) {
    if (left instanceof Boolean
         && right instanceof Boolean) {
      return _internalLogicalOr((Boolean)left, (Boolean)right, compileTimeConstant);
    } else if (left instanceof Boolean
         && right == null) {
      return _internalLogicalOr((Boolean)left, (Void)null, compileTimeConstant);
    } else if (left instanceof Boolean
         && right != null) {
      return _internalLogicalOr((Boolean)left, right, compileTimeConstant);
    } else if (left == null
         && right instanceof Boolean) {
      return _internalLogicalOr((Void)null, (Boolean)right, compileTimeConstant);
    } else if (left != null
         && right instanceof Boolean) {
      return _internalLogicalOr(left, (Boolean)right, compileTimeConstant);
    } else if (left != null
         && right != null) {
      return _internalLogicalOr(left, right, compileTimeConstant);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(left, right, compileTimeConstant).toString());
    }
  }
}
