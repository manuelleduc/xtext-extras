/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.compiler.ErrorSafeExtensions;
import org.eclipse.xtext.mbase.compiler.GeneratorConfig;
import org.eclipse.xtext.mbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.mbase.compiler.ImportManager;
import org.eclipse.xtext.mbase.compiler.JavaKeywords;
import org.eclipse.xtext.mbase.compiler.LoopExtensions;
import org.eclipse.xtext.mbase.compiler.TreeAppendableUtil;
import org.eclipse.xtext.mbase.compiler.mbaseCompiler;
import org.eclipse.xtext.mbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.mbase.compiler.output.ImportingStringConcatenation;
import org.eclipse.xtext.mbase.compiler.output.SharedAppendableState;
import org.eclipse.xtext.mbase.compiler.output.TreeAppendable;
import org.eclipse.xtext.mbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.mbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.mbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.mbase.jvmmodel.JvmTypeExtensions;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.util.CommonTypeComputationServices;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * A generator implementation that processes the
 * derived {@link IJvmModelInferrer JVM model}
 * and produces the respective java code.
 */
@SuppressWarnings("all")
public class JvmModelGenerator /* implements IGenerator  */{
  /* @Inject
   */protected ILogicalContainerProvider _iLogicalContainerProvider;
  
  /* @Inject
   */protected /* TypeReferences */Object _typeReferences;
  
  /* @Inject
   */protected TreeAppendableUtil _treeAppendableUtil;
  
  /* @Inject
   */protected JvmTypeExtensions _jvmTypeExtensions;
  
  /* @Inject
   */protected LoopExtensions _loopExtensions;
  
  /* @Inject
   */protected ErrorSafeExtensions _errorSafeExtensions;
  
  /* @Inject
   */private CommonTypeComputationServices commonServices;
  
  /* @Inject
   */private mbaseCompiler compiler;
  
  /* @Inject
   */private /* ILocationInFileProvider */Object locationProvider;
  
  /* @Inject
   */private /* IEObjectDocumentationProvider */Object documentationProvider;
  
  /* @Inject
   */private /* IFileHeaderProvider */Object fileHeaderProvider;
  
  /* @Inject
   */private IJvmModelAssociations jvmModelAssociations;
  
  /* @Inject
   */private JavaKeywords keywords;
  
  /* @Inject
   */private IGeneratorConfigProvider generatorConfigProvider;
  
  /* @Inject
   */private /* ITraceURIConverter */Object converter;
  
  /* @Inject
   */private /* IJavaDocTypeReferenceProvider */Object javaDocTypeReferenceProvider;
  
  /* @Inject
   */private /* IScopeProvider */Object scopeProvider;
  
  /* @Inject
   */private /* IQualifiedNameConverter */Object qualifiedNameConverter;
  
  @Override
  public void doGenerate(final /* Resource */Object input, final /* IFileSystemAccess */Object fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\ncontents cannot be resolved"
      + "\ninternalDoGenerate cannot be resolved");
  }
  
  protected void _internalDoGenerate(final /* EObject */Object obj, final /* IFileSystemAccess */Object fsa) {
  }
  
  protected void _internalDoGenerate(final /* JvmDeclaredType */Object type, final /* IFileSystemAccess */Object fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method get(JvmDeclaredType) is undefined for the type IGeneratorConfigProvider"
      + "\nThe method isDisabled(Object) from the type DisableCodeGenerationAdapter refers to the missing type Object"
      + "\nqualifiedName cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ngenerateFile cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nreplace cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ngenerateType cannot be resolved");
  }
  
  protected ImportManager createImportManager(final /* JvmDeclaredType */Object type) {
    return new ImportManager(true, (type).JvmDeclaredTypeValue());
  }
  
  public CharSequence generateType(final /* JvmDeclaredType */Object type, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nThe method createImportManager(JvmDeclaredType) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\nThe method createAppendable(EObject, ImportManager, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method assignThisAndSuper(ITreeAppendable, JvmDeclaredType, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\nThe method generateBody(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method createAppendable(EObject, ImportManager, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateFileHeader(JvmDeclaredType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\npackageName cannot be resolved"
      + "\n!== cannot be resolved"
      + "\npackageName cannot be resolved");
  }
  
  protected ITreeAppendable _generateBody(final /* JvmGenericType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nThe method trace(JvmGenericType) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field isInterface is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method or field typeParameters is undefined"
      + "\nThe method or field anonymous is undefined"
      + "\n! cannot be resolved."
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateModifier(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method generateTypeParameterDeclaration(JvmTypeParameterDeclarator, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmTypeParameterDeclarator"
      + "\nThe method generateExtendsClause(JvmDeclaredType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\nThe method generateMembersInBody(JvmDeclaredType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\ngenerateAnnotations cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\neContainer cannot be resolved");
  }
  
  public ITreeAppendable generateMembersInBody(final /* JvmDeclaredType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEach(Iterable<JvmMember>, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method separator(Object) is undefined"
      + "\nThe method traceWithComments(Object) is undefined for the type ITreeAppendable"
      + "\nThe method getMembersToBeCompiled(JvmEnumerationType) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\nThe method generateMember(JvmMember, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\nopenScope cannot be resolved"
      + "\ncloseScope cannot be resolved");
  }
  
  /**
   * @deprecated Additional annotations should be created in the JVM model.
   */
  @Deprecated
  public ITreeAppendable generateAnnotationsWithSyntheticSuppressWarnings(final /* JvmDeclaredType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmAnnotationReference cannot be resolved to a type."
      + "\nThe method or field annotation is undefined"
      + "\nThe method or field annotations is undefined"
      + "\nidentifier cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\ngenerateAnnotations cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\n=== cannot be resolved");
  }
  
  protected ITreeAppendable _generateBody(final /* JvmEnumerationType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmEnumerationLiteral cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\nThe method trace(JvmEnumerationType) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method or field literals is undefined"
      + "\nThe method separator(Object) is undefined"
      + "\nThe method suffix(String) is undefined"
      + "\nThe method filter(Object) is undefined for the type Iterable<JvmMember>"
      + "\n! cannot be resolved."
      + "\nThe method separator(Object) is undefined"
      + "\n! cannot be resolved."
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateModifier(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method generateExtendsClause(JvmDeclaredType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\nThe method generateEnumLiteral(JvmEnumerationLiteral, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmEnumerationLiteral"
      + "\nThe method getMembersToBeCompiled(JvmEnumerationType) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\nThe method generateMember(JvmMember, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\ngenerateAnnotations cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nincreaseIndentation cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ntrace cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ntrace cannot be resolved"
      + "\ndecreaseIndentation cannot be resolved"
      + "\nnewLine cannot be resolved"
      + "\nappend cannot be resolved"
      + "\neContainer cannot be resolved");
  }
  
  public void generateEnumLiteral(final /* JvmEnumerationLiteral */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\ngenerateAnnotations cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved");
  }
  
  protected ITreeAppendable _generateBody(final /* JvmAnnotationType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nThe method trace(JvmAnnotationType) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method filter(Object) is undefined for the type Iterable<JvmMember>"
      + "\nThe method or field JvmDeclaredType is undefined"
      + "\nThe method filter(Object) is undefined for the type Iterable<JvmMember>"
      + "\nThe method or field JvmOperation is undefined"
      + "\n! cannot be resolved."
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateModifier(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method getMembersToBeCompiled(JvmEnumerationType) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\nThe method generateMember(JvmMember, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\nThe method getMembersToBeCompiled(JvmEnumerationType) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\nThe method generateAnnotationMethod(JvmOperation, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmOperation"
      + "\ngenerateAnnotations cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntrace cannot be resolved"
      + "\nincreaseIndentation cannot be resolved"
      + "\ndecreaseIndentation cannot be resolved"
      + "\nnewLine cannot be resolved"
      + "\nappend cannot be resolved"
      + "\neContainer cannot be resolved");
  }
  
  public void generateAnnotationMethod(final /* JvmOperation */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method trace(JvmOperation) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field returnType is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateModifier(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method generateDefaultExpression(JvmOperation, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmOperation"
      + "\ngenerateAnnotations cannot be resolved"
      + "\nserializeSafely cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  public void generateDefaultExpression(final /* JvmOperation */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compilationStrategy is undefined"
      + "\nThe method or field compilationStrategy is undefined"
      + "\nThe method or field compilationTemplate is undefined"
      + "\nThe method or field associatedExpression is undefined"
      + "\nThe method or field returnType is undefined"
      + "\nThe method or field defaultValue is undefined"
      + "\nThe method or field defaultValue is undefined"
      + "\nThe method or field defaultValue is undefined"
      + "\nThe field generateExpressions is not visible"
      + "\nThe method appendCompilationTemplate(ITreeAppendable, JvmIdentifiableElement) from the type JvmModelGenerator refers to the missing type JvmIdentifiableElement"
      + "\n!== cannot be resolved"
      + "\napply cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nhasErrors cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nhasErrors cannot be resolved"
      + "\ntoJavaLiteral cannot be resolved");
  }
  
  private void appendCompilationTemplate(final ITreeAppendable appendable, final /* JvmIdentifiableElement */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nStandardTypeReferenceOwner cannot be resolved."
      + "\nThe method append(Object) is undefined for the type ImportingStringConcatenation"
      + "\nThe method or field compilationTemplate is undefined"
      + "\n+ cannot be resolved."
      + "\nType mismatch: cannot convert from ImportingStringConcatenation to Class<?>");
  }
  
  protected ImportingStringConcatenation createImportingStringConcatenation(final SharedAppendableState state, final ITypeReferenceOwner owner) {
    return new ImportingStringConcatenation(state, owner);
  }
  
  protected ITreeAppendable _generateModifier(final /* JvmGenericType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field interface is undefined"
      + "\nThe method or field isStatic is undefined"
      + "\nThe method or field isAbstract is undefined"
      + "\nThe method or field isFinal is undefined"
      + "\nThe method or field isStrictFloatingPoint is undefined"
      + "\nThe method generateVisibilityModifier(JvmMember, ITreeAppendable) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\n! cannot be resolved");
  }
  
  protected ITreeAppendable _generateModifier(final /* JvmDeclaredType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generateVisibilityModifier(JvmMember, ITreeAppendable) from the type JvmModelGenerator refers to the missing type JvmMember");
  }
  
  protected ITreeAppendable _generateModifier(final /* JvmField */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isFinal is undefined"
      + "\nThe method or field isStatic is undefined"
      + "\nThe method or field isTransient is undefined"
      + "\nThe method or field isVolatile is undefined"
      + "\nThe method generateVisibilityModifier(JvmMember, ITreeAppendable) from the type JvmModelGenerator refers to the missing type JvmMember");
  }
  
  protected ITreeAppendable _generateModifier(final /* JvmOperation */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmGenericType cannot be resolved to a type."
      + "\nJvmGenericType cannot be resolved to a type."
      + "\nThe method or field isAbstract is undefined"
      + "\nThe method or field isStatic is undefined"
      + "\nThe method or field isAbstract is undefined"
      + "\nThe method or field isStatic is undefined"
      + "\nThe method or field getJavaSourceVersion is undefined for the type GeneratorConfig"
      + "\nThe method or field JAVA8 is undefined"
      + "\nThe method or field eContainer is undefined"
      + "\nThe method or field eContainer is undefined"
      + "\nThe method or field isFinal is undefined"
      + "\nThe method or field isSynchronized is undefined"
      + "\nThe method or field isStrictFloatingPoint is undefined"
      + "\nThe method or field isNative is undefined"
      + "\nThe method generateVisibilityModifier(JvmMember, ITreeAppendable) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n! cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nisAtLeast cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nisInterface cannot be resolved");
  }
  
  public ITreeAppendable generateVisibilityModifier(final /* JvmMember */Object it, final ITreeAppendable result) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field visibility is undefined"
      + "\njavaName cannot be resolved");
  }
  
  protected ITreeAppendable _generateModifier(final /* JvmConstructor */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generateVisibilityModifier(JvmMember, ITreeAppendable) from the type JvmModelGenerator refers to the missing type JvmMember");
  }
  
  /**
   * Returns the visibility modifier and a space as suffix if not empty
   */
  public String javaName(final /* JvmVisibility */Object visibility) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field JvmVisibility is undefined"
      + "\nThe method or field JvmVisibility is undefined"
      + "\nThe method or field JvmVisibility is undefined"
      + "\nThe method or field JvmVisibility is undefined"
      + "\n!== cannot be resolved"
      + "\nPRIVATE cannot be resolved"
      + "\nPUBLIC cannot be resolved"
      + "\nPROTECTED cannot be resolved"
      + "\nDEFAULT cannot be resolved");
  }
  
  public void generateExtendsClause(final /* JvmDeclaredType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmAnnotationType cannot be resolved to a type."
      + "\nJvmEnumerationType cannot be resolved to a type."
      + "\nJvmAnnotationType cannot be resolved to a type."
      + "\nJvmGenericType cannot be resolved to a type."
      + "\nJvmGenericType cannot be resolved to a type."
      + "\nJvmGenericType cannot be resolved to a type."
      + "\nJvmGenericType cannot be resolved to a type."
      + "\n|| cannot be resolved."
      + "\n&& cannot be resolved."
      + "\nThe method or field superTypes is undefined"
      + "\nThe method forEachSafely(Object, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method prefix(String) is undefined"
      + "\nThe method separator(String) is undefined"
      + "\nThe method suffix(String) is undefined"
      + "\nThe method serializeSafely(Object) is undefined"
      + "\nThe method or field superTypes is undefined"
      + "\n&& cannot be resolved."
      + "\nThe method forEachSafely(Object, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method prefix(String) is undefined"
      + "\nThe method separator(String) is undefined"
      + "\nThe method suffix(String) is undefined"
      + "\nThe method serializeSafely(Object) is undefined"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nisInterface cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nidentifier cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nidentifier cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nisInterface cannot be resolved"
      + "\n! cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nhasErrors cannot be resolved"
      + "\nserializeSafely cannot be resolved");
  }
  
  protected ITreeAppendable _generateMember(final /* JvmMember */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\n^class cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected ITreeAppendable _generateMember(final /* JvmDeclaredType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assignThisAndSuper(ITreeAppendable, JvmDeclaredType, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\nThe method generateBody(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType");
  }
  
  protected Object _generateMember(final /* JvmField */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method trace(JvmField) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field type is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateModifier(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method generateInitialization(JvmField, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmField"
      + "\ngenerateAnnotations cannot be resolved"
      + "\nserializeSafely cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ndeclareVariable cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected ITreeAppendable _generateMember(final /* JvmOperation */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method trace(JvmOperation) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field returnType is undefined"
      + "\nThe method or field returnType is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method or field isAbstract is undefined"
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateModifier(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method generateTypeParameterDeclaration(JvmTypeParameterDeclarator, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmTypeParameterDeclarator"
      + "\nThe method generateParameters(JvmExecutable, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\nThe method generateThrowsClause(JvmExecutable, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\nThe method hasBody(JvmExecutable) from the type JvmModelGenerator refers to the missing type Object"
      + "\nThe method generateExecutableBody(JvmExecutable, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\ngenerateAnnotations cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nserializeSafely cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n! cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  protected ITreeAppendable _generateMember(final /* JvmConstructor */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method trace(JvmConstructor) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nThe method generateJavaDoc(EObject, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateModifier(JvmGenericType, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\nThe method generateTypeParameterDeclaration(JvmTypeParameterDeclarator, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmTypeParameterDeclarator"
      + "\nThe method generateParameters(JvmExecutable, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\nThe method generateThrowsClause(JvmExecutable, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\nThe method generateExecutableBody(JvmExecutable, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\ngenerateAnnotations cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nmakeJavaIdentifier cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  public void generateInitialization(final /* JvmField */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compilationStrategy is undefined"
      + "\nThe method or field compilationStrategy is undefined"
      + "\nThe method or field compilationTemplate is undefined"
      + "\nThe method or field associatedExpression is undefined"
      + "\nThe method or field type is undefined"
      + "\nThe field generateExpressions is not visible"
      + "\nThe method getDirectErrorsOrLogicallyContainedErrors(JvmFeature) from the type JvmModelGenerator refers to the missing type Object"
      + "\nThe method getDirectErrorsOrLogicallyContainedErrors(JvmFeature) from the type JvmModelGenerator refers to the missing type Object"
      + "\nThe method appendCompilationTemplate(ITreeAppendable, JvmIdentifiableElement) from the type JvmModelGenerator refers to the missing type JvmIdentifiableElement"
      + "\n!== cannot be resolved"
      + "\nisEmpty cannot be resolved"
      + "\napply cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nisEmpty cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nhasErrors cannot be resolved");
  }
  
  public void generateTypeParameterDeclaration(final /* JvmTypeParameterDeclarator */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEach(Object, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field typeParameters is undefined"
      + "\nThe method prefix(String) is undefined"
      + "\nThe method separator(String) is undefined"
      + "\nThe method suffix(String) is undefined"
      + "\nThe method generateTypeParameterDeclaration(JvmTypeParameterDeclarator, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmTypeParameterDeclarator");
  }
  
  public void generateTypeParameterDeclaration(final /* JvmTypeParameter */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method trace(JvmTypeParameter) is undefined for the type ITreeAppendable"
      + "\nThe method or field name is undefined"
      + "\nThe method generateTypeParameterConstraints(JvmTypeParameter, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmTypeParameter"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  public void generateTypeParameterConstraints(final /* JvmTypeParameter */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field constraints is undefined"
      + "\nThe method or field JvmUpperBound is undefined"
      + "\nThe method forEachSafely(Object, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method prefix(String) is undefined"
      + "\nThe method separator(String) is undefined"
      + "\nThe method or field typeReference is undefined"
      + "\nfilter cannot be resolved"
      + "\nserializeSafely cannot be resolved");
  }
  
  public void generateThrowsClause(final /* JvmExecutable */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field newLinkedHashMap is undefined"
      + "\nThe method or field exceptions is undefined"
      + "\nThe method or field type is undefined"
      + "\nThe method or field type is undefined"
      + "\nThe method forEachSafely(Object, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method prefix(String) is undefined"
      + "\nThe method separator(String) is undefined"
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmTypeReference cannot be resolved to a type."
      + "\nforEach cannot be resolved"
      + "\ncontainsKey cannot be resolved"
      + "\n! cannot be resolved"
      + "\nput cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\ntrace cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntype cannot be resolved");
  }
  
  public void generateParameters(final /* JvmExecutable */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field parameters is undefined"
      + "\n.. cannot be resolved."
      + "\nThe method or field parameters is undefined"
      + "\nThe method or field parameters is undefined"
      + "\nThe method or field parameters is undefined"
      + "\nisEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n- cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nget cannot be resolved"
      + "\ngenerateParameter cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nvarArgs cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public void generateParameter(final /* JvmFormalParameter */Object it, final ITreeAppendable appendable, final boolean vararg, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmGenericArrayTypeReference cannot be resolved to a type."
      + "\nJvmGenericArrayTypeReference cannot be resolved to a type."
      + "\nThe method trace(JvmFormalParameter) is undefined for the type ITreeAppendable"
      + "\nThe method or field annotations is undefined"
      + "\n! cannot be resolved."
      + "\nThe method or field parameterType is undefined"
      + "\nThe method or field parameterType is undefined"
      + "\nThe method or field parameterType is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\ngenerateAnnotations cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ncomponentType cannot be resolved"
      + "\nserializeSafely cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nserializeSafely cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ndeclareVariable cannot be resolved"
      + "\ntraceSignificant cannot be resolved"
      + "\nappend cannot be resolved");
  }
  
  public Object hasBody(final /* JvmExecutable */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compilationTemplate is undefined"
      + "\nThe method or field compilationStrategy is undefined"
      + "\nThe method or field associatedExpression is undefined"
      + "\n!== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  /**
   * Returns the errors that are produced for elements that are directly contained
   * in this feature (e.g. unresolved type proxies) or that are associated with
   * the expression that may be logically contained in the given feature.
   */
  private Object getDirectErrorsOrLogicallyContainedErrors(final /* JvmFeature */Object feature) {
    throw new Error("Unresolved compilation problems:"
      + "\nerrors cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nassociatedExpression cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nerrors cannot be resolved");
  }
  
  public void generateExecutableBody(final /* JvmExecutable */Object op, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmOperation cannot be resolved to a type."
      + "\nJvmConstructor cannot be resolved to a type."
      + "\nJvmOperation cannot be resolved to a type."
      + "\nJvmConstructor cannot be resolved to a type."
      + "\nThe method getTypeForName(JvmExecutable) is undefined for the type Class<Void>"
      + "\nThe field generateExpressions is not visible"
      + "\nThe method generateBodyWithIssues(ITreeAppendable, Iterable<Issue>) from the type JvmModelGenerator refers to the missing type Issue"
      + "\nThe method appendCompilationTemplate(ITreeAppendable, JvmIdentifiableElement) from the type JvmModelGenerator refers to the missing type JvmIdentifiableElement"
      + "\nThe method generateBodyWithIssues(ITreeAppendable, Iterable<Issue>) from the type JvmModelGenerator refers to the missing type Issue"
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method compile(JvmExecutable, XExpression, JvmTypeReference, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\nThe method generateBodyWithIssues(ITreeAppendable, Iterable<Issue>) from the type JvmModelGenerator refers to the missing type Issue"
      + "\ncompilationStrategy cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ndirectErrorsOrLogicallyContainedErrors cannot be resolved"
      + "\nempty cannot be resolved"
      + "\ncompilationStrategy cannot be resolved"
      + "\napply cannot be resolved"
      + "\ncompilationTemplate cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ndirectErrorsOrLogicallyContainedErrors cannot be resolved"
      + "\nempty cannot be resolved"
      + "\ngetAssociatedExpression cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nerrors cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nreturnType cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  public Object compile(final /* JvmExecutable */Object executable, final XExpression expression, final /* JvmTypeReference */Object returnType, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compile(JvmExecutable, XExpression, JvmTypeReference, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmExecutable"
      + "\nexceptions cannot be resolved"
      + "\ntoSet cannot be resolved");
  }
  
  public void assignThisAndSuper(final ITreeAppendable b, final /* JvmDeclaredType */Object declaredType, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method reassignSuperType(ITreeAppendable, JvmDeclaredType, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmDeclaredType"
      + "\nThe method reassignThisType(ITreeAppendable, JvmDeclaredType) from the type JvmModelGenerator refers to the missing type JvmDeclaredType");
  }
  
  private String reassignSuperType(final ITreeAppendable b, final /* JvmDeclaredType */Object declaredType, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nJvmTypeReference cannot be resolved to a type."
      + "\nThe method or field simpleName is undefined for the type Object"
      + "\nThe method or field getJavaSourceVersion is undefined for the type GeneratorConfig"
      + "\nThe method or field JAVA8 is undefined"
      + "\n!= cannot be resolved."
      + "\nextendedClass cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nisAtLeast cannot be resolved"
      + "\nextendedInterfaces cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  protected String reassignThisType(final ITreeAppendable b, final /* JvmDeclaredType */Object declaredType) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nThe method or field local is undefined for the type Object"
      + "\nThe method or field simpleName is undefined for the type Object"
      + "\n+ cannot be resolved"
      + "\n!== cannot be resolved");
  }
  
  public ITreeAppendable generateBodyWithIssues(final ITreeAppendable appendable, final /* Iterable<Issue> */Object errors) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field message is undefined"
      + "\nThe method doConvertToJavaString(String) from the type JvmModelGenerator refers to the missing type Object");
  }
  
  /**
   * Convert a given input string to a Java string. Non-ascii characters will
   * be replaced by a unicode escape sequence by default.
   */
  protected Object doConvertToJavaString(final String input) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Strings is undefined"
      + "\nconvertToJavaString cannot be resolved");
  }
  
  public void generateFileHeader(final /* JvmDeclaredType */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eResource is undefined"
      + "\nThe method generateDocumentation(String, List<INode>, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type INode"
      + "\nThe field JvmModelGenerator.fileHeaderProvider refers to the missing type IFileHeaderProvider"
      + "\neAdapters cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nheaderText cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nheaderText cannot be resolved"
      + "\ngetFileHeaderNodes cannot be resolved");
  }
  
  public void generateJavaDoc(final /* EObject */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nIEObjectDocumentationProviderExtension cannot be resolved to a type."
      + "\nIEObjectDocumentationProviderExtension cannot be resolved to a type."
      + "\nThe method or field emptyList is undefined"
      + "\nThe field JvmModelGenerator.documentationProvider refers to the missing type IEObjectDocumentationProvider"
      + "\nThe field JvmModelGenerator.documentationProvider refers to the missing type IEObjectDocumentationProvider"
      + "\nThe method addJavaDocImports(EObject, ITreeAppendable, List<INode>) from the type JvmModelGenerator refers to the missing type EObject"
      + "\nThe method generateDocumentation(String, List<INode>, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type INode"
      + "\nThe method generateDocumentation(String, List<INode>, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type INode"
      + "\neAdapters cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nhead cannot be resolved"
      + "\ndocumentation cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsourceElements cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngetDocumentationNodes cannot be resolved"
      + "\nhead cannot be resolved"
      + "\ndocumentation cannot be resolved"
      + "\ndocumentation cannot be resolved");
  }
  
  public void addJavaDocImports(final /* EObject */Object it, final ITreeAppendable appendable, final /* List<INode> */Object documentationNodes) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE is undefined"
      + "\nThe method or field EcoreUtil is undefined"
      + "\n&& cannot be resolved."
      + "\nThe method or field EcoreUtil2 is undefined"
      + "\nThe method or field JvmDeclaredType is undefined"
      + "\nThe method addImportFor(JvmType) is undefined for the type ImportManager"
      + "\nThe field JvmModelGenerator.javaDocTypeReferenceProvider refers to the missing type IJavaDocTypeReferenceProvider"
      + "\nThe field JvmModelGenerator.qualifiedNameConverter refers to the missing type IQualifiedNameConverter"
      + "\nThe field JvmModelGenerator.scopeProvider refers to the missing type IScopeProvider"
      + "\ncomputeTypeRefRegions cannot be resolved"
      + "\ntext cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n> cannot be resolved"
      + "\ntoQualifiedName cannot be resolved"
      + "\nfindActualSemanticObjectFor cannot be resolved"
      + "\nsegmentCount cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ngetScope cannot be resolved"
      + "\ngetSingleElement cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nEObjectOrProxy cannot be resolved"
      + "\neIsProxy cannot be resolved"
      + "\nresolve cannot be resolved"
      + "\nEObjectOrProxy cannot be resolved"
      + "\nEObjectOrProxy cannot be resolved"
      + "\neIsProxy cannot be resolved"
      + "\n! cannot be resolved"
      + "\ngetContainerOfType cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npackageName cannot be resolved");
  }
  
  public ImportManager getImportManager(final ITreeAppendable appendable) {
    try {
      ImportManager _xblockexpression = null;
      {
        final Field stateField = appendable.getClass().getDeclaredField("state");
        stateField.setAccessible(true);
        final Object stateValue = stateField.get(appendable);
        final Field importManagerField = stateValue.getClass().getDeclaredField("importManager");
        importManagerField.setAccessible(true);
        Object _get = importManagerField.get(stateValue);
        _xblockexpression = ((ImportManager) _get);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected ITreeAppendable generateDocumentation(final String text, final /* List<INode> */Object documentationNodes, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nStringConcatenation cannot be resolved to a type."
      + "\n! cannot be resolved."
      + "\nThe method or field ITextRegionWithLineInformation is undefined"
      + "\nThe method trace(Object) is undefined for the type ITreeAppendable"
      + "\nLocationData cannot be resolved."
      + "\nnewLine cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nnewLine cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nEMPTY_REGION cannot be resolved"
      + "\nmerge cannot be resolved"
      + "\ntextRegionWithLineInformation cannot be resolved"
      + "\nappend cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  public void generateAnnotations(final /* Iterable<JvmAnnotationReference> */Object annotations, final ITreeAppendable appendable, final boolean withLineBreak, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachSafely(Iterable<JvmAnnotationReference>, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method separator(Object) is undefined"
      + "\nThe method suffix(Object) is undefined"
      + "\ngenerateAnnotation cannot be resolved");
  }
  
  public void generateAnnotation(final /* JvmAnnotationReference */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field annotation is undefined"
      + "\nThe method forEach(Object, Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field explicitValues is undefined"
      + "\nThe method prefix(String) is undefined"
      + "\nThe method separator(String) is undefined"
      + "\nThe method suffix(String) is undefined"
      + "\nThe method toJava(JvmAnnotationValue, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmAnnotationValue");
  }
  
  public void toJava(final /* JvmAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmAnnotationReference cannot be resolved to a type."
      + "\nThe method or field operation is undefined"
      + "\nThe method or field operation is undefined"
      + "\nThe method or field operation is undefined"
      + "\nThe method or field eContainer is undefined"
      + "\nThe method toJavaLiteral(JvmAnnotationAnnotationValue, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmAnnotationAnnotationValue"
      + "\n!== cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nexplicitValues cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved");
  }
  
  protected void _toJavaLiteral(final /* JvmAnnotationAnnotationValue */Object value, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method generateAnnotation(JvmAnnotationReference, ITreeAppendable, GeneratorConfig) from the type JvmModelGenerator refers to the missing type JvmAnnotationReference"
      + "\nvalues cannot be resolved");
  }
  
  protected void _toJavaLiteral(final /* JvmShortAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined");
  }
  
  protected void _toJavaLiteral(final /* JvmIntAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined");
  }
  
  protected void _toJavaLiteral(final /* JvmLongAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined");
  }
  
  protected void _toJavaLiteral(final /* JvmByteAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined");
  }
  
  protected void _toJavaLiteral(final /* JvmDoubleAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined"
      + "\n+ cannot be resolved.");
  }
  
  protected void _toJavaLiteral(final /* JvmFloatAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined"
      + "\n+ cannot be resolved.");
  }
  
  protected void _toJavaLiteral(final /* JvmCharAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined"
      + "\n+ cannot be resolved."
      + "\nThe method doConvertToJavaString(String) from the type JvmModelGenerator refers to the missing type Object"
      + "\n+ cannot be resolved");
  }
  
  protected void _toJavaLiteral(final /* JvmStringAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined"
      + "\n+ cannot be resolved."
      + "\nThe method doConvertToJavaString(String) from the type JvmModelGenerator refers to the missing type Object"
      + "\n+ cannot be resolved");
  }
  
  protected void _toJavaLiteral(final /* JvmTypeAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined"
      + "\nThe method or field type is undefined");
  }
  
  protected void _toJavaLiteral(final /* JvmEnumAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined"
      + "\nThe method or field declaringType is undefined"
      + "\nThe method or field simpleName is undefined"
      + "\nmakeJavaIdentifier cannot be resolved");
  }
  
  protected void _toJavaLiteral(final /* JvmBooleanAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined");
  }
  
  protected void _toJavaLiteral(final /* JvmCustomAnnotationValue */Object it, final ITreeAppendable appendable, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field values is undefined"
      + "\nThe method forEachWithShortcut(Object, Object) is undefined for the type ITreeAppendable"
      + "\nThe method or field values is undefined"
      + "\nisEmpty cannot be resolved"
      + "\nfilter cannot be resolved");
  }
  
  public TreeAppendable createAppendable(final /* EObject */Object context, final ImportManager importManager, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nURI cannot be resolved to a type."
      + "\nSourceRelativeURI cannot be resolved to a type."
      + "\nSourceRelativeURI cannot be resolved to a type."
      + "\nSourceRelativeURI cannot be resolved to a type."
      + "\nAbsoluteURI cannot be resolved to a type."
      + "\nIProjectConfig cannot be resolved to a type."
      + "\nResource cannot be resolved to a type."
      + "\nITraceURIConverter cannot be resolved."
      + "\nTreeAppendable cannot be resolved."
      + "\nThe method newHashMap() is undefined"
      + "\n! cannot be resolved."
      + "\n! cannot be resolved."
      + "\nThe method getURIForTrace(IProjectConfig, AbsoluteURI) of type new Object(){} must override a superclass method."
      + "\nThe method getURIForTrace(Resource) of type new Object(){} must override a superclass method."
      + "\nThe field __JvmModelGenerator_1.uriForTraceCache refers to the missing type URI"
      + "\nThe field JvmModelGenerator.converter refers to the missing type ITraceURIConverter"
      + "\nThe field __JvmModelGenerator_1.uriForTraceCache refers to the missing type URI"
      + "\nThe field __JvmModelGenerator_1.uriForTraceCache refers to the missing type URI"
      + "\nThe field __JvmModelGenerator_1.uriForTraceCache refers to the missing type URI"
      + "\nThe field JvmModelGenerator.converter refers to the missing type ITraceURIConverter"
      + "\nThe field __JvmModelGenerator_1.uriForTraceCache refers to the missing type URI"
      + "\nThe field __JvmModelGenerator_1.uriForTraceCache refers to the missing type URI"
      + "\nThe field JvmModelGenerator.locationProvider refers to the missing type ILocationInFileProvider"
      + "\nstate cannot be resolved"
      + "\ngeneratorConfig cannot be resolved"
      + "\ngetURI cannot be resolved"
      + "\ngetURIForTrace cannot be resolved"
      + "\ngetURI cannot be resolved"
      + "\ngetURI cannot be resolved"
      + "\ngetURI cannot be resolved"
      + "\ngetURIForTrace cannot be resolved"
      + "\ngetURI cannot be resolved"
      + "\ngetURI cannot be resolved");
  }
  
  public /* JvmGenericType */Object containerType(final /* EObject */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmGenericType cannot be resolved to a type."
      + "\nThe method containerType(EObject) from the type JvmModelGenerator refers to the missing type JvmGenericType"
      + "\n=== cannot be resolved"
      + "\neContainer cannot be resolved");
  }
  
  protected String makeJavaIdentifier(final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\n+ cannot be resolved.");
  }
  
  protected /* Iterable<JvmMember> */Object _getMembersToBeCompiled(final /* JvmEnumerationType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmOperation cannot be resolved to a type."
      + "\n&& cannot be resolved."
      + "\nThe method or field identifier is undefined"
      + "\nidentifier cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nidentifier cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nmembers cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  protected /* Iterable<JvmMember> */Object _getMembersToBeCompiled(final /* JvmDeclaredType */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmConstructor cannot be resolved to a type."
      + "\nJvmConstructor cannot be resolved to a type."
      + "\nThe method or field members is undefined"
      + "\n&& cannot be resolved."
      + "\nfilter cannot be resolved"
      + "\nsingleSyntheticDefaultConstructor cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  protected /* Iterable<JvmMember> */Object _getMembersToBeCompiled(final /* JvmGenericType */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmConstructor cannot be resolved to a type."
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nThe method or field members is undefined"
      + "\n! cannot be resolved."
      + "\nThe method _getMembersToBeCompiled(JvmEnumerationType) from the type JvmModelGenerator refers to the missing type JvmMember"
      + "\nanonymous cannot be resolved"
      + "\nfilter cannot be resolved");
  }
  
  protected Object getSourceElements(final /* EObject */Object jvmElement) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method getSourceElements(EObject) is not applicable for the arguments (IJvmModelAssociations,EObject)"
      + "\nThe method getSourceElements(EObject) from the type JvmModelGenerator refers to the missing type EObject");
  }
  
  public void internalDoGenerate(final EObject obj, final IFileSystemAccess fsa) {
    if (obj != null
         && fsa != null) {
      _internalDoGenerate(obj, fsa);
      return; else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(obj, fsa).toString());
      }
    }
    
    public ITreeAppendable generateBody(final JvmGenericType it, final ITreeAppendable appendable, final GeneratorConfig config) {
      if (it != null) {
        return _generateBody(it, appendable, config); else {
          throw new IllegalArgumentException("Unhandled parameter types: " +
            Arrays.<Object>asList(it, appendable, config).toString());
        }
      }
      
      public ITreeAppendable generateModifier(final JvmGenericType it, final ITreeAppendable appendable, final GeneratorConfig config) {
        if (it != null) {
          return _generateModifier(it, appendable, config); else {
            throw new IllegalArgumentException("Unhandled parameter types: " +
              Arrays.<Object>asList(it, appendable, config).toString());
          }
        }
        
        public ITreeAppendable generateMember(final JvmMember it, final ITreeAppendable appendable, final GeneratorConfig config) {
          if (it != null) {
            return _generateMember(it, appendable, config); else {
              throw new IllegalArgumentException("Unhandled parameter types: " +
                Arrays.<Object>asList(it, appendable, config).toString());
            }
          }
          
          public void toJavaLiteral(final JvmAnnotationAnnotationValue value, final ITreeAppendable appendable, final GeneratorConfig config) {
            if (value != null) {
              _toJavaLiteral(value, appendable, config);
              return; else {
                throw new IllegalArgumentException("Unhandled parameter types: " +
                  Arrays.<Object>asList(value, appendable, config).toString());
              }
            }
            
            public /* Iterable<JvmMember> */Object getMembersToBeCompiled(final JvmEnumerationType type) {
              if (type != null) {
                return _getMembersToBeCompiled(type); else {
                  throw new IllegalArgumentException("Unhandled parameter types: " +
                    Arrays.<Object>asList(type).toString());
                }
              }
            }
            