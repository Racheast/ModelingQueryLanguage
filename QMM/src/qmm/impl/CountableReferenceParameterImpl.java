/**
 */
package qmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.CountableReferenceParameter;
import qmm.Countable_ReferenceArgument;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Countable Reference Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CountableReferenceParameterImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountableReferenceParameterImpl extends ParameterImpl implements CountableReferenceParameter {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected Countable_ReferenceArgument argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountableReferenceParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCountableReferenceParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countable_ReferenceArgument getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(Countable_ReferenceArgument newArgument, NotificationChain msgs) {
		Countable_ReferenceArgument oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT, oldArgument, newArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(Countable_ReferenceArgument newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT, null, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT, null, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT:
				return basicSetArgument(null, msgs);
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
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT:
				return getArgument();
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
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT:
				setArgument((Countable_ReferenceArgument)newValue);
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
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT:
				setArgument((Countable_ReferenceArgument)null);
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
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER__ARGUMENT:
				return argument != null;
		}
		return super.eIsSet(featureID);
	}

} //CountableReferenceParameterImpl
