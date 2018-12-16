/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.CAEXBasicObject;
import qmm.CAEXObject;
import qmm.CAEXObject_iD_AttrEClass;
import qmm.CAEXObject_name_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAEX Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CAEXObjectImpl#getID_AttrEClass <em>ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.CAEXObjectImpl#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAEXObjectImpl extends CAEXBasicObjectImpl implements CAEXObject {
	/**
	 * The cached value of the '{@link #getID_AttrEClass() <em>ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected CAEXObject_iD_AttrEClass iD_AttrEClass;

	/**
	 * The cached value of the '{@link #getName_AttrEClass() <em>Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected CAEXObject_name_AttrEClass name_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAEXObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCAEXObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXObject_iD_AttrEClass getID_AttrEClass() {
		return iD_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetID_AttrEClass(CAEXObject_iD_AttrEClass newID_AttrEClass, NotificationChain msgs) {
		CAEXObject_iD_AttrEClass oldID_AttrEClass = iD_AttrEClass;
		iD_AttrEClass = newID_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS, oldID_AttrEClass, newID_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_AttrEClass(CAEXObject_iD_AttrEClass newID_AttrEClass) {
		if (newID_AttrEClass != iD_AttrEClass) {
			NotificationChain msgs = null;
			if (iD_AttrEClass != null)
				msgs = ((InternalEObject)iD_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS, null, msgs);
			if (newID_AttrEClass != null)
				msgs = ((InternalEObject)newID_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS, null, msgs);
			msgs = basicSetID_AttrEClass(newID_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS, newID_AttrEClass, newID_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXObject_name_AttrEClass getName_AttrEClass() {
		return name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName_AttrEClass(CAEXObject_name_AttrEClass newName_AttrEClass, NotificationChain msgs) {
		CAEXObject_name_AttrEClass oldName_AttrEClass = name_AttrEClass;
		name_AttrEClass = newName_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS, oldName_AttrEClass, newName_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_AttrEClass(CAEXObject_name_AttrEClass newName_AttrEClass) {
		if (newName_AttrEClass != name_AttrEClass) {
			NotificationChain msgs = null;
			if (name_AttrEClass != null)
				msgs = ((InternalEObject)name_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS, null, msgs);
			if (newName_AttrEClass != null)
				msgs = ((InternalEObject)newName_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS, null, msgs);
			msgs = basicSetName_AttrEClass(newName_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS, newName_AttrEClass, newName_AttrEClass));
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				return basicSetID_AttrEClass(null, msgs);
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				return getID_AttrEClass();
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				return getName_AttrEClass();
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				setID_AttrEClass((CAEXObject_iD_AttrEClass)newValue);
				return;
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				setName_AttrEClass((CAEXObject_name_AttrEClass)newValue);
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				setID_AttrEClass((CAEXObject_iD_AttrEClass)null);
				return;
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
				setName_AttrEClass((CAEXObject_name_AttrEClass)null);
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
			case QmmPackage.CAEX_OBJECT__ID_ATTR_ECLASS:
				return iD_AttrEClass != null;
			case QmmPackage.CAEX_OBJECT__NAME_ATTR_ECLASS:
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CAEXObjectImpl
