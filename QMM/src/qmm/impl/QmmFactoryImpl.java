/**
 */
package qmm.impl;

import java.lang.CharSequence;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmmFactoryImpl extends EFactoryImpl implements QmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QmmFactory init() {
		try {
			QmmFactory theQmmFactory = (QmmFactory)EPackage.Registry.INSTANCE.getEFactory(QmmPackage.eNS_URI);
			if (theQmmFactory != null) {
				return theQmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmFactoryImpl() {
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
			case QmmPackage.ATTRIBUTE_FAMILY: return createAttributeFamily();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING: return createAttributeNameMapping();
			case QmmPackage.ATTRIBUTE: return createAttribute();
			case QmmPackage.ATTRIBUTE_LIB: return createAttributeLib();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT: return createAttributeValueRequirement();
			case QmmPackage.CAEX_BASIC_OBJECT: return createCAEXBasicObject();
			case QmmPackage.CAEX_FILE: return createCAEXFile();
			case QmmPackage.CAEX_OBJECT: return createCAEXObject();
			case QmmPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case QmmPackage.EXTERNAL_INTERFACE: return createExternalInterface();
			case QmmPackage.EXTERNAL_REFERENCE_TYPE: return createExternalReferenceType();
			case QmmPackage.INSTANCE_HIERARCHY: return createInstanceHierarchy();
			case QmmPackage.INTERFACE_CLASS_LIB: return createInterfaceClassLib();
			case QmmPackage.INTERFACE_CLASS: return createInterfaceClass();
			case QmmPackage.INTERFACE_FAMILY: return createInterfaceFamily();
			case QmmPackage.INTERFACE_ID_MAPPING: return createInterfaceIDMapping();
			case QmmPackage.INTERNAL_ELEMENT: return createInternalElement();
			case QmmPackage.INTERNAL_LINK: return createInternalLink();
			case QmmPackage.MAPPING: return createMapping();
			case QmmPackage.NOMINAL_SCALED_TYPE: return createNominalScaledType();
			case QmmPackage.ORDINAL_SCALED_TYPE: return createOrdinalScaledType();
			case QmmPackage.REF_SEMANTIC: return createRefSemantic();
			case QmmPackage.ROLE_CLASS_LIB: return createRoleClassLib();
			case QmmPackage.ROLE_CLASS: return createRoleClass();
			case QmmPackage.ROLE_FAMILY: return createRoleFamily();
			case QmmPackage.ROLE_REQUIREMENTS: return createRoleRequirements();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION: return createSourceDocumentInformation();
			case QmmPackage.SUPPORTED_ROLE_CLASS: return createSupportedRoleClass();
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB: return createSystemUnitClassLib();
			case QmmPackage.SYSTEM_UNIT_CLASS: return createSystemUnitClass();
			case QmmPackage.SYSTEM_UNIT_FAMILY: return createSystemUnitFamily();
			case QmmPackage.UNKNOWN_TYPE: return createUnknownType();
			case QmmPackage.COPYRIGHT: return createCopyright();
			case QmmPackage.DESCRIPTION: return createDescription();
			case QmmPackage.REVISION: return createRevision();
			case QmmPackage.VERSION: return createVersion();
			case QmmPackage.ADDITIONAL_INFORMATION: return createAdditionalInformation();
			case QmmPackage.GENERIC_ELEMENT: return createGenericElement();
			case QmmPackage.GENERIC_ATTRIBUTE: return createGenericAttribute();
			case QmmPackage.FIND_QUERY: return createFindQuery();
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT: return createCountable_ReferenceArgument();
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER: return createCountableReferenceParameter();
			case QmmPackage.AND_EVALUATION_BIT_OPERATOR: return createAnd_EvaluationBitOperator();
			case QmmPackage.OR_EVALUATION_BIT_OPERATOR: return createOr_EvaluationBitOperator();
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER: return createString_CalculateableParameter();
			case QmmPackage.STRING_FUNCTIONAL_PARAMETER: return createString_FunctionalParameter();
			case QmmPackage.STRING_PRIMITIVE_ARGUMENT: return createString_PrimitiveArgument();
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: return createString_CalculateableElementReferenceArgument();
			case QmmPackage.STRING_AND_BIT_OPERATOR: return createString_And_BitOperator();
			case QmmPackage.STRING_OR_BIT_OPERATOR: return createString_Or_BitOperator();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_ROLE_ATTRIBUTE_NAME_ATTR_ECLASS: return createAttributeNameMapping_roleAttributeName_AttrEClass();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS: return createAttributeNameMapping_systemUnitAttributeName_AttrEClass();
			case QmmPackage.ATTRIBUTE_DEFAULT_VALUE_ATTR_ECLASS: return createAttribute_defaultValue_AttrEClass();
			case QmmPackage.ATTRIBUTE_VALUE_ATTR_ECLASS: return createAttribute_value_AttrEClass();
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_PARAMETER: return createAttributeDataType_CalculateableParameter();
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_PARAMETER: return createAttributeDataType_FunctionalParameter();
			case QmmPackage.ATTRIBUTE_DATA_TYPE_PRIMITIVE_ARGUMENT: return createAttributeDataType_PrimitiveArgument();
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: return createAttributeDataType_CalculateableElementReferenceArgument();
			case QmmPackage.ATTRIBUTE_DATA_TYPE_AND_BIT_OPERATOR: return createAttributeDataType_And_BitOperator();
			case QmmPackage.ATTRIBUTE_DATA_TYPE_OR_BIT_OPERATOR: return createAttributeDataType_Or_BitOperator();
			case QmmPackage.ATTRIBUTE_ATTRIBUTE_DATA_TYPE_ATTR_ECLASS: return createAttribute_attributeDataType_AttrEClass();
			case QmmPackage.ATTRIBUTE_REF_ATTRIBUTE_TYPE_ATTR_ECLASS: return createAttribute_refAttributeType_AttrEClass();
			case QmmPackage.ATTRIBUTE_UNIT_ATTR_ECLASS: return createAttribute_unit_AttrEClass();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_NAME_ATTR_ECLASS: return createAttributeValueRequirement_name_AttrEClass();
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR: return createChangeMode_EnumerationOperator();
			case QmmPackage.CAEX_BASIC_OBJECT_CHANGE_MODE_ATTR_ECLASS: return createCAEXBasicObject_changeMode_AttrEClass();
			case QmmPackage.CAEX_FILE_SUPERIOR_STANDARD_VERSION_ATTR_ECLASS: return createCAEXFile_superiorStandardVersion_AttrEClass();
			case QmmPackage.CAEX_FILE_FILE_NAME_ATTR_ECLASS: return createCAEXFile_fileName_AttrEClass();
			case QmmPackage.CAEX_FILE_SCHEMA_VERSION_ATTR_ECLASS: return createCAEXFile_schemaVersion_AttrEClass();
			case QmmPackage.CAEX_OBJECT_ID_ATTR_ECLASS: return createCAEXObject_iD_AttrEClass();
			case QmmPackage.CAEX_OBJECT_NAME_ATTR_ECLASS: return createCAEXObject_name_AttrEClass();
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_PARAMETER: return createEFeatureMapEntry_CalculateableParameter();
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_PARAMETER: return createEFeatureMapEntry_FunctionalParameter();
			case QmmPackage.EFEATURE_MAP_ENTRY_PRIMITIVE_ARGUMENT: return createEFeatureMapEntry_PrimitiveArgument();
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: return createEFeatureMapEntry_CalculateableElementReferenceArgument();
			case QmmPackage.EFEATURE_MAP_ENTRY_AND_BIT_OPERATOR: return createEFeatureMapEntry_And_BitOperator();
			case QmmPackage.EFEATURE_MAP_ENTRY_OR_BIT_OPERATOR: return createEFeatureMapEntry_Or_BitOperator();
			case QmmPackage.DOCUMENT_ROOT_MIXED_ATTR_ECLASS: return createDocumentRoot_mixed_AttrEClass();
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_ALIAS_ATTR_ECLASS: return createExternalReferenceType_alias_AttrEClass();
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_PATH_ATTR_ECLASS: return createExternalReferenceType_path_AttrEClass();
			case QmmPackage.INTERFACE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS: return createInterfaceClass_refBaseClassPath_AttrEClass();
			case QmmPackage.INTERFACE_ID_MAPPING_ROLE_INTERFACE_ID_ATTR_ECLASS: return createInterfaceIDMapping_roleInterfaceID_AttrEClass();
			case QmmPackage.INTERFACE_ID_MAPPING_SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS: return createInterfaceIDMapping_systemUnitInterfaceID_AttrEClass();
			case QmmPackage.INTERNAL_ELEMENT_REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS: return createInternalElement_refBaseSystemUnitPath_AttrEClass();
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_AATTR_ECLASS: return createInternalLink_refPartnerSideA_AttrEClass();
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_BATTR_ECLASS: return createInternalLink_refPartnerSideB_AttrEClass();
			case QmmPackage.NOMINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS: return createNominalScaledType_requiredValue_AttrEClass();
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MAX_VALUE_ATTR_ECLASS: return createOrdinalScaledType_requiredMaxValue_AttrEClass();
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS: return createOrdinalScaledType_requiredValue_AttrEClass();
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MIN_VALUE_ATTR_ECLASS: return createOrdinalScaledType_requiredMinValue_AttrEClass();
			case QmmPackage.REF_SEMANTIC_CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS: return createRefSemantic_correspondingAttributePath_AttrEClass();
			case QmmPackage.ROLE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS: return createRoleClass_refBaseClassPath_AttrEClass();
			case QmmPackage.DATE_TIME_CALCULATEABLE_PARAMETER: return createDateTime_CalculateableParameter();
			case QmmPackage.DATE_TIME_FUNCTIONAL_PARAMETER: return createDateTime_FunctionalParameter();
			case QmmPackage.DATE_TIME_PRIMITIVE_ARGUMENT: return createDateTime_PrimitiveArgument();
			case QmmPackage.DATE_TIME_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: return createDateTime_CalculateableElementReferenceArgument();
			case QmmPackage.DATE_TIME_AND_BIT_OPERATOR: return createDateTime_And_BitOperator();
			case QmmPackage.DATE_TIME_OR_BIT_OPERATOR: return createDateTime_Or_BitOperator();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_LAST_WRITING_DATE_TIME_ATTR_ECLASS: return createSourceDocumentInformation_lastWritingDateTime_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_ID_ATTR_ECLASS: return createSourceDocumentInformation_originID_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_NAME_ATTR_ECLASS: return createSourceDocumentInformation_originName_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_ID_ATTR_ECLASS: return createSourceDocumentInformation_originProjectID_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_TITLE_ATTR_ECLASS: return createSourceDocumentInformation_originProjectTitle_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_RELEASE_ATTR_ECLASS: return createSourceDocumentInformation_originRelease_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_ATTR_ECLASS: return createSourceDocumentInformation_originVendor_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_URL_ATTR_ECLASS: return createSourceDocumentInformation_originVendorURL_AttrEClass();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VERSION_ATTR_ECLASS: return createSourceDocumentInformation_originVersion_AttrEClass();
			case QmmPackage.SUPPORTED_ROLE_CLASS_REF_ROLE_CLASS_PATH_ATTR_ECLASS: return createSupportedRoleClass_refRoleClassPath_AttrEClass();
			case QmmPackage.SYSTEM_UNIT_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS: return createSystemUnitClass_refBaseClassPath_AttrEClass();
			case QmmPackage.UNKNOWN_TYPE_REQUIREMENTS_ATTR_ECLASS: return createUnknownType_requirements_AttrEClass();
			case QmmPackage.COPYRIGHT_VALUE_ATTR_ECLASS: return createCopyright_value_AttrEClass();
			case QmmPackage.COPYRIGHT_CHANGE_MODE_ATTR_ECLASS: return createCopyright_changeMode_AttrEClass();
			case QmmPackage.DESCRIPTION_VALUE_ATTR_ECLASS: return createDescription_value_AttrEClass();
			case QmmPackage.DESCRIPTION_CHANGE_MODE_ATTR_ECLASS: return createDescription_changeMode_AttrEClass();
			case QmmPackage.REVISION_REVISION_DATE_ATTR_ECLASS: return createRevision_revisionDate_AttrEClass();
			case QmmPackage.REVISION_OLD_VERSION_ATTR_ECLASS: return createRevision_oldVersion_AttrEClass();
			case QmmPackage.REVISION_NEW_VERSION_ATTR_ECLASS: return createRevision_newVersion_AttrEClass();
			case QmmPackage.REVISION_AUTHOR_NAME_ATTR_ECLASS: return createRevision_authorName_AttrEClass();
			case QmmPackage.REVISION_COMMENT_ATTR_ECLASS: return createRevision_comment_AttrEClass();
			case QmmPackage.VERSION_VALUE_ATTR_ECLASS: return createVersion_value_AttrEClass();
			case QmmPackage.VERSION_CHANGE_MODE_ATTR_ECLASS: return createVersion_changeMode_AttrEClass();
			case QmmPackage.ELEMENT_NAME_ATTR_ECLASS: return createElement_name_AttrEClass();
			case QmmPackage.ELEMENT_VALUE_ATTR_ECLASS: return createElement_value_AttrEClass();
			case QmmPackage.GENERIC_ELEMENT_ELEMENT_FEATURE_MAP_ATTR_ECLASS: return createGenericElement_elementFeatureMap_AttrEClass();
			case QmmPackage.GENERIC_ELEMENT_ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS: return createGenericElement_attributeFeatureMap_AttrEClass();
			case QmmPackage.ATTRIBUTE_OR_GROUP: return createAttribute_OrGroup();
			case QmmPackage.REF_SEMANTIC_OR_GROUP: return createRefSemantic_OrGroup();
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_OR_GROUP: return createAttributeValueRequirement_OrGroup();
			case QmmPackage.ORDINAL_SCALED_TYPE_OR_GROUP: return createOrdinalScaledType_OrGroup();
			case QmmPackage.NOMINAL_SCALED_TYPE_OR_GROUP: return createNominalScaledType_OrGroup();
			case QmmPackage.UNKNOWN_TYPE_OR_GROUP: return createUnknownType_OrGroup();
			case QmmPackage.DESCRIPTION_OR_GROUP: return createDescription_OrGroup();
			case QmmPackage.VERSION_OR_GROUP: return createVersion_OrGroup();
			case QmmPackage.REVISION_OR_GROUP: return createRevision_OrGroup();
			case QmmPackage.COPYRIGHT_OR_GROUP: return createCopyright_OrGroup();
			case QmmPackage.ADDITIONAL_INFORMATION_OR_GROUP: return createAdditionalInformation_OrGroup();
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_OR_GROUP: return createSourceDocumentInformation_OrGroup();
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_OR_GROUP: return createExternalReferenceType_OrGroup();
			case QmmPackage.INSTANCE_HIERARCHY_OR_GROUP: return createInstanceHierarchy_OrGroup();
			case QmmPackage.INTERFACE_CLASS_LIB_OR_GROUP: return createInterfaceClassLib_OrGroup();
			case QmmPackage.ROLE_CLASS_LIB_OR_GROUP: return createRoleClassLib_OrGroup();
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB_OR_GROUP: return createSystemUnitClassLib_OrGroup();
			case QmmPackage.ATTRIBUTE_LIB_OR_GROUP: return createAttributeLib_OrGroup();
			case QmmPackage.CAEX_FILE_OR_GROUP: return createCAEXFile_OrGroup();
			case QmmPackage.INTERFACE_CLASS_OR_GROUP: return createInterfaceClass_OrGroup();
			case QmmPackage.INTERNAL_ELEMENT_OR_GROUP: return createInternalElement_OrGroup();
			case QmmPackage.EXTERNAL_INTERFACE_OR_GROUP: return createExternalInterface_OrGroup();
			case QmmPackage.ROLE_REQUIREMENTS_OR_GROUP: return createRoleRequirements_OrGroup();
			case QmmPackage.SYSTEM_UNIT_CLASS_OR_GROUP: return createSystemUnitClass_OrGroup();
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_OR_GROUP: return createAttributeNameMapping_OrGroup();
			case QmmPackage.INTERFACE_ID_MAPPING_OR_GROUP: return createInterfaceIDMapping_OrGroup();
			case QmmPackage.ROLE_CLASS_OR_GROUP: return createRoleClass_OrGroup();
			case QmmPackage.MAPPING_OR_GROUP: return createMapping_OrGroup();
			case QmmPackage.SUPPORTED_ROLE_CLASS_OR_GROUP: return createSupportedRoleClass_OrGroup();
			case QmmPackage.INTERNAL_LINK_OR_GROUP: return createInternalLink_OrGroup();
			case QmmPackage.GENERIC_ELEMENT_OR_GROUP: return createGenericElement_OrGroup();
			case QmmPackage.GENERIC_ATTRIBUTE_OR_GROUP: return createGenericAttribute_OrGroup();
			case QmmPackage.OBJECT_CALCULATEABLE_PARAMETER: return createObject_CalculateableParameter();
			case QmmPackage.OBJECT_FUNCTIONAL_PARAMETER: return createObject_FunctionalParameter();
			case QmmPackage.OBJECT_PRIMITIVE_ARGUMENT: return createObject_PrimitiveArgument();
			case QmmPackage.OBJECT_AND_BIT_OPERATOR: return createObject_And_BitOperator();
			case QmmPackage.OBJECT_OR_BIT_OPERATOR: return createObject_Or_BitOperator();
			case QmmPackage.BOOLEAN_CALCULATEABLE_PARAMETER: return createBoolean_CalculateableParameter();
			case QmmPackage.BOOLEAN_FUNCTIONAL_PARAMETER: return createBoolean_FunctionalParameter();
			case QmmPackage.BOOLEAN_PRIMITIVE_ARGUMENT: return createBoolean_PrimitiveArgument();
			case QmmPackage.BOOLEAN_AND_BIT_OPERATOR: return createBoolean_And_BitOperator();
			case QmmPackage.BOOLEAN_OR_BIT_OPERATOR: return createBoolean_Or_BitOperator();
			case QmmPackage.EQUALS_FUNCTIONAL_OPERATOR: return createequals_FunctionalOperator();
			case QmmPackage.TO_STRING_FUNCTIONAL_OPERATOR: return createtoString_FunctionalOperator();
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_PARAMETER: return createCharSequence_CalculateableParameter();
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_PARAMETER: return createCharSequence_FunctionalParameter();
			case QmmPackage.CHAR_SEQUENCE_PRIMITIVE_ARGUMENT: return createCharSequence_PrimitiveArgument();
			case QmmPackage.CHAR_SEQUENCE_AND_BIT_OPERATOR: return createCharSequence_And_BitOperator();
			case QmmPackage.CHAR_SEQUENCE_OR_BIT_OPERATOR: return createCharSequence_Or_BitOperator();
			case QmmPackage.INTEGER_CALCULATEABLE_PARAMETER: return createInteger_CalculateableParameter();
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER: return createInteger_FunctionalParameter();
			case QmmPackage.INTEGER_PRIMITIVE_ARGUMENT: return createInteger_PrimitiveArgument();
			case QmmPackage.INTEGER_AND_BIT_OPERATOR: return createInteger_And_BitOperator();
			case QmmPackage.INTEGER_OR_BIT_OPERATOR: return createInteger_Or_BitOperator();
			case QmmPackage.LENGTH_FUNCTIONAL_OPERATOR: return createlength_FunctionalOperator();
			case QmmPackage.CHARACTER_CALCULATEABLE_PARAMETER: return createCharacter_CalculateableParameter();
			case QmmPackage.CHARACTER_FUNCTIONAL_PARAMETER: return createCharacter_FunctionalParameter();
			case QmmPackage.CHARACTER_PRIMITIVE_ARGUMENT: return createCharacter_PrimitiveArgument();
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR: return createCharacter_And_BitOperator();
			case QmmPackage.CHARACTER_OR_BIT_OPERATOR: return createCharacter_Or_BitOperator();
			case QmmPackage.CHAR_AT_FUNCTIONAL_OPERATOR: return createcharAt_FunctionalOperator();
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR: return createcontains_FunctionalOperator();
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR: return createsubstring_FunctionalOperator();
			case QmmPackage.CONCAT_FUNCTIONAL_OPERATOR: return createconcat_FunctionalOperator();
			case QmmPackage.ENDS_WITH_FUNCTIONAL_OPERATOR: return createendsWith_FunctionalOperator();
			case QmmPackage.EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR: return createequalsIgnoreCase_FunctionalOperator();
			case QmmPackage.INDEX_OF_STRING_FUNCTIONAL_OPERATOR: return createindexOfString_FunctionalOperator();
			case QmmPackage.IS_EMPTY_FUNCTIONAL_OPERATOR: return createisEmpty_FunctionalOperator();
			case QmmPackage.NUMBER_CALCULATEABLE_PARAMETER: return createNumber_CalculateableParameter();
			case QmmPackage.NUMBER_FUNCTIONAL_PARAMETER: return createNumber_FunctionalParameter();
			case QmmPackage.NUMBER_PRIMITIVE_ARGUMENT: return createNumber_PrimitiveArgument();
			case QmmPackage.NUMBER_AND_BIT_OPERATOR: return createNumber_And_BitOperator();
			case QmmPackage.NUMBER_OR_BIT_OPERATOR: return createNumber_Or_BitOperator();
			case QmmPackage.GREATER_THAN_FUNCTIONAL_OPERATOR: return creategreaterThan_FunctionalOperator();
			case QmmPackage.GREATER_EQUALS_FUNCTIONAL_OPERATOR: return creategreaterEquals_FunctionalOperator();
			case QmmPackage.SMALLER_THAN_FUNCTIONAL_OPERATOR: return createsmallerThan_FunctionalOperator();
			case QmmPackage.SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createsmallerEquals_FunctionalOperator();
			case QmmPackage.PARSE_BOOLEAN_FUNCTIONAL_OPERATOR: return createparseBoolean_FunctionalOperator();
			case QmmPackage.COMPARE_TO_FUNCTIONAL_OPERATOR: return createcompareTo_FunctionalOperator();
			case QmmPackage.OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createObject_Number_equals_FunctionalOperator();
			case QmmPackage.OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_Number_toString_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Integer_greaterThan_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Integer_greaterEquals_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Integer_smallerThan_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Integer_smallerEquals_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Integer_Object_Number_equals_FunctionalOperator();
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createNumber_Integer_Object_Number_toString_FunctionalOperator();
			case QmmPackage.LONG_CALCULATEABLE_PARAMETER: return createLong_CalculateableParameter();
			case QmmPackage.LONG_FUNCTIONAL_PARAMETER: return createLong_FunctionalParameter();
			case QmmPackage.LONG_PRIMITIVE_ARGUMENT: return createLong_PrimitiveArgument();
			case QmmPackage.LONG_AND_BIT_OPERATOR: return createLong_And_BitOperator();
			case QmmPackage.LONG_OR_BIT_OPERATOR: return createLong_Or_BitOperator();
			case QmmPackage.NUMBER_LONG_GREATER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Long_greaterThan_FunctionalOperator();
			case QmmPackage.NUMBER_LONG_GREATER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Long_greaterEquals_FunctionalOperator();
			case QmmPackage.NUMBER_LONG_SMALLER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Long_smallerThan_FunctionalOperator();
			case QmmPackage.NUMBER_LONG_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Long_smallerEquals_FunctionalOperator();
			case QmmPackage.NUMBER_LONG_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Long_Object_Number_equals_FunctionalOperator();
			case QmmPackage.NUMBER_LONG_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createNumber_Long_Object_Number_toString_FunctionalOperator();
			case QmmPackage.DOUBLE_CALCULATEABLE_PARAMETER: return createDouble_CalculateableParameter();
			case QmmPackage.DOUBLE_FUNCTIONAL_PARAMETER: return createDouble_FunctionalParameter();
			case QmmPackage.DOUBLE_PRIMITIVE_ARGUMENT: return createDouble_PrimitiveArgument();
			case QmmPackage.DOUBLE_AND_BIT_OPERATOR: return createDouble_And_BitOperator();
			case QmmPackage.DOUBLE_OR_BIT_OPERATOR: return createDouble_Or_BitOperator();
			case QmmPackage.NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Double_greaterThan_FunctionalOperator();
			case QmmPackage.NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Double_greaterEquals_FunctionalOperator();
			case QmmPackage.NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Double_smallerThan_FunctionalOperator();
			case QmmPackage.NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Double_smallerEquals_FunctionalOperator();
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Double_Object_Number_equals_FunctionalOperator();
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createNumber_Double_Object_Number_toString_FunctionalOperator();
			case QmmPackage.FLOAT_CALCULATEABLE_PARAMETER: return createFloat_CalculateableParameter();
			case QmmPackage.FLOAT_FUNCTIONAL_PARAMETER: return createFloat_FunctionalParameter();
			case QmmPackage.FLOAT_PRIMITIVE_ARGUMENT: return createFloat_PrimitiveArgument();
			case QmmPackage.FLOAT_AND_BIT_OPERATOR: return createFloat_And_BitOperator();
			case QmmPackage.FLOAT_OR_BIT_OPERATOR: return createFloat_Or_BitOperator();
			case QmmPackage.NUMBER_FLOAT_GREATER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Float_greaterThan_FunctionalOperator();
			case QmmPackage.NUMBER_FLOAT_GREATER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Float_greaterEquals_FunctionalOperator();
			case QmmPackage.NUMBER_FLOAT_SMALLER_THAN_FUNCTIONAL_OPERATOR: return createNumber_Float_smallerThan_FunctionalOperator();
			case QmmPackage.NUMBER_FLOAT_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Float_smallerEquals_FunctionalOperator();
			case QmmPackage.NUMBER_FLOAT_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: return createNumber_Float_Object_Number_equals_FunctionalOperator();
			case QmmPackage.NUMBER_FLOAT_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: return createNumber_Float_Object_Number_toString_FunctionalOperator();
			case QmmPackage.OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: return createObject_CharSequence_equals_FunctionalOperator();
			case QmmPackage.OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_CharSequence_toString_FunctionalOperator();
			case QmmPackage.OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR: return createObject_Character_equals_FunctionalOperator();
			case QmmPackage.OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_Character_toString_FunctionalOperator();
			case QmmPackage.OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR: return createObject_Boolean_equals_FunctionalOperator();
			case QmmPackage.OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR: return createObject_Boolean_toString_FunctionalOperator();
			case QmmPackage.CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR: return createCharSequence_String_length_FunctionalOperator();
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: return createCharSequence_String_Object_CharSequence_equals_FunctionalOperator();
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: return createCharSequence_String_Object_CharSequence_toString_FunctionalOperator();
			case QmmPackage.COUNT_AGGREGATION_OPERATOR: return createCount_AggregationOperator();
			case QmmPackage.SUM_AGGREGATION_OPERATOR: return createSum_AggregationOperator();
			case QmmPackage.MIN_AGGREGATION_OPERATOR: return createMin_AggregationOperator();
			case QmmPackage.MAX_AGGREGATION_OPERATOR: return createMax_AggregationOperator();
			case QmmPackage.INTEGER_PARSE_INT_CLASS_OPERATOR: return createIntegerParseInt_ClassOperator();
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
			case QmmPackage.CHANGE_MODE:
				return createChangeModeFromString(eDataType, initialValue);
			case QmmPackage.ATTRIBUTE_DATA_TYPE:
				return createAttributeDataTypeFromString(eDataType, initialValue);
			case QmmPackage.CHANGE_MODE_OBJECT:
				return createChangeModeObjectFromString(eDataType, initialValue);
			case QmmPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case QmmPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case QmmPackage.CHAR_SEQUENCE:
				return createCharSequenceFromString(eDataType, initialValue);
			case QmmPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case QmmPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case QmmPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case QmmPackage.LONG:
				return createLongFromString(eDataType, initialValue);
			case QmmPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			case QmmPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
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
			case QmmPackage.CHANGE_MODE:
				return convertChangeModeToString(eDataType, instanceValue);
			case QmmPackage.ATTRIBUTE_DATA_TYPE:
				return convertAttributeDataTypeToString(eDataType, instanceValue);
			case QmmPackage.CHANGE_MODE_OBJECT:
				return convertChangeModeObjectToString(eDataType, instanceValue);
			case QmmPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case QmmPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case QmmPackage.CHAR_SEQUENCE:
				return convertCharSequenceToString(eDataType, instanceValue);
			case QmmPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case QmmPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case QmmPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case QmmPackage.LONG:
				return convertLongToString(eDataType, instanceValue);
			case QmmPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			case QmmPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
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
	public FindQuery createFindQuery() {
		FindQueryImpl findQuery = new FindQueryImpl();
		return findQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countable_ReferenceArgument createCountable_ReferenceArgument() {
		Countable_ReferenceArgumentImpl countable_ReferenceArgument = new Countable_ReferenceArgumentImpl();
		return countable_ReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountableReferenceParameter createCountableReferenceParameter() {
		CountableReferenceParameterImpl countableReferenceParameter = new CountableReferenceParameterImpl();
		return countableReferenceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And_EvaluationBitOperator createAnd_EvaluationBitOperator() {
		And_EvaluationBitOperatorImpl and_EvaluationBitOperator = new And_EvaluationBitOperatorImpl();
		return and_EvaluationBitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or_EvaluationBitOperator createOr_EvaluationBitOperator() {
		Or_EvaluationBitOperatorImpl or_EvaluationBitOperator = new Or_EvaluationBitOperatorImpl();
		return or_EvaluationBitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_CalculateableParameter createString_CalculateableParameter() {
		String_CalculateableParameterImpl string_CalculateableParameter = new String_CalculateableParameterImpl();
		return string_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_FunctionalParameter createString_FunctionalParameter() {
		String_FunctionalParameterImpl string_FunctionalParameter = new String_FunctionalParameterImpl();
		return string_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_PrimitiveArgument createString_PrimitiveArgument() {
		String_PrimitiveArgumentImpl string_PrimitiveArgument = new String_PrimitiveArgumentImpl();
		return string_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_CalculateableElementReferenceArgument createString_CalculateableElementReferenceArgument() {
		String_CalculateableElementReferenceArgumentImpl string_CalculateableElementReferenceArgument = new String_CalculateableElementReferenceArgumentImpl();
		return string_CalculateableElementReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_And_BitOperator createString_And_BitOperator() {
		String_And_BitOperatorImpl string_And_BitOperator = new String_And_BitOperatorImpl();
		return string_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_Or_BitOperator createString_Or_BitOperator() {
		String_Or_BitOperatorImpl string_Or_BitOperator = new String_Or_BitOperatorImpl();
		return string_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNameMapping_roleAttributeName_AttrEClass createAttributeNameMapping_roleAttributeName_AttrEClass() {
		AttributeNameMapping_roleAttributeName_AttrEClassImpl attributeNameMapping_roleAttributeName_AttrEClass = new AttributeNameMapping_roleAttributeName_AttrEClassImpl();
		return attributeNameMapping_roleAttributeName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNameMapping_systemUnitAttributeName_AttrEClass createAttributeNameMapping_systemUnitAttributeName_AttrEClass() {
		AttributeNameMapping_systemUnitAttributeName_AttrEClassImpl attributeNameMapping_systemUnitAttributeName_AttrEClass = new AttributeNameMapping_systemUnitAttributeName_AttrEClassImpl();
		return attributeNameMapping_systemUnitAttributeName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_defaultValue_AttrEClass createAttribute_defaultValue_AttrEClass() {
		Attribute_defaultValue_AttrEClassImpl attribute_defaultValue_AttrEClass = new Attribute_defaultValue_AttrEClassImpl();
		return attribute_defaultValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_value_AttrEClass createAttribute_value_AttrEClass() {
		Attribute_value_AttrEClassImpl attribute_value_AttrEClass = new Attribute_value_AttrEClassImpl();
		return attribute_value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_CalculateableParameter createAttributeDataType_CalculateableParameter() {
		AttributeDataType_CalculateableParameterImpl attributeDataType_CalculateableParameter = new AttributeDataType_CalculateableParameterImpl();
		return attributeDataType_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_FunctionalParameter createAttributeDataType_FunctionalParameter() {
		AttributeDataType_FunctionalParameterImpl attributeDataType_FunctionalParameter = new AttributeDataType_FunctionalParameterImpl();
		return attributeDataType_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_PrimitiveArgument createAttributeDataType_PrimitiveArgument() {
		AttributeDataType_PrimitiveArgumentImpl attributeDataType_PrimitiveArgument = new AttributeDataType_PrimitiveArgumentImpl();
		return attributeDataType_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_CalculateableElementReferenceArgument createAttributeDataType_CalculateableElementReferenceArgument() {
		AttributeDataType_CalculateableElementReferenceArgumentImpl attributeDataType_CalculateableElementReferenceArgument = new AttributeDataType_CalculateableElementReferenceArgumentImpl();
		return attributeDataType_CalculateableElementReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_And_BitOperator createAttributeDataType_And_BitOperator() {
		AttributeDataType_And_BitOperatorImpl attributeDataType_And_BitOperator = new AttributeDataType_And_BitOperatorImpl();
		return attributeDataType_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDataType_Or_BitOperator createAttributeDataType_Or_BitOperator() {
		AttributeDataType_Or_BitOperatorImpl attributeDataType_Or_BitOperator = new AttributeDataType_Or_BitOperatorImpl();
		return attributeDataType_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_attributeDataType_AttrEClass createAttribute_attributeDataType_AttrEClass() {
		Attribute_attributeDataType_AttrEClassImpl attribute_attributeDataType_AttrEClass = new Attribute_attributeDataType_AttrEClassImpl();
		return attribute_attributeDataType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_refAttributeType_AttrEClass createAttribute_refAttributeType_AttrEClass() {
		Attribute_refAttributeType_AttrEClassImpl attribute_refAttributeType_AttrEClass = new Attribute_refAttributeType_AttrEClassImpl();
		return attribute_refAttributeType_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_unit_AttrEClass createAttribute_unit_AttrEClass() {
		Attribute_unit_AttrEClassImpl attribute_unit_AttrEClass = new Attribute_unit_AttrEClassImpl();
		return attribute_unit_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRequirement_name_AttrEClass createAttributeValueRequirement_name_AttrEClass() {
		AttributeValueRequirement_name_AttrEClassImpl attributeValueRequirement_name_AttrEClass = new AttributeValueRequirement_name_AttrEClassImpl();
		return attributeValueRequirement_name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMode_EnumerationOperator createChangeMode_EnumerationOperator() {
		ChangeMode_EnumerationOperatorImpl changeMode_EnumerationOperator = new ChangeMode_EnumerationOperatorImpl();
		return changeMode_EnumerationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXBasicObject_changeMode_AttrEClass createCAEXBasicObject_changeMode_AttrEClass() {
		CAEXBasicObject_changeMode_AttrEClassImpl caexBasicObject_changeMode_AttrEClass = new CAEXBasicObject_changeMode_AttrEClassImpl();
		return caexBasicObject_changeMode_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile_superiorStandardVersion_AttrEClass createCAEXFile_superiorStandardVersion_AttrEClass() {
		CAEXFile_superiorStandardVersion_AttrEClassImpl caexFile_superiorStandardVersion_AttrEClass = new CAEXFile_superiorStandardVersion_AttrEClassImpl();
		return caexFile_superiorStandardVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile_fileName_AttrEClass createCAEXFile_fileName_AttrEClass() {
		CAEXFile_fileName_AttrEClassImpl caexFile_fileName_AttrEClass = new CAEXFile_fileName_AttrEClassImpl();
		return caexFile_fileName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile_schemaVersion_AttrEClass createCAEXFile_schemaVersion_AttrEClass() {
		CAEXFile_schemaVersion_AttrEClassImpl caexFile_schemaVersion_AttrEClass = new CAEXFile_schemaVersion_AttrEClassImpl();
		return caexFile_schemaVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXObject_iD_AttrEClass createCAEXObject_iD_AttrEClass() {
		CAEXObject_iD_AttrEClassImpl caexObject_iD_AttrEClass = new CAEXObject_iD_AttrEClassImpl();
		return caexObject_iD_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXObject_name_AttrEClass createCAEXObject_name_AttrEClass() {
		CAEXObject_name_AttrEClassImpl caexObject_name_AttrEClass = new CAEXObject_name_AttrEClassImpl();
		return caexObject_name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMapEntry_CalculateableParameter createEFeatureMapEntry_CalculateableParameter() {
		EFeatureMapEntry_CalculateableParameterImpl eFeatureMapEntry_CalculateableParameter = new EFeatureMapEntry_CalculateableParameterImpl();
		return eFeatureMapEntry_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMapEntry_FunctionalParameter createEFeatureMapEntry_FunctionalParameter() {
		EFeatureMapEntry_FunctionalParameterImpl eFeatureMapEntry_FunctionalParameter = new EFeatureMapEntry_FunctionalParameterImpl();
		return eFeatureMapEntry_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMapEntry_PrimitiveArgument createEFeatureMapEntry_PrimitiveArgument() {
		EFeatureMapEntry_PrimitiveArgumentImpl eFeatureMapEntry_PrimitiveArgument = new EFeatureMapEntry_PrimitiveArgumentImpl();
		return eFeatureMapEntry_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMapEntry_CalculateableElementReferenceArgument createEFeatureMapEntry_CalculateableElementReferenceArgument() {
		EFeatureMapEntry_CalculateableElementReferenceArgumentImpl eFeatureMapEntry_CalculateableElementReferenceArgument = new EFeatureMapEntry_CalculateableElementReferenceArgumentImpl();
		return eFeatureMapEntry_CalculateableElementReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMapEntry_And_BitOperator createEFeatureMapEntry_And_BitOperator() {
		EFeatureMapEntry_And_BitOperatorImpl eFeatureMapEntry_And_BitOperator = new EFeatureMapEntry_And_BitOperatorImpl();
		return eFeatureMapEntry_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureMapEntry_Or_BitOperator createEFeatureMapEntry_Or_BitOperator() {
		EFeatureMapEntry_Or_BitOperatorImpl eFeatureMapEntry_Or_BitOperator = new EFeatureMapEntry_Or_BitOperatorImpl();
		return eFeatureMapEntry_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot_mixed_AttrEClass createDocumentRoot_mixed_AttrEClass() {
		DocumentRoot_mixed_AttrEClassImpl documentRoot_mixed_AttrEClass = new DocumentRoot_mixed_AttrEClassImpl();
		return documentRoot_mixed_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType_alias_AttrEClass createExternalReferenceType_alias_AttrEClass() {
		ExternalReferenceType_alias_AttrEClassImpl externalReferenceType_alias_AttrEClass = new ExternalReferenceType_alias_AttrEClassImpl();
		return externalReferenceType_alias_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType_path_AttrEClass createExternalReferenceType_path_AttrEClass() {
		ExternalReferenceType_path_AttrEClassImpl externalReferenceType_path_AttrEClass = new ExternalReferenceType_path_AttrEClassImpl();
		return externalReferenceType_path_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass_refBaseClassPath_AttrEClass createInterfaceClass_refBaseClassPath_AttrEClass() {
		InterfaceClass_refBaseClassPath_AttrEClassImpl interfaceClass_refBaseClassPath_AttrEClass = new InterfaceClass_refBaseClassPath_AttrEClassImpl();
		return interfaceClass_refBaseClassPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceIDMapping_roleInterfaceID_AttrEClass createInterfaceIDMapping_roleInterfaceID_AttrEClass() {
		InterfaceIDMapping_roleInterfaceID_AttrEClassImpl interfaceIDMapping_roleInterfaceID_AttrEClass = new InterfaceIDMapping_roleInterfaceID_AttrEClassImpl();
		return interfaceIDMapping_roleInterfaceID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceIDMapping_systemUnitInterfaceID_AttrEClass createInterfaceIDMapping_systemUnitInterfaceID_AttrEClass() {
		InterfaceIDMapping_systemUnitInterfaceID_AttrEClassImpl interfaceIDMapping_systemUnitInterfaceID_AttrEClass = new InterfaceIDMapping_systemUnitInterfaceID_AttrEClassImpl();
		return interfaceIDMapping_systemUnitInterfaceID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalElement_refBaseSystemUnitPath_AttrEClass createInternalElement_refBaseSystemUnitPath_AttrEClass() {
		InternalElement_refBaseSystemUnitPath_AttrEClassImpl internalElement_refBaseSystemUnitPath_AttrEClass = new InternalElement_refBaseSystemUnitPath_AttrEClassImpl();
		return internalElement_refBaseSystemUnitPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink_refPartnerSideA_AttrEClass createInternalLink_refPartnerSideA_AttrEClass() {
		InternalLink_refPartnerSideA_AttrEClassImpl internalLink_refPartnerSideA_AttrEClass = new InternalLink_refPartnerSideA_AttrEClassImpl();
		return internalLink_refPartnerSideA_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink_refPartnerSideB_AttrEClass createInternalLink_refPartnerSideB_AttrEClass() {
		InternalLink_refPartnerSideB_AttrEClassImpl internalLink_refPartnerSideB_AttrEClass = new InternalLink_refPartnerSideB_AttrEClassImpl();
		return internalLink_refPartnerSideB_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalScaledType_requiredValue_AttrEClass createNominalScaledType_requiredValue_AttrEClass() {
		NominalScaledType_requiredValue_AttrEClassImpl nominalScaledType_requiredValue_AttrEClass = new NominalScaledType_requiredValue_AttrEClassImpl();
		return nominalScaledType_requiredValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType_requiredMaxValue_AttrEClass createOrdinalScaledType_requiredMaxValue_AttrEClass() {
		OrdinalScaledType_requiredMaxValue_AttrEClassImpl ordinalScaledType_requiredMaxValue_AttrEClass = new OrdinalScaledType_requiredMaxValue_AttrEClassImpl();
		return ordinalScaledType_requiredMaxValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType_requiredValue_AttrEClass createOrdinalScaledType_requiredValue_AttrEClass() {
		OrdinalScaledType_requiredValue_AttrEClassImpl ordinalScaledType_requiredValue_AttrEClass = new OrdinalScaledType_requiredValue_AttrEClassImpl();
		return ordinalScaledType_requiredValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType_requiredMinValue_AttrEClass createOrdinalScaledType_requiredMinValue_AttrEClass() {
		OrdinalScaledType_requiredMinValue_AttrEClassImpl ordinalScaledType_requiredMinValue_AttrEClass = new OrdinalScaledType_requiredMinValue_AttrEClassImpl();
		return ordinalScaledType_requiredMinValue_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSemantic_correspondingAttributePath_AttrEClass createRefSemantic_correspondingAttributePath_AttrEClass() {
		RefSemantic_correspondingAttributePath_AttrEClassImpl refSemantic_correspondingAttributePath_AttrEClass = new RefSemantic_correspondingAttributePath_AttrEClassImpl();
		return refSemantic_correspondingAttributePath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass_refBaseClassPath_AttrEClass createRoleClass_refBaseClassPath_AttrEClass() {
		RoleClass_refBaseClassPath_AttrEClassImpl roleClass_refBaseClassPath_AttrEClass = new RoleClass_refBaseClassPath_AttrEClassImpl();
		return roleClass_refBaseClassPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime_CalculateableParameter createDateTime_CalculateableParameter() {
		DateTime_CalculateableParameterImpl dateTime_CalculateableParameter = new DateTime_CalculateableParameterImpl();
		return dateTime_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime_FunctionalParameter createDateTime_FunctionalParameter() {
		DateTime_FunctionalParameterImpl dateTime_FunctionalParameter = new DateTime_FunctionalParameterImpl();
		return dateTime_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime_PrimitiveArgument createDateTime_PrimitiveArgument() {
		DateTime_PrimitiveArgumentImpl dateTime_PrimitiveArgument = new DateTime_PrimitiveArgumentImpl();
		return dateTime_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime_CalculateableElementReferenceArgument createDateTime_CalculateableElementReferenceArgument() {
		DateTime_CalculateableElementReferenceArgumentImpl dateTime_CalculateableElementReferenceArgument = new DateTime_CalculateableElementReferenceArgumentImpl();
		return dateTime_CalculateableElementReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime_And_BitOperator createDateTime_And_BitOperator() {
		DateTime_And_BitOperatorImpl dateTime_And_BitOperator = new DateTime_And_BitOperatorImpl();
		return dateTime_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime_Or_BitOperator createDateTime_Or_BitOperator() {
		DateTime_Or_BitOperatorImpl dateTime_Or_BitOperator = new DateTime_Or_BitOperatorImpl();
		return dateTime_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_lastWritingDateTime_AttrEClass createSourceDocumentInformation_lastWritingDateTime_AttrEClass() {
		SourceDocumentInformation_lastWritingDateTime_AttrEClassImpl sourceDocumentInformation_lastWritingDateTime_AttrEClass = new SourceDocumentInformation_lastWritingDateTime_AttrEClassImpl();
		return sourceDocumentInformation_lastWritingDateTime_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originID_AttrEClass createSourceDocumentInformation_originID_AttrEClass() {
		SourceDocumentInformation_originID_AttrEClassImpl sourceDocumentInformation_originID_AttrEClass = new SourceDocumentInformation_originID_AttrEClassImpl();
		return sourceDocumentInformation_originID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originName_AttrEClass createSourceDocumentInformation_originName_AttrEClass() {
		SourceDocumentInformation_originName_AttrEClassImpl sourceDocumentInformation_originName_AttrEClass = new SourceDocumentInformation_originName_AttrEClassImpl();
		return sourceDocumentInformation_originName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originProjectID_AttrEClass createSourceDocumentInformation_originProjectID_AttrEClass() {
		SourceDocumentInformation_originProjectID_AttrEClassImpl sourceDocumentInformation_originProjectID_AttrEClass = new SourceDocumentInformation_originProjectID_AttrEClassImpl();
		return sourceDocumentInformation_originProjectID_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originProjectTitle_AttrEClass createSourceDocumentInformation_originProjectTitle_AttrEClass() {
		SourceDocumentInformation_originProjectTitle_AttrEClassImpl sourceDocumentInformation_originProjectTitle_AttrEClass = new SourceDocumentInformation_originProjectTitle_AttrEClassImpl();
		return sourceDocumentInformation_originProjectTitle_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originRelease_AttrEClass createSourceDocumentInformation_originRelease_AttrEClass() {
		SourceDocumentInformation_originRelease_AttrEClassImpl sourceDocumentInformation_originRelease_AttrEClass = new SourceDocumentInformation_originRelease_AttrEClassImpl();
		return sourceDocumentInformation_originRelease_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originVendor_AttrEClass createSourceDocumentInformation_originVendor_AttrEClass() {
		SourceDocumentInformation_originVendor_AttrEClassImpl sourceDocumentInformation_originVendor_AttrEClass = new SourceDocumentInformation_originVendor_AttrEClassImpl();
		return sourceDocumentInformation_originVendor_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originVendorURL_AttrEClass createSourceDocumentInformation_originVendorURL_AttrEClass() {
		SourceDocumentInformation_originVendorURL_AttrEClassImpl sourceDocumentInformation_originVendorURL_AttrEClass = new SourceDocumentInformation_originVendorURL_AttrEClassImpl();
		return sourceDocumentInformation_originVendorURL_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_originVersion_AttrEClass createSourceDocumentInformation_originVersion_AttrEClass() {
		SourceDocumentInformation_originVersion_AttrEClassImpl sourceDocumentInformation_originVersion_AttrEClass = new SourceDocumentInformation_originVersion_AttrEClassImpl();
		return sourceDocumentInformation_originVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedRoleClass_refRoleClassPath_AttrEClass createSupportedRoleClass_refRoleClassPath_AttrEClass() {
		SupportedRoleClass_refRoleClassPath_AttrEClassImpl supportedRoleClass_refRoleClassPath_AttrEClass = new SupportedRoleClass_refRoleClassPath_AttrEClassImpl();
		return supportedRoleClass_refRoleClassPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass_refBaseClassPath_AttrEClass createSystemUnitClass_refBaseClassPath_AttrEClass() {
		SystemUnitClass_refBaseClassPath_AttrEClassImpl systemUnitClass_refBaseClassPath_AttrEClass = new SystemUnitClass_refBaseClassPath_AttrEClassImpl();
		return systemUnitClass_refBaseClassPath_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType_requirements_AttrEClass createUnknownType_requirements_AttrEClass() {
		UnknownType_requirements_AttrEClassImpl unknownType_requirements_AttrEClass = new UnknownType_requirements_AttrEClassImpl();
		return unknownType_requirements_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copyright_value_AttrEClass createCopyright_value_AttrEClass() {
		Copyright_value_AttrEClassImpl copyright_value_AttrEClass = new Copyright_value_AttrEClassImpl();
		return copyright_value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copyright_changeMode_AttrEClass createCopyright_changeMode_AttrEClass() {
		Copyright_changeMode_AttrEClassImpl copyright_changeMode_AttrEClass = new Copyright_changeMode_AttrEClassImpl();
		return copyright_changeMode_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description_value_AttrEClass createDescription_value_AttrEClass() {
		Description_value_AttrEClassImpl description_value_AttrEClass = new Description_value_AttrEClassImpl();
		return description_value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description_changeMode_AttrEClass createDescription_changeMode_AttrEClass() {
		Description_changeMode_AttrEClassImpl description_changeMode_AttrEClass = new Description_changeMode_AttrEClassImpl();
		return description_changeMode_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_revisionDate_AttrEClass createRevision_revisionDate_AttrEClass() {
		Revision_revisionDate_AttrEClassImpl revision_revisionDate_AttrEClass = new Revision_revisionDate_AttrEClassImpl();
		return revision_revisionDate_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_oldVersion_AttrEClass createRevision_oldVersion_AttrEClass() {
		Revision_oldVersion_AttrEClassImpl revision_oldVersion_AttrEClass = new Revision_oldVersion_AttrEClassImpl();
		return revision_oldVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_newVersion_AttrEClass createRevision_newVersion_AttrEClass() {
		Revision_newVersion_AttrEClassImpl revision_newVersion_AttrEClass = new Revision_newVersion_AttrEClassImpl();
		return revision_newVersion_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_authorName_AttrEClass createRevision_authorName_AttrEClass() {
		Revision_authorName_AttrEClassImpl revision_authorName_AttrEClass = new Revision_authorName_AttrEClassImpl();
		return revision_authorName_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_comment_AttrEClass createRevision_comment_AttrEClass() {
		Revision_comment_AttrEClassImpl revision_comment_AttrEClass = new Revision_comment_AttrEClassImpl();
		return revision_comment_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version_value_AttrEClass createVersion_value_AttrEClass() {
		Version_value_AttrEClassImpl version_value_AttrEClass = new Version_value_AttrEClassImpl();
		return version_value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version_changeMode_AttrEClass createVersion_changeMode_AttrEClass() {
		Version_changeMode_AttrEClassImpl version_changeMode_AttrEClass = new Version_changeMode_AttrEClassImpl();
		return version_changeMode_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element_name_AttrEClass createElement_name_AttrEClass() {
		Element_name_AttrEClassImpl element_name_AttrEClass = new Element_name_AttrEClassImpl();
		return element_name_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element_value_AttrEClass createElement_value_AttrEClass() {
		Element_value_AttrEClassImpl element_value_AttrEClass = new Element_value_AttrEClassImpl();
		return element_value_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericElement_elementFeatureMap_AttrEClass createGenericElement_elementFeatureMap_AttrEClass() {
		GenericElement_elementFeatureMap_AttrEClassImpl genericElement_elementFeatureMap_AttrEClass = new GenericElement_elementFeatureMap_AttrEClassImpl();
		return genericElement_elementFeatureMap_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericElement_attributeFeatureMap_AttrEClass createGenericElement_attributeFeatureMap_AttrEClass() {
		GenericElement_attributeFeatureMap_AttrEClassImpl genericElement_attributeFeatureMap_AttrEClass = new GenericElement_attributeFeatureMap_AttrEClassImpl();
		return genericElement_attributeFeatureMap_AttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_OrGroup createAttribute_OrGroup() {
		Attribute_OrGroupImpl attribute_OrGroup = new Attribute_OrGroupImpl();
		return attribute_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSemantic_OrGroup createRefSemantic_OrGroup() {
		RefSemantic_OrGroupImpl refSemantic_OrGroup = new RefSemantic_OrGroupImpl();
		return refSemantic_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRequirement_OrGroup createAttributeValueRequirement_OrGroup() {
		AttributeValueRequirement_OrGroupImpl attributeValueRequirement_OrGroup = new AttributeValueRequirement_OrGroupImpl();
		return attributeValueRequirement_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaledType_OrGroup createOrdinalScaledType_OrGroup() {
		OrdinalScaledType_OrGroupImpl ordinalScaledType_OrGroup = new OrdinalScaledType_OrGroupImpl();
		return ordinalScaledType_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalScaledType_OrGroup createNominalScaledType_OrGroup() {
		NominalScaledType_OrGroupImpl nominalScaledType_OrGroup = new NominalScaledType_OrGroupImpl();
		return nominalScaledType_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType_OrGroup createUnknownType_OrGroup() {
		UnknownType_OrGroupImpl unknownType_OrGroup = new UnknownType_OrGroupImpl();
		return unknownType_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description_OrGroup createDescription_OrGroup() {
		Description_OrGroupImpl description_OrGroup = new Description_OrGroupImpl();
		return description_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version_OrGroup createVersion_OrGroup() {
		Version_OrGroupImpl version_OrGroup = new Version_OrGroupImpl();
		return version_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision_OrGroup createRevision_OrGroup() {
		Revision_OrGroupImpl revision_OrGroup = new Revision_OrGroupImpl();
		return revision_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copyright_OrGroup createCopyright_OrGroup() {
		Copyright_OrGroupImpl copyright_OrGroup = new Copyright_OrGroupImpl();
		return copyright_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalInformation_OrGroup createAdditionalInformation_OrGroup() {
		AdditionalInformation_OrGroupImpl additionalInformation_OrGroup = new AdditionalInformation_OrGroupImpl();
		return additionalInformation_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_OrGroup createSourceDocumentInformation_OrGroup() {
		SourceDocumentInformation_OrGroupImpl sourceDocumentInformation_OrGroup = new SourceDocumentInformation_OrGroupImpl();
		return sourceDocumentInformation_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType_OrGroup createExternalReferenceType_OrGroup() {
		ExternalReferenceType_OrGroupImpl externalReferenceType_OrGroup = new ExternalReferenceType_OrGroupImpl();
		return externalReferenceType_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceHierarchy_OrGroup createInstanceHierarchy_OrGroup() {
		InstanceHierarchy_OrGroupImpl instanceHierarchy_OrGroup = new InstanceHierarchy_OrGroupImpl();
		return instanceHierarchy_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassLib_OrGroup createInterfaceClassLib_OrGroup() {
		InterfaceClassLib_OrGroupImpl interfaceClassLib_OrGroup = new InterfaceClassLib_OrGroupImpl();
		return interfaceClassLib_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassLib_OrGroup createRoleClassLib_OrGroup() {
		RoleClassLib_OrGroupImpl roleClassLib_OrGroup = new RoleClassLib_OrGroupImpl();
		return roleClassLib_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClassLib_OrGroup createSystemUnitClassLib_OrGroup() {
		SystemUnitClassLib_OrGroupImpl systemUnitClassLib_OrGroup = new SystemUnitClassLib_OrGroupImpl();
		return systemUnitClassLib_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLib_OrGroup createAttributeLib_OrGroup() {
		AttributeLib_OrGroupImpl attributeLib_OrGroup = new AttributeLib_OrGroupImpl();
		return attributeLib_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile_OrGroup createCAEXFile_OrGroup() {
		CAEXFile_OrGroupImpl caexFile_OrGroup = new CAEXFile_OrGroupImpl();
		return caexFile_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass_OrGroup createInterfaceClass_OrGroup() {
		InterfaceClass_OrGroupImpl interfaceClass_OrGroup = new InterfaceClass_OrGroupImpl();
		return interfaceClass_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalElement_OrGroup createInternalElement_OrGroup() {
		InternalElement_OrGroupImpl internalElement_OrGroup = new InternalElement_OrGroupImpl();
		return internalElement_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInterface_OrGroup createExternalInterface_OrGroup() {
		ExternalInterface_OrGroupImpl externalInterface_OrGroup = new ExternalInterface_OrGroupImpl();
		return externalInterface_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequirements_OrGroup createRoleRequirements_OrGroup() {
		RoleRequirements_OrGroupImpl roleRequirements_OrGroup = new RoleRequirements_OrGroupImpl();
		return roleRequirements_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass_OrGroup createSystemUnitClass_OrGroup() {
		SystemUnitClass_OrGroupImpl systemUnitClass_OrGroup = new SystemUnitClass_OrGroupImpl();
		return systemUnitClass_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNameMapping_OrGroup createAttributeNameMapping_OrGroup() {
		AttributeNameMapping_OrGroupImpl attributeNameMapping_OrGroup = new AttributeNameMapping_OrGroupImpl();
		return attributeNameMapping_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceIDMapping_OrGroup createInterfaceIDMapping_OrGroup() {
		InterfaceIDMapping_OrGroupImpl interfaceIDMapping_OrGroup = new InterfaceIDMapping_OrGroupImpl();
		return interfaceIDMapping_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass_OrGroup createRoleClass_OrGroup() {
		RoleClass_OrGroupImpl roleClass_OrGroup = new RoleClass_OrGroupImpl();
		return roleClass_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping_OrGroup createMapping_OrGroup() {
		Mapping_OrGroupImpl mapping_OrGroup = new Mapping_OrGroupImpl();
		return mapping_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedRoleClass_OrGroup createSupportedRoleClass_OrGroup() {
		SupportedRoleClass_OrGroupImpl supportedRoleClass_OrGroup = new SupportedRoleClass_OrGroupImpl();
		return supportedRoleClass_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink_OrGroup createInternalLink_OrGroup() {
		InternalLink_OrGroupImpl internalLink_OrGroup = new InternalLink_OrGroupImpl();
		return internalLink_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericElement_OrGroup createGenericElement_OrGroup() {
		GenericElement_OrGroupImpl genericElement_OrGroup = new GenericElement_OrGroupImpl();
		return genericElement_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttribute_OrGroup createGenericAttribute_OrGroup() {
		GenericAttribute_OrGroupImpl genericAttribute_OrGroup = new GenericAttribute_OrGroupImpl();
		return genericAttribute_OrGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_CalculateableParameter createObject_CalculateableParameter() {
		Object_CalculateableParameterImpl object_CalculateableParameter = new Object_CalculateableParameterImpl();
		return object_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_FunctionalParameter createObject_FunctionalParameter() {
		Object_FunctionalParameterImpl object_FunctionalParameter = new Object_FunctionalParameterImpl();
		return object_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_PrimitiveArgument createObject_PrimitiveArgument() {
		Object_PrimitiveArgumentImpl object_PrimitiveArgument = new Object_PrimitiveArgumentImpl();
		return object_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_And_BitOperator createObject_And_BitOperator() {
		Object_And_BitOperatorImpl object_And_BitOperator = new Object_And_BitOperatorImpl();
		return object_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Or_BitOperator createObject_Or_BitOperator() {
		Object_Or_BitOperatorImpl object_Or_BitOperator = new Object_Or_BitOperatorImpl();
		return object_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_CalculateableParameter createBoolean_CalculateableParameter() {
		Boolean_CalculateableParameterImpl boolean_CalculateableParameter = new Boolean_CalculateableParameterImpl();
		return boolean_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_FunctionalParameter createBoolean_FunctionalParameter() {
		Boolean_FunctionalParameterImpl boolean_FunctionalParameter = new Boolean_FunctionalParameterImpl();
		return boolean_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_PrimitiveArgument createBoolean_PrimitiveArgument() {
		Boolean_PrimitiveArgumentImpl boolean_PrimitiveArgument = new Boolean_PrimitiveArgumentImpl();
		return boolean_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_And_BitOperator createBoolean_And_BitOperator() {
		Boolean_And_BitOperatorImpl boolean_And_BitOperator = new Boolean_And_BitOperatorImpl();
		return boolean_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_Or_BitOperator createBoolean_Or_BitOperator() {
		Boolean_Or_BitOperatorImpl boolean_Or_BitOperator = new Boolean_Or_BitOperatorImpl();
		return boolean_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equals_FunctionalOperator createequals_FunctionalOperator() {
		equals_FunctionalOperatorImpl equals_FunctionalOperator = new equals_FunctionalOperatorImpl();
		return equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toString_FunctionalOperator createtoString_FunctionalOperator() {
		toString_FunctionalOperatorImpl toString_FunctionalOperator = new toString_FunctionalOperatorImpl();
		return toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_CalculateableParameter createCharSequence_CalculateableParameter() {
		CharSequence_CalculateableParameterImpl charSequence_CalculateableParameter = new CharSequence_CalculateableParameterImpl();
		return charSequence_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_FunctionalParameter createCharSequence_FunctionalParameter() {
		CharSequence_FunctionalParameterImpl charSequence_FunctionalParameter = new CharSequence_FunctionalParameterImpl();
		return charSequence_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_PrimitiveArgument createCharSequence_PrimitiveArgument() {
		CharSequence_PrimitiveArgumentImpl charSequence_PrimitiveArgument = new CharSequence_PrimitiveArgumentImpl();
		return charSequence_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_And_BitOperator createCharSequence_And_BitOperator() {
		CharSequence_And_BitOperatorImpl charSequence_And_BitOperator = new CharSequence_And_BitOperatorImpl();
		return charSequence_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_Or_BitOperator createCharSequence_Or_BitOperator() {
		CharSequence_Or_BitOperatorImpl charSequence_Or_BitOperator = new CharSequence_Or_BitOperatorImpl();
		return charSequence_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_CalculateableParameter createInteger_CalculateableParameter() {
		Integer_CalculateableParameterImpl integer_CalculateableParameter = new Integer_CalculateableParameterImpl();
		return integer_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_FunctionalParameter createInteger_FunctionalParameter() {
		Integer_FunctionalParameterImpl integer_FunctionalParameter = new Integer_FunctionalParameterImpl();
		return integer_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_PrimitiveArgument createInteger_PrimitiveArgument() {
		Integer_PrimitiveArgumentImpl integer_PrimitiveArgument = new Integer_PrimitiveArgumentImpl();
		return integer_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_And_BitOperator createInteger_And_BitOperator() {
		Integer_And_BitOperatorImpl integer_And_BitOperator = new Integer_And_BitOperatorImpl();
		return integer_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer_Or_BitOperator createInteger_Or_BitOperator() {
		Integer_Or_BitOperatorImpl integer_Or_BitOperator = new Integer_Or_BitOperatorImpl();
		return integer_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public length_FunctionalOperator createlength_FunctionalOperator() {
		length_FunctionalOperatorImpl length_FunctionalOperator = new length_FunctionalOperatorImpl();
		return length_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_CalculateableParameter createCharacter_CalculateableParameter() {
		Character_CalculateableParameterImpl character_CalculateableParameter = new Character_CalculateableParameterImpl();
		return character_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_FunctionalParameter createCharacter_FunctionalParameter() {
		Character_FunctionalParameterImpl character_FunctionalParameter = new Character_FunctionalParameterImpl();
		return character_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_PrimitiveArgument createCharacter_PrimitiveArgument() {
		Character_PrimitiveArgumentImpl character_PrimitiveArgument = new Character_PrimitiveArgumentImpl();
		return character_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_And_BitOperator createCharacter_And_BitOperator() {
		Character_And_BitOperatorImpl character_And_BitOperator = new Character_And_BitOperatorImpl();
		return character_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character_Or_BitOperator createCharacter_Or_BitOperator() {
		Character_Or_BitOperatorImpl character_Or_BitOperator = new Character_Or_BitOperatorImpl();
		return character_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public charAt_FunctionalOperator createcharAt_FunctionalOperator() {
		charAt_FunctionalOperatorImpl charAt_FunctionalOperator = new charAt_FunctionalOperatorImpl();
		return charAt_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public contains_FunctionalOperator createcontains_FunctionalOperator() {
		contains_FunctionalOperatorImpl contains_FunctionalOperator = new contains_FunctionalOperatorImpl();
		return contains_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public substring_FunctionalOperator createsubstring_FunctionalOperator() {
		substring_FunctionalOperatorImpl substring_FunctionalOperator = new substring_FunctionalOperatorImpl();
		return substring_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public concat_FunctionalOperator createconcat_FunctionalOperator() {
		concat_FunctionalOperatorImpl concat_FunctionalOperator = new concat_FunctionalOperatorImpl();
		return concat_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public endsWith_FunctionalOperator createendsWith_FunctionalOperator() {
		endsWith_FunctionalOperatorImpl endsWith_FunctionalOperator = new endsWith_FunctionalOperatorImpl();
		return endsWith_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equalsIgnoreCase_FunctionalOperator createequalsIgnoreCase_FunctionalOperator() {
		equalsIgnoreCase_FunctionalOperatorImpl equalsIgnoreCase_FunctionalOperator = new equalsIgnoreCase_FunctionalOperatorImpl();
		return equalsIgnoreCase_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public indexOfString_FunctionalOperator createindexOfString_FunctionalOperator() {
		indexOfString_FunctionalOperatorImpl indexOfString_FunctionalOperator = new indexOfString_FunctionalOperatorImpl();
		return indexOfString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isEmpty_FunctionalOperator createisEmpty_FunctionalOperator() {
		isEmpty_FunctionalOperatorImpl isEmpty_FunctionalOperator = new isEmpty_FunctionalOperatorImpl();
		return isEmpty_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_CalculateableParameter createNumber_CalculateableParameter() {
		Number_CalculateableParameterImpl number_CalculateableParameter = new Number_CalculateableParameterImpl();
		return number_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_FunctionalParameter createNumber_FunctionalParameter() {
		Number_FunctionalParameterImpl number_FunctionalParameter = new Number_FunctionalParameterImpl();
		return number_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_PrimitiveArgument createNumber_PrimitiveArgument() {
		Number_PrimitiveArgumentImpl number_PrimitiveArgument = new Number_PrimitiveArgumentImpl();
		return number_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_And_BitOperator createNumber_And_BitOperator() {
		Number_And_BitOperatorImpl number_And_BitOperator = new Number_And_BitOperatorImpl();
		return number_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Or_BitOperator createNumber_Or_BitOperator() {
		Number_Or_BitOperatorImpl number_Or_BitOperator = new Number_Or_BitOperatorImpl();
		return number_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public greaterThan_FunctionalOperator creategreaterThan_FunctionalOperator() {
		greaterThan_FunctionalOperatorImpl greaterThan_FunctionalOperator = new greaterThan_FunctionalOperatorImpl();
		return greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public greaterEquals_FunctionalOperator creategreaterEquals_FunctionalOperator() {
		greaterEquals_FunctionalOperatorImpl greaterEquals_FunctionalOperator = new greaterEquals_FunctionalOperatorImpl();
		return greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smallerThan_FunctionalOperator createsmallerThan_FunctionalOperator() {
		smallerThan_FunctionalOperatorImpl smallerThan_FunctionalOperator = new smallerThan_FunctionalOperatorImpl();
		return smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smallerEquals_FunctionalOperator createsmallerEquals_FunctionalOperator() {
		smallerEquals_FunctionalOperatorImpl smallerEquals_FunctionalOperator = new smallerEquals_FunctionalOperatorImpl();
		return smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public parseBoolean_FunctionalOperator createparseBoolean_FunctionalOperator() {
		parseBoolean_FunctionalOperatorImpl parseBoolean_FunctionalOperator = new parseBoolean_FunctionalOperatorImpl();
		return parseBoolean_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compareTo_FunctionalOperator createcompareTo_FunctionalOperator() {
		compareTo_FunctionalOperatorImpl compareTo_FunctionalOperator = new compareTo_FunctionalOperatorImpl();
		return compareTo_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Number_equals_FunctionalOperator createObject_Number_equals_FunctionalOperator() {
		Object_Number_equals_FunctionalOperatorImpl object_Number_equals_FunctionalOperator = new Object_Number_equals_FunctionalOperatorImpl();
		return object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Number_toString_FunctionalOperator createObject_Number_toString_FunctionalOperator() {
		Object_Number_toString_FunctionalOperatorImpl object_Number_toString_FunctionalOperator = new Object_Number_toString_FunctionalOperatorImpl();
		return object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_greaterThan_FunctionalOperator createNumber_Integer_greaterThan_FunctionalOperator() {
		Number_Integer_greaterThan_FunctionalOperatorImpl number_Integer_greaterThan_FunctionalOperator = new Number_Integer_greaterThan_FunctionalOperatorImpl();
		return number_Integer_greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_greaterEquals_FunctionalOperator createNumber_Integer_greaterEquals_FunctionalOperator() {
		Number_Integer_greaterEquals_FunctionalOperatorImpl number_Integer_greaterEquals_FunctionalOperator = new Number_Integer_greaterEquals_FunctionalOperatorImpl();
		return number_Integer_greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_smallerThan_FunctionalOperator createNumber_Integer_smallerThan_FunctionalOperator() {
		Number_Integer_smallerThan_FunctionalOperatorImpl number_Integer_smallerThan_FunctionalOperator = new Number_Integer_smallerThan_FunctionalOperatorImpl();
		return number_Integer_smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_smallerEquals_FunctionalOperator createNumber_Integer_smallerEquals_FunctionalOperator() {
		Number_Integer_smallerEquals_FunctionalOperatorImpl number_Integer_smallerEquals_FunctionalOperator = new Number_Integer_smallerEquals_FunctionalOperatorImpl();
		return number_Integer_smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_Object_Number_equals_FunctionalOperator createNumber_Integer_Object_Number_equals_FunctionalOperator() {
		Number_Integer_Object_Number_equals_FunctionalOperatorImpl number_Integer_Object_Number_equals_FunctionalOperator = new Number_Integer_Object_Number_equals_FunctionalOperatorImpl();
		return number_Integer_Object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Integer_Object_Number_toString_FunctionalOperator createNumber_Integer_Object_Number_toString_FunctionalOperator() {
		Number_Integer_Object_Number_toString_FunctionalOperatorImpl number_Integer_Object_Number_toString_FunctionalOperator = new Number_Integer_Object_Number_toString_FunctionalOperatorImpl();
		return number_Integer_Object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long_CalculateableParameter createLong_CalculateableParameter() {
		Long_CalculateableParameterImpl long_CalculateableParameter = new Long_CalculateableParameterImpl();
		return long_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long_FunctionalParameter createLong_FunctionalParameter() {
		Long_FunctionalParameterImpl long_FunctionalParameter = new Long_FunctionalParameterImpl();
		return long_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long_PrimitiveArgument createLong_PrimitiveArgument() {
		Long_PrimitiveArgumentImpl long_PrimitiveArgument = new Long_PrimitiveArgumentImpl();
		return long_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long_And_BitOperator createLong_And_BitOperator() {
		Long_And_BitOperatorImpl long_And_BitOperator = new Long_And_BitOperatorImpl();
		return long_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long_Or_BitOperator createLong_Or_BitOperator() {
		Long_Or_BitOperatorImpl long_Or_BitOperator = new Long_Or_BitOperatorImpl();
		return long_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Long_greaterThan_FunctionalOperator createNumber_Long_greaterThan_FunctionalOperator() {
		Number_Long_greaterThan_FunctionalOperatorImpl number_Long_greaterThan_FunctionalOperator = new Number_Long_greaterThan_FunctionalOperatorImpl();
		return number_Long_greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Long_greaterEquals_FunctionalOperator createNumber_Long_greaterEquals_FunctionalOperator() {
		Number_Long_greaterEquals_FunctionalOperatorImpl number_Long_greaterEquals_FunctionalOperator = new Number_Long_greaterEquals_FunctionalOperatorImpl();
		return number_Long_greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Long_smallerThan_FunctionalOperator createNumber_Long_smallerThan_FunctionalOperator() {
		Number_Long_smallerThan_FunctionalOperatorImpl number_Long_smallerThan_FunctionalOperator = new Number_Long_smallerThan_FunctionalOperatorImpl();
		return number_Long_smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Long_smallerEquals_FunctionalOperator createNumber_Long_smallerEquals_FunctionalOperator() {
		Number_Long_smallerEquals_FunctionalOperatorImpl number_Long_smallerEquals_FunctionalOperator = new Number_Long_smallerEquals_FunctionalOperatorImpl();
		return number_Long_smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Long_Object_Number_equals_FunctionalOperator createNumber_Long_Object_Number_equals_FunctionalOperator() {
		Number_Long_Object_Number_equals_FunctionalOperatorImpl number_Long_Object_Number_equals_FunctionalOperator = new Number_Long_Object_Number_equals_FunctionalOperatorImpl();
		return number_Long_Object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Long_Object_Number_toString_FunctionalOperator createNumber_Long_Object_Number_toString_FunctionalOperator() {
		Number_Long_Object_Number_toString_FunctionalOperatorImpl number_Long_Object_Number_toString_FunctionalOperator = new Number_Long_Object_Number_toString_FunctionalOperatorImpl();
		return number_Long_Object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_CalculateableParameter createDouble_CalculateableParameter() {
		Double_CalculateableParameterImpl double_CalculateableParameter = new Double_CalculateableParameterImpl();
		return double_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_FunctionalParameter createDouble_FunctionalParameter() {
		Double_FunctionalParameterImpl double_FunctionalParameter = new Double_FunctionalParameterImpl();
		return double_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_PrimitiveArgument createDouble_PrimitiveArgument() {
		Double_PrimitiveArgumentImpl double_PrimitiveArgument = new Double_PrimitiveArgumentImpl();
		return double_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_And_BitOperator createDouble_And_BitOperator() {
		Double_And_BitOperatorImpl double_And_BitOperator = new Double_And_BitOperatorImpl();
		return double_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double_Or_BitOperator createDouble_Or_BitOperator() {
		Double_Or_BitOperatorImpl double_Or_BitOperator = new Double_Or_BitOperatorImpl();
		return double_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_greaterThan_FunctionalOperator createNumber_Double_greaterThan_FunctionalOperator() {
		Number_Double_greaterThan_FunctionalOperatorImpl number_Double_greaterThan_FunctionalOperator = new Number_Double_greaterThan_FunctionalOperatorImpl();
		return number_Double_greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_greaterEquals_FunctionalOperator createNumber_Double_greaterEquals_FunctionalOperator() {
		Number_Double_greaterEquals_FunctionalOperatorImpl number_Double_greaterEquals_FunctionalOperator = new Number_Double_greaterEquals_FunctionalOperatorImpl();
		return number_Double_greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_smallerThan_FunctionalOperator createNumber_Double_smallerThan_FunctionalOperator() {
		Number_Double_smallerThan_FunctionalOperatorImpl number_Double_smallerThan_FunctionalOperator = new Number_Double_smallerThan_FunctionalOperatorImpl();
		return number_Double_smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_smallerEquals_FunctionalOperator createNumber_Double_smallerEquals_FunctionalOperator() {
		Number_Double_smallerEquals_FunctionalOperatorImpl number_Double_smallerEquals_FunctionalOperator = new Number_Double_smallerEquals_FunctionalOperatorImpl();
		return number_Double_smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_Object_Number_equals_FunctionalOperator createNumber_Double_Object_Number_equals_FunctionalOperator() {
		Number_Double_Object_Number_equals_FunctionalOperatorImpl number_Double_Object_Number_equals_FunctionalOperator = new Number_Double_Object_Number_equals_FunctionalOperatorImpl();
		return number_Double_Object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Double_Object_Number_toString_FunctionalOperator createNumber_Double_Object_Number_toString_FunctionalOperator() {
		Number_Double_Object_Number_toString_FunctionalOperatorImpl number_Double_Object_Number_toString_FunctionalOperator = new Number_Double_Object_Number_toString_FunctionalOperatorImpl();
		return number_Double_Object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float_CalculateableParameter createFloat_CalculateableParameter() {
		Float_CalculateableParameterImpl float_CalculateableParameter = new Float_CalculateableParameterImpl();
		return float_CalculateableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float_FunctionalParameter createFloat_FunctionalParameter() {
		Float_FunctionalParameterImpl float_FunctionalParameter = new Float_FunctionalParameterImpl();
		return float_FunctionalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float_PrimitiveArgument createFloat_PrimitiveArgument() {
		Float_PrimitiveArgumentImpl float_PrimitiveArgument = new Float_PrimitiveArgumentImpl();
		return float_PrimitiveArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float_And_BitOperator createFloat_And_BitOperator() {
		Float_And_BitOperatorImpl float_And_BitOperator = new Float_And_BitOperatorImpl();
		return float_And_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float_Or_BitOperator createFloat_Or_BitOperator() {
		Float_Or_BitOperatorImpl float_Or_BitOperator = new Float_Or_BitOperatorImpl();
		return float_Or_BitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Float_greaterThan_FunctionalOperator createNumber_Float_greaterThan_FunctionalOperator() {
		Number_Float_greaterThan_FunctionalOperatorImpl number_Float_greaterThan_FunctionalOperator = new Number_Float_greaterThan_FunctionalOperatorImpl();
		return number_Float_greaterThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Float_greaterEquals_FunctionalOperator createNumber_Float_greaterEquals_FunctionalOperator() {
		Number_Float_greaterEquals_FunctionalOperatorImpl number_Float_greaterEquals_FunctionalOperator = new Number_Float_greaterEquals_FunctionalOperatorImpl();
		return number_Float_greaterEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Float_smallerThan_FunctionalOperator createNumber_Float_smallerThan_FunctionalOperator() {
		Number_Float_smallerThan_FunctionalOperatorImpl number_Float_smallerThan_FunctionalOperator = new Number_Float_smallerThan_FunctionalOperatorImpl();
		return number_Float_smallerThan_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Float_smallerEquals_FunctionalOperator createNumber_Float_smallerEquals_FunctionalOperator() {
		Number_Float_smallerEquals_FunctionalOperatorImpl number_Float_smallerEquals_FunctionalOperator = new Number_Float_smallerEquals_FunctionalOperatorImpl();
		return number_Float_smallerEquals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Float_Object_Number_equals_FunctionalOperator createNumber_Float_Object_Number_equals_FunctionalOperator() {
		Number_Float_Object_Number_equals_FunctionalOperatorImpl number_Float_Object_Number_equals_FunctionalOperator = new Number_Float_Object_Number_equals_FunctionalOperatorImpl();
		return number_Float_Object_Number_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_Float_Object_Number_toString_FunctionalOperator createNumber_Float_Object_Number_toString_FunctionalOperator() {
		Number_Float_Object_Number_toString_FunctionalOperatorImpl number_Float_Object_Number_toString_FunctionalOperator = new Number_Float_Object_Number_toString_FunctionalOperatorImpl();
		return number_Float_Object_Number_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_CharSequence_equals_FunctionalOperator createObject_CharSequence_equals_FunctionalOperator() {
		Object_CharSequence_equals_FunctionalOperatorImpl object_CharSequence_equals_FunctionalOperator = new Object_CharSequence_equals_FunctionalOperatorImpl();
		return object_CharSequence_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_CharSequence_toString_FunctionalOperator createObject_CharSequence_toString_FunctionalOperator() {
		Object_CharSequence_toString_FunctionalOperatorImpl object_CharSequence_toString_FunctionalOperator = new Object_CharSequence_toString_FunctionalOperatorImpl();
		return object_CharSequence_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Character_equals_FunctionalOperator createObject_Character_equals_FunctionalOperator() {
		Object_Character_equals_FunctionalOperatorImpl object_Character_equals_FunctionalOperator = new Object_Character_equals_FunctionalOperatorImpl();
		return object_Character_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Character_toString_FunctionalOperator createObject_Character_toString_FunctionalOperator() {
		Object_Character_toString_FunctionalOperatorImpl object_Character_toString_FunctionalOperator = new Object_Character_toString_FunctionalOperatorImpl();
		return object_Character_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Boolean_equals_FunctionalOperator createObject_Boolean_equals_FunctionalOperator() {
		Object_Boolean_equals_FunctionalOperatorImpl object_Boolean_equals_FunctionalOperator = new Object_Boolean_equals_FunctionalOperatorImpl();
		return object_Boolean_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object_Boolean_toString_FunctionalOperator createObject_Boolean_toString_FunctionalOperator() {
		Object_Boolean_toString_FunctionalOperatorImpl object_Boolean_toString_FunctionalOperator = new Object_Boolean_toString_FunctionalOperatorImpl();
		return object_Boolean_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_String_length_FunctionalOperator createCharSequence_String_length_FunctionalOperator() {
		CharSequence_String_length_FunctionalOperatorImpl charSequence_String_length_FunctionalOperator = new CharSequence_String_length_FunctionalOperatorImpl();
		return charSequence_String_length_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_String_Object_CharSequence_equals_FunctionalOperator createCharSequence_String_Object_CharSequence_equals_FunctionalOperator() {
		CharSequence_String_Object_CharSequence_equals_FunctionalOperatorImpl charSequence_String_Object_CharSequence_equals_FunctionalOperator = new CharSequence_String_Object_CharSequence_equals_FunctionalOperatorImpl();
		return charSequence_String_Object_CharSequence_equals_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence_String_Object_CharSequence_toString_FunctionalOperator createCharSequence_String_Object_CharSequence_toString_FunctionalOperator() {
		CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl charSequence_String_Object_CharSequence_toString_FunctionalOperator = new CharSequence_String_Object_CharSequence_toString_FunctionalOperatorImpl();
		return charSequence_String_Object_CharSequence_toString_FunctionalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count_AggregationOperator createCount_AggregationOperator() {
		Count_AggregationOperatorImpl count_AggregationOperator = new Count_AggregationOperatorImpl();
		return count_AggregationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sum_AggregationOperator createSum_AggregationOperator() {
		Sum_AggregationOperatorImpl sum_AggregationOperator = new Sum_AggregationOperatorImpl();
		return sum_AggregationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Min_AggregationOperator createMin_AggregationOperator() {
		Min_AggregationOperatorImpl min_AggregationOperator = new Min_AggregationOperatorImpl();
		return min_AggregationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Max_AggregationOperator createMax_AggregationOperator() {
		Max_AggregationOperatorImpl max_AggregationOperator = new Max_AggregationOperatorImpl();
		return max_AggregationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerParseInt_ClassOperator createIntegerParseInt_ClassOperator() {
		IntegerParseInt_ClassOperatorImpl integerParseInt_ClassOperator = new IntegerParseInt_ClassOperatorImpl();
		return integerParseInt_ClassOperator;
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
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharSequence createCharSequenceFromString(EDataType eDataType, String initialValue) {
		return (CharSequence)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharSequenceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createCharacterFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number createNumberFromString(EDataType eDataType, String initialValue) {
		return (Number)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createLongFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmPackage getQmmPackage() {
		return (QmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QmmPackage getPackage() {
		return QmmPackage.eINSTANCE;
	}

} //QmmFactoryImpl
