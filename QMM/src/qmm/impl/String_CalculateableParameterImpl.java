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

import qmm.CalculateableParameter;
import qmm.Calculateable_Argument;
import qmm.Parameter;
import qmm.QmmPackage;
import qmm.String_CalculateableParameter;
import qmm.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Calculateable Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.String_CalculateableParameterImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class String_CalculateableParameterImpl extends String_TypeImpl implements String_CalculateableParameter {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected Calculateable_Argument argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String_CalculateableParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getString_CalculateableParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculateable_Argument getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(Calculateable_Argument newArgument, NotificationChain msgs) {
		Calculateable_Argument oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT, oldArgument, newArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(Calculateable_Argument newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT, null, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT, null, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		if (diagnostic != null) {
			String errorMessage = "";
			EClass thisType = (EClass) this.getType();
			if(this.argument!=null){
				if (this.argument.eGet(this.argument.eClass().getEStructuralFeature("operator")) != null) {
					qmm.FunctionalOperator lastFunctionalOperator = (qmm.FunctionalOperator) ((qmm.FunctionalOperator) this.argument.eGet(this.argument.eClass().getEStructuralFeature("operator"))).getLastOperator();
					EClass lastFunctionalOperatorType = (EClass)lastFunctionalOperator.getType();
					if (!thisType.isSuperTypeOf(lastFunctionalOperatorType)) {
						errorMessage = "Parameter " + this.toString() + ": Argument of type " + lastFunctionalOperatorType.getName() + " is not compatible with parametertype " + thisType.getName() + ".";
						diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage, new Object[] { this }));
					}
				} else {
					EClass argumentType = (EClass) this.argument.getType();
					if (!thisType.isSuperTypeOf(argumentType)) {
						errorMessage = "Parameter " + this.toString() + ": Argument of type " + argumentType.getName() + " is not compatible with parametertype " + thisType.getName() + ".";
						diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage, new Object[] { this }));
					}
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
	public Object getType() {
		EClass typeEClass = QmmPackage.eINSTANCE.getType();
		    EClass type = null;
		    for(EClass possibleTypeSubClass : this.eClass().getEAllSuperTypes()){
		    	if(typeEClass.isSuperTypeOf(possibleTypeSubClass) && !typeEClass.equals(possibleTypeSubClass)){
		    		type = possibleTypeSubClass;
		    	}
		    }
		    return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT:
				return basicSetArgument(null, msgs);
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
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT:
				return getArgument();
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
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT:
				setArgument((Calculateable_Argument)newValue);
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
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT:
				setArgument((Calculateable_Argument)null);
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
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT:
				return argument != null;
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CalculateableParameter.class) {
			switch (derivedFeatureID) {
				case QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT: return QmmPackage.CALCULATEABLE_PARAMETER__ARGUMENT;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CalculateableParameter.class) {
			switch (baseFeatureID) {
				case QmmPackage.CALCULATEABLE_PARAMETER__ARGUMENT: return QmmPackage.STRING_CALCULATEABLE_PARAMETER__ARGUMENT;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				case QmmPackage.TYPED_ELEMENT___GET_TYPE: return QmmPackage.STRING_CALCULATEABLE_PARAMETER___GET_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Parameter.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == CalculateableParameter.class) {
			switch (baseOperationID) {
				default: return -1;
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
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //String_CalculateableParameterImpl
