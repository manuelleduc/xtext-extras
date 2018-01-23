/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.tests.scoping;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@RunWith(Suite.class)
@SuiteClasses({
	ImportWithDotDefaultNormalizerTest.class,
	ImportWithDollarDefaultNormalizerTest.class,
	AbstractNestedTypeAwareImportNormalizerTest.class,
	ImportWithDotNormalizerWithDotTest.class,
	ImportWithDotNormalizerWithDollarTest.class,
	ImportWithDollarNormalizerWithDotTest.class,
	ImportWithDollarNormalizerWithDollarTest.class,
	ImportNormalizerTest.class,
	NestedTypeAwareImportNormalizerTest.class,
	NestedTypeAwareImportNormalizerWithDotSeparatorTest.class,
	NestedTypeAwareImportNormalizerWIthInvalidConfigTest.class,
})
public class ImportNormalizerSuite {}
