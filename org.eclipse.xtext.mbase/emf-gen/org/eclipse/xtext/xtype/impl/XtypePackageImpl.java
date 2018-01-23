/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtype.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.mbase.MbasePackage;

import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotationsPackage;

import org.eclipse.xtext.mbase.annotations.xAnnotations.impl.XAnnotationsPackageImpl;

import org.eclipse.xtext.mbase.impl.MbasePackageImpl;

import org.eclipse.xtext.mbase.typing.IJvmTypeReferenceProvider;

import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XtypeFactory;
import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtypePackageImpl extends EPackageImpl implements XtypePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xFunctionTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xComputedTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iJvmTypeReferenceProviderEDataType = null;

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
	 * @see org.eclipse.xtext.xtype.XtypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XtypePackageImpl()
	{
		super(eNS_URI, XtypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XtypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XtypePackage init()
	{
		if (isInited) return (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);

		// Obtain or create and register package
		XtypePackageImpl theXtypePackage = (XtypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XtypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XtypePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XAnnotationsPackageImpl theXAnnotationsPackage = (XAnnotationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI) instanceof XAnnotationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI) : XAnnotationsPackage.eINSTANCE);
		MbasePackageImpl theMbasePackage = (MbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MbasePackage.eNS_URI) instanceof MbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MbasePackage.eNS_URI) : MbasePackage.eINSTANCE);

		// Create package meta-data objects
		theXtypePackage.createPackageContents();
		theXAnnotationsPackage.createPackageContents();
		theMbasePackage.createPackageContents();

		// Initialize created meta-data
		theXtypePackage.initializePackageContents();
		theXAnnotationsPackage.initializePackageContents();
		theMbasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXtypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XtypePackage.eNS_URI, theXtypePackage);
		return theXtypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXFunctionTypeRef()
	{
		return xFunctionTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXFunctionTypeRef_ParamTypes()
	{
		return (EReference)xFunctionTypeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXFunctionTypeRef_ReturnType()
	{
		return (EReference)xFunctionTypeRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXFunctionTypeRef_Type()
	{
		return (EReference)xFunctionTypeRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFunctionTypeRef_InstanceContext()
	{
		return (EAttribute)xFunctionTypeRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXComputedTypeReference()
	{
		return xComputedTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXComputedTypeReference_TypeProvider()
	{
		return (EAttribute)xComputedTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIJvmTypeReferenceProvider()
	{
		return iJvmTypeReferenceProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtypeFactory getXtypeFactory()
	{
		return (XtypeFactory)getEFactoryInstance();
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
		xFunctionTypeRefEClass = createEClass(XFUNCTION_TYPE_REF);
		createEReference(xFunctionTypeRefEClass, XFUNCTION_TYPE_REF__PARAM_TYPES);
		createEReference(xFunctionTypeRefEClass, XFUNCTION_TYPE_REF__RETURN_TYPE);
		createEReference(xFunctionTypeRefEClass, XFUNCTION_TYPE_REF__TYPE);
		createEAttribute(xFunctionTypeRefEClass, XFUNCTION_TYPE_REF__INSTANCE_CONTEXT);

		xComputedTypeReferenceEClass = createEClass(XCOMPUTED_TYPE_REFERENCE);
		createEAttribute(xComputedTypeReferenceEClass, XCOMPUTED_TYPE_REFERENCE__TYPE_PROVIDER);

		// Create data types
		iJvmTypeReferenceProviderEDataType = createEDataType(IJVM_TYPE_REFERENCE_PROVIDER);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xFunctionTypeRefEClass.getESuperTypes().add(theTypesPackage.getJvmSpecializedTypeReference());
		xComputedTypeReferenceEClass.getESuperTypes().add(theTypesPackage.getJvmSpecializedTypeReference());

		// Initialize classes and features; add operations and parameters
		initEClass(xFunctionTypeRefEClass, XFunctionTypeRef.class, "XFunctionTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXFunctionTypeRef_ParamTypes(), theTypesPackage.getJvmTypeReference(), null, "paramTypes", null, 0, -1, XFunctionTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXFunctionTypeRef_ReturnType(), theTypesPackage.getJvmTypeReference(), null, "returnType", null, 0, 1, XFunctionTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXFunctionTypeRef_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, XFunctionTypeRef.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getXFunctionTypeRef_InstanceContext(), ecorePackage.getEBoolean(), "instanceContext", null, 0, 1, XFunctionTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xComputedTypeReferenceEClass, XComputedTypeReference.class, "XComputedTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXComputedTypeReference_TypeProvider(), this.getIJvmTypeReferenceProvider(), "typeProvider", null, 0, 1, XComputedTypeReference.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iJvmTypeReferenceProviderEDataType, IJvmTypeReferenceProvider.class, "IJvmTypeReferenceProvider", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XtypePackageImpl