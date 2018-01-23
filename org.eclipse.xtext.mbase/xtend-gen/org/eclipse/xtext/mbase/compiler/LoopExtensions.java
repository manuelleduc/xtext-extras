/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler;

import org.eclipse.xtext.mbase.compiler.output.ITreeAppendable;

/**
 * @author Jan Koehnlein
 */
@SuppressWarnings("all")
public class LoopExtensions {
  /**
   * Iterates elements and execute the procedure.
   * A prefix, a separator and a suffix can be initialized with the loopInitializer lambda.
   */
  public <T extends Object> void forEach(final ITreeAppendable appendable, final Iterable<T> elements, final /*  */Object loopInitializer, final /*  */Object procedure) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field empty is undefined for the type Iterable<T>"
      + "\n=> cannot be resolved."
      + "\nThe method or field head is undefined for the type Iterable<T>"
      + "\nThe method or field tail is undefined for the type Iterable<T>"
      + "\nappendPrefix cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nappendSeparator cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nappendSuffix cannot be resolved");
  }
  
  /**
   * Uses curly braces and comma as delimiters. Doesn't use them for single valued iterables.
   */
  public <T extends Object> void forEachWithShortcut(final ITreeAppendable appendable, final Iterable<T> elements, final /*  */Object procedure) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field size is undefined for the type Iterable<T>"
      + "\nThe method or field head is undefined for the type Iterable<T>"
      + "\nThe method prefix(String) is undefined"
      + "\nThe method separator(String) is undefined"
      + "\nThe method suffix(String) is undefined"
      + "\nThe method forEach(ITreeAppendable, Iterable<T>, Object, Object) from the type LoopExtensions refers to the missing type Object"
      + "\n== cannot be resolved"
      + "\n=> cannot be resolved");
  }
}
