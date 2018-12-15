/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface ID Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.InterfaceIDMapping#getRoleInterfaceID <em>Role Interface ID</em>}</li>
 *   <li>{@link qrmm.InterfaceIDMapping#getSystemUnitInterfaceID <em>System Unit Interface ID</em>}</li>
 *   <li>{@link qrmm.InterfaceIDMapping#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link qrmm.InterfaceIDMapping#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getInterfaceIDMapping()
 * @model
 * @generated
 */
public interface InterfaceIDMapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Role Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface ID</em>' attribute.
	 * @see #setRoleInterfaceID(String)
	 * @see qrmm.QrmmPackage#getInterfaceIDMapping_RoleInterfaceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRoleInterfaceID();

	/**
	 * Sets the value of the '{@link qrmm.InterfaceIDMapping#getRoleInterfaceID <em>Role Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Interface ID</em>' attribute.
	 * @see #getRoleInterfaceID()
	 * @generated
	 */
	void setRoleInterfaceID(String value);

	/**
	 * Returns the value of the '<em><b>System Unit Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface ID</em>' attribute.
	 * @see #setSystemUnitInterfaceID(String)
	 * @see qrmm.QrmmPackage#getInterfaceIDMapping_SystemUnitInterfaceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSystemUnitInterfaceID();

	/**
	 * Sets the value of the '{@link qrmm.InterfaceIDMapping#getSystemUnitInterfaceID <em>System Unit Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Interface ID</em>' attribute.
	 * @see #getSystemUnitInterfaceID()
	 * @generated
	 */
	void setSystemUnitInterfaceID(String value);

	/**
	 * Returns the value of the '<em><b>Role Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface</em>' reference.
	 * @see #setRoleInterface(ExternalInterface)
	 * @see qrmm.QrmmPackage#getInterfaceIDMapping_RoleInterface()
	 * @model
	 * @generated
	 */
	ExternalInterface getRoleInterface();

	/**
	 * Sets the value of the '{@link qrmm.InterfaceIDMapping#getRoleInterface <em>Role Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Interface</em>' reference.
	 * @see #getRoleInterface()
	 * @generated
	 */
	void setRoleInterface(ExternalInterface value);

	/**
	 * Returns the value of the '<em><b>System Unit Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface</em>' reference.
	 * @see #setSystemUnitInterface(ExternalInterface)
	 * @see qrmm.QrmmPackage#getInterfaceIDMapping_SystemUnitInterface()
	 * @model
	 * @generated
	 */
	ExternalInterface getSystemUnitInterface();

	/**
	 * Sets the value of the '{@link qrmm.InterfaceIDMapping#getSystemUnitInterface <em>System Unit Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Interface</em>' reference.
	 * @see #getSystemUnitInterface()
	 * @generated
	 */
	void setSystemUnitInterface(ExternalInterface value);

} // InterfaceIDMapping
