/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.contentassist;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.mbase.ide.contentassist.IIdeTypesProposalProvider;
import org.eclipse.xtext.mbase.ide.types.ClasspathScanner;
import org.eclipse.xtext.mbase.ide.types.ITypeDescriptor;
import org.eclipse.xtext.mbase.imports.ImportSectionRegionUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.ReplaceRegion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.objectweb.asm.Opcodes;

@SuppressWarnings("all")
public class ClasspathBasedIdeTypesProposalProvider implements IIdeTypesProposalProvider {
  @Inject
  private ClassLoader classLoader;
  
  @Inject
  private ClasspathScanner classpathScanner;
  
  @Inject
  private IdeContentProposalCreator proposalCreator;
  
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  @Inject
  private ImportSectionRegionUtil importSectionRegionUtil;
  
  @Override
  public void createTypeProposals(final EReference reference, final ContentAssistContext context, final Predicate<ITypeDescriptor> filter, final IIdeContentProposalAcceptor acceptor) {
    ITextRegion importSectionRegion = null;
    importSectionRegion = this.importSectionRegionUtil.computeRegion(context.getResource());
    Iterable<ITypeDescriptor> _typeDescriptors = this.getTypeDescriptors(context);
    for (final ITypeDescriptor typeDesc : _typeDescriptors) {
      {
        boolean _canAcceptMoreProposals = acceptor.canAcceptMoreProposals();
        boolean _not = (!_canAcceptMoreProposals);
        if (_not) {
          return;
        }
        boolean _canPropose = this.canPropose(typeDesc, context, filter);
        if (_canPropose) {
        }
      }
    }
  }
  
  protected Iterable<ITypeDescriptor> getTypeDescriptors(final ContentAssistContext context) {
    final Iterable<ITypeDescriptor> bootClasspath = this.classpathScanner.getBootClasspathDescriptors(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("java")));
    final Iterable<ITypeDescriptor> appClasspath = this.classpathScanner.getDescriptors(this.getClassLoader(context), Collections.<String>emptyList());
    return Iterables.<ITypeDescriptor>concat(bootClasspath, appClasspath);
  }
  
  protected ClassLoader getClassLoader(final ContentAssistContext context) {
    final ResourceSet resourceSet = context.getResource().getResourceSet();
    if ((resourceSet instanceof XtextResourceSet)) {
      final Object ctx = ((XtextResourceSet)resourceSet).getClasspathURIContext();
      if ((ctx != null)) {
        if ((ctx instanceof Class<?>)) {
          return ((Class<?>)ctx).getClassLoader();
        }
        if ((ctx instanceof ClassLoader)) {
          return ((ClassLoader)ctx);
        }
        return ctx.getClass().getClassLoader();
      }
    }
    return this.classLoader;
  }
  
  protected boolean canPropose(final ITypeDescriptor typeDesc, final ContentAssistContext context, final Predicate<ITypeDescriptor> filter) {
    return (this.isVisible(typeDesc, context) && filter.apply(typeDesc));
  }
  
  protected boolean isVisible(final ITypeDescriptor typeDesc, final ContentAssistContext context) {
    return ((typeDesc.getAccessFlags() & Opcodes.ACC_PUBLIC) != 0);
  }
  
  protected ContentAssistEntry createProposal(final EReference reference, final ITypeDescriptor typeDesc, final ContentAssistContext context, final ITextRegion importSectionRegion) {
    ContentAssistEntry _xblockexpression = null;
    {
      final String qualifiedName = this.qualifiedNameConverter.toString(typeDesc.getQualifiedName());
      final String proposal = typeDesc.getSimpleName();
      final Procedure1<ContentAssistEntry> _function = (ContentAssistEntry it) -> {
        it.setDescription(qualifiedName);
        if ((importSectionRegion != null)) {
          this.addImportDeclaration(it, importSectionRegion, typeDesc, qualifiedName, context);
        }
      };
      _xblockexpression = this.proposalCreator.createProposal(proposal, context, _function);
    }
    return _xblockexpression;
  }
  
  protected boolean isImportDeclarationRequired(final ITypeDescriptor typeDesc, final String qualifiedName, final ContentAssistContext context) {
    return (!(typeDesc.getName().startsWith("java.lang") && (typeDesc.getName().lastIndexOf(".") == 9)));
  }
  
  protected boolean addImportDeclaration(final ContentAssistEntry entry, final ITextRegion importSectionRegion, final ITypeDescriptor typeDesc, final String qualifiedName, final ContentAssistContext context) {
    boolean _xblockexpression = false;
    {
      int _offset = importSectionRegion.getOffset();
      int _length = importSectionRegion.getLength();
      final int insertionOffset = (_offset + _length);
      final String declaration = ("\nimport " + qualifiedName);
      ArrayList<ReplaceRegion> _textReplacements = entry.getTextReplacements();
      ReplaceRegion _replaceRegion = new ReplaceRegion(insertionOffset, 0, declaration);
      _xblockexpression = _textReplacements.add(_replaceRegion);
    }
    return _xblockexpression;
  }
}
