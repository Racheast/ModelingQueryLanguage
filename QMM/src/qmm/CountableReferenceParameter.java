/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countable Reference Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.CountableReferenceParameter#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCountableReferenceParameter()
 * @model
 * @generated
 */
public interface CountableReferenceParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Countable_ReferenceArgument)
	 * @see qmm.QmmPackage#getCountableReferenceParameter_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Countable_ReferenceArgument getArgument();

	/**
	 * Sets the value of the '{@link qmm.CountableReferenceParameter#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Countable_ReferenceArgument value);

} // CountableReferenceParameter
