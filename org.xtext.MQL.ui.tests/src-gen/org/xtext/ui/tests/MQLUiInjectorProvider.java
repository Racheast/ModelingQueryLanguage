/*
 * generated by Xtext 2.14.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.MQL.ui.internal.MQLActivator;

public class MQLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MQLActivator.getInstance().getInjector("org.xtext.MQL");
	}

}