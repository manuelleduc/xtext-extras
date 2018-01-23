/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.interpreter;

import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.mbase.XExpression;

/* @Data */@SuppressWarnings("all")
public class Context {
  private /* JvmTypeReference */Object expectedType;
  
  private /* ClassFinder */Object classFinder;
  
  private /* Map<String, JvmIdentifiableElement> */Object visibleFeatures;
  
  private Set<XExpression> alreadyEvaluating;
  
  public Context cloneWithExpectation(final /* JvmTypeReference */Object newExpectation) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor Context() is not applicable for the arguments (JvmTypeReference,ClassFinder,Map<String, JvmIdentifiableElement>,Set<XExpression>)"
      + "\nThe field Context.classFinder refers to the missing type ClassFinder"
      + "\nThe field Context.visibleFeatures refers to the missing type JvmIdentifiableElement");
  }
}
