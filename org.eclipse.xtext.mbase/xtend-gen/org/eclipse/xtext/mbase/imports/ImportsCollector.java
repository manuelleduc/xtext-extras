package org.eclipse.xtext.mbase.imports;

import java.util.Arrays;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.XConstructorCall;
import org.eclipse.xtext.mbase.XFeatureCall;
import org.eclipse.xtext.mbase.XMemberFeatureCall;
import org.eclipse.xtext.mbase.XTypeLiteral;
import org.eclipse.xtext.mbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.mbase.imports.ImportsAcceptor;
import org.eclipse.xtext.mbase.services.mbaseGrammarAccess;

/**
 * @author Dennis Huebner - Initial contribution and API
 */
@SuppressWarnings("all")
public class ImportsCollector {
  /* @Inject
   */private mbaseGrammarAccess grammarAccess;
  
  /**
   * Collects import declarations in XtextResource for the given range (selectedRegion)
   */
  public void collectImports(final /* XtextResource */Object state, final /* ITextRegion */Object selectedRegion, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nICompositeNode cannot be resolved to a type."
      + "\nILeafNode cannot be resolved to a type."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field ML_COMMENTRule is undefined for the type mbaseGrammarAccess"
      + "\nThe method findActualSemanticObjectFor(ICompositeNode, ITextRegion) from the type ImportsCollector refers to the missing type EObject"
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject"
      + "\ngetParseResult cannot be resolved"
      + "\ngetRootNode cannot be resolved"
      + "\nfindActualNodeFor cannot be resolved"
      + "\nleafNodes cannot be resolved"
      + "\ntotalTextRegion cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\nsemanticElement cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nfindActualNodeFor cannot be resolved"
      + "\nisHidden cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nequals cannot be resolved"
      + "\ngrammarElement cannot be resolved"
      + "\naddJavaDocReferences cannot be resolved");
  }
  
  public /* EObject */Object findActualSemanticObjectFor(final /* ICompositeNode */Object rootNode, final /* ITextRegion */Object textRegion) {
    throw new Error("Unresolved compilation problems:"
      + "\nILeafNode cannot be resolved to a type."
      + "\nEObject cannot be resolved to a type."
      + "\nICompositeNode cannot be resolved to a type."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nfindLeafNodeAtOffset cannot be resolved"
      + "\noffset cannot be resolved"
      + "\ngetSemanticElement cannot be resolved"
      + "\nfindActualNodeFor cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlength cannot be resolved"
      + "\ngetParent cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngetTotalEndOffset cannot be resolved"
      + "\n< cannot be resolved"
      + "\ngetParent cannot be resolved"
      + "\nsemanticElement cannot be resolved");
  }
  
  protected void _visit(final /* EObject */Object semanticObj, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
  }
  
  protected void _visit(final /* JvmTypeReference */Object semanticElement, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject"
      + "\ngetType cannot be resolved");
  }
  
  protected void _visit(final XAbstractFeatureCall semanticObj, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    this.collectStaticImportsFrom(semanticObj, acceptor);
  }
  
  protected void _visit(final XMemberFeatureCall semanticObj, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\n&& cannot be resolved."
      + "\nThe method getFeature() is undefined for the type XMemberFeatureCall"
      + "\nThe method getFeature() is undefined for the type XMemberFeatureCall"
      + "\n! cannot be resolved."
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject");
  }
  
  protected void _visit(final XFeatureCall semanticObj, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\n&& cannot be resolved."
      + "\nThe method getFeature() is undefined for the type XFeatureCall"
      + "\nThe method getFeature() is undefined for the type XFeatureCall"
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject");
  }
  
  protected void _visit(final /* JvmGenericType */Object jvmType, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject"
      + "\nThe method _visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject"
      + "\nanonymous cannot be resolved"
      + "\nsuperTypes cannot be resolved"
      + "\nlast cannot be resolved"
      + "\ntype cannot be resolved");
  }
  
  protected void _visit(final /* JvmDeclaredType */Object jvmType, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method collectTypeImportFrom(JvmDeclaredType, ImportsAcceptor) from the type ImportsCollector refers to the missing type JvmDeclaredType"
      + "\nThe method findDeclaringTypeBySimpleName(JvmDeclaredType, String) from the type ImportsCollector refers to the missing type JvmDeclaredType"
      + "\nThe method collectTypeImportFrom(JvmDeclaredType, ImportsAcceptor) from the type ImportsCollector refers to the missing type JvmDeclaredType"
      + "\ngetDeclaringType cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ngetTokenText cannot be resolved"
      + "\n=== cannot be resolved");
  }
  
  private /* JvmDeclaredType */Object findDeclaringTypeBySimpleName(final /* JvmDeclaredType */Object referencedType, final String outerSegment) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findDeclaringTypeBySimpleName(JvmDeclaredType, String) from the type ImportsCollector refers to the missing type JvmDeclaredType"
      + "\ngetDeclaringType cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ngetSimpleName cannot be resolved"
      + "\ngetDeclaringType cannot be resolved");
  }
  
  protected void _visit(final XConstructorCall semanticElement, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field constructor is undefined for the type XConstructorCall"
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject"
      + "\ndeclaringType cannot be resolved");
  }
  
  protected void _visit(final XAnnotation semanticElement, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getAnnotationType() is undefined for the type XAnnotation"
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject");
  }
  
  protected void _visit(final XTypeLiteral semanticElement, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field XTYPE_LITERAL__TYPE is undefined for the type Class<Literals>"
      + "\nThe method or field type is undefined for the type XTypeLiteral"
      + "\nThe method visit(EObject, INode, ImportsAcceptor) from the type ImportsCollector refers to the missing type EObject"
      + "\nfindNodesForFeature cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  protected void _visit(final Void nullCase, final /* INode */Object originNode, final ImportsAcceptor acceptor) {
  }
  
  protected void collectTypeImportFrom(final /* JvmDeclaredType */Object type, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method acceptTypeImport(Object) from the type ImportsAcceptor refers to the missing type Object");
  }
  
  protected void collectStaticImportsFrom(final XAbstractFeatureCall abstractFeatureCall, final ImportsAcceptor acceptor) {
    boolean _isStatic = abstractFeatureCall.isStatic();
    if (_isStatic) {
      boolean _isExtension = abstractFeatureCall.isExtension();
      if (_isExtension) {
        acceptor.acceptStaticExtensionImport(abstractFeatureCall);
      } else {
        acceptor.acceptStaticImport(abstractFeatureCall);
      }
    }
  }
  
  protected String getFirstNameSegment(final String text_finalParam_) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved."
      + "\n- cannot be resolved."
      + "\n!= cannot be resolved."
      + "\n- cannot be resolved."
      + "\n== cannot be resolved."
      + "\n- cannot be resolved."
      + "\n== cannot be resolved."
      + "\n- cannot be resolved."
      + "\n>= cannot be resolved."
      + "\n- cannot be resolved."
      + "\n!= cannot be resolved."
      + "\n- cannot be resolved."
      + "\n!= cannot be resolved."
      + "\n- cannot be resolved."
      + "\n!= cannot be resolved."
      + "\n- cannot be resolved."
      + "\n&& cannot be resolved"
      + "\n&& cannot be resolved");
  }
  
  /* @Inject
   */private /* IJavaDocTypeReferenceProvider */Object javaDocTypeReferenceProvider;
  
  /* @Inject
   */private /* IScopeProvider */Object scopeProvider;
  
  private void addJavaDocReferences(final /* INode */Object documentationNode, final /* ITextRegion */Object selectedRegion, final ImportsAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nReplaceRegion cannot be resolved to a type."
      + "\nIScope cannot be resolved to a type."
      + "\nIEObjectDescription cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmType cannot be resolved to a type."
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nJvmDeclaredType cannot be resolved to a type."
      + "\nTextRegion cannot be resolved."
      + "\nThe method or field NodeModelUtils is undefined"
      + "\nThe method or field TypesPackage is undefined"
      + "\nThe method or field QualifiedName is undefined"
      + "\n&& cannot be resolved."
      + "\nThe field ImportsCollector.javaDocTypeReferenceProvider refers to the missing type IJavaDocTypeReferenceProvider"
      + "\nThe field ImportsCollector.scopeProvider refers to the missing type IScopeProvider"
      + "\nThe method acceptTypeImport(Object) from the type ImportsAcceptor refers to the missing type Object"
      + "\ncomputeTypeRefRegions cannot be resolved"
      + "\noffset cannot be resolved"
      + "\nlength cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\ngetText cannot be resolved"
      + "\nfindActualSemanticObjectFor cannot be resolved"
      + "\ngetScope cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_PARAMETERIZED_TYPE_REFERENCE__TYPE cannot be resolved"
      + "\ngetSingleElement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ngetEObjectOrProxy cannot be resolved"
      + "\neIsProxy cannot be resolved"
      + "\n! cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  public void visit(final EObject semanticObj, final INode originNode, final ImportsAcceptor acceptor) {
    if (semanticObj != null
         && originNode != null) {
      _visit(semanticObj, originNode, acceptor);
      return;
    } else if (semanticObj != null
         && originNode != null) {
      _visit(semanticObj, originNode, acceptor);
      return;
    } else if (semanticObj != null
         && originNode != null) {
      _visit(semanticObj, originNode, acceptor);
      return;
    } else if (semanticObj != null
         && originNode != null) {
      _visit(semanticObj, originNode, acceptor);
      return;
    } else if (semanticObj != null
         && originNode != null) {
      _visit(semanticObj, originNode, acceptor);
      return;
    } else if (semanticObj != null
         && originNode != null) {
      _visit(semanticObj, originNode, acceptor);
      return;
    } else if (semanticObj == null
         && originNode != null) {
      _visit(null, originNode, acceptor);
      return;
    } else if (semanticObj != null
         && originNode != null) {
      _visit(semanticObj, originNode, acceptor);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(semanticObj, originNode, acceptor).toString());
    }
  }
}
