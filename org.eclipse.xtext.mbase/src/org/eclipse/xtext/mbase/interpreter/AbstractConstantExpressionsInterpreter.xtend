/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.interpreter

import com.google.inject.Inject
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.access.impl.ClassFinder
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.mbase.XBinaryOperation
import org.eclipse.xtext.mbase.XBooleanLiteral
import org.eclipse.xtext.mbase.XCastedExpression
import org.eclipse.xtext.mbase.XExpression
import org.eclipse.xtext.mbase.XStringLiteral
import org.eclipse.xtext.mbase.XTypeLiteral
import org.eclipse.xtext.mbase.XUnaryOperation
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation
import org.eclipse.xtext.mbase.XAbstractFeatureCall
import org.eclipse.xtext.resource.persistence.StorageAwareResource
import org.eclipse.xtext.mbase.scoping.featurecalls.OperatorMapping
import org.eclipse.xtext.naming.QualifiedName

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
class AbstractConstantExpressionsInterpreter {
	
	@Accessors(PROTECTED_GETTER)
	@Inject ConstantOperators constantOperators
	@Inject OperatorMapping operatorMapping

	def protected evaluate(XExpression expression, Context ctx) {
		if (ctx.alreadyEvaluating.add(expression)) {
			try {
				internalEvaluate(expression, ctx)
			} finally {
				ctx.alreadyEvaluating.remove(expression)
			}
		} else {
			throw notConstantExpression(expression)
		}
			
	}

	def dispatch Object internalEvaluate(XExpression expression, Context ctx) {
		throw notConstantExpression(expression)
	}
	
	def dispatch Object internalEvaluate(Void nullValue, Context ctx) {
		throw notConstantExpression(null)
	}
	
	def notConstantExpression(XExpression expression) {
		new ConstantExpressionEvaluationException("Not a constant expression : '" + expression?.toText + "'", expression)
	}
	
	def dispatch Object internalEvaluate(XCastedExpression expression, Context ctx) {
		evaluate(expression.target, ctx)
	}

	def dispatch Object internalEvaluate(XStringLiteral it, Context ctx) {
		value
	}

	def dispatch Object internalEvaluate(XBooleanLiteral it, Context ctx) {
		isTrue
	}

	def dispatch Object internalEvaluate(XAnnotation literal, Context ctx) {
		literal
	}

	def dispatch Object internalEvaluate(XTypeLiteral it, Context ctx) {
		toTypeReference(type, arrayDimensions.size)
	}

	protected def toTypeReference(JvmType type, int arrayDimensions) {
		if (type === null)
			return null
		var JvmTypeReference resultTypeRef = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference => [
			it.type = type
		]
		for (i : 0 ..< arrayDimensions) {
			val arrayRef = TypesFactory.eINSTANCE.createJvmGenericArrayTypeReference
			arrayRef.setComponentType(resultTypeRef);
			resultTypeRef = arrayRef
		}
		return resultTypeRef
	}

	def dispatch Object internalEvaluate(XBinaryOperation it, Context ctx) {
		val context = ctx.cloneWithExpectation(null)
		 
		val left = leftOperand.evaluate(context) 
		val right = rightOperand.evaluate(context)

		evaluateBinaryOperation(it, left, right)
	}
	
	protected def evaluateBinaryOperation(XBinaryOperation binaryOperation, Object left, Object right) {
		val op = binaryOperation.operator
		switch op {
			case '+': constantOperators.plus(left, right)
			case '-': constantOperators.minus(left, right)
			case '*': constantOperators.multiply(left, right)
			case '/': constantOperators.divide(left, right)
			case '%': constantOperators.modulo(left, right)
			case '&&': constantOperators.and(left, right)
			case '||': constantOperators.or(left, right)
			case '<<': constantOperators.shiftLeft(left, right)
			case '>>': constantOperators.shiftRight(left, right)
			case '>>>': constantOperators.shiftRightUnsigned(left, right)
			case '<': constantOperators.lessThan(left, right)
			case '>': constantOperators.greaterThan(left, right)
			case '<=': constantOperators.lessEquals(left, right)
			case '>=': constantOperators.greaterEquals(left, right)
			case '==', 
			case '===': constantOperators.same(left, right)
			case '!=',
			case '!==': constantOperators.notSame(left, right)
			default: throw new ConstantExpressionEvaluationException("Couldn't evaluate binary operator '" + op + "' on values " + left + " and " + right)
		}
	}

	def dispatch Object internalEvaluate(XUnaryOperation it, Context ctx) {
		val value = operand.evaluate(ctx)
		val op = operator
		switch op {
			case '-': constantOperators.minus(value)
			case op=='!' && value instanceof Boolean: !(value as Boolean)
			case op=='+' && value instanceof Number: value
			default: throw new ConstantExpressionEvaluationException("Couldn't evaluate unary operator '" + op + "' on value " + value)
		}
	}
	
	protected def String getOperator(XAbstractFeatureCall call) {
		switch res : call.eResource {
			StorageAwareResource case res.isLoadedFromStorage : {
				// we don't have a node model, but can resolve proxies
				return operatorMapping.getOperator(QualifiedName.create(call.feature.simpleName))?.toString
			}
			default: call.concreteSyntaxFeatureName
		}
	}

	protected def toText(XExpression expression) {
		NodeModelUtils.getNode(expression).text
	}

}

@Data class Context {
	JvmTypeReference expectedType
	ClassFinder classFinder
	Map<String, JvmIdentifiableElement> visibleFeatures
	Set<XExpression> alreadyEvaluating
	
	def cloneWithExpectation(JvmTypeReference newExpectation) {
		return new Context(newExpectation, classFinder, visibleFeatures, alreadyEvaluating)
	}
	
}

/**
 * Indicates a problem during evaluation
 */
class ConstantExpressionEvaluationException extends RuntimeException {

	XExpression expression
	
	new(String message) {
		super(message)
	}
	
	new(String message, XExpression expression) {
		this(message)
		this.expression = expression
	}

	def getExpression() {
		expression
	}
}

class UnresolvableFeatureException extends ConstantExpressionEvaluationException {
	
	new(String message, XExpression expression) {
		super(message, expression)
	}
	
}

class StackedConstantExpressionEvaluationException extends ConstantExpressionEvaluationException {
	
	JvmField field
	ConstantExpressionEvaluationException cause
	
	new(XExpression expression, JvmField field, ConstantExpressionEvaluationException cause) {
		super('Error during call to '+field.simpleName+' : ' +cause.message, expression)
		this.field = field
		this.cause = cause
	}
	
}
