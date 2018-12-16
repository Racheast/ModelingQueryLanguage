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
import qmm.ExternalReferenceType;
import qmm.ExternalReferenceType_alias_AttrEClass;
import qmm.ExternalReferenceType_path_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.ExternalReferenceTypeImpl#getAlias_AttrEClass <em>Alias Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.ExternalReferenceTypeImpl#getPath_AttrEClass <em>Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalReferenceTypeImpl extends CAEXBasicObjectImpl implements ExternalReferenceType {
	/**
	 * The cached value of the '{@link #getAlias_AttrEClass() <em>Alias Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferenceType_alias_AttrEClass alias_AttrEClass;

	/**
	 * The cached value of the '{@link #getPath_AttrEClass() <em>Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferenceType_path_AttrEClass path_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getExternalReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType_alias_AttrEClass getAlias_AttrEClass() {
		return alias_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias_AttrEClass(ExternalReferenceType_alias_AttrEClass newAlias_AttrEClass, NotificationChain msgs) {
		ExternalReferenceType_alias_AttrEClass oldAlias_AttrEClass = alias_AttrEClass;
		alias_AttrEClass = newAlias_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS, oldAlias_AttrEClass, newAlias_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias_AttrEClass(ExternalReferenceType_alias_AttrEClass newAlias_AttrEClass) {
		if (newAlias_AttrEClass != alias_AttrEClass) {
			NotificationChain msgs = null;
			if (alias_AttrEClass != null)
				msgs = ((InternalEObject)alias_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS, null, msgs);
			if (newAlias_AttrEClass != null)
				msgs = ((InternalEObject)newAlias_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS, null, msgs);
			msgs = basicSetAlias_AttrEClass(newAlias_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS, newAlias_AttrEClass, newAlias_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType_path_AttrEClass getPath_AttrEClass() {
		return path_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath_AttrEClass(ExternalReferenceType_path_AttrEClass newPath_AttrEClass, NotificationChain msgs) {
		ExternalReferenceType_path_AttrEClass oldPath_AttrEClass = path_AttrEClass;
		path_AttrEClass = newPath_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS, oldPath_AttrEClass, newPath_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath_AttrEClass(ExternalReferenceType_path_AttrEClass newPath_AttrEClass) {
		if (newPath_AttrEClass != path_AttrEClass) {
			NotificationChain msgs = null;
			if (path_AttrEClass != null)
				msgs = ((InternalEObject)path_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS, null, msgs);
			if (newPath_AttrEClass != null)
				msgs = ((InternalEObject)newPath_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS, null, msgs);
			msgs = basicSetPath_AttrEClass(newPath_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS, newPath_AttrEClass, newPath_AttrEClass));
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				return basicSetAlias_AttrEClass(null, msgs);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				return basicSetPath_AttrEClass(null, msgs);
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				return getAlias_AttrEClass();
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				return getPath_AttrEClass();
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				setAlias_AttrEClass((ExternalReferenceType_alias_AttrEClass)newValue);
				return;
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				setPath_AttrEClass((ExternalReferenceType_path_AttrEClass)newValue);
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				setAlias_AttrEClass((ExternalReferenceType_alias_AttrEClass)null);
				return;
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				setPath_AttrEClass((ExternalReferenceType_path_AttrEClass)null);
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__ALIAS_ATTR_ECLASS:
				return alias_AttrEClass != null;
			case QmmPackage.EXTERNAL_REFERENCE_TYPE__PATH_ATTR_ECLASS:
				return path_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.EXTERNAL_REFERENCE_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.EXTERNAL_REFERENCE_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalReferenceTypeImpl
