/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.contentassist;

import org.eclipse.xtext.mbase.ide.types.ITypeDescriptor;

@SuppressWarnings("all")
public interface IIdeTypesProposalProvider {
  public abstract void createTypeProposals(final /* EReference */Object reference, final /* ContentAssistContext */Object context, final /* Predicate<ITypeDescriptor> */Object filter, final /* IIdeContentProposalAcceptor */Object acceptor);
}
