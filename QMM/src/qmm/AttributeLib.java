/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.AttributeLib#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getAttributeLib()
 * @model
 * @generated
 */
public interface AttributeLib extends CAEXObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeLib_AttributeType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_OrGroup> getAttributeType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int attributeType_upperBound = -1;\nint nr_nonTransitive_attributeType = 0;\nif(this.attributeType != null){\n\t\tfor(qmm.OrGroup og : this.attributeType) if(!og.isTransitive()) nr_nonTransitive_attributeType++;\n}\nif(nr_nonTransitive_attributeType > attributeType_upperBound && attributeType_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_attributeType + \" non-transitive attributeType. Only \" + attributeType_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // AttributeLib
