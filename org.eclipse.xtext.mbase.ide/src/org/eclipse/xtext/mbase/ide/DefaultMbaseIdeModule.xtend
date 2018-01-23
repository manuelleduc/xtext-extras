/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.ide

import com.google.inject.Binder
import org.eclipse.xtext.ide.DefaultIdeModule
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import org.eclipse.xtext.ide.editor.contentassist.IdeCrossrefProposalProvider
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.mbase.ide.contentassist.ClasspathBasedIdeTypesProposalProvider
import org.eclipse.xtext.mbase.ide.contentassist.IIdeTypesProposalProvider
import org.eclipse.xtext.mbase.ide.contentassist.mbaseIdeContentProposalPriorities
import org.eclipse.xtext.mbase.ide.contentassist.mbaseIdeContentProposalProvider
import org.eclipse.xtext.mbase.ide.contentassist.mbaseIdeCrossrefProposalProvider
import org.eclipse.xtext.mbase.ide.highlighting.MbaseHighlightingCalculator
import org.eclipse.xtext.mbase.ide.types.ClasspathScanner
import org.eclipse.xtext.mbase.typesystem.internal.IFeatureScopeTracker
import org.eclipse.xtext.mbase.typesystem.internal.OptimizingFeatureScopeTrackerProvider

/**
 * Default Guice bindings for the generic IDE contributions of the mbase languages.
 */
class DefaultMbaseIdeModule extends DefaultIdeModule {
	
	protected static val classpathScanner = new ClasspathScanner
	
	def void configureClasspathScanner(Binder binder) {
		binder.bind(ClasspathScanner).toInstance(classpathScanner)
	}
	
	def Class<? extends IFeatureScopeTracker.Provider> bindIFeatureScopeTrackerProvider() {
		OptimizingFeatureScopeTrackerProvider
	}
	
	def Class<? extends IdeContentProposalProvider> bindIdeContentProposalProvider() {
		mbaseIdeContentProposalProvider
	}
	
	def Class<? extends IdeCrossrefProposalProvider> bindIdeCrossrefProposalProvider() {
		mbaseIdeCrossrefProposalProvider
	}
	
	def Class<? extends IIdeTypesProposalProvider> bindIIdeTypesProposalProvider() {
		ClasspathBasedIdeTypesProposalProvider
	}
	
	def Class<? extends IdeContentProposalPriorities> bindIdeContentProposalPriorities() {
		mbaseIdeContentProposalPriorities
	}
	
	def Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		MbaseHighlightingCalculator
	}
	
}