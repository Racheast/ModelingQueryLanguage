/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.AttributeNameMapping_OrGroup;
import qmm.CAEXBasicObject;
import qmm.InterfaceIDMapping_OrGroup;
import qmm.Mapping;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.MappingImpl#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link qmm.impl.MappingImpl#getInterfaceIDMapping <em>Interface ID Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends CAEXBasicObjectImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getAttributeNameMapping() <em>Attribute Name Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNameMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeNameMapping_OrGroup> attributeNameMapping;

	/**
	 * The cached value of the '{@link #getInterfaceIDMapping() <em>Interface ID Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceIDMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceIDMapping_OrGroup> interfaceIDMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeNameMapping_OrGroup> getAttributeNameMapping() {
		if (attributeNameMapping == null) {
			attributeNameMapping = new EObjectContainmentEList<AttributeNameMapping_OrGroup>(AttributeNameMapping_OrGroup.class, this, QmmPackage.MAPPING__ATTRIBUTE_NAME_MAPPING);
		}
		return attributeNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceIDMapping_OrGroup> getInterfaceIDMapping() {
		if (interfaceIDMapping == null) {
			interfaceIDMapping = new EObjectContainmentEList<InterfaceIDMapping_OrGroup>(InterfaceIDMapping_OrGroup.class, this, QmmPackage.MAPPING__INTERFACE_ID_MAPPING);
		}
		return interfaceIDMapping;
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
		
		final int attributeNameMapping_upperBound = -1;
		int nr_nonTransitive_attributeNameMapping = 0;
		if(this.attributeNameMapping != null){
				for(qmm.OrGroup og : this.attributeNameMapping) if(!og.isTransitive()) nr_nonTransitive_attributeNameMapping++;
		}
		if(nr_nonTransitive_attributeNameMapping > attributeNameMapping_upperBound && attributeNameMapping_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_attributeNameMapping + " non-transitive attributeNameMapping. Only " + attributeNameMapping_upperBound + " are allowed.",new Object[] { this }));
		
		final int interfaceIDMapping_upperBound = -1;
		int nr_nonTransitive_interfaceIDMapping = 0;
		if(this.interfaceIDMapping != null){
				for(qmm.OrGroup og : this.interfaceIDMapping) if(!og.isTransitive()) nr_nonTransitive_interfaceIDMapping++;
		}
		if(nr_nonTransitive_interfaceIDMapping > interfaceIDMapping_upperBound && interfaceIDMapping_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_interfaceIDMapping + " non-transitive interfaceIDMapping. Only " + interfaceIDMapping_upperBound + " are allowed.",new Object[] { this }));
		
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
			case QmmPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return ((InternalEList<?>)getAttributeNameMapping()).basicRemove(otherEnd, msgs);
			case QmmPackage.MAPPING__INTERFACE_ID_MAPPING:
				return ((InternalEList<?>)getInterfaceIDMapping()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return getAttributeNameMapping();
			case QmmPackage.MAPPING__INTERFACE_ID_MAPPING:
				return getInterfaceIDMapping();
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
			case QmmPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				getAttributeNameMapping().clear();
				getAttributeNameMapping().addAll((Collection<? extends AttributeNameMapping_OrGroup>)newValue);
				return;
			case QmmPackage.MAPPING__INTERFACE_ID_MAPPING:
				getInterfaceIDMapping().clear();
				getInterfaceIDMapping().addAll((Collection<? extends InterfaceIDMapping_OrGroup>)newValue);
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
			case QmmPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				getAttributeNameMapping().clear();
				return;
			case QmmPackage.MAPPING__INTERFACE_ID_MAPPING:
				getInterfaceIDMapping().clear();
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
			case QmmPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return attributeNameMapping != null && !attributeNameMapping.isEmpty();
			case QmmPackage.MAPPING__INTERFACE_ID_MAPPING:
				return interfaceIDMapping != null && !interfaceIDMapping.isEmpty();
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.MAPPING___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MappingImpl
