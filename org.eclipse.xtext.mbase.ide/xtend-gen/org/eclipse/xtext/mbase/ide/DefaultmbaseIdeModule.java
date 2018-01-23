/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide;

import org.eclipse.xtext.mbase.ide.contentassist.ClasspathBasedIdeTypesProposalProvider;
import org.eclipse.xtext.mbase.ide.contentassist.IIdeTypesProposalProvider;
import org.eclipse.xtext.mbase.ide.contentassist.mbaseIdeContentProposalPriorities;
import org.eclipse.xtext.mbase.ide.contentassist.mbaseIdeContentProposalProvider;
import org.eclipse.xtext.mbase.ide.contentassist.mbaseIdeCrossrefProposalProvider;
import org.eclipse.xtext.mbase.ide.highlighting.mbaseHighlightingCalculator;
import org.eclipse.xtext.mbase.ide.types.ClasspathScanner;

/**
 * Default Guice bindings for the generic IDE contributions of the mbase languages.
 */
@SuppressWarnings("all")
public class DefaultmbaseIdeModule /* implements DefaultIdeModule  */{
  protected final static ClasspathScanner classpathScanner = new ClasspathScanner();
  
  public void configureClasspathScanner(final /* Binder */Object binder) {
    throw new Error("Unresolved compilation problems:"
      + "\nbind cannot be resolved"
      + "\ntoInstance cannot be resolved");
  }
  
  public /* Class<? extends IFeatureScopeTracker.Provider> */Object bindIFeatureScopeTrackerProvider() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field OptimizingFeatureScopeTrackerProvider is undefined");
  }
  
  public /* Class<? extends IdeContentProposalProvider> */Object bindIdeContentProposalProvider() {
    return mbaseIdeContentProposalProvider.class;
  }
  
  public /* Class<? extends IdeCrossrefProposalProvider> */Object bindIdeCrossrefProposalProvider() {
    return mbaseIdeCrossrefProposalProvider.class;
  }
  
  public Class<? extends IIdeTypesProposalProvider> bindIIdeTypesProposalProvider() {
    return ClasspathBasedIdeTypesProposalProvider.class;
  }
  
  public /* Class<? extends IdeContentProposalPriorities> */Object bindIdeContentProposalPriorities() {
    return mbaseIdeContentProposalPriorities.class;
  }
  
  public /* Class<? extends ISemanticHighlightingCalculator> */Object bindSemanticHighlightingCalculator() {
    return mbaseHighlightingCalculator.class;
  }
}
