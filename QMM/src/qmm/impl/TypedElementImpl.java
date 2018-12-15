/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qmm.QmmPackage;
import qmm.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypedElementImpl extends MinimalEObjectImpl.Container implements TypedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getTypedElement();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QmmPackage.TYPED_ELEMENT___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypedElementImpl
