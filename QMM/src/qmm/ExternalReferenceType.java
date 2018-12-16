/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.ExternalReferenceType#getAlias_AttrEClass <em>Alias Attr EClass</em>}</li>
 *   <li>{@link qmm.ExternalReferenceType#getPath_AttrEClass <em>Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getExternalReferenceType()
 * @model
 * @generated
 */
public interface ExternalReferenceType extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Alias Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Attr EClass</em>' containment reference.
	 * @see #setAlias_AttrEClass(ExternalReferenceType_alias_AttrEClass)
	 * @see qmm.QmmPackage#getExternalReferenceType_Alias_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	ExternalReferenceType_alias_AttrEClass getAlias_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.ExternalReferenceType#getAlias_AttrEClass <em>Alias Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Attr EClass</em>' containment reference.
	 * @see #getAlias_AttrEClass()
	 * @generated
	 */
	void setAlias_AttrEClass(ExternalReferenceType_alias_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Path Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Attr EClass</em>' containment reference.
	 * @see #setPath_AttrEClass(ExternalReferenceType_path_AttrEClass)
	 * @see qmm.QmmPackage#getExternalReferenceType_Path_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	ExternalReferenceType_path_AttrEClass getPath_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.ExternalReferenceType#getPath_AttrEClass <em>Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr EClass</em>' containment reference.
	 * @see #getPath_AttrEClass()
	 * @generated
	 */
	void setPath_AttrEClass(ExternalReferenceType_path_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // ExternalReferenceType
