/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.compiler;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.xtend2.lib.StringConcatenationClient;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class CompilationTemplateAdapter extends AdapterImpl {

	@Override
	public boolean isAdapterForType(Object type) {
		return type == CompilationTemplateAdapter.class;
	}
	
	private StringConcatenationClient template;
	
	public StringConcatenationClient getCompilationTemplate() {
		return template;
	}
	
	public void setCompilationTemplate(StringConcatenationClient template) {
		this.template = template;
	}
}
