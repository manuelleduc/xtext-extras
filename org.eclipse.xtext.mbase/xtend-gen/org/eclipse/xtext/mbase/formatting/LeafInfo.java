package org.eclipse.xtext.mbase.formatting;

import org.eclipse.xtext.mbase.formatting.HiddenLeafs;

@Deprecated/* 
@Data */
@SuppressWarnings("all")
public abstract class LeafInfo {
  private HiddenLeafs container;
  
  private /* ILeafNode */Object node;
  
  private int newLines;
}
