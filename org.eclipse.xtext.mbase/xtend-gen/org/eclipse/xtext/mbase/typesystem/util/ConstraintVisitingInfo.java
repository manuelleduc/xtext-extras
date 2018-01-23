/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.util;

import java.util.Set;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * TODO JavaDoc
 */
@SuppressWarnings("all")
public class ConstraintVisitingInfo {
  private /* Set<JvmTypeParameter> */Object visiting;
  
  private /* JvmTypeParameterDeclarator */Object declarator;
  
  private int idx;
  
  public ConstraintVisitingInfo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field newHashSet is undefined"
      + "\nThe field ConstraintVisitingInfo.visiting refers to the missing type JvmTypeParameter");
  }
  
  public ConstraintVisitingInfo(final /* JvmTypeParameter */Object initial) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method newHashSet(JvmTypeParameter) is undefined"
      + "\nThe field ConstraintVisitingInfo.visiting refers to the missing type JvmTypeParameter");
  }
  
  public boolean tryVisit(final /* JvmTypeParameter */Object parameter) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConstraintVisitingInfo.visiting refers to the missing type JvmTypeParameter");
  }
  
  public boolean canVisit(final /* JvmTypeParameter */Object parameter) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nThe field ConstraintVisitingInfo.visiting refers to the missing type JvmTypeParameter");
  }
  
  public void didVisit(final /* JvmTypeParameter */Object parameter) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConstraintVisitingInfo.visiting refers to the missing type JvmTypeParameter");
  }
  
  public void pushInfo(final /* JvmTypeParameterDeclarator */Object declarator, final int idx) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConstraintVisitingInfo.declarator refers to the missing type JvmTypeParameterDeclarator"
      + "\n=== cannot be resolved");
  }
  
  public JvmTypeParameterDeclarator getCurrentDeclarator() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConstraintVisitingInfo.declarator refers to the missing type JvmTypeParameterDeclarator");
  }
  
  public int getCurrentIndex() {
    return this.idx;
  }
}
