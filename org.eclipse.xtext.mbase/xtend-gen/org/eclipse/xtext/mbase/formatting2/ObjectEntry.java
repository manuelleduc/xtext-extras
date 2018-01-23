/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import org.eclipse.xtext.mbase.formatting2.Entry;
import org.eclipse.xtext.mbase.formatting2.SeparatorEntry;
import org.eclipse.xtext.mbase.formatting2.SeparatorRegions;

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
/* @FinalFieldsConstructor
@Accessors */@SuppressWarnings("all")
public class ObjectEntry<T extends Object, R/*  extends ITextSegment */> extends Entry<T, R> {
  private final SeparatorRegions<T, R> list;
  
  private T object;
  
  public /* ITextSegment */Object getRegion() {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\nThe method or field endOffset is undefined for the type R"
      + "\n!== cannot be resolved."
      + "\nThe method or field offset is undefined for the type R"
      + "\nTextSegment cannot be resolved."
      + "\nThe field separator is not visible"
      + "\nThe field root is not visible"
      + "\nThe field separator is not visible"
      + "\nThe field root is not visible"
      + "\nThe field root is not visible"
      + "\nThe field SeparatorRegions.root refers to the missing type ITextSegment"
      + "\nThe field SeparatorRegions.root refers to the missing type ITextSegment"
      + "\nThe field SeparatorRegions.root refers to the missing type ITextSegment"
      + "\noffset cannot be resolved"
      + "\nendOffset cannot be resolved"
      + "\ntextRegionAccess cannot be resolved"
      + "\n- cannot be resolved");
  }
  
  @Override
  public ObjectEntry<T, R> getLeadingObject() {
    Entry<T, R> _previous = null;
    if (this.previous!=null) {
      _previous=this.previous.previous;
    }
    return ((ObjectEntry<T, R>) _previous);
  }
  
  @Override
  public ObjectEntry<T, R> getTrailingObject() {
    Entry<T, R> _next = null;
    if (this.next!=null) {
      _next=this.next.next;
    }
    return ((ObjectEntry<T, R>) _next);
  }
  
  @Override
  public SeparatorEntry<T, R> getLeadingSeparator() {
    return ((SeparatorEntry<T, R>) this.previous);
  }
  
  @Override
  public SeparatorEntry<T, R> getTrailingSeparator() {
    return ((SeparatorEntry<T, R>) this.next);
  }
  
  @Override
  public String toString() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getRegion() from the type ObjectEntry refers to the missing type ITextSegment");
  }
}
