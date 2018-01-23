/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.validation;

import java.util.Arrays;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XBooleanLiteral;
import org.eclipse.xtext.mbase.XCastedExpression;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XNumberLiteral;
import org.eclipse.xtext.mbase.XStringLiteral;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.mbase.util.XExpressionHelper;

/**
 * Checks whether a given XExpression is a a constant expression.
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public class ConstantExpressionValidator {
  /* @Inject
   */private /* TypeReferences */Object _typeReferences;
  
  /* @Inject
   */private /* Primitives */Object _primitives;
  
  /* @Inject
   */private XExpressionHelper _xExpressionHelper;
  
  /* @Inject
   */private ILogicalContainerProvider _iLogicalContainerProvider;
  
  protected boolean _isConstant(final XExpression expression) {
    return false;
  }
  
  protected boolean _isConstant(final XStringLiteral expression) {
    return true;
  }
  
  protected boolean _isConstant(final XTypeLiteral expression) {
    return true;
  }
  
  protected boolean _isConstant(final XNumberLiteral expression) {
    return true;
  }
  
  protected boolean _isConstant(final XBooleanLiteral expression) {
    return true;
  }
  
  protected boolean _isConstant(final XCastedExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type XCastedExpression"
      + "\nThe method or field type is undefined for the type XCastedExpression"
      + "\nprimitive cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nis cannot be resolved");
  }
  
  protected boolean _isConstant(final XAbstractFeatureCall expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmEnumerationLiteral cannot be resolved to a type."
      + "\nJvmField cannot be resolved to a type."
      + "\nTypeResource cannot be resolved to a type."
      + "\nJvmOperation cannot be resolved to a type."
      + "\nEObject cannot be resolved to a type."
      + "\nThe method or field feature is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field findInlineAnnotation is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field JvmBooleanAnnotationValue is undefined"
      + "\nThe method or field valueName is undefined"
      + "\nThe method or field values is undefined"
      + "\n=== cannot be resolved."
      + "\n&& cannot be resolved."
      + "\nThe method or field actualArguments is undefined for the type XAbstractFeatureCall"
      + "\nType mismatch: cannot convert implicit first argument from ConstantExpressionValidator to XExpression"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nsetConstant cannot be resolved"
      + "\nconstant cannot be resolved"
      + "\nstatic cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nfinal cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nassociatedExpression cannot be resolved"
      + "\nconstantExpression cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nexists cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nbooleanValue cannot be resolved"
      + "\nforall cannot be resolved"
      + "\nwriteable cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nright cannot be resolved"
      + "\nconstantExpression cannot be resolved"
      + "\n^switch cannot be resolved"
      + "\nconstantExpression cannot be resolved"
      + "\neIsProxy cannot be resolved");
  }
  
  protected boolean _isConstantExpression(final Void it) {
    return false;
  }
  
  protected boolean _isConstantExpression(final XExpression it) {
    return this.isConstant(it);
  }
  
  protected boolean _isConstantExpression(final XAbstractFeatureCall it) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmEnumerationLiteral cannot be resolved to a type."
      + "\nThe method or field feature is undefined");
  }
  
  public boolean isConstant(final XExpression expression) {
    if (expression instanceof XAbstractFeatureCall) {
      return _isConstant((XAbstractFeatureCall)expression);
    } else if (expression instanceof XBooleanLiteral) {
      return _isConstant((XBooleanLiteral)expression);
    } else if (expression instanceof XCastedExpression) {
      return _isConstant((XCastedExpression)expression);
    } else if (expression instanceof XNumberLiteral) {
      return _isConstant((XNumberLiteral)expression);
    } else if (expression instanceof XStringLiteral) {
      return _isConstant((XStringLiteral)expression);
    } else if (expression instanceof XTypeLiteral) {
      return _isConstant((XTypeLiteral)expression);
    } else if (expression != null) {
      return _isConstant(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public boolean isConstantExpression(final XExpression it) {
    if (it instanceof XAbstractFeatureCall) {
      return _isConstantExpression((XAbstractFeatureCall)it);
    } else if (it == null) {
      return _isConstantExpression((Void)null);
    } else if (it != null) {
      return _isConstantExpression(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
