/**
 */
package qrmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}</li>
 *   <li>{@link qrmm.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}</li>
 *   <li>{@link qrmm.InternalLink#getPartnerSideA <em>Partner Side A</em>}</li>
 *   <li>{@link qrmm.InternalLink#getPartnerSideB <em>Partner Side B</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getInternalLink()
 * @model
 * @generated
 */
public interface InternalLink extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Ref Partner Side A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side A</em>' attribute.
	 * @see #setRefPartnerSideA(String)
	 * @see qrmm.QrmmPackage#getInternalLink_RefPartnerSideA()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefPartnerSideA();

	/**
	 * Sets the value of the '{@link qrmm.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Partner Side A</em>' attribute.
	 * @see #getRefPartnerSideA()
	 * @generated
	 */
	void setRefPartnerSideA(String value);

	/**
	 * Returns the value of the '<em><b>Ref Partner Side B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side B</em>' attribute.
	 * @see #setRefPartnerSideB(String)
	 * @see qrmm.QrmmPackage#getInternalLink_RefPartnerSideB()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefPartnerSideB();

	/**
	 * Sets the value of the '{@link qrmm.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Partner Side B</em>' attribute.
	 * @see #getRefPartnerSideB()
	 * @generated
	 */
	void setRefPartnerSideB(String value);

	/**
	 * Returns the value of the '<em><b>Partner Side A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side A</em>' reference.
	 * @see #setPartnerSideA(ExternalInterface)
	 * @see qrmm.QrmmPackage#getInternalLink_PartnerSideA()
	 * @model
	 * @generated
	 */
	ExternalInterface getPartnerSideA();

	/**
	 * Sets the value of the '{@link qrmm.InternalLink#getPartnerSideA <em>Partner Side A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Side A</em>' reference.
	 * @see #getPartnerSideA()
	 * @generated
	 */
	void setPartnerSideA(ExternalInterface value);

	/**
	 * Returns the value of the '<em><b>Partner Side B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side B</em>' reference.
	 * @see #setPartnerSideB(ExternalInterface)
	 * @see qrmm.QrmmPackage#getInternalLink_PartnerSideB()
	 * @model
	 * @generated
	 */
	ExternalInterface getPartnerSideB();

	/**
	 * Sets the value of the '{@link qrmm.InternalLink#getPartnerSideB <em>Partner Side B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Side B</em>' reference.
	 * @see #getPartnerSideB()
	 * @generated
	 */
	void setPartnerSideB(ExternalInterface value);

} // InternalLink
