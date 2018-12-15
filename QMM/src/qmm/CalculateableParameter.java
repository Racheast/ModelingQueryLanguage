/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculateable Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.CalculateableParameter#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCalculateableParameter()
 * @model abstract="true"
 * @generated
 */
public interface CalculateableParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Calculateable_Argument)
	 * @see qmm.QmmPackage#getCalculateableParameter_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Calculateable_Argument getArgument();

	/**
	 * Sets the value of the '{@link qmm.CalculateableParameter#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Calculateable_Argument value);

} // CalculateableParameter
