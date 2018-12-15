/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qmm.DateTime_Or_BitOperator;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time Or Bit Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DateTime_Or_BitOperatorImpl extends DateTime_BitOperatorImpl implements DateTime_Or_BitOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTime_Or_BitOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getDateTime_Or_BitOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return "||";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.DATE_TIME_OR_BIT_OPERATOR___GET_LITERAL:
				return getLiteral();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DateTime_Or_BitOperatorImpl
