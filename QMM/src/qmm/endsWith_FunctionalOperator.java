/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ends With Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.endsWith_FunctionalOperator#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getendsWith_FunctionalOperator()
 * @model annotation="information name='endsWith' literal='.endsWith' functionalOperatorType='String' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface endsWith_FunctionalOperator extends String_Original_FunctionalOperator, Boolean_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference.
	 * @see #setSuffix(String_FunctionalParameter)
	 * @see qmm.QmmPackage#getendsWith_FunctionalOperator_Suffix()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String_FunctionalParameter getSuffix();

	/**
	 * Sets the value of the '{@link qmm.endsWith_FunctionalOperator#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".endsWith\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(suffix);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // endsWith_FunctionalOperator
