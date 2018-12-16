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

import qmm.Argument;
import qmm.Calculateable_Argument;
import qmm.EvaluationOperation_Argument;
import qmm.FunctionalArgument;
import qmm.FunctionalType;
import qmm.Integer_Argument;
import qmm.Integer_CalculateableParameter;
import qmm.Integer_EvaluationOperation_Argument;
import qmm.Integer_FunctionalOperator;
import qmm.Integer_FunctionalType;
import qmm.Integer_Type;
import qmm.Min_AggregationOperator;
import qmm.Number_Type;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.ReferenceArgument;
import qmm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.Min_AggregationOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.Min_AggregationOperatorImpl#getCalculateable <em>Calculateable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Min_AggregationOperatorImpl extends CalculatingAggregationOperatorImpl implements Min_AggregationOperator {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Integer_FunctionalOperator operator;

	/**
	 * The cached value of the '{@link #getCalculateable() <em>Calculateable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculateable()
	 * @generated
	 * @ordered
	 */
	protected Integer_CalculateableParameter calculateable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Min_AggregationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getMin_AggregationOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Integer_FunctionalOperator newOperator, NotificationChain msgs) {
		Integer_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Integer_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_CalculateableParameter getCalculateable() {
		return calculateable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculateable(Integer_CalculateableParameter newCalculateable, NotificationChain msgs) {
		Integer_CalculateableParameter oldCalculateable = calculateable;
		calculateable = newCalculateable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE, oldCalculateable, newCalculateable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculateable(Integer_CalculateableParameter newCalculateable) {
		if (newCalculateable != calculateable) {
			NotificationChain msgs = null;
			if (calculateable != null)
				msgs = ((InternalEObject)calculateable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE, null, msgs);
			if (newCalculateable != null)
				msgs = ((InternalEObject)newCalculateable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE, null, msgs);
			msgs = basicSetCalculateable(newCalculateable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE, newCalculateable, newCalculateable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return "min";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(calculateable);
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
			case QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR:
				return basicSetOperator(null, msgs);
			case QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE:
				return basicSetCalculateable(null, msgs);
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
			case QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR:
				return getOperator();
			case QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE:
				return getCalculateable();
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
			case QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR:
				setOperator((Integer_FunctionalOperator)newValue);
				return;
			case QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE:
				setCalculateable((Integer_CalculateableParameter)newValue);
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
			case QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR:
				setOperator((Integer_FunctionalOperator)null);
				return;
			case QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE:
				setCalculateable((Integer_CalculateableParameter)null);
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
			case QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR:
				return operator != null;
			case QmmPackage.MIN_AGGREGATION_OPERATOR__CALCULATEABLE:
				return calculateable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceArgument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalArgument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Calculateable_Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvaluationOperation_Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Object_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Number_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR: return QmmPackage.INTEGER_FUNCTIONAL_TYPE__OPERATOR;
				default: return -1;
			}
		}
		if (baseClass == Integer_Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_EvaluationOperation_Argument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceArgument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalArgument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Calculateable_Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvaluationOperation_Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Object_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Number_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.INTEGER_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.MIN_AGGREGATION_OPERATOR__OPERATOR;
				default: return -1;
			}
		}
		if (baseClass == Integer_Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Integer_EvaluationOperation_Argument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.MIN_AGGREGATION_OPERATOR___GET_LITERAL:
				return getLiteral();
			case QmmPackage.MIN_AGGREGATION_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Min_AggregationOperatorImpl
