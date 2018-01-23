/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler.output;

import java.util.Arrays;
import org.eclipse.xtext.mbase.compiler.ImportManager;
import org.eclipse.xtext.mbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.mbase.compiler.output.SharedAppendableState;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReferenceSerializer;

/**
 * A specialized {@link StringConcatenation} that will properly convert instances of
 * {@link Class}, {@link JvmType}, {@link JvmTypeReference} or {@link LightweightTypeReference}
 * to their valid serialized representation including import handling.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class ImportingStringConcatenation /* implements StringConcatenation  */{
  private final ImportManager importManager;
  
  private final ITypeReferenceOwner typeReferenceOwner;
  
  public ImportingStringConcatenation(final SharedAppendableState state, final ITypeReferenceOwner typeReferenceOwner) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(String) is undefined");
  }
  
  protected String _getStringRepresentation(final Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetStringRepresentation cannot be resolved");
  }
  
  protected String _getStringRepresentation(final /* JvmType */Object object) {
    return this.importManager.serialize(object).toString();
  }
  
  protected String _getStringRepresentation(final /* JvmTypeReference */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method toLightweightReference(JvmTypeReference) is undefined for the type LightweightTypeReferenceFactory");
  }
  
  protected String _getStringRepresentation(final LightweightTypeReference object) {
    final StringBuilderBasedAppendable appender = new StringBuilderBasedAppendable(this.importManager);
    final LightweightTypeReferenceSerializer serializer = new LightweightTypeReferenceSerializer(appender);
    object.accept(serializer);
    return appender.toString();
  }
  
  protected String _getStringRepresentation(final Class<?> object) {
    return this.importManager.serialize(object).toString();
  }
  
  /**
   * A potentially contained trailing line delimiter is ignored.
   */
  @Override
  protected Object getSignificantContent() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nThe method or field lineDelimiter is undefined"
      + "\ngetSignificantContent cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n>= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n== cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nsubList cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n- cannot be resolved");
  }
  
  protected String getStringRepresentation(final JvmType object) {
    if (object != null) {
      return _getStringRepresentation(object);
    } else if (object != null) {
      return _getStringRepresentation(object);
    } else if (object != null) {
      return _getStringRepresentation(object);
    } else if (object != null) {
      return _getStringRepresentation(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
