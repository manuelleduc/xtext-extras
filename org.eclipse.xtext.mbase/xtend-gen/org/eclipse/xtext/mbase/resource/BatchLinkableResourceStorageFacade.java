/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.mbase.resource;

import java.io.InputStream;
import java.io.OutputStream;
import org.eclipse.xtext.mbase.resource.BatchLinkableResourceStorageLoadable;
import org.eclipse.xtext.mbase.resource.BatchLinkableResourceStorageWritable;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public class BatchLinkableResourceStorageFacade /* implements ResourceStorageFacade  */{
  /* @Inject
   */private /* IProjectConfigProvider */Object projectConfigProvider;
  
  @Override
  public BatchLinkableResourceStorageLoadable createResourceStorageLoadable(final InputStream in) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isStoreNodeModel is undefined"
      + "\nInvalid number of arguments. The constructor BatchLinkableResourceStorageLoadable() is not applicable for the arguments (InputStream,Object)");
  }
  
  @Override
  public BatchLinkableResourceStorageWritable createResourceStorageWritable(final OutputStream out) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isStoreNodeModel is undefined"
      + "\nInvalid number of arguments. The constructor BatchLinkableResourceStorageWritable() is not applicable for the arguments (OutputStream,Object)");
  }
  
  @Override
  protected Object getSourceContainerURI(final /* StorageAwareResource */Object resource) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nThe field BatchLinkableResourceStorageFacade.projectConfigProvider refers to the missing type IProjectConfigProvider"
      + "\nURI cannot be resolved"
      + "\ngetProjectConfig cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nworkspaceConfig cannot be resolved"
      + "\nfindProjectContaining cannot be resolved"
      + "\nfindSourceFolderContaining cannot be resolved"
      + "\n!== cannot be resolved"
      + "\npath cannot be resolved"
      + "\ngetSourceContainerURI cannot be resolved");
  }
}
