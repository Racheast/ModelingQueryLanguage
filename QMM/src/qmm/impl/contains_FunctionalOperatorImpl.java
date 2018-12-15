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

import qmm.Boolean_FunctionalOperator;
import qmm.Boolean_FunctionalType;
import qmm.Boolean_Type;
import qmm.CharSequence_FunctionalParameter;
import qmm.FunctionalType;
import qmm.NegatableElement;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.Type;
import qmm.contains_FunctionalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>contains Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.contains_FunctionalOperatorImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link qmm.impl.contains_FunctionalOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.contains_FunctionalOperatorImpl#getCharSequence <em>Char Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class contains_FunctionalOperatorImpl extends String_Original_FunctionalOperatorImpl implements contains_FunctionalOperator {
	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Boolean_FunctionalOperator operator;

	/**
	 * The cached value of the '{@link #getCharSequence() <em>Char Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharSequence()
	 * @generated
	 * @ordered
	 */
	protected CharSequence_FunctionalParameter charSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected contains_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getcontains_FunctionalOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Boolean_FunctionalOperator newOperator, NotificationChain msgs) {
		Boolean_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Boolean_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_FunctionalParameter getCharSequence() {
		return charSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharSequence(CharSequence_FunctionalParameter newCharSequence, NotificationChain msgs) {
		CharSequence_FunctionalParameter oldCharSequence = charSequence;
		charSequence = newCharSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE, oldCharSequence, newCharSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharSequence(CharSequence_FunctionalParameter newCharSequence) {
		if (newCharSequence != charSequence) {
			NotificationChain msgs = null;
			if (charSequence != null)
				msgs = ((InternalEObject)charSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE, null, msgs);
			if (newCharSequence != null)
				msgs = ((InternalEObject)newCharSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE, null, msgs);
			msgs = basicSetCharSequence(newCharSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE, newCharSequence, newCharSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return ".contains";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		parameterList.add(charSequence);
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
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR:
				return basicSetOperator(null, msgs);
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE:
				return basicSetCharSequence(null, msgs);
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
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__NEGATED:
				return isNegated();
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR:
				return getOperator();
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE:
				return getCharSequence();
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
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Boolean_FunctionalOperator)newValue);
				return;
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE:
				setCharSequence((CharSequence_FunctionalParameter)newValue);
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
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__NEGATED:
				setNegated(NEGATED_EDEFAULT);
				return;
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((Boolean_FunctionalOperator)null);
				return;
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE:
				setCharSequence((CharSequence_FunctionalParameter)null);
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
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__NEGATED:
				return negated != NEGATED_EDEFAULT;
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR:
				return operator != null;
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__CHAR_SEQUENCE:
				return charSequence != null;
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
		if (baseClass == Boolean_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatableElement.class) {
			switch (derivedFeatureID) {
				case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__NEGATED: return QmmPackage.NEGATABLE_ELEMENT__NEGATED;
				default: return -1;
			}
		}
		if (baseClass == Boolean_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR: return QmmPackage.BOOLEAN_FUNCTIONAL_TYPE__OPERATOR;
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
		if (baseClass == Boolean_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatableElement.class) {
			switch (baseFeatureID) {
				case QmmPackage.NEGATABLE_ELEMENT__NEGATED: return QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__NEGATED;
				default: return -1;
			}
		}
		if (baseClass == Boolean_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.BOOLEAN_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR__OPERATOR;
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
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR___GET_LITERAL:
				return getLiteral();
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}

} //contains_FunctionalOperatorImpl
