/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.UnknownType#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getUnknownType()
 * @model
 * @generated
 */
public interface UnknownType extends SearchableElement {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' attribute.
	 * @see #setRequirements(String)
	 * @see qrmm.QrmmPackage#getUnknownType_Requirements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRequirements();

	/**
	 * Sets the value of the '{@link qrmm.UnknownType#getRequirements <em>Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' attribute.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(String value);

} // UnknownType
