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

import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XFeatureCall;
import org.eclipse.xtext.mbase.mbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XFeature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XFeatureCallImpl#getFeatureCallArguments <em>Feature Call Arguments</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XFeatureCallImpl#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XFeatureCallImpl#isTypeLiteral <em>Type Literal</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XFeatureCallImpl#isPackageFragment <em>Package Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XFeatureCallImpl extends XAbstractFeatureCallImplCustom implements XFeatureCall
{
	/**
	 * The cached value of the '{@link #getFeatureCallArguments() <em>Feature Call Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCallArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<XExpression> featureCallArguments;

	/**
	 * The default value of the '{@link #isExplicitOperationCall() <em>Explicit Operation Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOperationCall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_OPERATION_CALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitOperationCall() <em>Explicit Operation Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOperationCall()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitOperationCall = EXPLICIT_OPERATION_CALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isTypeLiteral() <em>Type Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_LITERAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTypeLiteral() <em>Type Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeLiteral()
	 * @generated
	 * @ordered
	 */
	protected boolean typeLiteral = TYPE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPackageFragment() <em>Package Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackageFragment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PACKAGE_FRAGMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPackageFragment() <em>Package Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackageFragment()
	 * @generated
	 * @ordered
	 */
	protected boolean packageFragment = PACKAGE_FRAGMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XFeatureCallImpl()
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
		return mbasePackage.Literals.XFEATURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XExpression> getFeatureCallArguments()
	{
		if (featureCallArguments == null)
		{
			featureCallArguments = new EObjectContainmentEList<XExpression>(XExpression.class, this, mbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS);
		}
		return featureCallArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicitOperationCall()
	{
		return explicitOperationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitOperationCall(boolean newExplicitOperationCall)
	{
		boolean oldExplicitOperationCall = explicitOperationCall;
		explicitOperationCall = newExplicitOperationCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mbasePackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL, oldExplicitOperationCall, explicitOperationCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeLiteral()
	{
		return typeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLiteral(boolean newTypeLiteral)
	{
		boolean oldTypeLiteral = typeLiteral;
		typeLiteral = newTypeLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mbasePackage.XFEATURE_CALL__TYPE_LITERAL, oldTypeLiteral, typeLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPackageFragment()
	{
		return packageFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageFragment(boolean newPackageFragment)
	{
		boolean oldPackageFragment = packageFragment;
		packageFragment = newPackageFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mbasePackage.XFEATURE_CALL__PACKAGE_FRAGMENT, oldPackageFragment, packageFragment));
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
			case mbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
				return ((InternalEList<?>)getFeatureCallArguments()).basicRemove(otherEnd, msgs);
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
			case mbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
				return getFeatureCallArguments();
			case mbasePackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
				return isExplicitOperationCall();
			case mbasePackage.XFEATURE_CALL__TYPE_LITERAL:
				return isTypeLiteral();
			case mbasePackage.XFEATURE_CALL__PACKAGE_FRAGMENT:
				return isPackageFragment();
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
			case mbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
				getFeatureCallArguments().clear();
				getFeatureCallArguments().addAll((Collection<? extends XExpression>)newValue);
				return;
			case mbasePackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall((Boolean)newValue);
				return;
			case mbasePackage.XFEATURE_CALL__TYPE_LITERAL:
				setTypeLiteral((Boolean)newValue);
				return;
			case mbasePackage.XFEATURE_CALL__PACKAGE_FRAGMENT:
				setPackageFragment((Boolean)newValue);
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
			case mbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
				getFeatureCallArguments().clear();
				return;
			case mbasePackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall(EXPLICIT_OPERATION_CALL_EDEFAULT);
				return;
			case mbasePackage.XFEATURE_CALL__TYPE_LITERAL:
				setTypeLiteral(TYPE_LITERAL_EDEFAULT);
				return;
			case mbasePackage.XFEATURE_CALL__PACKAGE_FRAGMENT:
				setPackageFragment(PACKAGE_FRAGMENT_EDEFAULT);
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
			case mbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
				return featureCallArguments != null && !featureCallArguments.isEmpty();
			case mbasePackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
				return explicitOperationCall != EXPLICIT_OPERATION_CALL_EDEFAULT;
			case mbasePackage.XFEATURE_CALL__TYPE_LITERAL:
				return typeLiteral != TYPE_LITERAL_EDEFAULT;
			case mbasePackage.XFEATURE_CALL__PACKAGE_FRAGMENT:
				return packageFragment != PACKAGE_FRAGMENT_EDEFAULT;
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
		result.append(" (explicitOperationCall: ");
		result.append(explicitOperationCall);
		result.append(", typeLiteral: ");
		result.append(typeLiteral);
		result.append(", packageFragment: ");
		result.append(packageFragment);
		result.append(')');
		return result.toString();
	}

} //XFeatureCallImpl
