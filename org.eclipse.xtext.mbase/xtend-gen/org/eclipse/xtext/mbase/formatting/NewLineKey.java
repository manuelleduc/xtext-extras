package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.BooleanKey;

/**
 * @deprecated use {@link org.eclipse.xtext.mbase.formatting2.NewLineKey}
 */
@Deprecated
@SuppressWarnings("all")
public class NewLineKey extends BooleanKey {
  public NewLineKey(final String name, final Boolean defaultValue) {
    super(name, (defaultValue).booleanValue());
  }
}
