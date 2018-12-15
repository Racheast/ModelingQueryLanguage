/**
 */
package qrmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qrmm.ExternalInterface;
import qrmm.InterfaceClass;
import qrmm.QrmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qrmm.impl.ExternalInterfaceImpl#getExternalInterface <em>External Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalInterfaceImpl extends InterfaceClassImpl implements ExternalInterface {
	/**
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass> externalInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QrmmPackage.Literals.EXTERNAL_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<InterfaceClass>(InterfaceClass.class, this, QrmmPackage.EXTERNAL_INTERFACE__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QrmmPackage.EXTERNAL_INTERFACE__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
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
			case QrmmPackage.EXTERNAL_INTERFACE__EXTERNAL_INTERFACE:
				return getExternalInterface();
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
			case QrmmPackage.EXTERNAL_INTERFACE__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends InterfaceClass>)newValue);
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
			case QrmmPackage.EXTERNAL_INTERFACE__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
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
			case QrmmPackage.EXTERNAL_INTERFACE__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalInterfaceImpl
