/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.parseerrorhandling;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.XtextGrammarTestStandaloneSetup;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.parsetree.SyntaxError;
import org.eclipse.xtext.testlanguages.ReferenceGrammarStandaloneSetup;
import org.eclipse.xtext.tests.AbstractGeneratorTest;

public class ParseErrorHandlingTest extends AbstractGeneratorTest {
	
	private static final Logger logger = Logger.getLogger(ParseErrorHandlingTest.class);
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(XtextGrammarTestStandaloneSetup.class);
	}

	public void testLexError() throws Exception {
		EObject root = getModel("language a import 'holla' % as foo");
		EList<SyntaxError> errors = NodeUtil.getRootNode(root).allSyntaxErrors();
		assertEquals(1,errors.size());
		assertEquals("%", ((LeafNode)errors.get(0).getNode()).getText());
		assertEquals(1, errors.get(0).getNode().getTotalLine());
		assertEquals(26, errors.get(0).getNode().getTotalOffset());
		assertEquals(1, errors.get(0).getNode().getTotalLength());
		assertEquals(1, errors.size());
	}
	
	public void testParseError1() throws Exception {
		EObject root = getModel("language a import 'holla' foo returns x::y::Z : name=ID;");
		EList<SyntaxError> errors = NodeUtil.getRootNode(root).allSyntaxErrors();
		assertEquals("::",  ((LeafNode)errors.get(0).getNode()).getText());
		assertEquals(1, errors.get(0).getNode().getTotalLine());
		assertEquals(42, errors.get(0).getNode().getTotalOffset());
		assertEquals(2, errors.get(0).getNode().getTotalLength());
		assertEquals(1, errors.size());
	}
	
	public void testParseError2() throws Exception {
		Object object = getModel("language a import 'holla' foo returns y::Z : name=foo #;");
		assertWithXtend("'foo'", "rules.first().eAllContents.typeSelect(XtextTest::RuleCall).first().rule.name", object);
	}
	
	public void testParseError3() throws Exception {
		Object object = getModel("language a import 'holla' foo returns y::Z : name=foo #############");
		assertWithXtend("'foo'", "rules.first().eAllContents.typeSelect(XtextTest::RuleCall).first().rule.name", object);
	}
	
	public void testParseError4() throws Exception {
		Object object = getModel("language a import 'holla' foo returns y::Z : name=foo # 'foo'; bar : 'stuff'");
		//logger.debug(errors);
		assertWithXtend("'foo'", "rules.first().eAllContents.typeSelect(XtextTest::RuleCall).first().rule.name", object);
		assertWithXtend("null", "rules.first().eAllContents.typeSelect(XtextTest::Keyword).first().name", object);
		assertWithXtend("'stuff'", "rules.get(1).eAllContents.typeSelect(XtextTest::Keyword).first().value", object);
	}
	
	
	public void testname() throws Exception {
		String model = "language a import 'holla' foo returns y::Z : name=ID # 'foo'; bar : 'stuff'";
		for (int i=model.length();0<i;i--) {
			getModel(model.substring(0, i));
		}
	}
	
	/**
	 * see https://bugs.eclipse.org/bugs/show_bug.cgi?id=236425
	 * @throws Exception
	 */
	public void testBug236425() throws Exception {
		with(ReferenceGrammarStandaloneSetup.class);
		String model = "spielplatz 100 }";
		EObject object = getModel(model);
		CompositeNode node = NodeUtil.getRootNode(object);
		assertEquals(1,node.allSyntaxErrors().size());
	}
	
	
	public void testLexerError() throws Exception {
		with(ReferenceGrammarStandaloneSetup.class);
		String model = "spielplatz 100 '}";
		EObject object = getModel(model);
		CompositeNode node = NodeUtil.getRootNode(object);
		assertEquals(1,node.allSyntaxErrors().size());
		logger.debug(node.allSyntaxErrors().get(0).getMessage());
	}

}
