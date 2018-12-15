/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Mode Enumeration Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.ChangeMode_EnumerationOperator#getArgument <em>Argument</em>}</li>
 *   <li>{@link qmm.ChangeMode_EnumerationOperator#getOr <em>Or</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getChangeMode_EnumerationOperator()
 * @model
 * @generated
 */
public interface ChangeMode_EnumerationOperator extends EnumerationOperator, ChangeMode_Operator {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' attribute.
	 * The literals are from the enumeration {@link qmm.ChangeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' attribute.
	 * @see qmm.ChangeMode
	 * @see #setArgument(ChangeMode)
	 * @see qmm.QmmPackage#getChangeMode_EnumerationOperator_Argument()
	 * @model required="true"
	 * @generated
	 */
	ChangeMode getArgument();

	/**
	 * Sets the value of the '{@link qmm.ChangeMode_EnumerationOperator#getArgument <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' attribute.
	 * @see qmm.ChangeMode
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(ChangeMode value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(ChangeMode_EnumerationOperator)
	 * @see qmm.QmmPackage#getChangeMode_EnumerationOperator_Or()
	 * @model containment="true"
	 * @generated
	 */
	ChangeMode_EnumerationOperator getOr();

	/**
	 * Sets the value of the '{@link qmm.ChangeMode_EnumerationOperator#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(ChangeMode_EnumerationOperator value);

} // ChangeMode_EnumerationOperator
