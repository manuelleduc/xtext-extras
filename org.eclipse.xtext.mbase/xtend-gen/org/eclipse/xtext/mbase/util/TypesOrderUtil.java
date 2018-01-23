/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.util;

import java.util.Collection;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.util.CommonTypeComputationServices;

/**
 * Small utilitiy class that allows to check whether a given type was already handled in a chain
 * of instanceof checks, e.g to validate catch-clauses or switch expressions.
 * 
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class TypesOrderUtil {
  /* @Inject
   */private CommonTypeComputationServices services;
  
  public boolean isHandled(final LightweightTypeReference actualTypeReference, final Collection<LightweightTypeReference> collection) {
    boolean _xblockexpression = false;
    {
      for (final LightweightTypeReference previousTypeReference : collection) {
        boolean _isHandled = this.isHandled(actualTypeReference, previousTypeReference);
        if (_isHandled) {
          return true;
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public boolean isHandled(final LightweightTypeReference actualTypeReference, final LightweightTypeReference previousTypeReference) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method bitwiseOr(int) is undefined for the type int"
      + "\nThe method bitwiseAnd(int) is undefined for the type int"
      + "\nThe field typeConformanceComputer is not visible"
      + "\nbitwiseOr cannot be resolved"
      + "\n!= cannot be resolved");
  }
}
