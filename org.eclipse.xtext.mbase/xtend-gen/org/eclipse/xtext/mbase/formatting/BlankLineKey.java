package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.IntegerKey;

/**
 * @deprecated use {@link org.eclipse.xtext.mbase.formatting2.BlankLineKey}
 */
@Deprecated
@SuppressWarnings("all")
public class BlankLineKey extends IntegerKey {
  public BlankLineKey(final String name, final Integer defaultValue) {
    super(name, defaultValue);
  }
}
