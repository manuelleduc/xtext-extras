/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.mbase.formatting2.Entry;
import org.eclipse.xtext.mbase.formatting2.ObjectEntry;

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
/* @Accessors */@SuppressWarnings("all")
public class SeparatorEntry<T extends Object, R/*  extends ITextSegment */> extends Entry<T, R> {
  private R separator;
  
  @Override
  public ObjectEntry<T, R> getLeadingObject() {
    return ((ObjectEntry<T, R>) this.previous);
  }
  
  @Override
  public ObjectEntry<T, R> getTrailingObject() {
    return ((ObjectEntry<T, R>) this.next);
  }
  
  @Override
  public SeparatorEntry<T, R> getLeadingSeparator() {
    Entry<T, R> _previous = null;
    if (this.previous!=null) {
      _previous=this.previous.previous;
    }
    return ((SeparatorEntry<T, R>) _previous);
  }
  
  @Override
  public SeparatorEntry<T, R> getTrailingSeparator() {
    Entry<T, R> _next = null;
    if (this.next!=null) {
      _next=this.next.next;
    }
    return ((SeparatorEntry<T, R>) _next);
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"�separator.text�\" at offset=�separator.offset� lenght=�separator.length�");
    return _builder.toString();
  }
}
