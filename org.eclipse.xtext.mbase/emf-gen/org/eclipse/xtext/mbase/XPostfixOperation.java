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
 * A representation of the model object '<em><b>XPostfix Operation</b></em>'.
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
 *   <li>{@link org.eclipse.xtext.mbase.XPostfixOperation#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.mbase.mbasePackage#getXPostfixOperation()
 * @model
 * @generated
 */
public interface XPostfixOperation extends XAbstractFeatureCall
{
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(XExpression)
	 * @see org.eclipse.xtext.mbase.mbasePackage#getXPostfixOperation_Operand()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.mbase.XPostfixOperation#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(XExpression value);

} // XPostfixOperation
