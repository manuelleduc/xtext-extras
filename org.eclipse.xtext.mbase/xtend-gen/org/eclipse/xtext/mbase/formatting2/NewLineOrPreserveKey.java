/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.formatting2;

import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.mbase.formatting2.MbaseFormatterPreferenceKeys;
import org.eclipse.xtext.preferences.BooleanKey;
import org.eclipse.xtext.preferences.ITypedPreferenceValues;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@SuppressWarnings("all")
public class NewLineOrPreserveKey extends BooleanKey implements Procedure1<IHiddenRegionFormatter> {
  public NewLineOrPreserveKey(final String name, final Boolean defaultValue) {
    super(name, defaultValue);
  }
  
  @Override
  public void apply(final IHiddenRegionFormatter it) {
    final ITypedPreferenceValues preferences = it.getRequest().getPreferences();
    final Boolean newLine = preferences.<Boolean>getPreference(this);
    final Boolean preserve = preferences.<Boolean>getPreference(MbaseFormatterPreferenceKeys.preserveNewLines);
    int _xifexpression = (int) 0;
    if ((newLine).booleanValue()) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    final int min = _xifexpression;
    int _xifexpression_1 = (int) 0;
    if (((preserve).booleanValue() || (newLine).booleanValue())) {
      _xifexpression_1 = 1;
    } else {
      _xifexpression_1 = 0;
    }
    final int max = _xifexpression_1;
    it.setNewLines(min, min, max);
    it.setSpace(" ");
  }
}
