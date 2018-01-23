/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.services;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;

/**
 * @author mleduc - Initial contribution and API
 */
public class GrammarUtilAR {

	public static ParserRule findRuleForName(Grammar grammar, String pr) {
		ParserRule a = (ParserRule) GrammarUtil.findRuleForName(grammar, "org.eclipse.xtext.mbase.Mbase." + pr);
		if (a != null)
			return a;
		else
			return (ParserRule) GrammarUtil.findRuleForName(grammar, "org.eclipse.xtext.xbase.Xbase." + pr);
	}

}
