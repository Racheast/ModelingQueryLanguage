/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Character equals Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Object_Character_equals_FunctionalOperator#getObj <em>Obj</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getObject_Character_equals_FunctionalOperator()
 * @model annotation="information name='equals' literal='.equals' functionalOperatorType='Object' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface Object_Character_equals_FunctionalOperator extends InheritedFrom_Object_to_Character_FunctionalOperator, Boolean_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Obj</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj</em>' containment reference.
	 * @see #setObj(Object_FunctionalParameter)
	 * @see qmm.QmmPackage#getObject_Character_equals_FunctionalOperator_Obj()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Object_FunctionalParameter getObj();

	/**
	 * Sets the value of the '{@link qmm.Object_Character_equals_FunctionalOperator#getObj <em>Obj</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj</em>' containment reference.
	 * @see #getObj()
	 * @generated
	 */
	void setObj(Object_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".equals\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(obj);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // Object_Character_equals_FunctionalOperator
