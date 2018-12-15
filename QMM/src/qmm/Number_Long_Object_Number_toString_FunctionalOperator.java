/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Long Object Number to String Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#getNumber_Long_Object_Number_toString_FunctionalOperator()
 * @model annotation="information name='toString' literal='.toString' functionalOperatorType='Object' functionalType='String_FunctionalType'"
 * @generated
 */
public interface Number_Long_Object_Number_toString_FunctionalOperator extends InheritedFrom_Number_to_Long_FunctionalOperator, String_FunctionalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".toString\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // Number_Long_Object_Number_toString_FunctionalOperator
