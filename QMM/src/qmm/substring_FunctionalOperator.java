/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>substring Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.substring_FunctionalOperator#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link qmm.substring_FunctionalOperator#getEndIndex <em>End Index</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getsubstring_FunctionalOperator()
 * @model annotation="information name='substring' literal='.substring' functionalOperatorType='String' functionalType='String_FunctionalType'"
 * @generated
 */
public interface substring_FunctionalOperator extends String_Original_FunctionalOperator, String_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Start Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Index</em>' containment reference.
	 * @see #setStartIndex(Integer_FunctionalParameter)
	 * @see qmm.QmmPackage#getsubstring_FunctionalOperator_StartIndex()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_FunctionalParameter getStartIndex();

	/**
	 * Sets the value of the '{@link qmm.substring_FunctionalOperator#getStartIndex <em>Start Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Index</em>' containment reference.
	 * @see #getStartIndex()
	 * @generated
	 */
	void setStartIndex(Integer_FunctionalParameter value);

	/**
	 * Returns the value of the '<em><b>End Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Index</em>' containment reference.
	 * @see #setEndIndex(Integer_FunctionalParameter)
	 * @see qmm.QmmPackage#getsubstring_FunctionalOperator_EndIndex()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_FunctionalParameter getEndIndex();

	/**
	 * Sets the value of the '{@link qmm.substring_FunctionalOperator#getEndIndex <em>End Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Index</em>' containment reference.
	 * @see #getEndIndex()
	 * @generated
	 */
	void setEndIndex(Integer_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".substring\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(startIndex);\nparameterList.add(endIndex);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // substring_FunctionalOperator
