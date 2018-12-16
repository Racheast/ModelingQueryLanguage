/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.ExternalInterface#getExternalInterface <em>External Interface</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getExternalInterface()
 * @model
 * @generated
 */
public interface ExternalInterface extends InterfaceClass, RootClass {
	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceClass_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see qmm.QmmPackage#getExternalInterface_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass_OrGroup> getExternalInterface();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int externalInterface_upperBound = -1;\nint nr_nonTransitive_externalInterface = 0;\nif(this.externalInterface != null){\n\t\tfor(qmm.OrGroup og : this.externalInterface) if(!og.isTransitive()) nr_nonTransitive_externalInterface++;\n}\nif(nr_nonTransitive_externalInterface > externalInterface_upperBound && externalInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_externalInterface + \" non-transitive externalInterface. Only \" + externalInterface_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // ExternalInterface
