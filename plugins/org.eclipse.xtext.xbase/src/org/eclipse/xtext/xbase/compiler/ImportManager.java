/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.compiler;

import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Maps.*;
import static com.google.common.collect.Sets.*;
import static org.eclipse.xtext.util.Strings.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;

import com.google.common.base.Functions;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class ImportManager {

	private Map<String, String> imports = newHashMap();

	private boolean organizeImports;

	private Set<String> thisTypeSimpleNames = Sets.newHashSet();
	private Set<String> thisTypeQualifiedNames = Sets.newHashSet();

	private final char innerTypeSeparator;

	public ImportManager(boolean organizeImports, char innerTypeSeparator) {
		this(organizeImports, null, innerTypeSeparator);
	}

	public ImportManager() {
		this(true, null);
	}

	public ImportManager(boolean organizeImports) {
		this(organizeImports, null);
	}

	public ImportManager(boolean organizeImports, JvmDeclaredType thisType) {
		this(organizeImports, thisType, '.');
	}

	public ImportManager(boolean organizeImports, JvmDeclaredType thisType, char innerTypeSeparator) {
		this.organizeImports = organizeImports;
		this.innerTypeSeparator = innerTypeSeparator;
		if (thisType != null) {
			thisTypeSimpleNames.add(thisType.getSimpleName());
			thisTypeQualifiedNames.add(thisType.getQualifiedName(innerTypeSeparator));
			thisCollidesWithJavaLang |= CodeGenUtil.isJavaLangType(thisType.getSimpleName());
		}
	}

	public CharSequence serialize(JvmType type) {
		StringBuilder sb = new StringBuilder();
		appendType(type, sb);
		return sb;
	}

	public CharSequence serialize(Class<?> type) {
		StringBuilder sb = new StringBuilder();
		appendType(type, sb);
		return sb;
	}

	private Pattern JAVA_LANG_PACK = Pattern.compile("java\\.lang\\.[\\w]+");

	private boolean thisCollidesWithJavaLang;

	public void appendType(final JvmType type, StringBuilder builder) {
		if (type instanceof JvmPrimitiveType || type instanceof JvmVoid || type instanceof JvmTypeParameter) {
			builder.append(type.getQualifiedName(innerTypeSeparator));
		} else if (type instanceof JvmArrayType) {
			appendType(((JvmArrayType) type).getComponentType(), builder);
			builder.append("[]");
		} else {
			final String qualifiedName = type.getQualifiedName(innerTypeSeparator);
			String nameToImport = qualifiedName;
			String shortName = type.getSimpleName();
			if (shouldUseQualifiedNestedName(qualifiedName)) {
				JvmType outerContainer = type;
				while (outerContainer.eContainer() instanceof JvmType) {
					outerContainer = (JvmType) outerContainer.eContainer();
				}
				if (type != outerContainer) {
					nameToImport = outerContainer.getQualifiedName(innerTypeSeparator);
					shortName = outerContainer.getSimpleName()+qualifiedName.substring(nameToImport.length());
				}
			}
			appendType(qualifiedName, shortName, nameToImport, builder);
		}
	}

	protected boolean shouldUseQualifiedNestedName(String identifier) {
		return !identifier.startsWith("org.eclipse.xtext.xbase.lib.");
	}

	public void appendType(final Class<?> type, StringBuilder builder) {
		if (type.isPrimitive()) {
			builder.append(type.getSimpleName());
		} else if (type.isArray()) {
			appendType(type.getComponentType(), builder);
			builder.append("[]");
		} else {
			final String qualifiedName = type.getCanonicalName();
			String nameToImport = qualifiedName;
			String shortName = type.getSimpleName();
			if (shouldUseQualifiedNestedName(qualifiedName)) {
				Class<?> outerContainer = type;
				while (outerContainer.getDeclaringClass() != null) {
					outerContainer = outerContainer.getDeclaringClass();
				}
				if (type != outerContainer) {
					nameToImport = outerContainer.getCanonicalName();
					shortName = outerContainer.getSimpleName()+qualifiedName.substring(nameToImport.length());
				}
			}
			appendType(qualifiedName, shortName, nameToImport, builder);
		}
	}

	protected void appendType(final String qualifiedName, final String shortName, final String namespaceImport, StringBuilder builder) {
		if (allowsSimpleName(namespaceImport, shortName)) {
			builder.append(shortName);
		} else if (needsQualifiedName(namespaceImport, shortName)) {
			builder.append(qualifiedName);
		} else {
			if (imports.containsKey(shortName)) {
				if (namespaceImport.equals(imports.get(shortName))) {
					builder.append(shortName);
				} else {
					builder.append(qualifiedName);
				}
			} else {
				imports.put(shortName, namespaceImport);
				builder.append(shortName);
			}
		}
	}

	protected boolean allowsSimpleName(String qualifiedName, String simpleName) {
		return thisTypeQualifiedNames.contains(qualifiedName) || (!thisCollidesWithJavaLang && JAVA_LANG_PACK.matcher(qualifiedName).matches())
				|| equal(qualifiedName, simpleName);
	}

	protected boolean needsQualifiedName(String qualifiedName, String simpleName) {
		return !organizeImports || (thisTypeSimpleNames.contains(simpleName) && !thisTypeQualifiedNames.contains(qualifiedName))
				|| CodeGenUtil.isJavaLangType(simpleName);
	}

	public boolean addImportFor(JvmType type) {
		final String qualifiedName = type.getQualifiedName(innerTypeSeparator);
		final String simpleName = type.getSimpleName();
		if (!allowsSimpleName(qualifiedName, simpleName) && !needsQualifiedName(qualifiedName, simpleName) && !imports.containsKey(simpleName)) {
			imports.put(simpleName, qualifiedName);
			return true;
		}
		return false;
	}

	public List<String> getImports() {
		ArrayList<String> result = newArrayList(newLinkedHashSet(imports.values()));
		Collections.sort(result);
		return result;
	}
}
