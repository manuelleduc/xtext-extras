/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.arguments;

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.typesystem.arguments.IFeatureCallArgumentSlot;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
@SuppressWarnings("all")
public interface IFeatureCallArguments {
  public abstract boolean hasUnprocessedArguments();
  
  public abstract IFeatureCallArgumentSlot getNextUnprocessedArgumentSlot();
  
  /**
   * Returns the argument expression at index {@code idx}.
   * If there is a receiver, the index {@code 0} returns
   * {@code null}.
   */
  public abstract XExpression getArgument(final int idx);
  
  /**
   * Returns the declared parameter type for the argument at index {@code idx}.
   * The semantics are similar to {@link #getArgument(int)} except for var arg
   * parameters. Var arg parameters always return the component type of the
   * last argument if asked for the type of the last or variable argument.
   */
  public abstract LightweightTypeReference getDeclaredTypeForLambda(final int idx);
  
  /**
   * Returns the number of argument expressions where the receiver
   * is considered to be an argument, too.
   */
  public abstract int getArgumentCount();
  
  public abstract boolean isProcessed(final int argumentIndex);
  
  public abstract boolean hasEmptyTrailingVarArg();
}
