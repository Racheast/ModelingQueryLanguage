/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Revision#getRevisionDate_AttrEClass <em>Revision Date Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getOldVersion_AttrEClass <em>Old Version Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getNewVersion_AttrEClass <em>New Version Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getAuthorName_AttrEClass <em>Author Name Attr EClass</em>}</li>
 *   <li>{@link qmm.Revision#getComment_AttrEClass <em>Comment Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getRevision()
 * @model
 * @generated
 */
public interface Revision extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Revision Date Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Date Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Date Attr EClass</em>' containment reference.
	 * @see #setRevisionDate_AttrEClass(Revision_revisionDate_AttrEClass)
	 * @see qmm.QmmPackage#getRevision_RevisionDate_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Revision_revisionDate_AttrEClass getRevisionDate_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Revision#getRevisionDate_AttrEClass <em>Revision Date Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Date Attr EClass</em>' containment reference.
	 * @see #getRevisionDate_AttrEClass()
	 * @generated
	 */
	void setRevisionDate_AttrEClass(Revision_revisionDate_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Old Version Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Version Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Version Attr EClass</em>' containment reference.
	 * @see #setOldVersion_AttrEClass(Revision_oldVersion_AttrEClass)
	 * @see qmm.QmmPackage#getRevision_OldVersion_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Revision_oldVersion_AttrEClass getOldVersion_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Revision#getOldVersion_AttrEClass <em>Old Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Version Attr EClass</em>' containment reference.
	 * @see #getOldVersion_AttrEClass()
	 * @generated
	 */
	void setOldVersion_AttrEClass(Revision_oldVersion_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>New Version Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Version Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Version Attr EClass</em>' containment reference.
	 * @see #setNewVersion_AttrEClass(Revision_newVersion_AttrEClass)
	 * @see qmm.QmmPackage#getRevision_NewVersion_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Revision_newVersion_AttrEClass getNewVersion_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Revision#getNewVersion_AttrEClass <em>New Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Version Attr EClass</em>' containment reference.
	 * @see #getNewVersion_AttrEClass()
	 * @generated
	 */
	void setNewVersion_AttrEClass(Revision_newVersion_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Author Name Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name Attr EClass</em>' containment reference.
	 * @see #setAuthorName_AttrEClass(Revision_authorName_AttrEClass)
	 * @see qmm.QmmPackage#getRevision_AuthorName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Revision_authorName_AttrEClass getAuthorName_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Revision#getAuthorName_AttrEClass <em>Author Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Name Attr EClass</em>' containment reference.
	 * @see #getAuthorName_AttrEClass()
	 * @generated
	 */
	void setAuthorName_AttrEClass(Revision_authorName_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Comment Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Attr EClass</em>' containment reference.
	 * @see #setComment_AttrEClass(Revision_comment_AttrEClass)
	 * @see qmm.QmmPackage#getRevision_Comment_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Revision_comment_AttrEClass getComment_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Revision#getComment_AttrEClass <em>Comment Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Attr EClass</em>' containment reference.
	 * @see #getComment_AttrEClass()
	 * @generated
	 */
	void setComment_AttrEClass(Revision_comment_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Revision
