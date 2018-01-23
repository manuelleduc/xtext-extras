/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.mbase.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class mbaseFactoryImpl extends EFactoryImpl implements mbaseFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static mbaseFactory init()
	{
		try
		{
			mbaseFactory thembaseFactory = (mbaseFactory)EPackage.Registry.INSTANCE.getEFactory(mbasePackage.eNS_URI);
			if (thembaseFactory != null)
			{
				return thembaseFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mbaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mbaseFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case mbasePackage.XIF_EXPRESSION: return createXIfExpression();
			case mbasePackage.XSWITCH_EXPRESSION: return createXSwitchExpression();
			case mbasePackage.XCASE_PART: return createXCasePart();
			case mbasePackage.XBLOCK_EXPRESSION: return createXBlockExpression();
			case mbasePackage.XVARIABLE_DECLARATION: return createXVariableDeclaration();
			case mbasePackage.XMEMBER_FEATURE_CALL: return createXMemberFeatureCall();
			case mbasePackage.XFEATURE_CALL: return createXFeatureCall();
			case mbasePackage.XCONSTRUCTOR_CALL: return createXConstructorCall();
			case mbasePackage.XBOOLEAN_LITERAL: return createXBooleanLiteral();
			case mbasePackage.XNULL_LITERAL: return createXNullLiteral();
			case mbasePackage.XNUMBER_LITERAL: return createXNumberLiteral();
			case mbasePackage.XSTRING_LITERAL: return createXStringLiteral();
			case mbasePackage.XLIST_LITERAL: return createXListLiteral();
			case mbasePackage.XSET_LITERAL: return createXSetLiteral();
			case mbasePackage.XCLOSURE: return createXClosure();
			case mbasePackage.XCASTED_EXPRESSION: return createXCastedExpression();
			case mbasePackage.XBINARY_OPERATION: return createXBinaryOperation();
			case mbasePackage.XUNARY_OPERATION: return createXUnaryOperation();
			case mbasePackage.XPOSTFIX_OPERATION: return createXPostfixOperation();
			case mbasePackage.XFOR_LOOP_EXPRESSION: return createXForLoopExpression();
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION: return createXBasicForLoopExpression();
			case mbasePackage.XDO_WHILE_EXPRESSION: return createXDoWhileExpression();
			case mbasePackage.XWHILE_EXPRESSION: return createXWhileExpression();
			case mbasePackage.XTYPE_LITERAL: return createXTypeLiteral();
			case mbasePackage.XINSTANCE_OF_EXPRESSION: return createXInstanceOfExpression();
			case mbasePackage.XTHROW_EXPRESSION: return createXThrowExpression();
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION: return createXTryCatchFinallyExpression();
			case mbasePackage.XCATCH_CLAUSE: return createXCatchClause();
			case mbasePackage.XASSIGNMENT: return createXAssignment();
			case mbasePackage.XRETURN_EXPRESSION: return createXReturnExpression();
			case mbasePackage.XSYNCHRONIZED_EXPRESSION: return createXSynchronizedExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XIfExpression createXIfExpression()
	{
		XIfExpressionImpl xIfExpression = new XIfExpressionImpl();
		return xIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSwitchExpression createXSwitchExpression()
	{
		XSwitchExpressionImpl xSwitchExpression = new XSwitchExpressionImpl();
		return xSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCasePart createXCasePart()
	{
		XCasePartImplCustom xCasePart = new XCasePartImplCustom();
		return xCasePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBlockExpression createXBlockExpression()
	{
		XBlockExpressionImplCustom xBlockExpression = new XBlockExpressionImplCustom();
		return xBlockExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XVariableDeclaration createXVariableDeclaration()
	{
		XVariableDeclarationImplCustom xVariableDeclaration = new XVariableDeclarationImplCustom();
		return xVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMemberFeatureCall createXMemberFeatureCall()
	{
		XMemberFeatureCallImplCustom xMemberFeatureCall = new XMemberFeatureCallImplCustom();
		return xMemberFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XFeatureCall createXFeatureCall()
	{
		XFeatureCallImplCustom xFeatureCall = new XFeatureCallImplCustom();
		return xFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XConstructorCall createXConstructorCall()
	{
		XConstructorCallImplCustom xConstructorCall = new XConstructorCallImplCustom();
		return xConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBooleanLiteral createXBooleanLiteral()
	{
		XBooleanLiteralImpl xBooleanLiteral = new XBooleanLiteralImpl();
		return xBooleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XNullLiteral createXNullLiteral()
	{
		XNullLiteralImplCustom xNullLiteral = new XNullLiteralImplCustom();
		return xNullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XNumberLiteral createXNumberLiteral()
	{
		XNumberLiteralImpl xNumberLiteral = new XNumberLiteralImpl();
		return xNumberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XStringLiteral createXStringLiteral()
	{
		XStringLiteralImpl xStringLiteral = new XStringLiteralImpl();
		return xStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XListLiteral createXListLiteral()
	{
		XListLiteralImpl xListLiteral = new XListLiteralImpl();
		return xListLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSetLiteral createXSetLiteral()
	{
		XSetLiteralImpl xSetLiteral = new XSetLiteralImpl();
		return xSetLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClosure createXClosure()
	{
		XClosureImplCustom xClosure = new XClosureImplCustom();
		return xClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCastedExpression createXCastedExpression()
	{
		XCastedExpressionImpl xCastedExpression = new XCastedExpressionImpl();
		return xCastedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBinaryOperation createXBinaryOperation()
	{
		XBinaryOperationImplCustom xBinaryOperation = new XBinaryOperationImplCustom();
		return xBinaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XUnaryOperation createXUnaryOperation()
	{
		XUnaryOperationImplCustom xUnaryOperation = new XUnaryOperationImplCustom();
		return xUnaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPostfixOperation createXPostfixOperation()
	{
		XPostfixOperationImplCustom xPostfixOperation = new XPostfixOperationImplCustom();
		return xPostfixOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XForLoopExpression createXForLoopExpression()
	{
		XForLoopExpressionImpl xForLoopExpression = new XForLoopExpressionImpl();
		return xForLoopExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBasicForLoopExpression createXBasicForLoopExpression()
	{
		XBasicForLoopExpressionImpl xBasicForLoopExpression = new XBasicForLoopExpressionImpl();
		return xBasicForLoopExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDoWhileExpression createXDoWhileExpression()
	{
		XDoWhileExpressionImpl xDoWhileExpression = new XDoWhileExpressionImpl();
		return xDoWhileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWhileExpression createXWhileExpression()
	{
		XWhileExpressionImpl xWhileExpression = new XWhileExpressionImpl();
		return xWhileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTypeLiteral createXTypeLiteral()
	{
		XTypeLiteralImplCustom xTypeLiteral = new XTypeLiteralImplCustom();
		return xTypeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XInstanceOfExpression createXInstanceOfExpression()
	{
		XInstanceOfExpressionImpl xInstanceOfExpression = new XInstanceOfExpressionImpl();
		return xInstanceOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XThrowExpression createXThrowExpression()
	{
		XThrowExpressionImpl xThrowExpression = new XThrowExpressionImpl();
		return xThrowExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTryCatchFinallyExpression createXTryCatchFinallyExpression()
	{
		XTryCatchFinallyExpressionImpl xTryCatchFinallyExpression = new XTryCatchFinallyExpressionImpl();
		return xTryCatchFinallyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCatchClause createXCatchClause()
	{
		XCatchClauseImpl xCatchClause = new XCatchClauseImpl();
		return xCatchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAssignment createXAssignment()
	{
		XAssignmentImplCustom xAssignment = new XAssignmentImplCustom();
		return xAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XReturnExpression createXReturnExpression()
	{
		XReturnExpressionImplCustom xReturnExpression = new XReturnExpressionImplCustom();
		return xReturnExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSynchronizedExpression createXSynchronizedExpression()
	{
		XSynchronizedExpressionImpl xSynchronizedExpression = new XSynchronizedExpressionImpl();
		return xSynchronizedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mbasePackage getmbasePackage()
	{
		return (mbasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mbasePackage getPackage()
	{
		return mbasePackage.eINSTANCE;
	}

} //mbaseFactoryImpl
