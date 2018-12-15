/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>contains Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.contains_FunctionalOperator#getCharSequence <em>Char Sequence</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getcontains_FunctionalOperator()
 * @model annotation="information name='contains' literal='.contains' functionalOperatorType='String' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface contains_FunctionalOperator extends String_Original_FunctionalOperator, Boolean_FunctionalType {
	/**
	 * Returns the value of the '<em><b>Char Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Sequence</em>' containment reference.
	 * @see #setCharSequence(CharSequence_FunctionalParameter)
	 * @see qmm.QmmPackage#getcontains_FunctionalOperator_CharSequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CharSequence_FunctionalParameter getCharSequence();

	/**
	 * Sets the value of the '{@link qmm.contains_FunctionalOperator#getCharSequence <em>Char Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Sequence</em>' containment reference.
	 * @see #getCharSequence()
	 * @generated
	 */
	void setCharSequence(CharSequence_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".contains\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(charSequence);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // contains_FunctionalOperator
