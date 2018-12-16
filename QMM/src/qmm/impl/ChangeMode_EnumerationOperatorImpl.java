/**
 */
package qmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.ChangeMode;
import qmm.ChangeMode_EnumerationOperator;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Mode Enumeration Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.ChangeMode_EnumerationOperatorImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link qmm.impl.ChangeMode_EnumerationOperatorImpl#getOr <em>Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeMode_EnumerationOperatorImpl extends EnumerationOperatorImpl implements ChangeMode_EnumerationOperator {
	/**
	 * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeMode ARGUMENT_EDEFAULT = ChangeMode.STATE;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected ChangeMode argument = ARGUMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected ChangeMode_EnumerationOperator or;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeMode_EnumerationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getChangeMode_EnumerationOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMode getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(ChangeMode newArgument) {
		ChangeMode oldArgument = argument;
		argument = newArgument == null ? ARGUMENT_EDEFAULT : newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMode_EnumerationOperator getOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(ChangeMode_EnumerationOperator newOr, NotificationChain msgs) {
		ChangeMode_EnumerationOperator oldOr = or;
		or = newOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR, oldOr, newOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(ChangeMode_EnumerationOperator newOr) {
		if (newOr != or) {
			NotificationChain msgs = null;
			if (or != null)
				msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR, null, msgs);
			if (newOr != null)
				msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR, null, msgs);
			msgs = basicSetOr(newOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR, newOr, newOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR:
				return basicSetOr(null, msgs);
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
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__ARGUMENT:
				return getArgument();
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR:
				return getOr();
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
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__ARGUMENT:
				setArgument((ChangeMode)newValue);
				return;
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR:
				setOr((ChangeMode_EnumerationOperator)newValue);
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
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__ARGUMENT:
				setArgument(ARGUMENT_EDEFAULT);
				return;
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR:
				setOr((ChangeMode_EnumerationOperator)null);
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
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__ARGUMENT:
				return argument != ARGUMENT_EDEFAULT;
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR__OR:
				return or != null;
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
		result.append(" (argument: ");
		result.append(argument);
		result.append(')');
		return result.toString();
	}

} //ChangeMode_EnumerationOperatorImpl
