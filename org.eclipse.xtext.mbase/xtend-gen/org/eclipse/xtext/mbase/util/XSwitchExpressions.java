/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.util;

import com.google.inject.Inject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.mbase.XCasePart;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XSwitchExpression;
import org.eclipse.xtext.mbase.interpreter.ConstantExpressionEvaluationException;
import org.eclipse.xtext.mbase.interpreter.SwitchConstantExpressionsInterpreter;
import org.eclipse.xtext.mbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class XSwitchExpressions {
  @Inject
  @Extension
  private IBatchTypeResolver _iBatchTypeResolver;
  
  @Inject
  @Extension
  private SwitchConstantExpressionsInterpreter _switchConstantExpressionsInterpreter;
  
  /**
   * Determine whether the given switch expression is valid for Java version 6 or lower.
   */
  public boolean isJavaSwitchExpression(final XSwitchExpression it) {
    boolean _xblockexpression = false;
    {
      final LightweightTypeReference switchType = this.getSwitchVariableType(it);
      if ((switchType == null)) {
        return false;
      }
      boolean _isSubtypeOf = switchType.isSubtypeOf(Integer.TYPE);
      if (_isSubtypeOf) {
        return true;
      }
      boolean _isSubtypeOf_1 = switchType.isSubtypeOf(Enum.class);
      if (_isSubtypeOf_1) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  /**
   * Determine whether the given switch expression is valid for Java version 7 or higher.
   */
  public boolean isJava7SwitchExpression(final XSwitchExpression it) {
    boolean _xblockexpression = false;
    {
      final LightweightTypeReference switchType = this.getSwitchVariableType(it);
      if ((switchType == null)) {
        return false;
      }
      boolean _isSubtypeOf = switchType.isSubtypeOf(Integer.TYPE);
      if (_isSubtypeOf) {
        return true;
      }
      boolean _isSubtypeOf_1 = switchType.isSubtypeOf(Enum.class);
      if (_isSubtypeOf_1) {
        return true;
      }
      boolean _isSubtypeOf_2 = switchType.isSubtypeOf(String.class);
      if (_isSubtypeOf_2) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public boolean isJavaCaseExpression(final XSwitchExpression it, final XCasePart casePart) {
    boolean _xblockexpression = false;
    {
      JvmTypeReference _typeGuard = casePart.getTypeGuard();
      boolean _tripleNotEquals = (_typeGuard != null);
      if (_tripleNotEquals) {
        return false;
      }
      final XExpression case_ = casePart.getCase();
      if ((case_ == null)) {
        return false;
      }
      @Extension
      final IResolvedTypes resolvedTypes = this._iBatchTypeResolver.resolveTypes(it);
      final LightweightTypeReference caseType = resolvedTypes.getActualType(case_);
      if ((caseType == null)) {
        return false;
      }
      final LightweightTypeReference switchType = this.getSwitchVariableType(it);
      boolean _isAssignableFrom = switchType.isAssignableFrom(caseType);
      boolean _not = (!_isAssignableFrom);
      if (_not) {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  public LightweightTypeReference getSwitchVariableType(final XSwitchExpression it) {
    @Extension
    final IResolvedTypes resolvedTypes = this._iBatchTypeResolver.resolveTypes(it);
    final JvmFormalParameter declaredParam = it.getDeclaredParam();
    if ((declaredParam == null)) {
      return resolvedTypes.getActualType(it.getSwitch());
    }
    final LightweightTypeReference paramType = resolvedTypes.getActualType(declaredParam);
    LightweightTypeReference _elvis = null;
    if (paramType != null) {
      _elvis = paramType;
    } else {
      LightweightTypeReference _actualType = resolvedTypes.getActualType(it.getSwitch());
      _elvis = _actualType;
    }
    return _elvis;
  }
  
  public boolean isConstant(final XCasePart casePart) {
    final XExpression case_ = casePart.getCase();
    if ((case_ == null)) {
      return false;
    }
    try {
      this._switchConstantExpressionsInterpreter.evaluate(case_);
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof ConstantExpressionEvaluationException) {
        final ConstantExpressionEvaluationException e = (ConstantExpressionEvaluationException)_t;
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public XExpression getThen(final XCasePart casePart, final XSwitchExpression switchExpression) {
    final XExpression then = casePart.getThen();
    if ((then != null)) {
      return then;
    }
    final int casePartIndex = switchExpression.getCases().indexOf(casePart);
    if ((casePartIndex == (-1))) {
      return null;
    }
    final int count = switchExpression.getCases().size();
    if ((casePartIndex == (count - 1))) {
      return switchExpression.getDefault();
    }
    if (((casePartIndex + 1) < count)) {
      return this.getThen(switchExpression.getCases().get((casePartIndex + 1)), switchExpression);
    }
    return null;
  }
}
