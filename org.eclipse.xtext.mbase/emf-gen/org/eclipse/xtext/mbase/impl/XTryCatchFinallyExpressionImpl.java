/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.mbase.XCatchClause;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.mbase.mbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XTry Catch Finally Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XTryCatchFinallyExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XTryCatchFinallyExpressionImpl#getFinallyExpression <em>Finally Expression</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XTryCatchFinallyExpressionImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTryCatchFinallyExpressionImpl extends XExpressionImpl implements XTryCatchFinallyExpression
{
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression expression;

	/**
	 * The cached value of the '{@link #getFinallyExpression() <em>Finally Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinallyExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression finallyExpression;

	/**
	 * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<XCatchClause> catchClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XTryCatchFinallyExpressionImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return mbasePackage.Literals.XTRY_CATCH_FINALLY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getExpression()
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
	{
		XExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(XExpression newExpression)
	{
		if (newExpression != expression)
		{
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getFinallyExpression()
	{
		return finallyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinallyExpression(XExpression newFinallyExpression, NotificationChain msgs)
	{
		XExpression oldFinallyExpression = finallyExpression;
		finallyExpression = newFinallyExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, oldFinallyExpression, newFinallyExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinallyExpression(XExpression newFinallyExpression)
	{
		if (newFinallyExpression != finallyExpression)
		{
			NotificationChain msgs = null;
			if (finallyExpression != null)
				msgs = ((InternalEObject)finallyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, null, msgs);
			if (newFinallyExpression != null)
				msgs = ((InternalEObject)newFinallyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, null, msgs);
			msgs = basicSetFinallyExpression(newFinallyExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, newFinallyExpression, newFinallyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XCatchClause> getCatchClauses()
	{
		if (catchClauses == null)
		{
			catchClauses = new EObjectContainmentEList<XCatchClause>(XCatchClause.class, this, mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES);
		}
		return catchClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
				return basicSetFinallyExpression(null, msgs);
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
				return ((InternalEList<?>)getCatchClauses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
				return getExpression();
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
				return getFinallyExpression();
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
				return getCatchClauses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
				setExpression((XExpression)newValue);
				return;
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
				setFinallyExpression((XExpression)newValue);
				return;
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
				getCatchClauses().clear();
				getCatchClauses().addAll((Collection<? extends XCatchClause>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
				setExpression((XExpression)null);
				return;
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
				setFinallyExpression((XExpression)null);
				return;
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
				getCatchClauses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
				return expression != null;
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
				return finallyExpression != null;
			case mbasePackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
				return catchClauses != null && !catchClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XTryCatchFinallyExpressionImpl
