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

import qmm.Attribute;
import qmm.AttributeValueRequirement_OrGroup;
import qmm.Attribute_OrGroup;
import qmm.Attribute_attributeDataType_AttrEClass;
import qmm.Attribute_defaultValue_AttrEClass;
import qmm.Attribute_refAttributeType_AttrEClass;
import qmm.Attribute_unit_AttrEClass;
import qmm.Attribute_value_AttrEClass;
import qmm.CAEXBasicObject;
import qmm.CAEXObject;
import qmm.QmmPackage;
import qmm.RefSemantic_OrGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.AttributeImpl#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getDefaultValue_AttrEClass <em>Default Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getAttributeDataType_AttrEClass <em>Attribute Data Type Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getRefAttributeType_AttrEClass <em>Ref Attribute Type Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.AttributeImpl#getUnit_AttrEClass <em>Unit Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends CAEXObjectImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getRefSemantic() <em>Ref Semantic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSemantic()
	 * @generated
	 * @ordered
	 */
	protected EList<RefSemantic_OrGroup> refSemantic;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValueRequirement_OrGroup> constraint;

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
	 * The cached value of the '{@link #getDefaultValue_AttrEClass() <em>Default Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Attribute_defaultValue_AttrEClass defaultValue_AttrEClass;

	/**
	 * The cached value of the '{@link #getValue_AttrEClass() <em>Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Attribute_value_AttrEClass value_AttrEClass;

	/**
	 * The cached value of the '{@link #getAttributeDataType_AttrEClass() <em>Attribute Data Type Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDataType_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Attribute_attributeDataType_AttrEClass attributeDataType_AttrEClass;

	/**
	 * The cached value of the '{@link #getRefAttributeType_AttrEClass() <em>Ref Attribute Type Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAttributeType_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Attribute_refAttributeType_AttrEClass refAttributeType_AttrEClass;

	/**
	 * The cached value of the '{@link #getUnit_AttrEClass() <em>Unit Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Attribute_unit_AttrEClass unit_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefSemantic_OrGroup> getRefSemantic() {
		if (refSemantic == null) {
			refSemantic = new EObjectContainmentEList<RefSemantic_OrGroup>(RefSemantic_OrGroup.class, this, QmmPackage.ATTRIBUTE__REF_SEMANTIC);
		}
		return refSemantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValueRequirement_OrGroup> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<AttributeValueRequirement_OrGroup>(AttributeValueRequirement_OrGroup.class, this, QmmPackage.ATTRIBUTE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_OrGroup> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute_OrGroup>(Attribute_OrGroup.class, this, QmmPackage.ATTRIBUTE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_defaultValue_AttrEClass getDefaultValue_AttrEClass() {
		return defaultValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue_AttrEClass(Attribute_defaultValue_AttrEClass newDefaultValue_AttrEClass, NotificationChain msgs) {
		Attribute_defaultValue_AttrEClass oldDefaultValue_AttrEClass = defaultValue_AttrEClass;
		defaultValue_AttrEClass = newDefaultValue_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS, oldDefaultValue_AttrEClass, newDefaultValue_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue_AttrEClass(Attribute_defaultValue_AttrEClass newDefaultValue_AttrEClass) {
		if (newDefaultValue_AttrEClass != defaultValue_AttrEClass) {
			NotificationChain msgs = null;
			if (defaultValue_AttrEClass != null)
				msgs = ((InternalEObject)defaultValue_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS, null, msgs);
			if (newDefaultValue_AttrEClass != null)
				msgs = ((InternalEObject)newDefaultValue_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS, null, msgs);
			msgs = basicSetDefaultValue_AttrEClass(newDefaultValue_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS, newDefaultValue_AttrEClass, newDefaultValue_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_value_AttrEClass getValue_AttrEClass() {
		return value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue_AttrEClass(Attribute_value_AttrEClass newValue_AttrEClass, NotificationChain msgs) {
		Attribute_value_AttrEClass oldValue_AttrEClass = value_AttrEClass;
		value_AttrEClass = newValue_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS, oldValue_AttrEClass, newValue_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_AttrEClass(Attribute_value_AttrEClass newValue_AttrEClass) {
		if (newValue_AttrEClass != value_AttrEClass) {
			NotificationChain msgs = null;
			if (value_AttrEClass != null)
				msgs = ((InternalEObject)value_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS, null, msgs);
			if (newValue_AttrEClass != null)
				msgs = ((InternalEObject)newValue_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS, null, msgs);
			msgs = basicSetValue_AttrEClass(newValue_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS, newValue_AttrEClass, newValue_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_attributeDataType_AttrEClass getAttributeDataType_AttrEClass() {
		return attributeDataType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeDataType_AttrEClass(Attribute_attributeDataType_AttrEClass newAttributeDataType_AttrEClass, NotificationChain msgs) {
		Attribute_attributeDataType_AttrEClass oldAttributeDataType_AttrEClass = attributeDataType_AttrEClass;
		attributeDataType_AttrEClass = newAttributeDataType_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS, oldAttributeDataType_AttrEClass, newAttributeDataType_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeDataType_AttrEClass(Attribute_attributeDataType_AttrEClass newAttributeDataType_AttrEClass) {
		if (newAttributeDataType_AttrEClass != attributeDataType_AttrEClass) {
			NotificationChain msgs = null;
			if (attributeDataType_AttrEClass != null)
				msgs = ((InternalEObject)attributeDataType_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS, null, msgs);
			if (newAttributeDataType_AttrEClass != null)
				msgs = ((InternalEObject)newAttributeDataType_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS, null, msgs);
			msgs = basicSetAttributeDataType_AttrEClass(newAttributeDataType_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS, newAttributeDataType_AttrEClass, newAttributeDataType_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_refAttributeType_AttrEClass getRefAttributeType_AttrEClass() {
		return refAttributeType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefAttributeType_AttrEClass(Attribute_refAttributeType_AttrEClass newRefAttributeType_AttrEClass, NotificationChain msgs) {
		Attribute_refAttributeType_AttrEClass oldRefAttributeType_AttrEClass = refAttributeType_AttrEClass;
		refAttributeType_AttrEClass = newRefAttributeType_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS, oldRefAttributeType_AttrEClass, newRefAttributeType_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefAttributeType_AttrEClass(Attribute_refAttributeType_AttrEClass newRefAttributeType_AttrEClass) {
		if (newRefAttributeType_AttrEClass != refAttributeType_AttrEClass) {
			NotificationChain msgs = null;
			if (refAttributeType_AttrEClass != null)
				msgs = ((InternalEObject)refAttributeType_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS, null, msgs);
			if (newRefAttributeType_AttrEClass != null)
				msgs = ((InternalEObject)newRefAttributeType_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS, null, msgs);
			msgs = basicSetRefAttributeType_AttrEClass(newRefAttributeType_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS, newRefAttributeType_AttrEClass, newRefAttributeType_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_unit_AttrEClass getUnit_AttrEClass() {
		return unit_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit_AttrEClass(Attribute_unit_AttrEClass newUnit_AttrEClass, NotificationChain msgs) {
		Attribute_unit_AttrEClass oldUnit_AttrEClass = unit_AttrEClass;
		unit_AttrEClass = newUnit_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS, oldUnit_AttrEClass, newUnit_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit_AttrEClass(Attribute_unit_AttrEClass newUnit_AttrEClass) {
		if (newUnit_AttrEClass != unit_AttrEClass) {
			NotificationChain msgs = null;
			if (unit_AttrEClass != null)
				msgs = ((InternalEObject)unit_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS, null, msgs);
			if (newUnit_AttrEClass != null)
				msgs = ((InternalEObject)newUnit_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS, null, msgs);
			msgs = basicSetUnit_AttrEClass(newUnit_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS, newUnit_AttrEClass, newUnit_AttrEClass));
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
		
		final int refSemantic_upperBound = -1;
		int nr_nonTransitive_refSemantic = 0;
		if(this.refSemantic != null){
				for(qmm.OrGroup og : this.refSemantic) if(!og.isTransitive()) nr_nonTransitive_refSemantic++;
		}
		if(nr_nonTransitive_refSemantic > refSemantic_upperBound && refSemantic_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_refSemantic + " non-transitive refSemantic. Only " + refSemantic_upperBound + " are allowed.",new Object[] { this }));
		
		final int constraint_upperBound = -1;
		int nr_nonTransitive_constraint = 0;
		if(this.constraint != null){
				for(qmm.OrGroup og : this.constraint) if(!og.isTransitive()) nr_nonTransitive_constraint++;
		}
		if(nr_nonTransitive_constraint > constraint_upperBound && constraint_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_constraint + " non-transitive constraint. Only " + constraint_upperBound + " are allowed.",new Object[] { this }));
		
		final int attribute_upperBound = -1;
		int nr_nonTransitive_attribute = 0;
		if(this.attribute != null){
				for(qmm.OrGroup og : this.attribute) if(!og.isTransitive()) nr_nonTransitive_attribute++;
		}
		if(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_attribute + " non-transitive attribute. Only " + attribute_upperBound + " are allowed.",new Object[] { this }));
		
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return ((InternalEList<?>)getRefSemantic()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				return basicSetDefaultValue_AttrEClass(null, msgs);
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				return basicSetValue_AttrEClass(null, msgs);
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return basicSetAttributeDataType_AttrEClass(null, msgs);
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return basicSetRefAttributeType_AttrEClass(null, msgs);
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				return basicSetUnit_AttrEClass(null, msgs);
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return getRefSemantic();
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				return getConstraint();
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				return getAttribute();
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				return getDefaultValue_AttrEClass();
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				return getValue_AttrEClass();
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return getAttributeDataType_AttrEClass();
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return getRefAttributeType_AttrEClass();
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				return getUnit_AttrEClass();
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				getRefSemantic().addAll((Collection<? extends RefSemantic_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends AttributeValueRequirement_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute_OrGroup>)newValue);
				return;
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				setDefaultValue_AttrEClass((Attribute_defaultValue_AttrEClass)newValue);
				return;
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				setValue_AttrEClass((Attribute_value_AttrEClass)newValue);
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				setAttributeDataType_AttrEClass((Attribute_attributeDataType_AttrEClass)newValue);
				return;
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				setRefAttributeType_AttrEClass((Attribute_refAttributeType_AttrEClass)newValue);
				return;
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				setUnit_AttrEClass((Attribute_unit_AttrEClass)newValue);
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				getRefSemantic().clear();
				return;
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				getConstraint().clear();
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				setDefaultValue_AttrEClass((Attribute_defaultValue_AttrEClass)null);
				return;
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				setValue_AttrEClass((Attribute_value_AttrEClass)null);
				return;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				setAttributeDataType_AttrEClass((Attribute_attributeDataType_AttrEClass)null);
				return;
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				setRefAttributeType_AttrEClass((Attribute_refAttributeType_AttrEClass)null);
				return;
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				setUnit_AttrEClass((Attribute_unit_AttrEClass)null);
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
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
				return refSemantic != null && !refSemantic.isEmpty();
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
				return defaultValue_AttrEClass != null;
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
				return value_AttrEClass != null;
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return attributeDataType_AttrEClass != null;
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return refAttributeType_AttrEClass != null;
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
				return unit_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == CAEXObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.ATTRIBUTE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.ATTRIBUTE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeImpl
