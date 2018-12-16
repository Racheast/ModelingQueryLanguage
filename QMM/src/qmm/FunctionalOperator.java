/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#getFunctionalOperator()
 * @model abstract="true"
 * @generated
 */
public interface FunctionalOperator extends ExpressionOperator, TypedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='qmm.FunctionalOperator operator = this;\nwhile(operator.eGet(operator.eClass().getEStructuralFeature(\"operator\")) != null){\n    operator = (qmm.FunctionalOperator) operator.eGet(operator.eClass().getEStructuralFeature(\"operator\"));\n}\nreturn operator;'"
	 * @generated
	 */
	Object getLastOperator();

} // FunctionalOperator
