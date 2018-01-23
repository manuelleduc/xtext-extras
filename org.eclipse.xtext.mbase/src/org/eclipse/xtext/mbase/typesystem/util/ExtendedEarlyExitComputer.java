/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.typesystem.util;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.mbase.XAbstractWhileExpression;
import org.eclipse.xtext.mbase.XBasicForLoopExpression;
import org.eclipse.xtext.mbase.XBlockExpression;
import org.eclipse.xtext.mbase.XCasePart;
import org.eclipse.xtext.mbase.XCatchClause;
import org.eclipse.xtext.mbase.XExpression;
import org.eclipse.xtext.mbase.XForLoopExpression;
import org.eclipse.xtext.mbase.XIfExpression;
import org.eclipse.xtext.mbase.XReturnExpression;
import org.eclipse.xtext.mbase.XSwitchExpression;
import org.eclipse.xtext.mbase.XSynchronizedExpression;
import org.eclipse.xtext.mbase.XThrowExpression;
import org.eclipse.xtext.mbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.mbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.mbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.mbase.typesystem.references.LightweightTypeReference;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class ExtendedEarlyExitComputer {
	
	// TODO discuss / improve
	/**
	 * Returns <code>true</code> for expressions that seem to be early exit expressions, e.g.
	 * <pre>
	 *   while(condition) {
	 *     if (anotherCondition)
	 *       return value
	 *     changeResultOfFirstCondition
	 *   }
	 * </pre>
	 */
	public boolean isIntentionalEarlyExit(/* @Nullable */ XExpression expression) {
		if (expression == null) {
			return true;
		}
		if (expression instanceof XBlockExpression) {
			XBlockExpression block = (XBlockExpression) expression;
			List<XExpression> children = block.getExpressions();
			for(XExpression child: children) {
				if (isIntentionalEarlyExit(child)) {
					return true;
				}
			}
		} else if (expression instanceof XIfExpression) {
			return isIntentionalEarlyExit(((XIfExpression) expression).getThen()) 
					|| isIntentionalEarlyExit(((XIfExpression) expression).getElse());
		} else if (expression instanceof XSwitchExpression) {
			XSwitchExpression switchExpression = (XSwitchExpression) expression;
			for(XCasePart caseExpression: switchExpression.getCases()) {
				if (isIntentionalEarlyExit(caseExpression.getThen())) {
					return true;
				}
			}
			if (isIntentionalEarlyExit(switchExpression.getDefault())) {
				return true;
			}
		} else if (expression instanceof XTryCatchFinallyExpression) {
			XTryCatchFinallyExpression tryCatchFinally = (XTryCatchFinallyExpression) expression;
			if (isIntentionalEarlyExit(tryCatchFinally.getExpression())) {
				for(XCatchClause catchClause: tryCatchFinally.getCatchClauses()) {
					if (!isIntentionalEarlyExit(catchClause.getExpression()))
						return false;
				}
				return true;
			}
			return false;
		} else if (expression instanceof XAbstractWhileExpression) {
			return isIntentionalEarlyExit(((XAbstractWhileExpression) expression).getBody());
		} else if (expression instanceof XForLoopExpression) {
			return isIntentionalEarlyExit(((XForLoopExpression) expression).getEachExpression());
		} else if (expression instanceof XBasicForLoopExpression) {
			return isIntentionalEarlyExit(((XBasicForLoopExpression) expression).getEachExpression());
		} else if (expression instanceof XSynchronizedExpression) {
			return isIntentionalEarlyExit(((XSynchronizedExpression) expression).getExpression());
		}
		return expression instanceof XReturnExpression || expression instanceof XThrowExpression;
	}

	public boolean isDefiniteEarlyExit(XExpression expression) {
		// TODO further improvements
		if (expression instanceof XIfExpression) {
			XIfExpression ifExpression = (XIfExpression) expression;
			return isDefiniteEarlyExit(ifExpression.getThen()) && isDefiniteEarlyExit(ifExpression.getElse());
		} else if (expression instanceof XSwitchExpression) {
			XSwitchExpression switchExpression = (XSwitchExpression) expression;
			if (isDefiniteEarlyExit(switchExpression.getDefault())) {
				for(XCasePart caseExpression: switchExpression.getCases()) {
					if (!isDefiniteEarlyExit(caseExpression.getThen())) {
						return false;
					}
				}
				return true;
			}
			return false;
		} else if (expression instanceof XTryCatchFinallyExpression) {
			XTryCatchFinallyExpression tryExpression = (XTryCatchFinallyExpression) expression;
			if (isDefiniteEarlyExit(tryExpression.getFinallyExpression())) {
				return true;
			}
			if (isDefiniteEarlyExit(tryExpression.getExpression())) {
				for(XCatchClause catchClause: tryExpression.getCatchClauses()) {
					if (!isDefiniteEarlyExit(catchClause.getExpression())) {
						return false;
					}
				}
				return true;
			}
			return false;
		} else if (expression instanceof XBlockExpression) {
			List<XExpression> expressions = ((XBlockExpression) expression).getExpressions();
			for(int i = expressions.size() - 1; i >= 0; i--) {
				if (isDefiniteEarlyExit(expressions.get(i))) {
					return true;
				}
			}
		} else if (expression instanceof XSynchronizedExpression) {
			return isDefiniteEarlyExit(((XSynchronizedExpression) expression).getExpression());
		}
		return expression instanceof XReturnExpression || expression instanceof XThrowExpression;
	}
	
	protected abstract class AbstractThrownExceptionDelegate implements IThrownExceptionDelegate {
		private Switch<Boolean> collector;

		@Override
		public void collectThrownExceptions(XExpression expression) {
			if (expression != null) {
				TreeIterator<EObject> iterator = EcoreUtil2.eAll(expression);
				while(iterator.hasNext()) {
					if (!collector.doSwitch(iterator.next())) {
						iterator.prune();
					}
				}
			}
		}

		@Override
		public IThrownExceptionDelegate catchExceptions(List<LightweightTypeReference> caughtExceptions) {
			if (caughtExceptions.isEmpty()) {
				return this;
			}
			FilteringThrownExceptionDelegate delegate = new FilteringThrownExceptionDelegate(this, caughtExceptions);
			Switch<Boolean> collector = createThrownExceptionCollector(delegate);
			delegate.collectWith(collector);
			return delegate;
		}

		public void collectWith(Switch<Boolean> collector) {
			this.collector = collector;
		}

	}
	
	protected class ThrownExceptionDelegate extends AbstractThrownExceptionDelegate {

		private final List<LightweightTypeReference> result;
		private final Set<String> seen;
		private final IResolvedTypes types;
		private final ITypeReferenceOwner owner;

		public ThrownExceptionDelegate(List<LightweightTypeReference> result, IResolvedTypes types, ITypeReferenceOwner owner) {
			this.result = result;
			this.types = types;
			this.owner = owner;
			this.seen = Sets.newHashSet();
		}

		@Override
		public LightweightTypeReference toLightweightReference(JvmTypeReference exception) {
			return owner.toLightweightTypeReference(exception);
		}

		@Override
		public void accept(LightweightTypeReference type) {
			if (type != null && seen.add(type.getIdentifier())) {
				result.add(type);
			}
		}

		@Override
		public LightweightTypeReference getActualType(XExpression expr) {
			return types.getActualType(expr);
		}

	}
	
	protected class FilteringThrownExceptionDelegate extends AbstractThrownExceptionDelegate {

		private final IThrownExceptionDelegate delegate;
		private final List<LightweightTypeReference> caughtExceptions;

		protected FilteringThrownExceptionDelegate(IThrownExceptionDelegate delegate, List<LightweightTypeReference> caughtExceptions) {
			this.delegate = delegate;
			this.caughtExceptions = caughtExceptions;
			
		}
		
		@Override
		public LightweightTypeReference toLightweightReference(JvmTypeReference exception) {
			return delegate.toLightweightReference(exception);
		}

		@Override
		public void accept(LightweightTypeReference type) {
			for(LightweightTypeReference caughtException: caughtExceptions) {
				if (type.isSubtypeOf(caughtException.getType())) {
					return;
				}
			}
			delegate.accept(type);
		}

		@Override
		public LightweightTypeReference getActualType(XExpression expr) {
			return delegate.getActualType(expr);
		}

	}

	public List<LightweightTypeReference> getThrownExceptions(XExpression obj, IResolvedTypes types, ITypeReferenceOwner owner) {
		if (obj == null) {
			return Collections.emptyList();
		}
		final List<LightweightTypeReference> result = Lists.newArrayListWithExpectedSize(2);
		ThrownExceptionDelegate delegate = createDelegate(result, types, owner);
		Switch<Boolean> collector = createThrownExceptionCollector(delegate);
		delegate.collectWith(collector);
		delegate.collectThrownExceptions(obj);
		return result;
	}

	protected ThrownExceptionDelegate createDelegate(final List<LightweightTypeReference> result, IResolvedTypes types, ITypeReferenceOwner owner) {
		return new ThrownExceptionDelegate(result, types, owner);
	}
	
	protected Switch<Boolean> createThrownExceptionCollector(IThrownExceptionDelegate delegate) {
		return new ThrownExceptionSwitch(delegate);
	}
	
}
