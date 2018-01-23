/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.annotations.validation;

import org.eclipse.xtext.mbase.XAbstractFeatureCall;
import org.eclipse.xtext.mbase.typesystem.internal.FeatureLinkHelper;
import org.eclipse.xtext.mbase.util.FeatureCallAsTypeLiteralHelper;

/**
 * @author Dennis Huebner - Initial contribution and API
 */
@SuppressWarnings("all")
public class UnresolvedFeatureCallTypeAwareMessageProvider /* implements LinkingDiagnosticMessageProvider  */{
  /**
   * A user data entry that indicates a broken feature link which could also be
   * a type literal, e.g. 'String::CASE_INSENSITIVE'.
   */
  public final static String TYPE_LITERAL = "key:TypeLiteral";
  
  public final static String FEATURE_CALL = "key:FeatureCall";
  
  /* @Inject
   */private FeatureCallAsTypeLiteralHelper typeLiteralHelper;
  
  /* @Inject
   */private FeatureLinkHelper _featureLinkHelper;
  
  @Override
  public /* DiagnosticMessage */Object getUnresolvedProxyMessage(final /* ILinkingDiagnosticContext */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nIllegalNodeException cannot be resolved to a type."
      + "\nDiagnosticMessage cannot be resolved."
      + "\nThe method or field ERROR is undefined"
      + "\nThe method or field LINKING_DIAGNOSTIC is undefined"
      + "\nDiagnosticMessage cannot be resolved."
      + "\nThe method or field ERROR is undefined"
      + "\nThe method or field LINKING_DIAGNOSTIC is undefined"
      + "\nThe method isStaticMemberCallTarget(EObject) from the type UnresolvedFeatureCallTypeAwareMessageProvider refers to the missing type EObject"
      + "\nThe method handleUnresolvedFeatureCall(ILinkingDiagnosticContext, XAbstractFeatureCall, String) from the type UnresolvedFeatureCallTypeAwareMessageProvider refers to the missing type DiagnosticMessage"
      + "\ngetLinkText cannot be resolved"
      + "\ngetNode cannot be resolved"
      + "\ngetText cannot be resolved"
      + "\n=== cannot be resolved"
      + "\ngetContext cannot be resolved"
      + "\nisOperation cannot be resolved"
      + "\n! cannot be resolved"
      + "\nreference cannot be resolved"
      + "\ngetEReferenceType cannot be resolved");
  }
  
  private /* DiagnosticMessage */Object handleUnresolvedFeatureCall(final /* ILinkingDiagnosticContext */Object context, final XAbstractFeatureCall featureCall, final String linkText) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field syntacticReceiver is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field syntacticReceiver is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field syntacticArguments is undefined for the type XAbstractFeatureCall"
      + "\nThe method or field any is undefined"
      + "\nThe method or field humanReadableName is undefined"
      + "\n! cannot be resolved."
      + "\n!== cannot be resolved."
      + "\n+= cannot be resolved."
      + "\n&& cannot be resolved."
      + "\n> cannot be resolved."
      + "\nDiagnosticMessage cannot be resolved."
      + "\nThe method or field ERROR is undefined"
      + "\nThe method or field LINKING_DIAGNOSTIC is undefined"
      + "\nDiagnosticMessage cannot be resolved."
      + "\nThe method or field ERROR is undefined"
      + "\nThe method or field LINKING_DIAGNOSTIC is undefined"
      + "\nresolvedTypes cannot be resolved"
      + "\n!== cannot be resolved"
      + "\ngetActualType cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ngetActualType cannot be resolved"
      + "\njoin cannot be resolved"
      + "\n=== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n&& cannot be resolved");
  }
  
  protected boolean isStaticMemberCallTarget(final /* EObject */Object contextObject) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\nThe method or field XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET is undefined"
      + "\neContainingFeature cannot be resolved"
      + "\n=== cannot be resolved"
      + "\neContainer cannot be resolved");
  }
  
  /**
   * @Nullable
   */
  protected String getTypeName(final /* EClass */Object c, final /* EStructuralFeature */Object referingFeature) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field XANNOTATION__ANNOTATION_TYPE is undefined for the type Class<Literals>"
      + "\nThe method or field TypesPackage is undefined"
      + "\nThe method or field EcoreUtil2 is undefined"
      + "\nThe method or field TypesPackage is undefined"
      + "\nThe method or field TypesPackage is undefined"
      + "\n=== cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_ENUMERATION_TYPE cannot be resolved"
      + "\nisAssignableFrom cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_TYPE cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nJVM_OPERATION cannot be resolved");
  }
}
