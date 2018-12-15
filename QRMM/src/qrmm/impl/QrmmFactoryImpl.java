/**
 */
package qrmm.impl;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qrmm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QrmmFactoryImpl extends EFactoryImpl implements QrmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QrmmFactory init() {
		try {
			QrmmFactory theQrmmFactory = (QrmmFactory)EPackage.Registry.INSTANCE.getEFactory(QrmmPackage.eNS_URI);
			if (theQrmmFactory != null) {
				return theQrmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QrmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QrmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QrmmPackage.ATTRIBUTE_FAMILY: return createAttributeFamily();
			case QrmmPackage.ATTRIBUTE_NAME_MAPPING: return createAttributeNameMapping();
			case QrmmPackage.ATTRIBUTE: return createAttribute();
			case QrmmPackage.ATTRIBUTE_LIB: return createAttributeLib();
			case QrmmPackage.ATTRIBUTE_VALUE_REQUIREMENT: return createAttributeValueRequirement();
			case QrmmPackage.CAEX_BASIC_OBJECT: return createCAEXBasicObject();
			case QrmmPackage.CAEX_FILE: return createCAEXFile();
			case QrmmPackage.CAEX_OBJECT: return createCAEXObject();
			case QrmmPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case QrmmPackage.EXTERNAL_INTERFACE: return createExternalInterface();
			case QrmmPackage.EXTERNAL_REFERENCE_TYPE: return createExternalReferenceType();
			case QrmmPackage.INSTANCE_HIERARCHY: return createInstanceHierarchy();
			case QrmmPackage.INTERFACE_CLASS_LIB: return createInterfaceClassLib();
			case QrmmPackage.INTERFACE_CLASS: return createInterfaceClass();
			case QrmmPackage.INTERFACE_FAMILY: return createInterfaceFamily();
			case QrmmPackage.INTERFACE_ID_MAPPING: return createInterfaceIDMapping();
			case QrmmPackage.INTERNAL_ELEMENT: return createInternalElement();
			case QrmmPackage.INTERNAL_LINK: return createInternalLink();
			case QrmmPackage.MAPPING: return createMapping();
			case QrmmPackage.NOMINAL_SCALED_TYPE: return createNominalScaledType();
			case QrmmPackage.ORDINAL_SCALED_TYPE: return createOrdinalScaledType();
			case QrmmPackage.REF_SEMANTIC: return createRefSemantic();
			case QrmmPackage.ROLE_CLASS_LIB: return createRoleClassLib();
			case QrmmPackage.ROLE_CLASS: return createRoleClass();
			case QrmmPackage.ROLE_FAMILY: return createRoleFamily();
			case QrmmPackage.ROLE_REQUIREMENTS: return createRoleRequirements();
			case QrmmPackage.SOURCE_DOCUMENT_INFORMATION: return createSourceDocumentInformation();
			case QrmmPackage.SUPPORTED_ROLE_CLASS: return createSupportedRoleClass();
			case QrmmPackage.SYSTEM_UNIT_CLASS_LIB: return createSystemUnitClassLib();
			case QrmmPackage.SYSTEM_UNIT_CLASS: return createSystemUnitClass();
			case QrmmPackage.SYSTEM_UNIT_FAMILY: return createSystemUnitFamily();
			case QrmmPackage.UNKNOWN_TYPE: return createUnknownType();
			case QrmmPackage.COPYRIGHT: return createCopyright();
			case QrmmPackage.DESCRIPTION: return createDescription();
			case QrmmPackage.REVISION: return createRevision();
			case QrmmPackage.VERSION: return createVersion();
			case QrmmPackage.ADDITIONAL_INFORMATION: return createAdditionalInformation();
			case QrmmPackage.GENERIC_ELEMENT: return createGenericElement();
			case QrmmPackage.GENERIC_ATTRIBUTE: return createGenericAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QrmmPackage.CHANGE_MODE:
				return createChangeModeFromString(eDataType, initialValue);
			case QrmmPackage.ATTRIBUTE_DATA_TYPE:
				return createAttributeDataTypeFromString(eDataType, initialValue);
			case QrmmPackage.CHANGE_MODE_OBJECT:
				return createChangeModeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QrmmPackage.CHANGE_MODE:
				return convertChangeModeToString(eDataType, instanceValue);
			case QrmmPackage.ATTRIBUTE_DATA_TYPE:
				return convertAttributeDataTypeToString(eDataType, instanceValue);
			case QrmmPackage.CHANGE_MODE_OBJECT:
				return convertChangeModeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeFamily createAttributeFamily() {
		AttributeFamilyImpl attributeFamily = new AttributeFamilyImpl();
		return attributeFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNameMapping createAttributeNameMapping() {
		AttributeNameMappingImpl attributeNameMapping = new AttributeNameMappingImpl();
		return attributeNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLib createAttributeLib() {
		AttributeLibImpl attributeLib = new AttributeLibImpl();
		return attributeLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRequirement createAttributeValueRequirement() {
		AttributeValueRequirementImpl attributeValueRequirement = new AttributeValueRequirementImpl();
		return attributeValueRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXBasicObject createCAEXBasicObject() {
		CAEXBasicObjectImpl caexBasicObject = new CAEXBasicObjectImpl();
		return caexBasicObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile createCAEXFile() {
		CAEXFileImpl caexFile = new CAEXFileImpl();
		return caexFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXObject createCAEXObject() {
		CAEXObjectImpl caexObject = new CAEXObjectImpl();
		return caexObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInterface createExternalInterface() {
		ExternalInterfaceImpl externalInterface = new ExternalInterfaceImpl();
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType createExternalReferenceType() {
		ExternalReferenceTypeImpl externalReferenceType = new ExternalReferenceTypeImpl();
		return externalReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceHierarchy createInstanceHierarchy() {
		InstanceHierarchyImpl instanceHierarchy = new InstanceHierarchyImpl();
		return instanceHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassLib createInterfaceClassLib() {
		InterfaceClassLibImpl interfaceClassLib = new InterfaceClassLibImpl();
		return interfaceClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass createInterfaceClass() {
		InterfaceClassImpl interfaceClass = new InterfaceClassImpl();
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFamily createInterfaceFamily() {
		InterfaceFamilyImpl interfaceFamily = new InterfaceFamilyImpl();
		return interfaceFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceIDMapping createInterfaceIDMapping() {
		InterfaceIDMappingImpl interfaceIDMapping = new InterfaceIDMappingImpl();
		return interfaceIDMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalElement createInternalElement() {
		InternalElementImpl internalElement = new InternalElementImpl();
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink createInternalLink() {
		InternalLinkImpl internalLink = new InternalLinkImpl();
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalScaledType createNominalScaledType() {
		NominalScaledTypeImpl nominalScaledType = new NominalScaledTypeImpl();
		return nominalScaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType createOrdinalScaledType() {
		OrdinalScaledTypeImpl ordinalScaledType = new OrdinalScaledTypeImpl();
		return ordinalScaledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSemantic createRefSemantic() {
		RefSemanticImpl refSemantic = new RefSemanticImpl();
		return refSemantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassLib createRoleClassLib() {
		RoleClassLibImpl roleClassLib = new RoleClassLibImpl();
		return roleClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass createRoleClass() {
		RoleClassImpl roleClass = new RoleClassImpl();
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFamily createRoleFamily() {
		RoleFamilyImpl roleFamily = new RoleFamilyImpl();
		return roleFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequirements createRoleRequirements() {
		RoleRequirementsImpl roleRequirements = new RoleRequirementsImpl();
		return roleRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation createSourceDocumentInformation() {
		SourceDocumentInformationImpl sourceDocumentInformation = new SourceDocumentInformationImpl();
		return sourceDocumentInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedRoleClass createSupportedRoleClass() {
		SupportedRoleClassImpl supportedRoleClass = new SupportedRoleClassImpl();
		return supportedRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClassLib createSystemUnitClassLib() {
		SystemUnitClassLibImpl systemUnitClassLib = new SystemUnitClassLibImpl();
		return systemUnitClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass createSystemUnitClass() {
		SystemUnitClassImpl systemUnitClass = new SystemUnitClassImpl();
		return systemUnitClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitFamily createSystemUnitFamily() {
		SystemUnitFamilyImpl systemUnitFamily = new SystemUnitFamilyImpl();
		return systemUnitFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType createUnknownType() {
		UnknownTypeImpl unknownType = new UnknownTypeImpl();
		return unknownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copyright createCopyright() {
		CopyrightImpl copyright = new CopyrightImpl();
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalInformation createAdditionalInformation() {
		AdditionalInformationImpl additionalInformation = new AdditionalInformationImpl();
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericElement createGenericElement() {
		GenericElementImpl genericElement = new GenericElementImpl();
		return genericElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttribute createGenericAttribute() {
		GenericAttributeImpl genericAttribute = new GenericAttributeImpl();
		return genericAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMode createChangeModeFromString(EDataType eDataType, String initialValue) {
		ChangeMode result = ChangeMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAttributeDataTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createChangeModeObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeModeObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QrmmPackage getQrmmPackage() {
		return (QrmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QrmmPackage getPackage() {
		return QrmmPackage.eINSTANCE;
	}

} //QrmmFactoryImpl
