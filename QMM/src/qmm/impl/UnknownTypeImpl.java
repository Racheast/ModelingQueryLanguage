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

import qmm.QmmPackage;
import qmm.UnknownType;
import qmm.UnknownType_requirements_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.UnknownTypeImpl#getRequirements_AttrEClass <em>Requirements Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnknownTypeImpl extends RootClassImpl implements UnknownType {
	/**
	 * The cached value of the '{@link #getRequirements_AttrEClass() <em>Requirements Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected UnknownType_requirements_AttrEClass requirements_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getUnknownType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType_requirements_AttrEClass getRequirements_AttrEClass() {
		return requirements_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements_AttrEClass(UnknownType_requirements_AttrEClass newRequirements_AttrEClass, NotificationChain msgs) {
		UnknownType_requirements_AttrEClass oldRequirements_AttrEClass = requirements_AttrEClass;
		requirements_AttrEClass = newRequirements_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS, oldRequirements_AttrEClass, newRequirements_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements_AttrEClass(UnknownType_requirements_AttrEClass newRequirements_AttrEClass) {
		if (newRequirements_AttrEClass != requirements_AttrEClass) {
			NotificationChain msgs = null;
			if (requirements_AttrEClass != null)
				msgs = ((InternalEObject)requirements_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS, null, msgs);
			if (newRequirements_AttrEClass != null)
				msgs = ((InternalEObject)newRequirements_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS, null, msgs);
			msgs = basicSetRequirements_AttrEClass(newRequirements_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS, newRequirements_AttrEClass, newRequirements_AttrEClass));
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				return basicSetRequirements_AttrEClass(null, msgs);
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				return getRequirements_AttrEClass();
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				setRequirements_AttrEClass((UnknownType_requirements_AttrEClass)newValue);
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				setRequirements_AttrEClass((UnknownType_requirements_AttrEClass)null);
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
			case QmmPackage.UNKNOWN_TYPE__REQUIREMENTS_ATTR_ECLASS:
				return requirements_AttrEClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.UNKNOWN_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UnknownTypeImpl
