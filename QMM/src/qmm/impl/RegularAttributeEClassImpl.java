/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qmm.QmmPackage;
import qmm.RegularAttributeEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Attribute EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RegularAttributeEClassImpl extends AttributeEClassImpl implements RegularAttributeEClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularAttributeEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRegularAttributeEClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList validateCheckExpression(final Object o) {
		EClass booleanType = QmmPackage.eINSTANCE.getBoolean_Type();
		EClass functionalOperatorType = QmmPackage.eINSTANCE.getFunctionalOperator();
		EClass bitOperatorType = QmmPackage.eINSTANCE.getBitOperator();
		qmm.Operator operator = (qmm.Operator)o;
		EList diagnosticList = new org.eclipse.emf.common.util.BasicEList();
		
		if(functionalOperatorType.isSuperTypeOf(operator.eClass())){
			qmm.FunctionalOperator lastOperator = (qmm.FunctionalOperator)((qmm.FunctionalOperator)operator).getLastOperator();
		    	EClass lastOperatorType = (EClass)lastOperator.getType();
		    	if(!booleanType.isSuperTypeOf(lastOperatorType)){
					String errorMessage = "Operator " + lastOperator.eClass().getName() + " of attribute " + this.eClass().getName() + " is of type " + lastOperatorType.getName() + ", but must be (a subtype) of type " + booleanType.getName() + ".";
		    		diagnosticList.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));
		    	}
		}else if(bitOperatorType.isSuperTypeOf(operator.eClass())){
		    for(qmm.Operator op : (EList<qmm.Operator>)operator.eGet(operator.eClass().getEStructuralFeature("connects"))){
		    	diagnosticList.addAll(validateCheckExpression(op));
		    }
		}
		return diagnosticList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS___VALIDATE_CHECK_EXPRESSION__OBJECT:
				return validateCheckExpression(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RegularAttributeEClassImpl
