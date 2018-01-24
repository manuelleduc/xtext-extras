/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.mbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.mbase.validation.IssueCodes;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class UniqueClassNameValidator extends AbstractDeclarativeValidator {
  @Inject
  private ResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  @Inject
  private IJvmModelAssociations associations;
  
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  @Inject
  protected void register(final EValidatorRegistrar registrar, final IGrammarAccess grammarAccess) {
    final AbstractRule entryRule = IterableExtensions.<AbstractRule>head(grammarAccess.getGrammar().getRules());
    if ((entryRule instanceof ParserRule)) {
      registrar.register(((ParserRule)entryRule).getType().getClassifier().getEPackage(), this);
    }
  }
  
  @Check
  public void checkUniqueName(final EObject root) {
    EObject _eContainer = root.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      final Resource resource = root.eResource();
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      boolean _equals = Objects.equal(_head, root);
      if (_equals) {
        final Consumer<JvmDeclaredType> _function = (JvmDeclaredType it) -> {
          this.doCheckUniqueName(it);
        };
        Iterables.<JvmDeclaredType>filter(resource.getContents(), JvmDeclaredType.class).forEach(_function);
      }
    }
  }
  
  protected void doCheckUniqueName(final JvmDeclaredType type) {
    EObject _eContainer = type.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      final QualifiedName name = this.qualifiedNameProvider.getFullyQualifiedName(type);
      if ((name != null)) {
        this.doCheckUniqueName(name, type);
      }
    }
  }
  
  protected boolean doCheckUniqueName(final QualifiedName name, final JvmDeclaredType type) {
    final IResourceDescriptions index = this.resourceDescriptionsProvider.getResourceDescriptions(type.eResource());
    final Iterable<IEObjectDescription> others = index.getExportedObjects(TypesPackage.Literals.JVM_DECLARED_TYPE, name, false);
    return this.checkUniqueInIndex(type, others);
  }
  
  protected boolean checkUniqueInIndex(final JvmDeclaredType type, final Iterable<IEObjectDescription> descriptions) {
    final Function1<IEObjectDescription, URI> _function = (IEObjectDescription it) -> {
      return it.getEObjectURI().trimFragment();
    };
    final Set<URI> resourceURIs = IterableExtensions.<URI>toSet(IterableExtensions.<IEObjectDescription, URI>map(descriptions, _function));
    int _size = resourceURIs.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      final Function1<URI, Boolean> _function_1 = (URI it) -> {
        URI _uRI = type.eResource().getURI();
        return Boolean.valueOf((!Objects.equal(it, _uRI)));
      };
      this.addIssue(type, IterableExtensions.<URI>head(IterableExtensions.<URI>filter(resourceURIs, _function_1)).lastSegment());
      return false;
    }
    return true;
  }
  
  protected void addIssue(final JvmDeclaredType type, final String fileName) {
    final EObject sourceElement = this.associations.getPrimarySourceElement(type);
    if ((sourceElement == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The type ");
      String _simpleName = type.getSimpleName();
      _builder.append(_simpleName);
      _builder.append(" is already defined in ");
      _builder.append(fileName);
      _builder.append(".");
      this.addIssue(_builder.toString(), type, IssueCodes.DUPLICATE_TYPE);
    } else {
      final EStructuralFeature feature = sourceElement.eClass().getEStructuralFeature("name");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("The type ");
      String _simpleName_1 = type.getSimpleName();
      _builder_1.append(_simpleName_1);
      _builder_1.append(" is already defined in ");
      _builder_1.append(fileName);
      _builder_1.append(".");
      this.addIssue(_builder_1.toString(), sourceElement, feature, IssueCodes.DUPLICATE_TYPE);
    }
  }
}
