package org.eclipse.xtext.mbase.typesystem.references;

import java.util.List;
import org.eclipse.xtext.mbase.compiler.ISourceAppender;
import org.eclipse.xtext.mbase.typesystem.references.AnyTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.ArrayTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.CompoundTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.FunctionTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.InnerFunctionTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.InnerTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.ParameterizedTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.TypeReferenceVisitor;
import org.eclipse.xtext.mbase.typesystem.references.UnboundTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.UnknownTypeReference;
import org.eclipse.xtext.mbase.typesystem.references.WildcardTypeReference;

@SuppressWarnings("all")
public class LightweightTypeReferenceSerializer extends TypeReferenceVisitor {
  private ISourceAppender appender;
  
  public LightweightTypeReferenceSerializer(final ISourceAppender appender) {
    this.appender = appender;
  }
  
  @Override
  protected void doVisitAnyTypeReference(final AnyTypeReference reference) {
    reference.toJavaType().accept(this);
  }
  
  @Override
  protected void doVisitArrayTypeReference(final ArrayTypeReference reference) {
    reference.getComponentType().accept(this);
    this.appender.append("[]");
  }
  
  @Override
  protected void doVisitCompoundTypeReference(final CompoundTypeReference reference) {
    reference.toJavaType().accept(this);
  }
  
  @Override
  protected void doVisitFunctionTypeReference(final FunctionTypeReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved.");
  }
  
  @Override
  protected void doVisitInnerFunctionTypeReference(final InnerFunctionTypeReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field simpleName is undefined for the type boolean"
      + "\n! cannot be resolved."
      + "\n=== cannot be resolved."
      + "\nInvalid number of arguments. The method isType(Class<?>) is not applicable without arguments");
  }
  
  @Override
  protected void doVisitParameterizedTypeReference(final ParameterizedTypeReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nInvalid number of arguments. The method isType(Class<?>) is not applicable without arguments"
      + "\nType mismatch: cannot convert from boolean to CharSequence");
  }
  
  @Override
  protected void doVisitInnerTypeReference(final InnerTypeReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field simpleName is undefined for the type boolean"
      + "\n! cannot be resolved."
      + "\nInvalid number of arguments. The method isType(Class<?>) is not applicable without arguments");
  }
  
  @Override
  protected void doVisitUnboundTypeReference(final UnboundTypeReference reference) {
    reference.toJavaType().accept(this);
  }
  
  @Override
  protected void doVisitUnknownTypeReference(final UnknownTypeReference reference) {
    this.appender.append(reference.getSimpleName());
  }
  
  @Override
  protected void doVisitWildcardTypeReference(final WildcardTypeReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\nThe method filter(Object) is undefined for the type List<LightweightTypeReference>"
      + "\n!= cannot be resolved."
      + "\nThe method or field identifier is undefined"
      + "\n! cannot be resolved."
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\naccept cannot be resolved");
  }
  
  protected void appendCommaSeparated(final List<LightweightTypeReference> references) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved.");
  }
}
