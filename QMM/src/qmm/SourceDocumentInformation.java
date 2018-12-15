/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Document Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.SourceDocumentInformation#getLastWritingDateTime_AttrEClass <em>Last Writing Date Time Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginID_AttrEClass <em>Origin ID Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginName_AttrEClass <em>Origin Name Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginProjectID_AttrEClass <em>Origin Project ID Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginProjectTitle_AttrEClass <em>Origin Project Title Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginRelease_AttrEClass <em>Origin Release Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginVendor_AttrEClass <em>Origin Vendor Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginVendorURL_AttrEClass <em>Origin Vendor URL Attr EClass</em>}</li>
 *   <li>{@link qmm.SourceDocumentInformation#getOriginVersion_AttrEClass <em>Origin Version Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getSourceDocumentInformation()
 * @model
 * @generated
 */
public interface SourceDocumentInformation extends RootClass {
	/**
	 * Returns the value of the '<em><b>Last Writing Date Time Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Writing Date Time Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Writing Date Time Attr EClass</em>' containment reference.
	 * @see #setLastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_LastWritingDateTime_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_lastWritingDateTime_AttrEClass getLastWritingDateTime_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getLastWritingDateTime_AttrEClass <em>Last Writing Date Time Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Writing Date Time Attr EClass</em>' containment reference.
	 * @see #getLastWritingDateTime_AttrEClass()
	 * @generated
	 */
	void setLastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin ID Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin ID Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin ID Attr EClass</em>' containment reference.
	 * @see #setOriginID_AttrEClass(SourceDocumentInformation_originID_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originID_AttrEClass getOriginID_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginID_AttrEClass <em>Origin ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin ID Attr EClass</em>' containment reference.
	 * @see #getOriginID_AttrEClass()
	 * @generated
	 */
	void setOriginID_AttrEClass(SourceDocumentInformation_originID_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin Name Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Name Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Name Attr EClass</em>' containment reference.
	 * @see #setOriginName_AttrEClass(SourceDocumentInformation_originName_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originName_AttrEClass getOriginName_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginName_AttrEClass <em>Origin Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Name Attr EClass</em>' containment reference.
	 * @see #getOriginName_AttrEClass()
	 * @generated
	 */
	void setOriginName_AttrEClass(SourceDocumentInformation_originName_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin Project ID Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Project ID Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Project ID Attr EClass</em>' containment reference.
	 * @see #setOriginProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginProjectID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originProjectID_AttrEClass getOriginProjectID_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginProjectID_AttrEClass <em>Origin Project ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Project ID Attr EClass</em>' containment reference.
	 * @see #getOriginProjectID_AttrEClass()
	 * @generated
	 */
	void setOriginProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin Project Title Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Project Title Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Project Title Attr EClass</em>' containment reference.
	 * @see #setOriginProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginProjectTitle_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originProjectTitle_AttrEClass getOriginProjectTitle_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginProjectTitle_AttrEClass <em>Origin Project Title Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Project Title Attr EClass</em>' containment reference.
	 * @see #getOriginProjectTitle_AttrEClass()
	 * @generated
	 */
	void setOriginProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin Release Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Release Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Release Attr EClass</em>' containment reference.
	 * @see #setOriginRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginRelease_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originRelease_AttrEClass getOriginRelease_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginRelease_AttrEClass <em>Origin Release Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Release Attr EClass</em>' containment reference.
	 * @see #getOriginRelease_AttrEClass()
	 * @generated
	 */
	void setOriginRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin Vendor Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Vendor Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Vendor Attr EClass</em>' containment reference.
	 * @see #setOriginVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginVendor_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originVendor_AttrEClass getOriginVendor_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginVendor_AttrEClass <em>Origin Vendor Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Vendor Attr EClass</em>' containment reference.
	 * @see #getOriginVendor_AttrEClass()
	 * @generated
	 */
	void setOriginVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin Vendor URL Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Vendor URL Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Vendor URL Attr EClass</em>' containment reference.
	 * @see #setOriginVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginVendorURL_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originVendorURL_AttrEClass getOriginVendorURL_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginVendorURL_AttrEClass <em>Origin Vendor URL Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Vendor URL Attr EClass</em>' containment reference.
	 * @see #getOriginVendorURL_AttrEClass()
	 * @generated
	 */
	void setOriginVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Origin Version Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Version Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Version Attr EClass</em>' containment reference.
	 * @see #setOriginVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass)
	 * @see qmm.QmmPackage#getSourceDocumentInformation_OriginVersion_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	SourceDocumentInformation_originVersion_AttrEClass getOriginVersion_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.SourceDocumentInformation#getOriginVersion_AttrEClass <em>Origin Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Version Attr EClass</em>' containment reference.
	 * @see #getOriginVersion_AttrEClass()
	 * @generated
	 */
	void setOriginVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // SourceDocumentInformation
