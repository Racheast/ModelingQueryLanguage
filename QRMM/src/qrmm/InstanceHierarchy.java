/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.InstanceHierarchy#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getInstanceHierarchy()
 * @model
 * @generated
 */
public interface InstanceHierarchy extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.InternalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Element</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getInstanceHierarchy_InternalElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalElement> getInternalElement();

} // InstanceHierarchy
