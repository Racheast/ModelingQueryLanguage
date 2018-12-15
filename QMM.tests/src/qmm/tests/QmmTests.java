/**
 */
package qmm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>qmm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmmTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new QmmTests("qmm Tests");
		suite.addTestSuite(AttributeFamilyTest.class);
		suite.addTestSuite(AttributeNameMappingTest.class);
		suite.addTestSuite(AttributeTest.class);
		suite.addTestSuite(AttributeLibTest.class);
		suite.addTestSuite(AttributeValueRequirementTest.class);
		suite.addTestSuite(CAEXBasicObjectTest.class);
		suite.addTestSuite(CAEXFileTest.class);
		suite.addTestSuite(CAEXObjectTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(ExternalInterfaceTest.class);
		suite.addTestSuite(ExternalReferenceTypeTest.class);
		suite.addTestSuite(InstanceHierarchyTest.class);
		suite.addTestSuite(InterfaceClassLibTest.class);
		suite.addTestSuite(InterfaceClassTest.class);
		suite.addTestSuite(InterfaceFamilyTest.class);
		suite.addTestSuite(InterfaceIDMappingTest.class);
		suite.addTestSuite(InternalElementTest.class);
		suite.addTestSuite(InternalLinkTest.class);
		suite.addTestSuite(MappingTest.class);
		suite.addTestSuite(NominalScaledTypeTest.class);
		suite.addTestSuite(OrdinalScaledTypeTest.class);
		suite.addTestSuite(RefSemanticTest.class);
		suite.addTestSuite(RoleClassLibTest.class);
		suite.addTestSuite(RoleClassTest.class);
		suite.addTestSuite(RoleFamilyTest.class);
		suite.addTestSuite(RoleRequirementsTest.class);
		suite.addTestSuite(SourceDocumentInformationTest.class);
		suite.addTestSuite(SupportedRoleClassTest.class);
		suite.addTestSuite(SystemUnitClassLibTest.class);
		suite.addTestSuite(SystemUnitClassTest.class);
		suite.addTestSuite(SystemUnitFamilyTest.class);
		suite.addTestSuite(UnknownTypeTest.class);
		suite.addTestSuite(CopyrightTest.class);
		suite.addTestSuite(DescriptionTest.class);
		suite.addTestSuite(RevisionTest.class);
		suite.addTestSuite(VersionTest.class);
		suite.addTestSuite(AdditionalInformationTest.class);
		suite.addTestSuite(GenericElementTest.class);
		suite.addTestSuite(GenericAttributeTest.class);
		suite.addTestSuite(Countable_ReferenceArgumentTest.class);
		suite.addTestSuite(CountableReferenceParameterTest.class);
		suite.addTestSuite(And_EvaluationBitOperatorTest.class);
		suite.addTestSuite(Or_EvaluationBitOperatorTest.class);
		suite.addTestSuite(String_CalculateableParameterTest.class);
		suite.addTestSuite(String_FunctionalParameterTest.class);
		suite.addTestSuite(String_PrimitiveArgumentTest.class);
		suite.addTestSuite(String_CalculateableElementReferenceArgumentTest.class);
		suite.addTestSuite(String_And_BitOperatorTest.class);
		suite.addTestSuite(String_Or_BitOperatorTest.class);
		suite.addTestSuite(AttributeNameMapping_roleAttributeName_AttrEClassTest.class);
		suite.addTestSuite(AttributeNameMapping_systemUnitAttributeName_AttrEClassTest.class);
		suite.addTestSuite(Attribute_defaultValue_AttrEClassTest.class);
		suite.addTestSuite(Attribute_value_AttrEClassTest.class);
		suite.addTestSuite(AttributeDataType_CalculateableParameterTest.class);
		suite.addTestSuite(AttributeDataType_FunctionalParameterTest.class);
		suite.addTestSuite(AttributeDataType_PrimitiveArgumentTest.class);
		suite.addTestSuite(AttributeDataType_CalculateableElementReferenceArgumentTest.class);
		suite.addTestSuite(AttributeDataType_And_BitOperatorTest.class);
		suite.addTestSuite(AttributeDataType_Or_BitOperatorTest.class);
		suite.addTestSuite(Attribute_attributeDataType_AttrEClassTest.class);
		suite.addTestSuite(Attribute_refAttributeType_AttrEClassTest.class);
		suite.addTestSuite(Attribute_unit_AttrEClassTest.class);
		suite.addTestSuite(AttributeValueRequirement_name_AttrEClassTest.class);
		suite.addTestSuite(CAEXFile_superiorStandardVersion_AttrEClassTest.class);
		suite.addTestSuite(CAEXFile_fileName_AttrEClassTest.class);
		suite.addTestSuite(CAEXFile_schemaVersion_AttrEClassTest.class);
		suite.addTestSuite(CAEXObject_iD_AttrEClassTest.class);
		suite.addTestSuite(CAEXObject_name_AttrEClassTest.class);
		suite.addTestSuite(EFeatureMapEntry_CalculateableParameterTest.class);
		suite.addTestSuite(EFeatureMapEntry_FunctionalParameterTest.class);
		suite.addTestSuite(EFeatureMapEntry_PrimitiveArgumentTest.class);
		suite.addTestSuite(EFeatureMapEntry_CalculateableElementReferenceArgumentTest.class);
		suite.addTestSuite(EFeatureMapEntry_And_BitOperatorTest.class);
		suite.addTestSuite(EFeatureMapEntry_Or_BitOperatorTest.class);
		suite.addTestSuite(DocumentRoot_mixed_AttrEClassTest.class);
		suite.addTestSuite(ExternalReferenceType_alias_AttrEClassTest.class);
		suite.addTestSuite(ExternalReferenceType_path_AttrEClassTest.class);
		suite.addTestSuite(InterfaceClass_refBaseClassPath_AttrEClassTest.class);
		suite.addTestSuite(InterfaceIDMapping_roleInterfaceID_AttrEClassTest.class);
		suite.addTestSuite(InterfaceIDMapping_systemUnitInterfaceID_AttrEClassTest.class);
		suite.addTestSuite(InternalElement_refBaseSystemUnitPath_AttrEClassTest.class);
		suite.addTestSuite(InternalLink_refPartnerSideA_AttrEClassTest.class);
		suite.addTestSuite(InternalLink_refPartnerSideB_AttrEClassTest.class);
		suite.addTestSuite(NominalScaledType_requiredValue_AttrEClassTest.class);
		suite.addTestSuite(OrdinalScaledType_requiredMaxValue_AttrEClassTest.class);
		suite.addTestSuite(OrdinalScaledType_requiredValue_AttrEClassTest.class);
		suite.addTestSuite(OrdinalScaledType_requiredMinValue_AttrEClassTest.class);
		suite.addTestSuite(RefSemantic_correspondingAttributePath_AttrEClassTest.class);
		suite.addTestSuite(RoleClass_refBaseClassPath_AttrEClassTest.class);
		suite.addTestSuite(DateTime_CalculateableParameterTest.class);
		suite.addTestSuite(DateTime_FunctionalParameterTest.class);
		suite.addTestSuite(DateTime_PrimitiveArgumentTest.class);
		suite.addTestSuite(DateTime_CalculateableElementReferenceArgumentTest.class);
		suite.addTestSuite(DateTime_And_BitOperatorTest.class);
		suite.addTestSuite(DateTime_Or_BitOperatorTest.class);
		suite.addTestSuite(SourceDocumentInformation_lastWritingDateTime_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originID_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originName_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originProjectID_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originProjectTitle_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originRelease_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originVendor_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originVendorURL_AttrEClassTest.class);
		suite.addTestSuite(SourceDocumentInformation_originVersion_AttrEClassTest.class);
		suite.addTestSuite(SupportedRoleClass_refRoleClassPath_AttrEClassTest.class);
		suite.addTestSuite(SystemUnitClass_refBaseClassPath_AttrEClassTest.class);
		suite.addTestSuite(UnknownType_requirements_AttrEClassTest.class);
		suite.addTestSuite(Copyright_value_AttrEClassTest.class);
		suite.addTestSuite(Description_value_AttrEClassTest.class);
		suite.addTestSuite(Revision_revisionDate_AttrEClassTest.class);
		suite.addTestSuite(Revision_oldVersion_AttrEClassTest.class);
		suite.addTestSuite(Revision_newVersion_AttrEClassTest.class);
		suite.addTestSuite(Revision_authorName_AttrEClassTest.class);
		suite.addTestSuite(Revision_comment_AttrEClassTest.class);
		suite.addTestSuite(Version_value_AttrEClassTest.class);
		suite.addTestSuite(Element_name_AttrEClassTest.class);
		suite.addTestSuite(Element_value_AttrEClassTest.class);
		suite.addTestSuite(GenericElement_elementFeatureMap_AttrEClassTest.class);
		suite.addTestSuite(GenericElement_attributeFeatureMap_AttrEClassTest.class);
		suite.addTestSuite(Attribute_OrGroupTest.class);
		suite.addTestSuite(RefSemantic_OrGroupTest.class);
		suite.addTestSuite(AttributeValueRequirement_OrGroupTest.class);
		suite.addTestSuite(OrdinalScaledType_OrGroupTest.class);
		suite.addTestSuite(NominalScaledType_OrGroupTest.class);
		suite.addTestSuite(UnknownType_OrGroupTest.class);
		suite.addTestSuite(Description_OrGroupTest.class);
		suite.addTestSuite(Version_OrGroupTest.class);
		suite.addTestSuite(Revision_OrGroupTest.class);
		suite.addTestSuite(Copyright_OrGroupTest.class);
		suite.addTestSuite(AdditionalInformation_OrGroupTest.class);
		suite.addTestSuite(SourceDocumentInformation_OrGroupTest.class);
		suite.addTestSuite(ExternalReferenceType_OrGroupTest.class);
		suite.addTestSuite(InstanceHierarchy_OrGroupTest.class);
		suite.addTestSuite(InterfaceClassLib_OrGroupTest.class);
		suite.addTestSuite(RoleClassLib_OrGroupTest.class);
		suite.addTestSuite(SystemUnitClassLib_OrGroupTest.class);
		suite.addTestSuite(AttributeLib_OrGroupTest.class);
		suite.addTestSuite(CAEXFile_OrGroupTest.class);
		suite.addTestSuite(InterfaceClass_OrGroupTest.class);
		suite.addTestSuite(InternalElement_OrGroupTest.class);
		suite.addTestSuite(ExternalInterface_OrGroupTest.class);
		suite.addTestSuite(RoleRequirements_OrGroupTest.class);
		suite.addTestSuite(SystemUnitClass_OrGroupTest.class);
		suite.addTestSuite(AttributeNameMapping_OrGroupTest.class);
		suite.addTestSuite(InterfaceIDMapping_OrGroupTest.class);
		suite.addTestSuite(RoleClass_OrGroupTest.class);
		suite.addTestSuite(Mapping_OrGroupTest.class);
		suite.addTestSuite(SupportedRoleClass_OrGroupTest.class);
		suite.addTestSuite(InternalLink_OrGroupTest.class);
		suite.addTestSuite(GenericElement_OrGroupTest.class);
		suite.addTestSuite(GenericAttribute_OrGroupTest.class);
		suite.addTestSuite(Object_CalculateableParameterTest.class);
		suite.addTestSuite(Object_FunctionalParameterTest.class);
		suite.addTestSuite(Object_PrimitiveArgumentTest.class);
		suite.addTestSuite(Object_And_BitOperatorTest.class);
		suite.addTestSuite(Object_Or_BitOperatorTest.class);
		suite.addTestSuite(Boolean_CalculateableParameterTest.class);
		suite.addTestSuite(Boolean_FunctionalParameterTest.class);
		suite.addTestSuite(Boolean_PrimitiveArgumentTest.class);
		suite.addTestSuite(Boolean_And_BitOperatorTest.class);
		suite.addTestSuite(Boolean_Or_BitOperatorTest.class);
		suite.addTestSuite(equals_FunctionalOperatorTest.class);
		suite.addTestSuite(toString_FunctionalOperatorTest.class);
		suite.addTestSuite(CharSequence_CalculateableParameterTest.class);
		suite.addTestSuite(CharSequence_FunctionalParameterTest.class);
		suite.addTestSuite(CharSequence_PrimitiveArgumentTest.class);
		suite.addTestSuite(CharSequence_And_BitOperatorTest.class);
		suite.addTestSuite(CharSequence_Or_BitOperatorTest.class);
		suite.addTestSuite(Integer_CalculateableParameterTest.class);
		suite.addTestSuite(Integer_FunctionalParameterTest.class);
		suite.addTestSuite(Integer_PrimitiveArgumentTest.class);
		suite.addTestSuite(Integer_And_BitOperatorTest.class);
		suite.addTestSuite(Integer_Or_BitOperatorTest.class);
		suite.addTestSuite(length_FunctionalOperatorTest.class);
		suite.addTestSuite(Character_CalculateableParameterTest.class);
		suite.addTestSuite(Character_FunctionalParameterTest.class);
		suite.addTestSuite(Character_PrimitiveArgumentTest.class);
		suite.addTestSuite(Character_And_BitOperatorTest.class);
		suite.addTestSuite(Character_Or_BitOperatorTest.class);
		suite.addTestSuite(charAt_FunctionalOperatorTest.class);
		suite.addTestSuite(contains_FunctionalOperatorTest.class);
		suite.addTestSuite(substring_FunctionalOperatorTest.class);
		suite.addTestSuite(concat_FunctionalOperatorTest.class);
		suite.addTestSuite(endsWith_FunctionalOperatorTest.class);
		suite.addTestSuite(equalsIgnoreCase_FunctionalOperatorTest.class);
		suite.addTestSuite(indexOfString_FunctionalOperatorTest.class);
		suite.addTestSuite(isEmpty_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_CalculateableParameterTest.class);
		suite.addTestSuite(Number_FunctionalParameterTest.class);
		suite.addTestSuite(Number_PrimitiveArgumentTest.class);
		suite.addTestSuite(Number_And_BitOperatorTest.class);
		suite.addTestSuite(Number_Or_BitOperatorTest.class);
		suite.addTestSuite(greaterThan_FunctionalOperatorTest.class);
		suite.addTestSuite(greaterEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(smallerThan_FunctionalOperatorTest.class);
		suite.addTestSuite(smallerEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(parseBoolean_FunctionalOperatorTest.class);
		suite.addTestSuite(compareTo_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_Number_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_Number_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Integer_greaterThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Integer_greaterEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Integer_smallerThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Integer_smallerEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Integer_Object_Number_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Integer_Object_Number_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Long_CalculateableParameterTest.class);
		suite.addTestSuite(Long_FunctionalParameterTest.class);
		suite.addTestSuite(Long_PrimitiveArgumentTest.class);
		suite.addTestSuite(Long_And_BitOperatorTest.class);
		suite.addTestSuite(Long_Or_BitOperatorTest.class);
		suite.addTestSuite(Number_Long_greaterThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Long_greaterEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Long_smallerThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Long_smallerEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Long_Object_Number_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Long_Object_Number_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Double_CalculateableParameterTest.class);
		suite.addTestSuite(Double_FunctionalParameterTest.class);
		suite.addTestSuite(Double_PrimitiveArgumentTest.class);
		suite.addTestSuite(Double_And_BitOperatorTest.class);
		suite.addTestSuite(Double_Or_BitOperatorTest.class);
		suite.addTestSuite(Number_Double_greaterThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Double_greaterEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Double_smallerThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Double_smallerEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Double_Object_Number_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Double_Object_Number_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Float_CalculateableParameterTest.class);
		suite.addTestSuite(Float_FunctionalParameterTest.class);
		suite.addTestSuite(Float_PrimitiveArgumentTest.class);
		suite.addTestSuite(Float_And_BitOperatorTest.class);
		suite.addTestSuite(Float_Or_BitOperatorTest.class);
		suite.addTestSuite(Number_Float_greaterThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Float_greaterEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Float_smallerThan_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Float_smallerEquals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Float_Object_Number_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Number_Float_Object_Number_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_CharSequence_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_CharSequence_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_Character_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_Character_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_Boolean_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(Object_Boolean_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(CharSequence_String_length_FunctionalOperatorTest.class);
		suite.addTestSuite(CharSequence_String_Object_CharSequence_equals_FunctionalOperatorTest.class);
		suite.addTestSuite(CharSequence_String_Object_CharSequence_toString_FunctionalOperatorTest.class);
		suite.addTestSuite(Count_AggregationOperatorTest.class);
		suite.addTestSuite(Sum_AggregationOperatorTest.class);
		suite.addTestSuite(Min_AggregationOperatorTest.class);
		suite.addTestSuite(Max_AggregationOperatorTest.class);
		suite.addTestSuite(IntegerParseInt_ClassOperatorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmTests(String name) {
		super(name);
	}

} //QmmTests
