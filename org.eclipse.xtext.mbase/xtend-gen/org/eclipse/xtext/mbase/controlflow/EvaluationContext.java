/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.controlflow;

import java.util.Map;
import java.util.Stack;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.util.RecursionGuard;

/**
 * @author Sebastian Zarnekow - Initial API and implementation
 */
@SuppressWarnings("all")
public class EvaluationContext {
  /* @Inject
   */private IBatchTypeResolver typeResolver;
  
  private /* RecursionGuard<EObject> */Object visiting = new RecursionGuard<Object>();
  
  private /* Map<Resource, IResolvedTypes> */Object resolvedTypesPerResource /* Skipped initializer because of errors */;
  
  private Stack<IResolvedTypes> resolvedTypesStack = new Stack<IResolvedTypes>();
  
  public boolean tryNext(final XExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field EvaluationContext.visiting refers to the missing type EObject");
  }
  
  public void addResolvedTypes(final /* Resource */Object resource, final IResolvedTypes resolvedTypes) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field EvaluationContext.resolvedTypesPerResource refers to the missing type Resource");
  }
  
  private void resolveTypes(final XExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eResource is undefined for the type XExpression"
      + "\n=== cannot be resolved."
      + "\nInvalid number of arguments. The method resolveTypes(XExpression) is not applicable for the arguments (IBatchTypeResolver,XExpression)"
      + "\nType mismatch: cannot convert from IBatchTypeResolver to XExpression"
      + "\nType mismatch: cannot convert from void to IResolvedTypes"
      + "\nThe field EvaluationContext.resolvedTypesPerResource refers to the missing type Resource"
      + "\nThe field EvaluationContext.resolvedTypesPerResource refers to the missing type Resource");
  }
  
  public IResolvedTypes getResolvedTypes() {
    return this.resolvedTypesStack.peek();
  }
  
  public void done(final XExpression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field EvaluationContext.visiting refers to the missing type EObject");
  }
}
