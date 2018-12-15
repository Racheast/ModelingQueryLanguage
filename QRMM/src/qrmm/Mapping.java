/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link qrmm.Mapping#getInterfaceIDMapping <em>Interface ID Mapping</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.AttributeNameMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name Mapping</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getMapping_AttributeNameMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeNameMapping> getAttributeNameMapping();

	/**
	 * Returns the value of the '<em><b>Interface ID Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.InterfaceIDMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface ID Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface ID Mapping</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getMapping_InterfaceIDMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceIDMapping> getInterfaceIDMapping();

} // Mapping
