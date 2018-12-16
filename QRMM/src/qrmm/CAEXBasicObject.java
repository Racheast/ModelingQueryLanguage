/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX Basic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.CAEXBasicObject#getChangeMode <em>Change Mode</em>}</li>
 *   <li>{@link qrmm.CAEXBasicObject#getDescription <em>Description</em>}</li>
 *   <li>{@link qrmm.CAEXBasicObject#getVersion <em>Version</em>}</li>
 *   <li>{@link qrmm.CAEXBasicObject#getRevision <em>Revision</em>}</li>
 *   <li>{@link qrmm.CAEXBasicObject#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link qrmm.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getCAEXBasicObject()
 * @model
 * @generated
 */
public interface CAEXBasicObject extends SearchableElement {
	/**
	 * Returns the value of the '<em><b>Change Mode</b></em>' attribute.
	 * The default value is <code>"state"</code>.
	 * The literals are from the enumeration {@link qrmm.ChangeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Mode</em>' attribute.
	 * @see qrmm.ChangeMode
	 * @see #isSetChangeMode()
	 * @see #unsetChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @see qrmm.QrmmPackage#getCAEXBasicObject_ChangeMode()
	 * @model default="state" unsettable="true"
	 * @generated
	 */
	ChangeMode getChangeMode();

	/**
	 * Sets the value of the '{@link qrmm.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode</em>' attribute.
	 * @see qrmm.ChangeMode
	 * @see #isSetChangeMode()
	 * @see #unsetChangeMode()
	 * @see #getChangeMode()
	 * @generated
	 */
	void setChangeMode(ChangeMode value);

	/**
	 * Unsets the value of the '{@link qrmm.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChangeMode()
	 * @see #getChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @generated
	 */
	void unsetChangeMode();

	/**
	 * Returns whether the value of the '{@link qrmm.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Change Mode</em>' attribute is set.
	 * @see #unsetChangeMode()
	 * @see #getChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @generated
	 */
	boolean isSetChangeMode();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Description)
	 * @see qrmm.QrmmPackage#getCAEXBasicObject_Description()
	 * @model
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link qrmm.CAEXBasicObject#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(Version)
	 * @see qrmm.QrmmPackage#getCAEXBasicObject_Version()
	 * @model
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link qrmm.CAEXBasicObject#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' reference list.
	 * The list contents are of type {@link qrmm.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' reference list.
	 * @see qrmm.QrmmPackage#getCAEXBasicObject_Revision()
	 * @model
	 * @generated
	 */
	EList<Revision> getRevision();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' reference.
	 * @see #setCopyright(Copyright)
	 * @see qrmm.QrmmPackage#getCAEXBasicObject_Copyright()
	 * @model
	 * @generated
	 */
	Copyright getCopyright();

	/**
	 * Sets the value of the '{@link qrmm.CAEXBasicObject#getCopyright <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Copyright value);

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' reference.
	 * @see #setAdditionalInformation(AdditionalInformation)
	 * @see qrmm.QrmmPackage#getCAEXBasicObject_AdditionalInformation()
	 * @model
	 * @generated
	 */
	AdditionalInformation getAdditionalInformation();

	/**
	 * Sets the value of the '{@link qrmm.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' reference.
	 * @see #getAdditionalInformation()
	 * @generated
	 */
	void setAdditionalInformation(AdditionalInformation value);

} // CAEXBasicObject
