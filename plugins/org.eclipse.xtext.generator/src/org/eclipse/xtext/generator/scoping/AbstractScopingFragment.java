/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.generator.scoping;

import static com.google.common.collect.Lists.*;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractInheritingGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.IStubGenerating;
import org.eclipse.xtext.generator.Naming;
import org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.IgnoreCaseLinking;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.util.Strings;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractScopingFragment extends AbstractInheritingGeneratorFragment implements IStubGenerating, IStubGenerating.XtendOption {

	public static String getScopeProviderName(Grammar grammar, Naming naming) {
		return naming.basePackageRuntime(grammar) + ".scoping." + GrammarUtil.getName(grammar) + "ScopeProvider";
	}
	
	private boolean isGenerateStub = true;
	
	private boolean isGenerateXtendStub;

	/**
	 * @since 2.4
	 */
	public boolean isGenerateXtendStub() {
		return isGenerateXtendStub;
	}

	/**
	 * @since 2.4
	 */
	public void setGenerateXtendStub(boolean isGenerateXtendStub) {
		this.isGenerateXtendStub = isGenerateXtendStub;
	}

	public boolean isGenerateStub() {
		return isGenerateStub;
	}

	public void setGenerateStub(boolean isGenerateStub) {
		this.isGenerateStub = isGenerateStub;
	}
	
	/**
	 * @since 2.1
	 */
	public boolean isGenerateStub(Grammar grammar) {
		if(isGenerateStub()) {
			if (XbaseGeneratorFragment.doesUseXbase(grammar)) {
				Logger.getLogger(this.getClass()).warn("Skipping stub generation as Xbase is used");
				return false;
			}
			return true;
		}
		return false;
	}
	
	private boolean ignoreCase;

	public boolean isIgnoreCase() {
		return ignoreCase;
	}

	public void setIgnoreCase(boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}

	protected abstract Class<? extends IGlobalScopeProvider> getGlobalScopeProvider();

	protected abstract Class<? extends IScopeProvider> getLocalScopeProvider();

	@Override
	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		BindFactory factory = new BindFactory();
		if(isGenerateStub) {
			factory.addTypeToType(IScopeProvider.class.getName(), getScopeProviderName(grammar, getNaming()))
					.addConfiguredBinding(
							IScopeProvider.class.getName() + "Delegate",
							"binder.bind(" + IScopeProvider.class.getName() + ".class"
									+ ").annotatedWith(com.google.inject.name.Names.named("
									+ AbstractDeclarativeScopeProvider.class.getName() + ".NAMED_DELEGATE" + ")).to("
									+ getLocalScopeProvider().getName() + ".class)");
		} else {
			factory.addTypeToType(IScopeProvider.class.getName(), getLocalScopeProvider().getName());
		}
		factory.addTypeToType(IGlobalScopeProvider.class.getName(), getGlobalScopeProvider().getName());
		factory.addConfiguredBinding(IgnoreCaseLinking.class.getSimpleName(), "binder.bindConstant().annotatedWith("
				+ IgnoreCaseLinking.class.getName() + ".class).to(" + isIgnoreCase() + ")");
		return factory.getBindings();
	}

	protected String getScopeProviderSuperClassName(Grammar grammar) {
		Grammar superGrammar = getSuperGrammar(grammar);
		if(superGrammar != null) {
			return getSuperClassName(getScopeProviderName(superGrammar, getNaming()), getDefaultScopeProviderSuperClassName());
		}
		return getDefaultScopeProviderSuperClassName();
	}

	protected String getDefaultScopeProviderSuperClassName() {
		return "org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider";
	}

	@Override
	protected List<Object> getParameters(Grammar grammar) {
		boolean genStub = isGenerateStub(grammar);
		return newArrayList((Object)getScopeProviderSuperClassName(grammar), (Object)genStub, (Object) isGenerateXtendStub());
	}
	
	@Override
	public String[] getExportedPackagesRt(Grammar grammar) {
		if (!isGenerateStub(grammar))
			return new String[0];
		return new String[] { Strings.skipLastToken(getScopeProviderName(grammar, getNaming()),".") };
	}
	
	@Override
	public String[] getImportedPackagesRt(Grammar grammar) {
		if(isGenerateXtendStub)
			return new String[] { "org.eclipse.xtext.xbase.lib" };
		else
			return null;
	}
	
	@Override
	protected String getTemplate() {
		return super.getTemplate();
	}

}
