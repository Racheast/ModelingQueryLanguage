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

import qmm.OrdinalScaledType;
import qmm.OrdinalScaledType_requiredMaxValue_AttrEClass;
import qmm.OrdinalScaledType_requiredMinValue_AttrEClass;
import qmm.OrdinalScaledType_requiredValue_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordinal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.OrdinalScaledTypeImpl#getRequiredMaxValue_AttrEClass <em>Required Max Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.OrdinalScaledTypeImpl#getRequiredValue_AttrEClass <em>Required Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.OrdinalScaledTypeImpl#getRequiredMinValue_AttrEClass <em>Required Min Value Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrdinalScaledTypeImpl extends RootClassImpl implements OrdinalScaledType {
	/**
	 * The cached value of the '{@link #getRequiredMaxValue_AttrEClass() <em>Required Max Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMaxValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected OrdinalScaledType_requiredMaxValue_AttrEClass requiredMaxValue_AttrEClass;

	/**
	 * The cached value of the '{@link #getRequiredValue_AttrEClass() <em>Required Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected OrdinalScaledType_requiredValue_AttrEClass requiredValue_AttrEClass;

	/**
	 * The cached value of the '{@link #getRequiredMinValue_AttrEClass() <em>Required Min Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMinValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected OrdinalScaledType_requiredMinValue_AttrEClass requiredMinValue_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdinalScaledTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getOrdinalScaledType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType_requiredMaxValue_AttrEClass getRequiredMaxValue_AttrEClass() {
		return requiredMaxValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass newRequiredMaxValue_AttrEClass, NotificationChain msgs) {
		OrdinalScaledType_requiredMaxValue_AttrEClass oldRequiredMaxValue_AttrEClass = requiredMaxValue_AttrEClass;
		requiredMaxValue_AttrEClass = newRequiredMaxValue_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS, oldRequiredMaxValue_AttrEClass, newRequiredMaxValue_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass newRequiredMaxValue_AttrEClass) {
		if (newRequiredMaxValue_AttrEClass != requiredMaxValue_AttrEClass) {
			NotificationChain msgs = null;
			if (requiredMaxValue_AttrEClass != null)
				msgs = ((InternalEObject)requiredMaxValue_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS, null, msgs);
			if (newRequiredMaxValue_AttrEClass != null)
				msgs = ((InternalEObject)newRequiredMaxValue_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS, null, msgs);
			msgs = basicSetRequiredMaxValue_AttrEClass(newRequiredMaxValue_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS, newRequiredMaxValue_AttrEClass, newRequiredMaxValue_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType_requiredValue_AttrEClass getRequiredValue_AttrEClass() {
		return requiredValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass newRequiredValue_AttrEClass, NotificationChain msgs) {
		OrdinalScaledType_requiredValue_AttrEClass oldRequiredValue_AttrEClass = requiredValue_AttrEClass;
		requiredValue_AttrEClass = newRequiredValue_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS, oldRequiredValue_AttrEClass, newRequiredValue_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass newRequiredValue_AttrEClass) {
		if (newRequiredValue_AttrEClass != requiredValue_AttrEClass) {
			NotificationChain msgs = null;
			if (requiredValue_AttrEClass != null)
				msgs = ((InternalEObject)requiredValue_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS, null, msgs);
			if (newRequiredValue_AttrEClass != null)
				msgs = ((InternalEObject)newRequiredValue_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS, null, msgs);
			msgs = basicSetRequiredValue_AttrEClass(newRequiredValue_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS, newRequiredValue_AttrEClass, newRequiredValue_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType_requiredMinValue_AttrEClass getRequiredMinValue_AttrEClass() {
		return requiredMinValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass newRequiredMinValue_AttrEClass, NotificationChain msgs) {
		OrdinalScaledType_requiredMinValue_AttrEClass oldRequiredMinValue_AttrEClass = requiredMinValue_AttrEClass;
		requiredMinValue_AttrEClass = newRequiredMinValue_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS, oldRequiredMinValue_AttrEClass, newRequiredMinValue_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass newRequiredMinValue_AttrEClass) {
		if (newRequiredMinValue_AttrEClass != requiredMinValue_AttrEClass) {
			NotificationChain msgs = null;
			if (requiredMinValue_AttrEClass != null)
				msgs = ((InternalEObject)requiredMinValue_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS, null, msgs);
			if (newRequiredMinValue_AttrEClass != null)
				msgs = ((InternalEObject)newRequiredMinValue_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS, null, msgs);
			msgs = basicSetRequiredMinValue_AttrEClass(newRequiredMinValue_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS, newRequiredMinValue_AttrEClass, newRequiredMinValue_AttrEClass));
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return basicSetRequiredMaxValue_AttrEClass(null, msgs);
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return basicSetRequiredValue_AttrEClass(null, msgs);
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return basicSetRequiredMinValue_AttrEClass(null, msgs);
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return getRequiredMaxValue_AttrEClass();
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return getRequiredValue_AttrEClass();
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return getRequiredMinValue_AttrEClass();
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				setRequiredMaxValue_AttrEClass((OrdinalScaledType_requiredMaxValue_AttrEClass)newValue);
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				setRequiredValue_AttrEClass((OrdinalScaledType_requiredValue_AttrEClass)newValue);
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				setRequiredMinValue_AttrEClass((OrdinalScaledType_requiredMinValue_AttrEClass)newValue);
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				setRequiredMaxValue_AttrEClass((OrdinalScaledType_requiredMaxValue_AttrEClass)null);
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				setRequiredValue_AttrEClass((OrdinalScaledType_requiredValue_AttrEClass)null);
				return;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				setRequiredMinValue_AttrEClass((OrdinalScaledType_requiredMinValue_AttrEClass)null);
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
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return requiredMaxValue_AttrEClass != null;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return requiredValue_AttrEClass != null;
			case QmmPackage.ORDINAL_SCALED_TYPE__REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return requiredMinValue_AttrEClass != null;
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
			case QmmPackage.ORDINAL_SCALED_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrdinalScaledTypeImpl
