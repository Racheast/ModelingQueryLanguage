/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getInterfaceClassLib()
 * @model
 * @generated
 */
public interface InterfaceClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getInterfaceClassLib_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getInterfaceClass();

} // InterfaceClassLib
