/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.util;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.mbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.mbase.scoping.featurecalls.OperatorMapping;
import org.eclipse.xtext.mbase.typesystem.computation.SynonymTypesProvider;
import org.eclipse.xtext.mbase.typesystem.conformance.IRawTypeHelper;
import org.eclipse.xtext.mbase.typesystem.conformance.TypeConformanceComputer;
import org.eclipse.xtext.mbase.typesystem.references.ArrayTypes;
import org.eclipse.xtext.mbase.typesystem.references.FunctionTypes;
import org.eclipse.xtext.mbase.typesystem.util.BoundTypeArgumentMerger;
import org.eclipse.xtext.mbase.typesystem.util.ExtendedEarlyExitComputer;
import org.eclipse.xtext.mbase.typesystem.util.HumanReadableTypeNames;
import org.eclipse.xtext.mbase.util.XExpressionHelper;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtype.XtypeFactory;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * TODO JavaDoc
 */
@Singleton
@Accessors
@SuppressWarnings("all")
public class CommonTypeComputationServices {
  @Inject
  private OperatorMapping operatorMapping;
  
  @Inject
  private XExpressionHelper expressionHelper;
  
  @Inject
  private TypeReferences typeReferences;
  
  @Inject
  private TypeConformanceComputer typeConformanceComputer;
  
  @Inject
  private IRawTypeHelper rawTypeHelper;
  
  @Inject
  private Primitives primitives;
  
  @Inject
  private FunctionTypes functionTypes;
  
  @Inject
  private ArrayTypes arrayTypes;
  
  @Inject
  private BoundTypeArgumentMerger boundTypeArgumentMerger;
  
  @Inject
  private SynonymTypesProvider synonymTypesProvider;
  
  @Inject
  private IJvmModelAssociations jvmModelAssociations;
  
  @Inject
  private ExtendedEarlyExitComputer earlyExitComputer;
  
  @Inject
  private HumanReadableTypeNames humanReadableTypeNames;
  
  @Inject(optional = true)
  private XtypeFactory xtypeFactory = XtypeFactory.eINSTANCE;
  
  @Inject(optional = true)
  private TypesFactory typesFactory = TypesFactory.eINSTANCE;
  
  @Pure
  public OperatorMapping getOperatorMapping() {
    return this.operatorMapping;
  }
  
  public void setOperatorMapping(final OperatorMapping operatorMapping) {
    this.operatorMapping = operatorMapping;
  }
  
  @Pure
  public XExpressionHelper getExpressionHelper() {
    return this.expressionHelper;
  }
  
  public void setExpressionHelper(final XExpressionHelper expressionHelper) {
    this.expressionHelper = expressionHelper;
  }
  
  @Pure
  public TypeReferences getTypeReferences() {
    return this.typeReferences;
  }
  
  public void setTypeReferences(final TypeReferences typeReferences) {
    this.typeReferences = typeReferences;
  }
  
  @Pure
  public TypeConformanceComputer getTypeConformanceComputer() {
    return this.typeConformanceComputer;
  }
  
  public void setTypeConformanceComputer(final TypeConformanceComputer typeConformanceComputer) {
    this.typeConformanceComputer = typeConformanceComputer;
  }
  
  @Pure
  public IRawTypeHelper getRawTypeHelper() {
    return this.rawTypeHelper;
  }
  
  public void setRawTypeHelper(final IRawTypeHelper rawTypeHelper) {
    this.rawTypeHelper = rawTypeHelper;
  }
  
  @Pure
  public Primitives getPrimitives() {
    return this.primitives;
  }
  
  public void setPrimitives(final Primitives primitives) {
    this.primitives = primitives;
  }
  
  @Pure
  public FunctionTypes getFunctionTypes() {
    return this.functionTypes;
  }
  
  public void setFunctionTypes(final FunctionTypes functionTypes) {
    this.functionTypes = functionTypes;
  }
  
  @Pure
  public ArrayTypes getArrayTypes() {
    return this.arrayTypes;
  }
  
  public void setArrayTypes(final ArrayTypes arrayTypes) {
    this.arrayTypes = arrayTypes;
  }
  
  @Pure
  public BoundTypeArgumentMerger getBoundTypeArgumentMerger() {
    return this.boundTypeArgumentMerger;
  }
  
  public void setBoundTypeArgumentMerger(final BoundTypeArgumentMerger boundTypeArgumentMerger) {
    this.boundTypeArgumentMerger = boundTypeArgumentMerger;
  }
  
  @Pure
  public SynonymTypesProvider getSynonymTypesProvider() {
    return this.synonymTypesProvider;
  }
  
  public void setSynonymTypesProvider(final SynonymTypesProvider synonymTypesProvider) {
    this.synonymTypesProvider = synonymTypesProvider;
  }
  
  @Pure
  public IJvmModelAssociations getJvmModelAssociations() {
    return this.jvmModelAssociations;
  }
  
  public void setJvmModelAssociations(final IJvmModelAssociations jvmModelAssociations) {
    this.jvmModelAssociations = jvmModelAssociations;
  }
  
  @Pure
  public ExtendedEarlyExitComputer getEarlyExitComputer() {
    return this.earlyExitComputer;
  }
  
  public void setEarlyExitComputer(final ExtendedEarlyExitComputer earlyExitComputer) {
    this.earlyExitComputer = earlyExitComputer;
  }
  
  @Pure
  public HumanReadableTypeNames getHumanReadableTypeNames() {
    return this.humanReadableTypeNames;
  }
  
  public void setHumanReadableTypeNames(final HumanReadableTypeNames humanReadableTypeNames) {
    this.humanReadableTypeNames = humanReadableTypeNames;
  }
  
  @Pure
  public XtypeFactory getXtypeFactory() {
    return this.xtypeFactory;
  }
  
  public void setXtypeFactory(final XtypeFactory xtypeFactory) {
    this.xtypeFactory = xtypeFactory;
  }
  
  @Pure
  public TypesFactory getTypesFactory() {
    return this.typesFactory;
  }
  
  public void setTypesFactory(final TypesFactory typesFactory) {
    this.typesFactory = typesFactory;
  }
}
