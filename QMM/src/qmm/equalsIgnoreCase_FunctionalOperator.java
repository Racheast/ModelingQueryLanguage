/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>equals Ignore Case Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.equalsIgnoreCase_FunctionalOperator#getAnotherString <em>Another String</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getequalsIgnoreCase_FunctionalOperator()
 * @model annotation="information name='equalsIgnoreCase' literal='.equalsIgnoreCase' functionalOperatorType='String' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface equalsIgnoreCase_FunctionalOperator extends String_Original_FunctionalOperator, Boolean_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Another String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Another String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Another String</em>' containment reference.
	 * @see #setAnotherString(String_FunctionalParameter)
	 * @see qmm.QmmPackage#getequalsIgnoreCase_FunctionalOperator_AnotherString()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String_FunctionalParameter getAnotherString();

	/**
	 * Sets the value of the '{@link qmm.equalsIgnoreCase_FunctionalOperator#getAnotherString <em>Another String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Another String</em>' containment reference.
	 * @see #getAnotherString()
	 * @generated
	 */
	void setAnotherString(String_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".equalsIgnoreCase\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(anotherString);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // equalsIgnoreCase_FunctionalOperator
