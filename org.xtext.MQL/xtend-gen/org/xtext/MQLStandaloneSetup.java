/**
 * generated by Xtext 2.14.0
 */
package org.xtext;

import org.xtext.MQLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MQLStandaloneSetup extends MQLStandaloneSetupGenerated {
  public static void doSetup() {
    new MQLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
