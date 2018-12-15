/**
 */
package qmm.impl;

import org.eclipse.emf.ecore.EClass;

import qmm.AggregationOperator;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AggregationOperatorImpl extends EvaluationFunctionalOperatorImpl implements AggregationOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getAggregationOperator();
	}

} //AggregationOperatorImpl
