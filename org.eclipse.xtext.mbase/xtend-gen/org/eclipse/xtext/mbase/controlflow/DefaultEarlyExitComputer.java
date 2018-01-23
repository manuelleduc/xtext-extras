/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.controlflow;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XBasicForLoopExpression;
import org.eclipse.xtext.mbase.XBlockExpression;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XDoWhileExpression;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XForLoopExpression;
import org.eclipse.xtext.mbase.XIfExpression;
import org.eclipse.xtext.mbase.XReturnExpression;
import org.eclipse.xtext.mbase.XSwitchExpression;
import org.eclipse.xtext.mbase.XSynchronizedExpression;
import org.eclipse.xtext.mbase.XThrowExpression;
import org.eclipse.xtext.mbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.mbase.XVariableDeclaration;
import org.eclipse.xtext.mbase.XWhileExpression;
import org.eclipse.xtext.mbase.controlflow.EarlyExitInterpreter;
import org.eclipse.xtext.mbase.controlflow.IEarlyExitComputer;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
/* @Singleton */@SuppressWarnings("all")
public class DefaultEarlyExitComputer implements IEarlyExitComputer {
  /* @Inject
   */private EarlyExitInterpreter earlyExitInterpreter;
  
  @Override
  public boolean isEarlyExit(final XExpression expression) {
    Collection<IEarlyExitComputer.ExitPoint> exitPoints = this.getExitPoints(expression);
    boolean _isNotEmpty = this.isNotEmpty(exitPoints);
    if (_isNotEmpty) {
      return true;
    }
    return false;
  }
  
  protected boolean isNotEmpty(final Collection<IEarlyExitComputer.ExitPoint> exitPoints) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\n! cannot be resolved."
      + "\n&& cannot be resolved");
  }
  
  @Override
  public Collection<IEarlyExitComputer.ExitPoint> getExitPoints(final XExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved.");
  }
  
  /**
   * @param expression unused in this context but required in dispatch signature
   */
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XExpression expression) {
    return Collections.<IEarlyExitComputer.ExitPoint>emptyList();
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XReturnExpression expression) {
    IEarlyExitComputer.ExitPoint _exitPoint = new IEarlyExitComputer.ExitPoint(expression, false);
    return Collections.<IEarlyExitComputer.ExitPoint>singletonList(_exitPoint);
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XThrowExpression expression) {
    IEarlyExitComputer.ExitPoint _exitPoint = new IEarlyExitComputer.ExitPoint(expression, true);
    return Collections.<IEarlyExitComputer.ExitPoint>singletonList(_exitPoint);
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XBlockExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getExpressions() is undefined for the type XBlockExpression");
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XBasicForLoopExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getInitExpressions() is undefined for the type XBasicForLoopExpression"
      + "\n=== cannot be resolved."
      + "\nThe method getUpdateExpressions() is undefined for the type XBasicForLoopExpression"
      + "\n|| cannot be resolved");
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XForLoopExpression expression) {
    Collection<IEarlyExitComputer.ExitPoint> exitPoints = this.getExitPoints(expression.getForExpression());
    boolean _isNotEmpty = this.isNotEmpty(exitPoints);
    if (_isNotEmpty) {
      return exitPoints;
    }
    return Collections.<IEarlyExitComputer.ExitPoint>emptyList();
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XWhileExpression expression) {
    Collection<IEarlyExitComputer.ExitPoint> exitPoints = this.getExitPoints(expression.getPredicate());
    boolean _isNotEmpty = this.isNotEmpty(exitPoints);
    if (_isNotEmpty) {
      return exitPoints;
    }
    boolean _isBooleanConstant = this.isBooleanConstant(expression.getPredicate(), true);
    if (_isBooleanConstant) {
      exitPoints = this.getExitPoints(expression.getBody());
      boolean _isNotEmpty_1 = this.isNotEmpty(exitPoints);
      if (_isNotEmpty_1) {
        return exitPoints;
      }
      IEarlyExitComputer.ExitPoint _exitPoint = new IEarlyExitComputer.ExitPoint(expression, false);
      return Collections.<IEarlyExitComputer.ExitPoint>singletonList(_exitPoint);
    }
    return Collections.<IEarlyExitComputer.ExitPoint>emptyList();
  }
  
  protected boolean isBooleanConstant(final XExpression expression, final boolean value) {
    return this.earlyExitInterpreter.isConstant(expression, Boolean.valueOf(value));
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XDoWhileExpression expression) {
    Collection<IEarlyExitComputer.ExitPoint> exitPoints = this.getExitPoints(expression.getBody());
    boolean _isNotEmpty = this.isNotEmpty(exitPoints);
    if (_isNotEmpty) {
      return exitPoints;
    }
    exitPoints = this.getExitPoints(expression.getPredicate());
    boolean _isNotEmpty_1 = this.isNotEmpty(exitPoints);
    if (_isNotEmpty_1) {
      return exitPoints;
    }
    boolean _isBooleanConstant = this.isBooleanConstant(expression.getPredicate(), true);
    if (_isBooleanConstant) {
      IEarlyExitComputer.ExitPoint _exitPoint = new IEarlyExitComputer.ExitPoint(expression, false);
      return Collections.<IEarlyExitComputer.ExitPoint>singletonList(_exitPoint);
    }
    return Collections.<IEarlyExitComputer.ExitPoint>emptyList();
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XVariableDeclaration expression) {
    return this.getExitPoints(expression.getRight());
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XIfExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\nThe method or field Lists is undefined"
      + "\nnewArrayList cannot be resolved");
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XSwitchExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Lists is undefined"
      + "\nThe method getCases() is undefined for the type XSwitchExpression"
      + "\n!== cannot be resolved."
      + "\n! cannot be resolved."
      + "\n! cannot be resolved."
      + "\nnewArrayList cannot be resolved");
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XAbstractFeatureCall expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getActualArguments() is undefined for the type XAbstractFeatureCall");
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XConstructorCall expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getArguments() is undefined for the type XConstructorCall");
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XTryCatchFinallyExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Lists is undefined"
      + "\nThe method getCatchClauses() is undefined for the type XTryCatchFinallyExpression"
      + "\nnewArrayList cannot be resolved");
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> _exitPoints(final XSynchronizedExpression expression) {
    Collection<IEarlyExitComputer.ExitPoint> paramExitPoints = this.getExitPoints(expression.getParam());
    boolean _isNotEmpty = this.isNotEmpty(paramExitPoints);
    if (_isNotEmpty) {
      return paramExitPoints;
    }
    return this.getExitPoints(expression.getExpression());
  }
  
  protected Collection<IEarlyExitComputer.ExitPoint> exitPoints(final XExpression expression) {
    if (expression instanceof XDoWhileExpression) {
      return _exitPoints((XDoWhileExpression)expression);
    } else if (expression instanceof XWhileExpression) {
      return _exitPoints((XWhileExpression)expression);
    } else if (expression instanceof XAbstractFeatureCall) {
      return _exitPoints((XAbstractFeatureCall)expression);
    } else if (expression instanceof XBasicForLoopExpression) {
      return _exitPoints((XBasicForLoopExpression)expression);
    } else if (expression instanceof XBlockExpression) {
      return _exitPoints((XBlockExpression)expression);
    } else if (expression instanceof XConstructorCall) {
      return _exitPoints((XConstructorCall)expression);
    } else if (expression instanceof XForLoopExpression) {
      return _exitPoints((XForLoopExpression)expression);
    } else if (expression instanceof XIfExpression) {
      return _exitPoints((XIfExpression)expression);
    } else if (expression instanceof XReturnExpression) {
      return _exitPoints((XReturnExpression)expression);
    } else if (expression instanceof XSwitchExpression) {
      return _exitPoints((XSwitchExpression)expression);
    } else if (expression instanceof XSynchronizedExpression) {
      return _exitPoints((XSynchronizedExpression)expression);
    } else if (expression instanceof XThrowExpression) {
      return _exitPoints((XThrowExpression)expression);
    } else if (expression instanceof XTryCatchFinallyExpression) {
      return _exitPoints((XTryCatchFinallyExpression)expression);
    } else if (expression instanceof XVariableDeclaration) {
      return _exitPoints((XVariableDeclaration)expression);
    } else if (expression != null) {
      return _exitPoints(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
