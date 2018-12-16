/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.EvaluationOperator;
import qmm.QmmPackage;
import qmm.RootClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RootClassImpl#getEvaluationOperator <em>Evaluation Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RootClassImpl extends MinimalEObjectImpl.Container implements RootClass {
	/**
	 * The cached value of the '{@link #getEvaluationOperator() <em>Evaluation Operator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationOperator> evaluationOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRootClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationOperator> getEvaluationOperator() {
		if (evaluationOperator == null) {
			evaluationOperator = new EObjectContainmentEList<EvaluationOperator>(EvaluationOperator.class, this, QmmPackage.ROOT_CLASS__EVALUATION_OPERATOR);
		}
		return evaluationOperator;
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
	public EList validateAllCheckExpressions(final Object o) {
		
			EList<qmm.Operator> operators = (EList<qmm.Operator>)o;
			EList diagnosticList = new org.eclipse.emf.common.util.BasicEList();
			if(operators != null){
				for(qmm.Operator operator:operators){
					diagnosticList.addAll(validateCheckExpression(operator));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.ROOT_CLASS__EVALUATION_OPERATOR:
				return ((InternalEList<?>)getEvaluationOperator()).basicRemove(otherEnd, msgs);
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
			case QmmPackage.ROOT_CLASS__EVALUATION_OPERATOR:
				return getEvaluationOperator();
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
			case QmmPackage.ROOT_CLASS__EVALUATION_OPERATOR:
				getEvaluationOperator().clear();
				getEvaluationOperator().addAll((Collection<? extends EvaluationOperator>)newValue);
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
			case QmmPackage.ROOT_CLASS__EVALUATION_OPERATOR:
				getEvaluationOperator().clear();
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
			case QmmPackage.ROOT_CLASS__EVALUATION_OPERATOR:
				return evaluationOperator != null && !evaluationOperator.isEmpty();
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
			case QmmPackage.ROOT_CLASS___VALIDATE_CHECK_EXPRESSION__OBJECT:
				return validateCheckExpression(arguments.get(0));
			case QmmPackage.ROOT_CLASS___VALIDATE_ALL_CHECK_EXPRESSIONS__OBJECT:
				return validateAllCheckExpressions(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootClassImpl
