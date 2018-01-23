/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.formatting2.regionaccess.ITextSegment;
import org.eclipse.xtext.mbase.formatting2.ObjectEntry;
import org.eclipse.xtext.mbase.formatting2.SeparatorEntry;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
@Accessors
@SuppressWarnings("all")
public abstract class Entry<T extends Object, R extends ITextSegment> {
  protected Entry<T, R> next;
  
  protected Entry<T, R> previous;
  
  public abstract ObjectEntry<T, R> getLeadingObject();
  
  public abstract ObjectEntry<T, R> getTrailingObject();
  
  public abstract SeparatorEntry<T, R> getLeadingSeparator();
  
  public abstract SeparatorEntry<T, R> getTrailingSeparator();
  
  @Pure
  public Entry<T, R> getNext() {
    return this.next;
  }
  
  public void setNext(final Entry<T, R> next) {
    this.next = next;
  }
  
  @Pure
  public Entry<T, R> getPrevious() {
    return this.previous;
  }
  
  public void setPrevious(final Entry<T, R> previous) {
    this.previous = previous;
  }
}
