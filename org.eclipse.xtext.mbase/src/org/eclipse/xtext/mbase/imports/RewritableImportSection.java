/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.imports;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.isEmpty;
import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Maps.*;
import static com.google.common.collect.Sets.*;
import static java.util.Collections.*;
import static org.eclipse.xtext.util.Strings.isEmpty;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.formatting.IWhitespaceInformationProvider;
import org.eclipse.xtext.mbase.conversion.MbaseQualifiedNameValueConverter;
import org.eclipse.xtext.mbase.typesystem.util.Maps2;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.ReplaceRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xtype.XtypeFactory;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Model of an import section that can be changed.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
public class RewritableImportSection {

	public static class Factory {
		
		public static final String REWRITABLEIMPORTSECTION_ENABLEMENT = "RewritableImportSection_Enablement";
		
		@Inject(optional = true)
		@Named(REWRITABLEIMPORTSECTION_ENABLEMENT)
		private boolean enabled = true;
		
		@Inject
		private IImportsConfiguration importsConfiguration;

		@Inject
		private IWhitespaceInformationProvider whitespaceInformationProvider;

		@Inject
		private ImportSectionRegionUtil regionUtil;

		@Inject
		private MbaseQualifiedNameValueConverter nameValueConverter;

		public RewritableImportSection parse(XtextResource resource) {
			RewritableImportSection rewritableImportSection = new RewritableImportSection(resource, importsConfiguration,
					getLineSeparator(resource), regionUtil, nameValueConverter);
			rewritableImportSection.setEnabled(enabled);
			return rewritableImportSection;
		}

		public RewritableImportSection createNewEmpty(XtextResource resource) {
			RewritableImportSection rewritableImportSection = new RewritableImportSection(resource, importsConfiguration, getLineSeparator(resource), regionUtil, nameValueConverter);
			rewritableImportSection.setSort(true);
			rewritableImportSection.setEnabled(enabled);
			return rewritableImportSection;
		}

		protected String getLineSeparator(XtextResource resource) {
			return whitespaceInformationProvider.getLineSeparatorInformation(resource.getURI()).getLineSeparator();
		}
	}

	private Map<String, List<JvmDeclaredType>> plainImports = newHashMap();

	private Map<JvmDeclaredType, Set<String>> staticImports = newHashMap();

	private Map<JvmDeclaredType, Set<String>> staticExtensionImports = newHashMap();

	private String lineSeparator;

	private XtextResource resource;

	private ImportSectionRegionUtil regionUtil;

	private boolean isSort;

	private Set<String> implicitlyImportedPackages;

	private IValueConverter<String> nameValueConverter;

	private ITextRegion importRegion;

	private IImportsConfiguration importsConfiguration;

	private boolean enabled = true;

	public RewritableImportSection(XtextResource resource, IImportsConfiguration importsConfiguration, 
			String lineSeparator, ImportSectionRegionUtil regionUtil, IValueConverter<String> nameConverter) {
		this.importsConfiguration = importsConfiguration;
		this.resource = resource;
		this.lineSeparator = lineSeparator;
		this.regionUtil = regionUtil;
		this.nameValueConverter = nameConverter;
		this.implicitlyImportedPackages = importsConfiguration.getImplicitlyImportedPackages(resource);
		this.importRegion = regionUtil.computeRegion(resource);
	}

	public void setSort(boolean isSort) {
		this.isSort = isSort;
	}

	public boolean isSort() {
		return isSort;
	}

	public boolean addImport(JvmDeclaredType type) {
		if (plainImports.containsKey(type.getSimpleName()) || !needsImport(type))
			return false;
		Maps2.putIntoListMap(type.getSimpleName(), type, plainImports);
		return true;
	}

	public boolean addImport(String fqn) {
		return false;
	}


	protected boolean needsImport(final String fqn) {
		for (String string : implicitlyImportedPackages) {
			if (fqn.startsWith(string)) {
				return fqn.substring(string.length() + 1).lastIndexOf('.') > 0;
			}
		}
		return true;
	}

	public boolean needsImport(JvmDeclaredType type) {
		if (type.getDeclaringType() != null)
			return true;
		String packageName = type.getPackageName();
		return packageName != null && !(implicitlyImportedPackages.contains(packageName));
	}

	public boolean removeImport(JvmDeclaredType type) {


		for (Map.Entry<String, List<JvmDeclaredType>> entry : plainImports.entrySet()) {
			List<JvmDeclaredType> values = entry.getValue();
			if (values.size() == 1) {
				if (values.get(0) == type) {
					plainImports.remove(type.getSimpleName());
					return true;
				}
			}
			Iterator<JvmDeclaredType> iterator = values.iterator();
			while (iterator.hasNext()) {
				JvmDeclaredType value = iterator.next();
				if (value == type) {
					iterator.remove();
					return true;
				}
			}
		}
		return false;
	}

	public boolean hasImportedType(JvmDeclaredType type) {
		List<JvmDeclaredType> importedTypes = getImportedTypes(type.getSimpleName());
		if (importedTypes == null) {
			return false;
		}
		for (JvmDeclaredType importedType : importedTypes) {
			if (importedType == type) {
				return true;
			}
		}
		return false;
	}

	public List<JvmDeclaredType> getImportedTypes(String simpleName) {
		return plainImports.get(simpleName);
	}

	public boolean addStaticImport(JvmMember member) {
		if (member instanceof JvmDeclaredType) {
			return addStaticImport((JvmDeclaredType) member, null);
		} else {
			return addStaticImport(member.getDeclaringType(), member.getSimpleName());
		}
	}

	public boolean addStaticImport(JvmDeclaredType type, String memberName) {
		if (hasStaticImport(staticImports, type, memberName)) {
			return false;
		}
		Maps2.putIntoSetMap(type, memberName, staticImports);
		return true;
	}

	/**
	 * @param typeFqn
	 *            The fully qualified name of the type to import. E.g. <code>java.util.List</code>. May not be
	 *            <code>null</code>.
	 * @param member
	 *            member name to import. May not be <code>null</code>. For wildcard use <code>*</code>
	 * 
	 */
	public boolean addStaticImport(final String typeFqn, final String member) {
		if (typeFqn == null || member == null) {
			throw new IllegalArgumentException("Type name " + typeFqn + ". Member name: " + member);
		}
		if (hasStaticImport(typeFqn, member, false)) {
			return false;
		}
		return false;
	}

	/**
	 * @param typeFqn
	 *            The fully qualified name of the type to import. E.g. <code>java.util.List</code>. May not be
	 *            <code>null</code>.
	 * @param member
	 *            member name to import. May not be <code>null</code>. For wildcard use <code>*</code>
	 * 
	 */
	public boolean addStaticExtensionImport(final String typeFqn, final String member) {
		if (typeFqn == null || member == null) {
			throw new IllegalArgumentException("Type name " + typeFqn + ". Member name: " + member);
		}
		if (hasStaticImport(typeFqn, member, true)) {
			return false;
		}
		return false;
	}

	public boolean removeStaticImport(JvmDeclaredType type, String memberName) {
		return removeStaticImport(staticImports, type, memberName, true, false);
	}

	public boolean addStaticExtensionImport(JvmMember member) {
		if (member instanceof JvmDeclaredType) {
			return addStaticExtensionImport((JvmDeclaredType) member, null);
		} else {
			return addStaticExtensionImport(member.getDeclaringType(), member.getSimpleName());
		}
	}

	public boolean addStaticExtensionImport(JvmDeclaredType type, String memberName) {
		if (hasStaticImport(staticExtensionImports, type, memberName)) {
			return false;
		}
		Maps2.putIntoSetMap(type, memberName, staticExtensionImports);
		return true;
	}

	public boolean removeStaticExtensionImport(JvmDeclaredType type, String memberName) {
		return removeStaticImport(staticExtensionImports, type, memberName, true, true);
	}

	protected boolean removeStaticImport(Map<JvmDeclaredType, Set<String>> staticImports, JvmDeclaredType type, String memberName, boolean isStatic,
			boolean isExtension) {

		Set<String> members = staticImports.get(type);
		return members != null && members.remove(memberName);
	}


	public List<ReplaceRegion> rewrite() {
		removeObsoleteStaticImports();
		final List<ReplaceRegion> replaceRegions = newArrayList();
		if (isSort) {
			importRegion = regionUtil.addLeadingWhitespace(importRegion, resource);
			importRegion = regionUtil.addTrailingWhitespace(importRegion, resource);
			return newArrayList();
		} else {
			addSectionToAppend(new IAcceptor<ReplaceRegion>() {
				@Override
				public void accept(ReplaceRegion t) {
					replaceRegions.add(t);
				}
			});
		}
		return replaceRegions;
	}

	private void removeObsoleteStaticImports() {
		for (Entry<JvmDeclaredType, Set<String>> staticExtensionImport : staticExtensionImports.entrySet()) {
			JvmDeclaredType type = staticExtensionImport.getKey();
			Set<String> memberNames = staticImports.get(type);
			if (memberNames != null) {
				for (String memberName : staticExtensionImport.getValue()) {
					if (memberNames.contains(memberName)) {
						removeStaticImport(type, memberName);
					}
				}
			}
		}
	}

	protected void addSectionToAppend(IAcceptor<ReplaceRegion> acceptor) {
		StringBuilder importDeclarationsToAppend = getImportDeclarationsToAppend();
		if (importDeclarationsToAppend.length() == 0)
			return;
		importRegion = regionUtil.addLeadingWhitespace(importRegion, resource);
		importRegion = regionUtil.addTrailingSingleWhitespace(importRegion, lineSeparator, resource);
		int insertOffset = importRegion.getOffset() + importRegion.getLength();
		if (insertOffset != 0)
			importDeclarationsToAppend.insert(0, lineSeparator);
		importDeclarationsToAppend.append(lineSeparator);
		int insertLength = -importRegion.getLength();
		insertLength += regionUtil.addTrailingWhitespace(importRegion, resource).getLength();
		ReplaceRegion appendDeclarations = new ReplaceRegion(new TextRegion(insertOffset, insertLength), importDeclarationsToAppend.toString());
		acceptor.accept(appendDeclarations);
	}

	protected StringBuilder getImportDeclarationsToAppend() {
		StringBuilder builder = new StringBuilder();
		return builder;
	}


	/**
	 * We cannot rely on JvmType#getIdentifier as it is cached and does not pick up changed simpleNames, e.g. in rename
	 * refactoring.
	 */
	protected String serializeType(JvmDeclaredType type) {
		return type.getQualifiedName('.');
	}


	protected boolean needsPreceedingBlankLine() {
		return regionUtil.addLeadingWhitespace(importRegion, resource).getOffset() != 0;
	}

	protected boolean appendSubsection(StringBuilder builder,  boolean needsNewline) {
		return needsNewline;
	}

	public boolean hasStaticImport(JvmDeclaredType declaringType, String memberName, boolean extension) {
		if (extension) {
			return hasStaticImport(staticExtensionImports, declaringType, memberName);
		}
		return hasStaticImport(staticImports, declaringType, memberName);
	}

	private boolean hasStaticImport(Map<JvmDeclaredType, Set<String>> imports, JvmDeclaredType declaringType, String memberName) {
		Set<String> members = imports.get(declaringType);
		return members != null && members.contains(memberName);
	}

	public boolean hasStaticImport(String memberName, boolean extension) {
		if (extension) {
			return hasStaticImport(staticExtensionImports, memberName);
		}
		return hasStaticImport(staticImports, memberName);
	}

	private boolean hasStaticImport(Map<JvmDeclaredType, Set<String>> imports, String memberName) {
		for (Entry<JvmDeclaredType, Set<String>> entry : imports.entrySet()) {
			Set<String> value = entry.getValue();
			if (value != null && value.contains(memberName)) {
				return true;
			}
		}
		return false;
	}

	private boolean hasStaticImport(String typeName, String memberName, boolean extension) {
		for (String string : implicitlyImportedPackages) {
			if (typeName.startsWith(string)) {
				return typeName.substring(string.length()).lastIndexOf('.') == 0;
			}
		}
		Map<JvmDeclaredType, Set<String>> imports = staticImports;
		if (extension) {
			imports = staticExtensionImports;
		}
		for (JvmDeclaredType type : imports.keySet()) {
			if (typeName.equals(type.getIdentifier())) {
				Set<String> members = imports.get(type);
				return members != null && ((members.contains(memberName) || members.contains(null)));
			}
		}
		return false;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
