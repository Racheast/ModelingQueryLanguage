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

import qmm.QmmPackage;
import qmm.SourceDocumentInformation;
import qmm.SourceDocumentInformation_lastWritingDateTime_AttrEClass;
import qmm.SourceDocumentInformation_originID_AttrEClass;
import qmm.SourceDocumentInformation_originName_AttrEClass;
import qmm.SourceDocumentInformation_originProjectID_AttrEClass;
import qmm.SourceDocumentInformation_originProjectTitle_AttrEClass;
import qmm.SourceDocumentInformation_originRelease_AttrEClass;
import qmm.SourceDocumentInformation_originVendorURL_AttrEClass;
import qmm.SourceDocumentInformation_originVendor_AttrEClass;
import qmm.SourceDocumentInformation_originVersion_AttrEClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Document Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getLastWritingDateTime_AttrEClass <em>Last Writing Date Time Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginID_AttrEClass <em>Origin ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginName_AttrEClass <em>Origin Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginProjectID_AttrEClass <em>Origin Project ID Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginProjectTitle_AttrEClass <em>Origin Project Title Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginRelease_AttrEClass <em>Origin Release Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginVendor_AttrEClass <em>Origin Vendor Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginVendorURL_AttrEClass <em>Origin Vendor URL Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.SourceDocumentInformationImpl#getOriginVersion_AttrEClass <em>Origin Version Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceDocumentInformationImpl extends RootClassImpl implements SourceDocumentInformation {
	/**
	 * The cached value of the '{@link #getLastWritingDateTime_AttrEClass() <em>Last Writing Date Time Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWritingDateTime_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_lastWritingDateTime_AttrEClass lastWritingDateTime_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginID_AttrEClass() <em>Origin ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originID_AttrEClass originID_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginName_AttrEClass() <em>Origin Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originName_AttrEClass originName_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginProjectID_AttrEClass() <em>Origin Project ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectID_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originProjectID_AttrEClass originProjectID_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginProjectTitle_AttrEClass() <em>Origin Project Title Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectTitle_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originProjectTitle_AttrEClass originProjectTitle_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginRelease_AttrEClass() <em>Origin Release Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginRelease_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originRelease_AttrEClass originRelease_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginVendor_AttrEClass() <em>Origin Vendor Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendor_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originVendor_AttrEClass originVendor_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginVendorURL_AttrEClass() <em>Origin Vendor URL Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendorURL_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originVendorURL_AttrEClass originVendorURL_AttrEClass;

	/**
	 * The cached value of the '{@link #getOriginVersion_AttrEClass() <em>Origin Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected SourceDocumentInformation_originVersion_AttrEClass originVersion_AttrEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceDocumentInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QmmPackage.eINSTANCE.getSourceDocumentInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_lastWritingDateTime_AttrEClass getLastWritingDateTime_AttrEClass() {
		return lastWritingDateTime_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass newLastWritingDateTime_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_lastWritingDateTime_AttrEClass oldLastWritingDateTime_AttrEClass = lastWritingDateTime_AttrEClass;
		lastWritingDateTime_AttrEClass = newLastWritingDateTime_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS, oldLastWritingDateTime_AttrEClass, newLastWritingDateTime_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass newLastWritingDateTime_AttrEClass) {
		if (newLastWritingDateTime_AttrEClass != lastWritingDateTime_AttrEClass) {
			NotificationChain msgs = null;
			if (lastWritingDateTime_AttrEClass != null)
				msgs = ((InternalEObject)lastWritingDateTime_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS, null, msgs);
			if (newLastWritingDateTime_AttrEClass != null)
				msgs = ((InternalEObject)newLastWritingDateTime_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS, null, msgs);
			msgs = basicSetLastWritingDateTime_AttrEClass(newLastWritingDateTime_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS, newLastWritingDateTime_AttrEClass, newLastWritingDateTime_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originID_AttrEClass getOriginID_AttrEClass() {
		return originID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginID_AttrEClass(SourceDocumentInformation_originID_AttrEClass newOriginID_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originID_AttrEClass oldOriginID_AttrEClass = originID_AttrEClass;
		originID_AttrEClass = newOriginID_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS, oldOriginID_AttrEClass, newOriginID_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginID_AttrEClass(SourceDocumentInformation_originID_AttrEClass newOriginID_AttrEClass) {
		if (newOriginID_AttrEClass != originID_AttrEClass) {
			NotificationChain msgs = null;
			if (originID_AttrEClass != null)
				msgs = ((InternalEObject)originID_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS, null, msgs);
			if (newOriginID_AttrEClass != null)
				msgs = ((InternalEObject)newOriginID_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginID_AttrEClass(newOriginID_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS, newOriginID_AttrEClass, newOriginID_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originName_AttrEClass getOriginName_AttrEClass() {
		return originName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginName_AttrEClass(SourceDocumentInformation_originName_AttrEClass newOriginName_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originName_AttrEClass oldOriginName_AttrEClass = originName_AttrEClass;
		originName_AttrEClass = newOriginName_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS, oldOriginName_AttrEClass, newOriginName_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginName_AttrEClass(SourceDocumentInformation_originName_AttrEClass newOriginName_AttrEClass) {
		if (newOriginName_AttrEClass != originName_AttrEClass) {
			NotificationChain msgs = null;
			if (originName_AttrEClass != null)
				msgs = ((InternalEObject)originName_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS, null, msgs);
			if (newOriginName_AttrEClass != null)
				msgs = ((InternalEObject)newOriginName_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginName_AttrEClass(newOriginName_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS, newOriginName_AttrEClass, newOriginName_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originProjectID_AttrEClass getOriginProjectID_AttrEClass() {
		return originProjectID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass newOriginProjectID_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originProjectID_AttrEClass oldOriginProjectID_AttrEClass = originProjectID_AttrEClass;
		originProjectID_AttrEClass = newOriginProjectID_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS, oldOriginProjectID_AttrEClass, newOriginProjectID_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass newOriginProjectID_AttrEClass) {
		if (newOriginProjectID_AttrEClass != originProjectID_AttrEClass) {
			NotificationChain msgs = null;
			if (originProjectID_AttrEClass != null)
				msgs = ((InternalEObject)originProjectID_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS, null, msgs);
			if (newOriginProjectID_AttrEClass != null)
				msgs = ((InternalEObject)newOriginProjectID_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginProjectID_AttrEClass(newOriginProjectID_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS, newOriginProjectID_AttrEClass, newOriginProjectID_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originProjectTitle_AttrEClass getOriginProjectTitle_AttrEClass() {
		return originProjectTitle_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass newOriginProjectTitle_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originProjectTitle_AttrEClass oldOriginProjectTitle_AttrEClass = originProjectTitle_AttrEClass;
		originProjectTitle_AttrEClass = newOriginProjectTitle_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS, oldOriginProjectTitle_AttrEClass, newOriginProjectTitle_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass newOriginProjectTitle_AttrEClass) {
		if (newOriginProjectTitle_AttrEClass != originProjectTitle_AttrEClass) {
			NotificationChain msgs = null;
			if (originProjectTitle_AttrEClass != null)
				msgs = ((InternalEObject)originProjectTitle_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS, null, msgs);
			if (newOriginProjectTitle_AttrEClass != null)
				msgs = ((InternalEObject)newOriginProjectTitle_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginProjectTitle_AttrEClass(newOriginProjectTitle_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS, newOriginProjectTitle_AttrEClass, newOriginProjectTitle_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originRelease_AttrEClass getOriginRelease_AttrEClass() {
		return originRelease_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass newOriginRelease_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originRelease_AttrEClass oldOriginRelease_AttrEClass = originRelease_AttrEClass;
		originRelease_AttrEClass = newOriginRelease_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS, oldOriginRelease_AttrEClass, newOriginRelease_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass newOriginRelease_AttrEClass) {
		if (newOriginRelease_AttrEClass != originRelease_AttrEClass) {
			NotificationChain msgs = null;
			if (originRelease_AttrEClass != null)
				msgs = ((InternalEObject)originRelease_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS, null, msgs);
			if (newOriginRelease_AttrEClass != null)
				msgs = ((InternalEObject)newOriginRelease_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginRelease_AttrEClass(newOriginRelease_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS, newOriginRelease_AttrEClass, newOriginRelease_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originVendor_AttrEClass getOriginVendor_AttrEClass() {
		return originVendor_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass newOriginVendor_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originVendor_AttrEClass oldOriginVendor_AttrEClass = originVendor_AttrEClass;
		originVendor_AttrEClass = newOriginVendor_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS, oldOriginVendor_AttrEClass, newOriginVendor_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass newOriginVendor_AttrEClass) {
		if (newOriginVendor_AttrEClass != originVendor_AttrEClass) {
			NotificationChain msgs = null;
			if (originVendor_AttrEClass != null)
				msgs = ((InternalEObject)originVendor_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS, null, msgs);
			if (newOriginVendor_AttrEClass != null)
				msgs = ((InternalEObject)newOriginVendor_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginVendor_AttrEClass(newOriginVendor_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS, newOriginVendor_AttrEClass, newOriginVendor_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originVendorURL_AttrEClass getOriginVendorURL_AttrEClass() {
		return originVendorURL_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass newOriginVendorURL_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originVendorURL_AttrEClass oldOriginVendorURL_AttrEClass = originVendorURL_AttrEClass;
		originVendorURL_AttrEClass = newOriginVendorURL_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS, oldOriginVendorURL_AttrEClass, newOriginVendorURL_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass newOriginVendorURL_AttrEClass) {
		if (newOriginVendorURL_AttrEClass != originVendorURL_AttrEClass) {
			NotificationChain msgs = null;
			if (originVendorURL_AttrEClass != null)
				msgs = ((InternalEObject)originVendorURL_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS, null, msgs);
			if (newOriginVendorURL_AttrEClass != null)
				msgs = ((InternalEObject)newOriginVendorURL_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginVendorURL_AttrEClass(newOriginVendorURL_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS, newOriginVendorURL_AttrEClass, newOriginVendorURL_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originVersion_AttrEClass getOriginVersion_AttrEClass() {
		return originVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass newOriginVersion_AttrEClass, NotificationChain msgs) {
		SourceDocumentInformation_originVersion_AttrEClass oldOriginVersion_AttrEClass = originVersion_AttrEClass;
		originVersion_AttrEClass = newOriginVersion_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS, oldOriginVersion_AttrEClass, newOriginVersion_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass newOriginVersion_AttrEClass) {
		if (newOriginVersion_AttrEClass != originVersion_AttrEClass) {
			NotificationChain msgs = null;
			if (originVersion_AttrEClass != null)
				msgs = ((InternalEObject)originVersion_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS, null, msgs);
			if (newOriginVersion_AttrEClass != null)
				msgs = ((InternalEObject)newOriginVersion_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS, null, msgs);
			msgs = basicSetOriginVersion_AttrEClass(newOriginVersion_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS, newOriginVersion_AttrEClass, newOriginVersion_AttrEClass));
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return basicSetLastWritingDateTime_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				return basicSetOriginID_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				return basicSetOriginName_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return basicSetOriginProjectID_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return basicSetOriginProjectTitle_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				return basicSetOriginRelease_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				return basicSetOriginVendor_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return basicSetOriginVendorURL_AttrEClass(null, msgs);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				return basicSetOriginVersion_AttrEClass(null, msgs);
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return getLastWritingDateTime_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				return getOriginID_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				return getOriginName_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return getOriginProjectID_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return getOriginProjectTitle_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				return getOriginRelease_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				return getOriginVendor_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return getOriginVendorURL_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				return getOriginVersion_AttrEClass();
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				setLastWritingDateTime_AttrEClass((SourceDocumentInformation_lastWritingDateTime_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				setOriginID_AttrEClass((SourceDocumentInformation_originID_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				setOriginName_AttrEClass((SourceDocumentInformation_originName_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				setOriginProjectID_AttrEClass((SourceDocumentInformation_originProjectID_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				setOriginProjectTitle_AttrEClass((SourceDocumentInformation_originProjectTitle_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				setOriginRelease_AttrEClass((SourceDocumentInformation_originRelease_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				setOriginVendor_AttrEClass((SourceDocumentInformation_originVendor_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				setOriginVendorURL_AttrEClass((SourceDocumentInformation_originVendorURL_AttrEClass)newValue);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				setOriginVersion_AttrEClass((SourceDocumentInformation_originVersion_AttrEClass)newValue);
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				setLastWritingDateTime_AttrEClass((SourceDocumentInformation_lastWritingDateTime_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				setOriginID_AttrEClass((SourceDocumentInformation_originID_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				setOriginName_AttrEClass((SourceDocumentInformation_originName_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				setOriginProjectID_AttrEClass((SourceDocumentInformation_originProjectID_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				setOriginProjectTitle_AttrEClass((SourceDocumentInformation_originProjectTitle_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				setOriginRelease_AttrEClass((SourceDocumentInformation_originRelease_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				setOriginVendor_AttrEClass((SourceDocumentInformation_originVendor_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				setOriginVendorURL_AttrEClass((SourceDocumentInformation_originVendorURL_AttrEClass)null);
				return;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				setOriginVersion_AttrEClass((SourceDocumentInformation_originVersion_AttrEClass)null);
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return lastWritingDateTime_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
				return originID_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
				return originName_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return originProjectID_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return originProjectTitle_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
				return originRelease_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
				return originVendor_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return originVendorURL_AttrEClass != null;
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
				return originVersion_AttrEClass != null;
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
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SourceDocumentInformationImpl
