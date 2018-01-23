/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.annotations;

import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.mbase.DefaultMbaseRuntimeModule;
import org.eclipse.xtext.mbase.annotations.typesystem.MbaseWithAnnotationsBatchScopeProvider;
import org.eclipse.xtext.mbase.annotations.typesystem.MbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.mbase.annotations.validation.UnresolvedAnnotationTypeAwareMessageProvider;
import org.eclipse.xtext.mbase.scoping.batch.MbaseBatchScopeProvider;
import org.eclipse.xtext.mbase.typesystem.computation.ITypeComputer;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class DefaultMbaseWithAnnotationsRuntimeModule extends DefaultMbaseRuntimeModule {

	public Class<? extends ITypeComputer> bindITypeComputer() {
		return MbaseWithAnnotationsTypeComputer.class;
	}

	public Class<? extends MbaseBatchScopeProvider> bindmbaseBatchScopeProvider() {
		return MbaseWithAnnotationsBatchScopeProvider.class;
	}

	@Override
	public Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return UnresolvedAnnotationTypeAwareMessageProvider.class;
	}
}
