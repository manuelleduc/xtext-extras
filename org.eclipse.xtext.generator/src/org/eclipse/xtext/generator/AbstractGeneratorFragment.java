/*******************************************************************************
 * Copyright (c) 2008, 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.xtext.generator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xtext.Grammar;

import com.google.common.io.Files;

/**
 * Base class redirecting call backs to respective Xpand definitions. The template needs to have the same qualified name
 * the concrete subclass has.
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
public abstract class AbstractGeneratorFragment extends DefaultGeneratorFragment implements NamingAware{

	private Naming naming;

	@Override
	public void registerNaming(Naming naming) {
		this.naming = naming;
	}

	public Naming getNaming() {
		return naming;
	}

	protected String getTemplate() {
		return getClass().getName().replaceAll("\\.", "::");
	}

	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {
		XpandFacade.create(ctx).evaluate2(getTemplate() + "::generate", grammar, getParameters(grammar));
	}
	
	@Override
	public void addToPluginXmlRt(Grammar grammar, XpandExecutionContext ctx) {
		XpandFacade.create(ctx).evaluate2(getTemplate() + "::addToPluginXmlRt", grammar, getParameters(grammar));
	}
	
	@Override
	public void addToPluginXmlUi(Grammar grammar, XpandExecutionContext ctx) {
		XpandFacade.create(ctx).evaluate2(getTemplate() + "::addToPluginXmlUi", grammar, getParameters(grammar));
	}

	/**
	 * @since 2.3
	 * @deprecated
	 */
	@Override
	@Deprecated
	public void addToPluginXmlTests(Grammar grammar, XpandExecutionContext ctx) {
		XpandFacade.create(ctx).evaluate2(getTemplate() + "::addToPluginXmlTests", grammar, getParameters(grammar));
	}
	
	@Override
	public void addToStandaloneSetup(Grammar grammar, XpandExecutionContext ctx) {
		XpandFacade.create(ctx).evaluate2(getTemplate() + "::addToStandaloneSetup", grammar, getParameters(grammar));
	}
	
	protected List<Object> getParameters(Grammar grammar) {
		return Collections.emptyList();
	}

	/**
	 * @since 2.7
	 */
	protected String readFileIntoString(String filename, Charset encoding) {
		try {
			String result = Files.toString(new File(filename), encoding);
			return result;
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
	
	/**
	 * @since 2.7
	 */
	protected void writeStringIntoFile(String filename, String content, Charset encoding) {
		try {
			Files.write(content, new File(filename), encoding);
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
}
