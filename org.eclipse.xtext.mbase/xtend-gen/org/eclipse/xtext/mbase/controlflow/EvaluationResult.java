/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.controlflow;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.controlflow.IConstantEvaluationResult;
import org.eclipse.xtext.mbase.controlflow.ThisReference;

/* @Data */@SuppressWarnings("all")
class EvaluationResult implements IConstantEvaluationResult<Object> {
  protected final static EvaluationResult NOT_A_CONSTANT /* Skipped initializer because of errors */;
  
  private Object rawValue;
  
  private boolean compileTimeConstant;
  
  public boolean isNotAConstant() {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved.");
  }
  
  @Override
  public /* Optional<Object> */Object getValue() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Optional is undefined"
      + "\nfromNullable cannot be resolved");
  }
  
  public Object equalValue(final EvaluationResult other) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method equalValue(JvmType, Object) from the type EvaluationResult refers to the missing type JvmType");
  }
  
  private Object _equalValue(final Object myValue, final Object otherValue) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved.");
  }
  
  private Object _equalValue(final Void myValue, final Object otherValue) {
    return Boolean.valueOf(false);
  }
  
  private Object _equalValue(final Object myValue, final /* JvmIdentifiableElement */Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final Object myValue, final ThisReference otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final ThisReference myValue, final Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final ThisReference myValue, final ThisReference otherValue) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved.");
  }
  
  private Object _equalValue(final Void myValue, final /* JvmIdentifiableElement */Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final Object myValue, final List<?> otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final Void myValue, final List<?> otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final Void myValue, final /* JvmType */Object otherValue) {
    return Boolean.valueOf(false);
  }
  
  private Object _equalValue(final Void myValue, final Void otherValue) {
    return Boolean.valueOf(true);
  }
  
  private Object _equalValue(final Object myValue, final Void otherValue) {
    return Boolean.valueOf(false);
  }
  
  private Object _equalValue(final /* JvmType */Object myValue, final /* JvmIdentifiableElement */Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final /* JvmIdentifiableElement */Object myValue, final Void otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final /* JvmIdentifiableElement */Object myValue, final /* JvmType */Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final /* JvmIdentifiableElement */Object myValue, final Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final List<?> myValue, final Void otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final List<?> myValue, final Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final List<?> myValue, final List<?> otherValue) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved.");
  }
  
  private Object _equalValue(final /* JvmIdentifiableElement */Object myValue, final /* JvmIdentifiableElement */Object otherValue) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved");
  }
  
  private Object _equalValue(final /* JvmFormalParameter */Object myValue, final /* JvmFormalParameter */Object otherValue) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved");
  }
  
  private Object _equalValue(final /* JvmEnumerationLiteral */Object myValue, final /* JvmIdentifiableElement */Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final /* JvmIdentifiableElement */Object myValue, final /* JvmEnumerationLiteral */Object otherValue) {
    return EvaluationResult.NOT_A_CONSTANT.rawValue;
  }
  
  private Object _equalValue(final /* JvmEnumerationLiteral */Object myValue, final /* JvmEnumerationLiteral */Object otherValue) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved");
  }
  
  private Object _equalValue(final /* JvmType */Object myValue, final Void otherValue) {
    return Boolean.valueOf(false);
  }
  
  private Object _equalValue(final XTypeLiteral myValue, final XTypeLiteral otherTypeLiteral) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type XTypeLiteral"
      + "\nThe method or field type is undefined for the type XTypeLiteral"
      + "\nThe method or field arrayDimensions is undefined for the type XTypeLiteral"
      + "\nThe method or field arrayDimensions is undefined for the type XTypeLiteral"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  private Object _equalValue(final /* JvmType */Object myValue, final XTypeLiteral otherTypeLiteral) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type XTypeLiteral"
      + "\nThe method or field arrayDimensions is undefined for the type XTypeLiteral"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nempty cannot be resolved");
  }
  
  private Object _equalValue(final XTypeLiteral myValue, final /* JvmType */Object otherType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined for the type XTypeLiteral"
      + "\nThe method or field arrayDimensions is undefined for the type XTypeLiteral"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nempty cannot be resolved");
  }
  
  private Object _equalValue(final /* JvmType */Object myValue, final ThisReference otherValue) {
    return Boolean.valueOf(false);
  }
  
  private Object _equalValue(final ThisReference myValue, final /* JvmType */Object otherValue) {
    return Boolean.valueOf(false);
  }
  
  private Object _equalValue(final XTypeLiteral myValue, final ThisReference otherType) {
    return Boolean.valueOf(false);
  }
  
  private Object _equalValue(final ThisReference myValue, final XTypeLiteral otherType) {
    return Boolean.valueOf(false);
  }
  
  private Object equalValue(final JvmType myValue, final Object otherValue) {
    if (myValue != null
         && otherValue instanceof List) {
      return _equalValue(myValue, (List<?>)otherValue);
    } else if (myValue != null
         && otherValue == null) {
      return _equalValue(myValue, (Void)null);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else if (myValue != null
         && otherValue instanceof XTypeLiteral) {
      return _equalValue(myValue, (XTypeLiteral)otherValue);
    } else if (myValue != null
         && otherValue instanceof ThisReference) {
      return _equalValue(myValue, (ThisReference)otherValue);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else if (myValue == null
         && otherValue instanceof List) {
      return _equalValue(null, (List<?>)otherValue);
    } else if (myValue != null
         && otherValue instanceof XTypeLiteral) {
      return _equalValue(myValue, (XTypeLiteral)otherValue);
    } else if (myValue != null
         && otherValue instanceof XTypeLiteral) {
      return _equalValue(myValue, (XTypeLiteral)otherValue);
    } else if (myValue == null
         && otherValue == null) {
      return _equalValue(null, (Void)null);
    } else if (myValue == null
         && otherValue != null) {
      return _equalValue(null, otherValue);
    } else if (myValue != null
         && otherValue instanceof ThisReference) {
      return _equalValue(myValue, (ThisReference)otherValue);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else if (myValue != null
         && otherValue == null) {
      return _equalValue(myValue, (Void)null);
    } else if (myValue != null
         && otherValue instanceof ThisReference) {
      return _equalValue(myValue, (ThisReference)otherValue);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else if (myValue == null
         && otherValue != null) {
      return _equalValue(null, otherValue);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else if (myValue != null
         && otherValue instanceof List) {
      return _equalValue(myValue, (List<?>)otherValue);
    } else if (myValue != null
         && otherValue == null) {
      return _equalValue(myValue, (Void)null);
    } else if (myValue != null
         && otherValue instanceof ThisReference) {
      return _equalValue(myValue, (ThisReference)otherValue);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else if (myValue != null
         && otherValue != null) {
      return _equalValue(myValue, otherValue);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(myValue, otherValue).toString());
    }
  }
}
