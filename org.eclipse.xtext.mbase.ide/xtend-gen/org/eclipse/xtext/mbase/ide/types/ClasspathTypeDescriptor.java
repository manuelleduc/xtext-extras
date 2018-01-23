/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.types;

import java.io.File;
import java.util.Collection;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import org.eclipse.xtext.mbase.ide.types.ITypeDescriptor;

/* @Data */@SuppressWarnings("all")
public class ClasspathTypeDescriptor implements ITypeDescriptor {
  private final static Object NESTED_CLASS_SPLITTER /* Skipped initializer because of errors */;
  
  private final static Object PACKAGE_AND_NESTED_CLASS_SPLITTER /* Skipped initializer because of errors */;
  
  private final static Pattern ANONYMOUS_CLASS_PATTERN = Pattern.compile("\\d+");
  
  private String name;
  
  private int accessFlags;
  
  @Override
  public String getSimpleName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getQualifiedName() from the type ClasspathTypeDescriptor refers to the missing type QualifiedName"
      + "\nlastSegment cannot be resolved");
  }
  
  @Override
  public QualifiedName getQualifiedName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field QualifiedName is undefined"
      + "\nThe field ClasspathTypeDescriptor.PACKAGE_AND_NESTED_CLASS_SPLITTER refers to the missing type Object"
      + "\ncreate cannot be resolved"
      + "\nsplit cannot be resolved");
  }
  
  public static ClasspathTypeDescriptor forFile(final File file, final String packageName, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved."
      + "\nThe method exists(Object) is undefined for the type Collection<String>"
      + "\n- cannot be resolved."
      + "\n+ cannot be resolved."
      + "\nClassReader cannot be resolved."
      + "\n!== cannot be resolved."
      + "\nInvalid number of arguments. The constructor ClasspathTypeDescriptor() is not applicable for the arguments (String,Object)"
      + "\nThe field ClasspathTypeDescriptor.NESTED_CLASS_SPLITTER refers to the missing type Object"
      + "\n&& cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\n+ cannot be resolved"
      + "\naccess cannot be resolved");
  }
  
  public static ClasspathTypeDescriptor forJarEntry(final JarEntry jarEntry, final JarFile jarFile, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n- cannot be resolved."
      + "\n! cannot be resolved."
      + "\nThe method exists(Object) is undefined for the type Collection<String>"
      + "\n+ cannot be resolved."
      + "\nClassReader cannot be resolved."
      + "\n!== cannot be resolved."
      + "\nInvalid number of arguments. The constructor ClasspathTypeDescriptor() is not applicable for the arguments (String,Object)"
      + "\nThe field ClasspathTypeDescriptor.NESTED_CLASS_SPLITTER refers to the missing type Object"
      + "\n&& cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\naccess cannot be resolved");
  }
}
