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

import qmm.Attribute_OrGroup;
import qmm.CAEXBasicObject;
import qmm.CAEXObject;
import qmm.InterfaceClass_OrGroup;
import qmm.InternalElement_OrGroup;
import qmm.InternalLink_OrGroup;
import qmm.QmmPackage;
import qmm.SupportedRoleClass_OrGroup;
import qmm.SystemUnitClass;
import qmm.SystemUnitClass_OrGroup;
import qmm.SystemUnitClass_refBaseClassPath_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getSupportedRoleClass <em>Supported Role Class</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getInternalLink <em>Internal Link</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getSystemUnitClass <em>System Unit Class</em>}</li>
 *   <li>{@link qmm.impl.SystemUnitClassImpl#getRefBaseClassPath_AttrEClass <em>Ref Base Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemUnitClassImpl extends CAEXObjectImpl implements SystemUnitClass {
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
	 * The cached value of the '{@link #getInternalElement() <em>Internal Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalElement_OrGroup> internalElement;

	/**
	 * The cached value of the '{@link #getSupportedRoleClass() <em>Supported Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedRoleClass_OrGroup> supportedRoleClass;

	/**
	 * The cached value of the '{@link #getInternalLink() <em>Internal Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLink()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalLink_OrGroup> internalLink;

	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass_OrGroup> baseClass;

	/**
	 * The cached value of the '{@link #getSystemUnitClass() <em>System Unit Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass_OrGroup> systemUnitClass;

	/**
	 * The cached value of the '{@link #getRefBaseClassPath_AttrEClass() <em>Ref Base Class Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SystemUnitClass_refBaseClassPath_AttrEClass refBaseClassPath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getSystemUnitClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_OrGroup> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute_OrGroup>(Attribute_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE);
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
			externalInterface = new EObjectContainmentEList<InterfaceClass_OrGroup>(InterfaceClass_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalElement_OrGroup> getInternalElement() {
		if (internalElement == null) {
			internalElement = new EObjectContainmentEList<InternalElement_OrGroup>(InternalElement_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT);
		}
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedRoleClass_OrGroup> getSupportedRoleClass() {
		if (supportedRoleClass == null) {
			supportedRoleClass = new EObjectContainmentEList<SupportedRoleClass_OrGroup>(SupportedRoleClass_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS);
		}
		return supportedRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalLink_OrGroup> getInternalLink() {
		if (internalLink == null) {
			internalLink = new EObjectContainmentEList<InternalLink_OrGroup>(InternalLink_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK);
		}
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass_OrGroup> getBaseClass() {
		if (baseClass == null) {
			baseClass = new EObjectContainmentEList<SystemUnitClass_OrGroup>(SystemUnitClass_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS);
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass_OrGroup> getSystemUnitClass() {
		if (systemUnitClass == null) {
			systemUnitClass = new EObjectContainmentEList<SystemUnitClass_OrGroup>(SystemUnitClass_OrGroup.class, this, QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS);
		}
		return systemUnitClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass_refBaseClassPath_AttrEClass getRefBaseClassPath_AttrEClass() {
		return refBaseClassPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefBaseClassPath_AttrEClass(SystemUnitClass_refBaseClassPath_AttrEClass newRefBaseClassPath_AttrEClass, NotificationChain msgs) {
		SystemUnitClass_refBaseClassPath_AttrEClass oldRefBaseClassPath_AttrEClass = refBaseClassPath_AttrEClass;
		refBaseClassPath_AttrEClass = newRefBaseClassPath_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS, oldRefBaseClassPath_AttrEClass, newRefBaseClassPath_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseClassPath_AttrEClass(SystemUnitClass_refBaseClassPath_AttrEClass newRefBaseClassPath_AttrEClass) {
		if (newRefBaseClassPath_AttrEClass != refBaseClassPath_AttrEClass) {
			NotificationChain msgs = null;
			if (refBaseClassPath_AttrEClass != null)
				msgs = ((InternalEObject)refBaseClassPath_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS, null, msgs);
			if (newRefBaseClassPath_AttrEClass != null)
				msgs = ((InternalEObject)newRefBaseClassPath_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS, null, msgs);
			msgs = basicSetRefBaseClassPath_AttrEClass(newRefBaseClassPath_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS, newRefBaseClassPath_AttrEClass, newRefBaseClassPath_AttrEClass));
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
		
		final int internalElement_upperBound = -1;
		int nr_nonTransitive_internalElement = 0;
		if(this.internalElement != null){
				for(qmm.OrGroup og : this.internalElement) if(!og.isTransitive()) nr_nonTransitive_internalElement++;
		}
		if(nr_nonTransitive_internalElement > internalElement_upperBound && internalElement_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_internalElement + " non-transitive internalElement. Only " + internalElement_upperBound + " are allowed.",new Object[] { this }));
		
		final int supportedRoleClass_upperBound = -1;
		int nr_nonTransitive_supportedRoleClass = 0;
		if(this.supportedRoleClass != null){
				for(qmm.OrGroup og : this.supportedRoleClass) if(!og.isTransitive()) nr_nonTransitive_supportedRoleClass++;
		}
		if(nr_nonTransitive_supportedRoleClass > supportedRoleClass_upperBound && supportedRoleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_supportedRoleClass + " non-transitive supportedRoleClass. Only " + supportedRoleClass_upperBound + " are allowed.",new Object[] { this }));
		
		final int internalLink_upperBound = -1;
		int nr_nonTransitive_internalLink = 0;
		if(this.internalLink != null){
				for(qmm.OrGroup og : this.internalLink) if(!og.isTransitive()) nr_nonTransitive_internalLink++;
		}
		if(nr_nonTransitive_internalLink > internalLink_upperBound && internalLink_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_internalLink + " non-transitive internalLink. Only " + internalLink_upperBound + " are allowed.",new Object[] { this }));
		
		final int baseClass_upperBound = 1;
		int nr_nonTransitive_baseClass = 0;
		if(this.baseClass != null){
				for(qmm.OrGroup og : this.baseClass) if(!og.isTransitive()) nr_nonTransitive_baseClass++;
		}
		if(nr_nonTransitive_baseClass > baseClass_upperBound && baseClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_baseClass + " non-transitive baseClass. Only " + baseClass_upperBound + " are allowed.",new Object[] { this }));
		
		final int systemUnitClass_upperBound = -1;
		int nr_nonTransitive_systemUnitClass = 0;
		if(this.systemUnitClass != null){
				for(qmm.OrGroup og : this.systemUnitClass) if(!og.isTransitive()) nr_nonTransitive_systemUnitClass++;
		}
		if(nr_nonTransitive_systemUnitClass > systemUnitClass_upperBound && systemUnitClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_systemUnitClass + " non-transitive systemUnitClass. Only " + systemUnitClass_upperBound + " are allowed.",new Object[] { this }));
		
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return ((InternalEList<?>)getInternalElement()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return ((InternalEList<?>)getSupportedRoleClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return ((InternalEList<?>)getInternalLink()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				return ((InternalEList<?>)getBaseClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				return ((InternalEList<?>)getSystemUnitClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return basicSetRefBaseClassPath_AttrEClass(null, msgs);
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return getAttribute();
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return getInternalElement();
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return getSupportedRoleClass();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return getInternalLink();
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				return getBaseClass();
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				return getSystemUnitClass();
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return getRefBaseClassPath_AttrEClass();
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends InterfaceClass_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				getInternalElement().clear();
				getInternalElement().addAll((Collection<? extends InternalElement_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				getSupportedRoleClass().clear();
				getSupportedRoleClass().addAll((Collection<? extends SupportedRoleClass_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				getInternalLink().clear();
				getInternalLink().addAll((Collection<? extends InternalLink_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				getBaseClass().clear();
				getBaseClass().addAll((Collection<? extends SystemUnitClass_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				getSystemUnitClass().addAll((Collection<? extends SystemUnitClass_OrGroup>)newValue);
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				setRefBaseClassPath_AttrEClass((SystemUnitClass_refBaseClassPath_AttrEClass)newValue);
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				getInternalElement().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				getSupportedRoleClass().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				getInternalLink().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				getBaseClass().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				return;
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				setRefBaseClassPath_AttrEClass((SystemUnitClass_refBaseClassPath_AttrEClass)null);
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
				return internalElement != null && !internalElement.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
				return supportedRoleClass != null && !supportedRoleClass.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
				return internalLink != null && !internalLink.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
				return baseClass != null && !baseClass.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
				return systemUnitClass != null && !systemUnitClass.isEmpty();
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return refBaseClassPath_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.SYSTEM_UNIT_CLASS___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemUnitClassImpl
