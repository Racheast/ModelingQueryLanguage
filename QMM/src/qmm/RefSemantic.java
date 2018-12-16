/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Semantic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.RefSemantic#getCorrespondingAttributePath_AttrEClass <em>Corresponding Attribute Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getRefSemantic()
 * @model
 * @generated
 */
public interface RefSemantic extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Corresponding Attribute Path Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Attribute Path Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Attribute Path Attr EClass</em>' containment reference.
	 * @see #setCorrespondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass)
	 * @see qmm.QmmPackage#getRefSemantic_CorrespondingAttributePath_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	RefSemantic_correspondingAttributePath_AttrEClass getCorrespondingAttributePath_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.RefSemantic#getCorrespondingAttributePath_AttrEClass <em>Corresponding Attribute Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Attribute Path Attr EClass</em>' containment reference.
	 * @see #getCorrespondingAttributePath_AttrEClass()
	 * @generated
	 */
	void setCorrespondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // RefSemantic
