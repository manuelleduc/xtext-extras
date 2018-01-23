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

import org.eclipse.xtext.mbase.XBasicForLoopExpression;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.mbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XBasic For Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XBasicForLoopExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XBasicForLoopExpressionImpl#getEachExpression <em>Each Expression</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XBasicForLoopExpressionImpl#getInitExpressions <em>Init Expressions</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XBasicForLoopExpressionImpl#getUpdateExpressions <em>Update Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XBasicForLoopExpressionImpl extends XExpressionImpl implements XBasicForLoopExpression
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
	 * The cached value of the '{@link #getEachExpression() <em>Each Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEachExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression eachExpression;

	/**
	 * The cached value of the '{@link #getInitExpressions() <em>Init Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<XExpression> initExpressions;

	/**
	 * The cached value of the '{@link #getUpdateExpressions() <em>Update Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<XExpression> updateExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBasicForLoopExpressionImpl()
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
		return mbasePackage.Literals.XBASIC_FOR_LOOP_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getEachExpression()
	{
		return eachExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEachExpression(XExpression newEachExpression, NotificationChain msgs)
	{
		XExpression oldEachExpression = eachExpression;
		eachExpression = newEachExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, oldEachExpression, newEachExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEachExpression(XExpression newEachExpression)
	{
		if (newEachExpression != eachExpression)
		{
			NotificationChain msgs = null;
			if (eachExpression != null)
				msgs = ((InternalEObject)eachExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, null, msgs);
			if (newEachExpression != null)
				msgs = ((InternalEObject)newEachExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, null, msgs);
			msgs = basicSetEachExpression(newEachExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, newEachExpression, newEachExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XExpression> getInitExpressions()
	{
		if (initExpressions == null)
		{
			initExpressions = new EObjectContainmentEList<XExpression>(XExpression.class, this, mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS);
		}
		return initExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XExpression> getUpdateExpressions()
	{
		if (updateExpressions == null)
		{
			updateExpressions = new EObjectContainmentEList<XExpression>(XExpression.class, this, mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS);
		}
		return updateExpressions;
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
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				return basicSetEachExpression(null, msgs);
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS:
				return ((InternalEList<?>)getInitExpressions()).basicRemove(otherEnd, msgs);
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS:
				return ((InternalEList<?>)getUpdateExpressions()).basicRemove(otherEnd, msgs);
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
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION:
				return getExpression();
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				return getEachExpression();
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS:
				return getInitExpressions();
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS:
				return getUpdateExpressions();
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
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION:
				setExpression((XExpression)newValue);
				return;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				setEachExpression((XExpression)newValue);
				return;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS:
				getInitExpressions().clear();
				getInitExpressions().addAll((Collection<? extends XExpression>)newValue);
				return;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS:
				getUpdateExpressions().clear();
				getUpdateExpressions().addAll((Collection<? extends XExpression>)newValue);
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
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION:
				setExpression((XExpression)null);
				return;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				setEachExpression((XExpression)null);
				return;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS:
				getInitExpressions().clear();
				return;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS:
				getUpdateExpressions().clear();
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
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION:
				return expression != null;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				return eachExpression != null;
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS:
				return initExpressions != null && !initExpressions.isEmpty();
			case mbasePackage.XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS:
				return updateExpressions != null && !updateExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XBasicForLoopExpressionImpl
