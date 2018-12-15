/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.AttributeValueRequirement;
import qmm.AttributeValueRequirement_name_AttrEClass;
import qmm.CAEXBasicObject;
import qmm.NominalScaledType_OrGroup;
import qmm.OrdinalScaledType_OrGroup;
import qmm.QmmPackage;
import qmm.UnknownType_OrGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.AttributeValueRequirementImpl#getOrdinalScaledType <em>Ordinal Scaled Type</em>}</li>
 *   <li>{@link qmm.impl.AttributeValueRequirementImpl#getNominalScaledType <em>Nominal Scaled Type</em>}</li>
 *   <li>{@link qmm.impl.AttributeValueRequirementImpl#getUnknownType <em>Unknown Type</em>}</li>
 *   <li>{@link qmm.impl.AttributeValueRequirementImpl#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValueRequirementImpl extends CAEXBasicObjectImpl implements AttributeValueRequirement {
	/**
	 * The cached value of the '{@link #getOrdinalScaledType() <em>Ordinal Scaled Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinalScaledType()
	 * @generated
	 * @ordered
	 */
	protected EList<OrdinalScaledType_OrGroup> ordinalScaledType;

	/**
	 * The cached value of the '{@link #getNominalScaledType() <em>Nominal Scaled Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalScaledType()
	 * @generated
	 * @ordered
	 */
	protected EList<NominalScaledType_OrGroup> nominalScaledType;

	/**
	 * The cached value of the '{@link #getUnknownType() <em>Unknown Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownType()
	 * @generated
	 * @ordered
	 */
	protected EList<UnknownType_OrGroup> unknownType;

	/**
	 * The cached value of the '{@link #getName_AttrEClass() <em>Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueRequirement_name_AttrEClass name_AttrEClass;

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
		return QmmPackage.eINSTANCE.getAttributeValueRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrdinalScaledType_OrGroup> getOrdinalScaledType() {
		if (ordinalScaledType == null) {
			ordinalScaledType = new EObjectContainmentEList<OrdinalScaledType_OrGroup>(OrdinalScaledType_OrGroup.class, this, QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE);
		}
		return ordinalScaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NominalScaledType_OrGroup> getNominalScaledType() {
		if (nominalScaledType == null) {
			nominalScaledType = new EObjectContainmentEList<NominalScaledType_OrGroup>(NominalScaledType_OrGroup.class, this, QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE);
		}
		return nominalScaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnknownType_OrGroup> getUnknownType() {
		if (unknownType == null) {
			unknownType = new EObjectContainmentEList<UnknownType_OrGroup>(UnknownType_OrGroup.class, this, QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE);
		}
		return unknownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRequirement_name_AttrEClass getName_AttrEClass() {
		return name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName_AttrEClass(AttributeValueRequirement_name_AttrEClass newName_AttrEClass, NotificationChain msgs) {
		AttributeValueRequirement_name_AttrEClass oldName_AttrEClass = name_AttrEClass;
		name_AttrEClass = newName_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS, oldName_AttrEClass, newName_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_AttrEClass(AttributeValueRequirement_name_AttrEClass newName_AttrEClass) {
		if (newName_AttrEClass != name_AttrEClass) {
			NotificationChain msgs = null;
			if (name_AttrEClass != null)
				msgs = ((InternalEObject)name_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS, null, msgs);
			if (newName_AttrEClass != null)
				msgs = ((InternalEObject)newName_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS, null, msgs);
			msgs = basicSetName_AttrEClass(newName_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS, newName_AttrEClass, newName_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		if(diagnostic!=null){
		    if(this.evaluationOperator != null){
		    	EList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);
		    	for(int i=0; i<diagnosticList.size(); i++){
		    		diagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));
		    	}
		    }
		}
		
		final int ordinalScaledType_upperBound = 1;
		int nr_nonTransitive_ordinalScaledType = 0;
		if(this.ordinalScaledType != null){
				for(qmm.OrGroup og : this.ordinalScaledType) if(!og.isTransitive()) nr_nonTransitive_ordinalScaledType++;
		}
		if(nr_nonTransitive_ordinalScaledType > ordinalScaledType_upperBound && ordinalScaledType_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_ordinalScaledType + " non-transitive ordinalScaledType. Only " + ordinalScaledType_upperBound + " are allowed.",new Object[] { this }));
		
		final int nominalScaledType_upperBound = 1;
		int nr_nonTransitive_nominalScaledType = 0;
		if(this.nominalScaledType != null){
				for(qmm.OrGroup og : this.nominalScaledType) if(!og.isTransitive()) nr_nonTransitive_nominalScaledType++;
		}
		if(nr_nonTransitive_nominalScaledType > nominalScaledType_upperBound && nominalScaledType_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_nominalScaledType + " non-transitive nominalScaledType. Only " + nominalScaledType_upperBound + " are allowed.",new Object[] { this }));
		
		final int unknownType_upperBound = 1;
		int nr_nonTransitive_unknownType = 0;
		if(this.unknownType != null){
				for(qmm.OrGroup og : this.unknownType) if(!og.isTransitive()) nr_nonTransitive_unknownType++;
		}
		if(nr_nonTransitive_unknownType > unknownType_upperBound && unknownType_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_unknownType + " non-transitive unknownType. Only " + unknownType_upperBound + " are allowed.",new Object[] { this }));
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				return ((InternalEList<?>)getOrdinalScaledType()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				return ((InternalEList<?>)getNominalScaledType()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				return ((InternalEList<?>)getUnknownType()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS:
				return basicSetName_AttrEClass(null, msgs);
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				return getOrdinalScaledType();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				return getNominalScaledType();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				return getUnknownType();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS:
				return getName_AttrEClass();
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				getOrdinalScaledType().clear();
				getOrdinalScaledType().addAll((Collection<? extends OrdinalScaledType_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				getNominalScaledType().clear();
				getNominalScaledType().addAll((Collection<? extends NominalScaledType_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				getUnknownType().clear();
				getUnknownType().addAll((Collection<? extends UnknownType_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS:
				setName_AttrEClass((AttributeValueRequirement_name_AttrEClass)newValue);
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				getOrdinalScaledType().clear();
				return;
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				getNominalScaledType().clear();
				return;
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				getUnknownType().clear();
				return;
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS:
				setName_AttrEClass((AttributeValueRequirement_name_AttrEClass)null);
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
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
				return ordinalScaledType != null && !ordinalScaledType.isEmpty();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
				return nominalScaledType != null && !nominalScaledType.isEmpty();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
				return unknownType != null && !unknownType.isEmpty();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME_ATTR_ECLASS:
				return name_AttrEClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeValueRequirementImpl