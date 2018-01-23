/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.imports;

import org.eclipse.xtext.mbase.imports.IImportsConfiguration;
import org.eclipse.xtext.mbase.typesystem.override.IResolvedFeatures;
import org.eclipse.xtext.mbase.typesystem.util.IVisibilityHelper;
import org.eclipse.xtext.xtype.XImportDeclaration;

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class StaticallyImportedMemberProvider {
  /* @Inject
   */private IImportsConfiguration _iImportsConfiguration;
  
  /* @Inject
   */private IResolvedFeatures.Provider _provider;
  
  /* @Inject
   */private IVisibilityHelper visibilityHelper;
  
  public Object findAllFeatures(final XImportDeclaration it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field importedType is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field emptyList is undefined"
      + "\nThe method or field eResource is undefined"
      + "\n=== cannot be resolved."
      + "\nJvmFeature cannot be resolved to a type."
      + "\n|| cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nvisibilityHelper cannot be resolved"
      + "\nresolvedFeatures cannot be resolved"
      + "\nallFeatures cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nstatic cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nisVisible cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nstartsWith cannot be resolved");
  }
  
  public Object getAllFeatures(final XImportDeclaration it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eResource is undefined"
      + "\nThe method or field importedType is undefined"
      + "\ngetAllFeatures cannot be resolved");
  }
  
  public Object getAllFeatures(final /* Resource */Object resource, final /* JvmDeclaredType */Object importedType, final boolean static_, final boolean extension, final String memberName) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nThe method or field emptyList is undefined"
      + "\nJvmFeature cannot be resolved to a type."
      + "\n|| cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nvisibilityHelper cannot be resolved"
      + "\nresolvedFeatures cannot be resolved"
      + "\ngetAllFeatures cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nstatic cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nisVisible cannot be resolved");
  }
  
  public IVisibilityHelper getVisibilityHelper(final /* Resource */Object resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nXtextResource cannot be resolved to a type."
      + "\npackageName cannot be resolved"
      + "\n=== cannot be resolved");
  }
}
