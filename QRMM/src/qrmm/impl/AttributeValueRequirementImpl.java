/**
 */
package qrmm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qrmm.AttributeValueRequirement;
import qrmm.NominalScaledType;
import qrmm.OrdinalScaledType;
import qrmm.QrmmPackage;
import qrmm.UnknownType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qrmm.impl.AttributeValueRequirementImpl#getOrdinalScaledType <em>Ordinal Scaled Type</em>}</li>
 *   <li>{@link qrmm.impl.AttributeValueRequirementImpl#getNominalScaledType <em>Nominal Scaled Type</em>}</li>
 *   <li>{@link qrmm.impl.AttributeValueRequirementImpl#getUnknownType <em>Unknown Type</em>}</li>
 *   <li>{@link qrmm.impl.AttributeValueRequirementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValueRequirementImpl extends CAEXBasicObjectImpl implements AttributeValueRequirement {
	/**
	 * The cached value of the '{@link #getOrdinalScaledType() <em>Ordinal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinalScaledType()
	 * @generated
	 * @ordered
	 */
	protected OrdinalScaledType ordinalScaledType;

	/**
	 * The cached value of the '{@link #getNominalScaledType() <em>Nominal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalScaledType()
	 * @generated
	 * @ordered
	 */
	protected NominalScaledType nominalScaledType;

	/**
	 * The cached value of the '{@link #getUnknownType() <em>Unknown Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownType()
	 * @generated
	 * @ordered
	 */
	protected UnknownType unknownType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QrmmPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType getOrdinalScaledType() {
		return ordinalScaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrdinalScaledType(OrdinalScaledType newOrdinalScaledType, NotificationChain msgs) {
		OrdinalScaledType oldOrdinalScaledType = ordinalScaledType;
		ordinalScaledType = newOrdinalScaledType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE, oldOrdinalScaledType, newOrdinalScaledType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdinalScaledType(OrdinalScaledType newOrdinalScaledType) {
		if (newOrdinalScaledType != ordinalScaledType) {
			NotificationChain msgs = null;
			if (ordinalScaledType != null)
				msgs = ((InternalEObject)ordinalScaledType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE, null, msgs);
			if (newOrdinalScaledType != null)
				msgs = ((InternalEObject)newOrdinalScaledType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE, null, msgs);
			msgs = basicSetOrdinalScaledType(newOrdinalScaledType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE, newOrdinalScaledType, newOrdinalScaledType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalScaledType getNominalScaledType() {
		return nominalScaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominalScaledType(NominalScaledType newNominalScaledType, NotificationChain msgs) {
		NominalScaledType oldNominalScaledType = nominalScaledType;
		nominalScaledType = newNominalScaledType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE, oldNominalScaledType, newNominalScaledType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalScaledType(NominalScaledType newNominalScaledType) {
		if (newNominalScaledType != nominalScaledType) {
			NotificationChain msgs = null;
			if (nominalScaledType != null)
				msgs = ((InternalEObject)nominalScaledType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE, null, msgs);
			if (newNominalScaledType != null)
				msgs = ((InternalEObject)newNominalScaledType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE, null, msgs);
			msgs = basicSetNominalScaledType(newNominalScaledType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE, newNominalScaledType, newNominalScaledType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType getUnknownType() {
		return unknownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnknownType(UnknownType newUnknownType, NotificationChain msgs) {
		UnknownType oldUnknownType = unknownType;
		unknownType = newUnknownType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE, oldUnknownType, newUnknownType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownType(UnknownType newUnknownType) {
		if (newUnknownType != unknownType) {
			NotificationChain msgs = null;
			if (unknownType != null)
				msgs = ((InternalEObject)unknownType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE, null, msgs);
			if (newUnknownType != null)
				msgs = ((InternalEObject)newUnknownType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE, null, msgs);
			msgs = basicSetUnknownType(newUnknownType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE, newUnknownType, newUnknownType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				return basicSetOrdinalScaledType(null, msgs);
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				return basicSetNominalScaledType(null, msgs);
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				return basicSetUnknownType(null, msgs);
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
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				return getOrdinalScaledType();
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				return getNominalScaledType();
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				return getUnknownType();
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME:
				return getName();
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
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				setOrdinalScaledType((OrdinalScaledType)newValue);
				return;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				setNominalScaledType((NominalScaledType)newValue);
				return;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				setUnknownType((UnknownType)newValue);
				return;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME:
				setName((String)newValue);
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
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				setOrdinalScaledType((OrdinalScaledType)null);
				return;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				setNominalScaledType((NominalScaledType)null);
				return;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				setUnknownType((UnknownType)null);
				return;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				return ordinalScaledType != null;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				return nominalScaledType != null;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				return unknownType != null;
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AttributeValueRequirementImpl
