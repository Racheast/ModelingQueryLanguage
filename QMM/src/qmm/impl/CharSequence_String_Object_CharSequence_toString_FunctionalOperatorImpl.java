/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator;
import qmm.CharSequence_Type;
import qmm.FunctionalType;
import qmm.Object_Type;
import qmm.QmmPackage;
import qmm.String_FunctionalOperator;
import qmm.String_FunctionalType;
import qmm.String_Type;
import qmm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Char Sequence String Object Char Sequence to String Functional Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl extends InheritedFrom_CharSequence_to_String_FunctionalOperatorImpl implements CharSequence_String_Object_CharSequence_toString_FunctionalOperator {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String_FunctionalOperator operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getCharSequence_String_Object_CharSequence_toString_FunctionalOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_FunctionalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(String_FunctionalOperator newOperator, NotificationChain msgs) {
		String_FunctionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String_FunctionalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return ".toString";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllParameters() {
		EList parameterList = new org.eclipse.emf.common.util.BasicEList();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
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
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return getOperator();
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
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((String_FunctionalOperator)newValue);
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
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				setOperator((String_FunctionalOperator)null);
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
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR:
				return operator != null;
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
		if (baseClass == Object_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CharSequence_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_FunctionalType.class) {
			switch (derivedFeatureID) {
				case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR: return QmmPackage.STRING_FUNCTIONAL_TYPE__OPERATOR;
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
		if (baseClass == Object_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CharSequence_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FunctionalType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == String_FunctionalType.class) {
			switch (baseFeatureID) {
				case QmmPackage.STRING_FUNCTIONAL_TYPE__OPERATOR: return QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR__OPERATOR;
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
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_LITERAL:
				return getLiteral();
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR___GET_ALL_PARAMETERS:
				return getAllParameters();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl
