/**
 */
package qrmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qrmm.Attribute;
import qrmm.AttributeValueRequirement;
import qrmm.QrmmPackage;
import qrmm.RefSemantic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qrmm.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link qrmm.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qrmm.impl.AttributeImpl#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link qrmm.impl.AttributeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link qrmm.impl.AttributeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qrmm.impl.AttributeImpl#getAttributeDataType <em>Attribute Data Type</em>}</li>
 *   <li>{@link qrmm.impl.AttributeImpl#getRefAttributeType <em>Ref Attribute Type</em>}</li>
 *   <li>{@link qrmm.impl.AttributeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends CAEXObjectImpl implements Attribute {
	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefSemantic() <em>Ref Semantic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSemantic()
	 * @generated
	 * @ordered
	 */
	protected EList<RefSemantic> refSemantic;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValueRequirement> constraint;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The default value of the '{@link #getAttributeDataType() <em>Attribute Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeDataType() <em>Attribute Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDataType()
	 * @generated
	 * @ordered
	 */
	protected String attributeDataType = ATTRIBUTE_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefAttributeType() <em>Ref Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAttributeType()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ATTRIBUTE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefAttributeType() <em>Ref Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAttributeType()
	 * @generated
	 * @ordered
	 */
	protected String refAttributeType = REF_ATTRIBUTE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QrmmPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefSemantic> getRefSemantic() {
		if (refSemantic == null) {
			refSemantic = new EObjectContainmentEList<RefSemantic>(RefSemantic.class, this, QrmmPackage.ATTRIBUTE__REF_SEMANTIC);
		}
		return refSemantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueRequirement> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<AttributeValueRequirement>(AttributeValueRequirement.class, this, QrmmPackage.ATTRIBUTE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, QrmmPackage.ATTRIBUTE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeDataType() {
		return attributeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeDataType(String newAttributeDataType) {
		String oldAttributeDataType = attributeDataType;
		attributeDataType = newAttributeDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE, oldAttributeDataType, attributeDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefAttributeType() {
		return refAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefAttributeType(String newRefAttributeType) {
		String oldRefAttributeType = refAttributeType;
		refAttributeType = newRefAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE, oldRefAttributeType, refAttributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.ATTRIBUTE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QrmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return ((InternalEList<?>)getRefSemantic()).basicRemove(otherEnd, msgs);
			case QrmmPackage.ATTRIBUTE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case QrmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case QrmmPackage.ATTRIBUTE__VALUE:
				return getValue();
			case QrmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return getRefSemantic();
			case QrmmPackage.ATTRIBUTE__CONSTRAINT:
				return getConstraint();
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE:
				return getAttribute();
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				return getAttributeDataType();
			case QrmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE:
				return getRefAttributeType();
			case QrmmPackage.ATTRIBUTE__UNIT:
				return getUnit();
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
			case QrmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case QrmmPackage.ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case QrmmPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				getRefSemantic().addAll((Collection<? extends RefSemantic>)newValue);
				return;
			case QrmmPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends AttributeValueRequirement>)newValue);
				return;
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				setAttributeDataType((String)newValue);
				return;
			case QrmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE:
				setRefAttributeType((String)newValue);
				return;
			case QrmmPackage.ATTRIBUTE__UNIT:
				setUnit((String)newValue);
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
			case QrmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case QrmmPackage.ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case QrmmPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				return;
			case QrmmPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				return;
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				setAttributeDataType(ATTRIBUTE_DATA_TYPE_EDEFAULT);
				return;
			case QrmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE:
				setRefAttributeType(REF_ATTRIBUTE_TYPE_EDEFAULT);
				return;
			case QrmmPackage.ATTRIBUTE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case QrmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case QrmmPackage.ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case QrmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return refSemantic != null && !refSemantic.isEmpty();
			case QrmmPackage.ATTRIBUTE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QrmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
				return ATTRIBUTE_DATA_TYPE_EDEFAULT == null ? attributeDataType != null : !ATTRIBUTE_DATA_TYPE_EDEFAULT.equals(attributeDataType);
			case QrmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE:
				return REF_ATTRIBUTE_TYPE_EDEFAULT == null ? refAttributeType != null : !REF_ATTRIBUTE_TYPE_EDEFAULT.equals(refAttributeType);
			case QrmmPackage.ATTRIBUTE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", value: ");
		result.append(value);
		result.append(", attributeDataType: ");
		result.append(attributeDataType);
		result.append(", refAttributeType: ");
		result.append(refAttributeType);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
