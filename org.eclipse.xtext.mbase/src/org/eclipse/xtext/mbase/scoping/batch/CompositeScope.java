/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.scoping.batch;

import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.mbase.XAbstractFeatureCall;

import com.google.common.collect.Lists;

/**
 * A composite scope returns description from multiple other scopes without applying shadowing semantics to then.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class CompositeScope extends AbstractSessionBasedScope {

	private final List<AbstractSessionBasedScope> delegates;
	
	public CompositeScope(IScope parent, IFeatureScopeSession session, XAbstractFeatureCall featureCall) {
		super(parent, session, featureCall);
		delegates = Lists.newArrayList();
	}
	
	public void addDelegate(AbstractSessionBasedScope delegate) {
		this.delegates.add(delegate);
	}
	
	public boolean hasDelegates() {
		return !delegates.isEmpty();
	}

	@Override
	protected List<IEObjectDescription> getAllLocalElements() {
		List<IEObjectDescription> result = Lists.newArrayList();
		for(AbstractSessionBasedScope delegate: delegates) {
			addToList(delegate.getAllLocalElements(), result);
		}
		return result;
	}

	@Override
	protected List<IEObjectDescription> getLocalElementsByName(QualifiedName name) {
		List<IEObjectDescription> result = Lists.newArrayList();
		for(AbstractSessionBasedScope delegate: delegates) {
			addToList(delegate.getLocalElementsByName(name), result);
		}
		return result;
	}

}
