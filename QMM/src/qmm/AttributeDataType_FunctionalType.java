/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Data Type Functional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.AttributeDataType_FunctionalType#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getAttributeDataType_FunctionalType()
 * @model abstract="true"
 * @generated
 */
public interface AttributeDataType_FunctionalType extends AttributeDataType_Type, FunctionalType {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(AttributeDataType_FunctionalOperator)
	 * @see qmm.QmmPackage#getAttributeDataType_FunctionalType_Operator()
	 * @model containment="true"
	 * @generated
	 */
	AttributeDataType_FunctionalOperator getOperator();

	/**
	 * Sets the value of the '{@link qmm.AttributeDataType_FunctionalType#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AttributeDataType_FunctionalOperator value);

} // AttributeDataType_FunctionalType
