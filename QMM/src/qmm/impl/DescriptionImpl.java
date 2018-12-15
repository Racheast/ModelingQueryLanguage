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

import qmm.Description;
import qmm.Description_changeMode_AttrEClass;
import qmm.Description_value_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.DescriptionImpl#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.DescriptionImpl#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionImpl extends RootClassImpl implements Description {
	/**
	 * The cached value of the '{@link #getValue_AttrEClass() <em>Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Description_value_AttrEClass value_AttrEClass;

	/**
	 * The cached value of the '{@link #getChangeMode_AttrEClass() <em>Change Mode Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeMode_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Description_changeMode_AttrEClass changeMode_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description_value_AttrEClass getValue_AttrEClass() {
		return value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue_AttrEClass(Description_value_AttrEClass newValue_AttrEClass, NotificationChain msgs) {
		Description_value_AttrEClass oldValue_AttrEClass = value_AttrEClass;
		value_AttrEClass = newValue_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS, oldValue_AttrEClass, newValue_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_AttrEClass(Description_value_AttrEClass newValue_AttrEClass) {
		if (newValue_AttrEClass != value_AttrEClass) {
			NotificationChain msgs = null;
			if (value_AttrEClass != null)
				msgs = ((InternalEObject)value_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS, null, msgs);
			if (newValue_AttrEClass != null)
				msgs = ((InternalEObject)newValue_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS, null, msgs);
			msgs = basicSetValue_AttrEClass(newValue_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS, newValue_AttrEClass, newValue_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description_changeMode_AttrEClass getChangeMode_AttrEClass() {
		return changeMode_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeMode_AttrEClass(Description_changeMode_AttrEClass newChangeMode_AttrEClass, NotificationChain msgs) {
		Description_changeMode_AttrEClass oldChangeMode_AttrEClass = changeMode_AttrEClass;
		changeMode_AttrEClass = newChangeMode_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS, oldChangeMode_AttrEClass, newChangeMode_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeMode_AttrEClass(Description_changeMode_AttrEClass newChangeMode_AttrEClass) {
		if (newChangeMode_AttrEClass != changeMode_AttrEClass) {
			NotificationChain msgs = null;
			if (changeMode_AttrEClass != null)
				msgs = ((InternalEObject)changeMode_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS, null, msgs);
			if (newChangeMode_AttrEClass != null)
				msgs = ((InternalEObject)newChangeMode_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS, null, msgs);
			msgs = basicSetChangeMode_AttrEClass(newChangeMode_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS, newChangeMode_AttrEClass, newChangeMode_AttrEClass));
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
			case QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS:
				return basicSetValue_AttrEClass(null, msgs);
			case QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS:
				return basicSetChangeMode_AttrEClass(null, msgs);
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
			case QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS:
				return getValue_AttrEClass();
			case QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS:
				return getChangeMode_AttrEClass();
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
			case QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS:
				setValue_AttrEClass((Description_value_AttrEClass)newValue);
				return;
			case QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS:
				setChangeMode_AttrEClass((Description_changeMode_AttrEClass)newValue);
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
			case QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS:
				setValue_AttrEClass((Description_value_AttrEClass)null);
				return;
			case QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS:
				setChangeMode_AttrEClass((Description_changeMode_AttrEClass)null);
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
			case QmmPackage.DESCRIPTION__VALUE_ATTR_ECLASS:
				return value_AttrEClass != null;
			case QmmPackage.DESCRIPTION__CHANGE_MODE_ATTR_ECLASS:
				return changeMode_AttrEClass != null;
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
			case QmmPackage.DESCRIPTION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DescriptionImpl
