/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.annotations.xAnnotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.mbase.MbasePackage;

import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotationElementValuePair;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotationsFactory;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotationsPackage;

import org.eclipse.xtext.mbase.impl.MbasePackageImpl;

import org.eclipse.xtext.xtype.XtypePackage;

import org.eclipse.xtext.xtype.impl.XtypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XAnnotationsPackageImpl extends EPackageImpl implements XAnnotationsPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xAnnotationElementValuePairEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XAnnotationsPackageImpl()
	{
		super(eNS_URI, XAnnotationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XAnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XAnnotationsPackage init()
	{
		if (isInited) return (XAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		XAnnotationsPackageImpl theXAnnotationsPackage = (XAnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XAnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XAnnotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XtypePackageImpl theXtypePackage = (XtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI) instanceof XtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI) : XtypePackage.eINSTANCE);
		MbasePackageImpl theMbasePackage = (MbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MbasePackage.eNS_URI) instanceof MbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MbasePackage.eNS_URI) : MbasePackage.eINSTANCE);

		// Create package meta-data objects
		theXAnnotationsPackage.createPackageContents();
		theXtypePackage.createPackageContents();
		theMbasePackage.createPackageContents();

		// Initialize created meta-data
		theXAnnotationsPackage.initializePackageContents();
		theXtypePackage.initializePackageContents();
		theMbasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXAnnotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XAnnotationsPackage.eNS_URI, theXAnnotationsPackage);
		return theXAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXAnnotation()
	{
		return xAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAnnotation_ElementValuePairs()
	{
		return (EReference)xAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAnnotation_AnnotationType()
	{
		return (EReference)xAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAnnotation_Value()
	{
		return (EReference)xAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXAnnotationElementValuePair()
	{
		return xAnnotationElementValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAnnotationElementValuePair_Value()
	{
		return (EReference)xAnnotationElementValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAnnotationElementValuePair_Element()
	{
		return (EReference)xAnnotationElementValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAnnotationsFactory getXAnnotationsFactory()
	{
		return (XAnnotationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xAnnotationEClass = createEClass(XANNOTATION);
		createEReference(xAnnotationEClass, XANNOTATION__ELEMENT_VALUE_PAIRS);
		createEReference(xAnnotationEClass, XANNOTATION__ANNOTATION_TYPE);
		createEReference(xAnnotationEClass, XANNOTATION__VALUE);

		xAnnotationElementValuePairEClass = createEClass(XANNOTATION_ELEMENT_VALUE_PAIR);
		createEReference(xAnnotationElementValuePairEClass, XANNOTATION_ELEMENT_VALUE_PAIR__VALUE);
		createEReference(xAnnotationElementValuePairEClass, XANNOTATION_ELEMENT_VALUE_PAIR__ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MbasePackage theMbasePackage = (MbasePackage)EPackage.Registry.INSTANCE.getEPackage(MbasePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xAnnotationEClass.getESuperTypes().add(theMbasePackage.getXExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(xAnnotationEClass, XAnnotation.class, "XAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXAnnotation_ElementValuePairs(), this.getXAnnotationElementValuePair(), null, "elementValuePairs", null, 0, -1, XAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXAnnotation_AnnotationType(), theTypesPackage.getJvmType(), null, "annotationType", null, 0, 1, XAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXAnnotation_Value(), theMbasePackage.getXExpression(), null, "value", null, 0, 1, XAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xAnnotationElementValuePairEClass, XAnnotationElementValuePair.class, "XAnnotationElementValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXAnnotationElementValuePair_Value(), theMbasePackage.getXExpression(), null, "value", null, 0, 1, XAnnotationElementValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXAnnotationElementValuePair_Element(), theTypesPackage.getJvmOperation(), null, "element", null, 0, 1, XAnnotationElementValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XAnnotationsPackageImpl
