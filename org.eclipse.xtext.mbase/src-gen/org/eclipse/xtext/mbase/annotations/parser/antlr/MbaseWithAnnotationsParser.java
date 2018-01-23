/*******************************************************************************
 * Copyright (c) 2010-2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.annotations.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.mbase.annotations.parser.antlr.internal.InternalMbaseWithAnnotationsParser;
import org.eclipse.xtext.mbase.annotations.services.MbaseWithAnnotationsGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MbaseWithAnnotationsParser extends AbstractAntlrParser {

	@Inject
	private MbaseWithAnnotationsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMbaseWithAnnotationsParser createParser(XtextTokenStream stream) {
		return new InternalMbaseWithAnnotationsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "XAnnotation";
	}

	public MbaseWithAnnotationsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MbaseWithAnnotationsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
