/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copyright</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.Copyright#getValue <em>Value</em>}</li>
 *   <li>{@link qrmm.Copyright#getChangeMode <em>Change Mode</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getCopyright()
 * @model
 * @generated
 */
public interface Copyright extends SearchableElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qrmm.QrmmPackage#getCopyright_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qrmm.Copyright#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Change Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link qrmm.ChangeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Mode</em>' attribute.
	 * @see qrmm.ChangeMode
	 * @see #setChangeMode(ChangeMode)
	 * @see qrmm.QrmmPackage#getCopyright_ChangeMode()
	 * @model
	 * @generated
	 */
	ChangeMode getChangeMode();

	/**
	 * Sets the value of the '{@link qrmm.Copyright#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode</em>' attribute.
	 * @see qrmm.ChangeMode
	 * @see #getChangeMode()
	 * @generated
	 */
	void setChangeMode(ChangeMode value);

} // Copyright
