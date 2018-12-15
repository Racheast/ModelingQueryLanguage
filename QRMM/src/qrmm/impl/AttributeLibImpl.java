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

import qrmm.Attribute;
import qrmm.AttributeLib;
import qrmm.QrmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qrmm.impl.AttributeLibImpl#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeLibImpl extends CAEXObjectImpl implements AttributeLib {
	/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QrmmPackage.Literals.ATTRIBUTE_LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributeType() {
		if (attributeType == null) {
			attributeType = new EObjectContainmentEList<Attribute>(Attribute.class, this, QrmmPackage.ATTRIBUTE_LIB__ATTRIBUTE_TYPE);
		}
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QrmmPackage.ATTRIBUTE_LIB__ATTRIBUTE_TYPE:
				return ((InternalEList<?>)getAttributeType()).basicRemove(otherEnd, msgs);
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
			case QrmmPackage.ATTRIBUTE_LIB__ATTRIBUTE_TYPE:
				return getAttributeType();
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
			case QrmmPackage.ATTRIBUTE_LIB__ATTRIBUTE_TYPE:
				getAttributeType().clear();
				getAttributeType().addAll((Collection<? extends Attribute>)newValue);
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
			case QrmmPackage.ATTRIBUTE_LIB__ATTRIBUTE_TYPE:
				getAttributeType().clear();
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
			case QrmmPackage.ATTRIBUTE_LIB__ATTRIBUTE_TYPE:
				return attributeType != null && !attributeType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeLibImpl
