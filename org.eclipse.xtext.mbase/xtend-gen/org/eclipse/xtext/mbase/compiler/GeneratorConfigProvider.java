/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.compiler;

import java.util.Map;
import org.eclipse.xtext.mbase.compiler.GeneratorConfig;
import org.eclipse.xtext.mbase.compiler.IGeneratorConfigProvider;

/**
 * @author Holger Schill - Initial contribution and API
 * @author Moritz Eysholdt - introduced adapter
 */
@SuppressWarnings("all")
public class GeneratorConfigProvider implements IGeneratorConfigProvider {
  /* @EmfAdaptable
   */public static class GeneratorConfigAdapter {
    /* @Accessors
     */private final Map<String, GeneratorConfig> language2GeneratorConfig /* Skipped initializer because of errors */;
  }
  
  /* @Inject
  @Named(/* name is null */./* name is null */)
   */private String languageId;
  
  public GeneratorConfig install(final /* ResourceSet */Object resourceSet, final GeneratorConfig config) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findInEmfObject(ResourceSet) is undefined for the type Class<GeneratorConfigAdapter>"
      + "\n=> cannot be resolved."
      + "\nThe method attachToEmfObject(ResourceSet) is undefined"
      + "\n?: cannot be resolved"
      + "\nlanguage2GeneratorConfig cannot be resolved"
      + "\nput cannot be resolved");
  }
  
  @Override
  public GeneratorConfig get(final /* EObject */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findInEmfObject(Object) is undefined for the type Class<GeneratorConfigAdapter>"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nlanguage2GeneratorConfig cannot be resolved"
      + "\ncontainsKey cannot be resolved"
      + "\nlanguage2GeneratorConfig cannot be resolved"
      + "\nget cannot be resolved");
  }
}
