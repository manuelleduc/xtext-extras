/*
 * generated by Xtext
 */
package org.eclipse.xtext.crossrefs.lazy;

import org.eclipse.xtext.crossref.IScopeProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class LazyLinkingTestLanguageRuntimeModule extends org.eclipse.xtext.crossrefs.lazy.AbstractLazyLinkingTestLanguageRuntimeModule {
	
	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return LazyLinkingTestLanguageScopeProvider.class;
	}
}
