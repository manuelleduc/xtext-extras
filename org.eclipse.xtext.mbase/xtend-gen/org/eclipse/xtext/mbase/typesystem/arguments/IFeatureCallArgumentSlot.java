/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.arguments;

import java.util.List;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
@SuppressWarnings("all")
public interface IFeatureCallArgumentSlot {
  public abstract boolean isVarArg();
  
  public abstract boolean isSuperfluous();
  
  /**
   * The list of expressions. The list is never <code>null</code> but may contain
   * <code>null</code> entries.
   */
  public abstract List<XExpression> getArgumentExpressions();
  
  /**
   * @Nullable
   */
  public abstract XExpression getArgumentExpression();
  
  /**
   * @Nullable
   */
  public abstract LightweightTypeReference getDeclaredType();
  
  public abstract void markProcessed();
}
