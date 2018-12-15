/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>char At Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.charAt_FunctionalOperator#getI <em>I</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getcharAt_FunctionalOperator()
 * @model annotation="information name='charAt' literal='.charAt' functionalOperatorType='Character' functionalType='Character_FunctionalType'"
 * @generated
 */
public interface charAt_FunctionalOperator extends Character_Original_FunctionalOperator, Character_FunctionalType {
	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference.
	 * @see #setI(Integer_FunctionalParameter)
	 * @see qmm.QmmPackage#getcharAt_FunctionalOperator_I()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_FunctionalParameter getI();

	/**
	 * Sets the value of the '{@link qmm.charAt_FunctionalOperator#getI <em>I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' containment reference.
	 * @see #getI()
	 * @generated
	 */
	void setI(Integer_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".charAt\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(i);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // charAt_FunctionalOperator
