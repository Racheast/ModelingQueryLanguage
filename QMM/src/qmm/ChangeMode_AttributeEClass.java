/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Mode Attribute EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.ChangeMode_AttributeEClass#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getChangeMode_AttributeEClass()
 * @model abstract="true"
 * @generated
 */
public interface ChangeMode_AttributeEClass extends EnumerationAttributeEClass {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(ChangeMode_EnumerationOperator)
	 * @see qmm.QmmPackage#getChangeMode_AttributeEClass_Operator()
	 * @model containment="true"
	 * @generated
	 */
	ChangeMode_EnumerationOperator getOperator();

	/**
	 * Sets the value of the '{@link qmm.ChangeMode_AttributeEClass#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ChangeMode_EnumerationOperator value);

} // ChangeMode_AttributeEClass
