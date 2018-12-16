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

import qmm.CAEXBasicObject;
import qmm.CAEXObject;
import qmm.InternalElement;
import qmm.InternalElement_refBaseSystemUnitPath_AttrEClass;
import qmm.QmmPackage;
import qmm.RoleRequirements_OrGroup;
import qmm.SystemUnitClass;
import qmm.SystemUnitClass_OrGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.InternalElementImpl#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link qmm.impl.InternalElementImpl#getBaseSystemUnit <em>Base System Unit</em>}</li>
 *   <li>{@link qmm.impl.InternalElementImpl#getRefBaseSystemUnitPath_AttrEClass <em>Ref Base System Unit Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalElementImpl extends SystemUnitClassImpl implements InternalElement {
	/**
	 * The cached value of the '{@link #getRoleRequirements() <em>Role Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleRequirements_OrGroup> roleRequirements;

	/**
	 * The cached value of the '{@link #getBaseSystemUnit() <em>Base System Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSystemUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass_OrGroup> baseSystemUnit;

	/**
	 * The cached value of the '{@link #getRefBaseSystemUnitPath_AttrEClass() <em>Ref Base System Unit Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseSystemUnitPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected InternalElement_refBaseSystemUnitPath_AttrEClass refBaseSystemUnitPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleRequirements_OrGroup> getRoleRequirements() {
		if (roleRequirements == null) {
			roleRequirements = new EObjectContainmentEList<RoleRequirements_OrGroup>(RoleRequirements_OrGroup.class, this, QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS);
		}
		return roleRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass_OrGroup> getBaseSystemUnit() {
		if (baseSystemUnit == null) {
			baseSystemUnit = new EObjectContainmentEList<SystemUnitClass_OrGroup>(SystemUnitClass_OrGroup.class, this, QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT);
		}
		return baseSystemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalElement_refBaseSystemUnitPath_AttrEClass getRefBaseSystemUnitPath_AttrEClass() {
		return refBaseSystemUnitPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefBaseSystemUnitPath_AttrEClass(InternalElement_refBaseSystemUnitPath_AttrEClass newRefBaseSystemUnitPath_AttrEClass, NotificationChain msgs) {
		InternalElement_refBaseSystemUnitPath_AttrEClass oldRefBaseSystemUnitPath_AttrEClass = refBaseSystemUnitPath_AttrEClass;
		refBaseSystemUnitPath_AttrEClass = newRefBaseSystemUnitPath_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS, oldRefBaseSystemUnitPath_AttrEClass, newRefBaseSystemUnitPath_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseSystemUnitPath_AttrEClass(InternalElement_refBaseSystemUnitPath_AttrEClass newRefBaseSystemUnitPath_AttrEClass) {
		if (newRefBaseSystemUnitPath_AttrEClass != refBaseSystemUnitPath_AttrEClass) {
			NotificationChain msgs = null;
			if (refBaseSystemUnitPath_AttrEClass != null)
				msgs = ((InternalEObject)refBaseSystemUnitPath_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS, null, msgs);
			if (newRefBaseSystemUnitPath_AttrEClass != null)
				msgs = ((InternalEObject)newRefBaseSystemUnitPath_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS, null, msgs);
			msgs = basicSetRefBaseSystemUnitPath_AttrEClass(newRefBaseSystemUnitPath_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS, newRefBaseSystemUnitPath_AttrEClass, newRefBaseSystemUnitPath_AttrEClass));
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
		
		final int roleRequirements_upperBound = -1;
		int nr_nonTransitive_roleRequirements = 0;
		if(this.roleRequirements != null){
				for(qmm.OrGroup og : this.roleRequirements) if(!og.isTransitive()) nr_nonTransitive_roleRequirements++;
		}
		if(nr_nonTransitive_roleRequirements > roleRequirements_upperBound && roleRequirements_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_roleRequirements + " non-transitive roleRequirements. Only " + roleRequirements_upperBound + " are allowed.",new Object[] { this }));
		
		final int baseSystemUnit_upperBound = 1;
		int nr_nonTransitive_baseSystemUnit = 0;
		if(this.baseSystemUnit != null){
				for(qmm.OrGroup og : this.baseSystemUnit) if(!og.isTransitive()) nr_nonTransitive_baseSystemUnit++;
		}
		if(nr_nonTransitive_baseSystemUnit > baseSystemUnit_upperBound && baseSystemUnit_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_baseSystemUnit + " non-transitive baseSystemUnit. Only " + baseSystemUnit_upperBound + " are allowed.",new Object[] { this }));
		
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return ((InternalEList<?>)getRoleRequirements()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				return ((InternalEList<?>)getBaseSystemUnit()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return basicSetRefBaseSystemUnitPath_AttrEClass(null, msgs);
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return getRoleRequirements();
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				return getBaseSystemUnit();
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return getRefBaseSystemUnitPath_AttrEClass();
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				getRoleRequirements().clear();
				getRoleRequirements().addAll((Collection<? extends RoleRequirements_OrGroup>)newValue);
				return;
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				getBaseSystemUnit().clear();
				getBaseSystemUnit().addAll((Collection<? extends SystemUnitClass_OrGroup>)newValue);
				return;
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				setRefBaseSystemUnitPath_AttrEClass((InternalElement_refBaseSystemUnitPath_AttrEClass)newValue);
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				getRoleRequirements().clear();
				return;
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				getBaseSystemUnit().clear();
				return;
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				setRefBaseSystemUnitPath_AttrEClass((InternalElement_refBaseSystemUnitPath_AttrEClass)null);
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
			case QmmPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return roleRequirements != null && !roleRequirements.isEmpty();
			case QmmPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				return baseSystemUnit != null && !baseSystemUnit.isEmpty();
			case QmmPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return refBaseSystemUnitPath_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SystemUnitClass.class) {
			switch (baseOperationID) {
				case QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.INTERNAL_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalElementImpl
