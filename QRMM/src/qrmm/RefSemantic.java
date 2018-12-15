/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Semantic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.RefSemantic#getCorrespondingAttributePath <em>Corresponding Attribute Path</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getRefSemantic()
 * @model
 * @generated
 */
public interface RefSemantic extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Corresponding Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Attribute Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Attribute Path</em>' attribute.
	 * @see #setCorrespondingAttributePath(String)
	 * @see qrmm.QrmmPackage#getRefSemantic_CorrespondingAttributePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCorrespondingAttributePath();

	/**
	 * Sets the value of the '{@link qrmm.RefSemantic#getCorrespondingAttributePath <em>Corresponding Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Attribute Path</em>' attribute.
	 * @see #getCorrespondingAttributePath()
	 * @generated
	 */
	void setCorrespondingAttributePath(String value);

} // RefSemantic
