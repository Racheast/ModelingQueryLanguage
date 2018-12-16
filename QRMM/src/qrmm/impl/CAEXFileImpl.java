/**
 */
package qrmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qrmm.AttributeLib;
import qrmm.CAEXFile;
import qrmm.ExternalReferenceType;
import qrmm.InstanceHierarchy;
import qrmm.InterfaceClassLib;
import qrmm.QrmmPackage;
import qrmm.RoleClassLib;
import qrmm.SourceDocumentInformation;
import qrmm.SystemUnitClassLib;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAEX File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getSuperiorStandardVersion <em>Superior Standard Version</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getSourceDocumentInformation <em>Source Document Information</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getInstanceHierarchy <em>Instance Hierarchy</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getInterfaceClassLib <em>Interface Class Lib</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getRoleClassLib <em>Role Class Lib</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getSystemUnitClassLib <em>System Unit Class Lib</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getAttributeTypeLib <em>Attribute Type Lib</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link qrmm.impl.CAEXFileImpl#getSchemaVersion <em>Schema Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAEXFileImpl extends CAEXBasicObjectImpl implements CAEXFile {
	/**
	 * The cached value of the '{@link #getSuperiorStandardVersion() <em>Superior Standard Version</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperiorStandardVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<String> superiorStandardVersion;

	/**
	 * The cached value of the '{@link #getSourceDocumentInformation() <em>Source Document Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation> sourceDocumentInformation;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReferenceType> externalReference;

	/**
	 * The cached value of the '{@link #getInstanceHierarchy() <em>Instance Hierarchy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceHierarchy()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceHierarchy> instanceHierarchy;

	/**
	 * The cached value of the '{@link #getInterfaceClassLib() <em>Interface Class Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClassLib()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClassLib> interfaceClassLib;

	/**
	 * The cached value of the '{@link #getRoleClassLib() <em>Role Class Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClassLib()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClassLib> roleClassLib;

	/**
	 * The cached value of the '{@link #getSystemUnitClassLib() <em>System Unit Class Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitClassLib()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClassLib> systemUnitClassLib;

	/**
	 * The cached value of the '{@link #getAttributeTypeLib() <em>Attribute Type Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeLib()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeLib> attributeTypeLib;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_VERSION_EDEFAULT = "3.00";

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected String schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * This is true if the Schema Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schemaVersionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAEXFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QrmmPackage.Literals.CAEX_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSuperiorStandardVersion() {
		if (superiorStandardVersion == null) {
			superiorStandardVersion = new EDataTypeEList<String>(String.class, this, QrmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION);
		}
		return superiorStandardVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation> getSourceDocumentInformation() {
		if (sourceDocumentInformation == null) {
			sourceDocumentInformation = new EObjectContainmentEList<SourceDocumentInformation>(SourceDocumentInformation.class, this, QrmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION);
		}
		return sourceDocumentInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReferenceType> getExternalReference() {
		if (externalReference == null) {
			externalReference = new EObjectContainmentEList<ExternalReferenceType>(ExternalReferenceType.class, this, QrmmPackage.CAEX_FILE__EXTERNAL_REFERENCE);
		}
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceHierarchy> getInstanceHierarchy() {
		if (instanceHierarchy == null) {
			instanceHierarchy = new EObjectContainmentEList<InstanceHierarchy>(InstanceHierarchy.class, this, QrmmPackage.CAEX_FILE__INSTANCE_HIERARCHY);
		}
		return instanceHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClassLib> getInterfaceClassLib() {
		if (interfaceClassLib == null) {
			interfaceClassLib = new EObjectContainmentEList<InterfaceClassLib>(InterfaceClassLib.class, this, QrmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB);
		}
		return interfaceClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClassLib> getRoleClassLib() {
		if (roleClassLib == null) {
			roleClassLib = new EObjectContainmentEList<RoleClassLib>(RoleClassLib.class, this, QrmmPackage.CAEX_FILE__ROLE_CLASS_LIB);
		}
		return roleClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClassLib> getSystemUnitClassLib() {
		if (systemUnitClassLib == null) {
			systemUnitClassLib = new EObjectContainmentEList<SystemUnitClassLib>(SystemUnitClassLib.class, this, QrmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB);
		}
		return systemUnitClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeLib> getAttributeTypeLib() {
		if (attributeTypeLib == null) {
			attributeTypeLib = new EObjectContainmentEList<AttributeLib>(AttributeLib.class, this, QrmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB);
		}
		return attributeTypeLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.CAEX_FILE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(String newSchemaVersion) {
		String oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QrmmPackage.CAEX_FILE__SCHEMA_VERSION, oldSchemaVersion, schemaVersion, !oldSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchemaVersion() {
		String oldSchemaVersion = schemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersion = SCHEMA_VERSION_EDEFAULT;
		schemaVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QrmmPackage.CAEX_FILE__SCHEMA_VERSION, oldSchemaVersion, SCHEMA_VERSION_EDEFAULT, oldSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchemaVersion() {
		return schemaVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QrmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				return ((InternalEList<?>)getSourceDocumentInformation()).basicRemove(otherEnd, msgs);
			case QrmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				return ((InternalEList<?>)getExternalReference()).basicRemove(otherEnd, msgs);
			case QrmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				return ((InternalEList<?>)getInstanceHierarchy()).basicRemove(otherEnd, msgs);
			case QrmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				return ((InternalEList<?>)getInterfaceClassLib()).basicRemove(otherEnd, msgs);
			case QrmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				return ((InternalEList<?>)getRoleClassLib()).basicRemove(otherEnd, msgs);
			case QrmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				return ((InternalEList<?>)getSystemUnitClassLib()).basicRemove(otherEnd, msgs);
			case QrmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				return ((InternalEList<?>)getAttributeTypeLib()).basicRemove(otherEnd, msgs);
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
			case QrmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION:
				return getSuperiorStandardVersion();
			case QrmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				return getSourceDocumentInformation();
			case QrmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				return getExternalReference();
			case QrmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				return getInstanceHierarchy();
			case QrmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				return getInterfaceClassLib();
			case QrmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				return getRoleClassLib();
			case QrmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				return getSystemUnitClassLib();
			case QrmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				return getAttributeTypeLib();
			case QrmmPackage.CAEX_FILE__FILE_NAME:
				return getFileName();
			case QrmmPackage.CAEX_FILE__SCHEMA_VERSION:
				return getSchemaVersion();
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
			case QrmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION:
				getSuperiorStandardVersion().clear();
				getSuperiorStandardVersion().addAll((Collection<? extends String>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				getSourceDocumentInformation().clear();
				getSourceDocumentInformation().addAll((Collection<? extends SourceDocumentInformation>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				getExternalReference().addAll((Collection<? extends ExternalReferenceType>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				getInstanceHierarchy().clear();
				getInstanceHierarchy().addAll((Collection<? extends InstanceHierarchy>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				getInterfaceClassLib().clear();
				getInterfaceClassLib().addAll((Collection<? extends InterfaceClassLib>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				getRoleClassLib().clear();
				getRoleClassLib().addAll((Collection<? extends RoleClassLib>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				getSystemUnitClassLib().clear();
				getSystemUnitClassLib().addAll((Collection<? extends SystemUnitClassLib>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				getAttributeTypeLib().clear();
				getAttributeTypeLib().addAll((Collection<? extends AttributeLib>)newValue);
				return;
			case QrmmPackage.CAEX_FILE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case QrmmPackage.CAEX_FILE__SCHEMA_VERSION:
				setSchemaVersion((String)newValue);
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
			case QrmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION:
				getSuperiorStandardVersion().clear();
				return;
			case QrmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				getSourceDocumentInformation().clear();
				return;
			case QrmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				return;
			case QrmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				getInstanceHierarchy().clear();
				return;
			case QrmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				getInterfaceClassLib().clear();
				return;
			case QrmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				getRoleClassLib().clear();
				return;
			case QrmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				getSystemUnitClassLib().clear();
				return;
			case QrmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				getAttributeTypeLib().clear();
				return;
			case QrmmPackage.CAEX_FILE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case QrmmPackage.CAEX_FILE__SCHEMA_VERSION:
				unsetSchemaVersion();
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
			case QrmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION:
				return superiorStandardVersion != null && !superiorStandardVersion.isEmpty();
			case QrmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				return sourceDocumentInformation != null && !sourceDocumentInformation.isEmpty();
			case QrmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				return externalReference != null && !externalReference.isEmpty();
			case QrmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				return instanceHierarchy != null && !instanceHierarchy.isEmpty();
			case QrmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				return interfaceClassLib != null && !interfaceClassLib.isEmpty();
			case QrmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				return roleClassLib != null && !roleClassLib.isEmpty();
			case QrmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				return systemUnitClassLib != null && !systemUnitClassLib.isEmpty();
			case QrmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				return attributeTypeLib != null && !attributeTypeLib.isEmpty();
			case QrmmPackage.CAEX_FILE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case QrmmPackage.CAEX_FILE__SCHEMA_VERSION:
				return isSetSchemaVersion();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (superiorStandardVersion: ");
		result.append(superiorStandardVersion);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", schemaVersion: ");
		if (schemaVersionESet) result.append(schemaVersion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CAEXFileImpl
