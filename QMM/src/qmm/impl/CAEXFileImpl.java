/**
 */
package qmm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qmm.AttributeLib_OrGroup;
import qmm.CAEXBasicObject;
import qmm.CAEXFile;
import qmm.CAEXFile_fileName_AttrEClass;
import qmm.CAEXFile_schemaVersion_AttrEClass;
import qmm.CAEXFile_superiorStandardVersion_AttrEClass;
import qmm.ExternalReferenceType_OrGroup;
import qmm.InstanceHierarchy_OrGroup;
import qmm.InterfaceClassLib_OrGroup;
import qmm.QmmPackage;
import qmm.RoleClassLib_OrGroup;
import qmm.SourceDocumentInformation_OrGroup;
import qmm.SystemUnitClassLib_OrGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAEX File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qmm.impl.CAEXFileImpl#getSourceDocumentInformation <em>Source Document Information</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getInstanceHierarchy <em>Instance Hierarchy</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getInterfaceClassLib <em>Interface Class Lib</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getRoleClassLib <em>Role Class Lib</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getSystemUnitClassLib <em>System Unit Class Lib</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getAttributeTypeLib <em>Attribute Type Lib</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getSuperiorStandardVersion_AttrEClass <em>Superior Standard Version Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getFileName_AttrEClass <em>File Name Attr EClass</em>}</li>
 *   <li>{@link qmm.impl.CAEXFileImpl#getSchemaVersion_AttrEClass <em>Schema Version Attr EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAEXFileImpl extends CAEXBasicObjectImpl implements CAEXFile {
	/**
	 * The cached value of the '{@link #getSourceDocumentInformation() <em>Source Document Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceDocumentInformation_OrGroup> sourceDocumentInformation;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReferenceType_OrGroup> externalReference;

	/**
	 * The cached value of the '{@link #getInstanceHierarchy() <em>Instance Hierarchy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceHierarchy()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceHierarchy_OrGroup> instanceHierarchy;

	/**
	 * The cached value of the '{@link #getInterfaceClassLib() <em>Interface Class Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClassLib()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClassLib_OrGroup> interfaceClassLib;

	/**
	 * The cached value of the '{@link #getRoleClassLib() <em>Role Class Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClassLib()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClassLib_OrGroup> roleClassLib;

	/**
	 * The cached value of the '{@link #getSystemUnitClassLib() <em>System Unit Class Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitClassLib()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClassLib_OrGroup> systemUnitClassLib;

	/**
	 * The cached value of the '{@link #getAttributeTypeLib() <em>Attribute Type Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeTypeLib()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeLib_OrGroup> attributeTypeLib;

	/**
	 * The cached value of the '{@link #getSuperiorStandardVersion_AttrEClass() <em>Superior Standard Version Attr EClass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperiorStandardVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected EList<CAEXFile_superiorStandardVersion_AttrEClass> superiorStandardVersion_AttrEClass;

	/**
	 * The cached value of the '{@link #getFileName_AttrEClass() <em>File Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected CAEXFile_fileName_AttrEClass fileName_AttrEClass;

	/**
	 * The cached value of the '{@link #getSchemaVersion_AttrEClass() <em>Schema Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion_AttrEClass()
	 * @generated
	 * @ordered
	 */
	protected CAEXFile_schemaVersion_AttrEClass schemaVersion_AttrEClass;

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
		return QmmPackage.eINSTANCE.getCAEXFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceDocumentInformation_OrGroup> getSourceDocumentInformation() {
		if (sourceDocumentInformation == null) {
			sourceDocumentInformation = new EObjectContainmentEList<SourceDocumentInformation_OrGroup>(SourceDocumentInformation_OrGroup.class, this, QmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION);
		}
		return sourceDocumentInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReferenceType_OrGroup> getExternalReference() {
		if (externalReference == null) {
			externalReference = new EObjectContainmentEList<ExternalReferenceType_OrGroup>(ExternalReferenceType_OrGroup.class, this, QmmPackage.CAEX_FILE__EXTERNAL_REFERENCE);
		}
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceHierarchy_OrGroup> getInstanceHierarchy() {
		if (instanceHierarchy == null) {
			instanceHierarchy = new EObjectContainmentEList<InstanceHierarchy_OrGroup>(InstanceHierarchy_OrGroup.class, this, QmmPackage.CAEX_FILE__INSTANCE_HIERARCHY);
		}
		return instanceHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClassLib_OrGroup> getInterfaceClassLib() {
		if (interfaceClassLib == null) {
			interfaceClassLib = new EObjectContainmentEList<InterfaceClassLib_OrGroup>(InterfaceClassLib_OrGroup.class, this, QmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB);
		}
		return interfaceClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClassLib_OrGroup> getRoleClassLib() {
		if (roleClassLib == null) {
			roleClassLib = new EObjectContainmentEList<RoleClassLib_OrGroup>(RoleClassLib_OrGroup.class, this, QmmPackage.CAEX_FILE__ROLE_CLASS_LIB);
		}
		return roleClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClassLib_OrGroup> getSystemUnitClassLib() {
		if (systemUnitClassLib == null) {
			systemUnitClassLib = new EObjectContainmentEList<SystemUnitClassLib_OrGroup>(SystemUnitClassLib_OrGroup.class, this, QmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB);
		}
		return systemUnitClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeLib_OrGroup> getAttributeTypeLib() {
		if (attributeTypeLib == null) {
			attributeTypeLib = new EObjectContainmentEList<AttributeLib_OrGroup>(AttributeLib_OrGroup.class, this, QmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB);
		}
		return attributeTypeLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CAEXFile_superiorStandardVersion_AttrEClass> getSuperiorStandardVersion_AttrEClass() {
		if (superiorStandardVersion_AttrEClass == null) {
			superiorStandardVersion_AttrEClass = new EObjectContainmentEList<CAEXFile_superiorStandardVersion_AttrEClass>(CAEXFile_superiorStandardVersion_AttrEClass.class, this, QmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION_ATTR_ECLASS);
		}
		return superiorStandardVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile_fileName_AttrEClass getFileName_AttrEClass() {
		return fileName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileName_AttrEClass(CAEXFile_fileName_AttrEClass newFileName_AttrEClass, NotificationChain msgs) {
		CAEXFile_fileName_AttrEClass oldFileName_AttrEClass = fileName_AttrEClass;
		fileName_AttrEClass = newFileName_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS, oldFileName_AttrEClass, newFileName_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName_AttrEClass(CAEXFile_fileName_AttrEClass newFileName_AttrEClass) {
		if (newFileName_AttrEClass != fileName_AttrEClass) {
			NotificationChain msgs = null;
			if (fileName_AttrEClass != null)
				msgs = ((InternalEObject)fileName_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS, null, msgs);
			if (newFileName_AttrEClass != null)
				msgs = ((InternalEObject)newFileName_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS, null, msgs);
			msgs = basicSetFileName_AttrEClass(newFileName_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS, newFileName_AttrEClass, newFileName_AttrEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile_schemaVersion_AttrEClass getSchemaVersion_AttrEClass() {
		return schemaVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass newSchemaVersion_AttrEClass, NotificationChain msgs) {
		CAEXFile_schemaVersion_AttrEClass oldSchemaVersion_AttrEClass = schemaVersion_AttrEClass;
		schemaVersion_AttrEClass = newSchemaVersion_AttrEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS, oldSchemaVersion_AttrEClass, newSchemaVersion_AttrEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass newSchemaVersion_AttrEClass) {
		if (newSchemaVersion_AttrEClass != schemaVersion_AttrEClass) {
			NotificationChain msgs = null;
			if (schemaVersion_AttrEClass != null)
				msgs = ((InternalEObject)schemaVersion_AttrEClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS, null, msgs);
			if (newSchemaVersion_AttrEClass != null)
				msgs = ((InternalEObject)newSchemaVersion_AttrEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS, null, msgs);
			msgs = basicSetSchemaVersion_AttrEClass(newSchemaVersion_AttrEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS, newSchemaVersion_AttrEClass, newSchemaVersion_AttrEClass));
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
		
		final int sourceDocumentInformation_upperBound = -1;
		int nr_nonTransitive_sourceDocumentInformation = 0;
		if(this.sourceDocumentInformation != null){
				for(qmm.OrGroup og : this.sourceDocumentInformation) if(!og.isTransitive()) nr_nonTransitive_sourceDocumentInformation++;
		}
		if(nr_nonTransitive_sourceDocumentInformation > sourceDocumentInformation_upperBound && sourceDocumentInformation_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_sourceDocumentInformation + " non-transitive sourceDocumentInformation. Only " + sourceDocumentInformation_upperBound + " are allowed.",new Object[] { this }));
		
		final int externalReference_upperBound = -1;
		int nr_nonTransitive_externalReference = 0;
		if(this.externalReference != null){
				for(qmm.OrGroup og : this.externalReference) if(!og.isTransitive()) nr_nonTransitive_externalReference++;
		}
		if(nr_nonTransitive_externalReference > externalReference_upperBound && externalReference_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_externalReference + " non-transitive externalReference. Only " + externalReference_upperBound + " are allowed.",new Object[] { this }));
		
		final int instanceHierarchy_upperBound = -1;
		int nr_nonTransitive_instanceHierarchy = 0;
		if(this.instanceHierarchy != null){
				for(qmm.OrGroup og : this.instanceHierarchy) if(!og.isTransitive()) nr_nonTransitive_instanceHierarchy++;
		}
		if(nr_nonTransitive_instanceHierarchy > instanceHierarchy_upperBound && instanceHierarchy_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_instanceHierarchy + " non-transitive instanceHierarchy. Only " + instanceHierarchy_upperBound + " are allowed.",new Object[] { this }));
		
		final int interfaceClassLib_upperBound = -1;
		int nr_nonTransitive_interfaceClassLib = 0;
		if(this.interfaceClassLib != null){
				for(qmm.OrGroup og : this.interfaceClassLib) if(!og.isTransitive()) nr_nonTransitive_interfaceClassLib++;
		}
		if(nr_nonTransitive_interfaceClassLib > interfaceClassLib_upperBound && interfaceClassLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_interfaceClassLib + " non-transitive interfaceClassLib. Only " + interfaceClassLib_upperBound + " are allowed.",new Object[] { this }));
		
		final int roleClassLib_upperBound = -1;
		int nr_nonTransitive_roleClassLib = 0;
		if(this.roleClassLib != null){
				for(qmm.OrGroup og : this.roleClassLib) if(!og.isTransitive()) nr_nonTransitive_roleClassLib++;
		}
		if(nr_nonTransitive_roleClassLib > roleClassLib_upperBound && roleClassLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_roleClassLib + " non-transitive roleClassLib. Only " + roleClassLib_upperBound + " are allowed.",new Object[] { this }));
		
		final int systemUnitClassLib_upperBound = -1;
		int nr_nonTransitive_systemUnitClassLib = 0;
		if(this.systemUnitClassLib != null){
				for(qmm.OrGroup og : this.systemUnitClassLib) if(!og.isTransitive()) nr_nonTransitive_systemUnitClassLib++;
		}
		if(nr_nonTransitive_systemUnitClassLib > systemUnitClassLib_upperBound && systemUnitClassLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_systemUnitClassLib + " non-transitive systemUnitClassLib. Only " + systemUnitClassLib_upperBound + " are allowed.",new Object[] { this }));
		
		final int attributeTypeLib_upperBound = -1;
		int nr_nonTransitive_attributeTypeLib = 0;
		if(this.attributeTypeLib != null){
				for(qmm.OrGroup og : this.attributeTypeLib) if(!og.isTransitive()) nr_nonTransitive_attributeTypeLib++;
		}
		if(nr_nonTransitive_attributeTypeLib > attributeTypeLib_upperBound && attributeTypeLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, "EClass contains " + nr_nonTransitive_attributeTypeLib + " non-transitive attributeTypeLib. Only " + attributeTypeLib_upperBound + " are allowed.",new Object[] { this }));
		
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
			case QmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				return ((InternalEList<?>)getSourceDocumentInformation()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				return ((InternalEList<?>)getExternalReference()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				return ((InternalEList<?>)getInstanceHierarchy()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				return ((InternalEList<?>)getInterfaceClassLib()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				return ((InternalEList<?>)getRoleClassLib()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				return ((InternalEList<?>)getSystemUnitClassLib()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				return ((InternalEList<?>)getAttributeTypeLib()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
				return ((InternalEList<?>)getSuperiorStandardVersion_AttrEClass()).basicRemove(otherEnd, msgs);
			case QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS:
				return basicSetFileName_AttrEClass(null, msgs);
			case QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS:
				return basicSetSchemaVersion_AttrEClass(null, msgs);
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
			case QmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				return getSourceDocumentInformation();
			case QmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				return getExternalReference();
			case QmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				return getInstanceHierarchy();
			case QmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				return getInterfaceClassLib();
			case QmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				return getRoleClassLib();
			case QmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				return getSystemUnitClassLib();
			case QmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				return getAttributeTypeLib();
			case QmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
				return getSuperiorStandardVersion_AttrEClass();
			case QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS:
				return getFileName_AttrEClass();
			case QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS:
				return getSchemaVersion_AttrEClass();
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
			case QmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				getSourceDocumentInformation().clear();
				getSourceDocumentInformation().addAll((Collection<? extends SourceDocumentInformation_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				getExternalReference().addAll((Collection<? extends ExternalReferenceType_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				getInstanceHierarchy().clear();
				getInstanceHierarchy().addAll((Collection<? extends InstanceHierarchy_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				getInterfaceClassLib().clear();
				getInterfaceClassLib().addAll((Collection<? extends InterfaceClassLib_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				getRoleClassLib().clear();
				getRoleClassLib().addAll((Collection<? extends RoleClassLib_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				getSystemUnitClassLib().clear();
				getSystemUnitClassLib().addAll((Collection<? extends SystemUnitClassLib_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				getAttributeTypeLib().clear();
				getAttributeTypeLib().addAll((Collection<? extends AttributeLib_OrGroup>)newValue);
				return;
			case QmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
				getSuperiorStandardVersion_AttrEClass().clear();
				getSuperiorStandardVersion_AttrEClass().addAll((Collection<? extends CAEXFile_superiorStandardVersion_AttrEClass>)newValue);
				return;
			case QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS:
				setFileName_AttrEClass((CAEXFile_fileName_AttrEClass)newValue);
				return;
			case QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS:
				setSchemaVersion_AttrEClass((CAEXFile_schemaVersion_AttrEClass)newValue);
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
			case QmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				getSourceDocumentInformation().clear();
				return;
			case QmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				return;
			case QmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				getInstanceHierarchy().clear();
				return;
			case QmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				getInterfaceClassLib().clear();
				return;
			case QmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				getRoleClassLib().clear();
				return;
			case QmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				getSystemUnitClassLib().clear();
				return;
			case QmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				getAttributeTypeLib().clear();
				return;
			case QmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
				getSuperiorStandardVersion_AttrEClass().clear();
				return;
			case QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS:
				setFileName_AttrEClass((CAEXFile_fileName_AttrEClass)null);
				return;
			case QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS:
				setSchemaVersion_AttrEClass((CAEXFile_schemaVersion_AttrEClass)null);
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
			case QmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
				return sourceDocumentInformation != null && !sourceDocumentInformation.isEmpty();
			case QmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
				return externalReference != null && !externalReference.isEmpty();
			case QmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
				return instanceHierarchy != null && !instanceHierarchy.isEmpty();
			case QmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
				return interfaceClassLib != null && !interfaceClassLib.isEmpty();
			case QmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
				return roleClassLib != null && !roleClassLib.isEmpty();
			case QmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
				return systemUnitClassLib != null && !systemUnitClassLib.isEmpty();
			case QmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
				return attributeTypeLib != null && !attributeTypeLib.isEmpty();
			case QmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
				return superiorStandardVersion_AttrEClass != null && !superiorStandardVersion_AttrEClass.isEmpty();
			case QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS:
				return fileName_AttrEClass != null;
			case QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS:
				return schemaVersion_AttrEClass != null;
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
				case QmmPackage.CAEX_BASIC_OBJECT___VALIDATE__DIAGNOSTICCHAIN_MAP: return QmmPackage.CAEX_FILE___VALIDATE__DIAGNOSTICCHAIN_MAP;
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
			case QmmPackage.CAEX_FILE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CAEXFileImpl
