/*******************************************************************************
 * Copyright (c) 2010-2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.annotations.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.mbase.services.MbaseGrammarAccess;
import org.eclipse.xtext.mbase.services.XtypeGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MbaseWithAnnotationsGrammarAccess extends AbstractGrammarElementFinder {
	
	public class XAnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.mbase.annotations.MbaseWithAnnotations.XAnnotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cXAnnotationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCommercialAtKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAnnotationTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cAnnotationTypeJvmAnnotationTypeCrossReference_2_0 = (CrossReference)cAnnotationTypeAssignment_2.eContents().get(0);
		private final RuleCall cAnnotationTypeJvmAnnotationTypeQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cAnnotationTypeJvmAnnotationTypeCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Alternatives cAlternatives_3_1 = (Alternatives)cGroup_3.eContents().get(1);
		private final Group cGroup_3_1_0 = (Group)cAlternatives_3_1.eContents().get(0);
		private final Assignment cElementValuePairsAssignment_3_1_0_0 = (Assignment)cGroup_3_1_0.eContents().get(0);
		private final RuleCall cElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_0_0 = (RuleCall)cElementValuePairsAssignment_3_1_0_0.eContents().get(0);
		private final Group cGroup_3_1_0_1 = (Group)cGroup_3_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0_1_0 = (Keyword)cGroup_3_1_0_1.eContents().get(0);
		private final Assignment cElementValuePairsAssignment_3_1_0_1_1 = (Assignment)cGroup_3_1_0_1.eContents().get(1);
		private final RuleCall cElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_1_1_0 = (RuleCall)cElementValuePairsAssignment_3_1_0_1_1.eContents().get(0);
		private final Assignment cValueAssignment_3_1_1 = (Assignment)cAlternatives_3_1.eContents().get(1);
		private final RuleCall cValueXAnnotationElementValueOrCommaListParserRuleCall_3_1_1_0 = (RuleCall)cValueAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//XAnnotation:
		//	{XAnnotation}
		//	'@' annotationType=[types::JvmAnnotationType|QualifiedName] (=> '(' (elementValuePairs+=XAnnotationElementValuePair
		//	(',' elementValuePairs+=XAnnotationElementValuePair)*
		//	| value=XAnnotationElementValueOrCommaList)?
		//	')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//{XAnnotation} '@' annotationType=[types::JvmAnnotationType|QualifiedName] (=> '('
		//(elementValuePairs+=XAnnotationElementValuePair (',' elementValuePairs+=XAnnotationElementValuePair)* |
		//value=XAnnotationElementValueOrCommaList)? ')')?
		public Group getGroup() { return cGroup; }
		
		//{XAnnotation}
		public Action getXAnnotationAction_0() { return cXAnnotationAction_0; }
		
		//'@'
		public Keyword getCommercialAtKeyword_1() { return cCommercialAtKeyword_1; }
		
		//annotationType=[types::JvmAnnotationType|QualifiedName]
		public Assignment getAnnotationTypeAssignment_2() { return cAnnotationTypeAssignment_2; }
		
		//[types::JvmAnnotationType|QualifiedName]
		public CrossReference getAnnotationTypeJvmAnnotationTypeCrossReference_2_0() { return cAnnotationTypeJvmAnnotationTypeCrossReference_2_0; }
		
		//QualifiedName
		public RuleCall getAnnotationTypeJvmAnnotationTypeQualifiedNameParserRuleCall_2_0_1() { return cAnnotationTypeJvmAnnotationTypeQualifiedNameParserRuleCall_2_0_1; }
		
		//(=> '(' (elementValuePairs+=XAnnotationElementValuePair (',' elementValuePairs+=XAnnotationElementValuePair)* |
		//value=XAnnotationElementValueOrCommaList)? ')')?
		public Group getGroup_3() { return cGroup_3; }
		
		//=> '('
		public Keyword getLeftParenthesisKeyword_3_0() { return cLeftParenthesisKeyword_3_0; }
		
		//(elementValuePairs+=XAnnotationElementValuePair (',' elementValuePairs+=XAnnotationElementValuePair)* |
		//value=XAnnotationElementValueOrCommaList)?
		public Alternatives getAlternatives_3_1() { return cAlternatives_3_1; }
		
		//elementValuePairs+=XAnnotationElementValuePair (',' elementValuePairs+=XAnnotationElementValuePair)*
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//elementValuePairs+=XAnnotationElementValuePair
		public Assignment getElementValuePairsAssignment_3_1_0_0() { return cElementValuePairsAssignment_3_1_0_0; }
		
		//XAnnotationElementValuePair
		public RuleCall getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_0_0() { return cElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_0_0; }
		
		//(',' elementValuePairs+=XAnnotationElementValuePair)*
		public Group getGroup_3_1_0_1() { return cGroup_3_1_0_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0_1_0() { return cCommaKeyword_3_1_0_1_0; }
		
		//elementValuePairs+=XAnnotationElementValuePair
		public Assignment getElementValuePairsAssignment_3_1_0_1_1() { return cElementValuePairsAssignment_3_1_0_1_1; }
		
		//XAnnotationElementValuePair
		public RuleCall getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_1_1_0() { return cElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_1_1_0; }
		
		//value=XAnnotationElementValueOrCommaList
		public Assignment getValueAssignment_3_1_1() { return cValueAssignment_3_1_1; }
		
		//XAnnotationElementValueOrCommaList
		public RuleCall getValueXAnnotationElementValueOrCommaListParserRuleCall_3_1_1_0() { return cValueXAnnotationElementValueOrCommaListParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_2() { return cRightParenthesisKeyword_3_2; }
	}
	public class XAnnotationElementValuePairElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.mbase.annotations.MbaseWithAnnotations.XAnnotationElementValuePair");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cGroup_0.eContents().get(0);
		private final Assignment cElementAssignment_0_0_0 = (Assignment)cGroup_0_0.eContents().get(0);
		private final CrossReference cElementJvmOperationCrossReference_0_0_0_0 = (CrossReference)cElementAssignment_0_0_0.eContents().get(0);
		private final RuleCall cElementJvmOperationValidIDParserRuleCall_0_0_0_0_1 = (RuleCall)cElementJvmOperationCrossReference_0_0_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0_0_1 = (Keyword)cGroup_0_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueXAnnotationElementValueParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//XAnnotationElementValuePair:
		//	=> (element=[types::JvmOperation|ValidID] '=') value=XAnnotationElementValue;
		@Override public ParserRule getRule() { return rule; }
		
		//=> (element=[types::JvmOperation|ValidID] '=') value=XAnnotationElementValue
		public Group getGroup() { return cGroup; }
		
		//=> (element=[types::JvmOperation|ValidID] '=')
		public Group getGroup_0() { return cGroup_0; }
		
		//element=[types::JvmOperation|ValidID] '='
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//element=[types::JvmOperation|ValidID]
		public Assignment getElementAssignment_0_0_0() { return cElementAssignment_0_0_0; }
		
		//[types::JvmOperation|ValidID]
		public CrossReference getElementJvmOperationCrossReference_0_0_0_0() { return cElementJvmOperationCrossReference_0_0_0_0; }
		
		//ValidID
		public RuleCall getElementJvmOperationValidIDParserRuleCall_0_0_0_0_1() { return cElementJvmOperationValidIDParserRuleCall_0_0_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_0_0_1() { return cEqualsSignKeyword_0_0_1; }
		
		//value=XAnnotationElementValue
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//XAnnotationElementValue
		public RuleCall getValueXAnnotationElementValueParserRuleCall_1_0() { return cValueXAnnotationElementValueParserRuleCall_1_0; }
	}
	public class XAnnotationElementValueOrCommaListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.mbase.annotations.MbaseWithAnnotations.XAnnotationElementValueOrCommaList");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cGroup_0.eContents().get(0);
		private final Group cGroup_0_0_0 = (Group)cGroup_0_0.eContents().get(0);
		private final Action cXListLiteralAction_0_0_0_0 = (Action)cGroup_0_0_0.eContents().get(0);
		private final Keyword cNumberSignKeyword_0_0_0_1 = (Keyword)cGroup_0_0_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0_0_0_2 = (Keyword)cGroup_0_0_0.eContents().get(2);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Assignment cElementsAssignment_0_1_0 = (Assignment)cGroup_0_1.eContents().get(0);
		private final RuleCall cElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0 = (RuleCall)cElementsAssignment_0_1_0.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cGroup_0_1.eContents().get(1);
		private final Keyword cCommaKeyword_0_1_1_0 = (Keyword)cGroup_0_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_0_1_1_1 = (Assignment)cGroup_0_1_1.eContents().get(1);
		private final RuleCall cElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0 = (RuleCall)cElementsAssignment_0_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cXAnnotationOrExpressionParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Action cXListLiteralElementsAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cElementsXAnnotationOrExpressionParserRuleCall_1_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1_1.eContents().get(0);
		
		//XAnnotationElementValueOrCommaList mbase::XExpression:
		//	=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']'
		//	| XAnnotationOrExpression ({mbase::XListLiteral.elements+=current} (',' elements+=XAnnotationOrExpression)+)?;
		@Override public ParserRule getRule() { return rule; }
		
		//=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']' |
		//XAnnotationOrExpression ({mbase::XListLiteral.elements+=current} (',' elements+=XAnnotationOrExpression)+)?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']'
		public Group getGroup_0() { return cGroup_0; }
		
		//=> ({mbase::XListLiteral} '#' '[')
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//{mbase::XListLiteral} '#' '['
		public Group getGroup_0_0_0() { return cGroup_0_0_0; }
		
		//{mbase::XListLiteral}
		public Action getXListLiteralAction_0_0_0_0() { return cXListLiteralAction_0_0_0_0; }
		
		//'#'
		public Keyword getNumberSignKeyword_0_0_0_1() { return cNumberSignKeyword_0_0_0_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0_0_0_2() { return cLeftSquareBracketKeyword_0_0_0_2; }
		
		//(elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)?
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//elements+=XAnnotationOrExpression
		public Assignment getElementsAssignment_0_1_0() { return cElementsAssignment_0_1_0; }
		
		//XAnnotationOrExpression
		public RuleCall getElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0() { return cElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0; }
		
		//(',' elements+=XAnnotationOrExpression)*
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }
		
		//','
		public Keyword getCommaKeyword_0_1_1_0() { return cCommaKeyword_0_1_1_0; }
		
		//elements+=XAnnotationOrExpression
		public Assignment getElementsAssignment_0_1_1_1() { return cElementsAssignment_0_1_1_1; }
		
		//XAnnotationOrExpression
		public RuleCall getElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0() { return cElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_0_2() { return cRightSquareBracketKeyword_0_2; }
		
		//XAnnotationOrExpression ({mbase::XListLiteral.elements+=current} (',' elements+=XAnnotationOrExpression)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//XAnnotationOrExpression
		public RuleCall getXAnnotationOrExpressionParserRuleCall_1_0() { return cXAnnotationOrExpressionParserRuleCall_1_0; }
		
		//({mbase::XListLiteral.elements+=current} (',' elements+=XAnnotationOrExpression)+)?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{mbase::XListLiteral.elements+=current}
		public Action getXListLiteralElementsAction_1_1_0() { return cXListLiteralElementsAction_1_1_0; }
		
		//(',' elements+=XAnnotationOrExpression)+
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_1_0() { return cCommaKeyword_1_1_1_0; }
		
		//elements+=XAnnotationOrExpression
		public Assignment getElementsAssignment_1_1_1_1() { return cElementsAssignment_1_1_1_1; }
		
		//XAnnotationOrExpression
		public RuleCall getElementsXAnnotationOrExpressionParserRuleCall_1_1_1_1_0() { return cElementsXAnnotationOrExpressionParserRuleCall_1_1_1_1_0; }
	}
	public class XAnnotationElementValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.mbase.annotations.MbaseWithAnnotations.XAnnotationElementValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cGroup_0.eContents().get(0);
		private final Group cGroup_0_0_0 = (Group)cGroup_0_0.eContents().get(0);
		private final Action cXListLiteralAction_0_0_0_0 = (Action)cGroup_0_0_0.eContents().get(0);
		private final Keyword cNumberSignKeyword_0_0_0_1 = (Keyword)cGroup_0_0_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0_0_0_2 = (Keyword)cGroup_0_0_0.eContents().get(2);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Assignment cElementsAssignment_0_1_0 = (Assignment)cGroup_0_1.eContents().get(0);
		private final RuleCall cElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0 = (RuleCall)cElementsAssignment_0_1_0.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cGroup_0_1.eContents().get(1);
		private final Keyword cCommaKeyword_0_1_1_0 = (Keyword)cGroup_0_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_0_1_1_1 = (Assignment)cGroup_0_1_1.eContents().get(1);
		private final RuleCall cElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0 = (RuleCall)cElementsAssignment_0_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cXAnnotationOrExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//XAnnotationElementValue mbase::XExpression:
		//	=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']'
		//	| XAnnotationOrExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']' |
		//XAnnotationOrExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']'
		public Group getGroup_0() { return cGroup_0; }
		
		//=> ({mbase::XListLiteral} '#' '[')
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//{mbase::XListLiteral} '#' '['
		public Group getGroup_0_0_0() { return cGroup_0_0_0; }
		
		//{mbase::XListLiteral}
		public Action getXListLiteralAction_0_0_0_0() { return cXListLiteralAction_0_0_0_0; }
		
		//'#'
		public Keyword getNumberSignKeyword_0_0_0_1() { return cNumberSignKeyword_0_0_0_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0_0_0_2() { return cLeftSquareBracketKeyword_0_0_0_2; }
		
		//(elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)?
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//elements+=XAnnotationOrExpression
		public Assignment getElementsAssignment_0_1_0() { return cElementsAssignment_0_1_0; }
		
		//XAnnotationOrExpression
		public RuleCall getElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0() { return cElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0; }
		
		//(',' elements+=XAnnotationOrExpression)*
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }
		
		//','
		public Keyword getCommaKeyword_0_1_1_0() { return cCommaKeyword_0_1_1_0; }
		
		//elements+=XAnnotationOrExpression
		public Assignment getElementsAssignment_0_1_1_1() { return cElementsAssignment_0_1_1_1; }
		
		//XAnnotationOrExpression
		public RuleCall getElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0() { return cElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_0_2() { return cRightSquareBracketKeyword_0_2; }
		
		//XAnnotationOrExpression
		public RuleCall getXAnnotationOrExpressionParserRuleCall_1() { return cXAnnotationOrExpressionParserRuleCall_1; }
	}
	public class XAnnotationOrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.mbase.annotations.MbaseWithAnnotations.XAnnotationOrExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cXAnnotationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cXExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//XAnnotationOrExpression mbase::XExpression:
		//	XAnnotation | XExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//XAnnotation | XExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//XAnnotation
		public RuleCall getXAnnotationParserRuleCall_0() { return cXAnnotationParserRuleCall_0; }
		
		//XExpression
		public RuleCall getXExpressionParserRuleCall_1() { return cXExpressionParserRuleCall_1; }
	}
	
	
	private final XAnnotationElements pXAnnotation;
	private final XAnnotationElementValuePairElements pXAnnotationElementValuePair;
	private final XAnnotationElementValueOrCommaListElements pXAnnotationElementValueOrCommaList;
	private final XAnnotationElementValueElements pXAnnotationElementValue;
	private final XAnnotationOrExpressionElements pXAnnotationOrExpression;
	
	private final Grammar grammar;
	
	private final MbaseGrammarAccess gaMbase;
	
	private final XtypeGrammarAccess gaXtype;

	@Inject
	public MbaseWithAnnotationsGrammarAccess(GrammarProvider grammarProvider,
			MbaseGrammarAccess gaMbase,
			XtypeGrammarAccess gaXtype) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaMbase = gaMbase;
		this.gaXtype = gaXtype;
		this.pXAnnotation = new XAnnotationElements();
		this.pXAnnotationElementValuePair = new XAnnotationElementValuePairElements();
		this.pXAnnotationElementValueOrCommaList = new XAnnotationElementValueOrCommaListElements();
		this.pXAnnotationElementValue = new XAnnotationElementValueElements();
		this.pXAnnotationOrExpression = new XAnnotationOrExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.mbase.annotations.MbaseWithAnnotations".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public MbaseGrammarAccess getMbaseGrammarAccess() {
		return gaMbase;
	}
	
	public XtypeGrammarAccess getXtypeGrammarAccess() {
		return gaXtype;
	}

	
	//XAnnotation:
	//	{XAnnotation}
	//	'@' annotationType=[types::JvmAnnotationType|QualifiedName] (=> '(' (elementValuePairs+=XAnnotationElementValuePair
	//	(',' elementValuePairs+=XAnnotationElementValuePair)*
	//	| value=XAnnotationElementValueOrCommaList)?
	//	')')?;
	public XAnnotationElements getXAnnotationAccess() {
		return pXAnnotation;
	}
	
	public ParserRule getXAnnotationRule() {
		return getXAnnotationAccess().getRule();
	}
	
	//XAnnotationElementValuePair:
	//	=> (element=[types::JvmOperation|ValidID] '=') value=XAnnotationElementValue;
	public XAnnotationElementValuePairElements getXAnnotationElementValuePairAccess() {
		return pXAnnotationElementValuePair;
	}
	
	public ParserRule getXAnnotationElementValuePairRule() {
		return getXAnnotationElementValuePairAccess().getRule();
	}
	
	//XAnnotationElementValueOrCommaList mbase::XExpression:
	//	=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']'
	//	| XAnnotationOrExpression ({mbase::XListLiteral.elements+=current} (',' elements+=XAnnotationOrExpression)+)?;
	public XAnnotationElementValueOrCommaListElements getXAnnotationElementValueOrCommaListAccess() {
		return pXAnnotationElementValueOrCommaList;
	}
	
	public ParserRule getXAnnotationElementValueOrCommaListRule() {
		return getXAnnotationElementValueOrCommaListAccess().getRule();
	}
	
	//XAnnotationElementValue mbase::XExpression:
	//	=> ({mbase::XListLiteral} '#' '[') (elements+=XAnnotationOrExpression (',' elements+=XAnnotationOrExpression)*)? ']'
	//	| XAnnotationOrExpression;
	public XAnnotationElementValueElements getXAnnotationElementValueAccess() {
		return pXAnnotationElementValue;
	}
	
	public ParserRule getXAnnotationElementValueRule() {
		return getXAnnotationElementValueAccess().getRule();
	}
	
	//XAnnotationOrExpression mbase::XExpression:
	//	XAnnotation | XExpression;
	public XAnnotationOrExpressionElements getXAnnotationOrExpressionAccess() {
		return pXAnnotationOrExpression;
	}
	
	public ParserRule getXAnnotationOrExpressionRule() {
		return getXAnnotationOrExpressionAccess().getRule();
	}
	
	//XExpression:
	//	XAssignment;
	public MbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaMbase.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}
	
	//XAssignment XExpression:
	//	{XAssignment} feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign value=XAssignment | XOrExpression
	//	(=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign])
	//	rightOperand=XAssignment)?;
	public MbaseGrammarAccess.XAssignmentElements getXAssignmentAccess() {
		return gaMbase.getXAssignmentAccess();
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}
	
	//OpSingleAssign:
	//	'=';
	public MbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaMbase.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}
	
	//OpMultiAssign:
	//	'+=' | '-=' | '*=' | '/=' | '%=' |
	//	'<' '<' '=' |
	//	'>' '>'? '>=';
	public MbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaMbase.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}
	
	//XOrExpression XExpression:
	//	XAndExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr])
	//	rightOperand=XAndExpression)*;
	public MbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaMbase.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}
	
	//OpOr:
	//	'||';
	public MbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaMbase.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}
	
	//XAndExpression XExpression:
	//	XEqualityExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd])
	//	rightOperand=XEqualityExpression)*;
	public MbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaMbase.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}
	
	//OpAnd:
	//	'&&';
	public MbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaMbase.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}
	
	//XEqualityExpression XExpression:
	//	XRelationalExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//	rightOperand=XRelationalExpression)*;
	public MbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaMbase.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}
	
	//OpEquality:
	//	'==' | '!=' | '===' | '!==';
	public MbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaMbase.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}
	
	//XRelationalExpression XExpression:
	//	XOtherOperatorExpression (=> ({XInstanceOfExpression.expression=current} 'instanceof') type=JvmTypeReference |
	//	=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpCompare])
	//	rightOperand=XOtherOperatorExpression)*;
	public MbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaMbase.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}
	
	//OpCompare:
	//	'>=' | '<' '=' | '>' | '<';
	public MbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaMbase.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}
	
	//XOtherOperatorExpression XExpression:
	//	XAdditiveExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//	rightOperand=XAdditiveExpression)*;
	public MbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaMbase.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}
	
	//OpOther:
	//	'->'
	//	| '..<'
	//	| '>' '..'
	//	| '..'
	//	| '=>'
	//	| '>' (=> ('>' '>') | '>') | '<' (=> ('<' '<') | '<' | '=>') | '<>'
	//	| '?:';
	public MbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaMbase.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}
	
	//XAdditiveExpression XExpression:
	//	XMultiplicativeExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//	rightOperand=XMultiplicativeExpression)*;
	public MbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaMbase.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}
	
	//OpAdd:
	//	'+' | '-';
	public MbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaMbase.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}
	
	//XMultiplicativeExpression XExpression:
	//	XUnaryOperation (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti])
	//	rightOperand=XUnaryOperation)*;
	public MbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaMbase.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}
	
	//OpMulti:
	//	'*' | '**' | '/' | '%';
	public MbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaMbase.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}
	
	//XUnaryOperation XExpression:
	//	{XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XUnaryOperation
	//	| XCastedExpression;
	public MbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaMbase.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}
	
	//OpUnary:
	//	"!" | "-" | "+";
	public MbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaMbase.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}
	
	//XCastedExpression XExpression:
	//	XPostfixOperation (=> ({XCastedExpression.target=current} 'as') type=JvmTypeReference)*;
	public MbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaMbase.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}
	
	//XPostfixOperation XExpression:
	//	XMemberFeatureCall => ({XPostfixOperation.operand=current} feature=[types::JvmIdentifiableElement|OpPostfix])?;
	public MbaseGrammarAccess.XPostfixOperationElements getXPostfixOperationAccess() {
		return gaMbase.getXPostfixOperationAccess();
	}
	
	public ParserRule getXPostfixOperationRule() {
		return getXPostfixOperationAccess().getRule();
	}
	
	//OpPostfix:
	//	"++" | "--";
	public MbaseGrammarAccess.OpPostfixElements getOpPostfixAccess() {
		return gaMbase.getOpPostfixAccess();
	}
	
	public ParserRule getOpPostfixRule() {
		return getOpPostfixAccess().getRule();
	}
	
	//XMemberFeatureCall XExpression:
	//	XPrimaryExpression (=> ({XAssignment.assignable=current} ('.' | explicitStatic?="::")
	//	feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign) value=XAssignment
	//	| => ({XMemberFeatureCall.memberCallTarget=current} ("." | nullSafe?="?." | explicitStatic?="::")) ('<'
	//	typeArguments+=JvmArgumentTypeReference (',' typeArguments+=JvmArgumentTypeReference)* '>')?
	//	feature=[types::JvmIdentifiableElement|IdOrSuper] (=> explicitOperationCall?='(' (memberCallArguments+=XShortClosure
	//	| memberCallArguments+=XExpression (',' memberCallArguments+=XExpression)*)?
	//	')')?
	//	memberCallArguments+=XClosure?)*;
	public MbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaMbase.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}
	
	//XPrimaryExpression XExpression:
	//	XConstructorCall | XBlockExpression | XSwitchExpression | XSynchronizedExpression | XFeatureCall | XLiteral |
	//	XIfExpression | XForLoopExpression | XBasicForLoopExpression | XWhileExpression | XDoWhileExpression |
	//	XThrowExpression | XReturnExpression | XTryCatchFinallyExpression | XParenthesizedExpression;
	public MbaseGrammarAccess.XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return gaMbase.getXPrimaryExpressionAccess();
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}
	
	//XLiteral XExpression:
	//	XCollectionLiteral | XClosure | XBooleanLiteral | XNumberLiteral | XNullLiteral | XStringLiteral | XTypeLiteral;
	public MbaseGrammarAccess.XLiteralElements getXLiteralAccess() {
		return gaMbase.getXLiteralAccess();
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}
	
	//XCollectionLiteral:
	//	XSetLiteral | XListLiteral;
	public MbaseGrammarAccess.XCollectionLiteralElements getXCollectionLiteralAccess() {
		return gaMbase.getXCollectionLiteralAccess();
	}
	
	public ParserRule getXCollectionLiteralRule() {
		return getXCollectionLiteralAccess().getRule();
	}
	
	//XSetLiteral:
	//	{XSetLiteral} '#' '{' (elements+=XExpression (',' elements+=XExpression)*)? '}';
	public MbaseGrammarAccess.XSetLiteralElements getXSetLiteralAccess() {
		return gaMbase.getXSetLiteralAccess();
	}
	
	public ParserRule getXSetLiteralRule() {
		return getXSetLiteralAccess().getRule();
	}
	
	//XListLiteral:
	//	{XListLiteral} '#' '[' (elements+=XExpression (',' elements+=XExpression)*)? ']';
	public MbaseGrammarAccess.XListLiteralElements getXListLiteralAccess() {
		return gaMbase.getXListLiteralAccess();
	}
	
	public ParserRule getXListLiteralRule() {
		return getXListLiteralAccess().getRule();
	}
	
	//XClosure XExpression:
	//	=> ({XClosure}
	//	'[')
	//	=> ((declaredFormalParameters+=JvmFormalParameter (',' declaredFormalParameters+=JvmFormalParameter)*)?
	//	explicitSyntax?='|')?
	//	expression=XExpressionInClosure
	//	']';
	public MbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaMbase.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}
	
	//XExpressionInClosure XExpression:
	//	{XBlockExpression} (expressions+=XExpressionOrVarDeclaration ';'?)*;
	public MbaseGrammarAccess.XExpressionInClosureElements getXExpressionInClosureAccess() {
		return gaMbase.getXExpressionInClosureAccess();
	}
	
	public ParserRule getXExpressionInClosureRule() {
		return getXExpressionInClosureAccess().getRule();
	}
	
	//XShortClosure XExpression:
	//	=> ({XClosure} (declaredFormalParameters+=JvmFormalParameter (',' declaredFormalParameters+=JvmFormalParameter)*)?
	//	explicitSyntax?='|') expression=XExpression;
	public MbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaMbase.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}
	
	//XParenthesizedExpression XExpression:
	//	'(' XExpression ')';
	public MbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaMbase.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}
	
	//XIfExpression XExpression:
	//	{XIfExpression}
	//	'if' '(' if=XExpression ')'
	//	then=XExpression (=> 'else' else=XExpression)?;
	public MbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaMbase.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}
	
	//XSwitchExpression XExpression:
	//	{XSwitchExpression}
	//	'switch' (=> ('(' declaredParam=JvmFormalParameter ':') switch=XExpression ')'
	//	| => (declaredParam=JvmFormalParameter ':')? switch=XExpression) '{'
	//	cases+=XCasePart* ('default' ':' default=XExpression)?
	//	'}';
	public MbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaMbase.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}
	
	//XCasePart:
	//	{XCasePart} typeGuard=JvmTypeReference? ('case' case=XExpression)? (':' then=XExpression | fallThrough?=',');
	public MbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaMbase.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}
	
	//XForLoopExpression XExpression:
	//	=> ({XForLoopExpression}
	//	'for' '(' declaredParam=JvmFormalParameter ':') forExpression=XExpression ')'
	//	eachExpression=XExpression;
	public MbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaMbase.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}
	
	//XBasicForLoopExpression XExpression:
	//	{XBasicForLoopExpression}
	//	'for' '(' (initExpressions+=XExpressionOrVarDeclaration (',' initExpressions+=XExpressionOrVarDeclaration)*)? ';'
	//	expression=XExpression? ';' (updateExpressions+=XExpression (',' updateExpressions+=XExpression)*)? ')'
	//	eachExpression=XExpression;
	public MbaseGrammarAccess.XBasicForLoopExpressionElements getXBasicForLoopExpressionAccess() {
		return gaMbase.getXBasicForLoopExpressionAccess();
	}
	
	public ParserRule getXBasicForLoopExpressionRule() {
		return getXBasicForLoopExpressionAccess().getRule();
	}
	
	//XWhileExpression XExpression:
	//	{XWhileExpression}
	//	'while' '(' predicate=XExpression ')'
	//	body=XExpression;
	public MbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaMbase.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}
	
	//XDoWhileExpression XExpression:
	//	{XDoWhileExpression}
	//	'do'
	//	body=XExpression
	//	'while' '(' predicate=XExpression ')';
	public MbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaMbase.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}
	
	//XBlockExpression XExpression:
	//	{XBlockExpression}
	//	'{' (expressions+=XExpressionOrVarDeclaration ';'?)*
	//	'}';
	public MbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaMbase.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}
	
	//XExpressionOrVarDeclaration XExpression:
	//	XVariableDeclaration | XExpression;
	public MbaseGrammarAccess.XExpressionOrVarDeclarationElements getXExpressionOrVarDeclarationAccess() {
		return gaMbase.getXExpressionOrVarDeclarationAccess();
	}
	
	public ParserRule getXExpressionOrVarDeclarationRule() {
		return getXExpressionOrVarDeclarationAccess().getRule();
	}
	
	//XVariableDeclaration XExpression:
	//	{XVariableDeclaration} (writeable?='var' | 'val') (=> (type=JvmTypeReference name=ValidID) | name=ValidID) ('='
	//	right=XExpression)?;
	public MbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaMbase.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}
	
	//JvmFormalParameter types::JvmFormalParameter:
	//	parameterType=JvmTypeReference? name=ValidID;
	public MbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaMbase.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}
	
	//FullJvmFormalParameter types::JvmFormalParameter:
	//	parameterType=JvmTypeReference name=ValidID;
	public MbaseGrammarAccess.FullJvmFormalParameterElements getFullJvmFormalParameterAccess() {
		return gaMbase.getFullJvmFormalParameterAccess();
	}
	
	public ParserRule getFullJvmFormalParameterRule() {
		return getFullJvmFormalParameterAccess().getRule();
	}
	
	//XFeatureCall XExpression:
	//	{XFeatureCall} ('<' typeArguments+=JvmArgumentTypeReference (',' typeArguments+=JvmArgumentTypeReference)* '>')?
	//	feature=[types::JvmIdentifiableElement|IdOrSuper] (=> explicitOperationCall?='(' (featureCallArguments+=XShortClosure
	//	| featureCallArguments+=XExpression (',' featureCallArguments+=XExpression)*)?
	//	')')?
	//	featureCallArguments+=XClosure?;
	public MbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaMbase.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}
	
	//FeatureCallID:
	//	ValidID | 'extends' | 'static' | 'import' | 'extension';
	public MbaseGrammarAccess.FeatureCallIDElements getFeatureCallIDAccess() {
		return gaMbase.getFeatureCallIDAccess();
	}
	
	public ParserRule getFeatureCallIDRule() {
		return getFeatureCallIDAccess().getRule();
	}
	
	//IdOrSuper:
	//	FeatureCallID | 'super';
	public MbaseGrammarAccess.IdOrSuperElements getIdOrSuperAccess() {
		return gaMbase.getIdOrSuperAccess();
	}
	
	public ParserRule getIdOrSuperRule() {
		return getIdOrSuperAccess().getRule();
	}
	
	//XConstructorCall XExpression:
	//	{XConstructorCall}
	//	'new' constructor=[types::JvmConstructor|QualifiedName] (=> '<' typeArguments+=JvmArgumentTypeReference (','
	//	typeArguments+=JvmArgumentTypeReference)* '>')? (=> explicitConstructorCall?='(' (arguments+=XShortClosure
	//	| arguments+=XExpression (',' arguments+=XExpression)*)?
	//	')')?
	//	arguments+=XClosure?;
	public MbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaMbase.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}
	
	//XBooleanLiteral XExpression:
	//	{XBooleanLiteral} ('false' | isTrue?='true');
	public MbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaMbase.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}
	
	//XNullLiteral XExpression:
	//	{XNullLiteral} 'null';
	public MbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaMbase.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}
	
	//XNumberLiteral XExpression:
	//	{XNumberLiteral} value=Number;
	public MbaseGrammarAccess.XNumberLiteralElements getXNumberLiteralAccess() {
		return gaMbase.getXNumberLiteralAccess();
	}
	
	public ParserRule getXNumberLiteralRule() {
		return getXNumberLiteralAccess().getRule();
	}
	
	//XStringLiteral XExpression:
	//	{XStringLiteral} value=STRING;
	public MbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaMbase.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}
	
	//XTypeLiteral XExpression:
	//	{XTypeLiteral} 'typeof' '(' type=[types::JvmType|QualifiedName] arrayDimensions+=ArrayBrackets* ')';
	public MbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaMbase.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}
	
	//XThrowExpression XExpression:
	//	{XThrowExpression} 'throw' expression=XExpression;
	public MbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaMbase.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}
	
	//XReturnExpression XExpression:
	//	{XReturnExpression} 'return' -> expression=XExpression?;
	public MbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaMbase.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}
	
	//XTryCatchFinallyExpression XExpression:
	//	{XTryCatchFinallyExpression}
	//	'try'
	//	expression=XExpression (catchClauses+=XCatchClause+ (=> 'finally' finallyExpression=XExpression)?
	//	| 'finally' finallyExpression=XExpression);
	public MbaseGrammarAccess.XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return gaMbase.getXTryCatchFinallyExpressionAccess();
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}
	
	//XSynchronizedExpression XExpression:
	//	=> ({XSynchronizedExpression}
	//	'synchronized' '(') param=XExpression ')' expression=XExpression;
	public MbaseGrammarAccess.XSynchronizedExpressionElements getXSynchronizedExpressionAccess() {
		return gaMbase.getXSynchronizedExpressionAccess();
	}
	
	public ParserRule getXSynchronizedExpressionRule() {
		return getXSynchronizedExpressionAccess().getRule();
	}
	
	//XCatchClause:
	//	=> 'catch' '(' declaredParam=FullJvmFormalParameter ')' expression=XExpression;
	public MbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaMbase.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}
	
	//@Override
	//QualifiedName:
	//	ValidID (=> '.' ValidID)*;
	public MbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaMbase.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Number hidden():
	//	HEX | (INT | DECIMAL) ('.' (INT | DECIMAL))?;
	public MbaseGrammarAccess.NumberElements getNumberAccess() {
		return gaMbase.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	///**
	// * Dummy rule, for "better" downwards compatibility, since GrammarAccess generates non-static inner classes,
	// * which makes downstream grammars break on classloading, when a rule is removed.
	// */ StaticQualifier:
	//	(ValidID '::')+;
	public MbaseGrammarAccess.StaticQualifierElements getStaticQualifierAccess() {
		return gaMbase.getStaticQualifierAccess();
	}
	
	public ParserRule getStaticQualifierRule() {
		return getStaticQualifierAccess().getRule();
	}
	
	//terminal HEX:
	//	('0x' | '0X') ('0'..'9' | 'a'..'f' | 'A'..'F' | '_')+ ('#' (('b' | 'B') ('i' | 'I') | ('l' | 'L')))?;
	public TerminalRule getHEXRule() {
		return gaMbase.getHEXRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9' ('0'..'9' | '_')*;
	public TerminalRule getINTRule() {
		return gaMbase.getINTRule();
	}
	
	//terminal DECIMAL:
	//	INT (('e' | 'E') ('+' | '-')? INT)? (('b' | 'B') ('i' | 'I' | 'd' | 'D') | ('l' | 'L' | 'd' | 'D' | 'f' | 'F'))?;
	public TerminalRule getDECIMALRule() {
		return gaMbase.getDECIMALRule();
	}
	
	//JvmTypeReference:
	//	JvmParameterizedTypeReference => ({JvmGenericArrayTypeReference.componentType=current} ArrayBrackets)*
	//	| XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXtype.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}
	
	//ArrayBrackets:
	//	'[' ']';
	public XtypeGrammarAccess.ArrayBracketsElements getArrayBracketsAccess() {
		return gaXtype.getArrayBracketsAccess();
	}
	
	public ParserRule getArrayBracketsRule() {
		return getArrayBracketsAccess().getRule();
	}
	
	//XFunctionTypeRef:
	//	('(' (paramTypes+=JvmTypeReference (',' paramTypes+=JvmTypeReference)*)? ')')? '=>' returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXtype.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}
	
	//JvmParameterizedTypeReference:
	//	type=[JvmType|super::QualifiedName] (=> '<' arguments+=JvmArgumentTypeReference (','
	//	arguments+=JvmArgumentTypeReference)* '>' (=> ({JvmInnerTypeReference.outer=current} '.') type=[JvmType|ValidID] (=>
	//	'<' arguments+=JvmArgumentTypeReference (',' arguments+=JvmArgumentTypeReference)* '>')?)*)?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXtype.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}
	
	//JvmArgumentTypeReference JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXtype.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}
	
	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} '?' (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*
	//	| constraints+=JvmLowerBound constraints+=JvmLowerBoundAnded*)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXtype.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}
	
	//JvmUpperBound:
	//	'extends' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXtype.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}
	
	//JvmUpperBoundAnded JvmUpperBound:
	//	'&' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXtype.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}
	
	//JvmLowerBound:
	//	'super' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXtype.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}
	
	//JvmLowerBoundAnded JvmLowerBound:
	//	'&' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundAndedElements getJvmLowerBoundAndedAccess() {
		return gaXtype.getJvmLowerBoundAndedAccess();
	}
	
	public ParserRule getJvmLowerBoundAndedRule() {
		return getJvmLowerBoundAndedAccess().getRule();
	}
	
	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXtype.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	super::QualifiedName '.' '*';
	public XtypeGrammarAccess.QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return gaXtype.getQualifiedNameWithWildcardAccess();
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXtype.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//XImportSection:
	//	importDeclarations+=XImportDeclaration+;
	public XtypeGrammarAccess.XImportSectionElements getXImportSectionAccess() {
		return gaXtype.getXImportSectionAccess();
	}
	
	public ParserRule getXImportSectionRule() {
		return getXImportSectionAccess().getRule();
	}
	
	//XImportDeclaration:
	//	'import' (static?='static' extension?='extension'? importedType=[JvmDeclaredType|QualifiedNameInStaticImport]
	//	(wildcard?='*' | memberName=ValidID) | importedType=[JvmDeclaredType|super::QualifiedName] |
	//	importedNamespace=QualifiedNameWithWildcard) ';'?;
	public XtypeGrammarAccess.XImportDeclarationElements getXImportDeclarationAccess() {
		return gaXtype.getXImportDeclarationAccess();
	}
	
	public ParserRule getXImportDeclarationRule() {
		return getXImportDeclarationAccess().getRule();
	}
	
	//QualifiedNameInStaticImport:
	//	(ValidID '.')+;
	public XtypeGrammarAccess.QualifiedNameInStaticImportElements getQualifiedNameInStaticImportAccess() {
		return gaXtype.getQualifiedNameInStaticImportAccess();
	}
	
	public ParserRule getQualifiedNameInStaticImportRule() {
		return getQualifiedNameInStaticImportAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '$' | '_') ('a'..'z' | 'A'..'Z' | '$' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaXtype.getIDRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"'? |
	//	"'" ('\\' . | !('\\' | "'"))* "'"?;
	public TerminalRule getSTRINGRule() {
		return gaXtype.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaXtype.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXtype.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaXtype.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXtype.getANY_OTHERRule();
	}
}
