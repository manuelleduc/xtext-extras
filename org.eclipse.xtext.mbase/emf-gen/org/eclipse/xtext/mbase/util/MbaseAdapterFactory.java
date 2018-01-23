/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

import org.eclipse.xtext.mbase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.mbase.MbasePackage
 * @generated
 */
public class MbaseAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MbasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MbaseAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = MbasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MbaseSwitch<Adapter> modelSwitch =
		new MbaseSwitch<Adapter>()
		{
			@Override
			public Adapter caseXExpression(XExpression object)
			{
				return createXExpressionAdapter();
			}
			@Override
			public Adapter caseXIfExpression(XIfExpression object)
			{
				return createXIfExpressionAdapter();
			}
			@Override
			public Adapter caseXSwitchExpression(XSwitchExpression object)
			{
				return createXSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseXCasePart(XCasePart object)
			{
				return createXCasePartAdapter();
			}
			@Override
			public Adapter caseXBlockExpression(XBlockExpression object)
			{
				return createXBlockExpressionAdapter();
			}
			@Override
			public Adapter caseXVariableDeclaration(XVariableDeclaration object)
			{
				return createXVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseXAbstractFeatureCall(XAbstractFeatureCall object)
			{
				return createXAbstractFeatureCallAdapter();
			}
			@Override
			public Adapter caseXMemberFeatureCall(XMemberFeatureCall object)
			{
				return createXMemberFeatureCallAdapter();
			}
			@Override
			public Adapter caseXFeatureCall(XFeatureCall object)
			{
				return createXFeatureCallAdapter();
			}
			@Override
			public Adapter caseXConstructorCall(XConstructorCall object)
			{
				return createXConstructorCallAdapter();
			}
			@Override
			public Adapter caseXBooleanLiteral(XBooleanLiteral object)
			{
				return createXBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseXNullLiteral(XNullLiteral object)
			{
				return createXNullLiteralAdapter();
			}
			@Override
			public Adapter caseXNumberLiteral(XNumberLiteral object)
			{
				return createXNumberLiteralAdapter();
			}
			@Override
			public Adapter caseXStringLiteral(XStringLiteral object)
			{
				return createXStringLiteralAdapter();
			}
			@Override
			public Adapter caseXCollectionLiteral(XCollectionLiteral object)
			{
				return createXCollectionLiteralAdapter();
			}
			@Override
			public Adapter caseXListLiteral(XListLiteral object)
			{
				return createXListLiteralAdapter();
			}
			@Override
			public Adapter caseXSetLiteral(XSetLiteral object)
			{
				return createXSetLiteralAdapter();
			}
			@Override
			public Adapter caseXClosure(XClosure object)
			{
				return createXClosureAdapter();
			}
			@Override
			public Adapter caseXCastedExpression(XCastedExpression object)
			{
				return createXCastedExpressionAdapter();
			}
			@Override
			public Adapter caseXBinaryOperation(XBinaryOperation object)
			{
				return createXBinaryOperationAdapter();
			}
			@Override
			public Adapter caseXUnaryOperation(XUnaryOperation object)
			{
				return createXUnaryOperationAdapter();
			}
			@Override
			public Adapter caseXPostfixOperation(XPostfixOperation object)
			{
				return createXPostfixOperationAdapter();
			}
			@Override
			public Adapter caseXForLoopExpression(XForLoopExpression object)
			{
				return createXForLoopExpressionAdapter();
			}
			@Override
			public Adapter caseXBasicForLoopExpression(XBasicForLoopExpression object)
			{
				return createXBasicForLoopExpressionAdapter();
			}
			@Override
			public Adapter caseXAbstractWhileExpression(XAbstractWhileExpression object)
			{
				return createXAbstractWhileExpressionAdapter();
			}
			@Override
			public Adapter caseXDoWhileExpression(XDoWhileExpression object)
			{
				return createXDoWhileExpressionAdapter();
			}
			@Override
			public Adapter caseXWhileExpression(XWhileExpression object)
			{
				return createXWhileExpressionAdapter();
			}
			@Override
			public Adapter caseXTypeLiteral(XTypeLiteral object)
			{
				return createXTypeLiteralAdapter();
			}
			@Override
			public Adapter caseXInstanceOfExpression(XInstanceOfExpression object)
			{
				return createXInstanceOfExpressionAdapter();
			}
			@Override
			public Adapter caseXThrowExpression(XThrowExpression object)
			{
				return createXThrowExpressionAdapter();
			}
			@Override
			public Adapter caseXTryCatchFinallyExpression(XTryCatchFinallyExpression object)
			{
				return createXTryCatchFinallyExpressionAdapter();
			}
			@Override
			public Adapter caseXCatchClause(XCatchClause object)
			{
				return createXCatchClauseAdapter();
			}
			@Override
			public Adapter caseXAssignment(XAssignment object)
			{
				return createXAssignmentAdapter();
			}
			@Override
			public Adapter caseXReturnExpression(XReturnExpression object)
			{
				return createXReturnExpressionAdapter();
			}
			@Override
			public Adapter caseXSynchronizedExpression(XSynchronizedExpression object)
			{
				return createXSynchronizedExpressionAdapter();
			}
			@Override
			public Adapter caseJvmIdentifiableElement(JvmIdentifiableElement object)
			{
				return createJvmIdentifiableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XExpression <em>XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XExpression
	 * @generated
	 */
	public Adapter createXExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XIfExpression <em>XIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XIfExpression
	 * @generated
	 */
	public Adapter createXIfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XSwitchExpression <em>XSwitch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XSwitchExpression
	 * @generated
	 */
	public Adapter createXSwitchExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XCasePart <em>XCase Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XCasePart
	 * @generated
	 */
	public Adapter createXCasePartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XBlockExpression <em>XBlock Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XBlockExpression
	 * @generated
	 */
	public Adapter createXBlockExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XVariableDeclaration <em>XVariable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XVariableDeclaration
	 * @generated
	 */
	public Adapter createXVariableDeclarationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XAbstractFeatureCall <em>XAbstract Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XAbstractFeatureCall
	 * @generated
	 */
	public Adapter createXAbstractFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XMemberFeatureCall <em>XMember Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XMemberFeatureCall
	 * @generated
	 */
	public Adapter createXMemberFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XFeatureCall <em>XFeature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XFeatureCall
	 * @generated
	 */
	public Adapter createXFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XConstructorCall <em>XConstructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XConstructorCall
	 * @generated
	 */
	public Adapter createXConstructorCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XBooleanLiteral <em>XBoolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XBooleanLiteral
	 * @generated
	 */
	public Adapter createXBooleanLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XNullLiteral <em>XNull Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XNullLiteral
	 * @generated
	 */
	public Adapter createXNullLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XNumberLiteral <em>XNumber Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XNumberLiteral
	 * @generated
	 */
	public Adapter createXNumberLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XStringLiteral <em>XString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XStringLiteral
	 * @generated
	 */
	public Adapter createXStringLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XCollectionLiteral <em>XCollection Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XCollectionLiteral
	 * @generated
	 */
	public Adapter createXCollectionLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XListLiteral <em>XList Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XListLiteral
	 * @generated
	 */
	public Adapter createXListLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XSetLiteral <em>XSet Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XSetLiteral
	 * @generated
	 */
	public Adapter createXSetLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XClosure <em>XClosure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XClosure
	 * @generated
	 */
	public Adapter createXClosureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XCastedExpression <em>XCasted Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XCastedExpression
	 * @generated
	 */
	public Adapter createXCastedExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XBinaryOperation <em>XBinary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XBinaryOperation
	 * @generated
	 */
	public Adapter createXBinaryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XUnaryOperation <em>XUnary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XUnaryOperation
	 * @generated
	 */
	public Adapter createXUnaryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XPostfixOperation <em>XPostfix Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XPostfixOperation
	 * @generated
	 */
	public Adapter createXPostfixOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XForLoopExpression <em>XFor Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XForLoopExpression
	 * @generated
	 */
	public Adapter createXForLoopExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XBasicForLoopExpression <em>XBasic For Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XBasicForLoopExpression
	 * @generated
	 */
	public Adapter createXBasicForLoopExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XAbstractWhileExpression <em>XAbstract While Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XAbstractWhileExpression
	 * @generated
	 */
	public Adapter createXAbstractWhileExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XDoWhileExpression <em>XDo While Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XDoWhileExpression
	 * @generated
	 */
	public Adapter createXDoWhileExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XWhileExpression <em>XWhile Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XWhileExpression
	 * @generated
	 */
	public Adapter createXWhileExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XTypeLiteral <em>XType Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XTypeLiteral
	 * @generated
	 */
	public Adapter createXTypeLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XInstanceOfExpression <em>XInstance Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XInstanceOfExpression
	 * @generated
	 */
	public Adapter createXInstanceOfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XThrowExpression <em>XThrow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XThrowExpression
	 * @generated
	 */
	public Adapter createXThrowExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XTryCatchFinallyExpression <em>XTry Catch Finally Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XTryCatchFinallyExpression
	 * @generated
	 */
	public Adapter createXTryCatchFinallyExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XCatchClause <em>XCatch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XCatchClause
	 * @generated
	 */
	public Adapter createXCatchClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XAssignment <em>XAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XAssignment
	 * @generated
	 */
	public Adapter createXAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XReturnExpression <em>XReturn Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XReturnExpression
	 * @generated
	 */
	public Adapter createXReturnExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.mbase.XSynchronizedExpression <em>XSynchronized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.mbase.XSynchronizedExpression
	 * @generated
	 */
	public Adapter createXSynchronizedExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.common.types.JvmIdentifiableElement <em>Jvm Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.common.types.JvmIdentifiableElement
	 * @generated
	 */
	public Adapter createJvmIdentifiableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //MbaseAdapterFactory
