/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getSystemUnitClassLib()
 * @model
 * @generated
 */
public interface SystemUnitClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.SystemUnitClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getSystemUnitClassLib_SystemUnitClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClass> getSystemUnitClass();

} // SystemUnitClassLib
