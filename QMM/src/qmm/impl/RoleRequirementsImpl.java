/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.Attribute_OrGroup;
import qmm.CAEXBasicObject;
import qmm.InterfaceClass_OrGroup;
import qmm.Mapping_OrGroup;
import qmm.QmmPackage;
import qmm.RoleClass_OrGroup;
import qmm.RoleRequirements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RoleRequirementsImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.impl.RoleRequirementsImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link qmm.impl.RoleRequirementsImpl#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link qmm.impl.RoleRequirementsImpl#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleRequirementsImpl extends CAEXBasicObjectImpl implements RoleRequirements {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_OrGroup> attribute;

	/**
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass_OrGroup> externalInterface;

	/**
	 * The cached value of the '{@link #getMappingObject() <em>Mapping Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping_OrGroup> mappingObject;

	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClass_OrGroup> roleClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRoleRequirements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_OrGroup> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute_OrGroup>(Attribute_OrGroup.class, this, QmmPackage.ROLE_REQUIREMENTS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass_OrGroup> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<InterfaceClass_OrGroup>(InterfaceClass_OrGroup.class, this, QmmPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping_OrGroup> getMappingObject() {
		if (mappingObject == null) {
			mappingObject = new EObjectContainmentEList<Mapping_OrGroup>(Mapping_OrGroup.class, this, QmmPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT);
		}
		return mappingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClass_OrGroup> getRoleClass() {
		if (roleClass == null) {
			roleClass = new EObjectContainmentEList<RoleClass_OrGroup>(RoleClass_OrGroup.class, this, QmmPackage.ROLE_REQUIREMENTS__ROLE_CLASS);
		}
		return roleClass;
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
		
		final int attribute_upperBound = -1;
		int nr_nonTransitive_attribute = 0;
		if(this.attribute != null){
				for(qmm.OrGroup og : this.attribute) if(!og.isTransitive()) nr_nonTransitive_attribute++;
		}
		if(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_attribute + " non-transitive attribute. Only " + attribute_upperBound + " are allowed.",new Object[] { this }));
		
		final int externalInterface_upperBound = -1;
		int nr_nonTransitive_externalInterface = 0;
		if(this.externalInterface != null){
				for(qmm.OrGroup og : this.externalInterface) if(!og.isTransitive()) nr_nonTransitive_externalInterface++;
		}
		if(nr_nonTransitive_externalInterface > externalInterface_upperBound && externalInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_externalInterface + " non-transitive externalInterface. Only " + externalInterface_upperBound + " are allowed.",new Object[] { this }));
		
		final int mappingObject_upperBound = 1;
		int nr_nonTransitive_mappingObject = 0;
		if(this.mappingObject != null){
				for(qmm.OrGroup og : this.mappingObject) if(!og.isTransitive()) nr_nonTransitive_mappingObject++;
		}
		if(nr_nonTransitive_mappingObject > mappingObject_upperBound && mappingObject_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_mappingObject + " non-transitive mappingObject. Only " + mappingObject_upperBound + " are allowed.",new Object[] { this }));
		
		final int roleClass_upperBound = 1;
		int nr_nonTransitive_roleClass = 0;
		if(this.roleClass != null){
				for(qmm.OrGroup og : this.roleClass) if(!og.isTransitive()) nr_nonTransitive_roleClass++;
		}
		if(nr_nonTransitive_roleClass > roleClass_upperBound && roleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_roleClass + " non-transitive roleClass. Only " + roleClass_upperBound + " are allowed.",new Object[] { this }));
		
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
			case QmmPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				return ((InternalEList<?>)getMappingObject()).basicRemove(otherEnd, msgs);
			case QmmPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				return ((InternalEList<?>)getRoleClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return getAttribute();
			case QmmPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case QmmPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				return getMappingObject();
			case QmmPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				return getRoleClass();
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
			case QmmPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute_OrGroup>)newValue);
				return;
			case QmmPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends InterfaceClass_OrGroup>)newValue);
				return;
			case QmmPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				getMappingObject().clear();
				getMappingObject().addAll((Collection<? extends Mapping_OrGroup>)newValue);
				return;
			case QmmPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				getRoleClass().clear();
				getRoleClass().addAll((Collection<? extends RoleClass_OrGroup>)newValue);
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
			case QmmPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QmmPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case QmmPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				getMappingObject().clear();
				return;
			case QmmPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				getRoleClass().clear();
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
			case QmmPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QmmPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case QmmPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				return mappingObject != null && !mappingObject.isEmpty();
			case QmmPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				return roleClass != null && !roleClass.isEmpty();
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ROLE_REQUIREMENTS___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.ROLE_REQUIREMENTS___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoleRequirementsImpl
