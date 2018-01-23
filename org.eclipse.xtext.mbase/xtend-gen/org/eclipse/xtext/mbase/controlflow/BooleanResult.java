/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.controlflow;

import org.eclipse.xtext.mbase.controlflow.IConstantEvaluationResult;

/* @Data */@SuppressWarnings("all")
public class BooleanResult implements IConstantEvaluationResult<Boolean> {
  /* @Accessors(/* name is null */)
   */private Boolean value;
  
  private boolean compileTimeConstant;
  
  @Override
  public /* Optional<Boolean> */Object getValue() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Optional is undefined"
      + "\nfromNullable cannot be resolved");
  }
}
