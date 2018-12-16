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
import qmm.Mapping_OrGroup;
import qmm.QmmPackage;
import qmm.RoleClass_OrGroup;
import qmm.SupportedRoleClass;
import qmm.SupportedRoleClass_refRoleClassPath_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Role Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.SupportedRoleClassImpl#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link qmm.impl.SupportedRoleClassImpl#getRoleClass <em>Role Class</em>}</li>
 *   <li>{@link qmm.impl.SupportedRoleClassImpl#getRefRoleClassPath_AttrEClass <em>Ref Role Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportedRoleClassImpl extends CAEXBasicObjectImpl implements SupportedRoleClass {
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
	 * The cached value of the '{@link #getRefRoleClassPath_AttrEClass() <em>Ref Role Class Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRoleClassPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SupportedRoleClass_refRoleClassPath_AttrEClass refRoleClassPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedRoleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getSupportedRoleClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping_OrGroup> getMappingObject() {
		if (mappingObject == null) {
			mappingObject = new EObjectContainmentEList<Mapping_OrGroup>(Mapping_OrGroup.class, this, QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT);
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
			roleClass = new EObjectContainmentEList<RoleClass_OrGroup>(RoleClass_OrGroup.class, this, QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS);
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedRoleClass_refRoleClassPath_AttrEClass getRefRoleClassPath_AttrEClass() {
		return refRoleClassPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefRoleClassPath_AttrEClass(SupportedRoleClass_refRoleClassPath_AttrEClass newRefRoleClassPath_AttrEClass, NotificationChain msgs) {
		SupportedRoleClass_refRoleClassPath_AttrEClass oldRefRoleClassPath_AttrEClass = refRoleClassPath_AttrEClass;
		refRoleClassPath_AttrEClass = newRefRoleClassPath_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS, oldRefRoleClassPath_AttrEClass, newRefRoleClassPath_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefRoleClassPath_AttrEClass(SupportedRoleClass_refRoleClassPath_AttrEClass newRefRoleClassPath_AttrEClass) {
		if (newRefRoleClassPath_AttrEClass != refRoleClassPath_AttrEClass) {
			NotificationChain msgs = null;
			if (refRoleClassPath_AttrEClass != null)
				msgs = ((InternalEObject)refRoleClassPath_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS, null, msgs);
			if (newRefRoleClassPath_AttrEClass != null)
				msgs = ((InternalEObject)newRefRoleClassPath_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS, null, msgs);
			msgs = basicSetRefRoleClassPath_AttrEClass(newRefRoleClassPath_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS, newRefRoleClassPath_AttrEClass, newRefRoleClassPath_AttrEClass));
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return ((InternalEList<?>)getMappingObject()).basicRemove(otherEnd, msgs);
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				return ((InternalEList<?>)getRoleClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return basicSetRefRoleClassPath_AttrEClass(null, msgs);
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return getMappingObject();
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				return getRoleClass();
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return getRefRoleClassPath_AttrEClass();
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				getMappingObject().clear();
				getMappingObject().addAll((Collection<? extends Mapping_OrGroup>)newValue);
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
				getRoleClass().addAll((Collection<? extends RoleClass_OrGroup>)newValue);
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				setRefRoleClassPath_AttrEClass((SupportedRoleClass_refRoleClassPath_AttrEClass)newValue);
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				getMappingObject().clear();
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
				return;
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				setRefRoleClassPath_AttrEClass((SupportedRoleClass_refRoleClassPath_AttrEClass)null);
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
			case QmmPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return mappingObject != null && !mappingObject.isEmpty();
			case QmmPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				return roleClass != null && !roleClass.isEmpty();
			case QmmPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return refRoleClassPath_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SUPPORTED_ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.SUPPORTED_ROLE_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SupportedRoleClassImpl
