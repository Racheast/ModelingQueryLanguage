/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Functional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Long_FunctionalType#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getLong_FunctionalType()
 * @model abstract="true"
 * @generated
 */
public interface Long_FunctionalType extends Long_Type, FunctionalType {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Long_FunctionalOperator)
	 * @see qmm.QmmPackage#getLong_FunctionalType_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Long_FunctionalOperator getOperator();

	/**
	 * Sets the value of the '{@link qmm.Long_FunctionalType#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Long_FunctionalOperator value);

} // Long_FunctionalType
