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

import qmm.NominalScaledType;
import qmm.NominalScaledType_requiredValue_AttrEClass;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nominal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.NominalScaledTypeImpl#getRequiredValue_AttrEClass <em>Required Value Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NominalScaledTypeImpl extends RootClassImpl implements NominalScaledType {
	/**
	 * The cached value of the '{@link #getRequiredValue_AttrEClass() <em>Required Value Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<NominalScaledType_requiredValue_AttrEClass> requiredValue_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NominalScaledTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getNominalScaledType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NominalScaledType_requiredValue_AttrEClass> getRequiredValue_AttrEClass() {
		if (requiredValue_AttrEClass == null) {
			requiredValue_AttrEClass = new EObjectContainmentEList<NominalScaledType_requiredValue_AttrEClass>(NominalScaledType_requiredValue_AttrEClass.class, this, QmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS);
		}
		return requiredValue_AttrEClass;
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
			case QmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return ((InternalEList<?>)getRequiredValue_AttrEClass()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return getRequiredValue_AttrEClass();
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
			case QmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				getRequiredValue_AttrEClass().clear();
				getRequiredValue_AttrEClass().addAll((Collection<? extends NominalScaledType_requiredValue_AttrEClass>)newValue);
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
			case QmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				getRequiredValue_AttrEClass().clear();
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
			case QmmPackage.NOMINAL_SCALED_TYPE__REQUIRED_VALUE_ATTR_ECLASS:
				return requiredValue_AttrEClass != null && !requiredValue_AttrEClass.isEmpty();
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
			case QmmPackage.NOMINAL_SCALED_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NominalScaledTypeImpl
