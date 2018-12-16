/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qmm.CharSequence_ExpressionOperator;
import qmm.CharSequence_FunctionalOperator;
import qmm.CharSequence_Operator;
import qmm.ExpressionOperator;
import qmm.FunctionalOperator;
import qmm.QmmPackage;
import qmm.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Char Sequence Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CharSequence_FunctionalOperatorImpl extends OperatorImpl implements CharSequence_FunctionalOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharSequence_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCharSequence_FunctionalOperator();
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
		if (baseClass == CharSequence_Operator.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == CharSequence_ExpressionOperator.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				case QmmPackage.TYPED_ELEMENT___GET_TYPE: return QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE;
				default: return -1;
			}
		}
		if (baseClass == FunctionalOperator.class) {
			switch (baseOperationID) {
				case QmmPackage.FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR: return QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR;
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
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_LAST_OPERATOR:
				return getLastOperator();
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CharSequence_FunctionalOperatorImpl
