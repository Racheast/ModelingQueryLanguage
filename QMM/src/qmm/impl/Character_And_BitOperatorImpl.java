/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qmm.Character_And_BitOperator;
import qmm.QmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character And Bit Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Character_And_BitOperatorImpl extends Character_BitOperatorImpl implements Character_And_BitOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Character_And_BitOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCharacter_And_BitOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return "&&";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR___GET_LITERAL:
				return getLiteral();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Character_And_BitOperatorImpl
