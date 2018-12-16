/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.FunctionalParameter#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getFunctionalParameter()
 * @model abstract="true"
 * @generated
 */
public interface FunctionalParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(FunctionalArgument)
	 * @see qmm.QmmPackage#getFunctionalParameter_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionalArgument getArgument();

	/**
	 * Sets the value of the '{@link qmm.FunctionalParameter#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(FunctionalArgument value);

} // FunctionalParameter
