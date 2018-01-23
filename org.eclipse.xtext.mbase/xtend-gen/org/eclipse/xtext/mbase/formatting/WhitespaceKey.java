package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.BooleanKey;

/**
 * @deprecated use {@link org.eclipse.xtext.mbase.formatting2.WhitespaceKey}
 */
@Deprecated
@SuppressWarnings("all")
public class WhitespaceKey extends BooleanKey {
  public WhitespaceKey(final String name, final Boolean defaultValue) {
    super(name, (defaultValue).booleanValue());
  }
}
