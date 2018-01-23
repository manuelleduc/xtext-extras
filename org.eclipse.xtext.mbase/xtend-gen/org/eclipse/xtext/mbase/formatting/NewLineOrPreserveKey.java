package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.BooleanKey;

/**
 * @deprecated use {@link org.eclipse.xtext.mbase.formatting2.NewLineOrPreserveKey}
 */
@Deprecated
@SuppressWarnings("all")
public class NewLineOrPreserveKey extends BooleanKey {
  public NewLineOrPreserveKey(final String name, final Boolean defaultValue) {
    super(name, (defaultValue).booleanValue());
  }
}
