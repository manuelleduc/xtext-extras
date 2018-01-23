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

import org.eclipse.xtext.mbase.MbasePackage;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XMemberFeatureCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMember Feature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#getMemberCallTarget <em>Member Call Target</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#isExplicitStatic <em>Explicit Static</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#isNullSafe <em>Null Safe</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#isTypeLiteral <em>Type Literal</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#isStaticWithDeclaringType <em>Static With Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.impl.XMemberFeatureCallImpl#isPackageFragment <em>Package Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMemberFeatureCallImpl extends XAbstractFeatureCallImplCustom implements XMemberFeatureCall
{
	/**
	 * The cached value of the '{@link #getMemberCallTarget() <em>Member Call Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCallTarget()
	 * @generated
	 * @ordered
	 */
	protected XExpression memberCallTarget;

	/**
	 * The cached value of the '{@link #getMemberCallArguments() <em>Member Call Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCallArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<XExpression> memberCallArguments;

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
	 * The default value of the '{@link #isExplicitStatic() <em>Explicit Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitStatic() <em>Explicit Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitStatic = EXPLICIT_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isNullSafe() <em>Null Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullSafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_SAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullSafe() <em>Null Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullSafe()
	 * @generated
	 * @ordered
	 */
	protected boolean nullSafe = NULL_SAFE_EDEFAULT;

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
	 * The default value of the '{@link #isStaticWithDeclaringType() <em>Static With Declaring Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticWithDeclaringType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_WITH_DECLARING_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStaticWithDeclaringType() <em>Static With Declaring Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticWithDeclaringType()
	 * @generated
	 * @ordered
	 */
	protected boolean staticWithDeclaringType = STATIC_WITH_DECLARING_TYPE_EDEFAULT;

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
	protected XMemberFeatureCallImpl()
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
		return MbasePackage.Literals.XMEMBER_FEATURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getMemberCallTarget()
	{
		return memberCallTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberCallTarget(XExpression newMemberCallTarget, NotificationChain msgs)
	{
		XExpression oldMemberCallTarget = memberCallTarget;
		memberCallTarget = newMemberCallTarget;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, oldMemberCallTarget, newMemberCallTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberCallTarget(XExpression newMemberCallTarget)
	{
		if (newMemberCallTarget != memberCallTarget)
		{
			NotificationChain msgs = null;
			if (memberCallTarget != null)
				msgs = ((InternalEObject)memberCallTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, null, msgs);
			if (newMemberCallTarget != null)
				msgs = ((InternalEObject)newMemberCallTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, null, msgs);
			msgs = basicSetMemberCallTarget(newMemberCallTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, newMemberCallTarget, newMemberCallTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XExpression> getMemberCallArguments()
	{
		if (memberCallArguments == null)
		{
			memberCallArguments = new EObjectContainmentEList<XExpression>(XExpression.class, this, MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS);
		}
		return memberCallArguments;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL, oldExplicitOperationCall, explicitOperationCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicitStatic()
	{
		return explicitStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitStatic(boolean newExplicitStatic)
	{
		boolean oldExplicitStatic = explicitStatic;
		explicitStatic = newExplicitStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC, oldExplicitStatic, explicitStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullSafe()
	{
		return nullSafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullSafe(boolean newNullSafe)
	{
		boolean oldNullSafe = nullSafe;
		nullSafe = newNullSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__NULL_SAFE, oldNullSafe, nullSafe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__TYPE_LITERAL, oldTypeLiteral, typeLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStaticWithDeclaringType()
	{
		return staticWithDeclaringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticWithDeclaringType(boolean newStaticWithDeclaringType)
	{
		boolean oldStaticWithDeclaringType = staticWithDeclaringType;
		staticWithDeclaringType = newStaticWithDeclaringType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__STATIC_WITH_DECLARING_TYPE, oldStaticWithDeclaringType, staticWithDeclaringType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MbasePackage.XMEMBER_FEATURE_CALL__PACKAGE_FRAGMENT, oldPackageFragment, packageFragment));
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
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				return basicSetMemberCallTarget(null, msgs);
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				return ((InternalEList<?>)getMemberCallArguments()).basicRemove(otherEnd, msgs);
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
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				return getMemberCallTarget();
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				return getMemberCallArguments();
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
				return isExplicitOperationCall();
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
				return isExplicitStatic();
			case MbasePackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
				return isNullSafe();
			case MbasePackage.XMEMBER_FEATURE_CALL__TYPE_LITERAL:
				return isTypeLiteral();
			case MbasePackage.XMEMBER_FEATURE_CALL__STATIC_WITH_DECLARING_TYPE:
				return isStaticWithDeclaringType();
			case MbasePackage.XMEMBER_FEATURE_CALL__PACKAGE_FRAGMENT:
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
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				setMemberCallTarget((XExpression)newValue);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
				getMemberCallArguments().addAll((Collection<? extends XExpression>)newValue);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall((Boolean)newValue);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
				setExplicitStatic((Boolean)newValue);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
				setNullSafe((Boolean)newValue);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__TYPE_LITERAL:
				setTypeLiteral((Boolean)newValue);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__STATIC_WITH_DECLARING_TYPE:
				setStaticWithDeclaringType((Boolean)newValue);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__PACKAGE_FRAGMENT:
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
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				setMemberCallTarget((XExpression)null);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall(EXPLICIT_OPERATION_CALL_EDEFAULT);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
				setExplicitStatic(EXPLICIT_STATIC_EDEFAULT);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
				setNullSafe(NULL_SAFE_EDEFAULT);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__TYPE_LITERAL:
				setTypeLiteral(TYPE_LITERAL_EDEFAULT);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__STATIC_WITH_DECLARING_TYPE:
				setStaticWithDeclaringType(STATIC_WITH_DECLARING_TYPE_EDEFAULT);
				return;
			case MbasePackage.XMEMBER_FEATURE_CALL__PACKAGE_FRAGMENT:
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
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				return memberCallTarget != null;
			case MbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				return memberCallArguments != null && !memberCallArguments.isEmpty();
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
				return explicitOperationCall != EXPLICIT_OPERATION_CALL_EDEFAULT;
			case MbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
				return explicitStatic != EXPLICIT_STATIC_EDEFAULT;
			case MbasePackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
				return nullSafe != NULL_SAFE_EDEFAULT;
			case MbasePackage.XMEMBER_FEATURE_CALL__TYPE_LITERAL:
				return typeLiteral != TYPE_LITERAL_EDEFAULT;
			case MbasePackage.XMEMBER_FEATURE_CALL__STATIC_WITH_DECLARING_TYPE:
				return staticWithDeclaringType != STATIC_WITH_DECLARING_TYPE_EDEFAULT;
			case MbasePackage.XMEMBER_FEATURE_CALL__PACKAGE_FRAGMENT:
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
		result.append(", explicitStatic: ");
		result.append(explicitStatic);
		result.append(", nullSafe: ");
		result.append(nullSafe);
		result.append(", typeLiteral: ");
		result.append(typeLiteral);
		result.append(", staticWithDeclaringType: ");
		result.append(staticWithDeclaringType);
		result.append(", packageFragment: ");
		result.append(packageFragment);
		result.append(')');
		return result.toString();
	}

} //XMemberFeatureCallImpl
