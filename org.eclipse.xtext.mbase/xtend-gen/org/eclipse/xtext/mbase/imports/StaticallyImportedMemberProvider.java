/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.imports;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.mbase.imports.IImportsConfiguration;
import org.eclipse.xtext.mbase.typesystem.override.IResolvedFeatures;
import org.eclipse.xtext.mbase.typesystem.util.ContextualVisibilityHelper;
import org.eclipse.xtext.mbase.typesystem.util.IVisibilityHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
@SuppressWarnings("all")
public class StaticallyImportedMemberProvider {
  @Inject
  @Extension
  private IImportsConfiguration _iImportsConfiguration;
  
  @Inject
  @Extension
  private IResolvedFeatures.Provider _provider;
  
  @Inject
  private IVisibilityHelper visibilityHelper;
  
  public Iterable<JvmFeature> getAllFeatures(final Resource resource, final JvmDeclaredType importedType, final boolean static_, final boolean extension, final String memberName) {
    Iterable<JvmFeature> _xblockexpression = null;
    {
      if (((!static_) || (importedType == null))) {
        return CollectionLiterals.<JvmFeature>emptyList();
      }
      final IVisibilityHelper visibilityHelper = this.getVisibilityHelper(resource);
      final IResolvedFeatures resolvedFeatures = this._provider.getResolvedFeatures(importedType);
      final Function1<JvmFeature, Boolean> _function = (JvmFeature feature) -> {
        return Boolean.valueOf((feature.isStatic() && visibilityHelper.isVisible(feature)));
      };
      _xblockexpression = IterableExtensions.<JvmFeature>filter(resolvedFeatures.getAllFeatures(memberName), _function);
    }
    return _xblockexpression;
  }
  
  public IVisibilityHelper getVisibilityHelper(final Resource resource) {
    IVisibilityHelper _switchResult = null;
    boolean _matched = false;
    if (resource instanceof XtextResource) {
      _matched=true;
      IVisibilityHelper _xblockexpression = null;
      {
        final String packageName = this._iImportsConfiguration.getPackageName(((XtextResource)resource));
        IVisibilityHelper _xifexpression = null;
        if ((packageName == null)) {
          _xifexpression = this.visibilityHelper;
        } else {
          _xifexpression = new ContextualVisibilityHelper(this.visibilityHelper, packageName);
        }
        _xblockexpression = _xifexpression;
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      _switchResult = this.visibilityHelper;
    }
    return _switchResult;
  }
}
