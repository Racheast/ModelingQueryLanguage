/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qmm.Character_ExpressionOperator;
import qmm.Character_FunctionalOperator;
import qmm.Character_Operator;
import qmm.ExpressionOperator;
import qmm.FunctionalOperator;
import qmm.QmmPackage;
import qmm.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class Character_FunctionalOperatorImpl extends OperatorImpl implements Character_FunctionalOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Character_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCharacter_FunctionalOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLastOperator() {
		qmm.FunctionalOperator operator = this;
		while(operator.eGet(operator.eClass().getEStructuralFeature("operator")) != null){
		    operator = (qmm.FunctionalOperator) operator.eGet(operator.eClass().getEStructuralFeature("operator"));
		}
		return operator;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ExpressionOperator.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Character_Operator.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Character_ExpressionOperator.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				case QmmPackage.TYPED_ELEMENT___GET_TYPE: return QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE;
				default: return -1;
			}
		}
		if (baseClass == FunctionalOperator.class) {
			switch (baseOperationID) {
				case QmmPackage.FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR: return QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;
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
			case QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR:
				return getLastOperator();
			case QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Character_FunctionalOperatorImpl
