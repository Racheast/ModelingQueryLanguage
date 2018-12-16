/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parse Boolean Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.parseBoolean_FunctionalOperator#getS <em>S</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getparseBoolean_FunctionalOperator()
 * @model annotation="information name='parseBoolean' literal='.parseBoolean' functionalOperatorType='Boolean' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface parseBoolean_FunctionalOperator extends Boolean_Original_FunctionalOperator, Boolean_FunctionalType {
	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference.
	 * @see #setS(String_FunctionalParameter)
	 * @see qmm.QmmPackage#getparseBoolean_FunctionalOperator_S()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String_FunctionalParameter getS();

	/**
	 * Sets the value of the '{@link qmm.parseBoolean_FunctionalOperator#getS <em>S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' containment reference.
	 * @see #getS()
	 * @generated
	 */
	void setS(String_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".parseBoolean\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(s);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // parseBoolean_FunctionalOperator
