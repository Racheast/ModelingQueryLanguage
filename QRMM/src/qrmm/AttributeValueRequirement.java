/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}</li>
 *   <li>{@link qrmm.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}</li>
 *   <li>{@link qrmm.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}</li>
 *   <li>{@link qrmm.AttributeValueRequirement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getAttributeValueRequirement()
 * @model
 * @generated
 */
public interface AttributeValueRequirement extends CAEXBasicObject, SearchableElement {
	/**
	 * Returns the value of the '<em><b>Ordinal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal Scaled Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal Scaled Type</em>' containment reference.
	 * @see #setOrdinalScaledType(OrdinalScaledType)
	 * @see qrmm.QrmmPackage#getAttributeValueRequirement_OrdinalScaledType()
	 * @model containment="true"
	 * @generated
	 */
	OrdinalScaledType getOrdinalScaledType();

	/**
	 * Sets the value of the '{@link qrmm.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal Scaled Type</em>' containment reference.
	 * @see #getOrdinalScaledType()
	 * @generated
	 */
	void setOrdinalScaledType(OrdinalScaledType value);

	/**
	 * Returns the value of the '<em><b>Nominal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Scaled Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Scaled Type</em>' containment reference.
	 * @see #setNominalScaledType(NominalScaledType)
	 * @see qrmm.QrmmPackage#getAttributeValueRequirement_NominalScaledType()
	 * @model containment="true"
	 * @generated
	 */
	NominalScaledType getNominalScaledType();

	/**
	 * Sets the value of the '{@link qrmm.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Scaled Type</em>' containment reference.
	 * @see #getNominalScaledType()
	 * @generated
	 */
	void setNominalScaledType(NominalScaledType value);

	/**
	 * Returns the value of the '<em><b>Unknown Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Type</em>' containment reference.
	 * @see #setUnknownType(UnknownType)
	 * @see qrmm.QrmmPackage#getAttributeValueRequirement_UnknownType()
	 * @model containment="true"
	 * @generated
	 */
	UnknownType getUnknownType();

	/**
	 * Sets the value of the '{@link qrmm.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Type</em>' containment reference.
	 * @see #getUnknownType()
	 * @generated
	 */
	void setUnknownType(UnknownType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qrmm.QrmmPackage#getAttributeValueRequirement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qrmm.AttributeValueRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AttributeValueRequirement
