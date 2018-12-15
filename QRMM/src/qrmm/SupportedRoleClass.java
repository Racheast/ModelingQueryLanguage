/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link qrmm.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}</li>
 *   <li>{@link qrmm.SupportedRoleClass#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getSupportedRoleClass()
 * @model
 * @generated
 */
public interface SupportedRoleClass extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference.
	 * @see #setMappingObject(Mapping)
	 * @see qrmm.QrmmPackage#getSupportedRoleClass_MappingObject()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMappingObject();

	/**
	 * Sets the value of the '{@link qrmm.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Object</em>' containment reference.
	 * @see #getMappingObject()
	 * @generated
	 */
	void setMappingObject(Mapping value);

	/**
	 * Returns the value of the '<em><b>Ref Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Role Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Role Class Path</em>' attribute.
	 * @see #setRefRoleClassPath(String)
	 * @see qrmm.QrmmPackage#getSupportedRoleClass_RefRoleClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefRoleClassPath();

	/**
	 * Sets the value of the '{@link qrmm.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Role Class Path</em>' attribute.
	 * @see #getRefRoleClassPath()
	 * @generated
	 */
	void setRefRoleClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' reference.
	 * @see #setRoleClass(RoleClass)
	 * @see qrmm.QrmmPackage#getSupportedRoleClass_RoleClass()
	 * @model
	 * @generated
	 */
	RoleClass getRoleClass();

	/**
	 * Sets the value of the '{@link qrmm.SupportedRoleClass#getRoleClass <em>Role Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Class</em>' reference.
	 * @see #getRoleClass()
	 * @generated
	 */
	void setRoleClass(RoleClass value);

} // SupportedRoleClass
