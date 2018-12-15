/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counting Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.CountingAggregationOperator#getCountable <em>Countable</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCountingAggregationOperator()
 * @model abstract="true"
 * @generated
 */
public interface CountingAggregationOperator extends AggregationOperator {
	/**
	 * Returns the value of the '<em><b>Countable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countable</em>' containment reference.
	 * @see #setCountable(CountableReferenceParameter)
	 * @see qmm.QmmPackage#getCountingAggregationOperator_Countable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CountableReferenceParameter getCountable();

	/**
	 * Sets the value of the '{@link qmm.CountingAggregationOperator#getCountable <em>Countable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Countable</em>' containment reference.
	 * @see #getCountable()
	 * @generated
	 */
	void setCountable(CountableReferenceParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList parameterList = new org.eclipse.emf.common.util.BasicEList();\nparameterList.add(countable);\nreturn parameterList;'"
	 * @generated
	 */
	EList getAllParameters();

} // CountingAggregationOperator
