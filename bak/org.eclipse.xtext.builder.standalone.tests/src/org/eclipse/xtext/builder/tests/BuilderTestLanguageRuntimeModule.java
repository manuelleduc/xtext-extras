/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.builder.tests;

import org.eclipse.xtext.generator.AbstractFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;
import org.eclipse.xtext.resource.persistence.IResourceStorageFacade;
import org.eclipse.xtext.resource.persistence.ResourceStorageFacade;
import org.eclipse.xtext.resource.persistence.StorageAwareResource;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BuilderTestLanguageRuntimeModule extends org.eclipse.xtext.builder.tests.AbstractBuilderTestLanguageRuntimeModule {
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return DefaultDeclarativeQualifiedNameProvider.class;
	}
	
	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return DefaultGlobalScopeProvider.class;
	}
	
	@Override
	public Class<? extends Manager> bindIContainer$Manager() {
		return SimpleResourceDescriptionsBasedContainerManager.class;
	}
	
	public Class<? extends IGenerator> bindIGenerator() {
		return MyGenerator.class;
	}
	
	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return StorageAwareResource.class;
	}
	
	public Class<? extends IResourceStorageFacade> bindIResourceStorageFacade() {
		return ResourceStorageFacade.class;
	}
	
	public Class<? extends AbstractFileSystemAccess2> bindAbstractFileSystemAccess2() {
		return JavaIoFileSystemAccess.class;
	}
	
}
