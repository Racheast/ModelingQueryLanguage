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

import qmm.Element;
import qmm.Element_name_AttrEClass;
import qmm.Element_value_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.ElementImpl#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.ElementImpl#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends RootClassImpl implements Element {
	/**
	 * The cached value of the '{@link #getName_AttrEClass() <em>Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Element_name_AttrEClass name_AttrEClass;

	/**
	 * The cached value of the '{@link #getValue_AttrEClass() <em>Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Element_value_AttrEClass value_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element_name_AttrEClass getName_AttrEClass() {
		return name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName_AttrEClass(Element_name_AttrEClass newName_AttrEClass, NotificationChain msgs) {
		Element_name_AttrEClass oldName_AttrEClass = name_AttrEClass;
		name_AttrEClass = newName_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ELEMENT__NAME_ATTR_ECLASS, oldName_AttrEClass, newName_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_AttrEClass(Element_name_AttrEClass newName_AttrEClass) {
		if (newName_AttrEClass != name_AttrEClass) {
			NotificationChain msgs = null;
			if (name_AttrEClass != null)
				msgs = ((InternalEObject)name_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ELEMENT__NAME_ATTR_ECLASS, null, msgs);
			if (newName_AttrEClass != null)
				msgs = ((InternalEObject)newName_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ELEMENT__NAME_ATTR_ECLASS, null, msgs);
			msgs = basicSetName_AttrEClass(newName_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ELEMENT__NAME_ATTR_ECLASS, newName_AttrEClass, newName_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element_value_AttrEClass getValue_AttrEClass() {
		return value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue_AttrEClass(Element_value_AttrEClass newValue_AttrEClass, NotificationChain msgs) {
		Element_value_AttrEClass oldValue_AttrEClass = value_AttrEClass;
		value_AttrEClass = newValue_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ELEMENT__VALUE_ATTR_ECLASS, oldValue_AttrEClass, newValue_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_AttrEClass(Element_value_AttrEClass newValue_AttrEClass) {
		if (newValue_AttrEClass != value_AttrEClass) {
			NotificationChain msgs = null;
			if (value_AttrEClass != null)
				msgs = ((InternalEObject)value_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ELEMENT__VALUE_ATTR_ECLASS, null, msgs);
			if (newValue_AttrEClass != null)
				msgs = ((InternalEObject)newValue_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ELEMENT__VALUE_ATTR_ECLASS, null, msgs);
			msgs = basicSetValue_AttrEClass(newValue_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ELEMENT__VALUE_ATTR_ECLASS, newValue_AttrEClass, newValue_AttrEClass));
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
			case QmmPackage.ELEMENT__NAME_ATTR_ECLASS:
				return basicSetName_AttrEClass(null, msgs);
			case QmmPackage.ELEMENT__VALUE_ATTR_ECLASS:
				return basicSetValue_AttrEClass(null, msgs);
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
			case QmmPackage.ELEMENT__NAME_ATTR_ECLASS:
				return getName_AttrEClass();
			case QmmPackage.ELEMENT__VALUE_ATTR_ECLASS:
				return getValue_AttrEClass();
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
			case QmmPackage.ELEMENT__NAME_ATTR_ECLASS:
				setName_AttrEClass((Element_name_AttrEClass)newValue);
				return;
			case QmmPackage.ELEMENT__VALUE_ATTR_ECLASS:
				setValue_AttrEClass((Element_value_AttrEClass)newValue);
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
			case QmmPackage.ELEMENT__NAME_ATTR_ECLASS:
				setName_AttrEClass((Element_name_AttrEClass)null);
				return;
			case QmmPackage.ELEMENT__VALUE_ATTR_ECLASS:
				setValue_AttrEClass((Element_value_AttrEClass)null);
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
			case QmmPackage.ELEMENT__NAME_ATTR_ECLASS:
				return name_AttrEClass != null;
			case QmmPackage.ELEMENT__VALUE_ATTR_ECLASS:
				return value_AttrEClass != null;
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
			case QmmPackage.ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ElementImpl
