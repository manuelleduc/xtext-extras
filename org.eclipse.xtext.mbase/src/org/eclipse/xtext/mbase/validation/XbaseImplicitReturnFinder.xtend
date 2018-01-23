/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.validation

import org.eclipse.xtext.mbase.XAbstractFeatureCall
import org.eclipse.xtext.mbase.XBlockExpression
import org.eclipse.xtext.mbase.XBooleanLiteral
import org.eclipse.xtext.mbase.XCastedExpression
import org.eclipse.xtext.mbase.XClosure
import org.eclipse.xtext.mbase.XCollectionLiteral
import org.eclipse.xtext.mbase.XConstructorCall
import org.eclipse.xtext.mbase.XExpression
import org.eclipse.xtext.mbase.XIfExpression
import org.eclipse.xtext.mbase.XInstanceOfExpression
import org.eclipse.xtext.mbase.XNullLiteral
import org.eclipse.xtext.mbase.XNumberLiteral
import org.eclipse.xtext.mbase.XStringLiteral
import org.eclipse.xtext.mbase.XSwitchExpression
import org.eclipse.xtext.mbase.XSynchronizedExpression
import org.eclipse.xtext.mbase.XTryCatchFinallyExpression
import org.eclipse.xtext.mbase.XTypeLiteral

/**
 * @author Stefan Oehme - Initial contribution and API
 */
class mbaseImplicitReturnFinder implements ImplicitReturnFinder {

	def dispatch void findImplicitReturns(Void expression, ImplicitReturnFinder.Acceptor acceptor) {
	}

	def dispatch void findImplicitReturns(XExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
	}
	
	def dispatch void findImplicitReturns(XNumberLiteral expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XBooleanLiteral expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XCollectionLiteral expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XStringLiteral expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XNullLiteral expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XTypeLiteral expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XClosure expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XConstructorCall expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XAbstractFeatureCall expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XInstanceOfExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XCastedExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
		acceptor.accept(expression)
	}

	def dispatch void findImplicitReturns(XBlockExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
		findImplicitReturns(expression.expressions.last, acceptor)
	}

	def dispatch void findImplicitReturns(XSynchronizedExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
		findImplicitReturns(expression.expression, acceptor)
	}

	def dispatch void findImplicitReturns(XIfExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
		findImplicitReturns(expression.then, acceptor)

		//TODO this will not find the implicit "return null" when there is no "else"
		findImplicitReturns(expression.^else, acceptor)
	}

	def dispatch void findImplicitReturns(XTryCatchFinallyExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
		findImplicitReturns(expression.expression, acceptor)
		expression.catchClauses.forEach[findImplicitReturns(it.expression, acceptor)]
	}

	def dispatch void findImplicitReturns(XSwitchExpression expression, ImplicitReturnFinder.Acceptor acceptor) {
		expression.cases.forEach[findImplicitReturns(it.then, acceptor)]
		findImplicitReturns(expression.^default, acceptor)
	}
}
