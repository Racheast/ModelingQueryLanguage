/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.Description#getValue <em>Value</em>}</li>
 *   <li>{@link qrmm.Description#getChangeMode <em>Change Mode</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends SearchableElement {
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
	 * @see qrmm.QrmmPackage#getDescription_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qrmm.Description#getValue <em>Value</em>}' attribute.
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
	 * @see qrmm.QrmmPackage#getDescription_ChangeMode()
	 * @model
	 * @generated
	 */
	ChangeMode getChangeMode();

	/**
	 * Sets the value of the '{@link qrmm.Description#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode</em>' attribute.
	 * @see qrmm.ChangeMode
	 * @see #getChangeMode()
	 * @generated
	 */
	void setChangeMode(ChangeMode value);

} // Description
