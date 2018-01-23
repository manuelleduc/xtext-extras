/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.annotations.validation;

import java.util.Arrays;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XListLiteral;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.mbase.validation.ConstantExpressionValidator;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class AnnotationValueValidator extends ConstantExpressionValidator {
  public void validateAnnotationValue(final XExpression value, final /* ValidationMessageAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nThe method or field ValidationMessageAcceptor is undefined"
      + "\nacceptError cannot be resolved"
      + "\nINSIGNIFICANT_INDEX cannot be resolved");
  }
  
  protected boolean _isValidAnnotationValue(final XExpression expression) {
    return super.isConstant(expression);
  }
  
  protected boolean _isValidAnnotationValue(final Void nullValue) {
    return true;
  }
  
  protected boolean _isValidAnnotationValue(final XListLiteral expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field elements is undefined for the type XListLiteral"
      + "\nThe method or field elements is undefined for the type XListLiteral"
      + "\nType mismatch: cannot convert implicit first argument from AnnotationValueValidator to XExpression"
      + "\nempty cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nforall cannot be resolved");
  }
  
  protected boolean _isValidAnnotationValue(final XAnnotation expression) {
    return true;
  }
  
  protected boolean _isValidAnnotationValue(final XAbstractFeatureCall expression) {
    boolean _isTypeLiteral = expression.isTypeLiteral();
    if (_isTypeLiteral) {
      return true;
    }
    return super.isConstant(expression);
  }
  
  protected boolean isValidAnnotationValue(final XExpression expression) {
    if (expression instanceof XListLiteral) {
      return _isValidAnnotationValue((XListLiteral)expression);
    } else if (expression instanceof XAbstractFeatureCall) {
      return _isValidAnnotationValue((XAbstractFeatureCall)expression);
    } else if (expression instanceof XAnnotation) {
      return _isValidAnnotationValue((XAnnotation)expression);
    } else if (expression == null) {
      return _isValidAnnotationValue((Void)null);
    } else if (expression != null) {
      return _isValidAnnotationValue(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
