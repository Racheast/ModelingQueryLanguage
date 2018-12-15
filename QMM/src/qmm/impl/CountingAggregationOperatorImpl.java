/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.CountableReferenceParameter;
import qmm.CountingAggregationOperator;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counting Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CountingAggregationOperatorImpl#getCountable <em>Countable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CountingAggregationOperatorImpl extends AggregationOperatorImpl implements CountingAggregationOperator {
	/**
	 * The cached value of the '{@link #getCountable() <em>Countable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountable()
	 * @generated
	 * @ordered
	 */
	protected CountableReferenceParameter countable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountingAggregationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCountingAggregationOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountableReferenceParameter getCountable() {
		return countable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountable(CountableReferenceParameter newCountable, NotificationChain msgs) {
		CountableReferenceParameter oldCountable = countable;
		countable = newCountable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE, oldCountable, newCountable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountable(CountableReferenceParameter newCountable) {
		if (newCountable != countable) {
			NotificationChain msgs = null;
			if (countable != null)
				msgs = ((InternalEObject)countable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE, null, msgs);
			if (newCountable != null)
				msgs = ((InternalEObject)newCountable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE, null, msgs);
			msgs = basicSetCountable(newCountable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE, newCountable, newCountable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(countable);
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE:
				return basicSetCountable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE:
				return getCountable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE:
				setCountable((CountableReferenceParameter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE:
				setCountable((CountableReferenceParameter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR__COUNTABLE:
				return countable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CountingAggregationOperatorImpl
