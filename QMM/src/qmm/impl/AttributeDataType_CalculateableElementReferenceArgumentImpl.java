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

import qmm.AttributeDataType_CalculateableElement;
import qmm.AttributeDataType_CalculateableElementReferenceArgument;
import qmm.AttributeDataType_FunctionalOperator;
import qmm.AttributeDataType_FunctionalType;
import qmm.AttributeDataType_Type;
import qmm.FunctionalType;
import qmm.QmmPackage;
import qmm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Data Type Calculateable Element Reference Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.AttributeDataType_CalculateableElementReferenceArgumentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qmm.impl.AttributeDataType_CalculateableElementReferenceArgumentImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDataType_CalculateableElementReferenceArgumentImpl extends CalculateableElement_ReferenceArgumentImpl implements AttributeDataType_CalculateableElementReferenceArgument {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected AttributeDataType_FunctionalOperator operator;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected AttributeDataType_CalculateableElement reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDataType_CalculateableElementReferenceArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getAttributeDataType_CalculateableElementReferenceArgument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(AttributeDataType_FunctionalOperator newOperator, NotificationChain msgs) {
		AttributeDataType_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(AttributeDataType_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_CalculateableElement getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (AttributeDataType_CalculateableElement)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_CalculateableElement basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(AttributeDataType_CalculateableElement newReference) {
		AttributeDataType_CalculateableElement oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		qmm.RootClass containingRootClass = null;
		qmm.RootClass referencesRootClass = null;
		qmm.AttributeEClass containingAttributeEClass = null;
		qmm.AttributeEClass referencesAttributeEClass = null;
		if(this.eContainer() != null && this.reference != null){
				org.eclipse.emf.ecore.EObject eContainer = this.eContainer();
		
				while(eContainer != null && !(eContainer instanceof qmm.RootClass)){
					if(eContainer instanceof qmm.AttributeEClass){
						containingAttributeEClass = (qmm.AttributeEClass)eContainer;
					}
					eContainer = eContainer.eContainer();
				}
				containingRootClass = (qmm.RootClass)eContainer;
		
				eContainer = this.reference.eContainer();
				while(eContainer != null && !(eContainer instanceof qmm.RootClass)){
					eContainer = eContainer.eContainer();
				}
		
				referencesRootClass = (qmm.RootClass)eContainer;
				if(this.reference instanceof qmm.AttributeEClass) referencesAttributeEClass = (qmm.AttributeEClass)this.reference;
		
				if(containingAttributeEClass != null && referencesAttributeEClass != null && containingAttributeEClass == referencesAttributeEClass){  //self-reference in expression !
					String errorMessage = "Self-reference in expression of attribute " + containingAttributeEClass.getName() + " detected. Self-references are not allowed!";
					diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));
				}
		
				if(containingRootClass != referencesRootClass){
					String errorMessage = "The referenced element " + this.reference + " is contained by a different parent-element than the expression's parent-element. Cross-references are not supported.";
					diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));
				}
		
				if(this.reference instanceof qmm.NegatableElement && ((qmm.NegatableElement)this.reference).isNegated())diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "Reference to a negated element in " + this + " has been detected. References to negated elements are not allowed.",new Object[] { this }));
		
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
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR:
				return basicSetOperator(null, msgs);
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
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR:
				return getOperator();
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
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
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR:
				setOperator((AttributeDataType_FunctionalOperator)newValue);
				return;
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE:
				setReference((AttributeDataType_CalculateableElement)newValue);
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
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR:
				setOperator((AttributeDataType_FunctionalOperator)null);
				return;
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE:
				setReference((AttributeDataType_CalculateableElement)null);
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
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR:
				return operator != null;
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AttributeDataType_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AttributeDataType_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR: return QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_TYPE__OPERATOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AttributeDataType_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AttributeDataType_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__OPERATOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeDataType_CalculateableElementReferenceArgumentImpl
