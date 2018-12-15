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

import qmm.CAEXBasicObject;
import qmm.QmmPackage;
import qmm.RefSemantic;
import qmm.RefSemantic_correspondingAttributePath_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Semantic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RefSemanticImpl#getCorrespondingAttributePath_AttrEClass <em>Corresponding Attribute Path Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefSemanticImpl extends CAEXBasicObjectImpl implements RefSemantic {
	/**
	 * The cached value of the '{@link #getCorrespondingAttributePath_AttrEClass() <em>Corresponding Attribute Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingAttributePath_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected RefSemantic_correspondingAttributePath_AttrEClass correspondingAttributePath_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefSemanticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRefSemantic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSemantic_correspondingAttributePath_AttrEClass getCorrespondingAttributePath_AttrEClass() {
		return correspondingAttributePath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass newCorrespondingAttributePath_AttrEClass, NotificationChain msgs) {
		RefSemantic_correspondingAttributePath_AttrEClass oldCorrespondingAttributePath_AttrEClass = correspondingAttributePath_AttrEClass;
		correspondingAttributePath_AttrEClass = newCorrespondingAttributePath_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS, oldCorrespondingAttributePath_AttrEClass, newCorrespondingAttributePath_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass newCorrespondingAttributePath_AttrEClass) {
		if (newCorrespondingAttributePath_AttrEClass != correspondingAttributePath_AttrEClass) {
			NotificationChain msgs = null;
			if (correspondingAttributePath_AttrEClass != null)
				msgs = ((InternalEObject)correspondingAttributePath_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS, null, msgs);
			if (newCorrespondingAttributePath_AttrEClass != null)
				msgs = ((InternalEObject)newCorrespondingAttributePath_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS, null, msgs);
			msgs = basicSetCorrespondingAttributePath_AttrEClass(newCorrespondingAttributePath_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS, newCorrespondingAttributePath_AttrEClass, newCorrespondingAttributePath_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(final DiagnosticChain diagnostic, final Map context) {
		if(diagnostic!=null){
		    if(this.evaluationOperator != null){
		    	EList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);
		    	for(int i=0; i<diagnosticList.size(); i++){
		    		diagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return basicSetCorrespondingAttributePath_AttrEClass(null, msgs);
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return getCorrespondingAttributePath_AttrEClass();
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				setCorrespondingAttributePath_AttrEClass((RefSemantic_correspondingAttributePath_AttrEClass)newValue);
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				setCorrespondingAttributePath_AttrEClass((RefSemantic_correspondingAttributePath_AttrEClass)null);
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
			case QmmPackage.REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return correspondingAttributePath_AttrEClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CAEXBasicObject.class) {
			switch (baseOperationID) {
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.REF_SEMANTIC___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case QmmPackage.REF_SEMANTIC___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RefSemanticImpl
