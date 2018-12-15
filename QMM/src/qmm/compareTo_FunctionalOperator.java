/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compare To Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.compareTo_FunctionalOperator#getB <em>B</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getcompareTo_FunctionalOperator()
 * @model annotation="information name='compareTo' literal='.compareTo' functionalOperatorType='Boolean' functionalType='Integer_FunctionalType'"
 * @generated
 */
public interface compareTo_FunctionalOperator extends Boolean_Original_FunctionalOperator, Integer_FunctionalType {
	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(Boolean_FunctionalParameter)
	 * @see qmm.QmmPackage#getcompareTo_FunctionalOperator_B()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Boolean_FunctionalParameter getB();

	/**
	 * Sets the value of the '{@link qmm.compareTo_FunctionalOperator#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Boolean_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".compareTo\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(b);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // compareTo_FunctionalOperator
