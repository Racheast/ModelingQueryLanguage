/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Functional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.String_FunctionalType#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getString_FunctionalType()
 * @model abstract="true"
 * @generated
 */
public interface String_FunctionalType extends String_Type, FunctionalType {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(String_FunctionalOperator)
	 * @see qmm.QmmPackage#getString_FunctionalType_Operator()
	 * @model containment="true"
	 * @generated
	 */
	String_FunctionalOperator getOperator();

	/**
	 * Sets the value of the '{@link qmm.String_FunctionalType#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String_FunctionalOperator value);

} // String_FunctionalType
