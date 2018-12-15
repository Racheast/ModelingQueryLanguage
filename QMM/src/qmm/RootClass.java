/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.RootClass#getEvaluationOperator <em>Evaluation Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getRootClass()
 * @model abstract="true"
 * @generated
 */
public interface RootClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation Operator</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.EvaluationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Operator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Operator</em>' containment reference list.
	 * @see qmm.QmmPackage#getRootClass_EvaluationOperator()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationOperator> getEvaluationOperator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EClass booleanType = QmmPackage.eINSTANCE.getBoolean_Type();\nEClass functionalOperatorType = QmmPackage.eINSTANCE.getFunctionalOperator();\nEClass bitOperatorType = QmmPackage.eINSTANCE.getBitOperator();\nqmm.Operator operator = (qmm.Operator)o;\nEList diagnosticList = new org.eclipse.emf.common.util.BasicEList();\n\nif(functionalOperatorType.isSuperTypeOf(operator.eClass())){\n\tqmm.FunctionalOperator lastOperator = (qmm.FunctionalOperator)((qmm.FunctionalOperator)operator).getLastOperator();\n    \tEClass lastOperatorType = (EClass)lastOperator.getType();\n    \tif(!booleanType.isSuperTypeOf(lastOperatorType)){\n\t\t\tString errorMessage = \"Operator \" + lastOperator.eClass().getName() + \" of attribute \" + this.eClass().getName() + \" is of type \" + lastOperatorType.getName() + \", but must be (a subtype) of type \" + booleanType.getName() + \".\";\n    \t\tdiagnosticList.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));\n    \t}\n}else if(bitOperatorType.isSuperTypeOf(operator.eClass())){\n    for(qmm.Operator op : (EList<qmm.Operator>)operator.eGet(operator.eClass().getEStructuralFeature(\"connects\"))){\n    \tdiagnosticList.addAll(validateCheckExpression(op));\n    }\n}\nreturn diagnosticList;'"
	 * @generated
	 */
	EList validateCheckExpression(Object o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tEList<qmm.Operator> operators = (EList<qmm.Operator>)o;\n\tEList diagnosticList = new org.eclipse.emf.common.util.BasicEList();\n\tif(operators != null){\n\t\tfor(qmm.Operator operator:operators){\n\t\t\tdiagnosticList.addAll(validateCheckExpression(operator));\n\t\t}\n   }\n\treturn diagnosticList;'"
	 * @generated
	 */
	EList validateAllCheckExpressions(Object o);

} // RootClass
