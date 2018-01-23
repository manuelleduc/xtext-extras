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

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.mbase.MbasePackage;
import org.eclipse.xtext.mbase.XClosure;
import org.eclipse.xtext.mbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XClosure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XClosureImpl#getDeclaredFormalParameters <em>Declared Formal Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XClosureImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XClosureImpl#isExplicitSyntax <em>Explicit Syntax</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XClosureImpl#getImplicitFormalParameters <em>Implicit Formal Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XClosureImpl extends XExpressionImpl implements XClosure
{
	/**
	 * The cached value of the '{@link #getDeclaredFormalParameters() <em>Declared Formal Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmFormalParameter> declaredFormalParameters;

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
	 * The default value of the '{@link #isExplicitSyntax() <em>Explicit Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitSyntax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_SYNTAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitSyntax() <em>Explicit Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitSyntax()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitSyntax = EXPLICIT_SYNTAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplicitFormalParameters() <em>Implicit Formal Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmFormalParameter> implicitFormalParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XClosureImpl()
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
		return MbasePackage.Literals.XCLOSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmFormalParameter> getDeclaredFormalParameters()
	{
		if (declaredFormalParameters == null)
		{
			declaredFormalParameters = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, MbasePackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS);
		}
		return declaredFormalParameters;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MbasePackage.XCLOSURE__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MbasePackage.XCLOSURE__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MbasePackage.XCLOSURE__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XCLOSURE__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicitSyntax()
	{
		return explicitSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitSyntax(boolean newExplicitSyntax)
	{
		boolean oldExplicitSyntax = explicitSyntax;
		explicitSyntax = newExplicitSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XCLOSURE__EXPLICIT_SYNTAX, oldExplicitSyntax, explicitSyntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmFormalParameter> getImplicitFormalParameters()
	{
		if (implicitFormalParameters == null)
		{
			implicitFormalParameters = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, MbasePackage.XCLOSURE__IMPLICIT_FORMAL_PARAMETERS);
		}
		return implicitFormalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmFormalParameter> getFormalParameters()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case MbasePackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
				return ((InternalEList<?>)getDeclaredFormalParameters()).basicRemove(otherEnd, msgs);
			case MbasePackage.XCLOSURE__EXPRESSION:
				return basicSetExpression(null, msgs);
			case MbasePackage.XCLOSURE__IMPLICIT_FORMAL_PARAMETERS:
				return ((InternalEList<?>)getImplicitFormalParameters()).basicRemove(otherEnd, msgs);
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
			case MbasePackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
				return getDeclaredFormalParameters();
			case MbasePackage.XCLOSURE__EXPRESSION:
				return getExpression();
			case MbasePackage.XCLOSURE__EXPLICIT_SYNTAX:
				return isExplicitSyntax();
			case MbasePackage.XCLOSURE__IMPLICIT_FORMAL_PARAMETERS:
				return getImplicitFormalParameters();
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
			case MbasePackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
				getDeclaredFormalParameters().clear();
				getDeclaredFormalParameters().addAll((Collection<? extends JvmFormalParameter>)newValue);
				return;
			case MbasePackage.XCLOSURE__EXPRESSION:
				setExpression((XExpression)newValue);
				return;
			case MbasePackage.XCLOSURE__EXPLICIT_SYNTAX:
				setExplicitSyntax((Boolean)newValue);
				return;
			case MbasePackage.XCLOSURE__IMPLICIT_FORMAL_PARAMETERS:
				getImplicitFormalParameters().clear();
				getImplicitFormalParameters().addAll((Collection<? extends JvmFormalParameter>)newValue);
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
			case MbasePackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
				getDeclaredFormalParameters().clear();
				return;
			case MbasePackage.XCLOSURE__EXPRESSION:
				setExpression((XExpression)null);
				return;
			case MbasePackage.XCLOSURE__EXPLICIT_SYNTAX:
				setExplicitSyntax(EXPLICIT_SYNTAX_EDEFAULT);
				return;
			case MbasePackage.XCLOSURE__IMPLICIT_FORMAL_PARAMETERS:
				getImplicitFormalParameters().clear();
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
			case MbasePackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
				return declaredFormalParameters != null && !declaredFormalParameters.isEmpty();
			case MbasePackage.XCLOSURE__EXPRESSION:
				return expression != null;
			case MbasePackage.XCLOSURE__EXPLICIT_SYNTAX:
				return explicitSyntax != EXPLICIT_SYNTAX_EDEFAULT;
			case MbasePackage.XCLOSURE__IMPLICIT_FORMAL_PARAMETERS:
				return implicitFormalParameters != null && !implicitFormalParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (explicitSyntax: ");
		result.append(explicitSyntax);
		result.append(')');
		return result.toString();
	}

} //XClosureImpl
