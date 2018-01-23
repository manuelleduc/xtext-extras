/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.validation;

import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XBlockExpression;
import org.eclipse.xtext.mbase.XBooleanLiteral;
import org.eclipse.xtext.mbase.XCasePart;
import org.eclipse.xtext.mbase.XCastedExpression;
import org.eclipse.xtext.mbase.XCatchClause;
import org.eclipse.xtext.mbase.XClosure;
import org.eclipse.xtext.mbase.XCollectionLiteral;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XIfExpression;
import org.eclipse.xtext.mbase.XInstanceOfExpression;
import org.eclipse.xtext.mbase.XNullLiteral;
import org.eclipse.xtext.mbase.XNumberLiteral;
import org.eclipse.xtext.mbase.XStringLiteral;
import org.eclipse.xtext.mbase.XSwitchExpression;
import org.eclipse.xtext.mbase.XSynchronizedExpression;
import org.eclipse.xtext.mbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.lib.IterableExtensions;
import org.eclipse.xtext.mbase.validation.ImplicitReturnFinder;

/**
 * @author Stefan Oehme - Initial contribution and API
 */
@SuppressWarnings("all")
public class mbaseImplicitReturnFinder implements ImplicitReturnFinder {
  protected void _findImplicitReturns(final Void expression, final ImplicitReturnFinder.Acceptor acceptor) {
  }
  
  protected void _findImplicitReturns(final XExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
  }
  
  protected void _findImplicitReturns(final XNumberLiteral expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XBooleanLiteral expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XCollectionLiteral expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XStringLiteral expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XNullLiteral expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XTypeLiteral expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XClosure expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XConstructorCall expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XAbstractFeatureCall expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XInstanceOfExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XCastedExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    acceptor.accept(expression);
  }
  
  protected void _findImplicitReturns(final XBlockExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    this.findImplicitReturns(IterableExtensions.<XExpression>last(expression.getExpressions()), acceptor);
  }
  
  protected void _findImplicitReturns(final XSynchronizedExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    this.findImplicitReturns(expression.getExpression(), acceptor);
  }
  
  protected void _findImplicitReturns(final XIfExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    this.findImplicitReturns(expression.getThen(), acceptor);
    this.findImplicitReturns(expression.getElse(), acceptor);
  }
  
  protected void _findImplicitReturns(final XTryCatchFinallyExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    this.findImplicitReturns(expression.getExpression(), acceptor);
    final Consumer<XCatchClause> _function = (XCatchClause it) -> {
      this.findImplicitReturns(it.getExpression(), acceptor);
    };
    expression.getCatchClauses().forEach(_function);
  }
  
  protected void _findImplicitReturns(final XSwitchExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    final Consumer<XCasePart> _function = (XCasePart it) -> {
      this.findImplicitReturns(it.getThen(), acceptor);
    };
    expression.getCases().forEach(_function);
    this.findImplicitReturns(expression.getDefault(), acceptor);
  }
  
  public void findImplicitReturns(final XExpression expression, final ImplicitReturnFinder.Acceptor acceptor) {
    if (expression instanceof XAbstractFeatureCall) {
      _findImplicitReturns((XAbstractFeatureCall)expression, acceptor);
      return;
    } else if (expression instanceof XBlockExpression) {
      _findImplicitReturns((XBlockExpression)expression, acceptor);
      return;
    } else if (expression instanceof XBooleanLiteral) {
      _findImplicitReturns((XBooleanLiteral)expression, acceptor);
      return;
    } else if (expression instanceof XCastedExpression) {
      _findImplicitReturns((XCastedExpression)expression, acceptor);
      return;
    } else if (expression instanceof XClosure) {
      _findImplicitReturns((XClosure)expression, acceptor);
      return;
    } else if (expression instanceof XCollectionLiteral) {
      _findImplicitReturns((XCollectionLiteral)expression, acceptor);
      return;
    } else if (expression instanceof XConstructorCall) {
      _findImplicitReturns((XConstructorCall)expression, acceptor);
      return;
    } else if (expression instanceof XIfExpression) {
      _findImplicitReturns((XIfExpression)expression, acceptor);
      return;
    } else if (expression instanceof XInstanceOfExpression) {
      _findImplicitReturns((XInstanceOfExpression)expression, acceptor);
      return;
    } else if (expression instanceof XNullLiteral) {
      _findImplicitReturns((XNullLiteral)expression, acceptor);
      return;
    } else if (expression instanceof XNumberLiteral) {
      _findImplicitReturns((XNumberLiteral)expression, acceptor);
      return;
    } else if (expression instanceof XStringLiteral) {
      _findImplicitReturns((XStringLiteral)expression, acceptor);
      return;
    } else if (expression instanceof XSwitchExpression) {
      _findImplicitReturns((XSwitchExpression)expression, acceptor);
      return;
    } else if (expression instanceof XSynchronizedExpression) {
      _findImplicitReturns((XSynchronizedExpression)expression, acceptor);
      return;
    } else if (expression instanceof XTryCatchFinallyExpression) {
      _findImplicitReturns((XTryCatchFinallyExpression)expression, acceptor);
      return;
    } else if (expression instanceof XTypeLiteral) {
      _findImplicitReturns((XTypeLiteral)expression, acceptor);
      return;
    } else if (expression != null) {
      _findImplicitReturns(expression, acceptor);
      return;
    } else if (expression == null) {
      _findImplicitReturns((Void)null, acceptor);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, acceptor).toString());
    }
  }
}
