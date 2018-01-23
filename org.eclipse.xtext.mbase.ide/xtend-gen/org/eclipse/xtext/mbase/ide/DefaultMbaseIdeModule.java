/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide;

import com.google.inject.Binder;
import org.eclipse.xtext.ide.DefaultIdeModule;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.ide.editor.contentassist.IdeCrossrefProposalProvider;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.mbase.ide.contentassist.ClasspathBasedIdeTypesProposalProvider;
import org.eclipse.xtext.mbase.ide.contentassist.IIdeTypesProposalProvider;
import org.eclipse.xtext.mbase.ide.contentassist.MbaseIdeContentProposalPriorities;
import org.eclipse.xtext.mbase.ide.contentassist.MbaseIdeContentProposalProvider;
import org.eclipse.xtext.mbase.ide.contentassist.mbaseIdeCrossrefProposalProvider;
import org.eclipse.xtext.mbase.ide.highlighting.MbaseHighlightingCalculator;
import org.eclipse.xtext.mbase.ide.types.ClasspathScanner;
import org.eclipse.xtext.mbase.typesystem.internal.IFeatureScopeTracker;
import org.eclipse.xtext.mbase.typesystem.internal.OptimizingFeatureScopeTrackerProvider;

/**
 * Default Guice bindings for the generic IDE contributions of the mbase languages.
 */
@SuppressWarnings("all")
public class DefaultMbaseIdeModule extends DefaultIdeModule {
  protected final static ClasspathScanner classpathScanner = new ClasspathScanner();
  
  public void configureClasspathScanner(final Binder binder) {
    binder.<ClasspathScanner>bind(ClasspathScanner.class).toInstance(DefaultMbaseIdeModule.classpathScanner);
  }
  
  public Class<? extends IFeatureScopeTracker.Provider> bindIFeatureScopeTrackerProvider() {
    return OptimizingFeatureScopeTrackerProvider.class;
  }
  
  public Class<? extends IdeContentProposalProvider> bindIdeContentProposalProvider() {
    return MbaseIdeContentProposalProvider.class;
  }
  
  public Class<? extends IdeCrossrefProposalProvider> bindIdeCrossrefProposalProvider() {
    return mbaseIdeCrossrefProposalProvider.class;
  }
  
  public Class<? extends IIdeTypesProposalProvider> bindIIdeTypesProposalProvider() {
    return ClasspathBasedIdeTypesProposalProvider.class;
  }
  
  public Class<? extends IdeContentProposalPriorities> bindIdeContentProposalPriorities() {
    return MbaseIdeContentProposalPriorities.class;
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
    return MbaseHighlightingCalculator.class;
  }
}
