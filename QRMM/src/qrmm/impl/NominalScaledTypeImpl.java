/**
 */
package qrmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import qrmm.NominalScaledType;
import qrmm.QrmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nominal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qrmm.impl.NominalScaledTypeImpl#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NominalScaledTypeImpl extends SearchableElementImpl implements NominalScaledType {
	/**
	 * The cached value of the '{@link #getRequiredValue() <em>Required Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NominalScaledTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QrmmPackage.Literals.NOMINAL_SCALED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequiredValue() {
		if (requiredValue == null) {
			requiredValue = new EDataTypeEList<String>(String.class, this, QrmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE);
		}
		return requiredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QrmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE:
				return getRequiredValue();
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
			case QrmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE:
				getRequiredValue().clear();
				getRequiredValue().addAll((Collection<? extends String>)newValue);
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
			case QrmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE:
				getRequiredValue().clear();
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
			case QrmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE:
				return requiredValue != null && !requiredValue.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (requiredValue: ");
		result.append(requiredValue);
		result.append(')');
		return result.toString();
	}

} //NominalScaledTypeImpl
