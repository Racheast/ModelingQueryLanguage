/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Functional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Double_FunctionalType#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getDouble_FunctionalType()
 * @model abstract="true"
 * @generated
 */
public interface Double_FunctionalType extends Double_Type, FunctionalType {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Double_FunctionalOperator)
	 * @see qmm.QmmPackage#getDouble_FunctionalType_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Double_FunctionalOperator getOperator();

	/**
	 * Sets the value of the '{@link qmm.Double_FunctionalType#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Double_FunctionalOperator value);

} // Double_FunctionalType
