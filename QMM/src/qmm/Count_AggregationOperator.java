/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#getCount_AggregationOperator()
 * @model annotation="information functionalType='Integer' literal='count'"
 * @generated
 */
public interface Count_AggregationOperator extends CountingAggregationOperator, Integer_EvaluationOperation_Argument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"count\";'"
	 * @generated
	 */
	String getLiteral();

} // Count_AggregationOperator
