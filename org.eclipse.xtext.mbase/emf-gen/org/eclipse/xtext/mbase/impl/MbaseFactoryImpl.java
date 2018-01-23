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
public class MbaseFactoryImpl extends EFactoryImpl implements MbaseFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MbaseFactory init()
	{
		try
		{
			MbaseFactory theMbaseFactory = (MbaseFactory)EPackage.Registry.INSTANCE.getEFactory(MbasePackage.eNS_URI);
			if (theMbaseFactory != null)
			{
				return theMbaseFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MbaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MbaseFactoryImpl()
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
			case MbasePackage.XIF_EXPRESSION: return createXIfExpression();
			case MbasePackage.XSWITCH_EXPRESSION: return createXSwitchExpression();
			case MbasePackage.XCASE_PART: return createXCasePart();
			case MbasePackage.XBLOCK_EXPRESSION: return createXBlockExpression();
			case MbasePackage.XVARIABLE_DECLARATION: return createXVariableDeclaration();
			case MbasePackage.XMEMBER_FEATURE_CALL: return createXMemberFeatureCall();
			case MbasePackage.XFEATURE_CALL: return createXFeatureCall();
			case MbasePackage.XCONSTRUCTOR_CALL: return createXConstructorCall();
			case MbasePackage.XBOOLEAN_LITERAL: return createXBooleanLiteral();
			case MbasePackage.XNULL_LITERAL: return createXNullLiteral();
			case MbasePackage.XNUMBER_LITERAL: return createXNumberLiteral();
			case MbasePackage.XSTRING_LITERAL: return createXStringLiteral();
			case MbasePackage.XLIST_LITERAL: return createXListLiteral();
			case MbasePackage.XSET_LITERAL: return createXSetLiteral();
			case MbasePackage.XCLOSURE: return createXClosure();
			case MbasePackage.XCASTED_EXPRESSION: return createXCastedExpression();
			case MbasePackage.XBINARY_OPERATION: return createXBinaryOperation();
			case MbasePackage.XUNARY_OPERATION: return createXUnaryOperation();
			case MbasePackage.XPOSTFIX_OPERATION: return createXPostfixOperation();
			case MbasePackage.XFOR_LOOP_EXPRESSION: return createXForLoopExpression();
			case MbasePackage.XBASIC_FOR_LOOP_EXPRESSION: return createXBasicForLoopExpression();
			case MbasePackage.XDO_WHILE_EXPRESSION: return createXDoWhileExpression();
			case MbasePackage.XWHILE_EXPRESSION: return createXWhileExpression();
			case MbasePackage.XTYPE_LITERAL: return createXTypeLiteral();
			case MbasePackage.XINSTANCE_OF_EXPRESSION: return createXInstanceOfExpression();
			case MbasePackage.XTHROW_EXPRESSION: return createXThrowExpression();
			case MbasePackage.XTRY_CATCH_FINALLY_EXPRESSION: return createXTryCatchFinallyExpression();
			case MbasePackage.XCATCH_CLAUSE: return createXCatchClause();
			case MbasePackage.XASSIGNMENT: return createXAssignment();
			case MbasePackage.XRETURN_EXPRESSION: return createXReturnExpression();
			case MbasePackage.XSYNCHRONIZED_EXPRESSION: return createXSynchronizedExpression();
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
	public MbasePackage getMbasePackage()
	{
		return (MbasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MbasePackage getPackage()
	{
		return MbasePackage.eINSTANCE;
	}

} //MbaseFactoryImpl
