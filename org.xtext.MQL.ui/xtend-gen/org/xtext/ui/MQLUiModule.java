/**
 * generated by Xtext 2.14.0
 */
package org.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.xtext.ui.AbstractMQLUiModule;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class MQLUiModule extends AbstractMQLUiModule implements com.google.inject.Module {
  public MQLUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
