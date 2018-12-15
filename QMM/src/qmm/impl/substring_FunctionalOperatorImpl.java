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

import qmm.CharSequence_Type;
import qmm.FunctionalType;
import qmm.Integer_FunctionalParameter;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.String_FunctionalOperator;
import qmm.String_FunctionalType;
import qmm.String_Type;
import qmm.Type;
import qmm.substring_FunctionalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>substring Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.substring_FunctionalOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.substring_FunctionalOperatorImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link qmm.impl.substring_FunctionalOperatorImpl#getEndIndex <em>End Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class substring_FunctionalOperatorImpl extends String_Original_FunctionalOperatorImpl implements substring_FunctionalOperator {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String_FunctionalOperator operator;

	/**
	 * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer_FunctionalParameter startIndex;

	/**
	 * The cached value of the '{@link #getEndIndex() <em>End Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer_FunctionalParameter endIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected substring_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getsubstring_FunctionalOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(String_FunctionalOperator newOperator, NotificationChain msgs) {
		String_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameter getStartIndex() {
		return startIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartIndex(Integer_FunctionalParameter newStartIndex, NotificationChain msgs) {
		Integer_FunctionalParameter oldStartIndex = startIndex;
		startIndex = newStartIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX, oldStartIndex, newStartIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndex(Integer_FunctionalParameter newStartIndex) {
		if (newStartIndex != startIndex) {
			NotificationChain msgs = null;
			if (startIndex != null)
				msgs = ((InternalEObject)startIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX, null, msgs);
			if (newStartIndex != null)
				msgs = ((InternalEObject)newStartIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX, null, msgs);
			msgs = basicSetStartIndex(newStartIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX, newStartIndex, newStartIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameter getEndIndex() {
		return endIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndIndex(Integer_FunctionalParameter newEndIndex, NotificationChain msgs) {
		Integer_FunctionalParameter oldEndIndex = endIndex;
		endIndex = newEndIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX, oldEndIndex, newEndIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndIndex(Integer_FunctionalParameter newEndIndex) {
		if (newEndIndex != endIndex) {
			NotificationChain msgs = null;
			if (endIndex != null)
				msgs = ((InternalEObject)endIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX, null, msgs);
			if (newEndIndex != null)
				msgs = ((InternalEObject)newEndIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX, null, msgs);
			msgs = basicSetEndIndex(newEndIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX, newEndIndex, newEndIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return ".substring";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(startIndex);
		parameterList.add(endIndex);
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
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return basicSetOperator(null, msgs);
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX:
				return basicSetStartIndex(null, msgs);
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX:
				return basicSetEndIndex(null, msgs);
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
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return getOperator();
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX:
				return getStartIndex();
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX:
				return getEndIndex();
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
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((String_FunctionalOperator)newValue);
				return;
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX:
				setStartIndex((Integer_FunctionalParameter)newValue);
				return;
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX:
				setEndIndex((Integer_FunctionalParameter)newValue);
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
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((String_FunctionalOperator)null);
				return;
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX:
				setStartIndex((Integer_FunctionalParameter)null);
				return;
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX:
				setEndIndex((Integer_FunctionalParameter)null);
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
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return operator != null;
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__START_INDEX:
				return startIndex != null;
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__END_INDEX:
				return endIndex != null;
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
		if (baseClass == CharSequence_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR: return QmmPackage.STRING_FUNCTIONAL_TYPE__OPERATOR;
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
		if (baseClass == CharSequence_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.STRING_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR__OPERATOR;
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
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR___GET_LITERAL:
				return getLiteral();
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //substring_FunctionalOperatorImpl
