/**
 */
package qmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.BitOperator;
import qmm.EFeatureMapEntry_BitOperator;
import qmm.EFeatureMapEntry_ExpressionOperator;
import qmm.NegatableElement;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFeature Map Entry Bit Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.EFeatureMapEntry_BitOperatorImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link qmm.impl.EFeatureMapEntry_BitOperatorImpl#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EFeatureMapEntry_BitOperatorImpl extends EFeatureMapEntry_ExpressionOperatorImpl implements EFeatureMapEntry_BitOperator {
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
	 * The cached value of the '{@link #getConnects() <em>Connects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnects()
	 * @generated
	 * @ordered
	 */
	protected EList<EFeatureMapEntry_ExpressionOperator> connects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFeatureMapEntry_BitOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getEFeatureMapEntry_BitOperator();
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
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeatureMapEntry_ExpressionOperator> getConnects() {
		if (connects == null) {
			connects = new EObjectContainmentEList<EFeatureMapEntry_ExpressionOperator>(EFeatureMapEntry_ExpressionOperator.class, this, QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__CONNECTS);
		}
		return connects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__CONNECTS:
				return ((InternalEList<?>)getConnects()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__NEGATED:
				return isNegated();
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__CONNECTS:
				return getConnects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__CONNECTS:
				getConnects().clear();
				getConnects().addAll((Collection<? extends EFeatureMapEntry_ExpressionOperator>)newValue);
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
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__NEGATED:
				setNegated(NEGATED_EDEFAULT);
				return;
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__CONNECTS:
				getConnects().clear();
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
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__NEGATED:
				return negated != NEGATED_EDEFAULT;
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__CONNECTS:
				return connects != null && !connects.isEmpty();
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
		if (baseClass == NegatableElement.class) {
			switch (derivedFeatureID) {
				case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__NEGATED: return QmmPackage.NEGATABLE_ELEMENT__NEGATED;
				default: return -1;
			}
		}
		if (baseClass == BitOperator.class) {
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
		if (baseClass == NegatableElement.class) {
			switch (baseFeatureID) {
				case QmmPackage.NEGATABLE_ELEMENT__NEGATED: return QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR__NEGATED;
				default: return -1;
			}
		}
		if (baseClass == BitOperator.class) {
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}

} //EFeatureMapEntry_BitOperatorImpl
