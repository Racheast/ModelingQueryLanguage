/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Max_AggregationOperator#getCalculateable <em>Calculateable</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getMax_AggregationOperator()
 * @model annotation="information functionalType='Integer' literal='max'"
 * @generated
 */
public interface Max_AggregationOperator extends CalculatingAggregationOperator, Integer_EvaluationOperation_Argument {
	/**
	 * Returns the value of the '<em><b>Calculateable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculateable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculateable</em>' containment reference.
	 * @see #setCalculateable(Integer_CalculateableParameter)
	 * @see qmm.QmmPackage#getMax_AggregationOperator_Calculateable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Integer_CalculateableParameter getCalculateable();

	/**
	 * Sets the value of the '{@link qmm.Max_AggregationOperator#getCalculateable <em>Calculateable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculateable</em>' containment reference.
	 * @see #getCalculateable()
	 * @generated
	 */
	void setCalculateable(Integer_CalculateableParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"max\";'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(calculateable);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // Max_AggregationOperator
