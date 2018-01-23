package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.preferences.PreferenceKey;

/**
 * @deprecated use {@link org.eclipse.xtext.preferences.IntegerKey}
 */
@Deprecated
@SuppressWarnings("all")
public class IntegerKey extends PreferenceKey {
  public IntegerKey(final String name, final Integer defaultValue) {
    super(name, defaultValue.toString());
  }
}
