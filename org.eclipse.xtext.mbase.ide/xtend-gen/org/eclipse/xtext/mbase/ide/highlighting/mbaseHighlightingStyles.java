/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.highlighting;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Christian Schneider
 */
@SuppressWarnings("all")
public interface mbaseHighlightingStyles /* extends HighlightingStyles  */{
  public final static String INTERFACE = "mbase.interface";
  
  public final static String ENUM = "mbase.enum";
  
  public final static String CLASS = "mbase.class";
  
  public final static String ABSTRACT_CLASS = "mbase.abstract.class";
  
  public final static String ANNOTATION = "mbase.annotation";
  
  public final static String FIELD = "mbase.field";
  
  public final static String STATIC_FIELD = "mbase.static.field";
  
  public final static String STATIC_FINAL_FIELD = "mbase.static.final.field";
  
  public final static String METHOD = "mbase.method";
  
  public final static String STATIC_METHOD_INVOCATION = "mbase.static.method.invocation";
  
  public final static String ABSTRACT_METHOD_INVOCATION = "mbase.abstract.method.invocation";
  
  public final static String EXTENSION_METHOD_INVOCATION = "mbase.extension.method.invacation";
  
  public final static String DEPRECATED_MEMBERS = "mbase.deprecated.members";
  
  public final static String LOCAL_VARIABLE = "mbase.local.variable";
  
  public final static String LOCAL_VARIABLE_DECLARATION = "mbase.local.variable.declaration";
  
  public final static String LOCAL_FINAL_VARIABLE = "mbase.local.final.variable";
  
  public final static String LOCAL_FINAL_VARIABLE_DECLARATION = "mbase.local.final.variable.declaration";
  
  public final static String PARAMETER_VARIABLE = "mbase.parameter.variable";
  
  public final static String TYPE_VARIABLE = "mbase.type.variable";
  
  public final static String TYPE_ARGUMENT = "mbase.type.argument";
}
