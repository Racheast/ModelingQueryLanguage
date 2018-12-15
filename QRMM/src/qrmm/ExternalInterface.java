/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.ExternalInterface#getExternalInterface <em>External Interface</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getExternalInterface()
 * @model
 * @generated
 */
public interface ExternalInterface extends InterfaceClass {
	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getExternalInterface_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

} // ExternalInterface
