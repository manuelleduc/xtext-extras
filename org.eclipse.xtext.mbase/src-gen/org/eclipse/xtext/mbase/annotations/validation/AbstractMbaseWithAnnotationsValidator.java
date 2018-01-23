/*******************************************************************************
 * Copyright (c) 2010-2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.mbase.annotations.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.mbase.validation.MbaseValidator;

public abstract class AbstractMbaseWithAnnotationsValidator extends MbaseValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/mbase/XAnnotations"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/mbase/Mbase"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/common/JavaVMTypes"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/mbase/Xtype"));
		return result;
	}
	
}
