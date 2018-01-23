/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.ITextSegment;
import org.eclipse.xtext.formatting2.regionaccess.internal.TextSegment;
import org.eclipse.xtext.mbase.formatting2.Entry;
import org.eclipse.xtext.mbase.formatting2.SeparatorEntry;
import org.eclipse.xtext.mbase.formatting2.SeparatorRegions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
@FinalFieldsConstructor
@Accessors
@SuppressWarnings("all")
public class ObjectEntry<T extends Object, R extends ITextSegment> extends Entry<T, R> {
  private final SeparatorRegions<T, R> list;
  
  private T object;
  
  public ITextSegment getRegion() {
    final SeparatorEntry<T, R> prev = this.getLeadingSeparator();
    final SeparatorEntry<T, R> trail = this.getTrailingSeparator();
    int _xifexpression = (int) 0;
    if ((prev != null)) {
      _xifexpression = prev.getSeparator().getEndOffset();
    } else {
      _xifexpression = this.list.getRoot().getOffset();
    }
    final int offset = _xifexpression;
    int _xifexpression_1 = (int) 0;
    if ((trail != null)) {
      _xifexpression_1 = trail.getSeparator().getOffset();
    } else {
      _xifexpression_1 = this.list.getRoot().getEndOffset();
    }
    final int endOffset = _xifexpression_1;
    ITextRegionAccess _textRegionAccess = this.list.getRoot().getTextRegionAccess();
    return new TextSegment(_textRegionAccess, offset, (endOffset - offset));
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
    String _xblockexpression = null;
    {
      final ITextSegment reg = this.getRegion();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"�reg.text�\" at offset=�reg.offset� lenght=�reg.length� (�object.class.simpleName�)");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public ObjectEntry(final SeparatorRegions<T, R> list) {
    super();
    this.list = list;
  }
  
  @Pure
  public SeparatorRegions<T, R> getList() {
    return this.list;
  }
  
  @Pure
  public T getObject() {
    return this.object;
  }
  
  public void setObject(final T object) {
    this.object = object;
  }
}
