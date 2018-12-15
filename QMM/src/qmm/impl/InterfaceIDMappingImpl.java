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
import qmm.ExternalInterface_OrGroup;
import qmm.InterfaceIDMapping;
import qmm.InterfaceIDMapping_roleInterfaceID_AttrEClass;
import qmm.InterfaceIDMapping_systemUnitInterfaceID_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface ID Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getRoleInterfaceID_AttrEClass <em>Role Interface ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.InterfaceIDMappingImpl#getSystemUnitInterfaceID_AttrEClass <em>System Unit Interface ID Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceIDMappingImpl extends CAEXBasicObjectImpl implements InterfaceIDMapping {
	/**
	 * The cached value of the '{@link #getRoleInterface() <em>Role Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface_OrGroup> roleInterface;

	/**
	 * The cached value of the '{@link #getSystemUnitInterface() <em>System Unit Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface_OrGroup> systemUnitInterface;

	/**
	 * The cached value of the '{@link #getRoleInterfaceID_AttrEClass() <em>Role Interface ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected InterfaceIDMapping_roleInterfaceID_AttrEClass roleInterfaceID_AttrEClass;

	/**
	 * The cached value of the '{@link #getSystemUnitInterfaceID_AttrEClass() <em>System Unit Interface ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected InterfaceIDMapping_systemUnitInterfaceID_AttrEClass systemUnitInterfaceID_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceIDMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getInterfaceIDMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface_OrGroup> getRoleInterface() {
		if (roleInterface == null) {
			roleInterface = new EObjectContainmentEList<ExternalInterface_OrGroup>(ExternalInterface_OrGroup.class, this, QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE);
		}
		return roleInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface_OrGroup> getSystemUnitInterface() {
		if (systemUnitInterface == null) {
			systemUnitInterface = new EObjectContainmentEList<ExternalInterface_OrGroup>(ExternalInterface_OrGroup.class, this, QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE);
		}
		return systemUnitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceIDMapping_roleInterfaceID_AttrEClass getRoleInterfaceID_AttrEClass() {
		return roleInterfaceID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass newRoleInterfaceID_AttrEClass, NotificationChain msgs) {
		InterfaceIDMapping_roleInterfaceID_AttrEClass oldRoleInterfaceID_AttrEClass = roleInterfaceID_AttrEClass;
		roleInterfaceID_AttrEClass = newRoleInterfaceID_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS, oldRoleInterfaceID_AttrEClass, newRoleInterfaceID_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass newRoleInterfaceID_AttrEClass) {
		if (newRoleInterfaceID_AttrEClass != roleInterfaceID_AttrEClass) {
			NotificationChain msgs = null;
			if (roleInterfaceID_AttrEClass != null)
				msgs = ((InternalEObject)roleInterfaceID_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS, null, msgs);
			if (newRoleInterfaceID_AttrEClass != null)
				msgs = ((InternalEObject)newRoleInterfaceID_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS, null, msgs);
			msgs = basicSetRoleInterfaceID_AttrEClass(newRoleInterfaceID_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS, newRoleInterfaceID_AttrEClass, newRoleInterfaceID_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceIDMapping_systemUnitInterfaceID_AttrEClass getSystemUnitInterfaceID_AttrEClass() {
		return systemUnitInterfaceID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass newSystemUnitInterfaceID_AttrEClass, NotificationChain msgs) {
		InterfaceIDMapping_systemUnitInterfaceID_AttrEClass oldSystemUnitInterfaceID_AttrEClass = systemUnitInterfaceID_AttrEClass;
		systemUnitInterfaceID_AttrEClass = newSystemUnitInterfaceID_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS, oldSystemUnitInterfaceID_AttrEClass, newSystemUnitInterfaceID_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass newSystemUnitInterfaceID_AttrEClass) {
		if (newSystemUnitInterfaceID_AttrEClass != systemUnitInterfaceID_AttrEClass) {
			NotificationChain msgs = null;
			if (systemUnitInterfaceID_AttrEClass != null)
				msgs = ((InternalEObject)systemUnitInterfaceID_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS, null, msgs);
			if (newSystemUnitInterfaceID_AttrEClass != null)
				msgs = ((InternalEObject)newSystemUnitInterfaceID_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS, null, msgs);
			msgs = basicSetSystemUnitInterfaceID_AttrEClass(newSystemUnitInterfaceID_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS, newSystemUnitInterfaceID_AttrEClass, newSystemUnitInterfaceID_AttrEClass));
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
		
		final int roleInterface_upperBound = 1;
		int nr_nonTransitive_roleInterface = 0;
		if(this.roleInterface != null){
				for(qmm.OrGroup og : this.roleInterface) if(!og.isTransitive()) nr_nonTransitive_roleInterface++;
		}
		if(nr_nonTransitive_roleInterface > roleInterface_upperBound && roleInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_roleInterface + " non-transitive roleInterface. Only " + roleInterface_upperBound + " are allowed.",new Object[] { this }));
		
		final int systemUnitInterface_upperBound = 1;
		int nr_nonTransitive_systemUnitInterface = 0;
		if(this.systemUnitInterface != null){
				for(qmm.OrGroup og : this.systemUnitInterface) if(!og.isTransitive()) nr_nonTransitive_systemUnitInterface++;
		}
		if(nr_nonTransitive_systemUnitInterface > systemUnitInterface_upperBound && systemUnitInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_systemUnitInterface + " non-transitive systemUnitInterface. Only " + systemUnitInterface_upperBound + " are allowed.",new Object[] { this }));
		
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				return ((InternalEList<?>)getRoleInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				return ((InternalEList<?>)getSystemUnitInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				return basicSetRoleInterfaceID_AttrEClass(null, msgs);
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return basicSetSystemUnitInterfaceID_AttrEClass(null, msgs);
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				return getRoleInterface();
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				return getSystemUnitInterface();
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				return getRoleInterfaceID_AttrEClass();
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return getSystemUnitInterfaceID_AttrEClass();
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				getRoleInterface().clear();
				getRoleInterface().addAll((Collection<? extends ExternalInterface_OrGroup>)newValue);
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				getSystemUnitInterface().clear();
				getSystemUnitInterface().addAll((Collection<? extends ExternalInterface_OrGroup>)newValue);
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				setRoleInterfaceID_AttrEClass((InterfaceIDMapping_roleInterfaceID_AttrEClass)newValue);
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				setSystemUnitInterfaceID_AttrEClass((InterfaceIDMapping_systemUnitInterfaceID_AttrEClass)newValue);
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				getRoleInterface().clear();
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				getSystemUnitInterface().clear();
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				setRoleInterfaceID_AttrEClass((InterfaceIDMapping_roleInterfaceID_AttrEClass)null);
				return;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				setSystemUnitInterfaceID_AttrEClass((InterfaceIDMapping_systemUnitInterfaceID_AttrEClass)null);
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
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				return roleInterface != null && !roleInterface.isEmpty();
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				return systemUnitInterface != null && !systemUnitInterface.isEmpty();
			case QmmPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID_ATTR_ECLASS:
				return roleInterfaceID_AttrEClass != null;
			case QmmPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return systemUnitInterfaceID_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.INTERFACE_ID_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.INTERFACE_ID_MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterfaceIDMappingImpl
