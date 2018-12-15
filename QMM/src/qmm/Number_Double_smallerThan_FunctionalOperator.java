/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Double smaller Than Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Number_Double_smallerThan_FunctionalOperator#getI <em>I</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getNumber_Double_smallerThan_FunctionalOperator()
 * @model annotation="information name='smallerThan' literal='<' functionalOperatorType='Number' functionalType='Boolean_FunctionalType'"
 * @generated
 */
public interface Number_Double_smallerThan_FunctionalOperator extends InheritedFrom_Number_to_Double_FunctionalOperator, Boolean_FunctionalType {
	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference.
	 * @see #setI(Number_FunctionalParameter)
	 * @see qmm.QmmPackage#getNumber_Double_smallerThan_FunctionalOperator_I()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Number_FunctionalParameter getI();

	/**
	 * Sets the value of the '{@link qmm.Number_Double_smallerThan_FunctionalOperator#getI <em>I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' containment reference.
	 * @see #getI()
	 * @generated
	 */
	void setI(Number_FunctionalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"<\";'"
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

} // Number_Double_smallerThan_FunctionalOperator
