/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFeature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * @since 2.7
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mbase.XFeatureCall#getFeatureCallArguments <em>Feature Call Arguments</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.XFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.XFeatureCall#isTypeLiteral <em>Type Literal</em>}</li>
 *   <li>{@link org.eclipse.xtext.mbase.XFeatureCall#isPackageFragment <em>Package Fragment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.mbase.mbasePackage#getXFeatureCall()
 * @model
 * @generated
 */
public interface XFeatureCall extends XAbstractFeatureCall
{
	/**
	 * Returns the value of the '<em><b>Feature Call Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.mbase.XExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Call Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Call Arguments</em>' containment reference list.
	 * @see org.eclipse.xtext.mbase.mbasePackage#getXFeatureCall_FeatureCallArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<XExpression> getFeatureCallArguments();

	/**
	 * Returns the value of the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Operation Call</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Operation Call</em>' attribute.
	 * @see #setExplicitOperationCall(boolean)
	 * @see org.eclipse.xtext.mbase.mbasePackage#getXFeatureCall_ExplicitOperationCall()
	 * @model
	 * @generated
	 */
	boolean isExplicitOperationCall();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.mbase.XFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Operation Call</em>' attribute.
	 * @see #isExplicitOperationCall()
	 * @generated
	 */
	void setExplicitOperationCall(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Literal</em>' attribute.
	 * @see #setTypeLiteral(boolean)
	 * @see org.eclipse.xtext.mbase.mbasePackage#getXFeatureCall_TypeLiteral()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	boolean isTypeLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.mbase.XFeatureCall#isTypeLiteral <em>Type Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Literal</em>' attribute.
	 * @see #isTypeLiteral()
	 * @generated
	 */
	void setTypeLiteral(boolean value);

	/**
	 * Returns the value of the '<em><b>Package Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment</em>' attribute.
	 * @see #setPackageFragment(boolean)
	 * @see org.eclipse.xtext.mbase.mbasePackage#getXFeatureCall_PackageFragment()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	boolean isPackageFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.mbase.XFeatureCall#isPackageFragment <em>Package Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Fragment</em>' attribute.
	 * @see #isPackageFragment()
	 * @generated
	 */
	void setPackageFragment(boolean value);

} // XFeatureCall
