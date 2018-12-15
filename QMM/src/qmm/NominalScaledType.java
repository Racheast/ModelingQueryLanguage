/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.NominalScaledType#getRequiredValue_AttrEClass <em>Required Value Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getNominalScaledType()
 * @model
 * @generated
 */
public interface NominalScaledType extends RootClass {
	/**
	 * Returns the value of the '<em><b>Required Value Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.NominalScaledType_requiredValue_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Value Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Value Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getNominalScaledType_RequiredValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<NominalScaledType_requiredValue_AttrEClass> getRequiredValue_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // NominalScaledType
