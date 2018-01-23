/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.ide.types;

import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import org.eclipse.xtext.mbase.ide.types.ITypeDescriptor;

@SuppressWarnings("all")
public class ClasspathScanner {
  private final static Object PROPERTY_CLASSPATH_SPLITTER /* Skipped initializer because of errors */;
  
  private final static Object MANIFEST_CLASSPATH_SPLITTER /* Skipped initializer because of errors */;
  
  private /* Cache<Pair<ClassLoader, Collection<String>>, Iterable<ITypeDescriptor>> */Object classLoaderDescriptors;
  
  private /* Cache<Pair<URI, Collection<String>>, Iterable<ITypeDescriptor>> */Object uriDescriptors;
  
  protected /* Cache<Pair<ClassLoader, Collection<String>>, Iterable<ITypeDescriptor>> */Object createClassLoaderCache() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field CacheBuilder is undefined"
      + "\nnewBuilder cannot be resolved"
      + "\ninitialCapacity cannot be resolved"
      + "\nconcurrencyLevel cannot be resolved"
      + "\nmaximumSize cannot be resolved"
      + "\nexpireAfterAccess cannot be resolved"
      + "\nbuild cannot be resolved");
  }
  
  protected /* Cache<Pair<URI, Collection<String>>, Iterable<ITypeDescriptor>> */Object createUriCache() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field CacheBuilder is undefined"
      + "\nnewBuilder cannot be resolved"
      + "\ninitialCapacity cannot be resolved"
      + "\nconcurrencyLevel cannot be resolved"
      + "\nmaximumSize cannot be resolved"
      + "\nexpireAfterAccess cannot be resolved"
      + "\nbuild cannot be resolved");
  }
  
  public Iterable<ITypeDescriptor> getDescriptors(final ClassLoader classLoader, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n-> cannot be resolved."
      + "\nThe field ClasspathScanner.classLoaderDescriptors refers to the missing type Cache"
      + "\nThe field ClasspathScanner.classLoaderDescriptors refers to the missing type Cache"
      + "\nThe method createClassLoaderCache() from the type ClasspathScanner refers to the missing type Cache"
      + "\nThe field ClasspathScanner.classLoaderDescriptors refers to the missing type Cache"
      + "\nThe method loadDescriptors(ClassLoader, Collection<String>) from the type ClasspathScanner refers to the missing type Object"
      + "\n=== cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  public Iterable<ITypeDescriptor> getDescriptors(final URI uri, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n-> cannot be resolved."
      + "\nThe field ClasspathScanner.uriDescriptors refers to the missing type Cache"
      + "\nThe field ClasspathScanner.uriDescriptors refers to the missing type Cache"
      + "\nThe method createUriCache() from the type ClasspathScanner refers to the missing type Cache"
      + "\nThe field ClasspathScanner.uriDescriptors refers to the missing type Cache"
      + "\nThe method loadDescriptors(URI, Collection<String>) from the type ClasspathScanner refers to the missing type Object"
      + "\n=== cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  public Iterable<ITypeDescriptor> getBootClasspathDescriptors(final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\nThe field ClasspathScanner.PROPERTY_CLASSPATH_SPLITTER refers to the missing type Object"
      + "\nsplit cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved");
  }
  
  protected Object loadDescriptors(final ClassLoader classLoader, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\n! cannot be resolved."
      + "\nThe method or field flatten is undefined for the type HashMap<URI, Object>"
      + "\nThe field map is not visible"
      + "\nType mismatch: cannot convert implicit first argument from ClasspathScanner to ClassLoader");
  }
  
  protected Object loadDescriptors(final URI uri, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved."
      + "\nThe method loadJarDescriptors(File, boolean, Collection<String>) from the type ClasspathScanner refers to the missing type Object");
  }
  
  protected void loadDirectoryDescriptors(final File directory, final String packageName, final List<ITypeDescriptor> descriptors, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n!== cannot be resolved."
      + "\n+= cannot be resolved."
      + "\n+ cannot be resolved");
  }
  
  protected Object loadJarDescriptors(final File file, final boolean includeManifestEntries, final Collection<String> packagePrefixes) {
    throw new Error("Unresolved compilation problems:"
      + "\n&& cannot be resolved."
      + "\n!== cannot be resolved."
      + "\n!== cannot be resolved."
      + "\n! cannot be resolved."
      + "\n+= cannot be resolved."
      + "\n! cannot be resolved."
      + "\n! cannot be resolved."
      + "\n!== cannot be resolved."
      + "\n+= cannot be resolved."
      + "\n=== cannot be resolved."
      + "\nThe method or field flatten is undefined for the type List<Iterable<ITypeDescriptor>>"
      + "\n!== cannot be resolved."
      + "\nThe field ClasspathScanner.MANIFEST_CLASSPATH_SPLITTER refers to the missing type Object"
      + "\nsplit cannot be resolved"
      + "\nreplace cannot be resolved"
      + "\n&& cannot be resolved");
  }
}
