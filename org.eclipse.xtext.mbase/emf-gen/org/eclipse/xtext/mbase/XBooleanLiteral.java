/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBoolean Literal</b></em>'.
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
 *   <li>{@link org.eclipse.xtext.mbase.XBooleanLiteral#isIsTrue <em>Is True</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.mbase.MbasePackage#getXBooleanLiteral()
 * @model
 * @generated
 */
public interface XBooleanLiteral extends XExpression
{
	/**
	 * Returns the value of the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is True</em>' attribute.
	 * @see #setIsTrue(boolean)
	 * @see org.eclipse.xtext.mbase.MbasePackage#getXBooleanLiteral_IsTrue()
	 * @model
	 * @generated
	 */
	boolean isIsTrue();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.mbase.XBooleanLiteral#isIsTrue <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is True</em>' attribute.
	 * @see #isIsTrue()
	 * @generated
	 */
	void setIsTrue(boolean value);

} // XBooleanLiteral
