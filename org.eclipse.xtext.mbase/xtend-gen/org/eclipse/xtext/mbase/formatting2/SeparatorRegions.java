/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import java.util.Iterator;
import org.eclipse.xtext.mbase.formatting2.ObjectEntry;
import org.eclipse.xtext.mbase.formatting2.SeparatorEntry;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
/* @FinalFieldsConstructor */@SuppressWarnings("all")
public class SeparatorRegions<T extends Object, R/*  extends ITextSegment */> implements Iterable<ObjectEntry<T, R>> {
  /* @Accessors
   */private final /* ITextSegment */Object root;
  
  private ObjectEntry<T, R> first;
  
  public void prepend(final T object) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nInvalid number of arguments. The constructor ObjectEntry<T, R>() is not applicable for the arguments (SeparatorRegions<T, R>)"
      + "\nThe field object is not visible");
  }
  
  public void prependWithLeadingSeparator(final T object, final R separator) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nInvalid number of arguments. The constructor ObjectEntry<T, R>() is not applicable for the arguments (SeparatorRegions<T, R>)"
      + "\nThe field object is not visible"
      + "\nThe field separator is not visible");
  }
  
  public void appendWithTrailingSeparator(final T object, final R separator) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\n=== cannot be resolved."
      + "\nThe method or field last is undefined for the type Iterable<SeparatorEntry<T, R>>"
      + "\nInvalid number of arguments. The constructor ObjectEntry<T, R>() is not applicable for the arguments (SeparatorRegions<T, R>)"
      + "\nThe field object is not visible"
      + "\nThe field separator is not visible"
      + "\nnext cannot be resolved");
  }
  
  @Override
  public Iterator<ObjectEntry<T, R>> iterator() {
    throw new Error("Unresolved compilation problems:"
      + "\nAbstractIterator cannot be resolved."
      + "\n=== cannot be resolved."
      + "\nThe method endOfData() is undefined"
      + "\nThe method computeNext() of type new Object(){} must override a superclass method.");
  }
  
  public Iterable<SeparatorEntry<T, R>> separators() {
    throw new Error("Unresolved compilation problems:"
      + "\nAbstractIterator cannot be resolved."
      + "\n=== cannot be resolved."
      + "\nThe method endOfData() is undefined"
      + "\nThe method computeNext() of type new Object(){} must override a superclass method.");
  }
  
  @Override
  public String toString() {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\nThe method newArrayList() is undefined"
      + "\n!== cannot be resolved."
      + "\n+= cannot be resolved"
      + "\njoin cannot be resolved");
  }
}
