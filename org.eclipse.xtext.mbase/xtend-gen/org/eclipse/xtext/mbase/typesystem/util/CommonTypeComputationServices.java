/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.typesystem.util;

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
import org.eclipse.xtext.xtype.XtypeFactory;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * TODO JavaDoc
 */
/* @Singleton
@Accessors */@SuppressWarnings("all")
public class CommonTypeComputationServices {
  /* @Inject
   */private OperatorMapping operatorMapping;
  
  /* @Inject
   */private XExpressionHelper expressionHelper;
  
  /* @Inject
   */private /* TypeReferences */Object typeReferences;
  
  /* @Inject
   */private TypeConformanceComputer typeConformanceComputer;
  
  /* @Inject
   */private IRawTypeHelper rawTypeHelper;
  
  /* @Inject
   */private /* Primitives */Object primitives;
  
  /* @Inject
   */private FunctionTypes functionTypes;
  
  /* @Inject
   */private ArrayTypes arrayTypes;
  
  /* @Inject
   */private BoundTypeArgumentMerger boundTypeArgumentMerger;
  
  /* @Inject
   */private SynonymTypesProvider synonymTypesProvider;
  
  /* @Inject
   */private IJvmModelAssociations jvmModelAssociations;
  
  /* @Inject
   */private ExtendedEarlyExitComputer earlyExitComputer;
  
  /* @Inject
   */private HumanReadableTypeNames humanReadableTypeNames;
  
  /* @Inject()
   */private XtypeFactory xtypeFactory = XtypeFactory.eINSTANCE;
  
  /* @Inject()
   */private /* TypesFactory */Object typesFactory /* Skipped initializer because of errors */;
}
