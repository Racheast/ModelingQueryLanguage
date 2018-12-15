/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.UnknownType#getRequirements_AttrEClass <em>Requirements Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getUnknownType()
 * @model
 * @generated
 */
public interface UnknownType extends RootClass {
	/**
	 * Returns the value of the '<em><b>Requirements Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements Attr EClass</em>' containment reference.
	 * @see #setRequirements_AttrEClass(UnknownType_requirements_AttrEClass)
	 * @see qmm.QmmPackage#getUnknownType_Requirements_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	UnknownType_requirements_AttrEClass getRequirements_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.UnknownType#getRequirements_AttrEClass <em>Requirements Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements Attr EClass</em>' containment reference.
	 * @see #getRequirements_AttrEClass()
	 * @generated
	 */
	void setRequirements_AttrEClass(UnknownType_requirements_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // UnknownType
