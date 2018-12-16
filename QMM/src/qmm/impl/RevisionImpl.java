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
import qmm.Revision;
import qmm.Revision_authorName_AttrEClass;
import qmm.Revision_comment_AttrEClass;
import qmm.Revision_newVersion_AttrEClass;
import qmm.Revision_oldVersion_AttrEClass;
import qmm.Revision_revisionDate_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.RevisionImpl#getRevisionDate_AttrEClass <em>Revision Date Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getOldVersion_AttrEClass <em>Old Version Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getNewVersion_AttrEClass <em>New Version Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getAuthorName_AttrEClass <em>Author Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.RevisionImpl#getComment_AttrEClass <em>Comment Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionImpl extends CAEXBasicObjectImpl implements Revision {
	/**
	 * The cached value of the '{@link #getRevisionDate_AttrEClass() <em>Revision Date Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Revision_revisionDate_AttrEClass revisionDate_AttrEClass;

	/**
	 * The cached value of the '{@link #getOldVersion_AttrEClass() <em>Old Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Revision_oldVersion_AttrEClass oldVersion_AttrEClass;

	/**
	 * The cached value of the '{@link #getNewVersion_AttrEClass() <em>New Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Revision_newVersion_AttrEClass newVersion_AttrEClass;

	/**
	 * The cached value of the '{@link #getAuthorName_AttrEClass() <em>Author Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Revision_authorName_AttrEClass authorName_AttrEClass;

	/**
	 * The cached value of the '{@link #getComment_AttrEClass() <em>Comment Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected Revision_comment_AttrEClass comment_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getRevision();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_revisionDate_AttrEClass getRevisionDate_AttrEClass() {
		return revisionDate_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisionDate_AttrEClass(Revision_revisionDate_AttrEClass newRevisionDate_AttrEClass, NotificationChain msgs) {
		Revision_revisionDate_AttrEClass oldRevisionDate_AttrEClass = revisionDate_AttrEClass;
		revisionDate_AttrEClass = newRevisionDate_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS, oldRevisionDate_AttrEClass, newRevisionDate_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionDate_AttrEClass(Revision_revisionDate_AttrEClass newRevisionDate_AttrEClass) {
		if (newRevisionDate_AttrEClass != revisionDate_AttrEClass) {
			NotificationChain msgs = null;
			if (revisionDate_AttrEClass != null)
				msgs = ((InternalEObject)revisionDate_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS, null, msgs);
			if (newRevisionDate_AttrEClass != null)
				msgs = ((InternalEObject)newRevisionDate_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS, null, msgs);
			msgs = basicSetRevisionDate_AttrEClass(newRevisionDate_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS, newRevisionDate_AttrEClass, newRevisionDate_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_oldVersion_AttrEClass getOldVersion_AttrEClass() {
		return oldVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOldVersion_AttrEClass(Revision_oldVersion_AttrEClass newOldVersion_AttrEClass, NotificationChain msgs) {
		Revision_oldVersion_AttrEClass oldOldVersion_AttrEClass = oldVersion_AttrEClass;
		oldVersion_AttrEClass = newOldVersion_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS, oldOldVersion_AttrEClass, newOldVersion_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldVersion_AttrEClass(Revision_oldVersion_AttrEClass newOldVersion_AttrEClass) {
		if (newOldVersion_AttrEClass != oldVersion_AttrEClass) {
			NotificationChain msgs = null;
			if (oldVersion_AttrEClass != null)
				msgs = ((InternalEObject)oldVersion_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS, null, msgs);
			if (newOldVersion_AttrEClass != null)
				msgs = ((InternalEObject)newOldVersion_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS, null, msgs);
			msgs = basicSetOldVersion_AttrEClass(newOldVersion_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS, newOldVersion_AttrEClass, newOldVersion_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_newVersion_AttrEClass getNewVersion_AttrEClass() {
		return newVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewVersion_AttrEClass(Revision_newVersion_AttrEClass newNewVersion_AttrEClass, NotificationChain msgs) {
		Revision_newVersion_AttrEClass oldNewVersion_AttrEClass = newVersion_AttrEClass;
		newVersion_AttrEClass = newNewVersion_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS, oldNewVersion_AttrEClass, newNewVersion_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewVersion_AttrEClass(Revision_newVersion_AttrEClass newNewVersion_AttrEClass) {
		if (newNewVersion_AttrEClass != newVersion_AttrEClass) {
			NotificationChain msgs = null;
			if (newVersion_AttrEClass != null)
				msgs = ((InternalEObject)newVersion_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS, null, msgs);
			if (newNewVersion_AttrEClass != null)
				msgs = ((InternalEObject)newNewVersion_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS, null, msgs);
			msgs = basicSetNewVersion_AttrEClass(newNewVersion_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS, newNewVersion_AttrEClass, newNewVersion_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_authorName_AttrEClass getAuthorName_AttrEClass() {
		return authorName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorName_AttrEClass(Revision_authorName_AttrEClass newAuthorName_AttrEClass, NotificationChain msgs) {
		Revision_authorName_AttrEClass oldAuthorName_AttrEClass = authorName_AttrEClass;
		authorName_AttrEClass = newAuthorName_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS, oldAuthorName_AttrEClass, newAuthorName_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorName_AttrEClass(Revision_authorName_AttrEClass newAuthorName_AttrEClass) {
		if (newAuthorName_AttrEClass != authorName_AttrEClass) {
			NotificationChain msgs = null;
			if (authorName_AttrEClass != null)
				msgs = ((InternalEObject)authorName_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS, null, msgs);
			if (newAuthorName_AttrEClass != null)
				msgs = ((InternalEObject)newAuthorName_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS, null, msgs);
			msgs = basicSetAuthorName_AttrEClass(newAuthorName_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS, newAuthorName_AttrEClass, newAuthorName_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_comment_AttrEClass getComment_AttrEClass() {
		return comment_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment_AttrEClass(Revision_comment_AttrEClass newComment_AttrEClass, NotificationChain msgs) {
		Revision_comment_AttrEClass oldComment_AttrEClass = comment_AttrEClass;
		comment_AttrEClass = newComment_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__COMMENT_ATTR_ECLASS, oldComment_AttrEClass, newComment_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment_AttrEClass(Revision_comment_AttrEClass newComment_AttrEClass) {
		if (newComment_AttrEClass != comment_AttrEClass) {
			NotificationChain msgs = null;
			if (comment_AttrEClass != null)
				msgs = ((InternalEObject)comment_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__COMMENT_ATTR_ECLASS, null, msgs);
			if (newComment_AttrEClass != null)
				msgs = ((InternalEObject)newComment_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.REVISION__COMMENT_ATTR_ECLASS, null, msgs);
			msgs = basicSetComment_AttrEClass(newComment_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.REVISION__COMMENT_ATTR_ECLASS, newComment_AttrEClass, newComment_AttrEClass));
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				return basicSetRevisionDate_AttrEClass(null, msgs);
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				return basicSetOldVersion_AttrEClass(null, msgs);
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				return basicSetNewVersion_AttrEClass(null, msgs);
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				return basicSetAuthorName_AttrEClass(null, msgs);
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				return basicSetComment_AttrEClass(null, msgs);
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				return getRevisionDate_AttrEClass();
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				return getOldVersion_AttrEClass();
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				return getNewVersion_AttrEClass();
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				return getAuthorName_AttrEClass();
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				return getComment_AttrEClass();
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				setRevisionDate_AttrEClass((Revision_revisionDate_AttrEClass)newValue);
				return;
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				setOldVersion_AttrEClass((Revision_oldVersion_AttrEClass)newValue);
				return;
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				setNewVersion_AttrEClass((Revision_newVersion_AttrEClass)newValue);
				return;
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				setAuthorName_AttrEClass((Revision_authorName_AttrEClass)newValue);
				return;
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				setComment_AttrEClass((Revision_comment_AttrEClass)newValue);
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				setRevisionDate_AttrEClass((Revision_revisionDate_AttrEClass)null);
				return;
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				setOldVersion_AttrEClass((Revision_oldVersion_AttrEClass)null);
				return;
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				setNewVersion_AttrEClass((Revision_newVersion_AttrEClass)null);
				return;
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				setAuthorName_AttrEClass((Revision_authorName_AttrEClass)null);
				return;
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				setComment_AttrEClass((Revision_comment_AttrEClass)null);
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
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
				return revisionDate_AttrEClass != null;
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
				return oldVersion_AttrEClass != null;
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
				return newVersion_AttrEClass != null;
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
				return authorName_AttrEClass != null;
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
				return comment_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.REVISION___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.REVISION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RevisionImpl
