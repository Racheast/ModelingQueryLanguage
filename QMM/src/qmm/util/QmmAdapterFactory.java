/**
 */
package qmm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public class QmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QmmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QmmSwitch<Adapter> modelSwitch =
		new QmmSwitch<Adapter>() {
			@Override
			public Adapter caseAttributeFamily(AttributeFamily object) {
				return createAttributeFamilyAdapter();
			}
			@Override
			public Adapter caseAttributeNameMapping(AttributeNameMapping object) {
				return createAttributeNameMappingAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeLib(AttributeLib object) {
				return createAttributeLibAdapter();
			}
			@Override
			public Adapter caseAttributeValueRequirement(AttributeValueRequirement object) {
				return createAttributeValueRequirementAdapter();
			}
			@Override
			public Adapter caseCAEXBasicObject(CAEXBasicObject object) {
				return createCAEXBasicObjectAdapter();
			}
			@Override
			public Adapter caseCAEXFile(CAEXFile object) {
				return createCAEXFileAdapter();
			}
			@Override
			public Adapter caseCAEXObject(CAEXObject object) {
				return createCAEXObjectAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExternalInterface(ExternalInterface object) {
				return createExternalInterfaceAdapter();
			}
			@Override
			public Adapter caseExternalReferenceType(ExternalReferenceType object) {
				return createExternalReferenceTypeAdapter();
			}
			@Override
			public Adapter caseInstanceHierarchy(InstanceHierarchy object) {
				return createInstanceHierarchyAdapter();
			}
			@Override
			public Adapter caseInterfaceClassLib(InterfaceClassLib object) {
				return createInterfaceClassLibAdapter();
			}
			@Override
			public Adapter caseInterfaceClass(InterfaceClass object) {
				return createInterfaceClassAdapter();
			}
			@Override
			public Adapter caseInterfaceFamily(InterfaceFamily object) {
				return createInterfaceFamilyAdapter();
			}
			@Override
			public Adapter caseInterfaceIDMapping(InterfaceIDMapping object) {
				return createInterfaceIDMappingAdapter();
			}
			@Override
			public Adapter caseInternalElement(InternalElement object) {
				return createInternalElementAdapter();
			}
			@Override
			public Adapter caseInternalLink(InternalLink object) {
				return createInternalLinkAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseNominalScaledType(NominalScaledType object) {
				return createNominalScaledTypeAdapter();
			}
			@Override
			public Adapter caseOrdinalScaledType(OrdinalScaledType object) {
				return createOrdinalScaledTypeAdapter();
			}
			@Override
			public Adapter caseRefSemantic(RefSemantic object) {
				return createRefSemanticAdapter();
			}
			@Override
			public Adapter caseRoleClassLib(RoleClassLib object) {
				return createRoleClassLibAdapter();
			}
			@Override
			public Adapter caseRoleClass(RoleClass object) {
				return createRoleClassAdapter();
			}
			@Override
			public Adapter caseRoleFamily(RoleFamily object) {
				return createRoleFamilyAdapter();
			}
			@Override
			public Adapter caseRoleRequirements(RoleRequirements object) {
				return createRoleRequirementsAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation(SourceDocumentInformation object) {
				return createSourceDocumentInformationAdapter();
			}
			@Override
			public Adapter caseSupportedRoleClass(SupportedRoleClass object) {
				return createSupportedRoleClassAdapter();
			}
			@Override
			public Adapter caseSystemUnitClassLib(SystemUnitClassLib object) {
				return createSystemUnitClassLibAdapter();
			}
			@Override
			public Adapter caseSystemUnitClass(SystemUnitClass object) {
				return createSystemUnitClassAdapter();
			}
			@Override
			public Adapter caseSystemUnitFamily(SystemUnitFamily object) {
				return createSystemUnitFamilyAdapter();
			}
			@Override
			public Adapter caseUnknownType(UnknownType object) {
				return createUnknownTypeAdapter();
			}
			@Override
			public Adapter caseCopyright(Copyright object) {
				return createCopyrightAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseAdditionalInformation(AdditionalInformation object) {
				return createAdditionalInformationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseGenericElement(GenericElement object) {
				return createGenericElementAdapter();
			}
			@Override
			public Adapter caseGenericAttribute(GenericAttribute object) {
				return createGenericAttributeAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCountable(Countable object) {
				return createCountableAdapter();
			}
			@Override
			public Adapter caseNegatableElement(NegatableElement object) {
				return createNegatableElementAdapter();
			}
			@Override
			public Adapter caseOrGroup(OrGroup object) {
				return createOrGroupAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseRootClass(RootClass object) {
				return createRootClassAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseFindQuery(FindQuery object) {
				return createFindQueryAdapter();
			}
			@Override
			public Adapter caseCalculateable(Calculateable object) {
				return createCalculateableAdapter();
			}
			@Override
			public Adapter caseCalculateableElement(CalculateableElement object) {
				return createCalculateableElementAdapter();
			}
			@Override
			public Adapter caseAttributeEClass(AttributeEClass object) {
				return createAttributeEClassAdapter();
			}
			@Override
			public Adapter caseRegularAttributeEClass(RegularAttributeEClass object) {
				return createRegularAttributeEClassAdapter();
			}
			@Override
			public Adapter caseEnumerationAttributeEClass(EnumerationAttributeEClass object) {
				return createEnumerationAttributeEClassAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseFunctionalType(FunctionalType object) {
				return createFunctionalTypeAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseReferenceArgument(ReferenceArgument object) {
				return createReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseCountable_ReferenceArgument(Countable_ReferenceArgument object) {
				return createCountable_ReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseCalculateable_Argument(Calculateable_Argument object) {
				return createCalculateable_ArgumentAdapter();
			}
			@Override
			public Adapter caseCalculateableElement_ReferenceArgument(CalculateableElement_ReferenceArgument object) {
				return createCalculateableElement_ReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseFunctionalArgument(FunctionalArgument object) {
				return createFunctionalArgumentAdapter();
			}
			@Override
			public Adapter caseEvaluationOperation_Argument(EvaluationOperation_Argument object) {
				return createEvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter casePrimitiveArgument(PrimitiveArgument object) {
				return createPrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseCountableReferenceParameter(CountableReferenceParameter object) {
				return createCountableReferenceParameterAdapter();
			}
			@Override
			public Adapter caseCalculateableParameter(CalculateableParameter object) {
				return createCalculateableParameterAdapter();
			}
			@Override
			public Adapter caseFunctionalParameter(FunctionalParameter object) {
				return createFunctionalParameterAdapter();
			}
			@Override
			public Adapter caseInteger_Calculateable(Integer_Calculateable object) {
				return createInteger_CalculateableAdapter();
			}
			@Override
			public Adapter caseInteger_CalculateableElement(Integer_CalculateableElement object) {
				return createInteger_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseExpressionOperator(ExpressionOperator object) {
				return createExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseEnumerationOperator(EnumerationOperator object) {
				return createEnumerationOperatorAdapter();
			}
			@Override
			public Adapter caseBitOperator(BitOperator object) {
				return createBitOperatorAdapter();
			}
			@Override
			public Adapter caseFunctionalOperator(FunctionalOperator object) {
				return createFunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseClassOperator(ClassOperator object) {
				return createClassOperatorAdapter();
			}
			@Override
			public Adapter caseEvaluationOperator(EvaluationOperator object) {
				return createEvaluationOperatorAdapter();
			}
			@Override
			public Adapter caseEvaluationFunctionalOperator(EvaluationFunctionalOperator object) {
				return createEvaluationFunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseAggregationOperator(AggregationOperator object) {
				return createAggregationOperatorAdapter();
			}
			@Override
			public Adapter caseEvaluationBitOperator(EvaluationBitOperator object) {
				return createEvaluationBitOperatorAdapter();
			}
			@Override
			public Adapter caseAnd_EvaluationBitOperator(And_EvaluationBitOperator object) {
				return createAnd_EvaluationBitOperatorAdapter();
			}
			@Override
			public Adapter caseOr_EvaluationBitOperator(Or_EvaluationBitOperator object) {
				return createOr_EvaluationBitOperatorAdapter();
			}
			@Override
			public Adapter caseCountingAggregationOperator(CountingAggregationOperator object) {
				return createCountingAggregationOperatorAdapter();
			}
			@Override
			public Adapter caseCalculatingAggregationOperator(CalculatingAggregationOperator object) {
				return createCalculatingAggregationOperatorAdapter();
			}
			@Override
			public Adapter caseString_Calculateable(String_Calculateable object) {
				return createString_CalculateableAdapter();
			}
			@Override
			public Adapter caseString_CalculateableElement(String_CalculateableElement object) {
				return createString_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseString_AttributeEClass(String_AttributeEClass object) {
				return createString_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseString_Operator(String_Operator object) {
				return createString_OperatorAdapter();
			}
			@Override
			public Adapter caseString_Type(String_Type object) {
				return createString_TypeAdapter();
			}
			@Override
			public Adapter caseString_FunctionalType(String_FunctionalType object) {
				return createString_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseString_CalculateableParameter(String_CalculateableParameter object) {
				return createString_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseString_FunctionalParameter(String_FunctionalParameter object) {
				return createString_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseString_Argument(String_Argument object) {
				return createString_ArgumentAdapter();
			}
			@Override
			public Adapter caseString_PrimitiveArgument(String_PrimitiveArgument object) {
				return createString_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseString_EvaluationOperation_Argument(String_EvaluationOperation_Argument object) {
				return createString_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseString_CalculateableElementReferenceArgument(String_CalculateableElementReferenceArgument object) {
				return createString_CalculateableElementReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseString_ExpressionOperator(String_ExpressionOperator object) {
				return createString_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseString_BitOperator(String_BitOperator object) {
				return createString_BitOperatorAdapter();
			}
			@Override
			public Adapter caseString_And_BitOperator(String_And_BitOperator object) {
				return createString_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseString_Or_BitOperator(String_Or_BitOperator object) {
				return createString_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseString_Original_FunctionalOperator(String_Original_FunctionalOperator object) {
				return createString_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseAttributeNameMapping_roleAttributeName_AttrEClass(AttributeNameMapping_roleAttributeName_AttrEClass object) {
				return createAttributeNameMapping_roleAttributeName_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttributeNameMapping_systemUnitAttributeName_AttrEClass(AttributeNameMapping_systemUnitAttributeName_AttrEClass object) {
				return createAttributeNameMapping_systemUnitAttributeName_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttribute_defaultValue_AttrEClass(Attribute_defaultValue_AttrEClass object) {
				return createAttribute_defaultValue_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttribute_value_AttrEClass(Attribute_value_AttrEClass object) {
				return createAttribute_value_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_Calculateable(AttributeDataType_Calculateable object) {
				return createAttributeDataType_CalculateableAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_CalculateableElement(AttributeDataType_CalculateableElement object) {
				return createAttributeDataType_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_AttributeEClass(AttributeDataType_AttributeEClass object) {
				return createAttributeDataType_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_Operator(AttributeDataType_Operator object) {
				return createAttributeDataType_OperatorAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_Type(AttributeDataType_Type object) {
				return createAttributeDataType_TypeAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_FunctionalType(AttributeDataType_FunctionalType object) {
				return createAttributeDataType_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_CalculateableParameter(AttributeDataType_CalculateableParameter object) {
				return createAttributeDataType_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_FunctionalParameter(AttributeDataType_FunctionalParameter object) {
				return createAttributeDataType_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_Argument(AttributeDataType_Argument object) {
				return createAttributeDataType_ArgumentAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_PrimitiveArgument(AttributeDataType_PrimitiveArgument object) {
				return createAttributeDataType_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_EvaluationOperation_Argument(AttributeDataType_EvaluationOperation_Argument object) {
				return createAttributeDataType_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_CalculateableElementReferenceArgument(AttributeDataType_CalculateableElementReferenceArgument object) {
				return createAttributeDataType_CalculateableElementReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_ExpressionOperator(AttributeDataType_ExpressionOperator object) {
				return createAttributeDataType_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_BitOperator(AttributeDataType_BitOperator object) {
				return createAttributeDataType_BitOperatorAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_And_BitOperator(AttributeDataType_And_BitOperator object) {
				return createAttributeDataType_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_Or_BitOperator(AttributeDataType_Or_BitOperator object) {
				return createAttributeDataType_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseAttributeDataType_FunctionalOperator(AttributeDataType_FunctionalOperator object) {
				return createAttributeDataType_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseAttribute_attributeDataType_AttrEClass(Attribute_attributeDataType_AttrEClass object) {
				return createAttribute_attributeDataType_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttribute_refAttributeType_AttrEClass(Attribute_refAttributeType_AttrEClass object) {
				return createAttribute_refAttributeType_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttribute_unit_AttrEClass(Attribute_unit_AttrEClass object) {
				return createAttribute_unit_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttributeValueRequirement_name_AttrEClass(AttributeValueRequirement_name_AttrEClass object) {
				return createAttributeValueRequirement_name_AttrEClassAdapter();
			}
			@Override
			public Adapter caseChangeMode_Calculateable(ChangeMode_Calculateable object) {
				return createChangeMode_CalculateableAdapter();
			}
			@Override
			public Adapter caseChangeMode_CalculateableElement(ChangeMode_CalculateableElement object) {
				return createChangeMode_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseChangeMode_Operator(ChangeMode_Operator object) {
				return createChangeMode_OperatorAdapter();
			}
			@Override
			public Adapter caseChangeMode_EnumerationOperator(ChangeMode_EnumerationOperator object) {
				return createChangeMode_EnumerationOperatorAdapter();
			}
			@Override
			public Adapter caseChangeMode_AttributeEClass(ChangeMode_AttributeEClass object) {
				return createChangeMode_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseCAEXBasicObject_changeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass object) {
				return createCAEXBasicObject_changeMode_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCAEXFile_superiorStandardVersion_AttrEClass(CAEXFile_superiorStandardVersion_AttrEClass object) {
				return createCAEXFile_superiorStandardVersion_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCAEXFile_fileName_AttrEClass(CAEXFile_fileName_AttrEClass object) {
				return createCAEXFile_fileName_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCAEXFile_schemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass object) {
				return createCAEXFile_schemaVersion_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCAEXObject_iD_AttrEClass(CAEXObject_iD_AttrEClass object) {
				return createCAEXObject_iD_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCAEXObject_name_AttrEClass(CAEXObject_name_AttrEClass object) {
				return createCAEXObject_name_AttrEClassAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_Calculateable(EFeatureMapEntry_Calculateable object) {
				return createEFeatureMapEntry_CalculateableAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_CalculateableElement(EFeatureMapEntry_CalculateableElement object) {
				return createEFeatureMapEntry_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_AttributeEClass(EFeatureMapEntry_AttributeEClass object) {
				return createEFeatureMapEntry_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_Operator(EFeatureMapEntry_Operator object) {
				return createEFeatureMapEntry_OperatorAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_Type(EFeatureMapEntry_Type object) {
				return createEFeatureMapEntry_TypeAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_FunctionalType(EFeatureMapEntry_FunctionalType object) {
				return createEFeatureMapEntry_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_CalculateableParameter(EFeatureMapEntry_CalculateableParameter object) {
				return createEFeatureMapEntry_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_FunctionalParameter(EFeatureMapEntry_FunctionalParameter object) {
				return createEFeatureMapEntry_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_Argument(EFeatureMapEntry_Argument object) {
				return createEFeatureMapEntry_ArgumentAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_PrimitiveArgument(EFeatureMapEntry_PrimitiveArgument object) {
				return createEFeatureMapEntry_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_EvaluationOperation_Argument(EFeatureMapEntry_EvaluationOperation_Argument object) {
				return createEFeatureMapEntry_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_CalculateableElementReferenceArgument(EFeatureMapEntry_CalculateableElementReferenceArgument object) {
				return createEFeatureMapEntry_CalculateableElementReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_ExpressionOperator(EFeatureMapEntry_ExpressionOperator object) {
				return createEFeatureMapEntry_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_BitOperator(EFeatureMapEntry_BitOperator object) {
				return createEFeatureMapEntry_BitOperatorAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_And_BitOperator(EFeatureMapEntry_And_BitOperator object) {
				return createEFeatureMapEntry_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_Or_BitOperator(EFeatureMapEntry_Or_BitOperator object) {
				return createEFeatureMapEntry_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseEFeatureMapEntry_FunctionalOperator(EFeatureMapEntry_FunctionalOperator object) {
				return createEFeatureMapEntry_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDocumentRoot_mixed_AttrEClass(DocumentRoot_mixed_AttrEClass object) {
				return createDocumentRoot_mixed_AttrEClassAdapter();
			}
			@Override
			public Adapter caseExternalReferenceType_alias_AttrEClass(ExternalReferenceType_alias_AttrEClass object) {
				return createExternalReferenceType_alias_AttrEClassAdapter();
			}
			@Override
			public Adapter caseExternalReferenceType_path_AttrEClass(ExternalReferenceType_path_AttrEClass object) {
				return createExternalReferenceType_path_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInterfaceClass_refBaseClassPath_AttrEClass(InterfaceClass_refBaseClassPath_AttrEClass object) {
				return createInterfaceClass_refBaseClassPath_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInterfaceIDMapping_roleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass object) {
				return createInterfaceIDMapping_roleInterfaceID_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInterfaceIDMapping_systemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass object) {
				return createInterfaceIDMapping_systemUnitInterfaceID_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInternalElement_refBaseSystemUnitPath_AttrEClass(InternalElement_refBaseSystemUnitPath_AttrEClass object) {
				return createInternalElement_refBaseSystemUnitPath_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInternalLink_refPartnerSideA_AttrEClass(InternalLink_refPartnerSideA_AttrEClass object) {
				return createInternalLink_refPartnerSideA_AttrEClassAdapter();
			}
			@Override
			public Adapter caseInternalLink_refPartnerSideB_AttrEClass(InternalLink_refPartnerSideB_AttrEClass object) {
				return createInternalLink_refPartnerSideB_AttrEClassAdapter();
			}
			@Override
			public Adapter caseNominalScaledType_requiredValue_AttrEClass(NominalScaledType_requiredValue_AttrEClass object) {
				return createNominalScaledType_requiredValue_AttrEClassAdapter();
			}
			@Override
			public Adapter caseOrdinalScaledType_requiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass object) {
				return createOrdinalScaledType_requiredMaxValue_AttrEClassAdapter();
			}
			@Override
			public Adapter caseOrdinalScaledType_requiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass object) {
				return createOrdinalScaledType_requiredValue_AttrEClassAdapter();
			}
			@Override
			public Adapter caseOrdinalScaledType_requiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass object) {
				return createOrdinalScaledType_requiredMinValue_AttrEClassAdapter();
			}
			@Override
			public Adapter caseRefSemantic_correspondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass object) {
				return createRefSemantic_correspondingAttributePath_AttrEClassAdapter();
			}
			@Override
			public Adapter caseRoleClass_refBaseClassPath_AttrEClass(RoleClass_refBaseClassPath_AttrEClass object) {
				return createRoleClass_refBaseClassPath_AttrEClassAdapter();
			}
			@Override
			public Adapter caseDateTime_Calculateable(DateTime_Calculateable object) {
				return createDateTime_CalculateableAdapter();
			}
			@Override
			public Adapter caseDateTime_CalculateableElement(DateTime_CalculateableElement object) {
				return createDateTime_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseDateTime_AttributeEClass(DateTime_AttributeEClass object) {
				return createDateTime_AttributeEClassAdapter();
			}
			@Override
			public Adapter caseDateTime_Operator(DateTime_Operator object) {
				return createDateTime_OperatorAdapter();
			}
			@Override
			public Adapter caseDateTime_Type(DateTime_Type object) {
				return createDateTime_TypeAdapter();
			}
			@Override
			public Adapter caseDateTime_FunctionalType(DateTime_FunctionalType object) {
				return createDateTime_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseDateTime_CalculateableParameter(DateTime_CalculateableParameter object) {
				return createDateTime_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseDateTime_FunctionalParameter(DateTime_FunctionalParameter object) {
				return createDateTime_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseDateTime_Argument(DateTime_Argument object) {
				return createDateTime_ArgumentAdapter();
			}
			@Override
			public Adapter caseDateTime_PrimitiveArgument(DateTime_PrimitiveArgument object) {
				return createDateTime_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseDateTime_EvaluationOperation_Argument(DateTime_EvaluationOperation_Argument object) {
				return createDateTime_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseDateTime_CalculateableElementReferenceArgument(DateTime_CalculateableElementReferenceArgument object) {
				return createDateTime_CalculateableElementReferenceArgumentAdapter();
			}
			@Override
			public Adapter caseDateTime_ExpressionOperator(DateTime_ExpressionOperator object) {
				return createDateTime_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseDateTime_BitOperator(DateTime_BitOperator object) {
				return createDateTime_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDateTime_And_BitOperator(DateTime_And_BitOperator object) {
				return createDateTime_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDateTime_Or_BitOperator(DateTime_Or_BitOperator object) {
				return createDateTime_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDateTime_FunctionalOperator(DateTime_FunctionalOperator object) {
				return createDateTime_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_lastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass object) {
				return createSourceDocumentInformation_lastWritingDateTime_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originID_AttrEClass(SourceDocumentInformation_originID_AttrEClass object) {
				return createSourceDocumentInformation_originID_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originName_AttrEClass(SourceDocumentInformation_originName_AttrEClass object) {
				return createSourceDocumentInformation_originName_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass object) {
				return createSourceDocumentInformation_originProjectID_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass object) {
				return createSourceDocumentInformation_originProjectTitle_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass object) {
				return createSourceDocumentInformation_originRelease_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass object) {
				return createSourceDocumentInformation_originVendor_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass object) {
				return createSourceDocumentInformation_originVendorURL_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_originVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass object) {
				return createSourceDocumentInformation_originVersion_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSupportedRoleClass_refRoleClassPath_AttrEClass(SupportedRoleClass_refRoleClassPath_AttrEClass object) {
				return createSupportedRoleClass_refRoleClassPath_AttrEClassAdapter();
			}
			@Override
			public Adapter caseSystemUnitClass_refBaseClassPath_AttrEClass(SystemUnitClass_refBaseClassPath_AttrEClass object) {
				return createSystemUnitClass_refBaseClassPath_AttrEClassAdapter();
			}
			@Override
			public Adapter caseUnknownType_requirements_AttrEClass(UnknownType_requirements_AttrEClass object) {
				return createUnknownType_requirements_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCopyright_value_AttrEClass(Copyright_value_AttrEClass object) {
				return createCopyright_value_AttrEClassAdapter();
			}
			@Override
			public Adapter caseCopyright_changeMode_AttrEClass(Copyright_changeMode_AttrEClass object) {
				return createCopyright_changeMode_AttrEClassAdapter();
			}
			@Override
			public Adapter caseDescription_value_AttrEClass(Description_value_AttrEClass object) {
				return createDescription_value_AttrEClassAdapter();
			}
			@Override
			public Adapter caseDescription_changeMode_AttrEClass(Description_changeMode_AttrEClass object) {
				return createDescription_changeMode_AttrEClassAdapter();
			}
			@Override
			public Adapter caseRevision_revisionDate_AttrEClass(Revision_revisionDate_AttrEClass object) {
				return createRevision_revisionDate_AttrEClassAdapter();
			}
			@Override
			public Adapter caseRevision_oldVersion_AttrEClass(Revision_oldVersion_AttrEClass object) {
				return createRevision_oldVersion_AttrEClassAdapter();
			}
			@Override
			public Adapter caseRevision_newVersion_AttrEClass(Revision_newVersion_AttrEClass object) {
				return createRevision_newVersion_AttrEClassAdapter();
			}
			@Override
			public Adapter caseRevision_authorName_AttrEClass(Revision_authorName_AttrEClass object) {
				return createRevision_authorName_AttrEClassAdapter();
			}
			@Override
			public Adapter caseRevision_comment_AttrEClass(Revision_comment_AttrEClass object) {
				return createRevision_comment_AttrEClassAdapter();
			}
			@Override
			public Adapter caseVersion_value_AttrEClass(Version_value_AttrEClass object) {
				return createVersion_value_AttrEClassAdapter();
			}
			@Override
			public Adapter caseVersion_changeMode_AttrEClass(Version_changeMode_AttrEClass object) {
				return createVersion_changeMode_AttrEClassAdapter();
			}
			@Override
			public Adapter caseElement_name_AttrEClass(Element_name_AttrEClass object) {
				return createElement_name_AttrEClassAdapter();
			}
			@Override
			public Adapter caseElement_value_AttrEClass(Element_value_AttrEClass object) {
				return createElement_value_AttrEClassAdapter();
			}
			@Override
			public Adapter caseGenericElement_elementFeatureMap_AttrEClass(GenericElement_elementFeatureMap_AttrEClass object) {
				return createGenericElement_elementFeatureMap_AttrEClassAdapter();
			}
			@Override
			public Adapter caseGenericElement_attributeFeatureMap_AttrEClass(GenericElement_attributeFeatureMap_AttrEClass object) {
				return createGenericElement_attributeFeatureMap_AttrEClassAdapter();
			}
			@Override
			public Adapter caseAttribute_OrGroup(Attribute_OrGroup object) {
				return createAttribute_OrGroupAdapter();
			}
			@Override
			public Adapter caseRefSemantic_OrGroup(RefSemantic_OrGroup object) {
				return createRefSemantic_OrGroupAdapter();
			}
			@Override
			public Adapter caseAttributeValueRequirement_OrGroup(AttributeValueRequirement_OrGroup object) {
				return createAttributeValueRequirement_OrGroupAdapter();
			}
			@Override
			public Adapter caseOrdinalScaledType_OrGroup(OrdinalScaledType_OrGroup object) {
				return createOrdinalScaledType_OrGroupAdapter();
			}
			@Override
			public Adapter caseNominalScaledType_OrGroup(NominalScaledType_OrGroup object) {
				return createNominalScaledType_OrGroupAdapter();
			}
			@Override
			public Adapter caseUnknownType_OrGroup(UnknownType_OrGroup object) {
				return createUnknownType_OrGroupAdapter();
			}
			@Override
			public Adapter caseDescription_OrGroup(Description_OrGroup object) {
				return createDescription_OrGroupAdapter();
			}
			@Override
			public Adapter caseVersion_OrGroup(Version_OrGroup object) {
				return createVersion_OrGroupAdapter();
			}
			@Override
			public Adapter caseRevision_OrGroup(Revision_OrGroup object) {
				return createRevision_OrGroupAdapter();
			}
			@Override
			public Adapter caseCopyright_OrGroup(Copyright_OrGroup object) {
				return createCopyright_OrGroupAdapter();
			}
			@Override
			public Adapter caseAdditionalInformation_OrGroup(AdditionalInformation_OrGroup object) {
				return createAdditionalInformation_OrGroupAdapter();
			}
			@Override
			public Adapter caseSourceDocumentInformation_OrGroup(SourceDocumentInformation_OrGroup object) {
				return createSourceDocumentInformation_OrGroupAdapter();
			}
			@Override
			public Adapter caseExternalReferenceType_OrGroup(ExternalReferenceType_OrGroup object) {
				return createExternalReferenceType_OrGroupAdapter();
			}
			@Override
			public Adapter caseInstanceHierarchy_OrGroup(InstanceHierarchy_OrGroup object) {
				return createInstanceHierarchy_OrGroupAdapter();
			}
			@Override
			public Adapter caseInterfaceClassLib_OrGroup(InterfaceClassLib_OrGroup object) {
				return createInterfaceClassLib_OrGroupAdapter();
			}
			@Override
			public Adapter caseRoleClassLib_OrGroup(RoleClassLib_OrGroup object) {
				return createRoleClassLib_OrGroupAdapter();
			}
			@Override
			public Adapter caseSystemUnitClassLib_OrGroup(SystemUnitClassLib_OrGroup object) {
				return createSystemUnitClassLib_OrGroupAdapter();
			}
			@Override
			public Adapter caseAttributeLib_OrGroup(AttributeLib_OrGroup object) {
				return createAttributeLib_OrGroupAdapter();
			}
			@Override
			public Adapter caseCAEXFile_OrGroup(CAEXFile_OrGroup object) {
				return createCAEXFile_OrGroupAdapter();
			}
			@Override
			public Adapter caseInterfaceClass_OrGroup(InterfaceClass_OrGroup object) {
				return createInterfaceClass_OrGroupAdapter();
			}
			@Override
			public Adapter caseInternalElement_OrGroup(InternalElement_OrGroup object) {
				return createInternalElement_OrGroupAdapter();
			}
			@Override
			public Adapter caseExternalInterface_OrGroup(ExternalInterface_OrGroup object) {
				return createExternalInterface_OrGroupAdapter();
			}
			@Override
			public Adapter caseRoleRequirements_OrGroup(RoleRequirements_OrGroup object) {
				return createRoleRequirements_OrGroupAdapter();
			}
			@Override
			public Adapter caseSystemUnitClass_OrGroup(SystemUnitClass_OrGroup object) {
				return createSystemUnitClass_OrGroupAdapter();
			}
			@Override
			public Adapter caseAttributeNameMapping_OrGroup(AttributeNameMapping_OrGroup object) {
				return createAttributeNameMapping_OrGroupAdapter();
			}
			@Override
			public Adapter caseInterfaceIDMapping_OrGroup(InterfaceIDMapping_OrGroup object) {
				return createInterfaceIDMapping_OrGroupAdapter();
			}
			@Override
			public Adapter caseRoleClass_OrGroup(RoleClass_OrGroup object) {
				return createRoleClass_OrGroupAdapter();
			}
			@Override
			public Adapter caseMapping_OrGroup(Mapping_OrGroup object) {
				return createMapping_OrGroupAdapter();
			}
			@Override
			public Adapter caseSupportedRoleClass_OrGroup(SupportedRoleClass_OrGroup object) {
				return createSupportedRoleClass_OrGroupAdapter();
			}
			@Override
			public Adapter caseInternalLink_OrGroup(InternalLink_OrGroup object) {
				return createInternalLink_OrGroupAdapter();
			}
			@Override
			public Adapter caseGenericElement_OrGroup(GenericElement_OrGroup object) {
				return createGenericElement_OrGroupAdapter();
			}
			@Override
			public Adapter caseGenericAttribute_OrGroup(GenericAttribute_OrGroup object) {
				return createGenericAttribute_OrGroupAdapter();
			}
			@Override
			public Adapter caseObject_Operator(Object_Operator object) {
				return createObject_OperatorAdapter();
			}
			@Override
			public Adapter caseObject_Type(Object_Type object) {
				return createObject_TypeAdapter();
			}
			@Override
			public Adapter caseObject_FunctionalType(Object_FunctionalType object) {
				return createObject_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseObject_CalculateableParameter(Object_CalculateableParameter object) {
				return createObject_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseObject_FunctionalParameter(Object_FunctionalParameter object) {
				return createObject_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseObject_Calculateable(Object_Calculateable object) {
				return createObject_CalculateableAdapter();
			}
			@Override
			public Adapter caseObject_CalculateableElement(Object_CalculateableElement object) {
				return createObject_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseObject_Argument(Object_Argument object) {
				return createObject_ArgumentAdapter();
			}
			@Override
			public Adapter caseObject_PrimitiveArgument(Object_PrimitiveArgument object) {
				return createObject_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseObject_EvaluationOperation_Argument(Object_EvaluationOperation_Argument object) {
				return createObject_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseObject_ExpressionOperator(Object_ExpressionOperator object) {
				return createObject_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseObject_BitOperator(Object_BitOperator object) {
				return createObject_BitOperatorAdapter();
			}
			@Override
			public Adapter caseObject_And_BitOperator(Object_And_BitOperator object) {
				return createObject_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Or_BitOperator(Object_Or_BitOperator object) {
				return createObject_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseObject_FunctionalOperator(Object_FunctionalOperator object) {
				return createObject_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Operator(Boolean_Operator object) {
				return createBoolean_OperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Type(Boolean_Type object) {
				return createBoolean_TypeAdapter();
			}
			@Override
			public Adapter caseBoolean_FunctionalType(Boolean_FunctionalType object) {
				return createBoolean_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseBoolean_CalculateableParameter(Boolean_CalculateableParameter object) {
				return createBoolean_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseBoolean_FunctionalParameter(Boolean_FunctionalParameter object) {
				return createBoolean_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseBoolean_Calculateable(Boolean_Calculateable object) {
				return createBoolean_CalculateableAdapter();
			}
			@Override
			public Adapter caseBoolean_CalculateableElement(Boolean_CalculateableElement object) {
				return createBoolean_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseBoolean_Argument(Boolean_Argument object) {
				return createBoolean_ArgumentAdapter();
			}
			@Override
			public Adapter caseBoolean_PrimitiveArgument(Boolean_PrimitiveArgument object) {
				return createBoolean_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseBoolean_EvaluationOperation_Argument(Boolean_EvaluationOperation_Argument object) {
				return createBoolean_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseBoolean_ExpressionOperator(Boolean_ExpressionOperator object) {
				return createBoolean_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_BitOperator(Boolean_BitOperator object) {
				return createBoolean_BitOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_And_BitOperator(Boolean_And_BitOperator object) {
				return createBoolean_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Or_BitOperator(Boolean_Or_BitOperator object) {
				return createBoolean_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_Original_FunctionalOperator(Boolean_Original_FunctionalOperator object) {
				return createBoolean_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseequals_FunctionalOperator(equals_FunctionalOperator object) {
				return createequals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casetoString_FunctionalOperator(toString_FunctionalOperator object) {
				return createtoString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_Operator(CharSequence_Operator object) {
				return createCharSequence_OperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_Type(CharSequence_Type object) {
				return createCharSequence_TypeAdapter();
			}
			@Override
			public Adapter caseCharSequence_FunctionalType(CharSequence_FunctionalType object) {
				return createCharSequence_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseCharSequence_CalculateableParameter(CharSequence_CalculateableParameter object) {
				return createCharSequence_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseCharSequence_FunctionalParameter(CharSequence_FunctionalParameter object) {
				return createCharSequence_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseCharSequence_Calculateable(CharSequence_Calculateable object) {
				return createCharSequence_CalculateableAdapter();
			}
			@Override
			public Adapter caseCharSequence_CalculateableElement(CharSequence_CalculateableElement object) {
				return createCharSequence_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseCharSequence_Argument(CharSequence_Argument object) {
				return createCharSequence_ArgumentAdapter();
			}
			@Override
			public Adapter caseCharSequence_PrimitiveArgument(CharSequence_PrimitiveArgument object) {
				return createCharSequence_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseCharSequence_EvaluationOperation_Argument(CharSequence_EvaluationOperation_Argument object) {
				return createCharSequence_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseCharSequence_ExpressionOperator(CharSequence_ExpressionOperator object) {
				return createCharSequence_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_BitOperator(CharSequence_BitOperator object) {
				return createCharSequence_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_And_BitOperator(CharSequence_And_BitOperator object) {
				return createCharSequence_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_Or_BitOperator(CharSequence_Or_BitOperator object) {
				return createCharSequence_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_Original_FunctionalOperator(CharSequence_Original_FunctionalOperator object) {
				return createCharSequence_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_Operator(Integer_Operator object) {
				return createInteger_OperatorAdapter();
			}
			@Override
			public Adapter caseInteger_Type(Integer_Type object) {
				return createInteger_TypeAdapter();
			}
			@Override
			public Adapter caseInteger_FunctionalType(Integer_FunctionalType object) {
				return createInteger_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseInteger_CalculateableParameter(Integer_CalculateableParameter object) {
				return createInteger_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseInteger_FunctionalParameter(Integer_FunctionalParameter object) {
				return createInteger_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseInteger_Argument(Integer_Argument object) {
				return createInteger_ArgumentAdapter();
			}
			@Override
			public Adapter caseInteger_PrimitiveArgument(Integer_PrimitiveArgument object) {
				return createInteger_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseInteger_EvaluationOperation_Argument(Integer_EvaluationOperation_Argument object) {
				return createInteger_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseInteger_ExpressionOperator(Integer_ExpressionOperator object) {
				return createInteger_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_BitOperator(Integer_BitOperator object) {
				return createInteger_BitOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_And_BitOperator(Integer_And_BitOperator object) {
				return createInteger_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_Or_BitOperator(Integer_Or_BitOperator object) {
				return createInteger_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_Original_FunctionalOperator(Integer_Original_FunctionalOperator object) {
				return createInteger_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caselength_FunctionalOperator(length_FunctionalOperator object) {
				return createlength_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_Operator(Character_Operator object) {
				return createCharacter_OperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_Type(Character_Type object) {
				return createCharacter_TypeAdapter();
			}
			@Override
			public Adapter caseCharacter_FunctionalType(Character_FunctionalType object) {
				return createCharacter_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseCharacter_CalculateableParameter(Character_CalculateableParameter object) {
				return createCharacter_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseCharacter_FunctionalParameter(Character_FunctionalParameter object) {
				return createCharacter_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseCharacter_Calculateable(Character_Calculateable object) {
				return createCharacter_CalculateableAdapter();
			}
			@Override
			public Adapter caseCharacter_CalculateableElement(Character_CalculateableElement object) {
				return createCharacter_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseCharacter_Argument(Character_Argument object) {
				return createCharacter_ArgumentAdapter();
			}
			@Override
			public Adapter caseCharacter_PrimitiveArgument(Character_PrimitiveArgument object) {
				return createCharacter_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseCharacter_EvaluationOperation_Argument(Character_EvaluationOperation_Argument object) {
				return createCharacter_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseCharacter_ExpressionOperator(Character_ExpressionOperator object) {
				return createCharacter_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_BitOperator(Character_BitOperator object) {
				return createCharacter_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_And_BitOperator(Character_And_BitOperator object) {
				return createCharacter_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_Or_BitOperator(Character_Or_BitOperator object) {
				return createCharacter_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_Original_FunctionalOperator(Character_Original_FunctionalOperator object) {
				return createCharacter_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casecharAt_FunctionalOperator(charAt_FunctionalOperator object) {
				return createcharAt_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casecontains_FunctionalOperator(contains_FunctionalOperator object) {
				return createcontains_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casesubstring_FunctionalOperator(substring_FunctionalOperator object) {
				return createsubstring_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseconcat_FunctionalOperator(concat_FunctionalOperator object) {
				return createconcat_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseendsWith_FunctionalOperator(endsWith_FunctionalOperator object) {
				return createendsWith_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator object) {
				return createequalsIgnoreCase_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseindexOfString_FunctionalOperator(indexOfString_FunctionalOperator object) {
				return createindexOfString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseisEmpty_FunctionalOperator(isEmpty_FunctionalOperator object) {
				return createisEmpty_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Operator(Number_Operator object) {
				return createNumber_OperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Type(Number_Type object) {
				return createNumber_TypeAdapter();
			}
			@Override
			public Adapter caseNumber_FunctionalType(Number_FunctionalType object) {
				return createNumber_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseNumber_CalculateableParameter(Number_CalculateableParameter object) {
				return createNumber_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseNumber_FunctionalParameter(Number_FunctionalParameter object) {
				return createNumber_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseNumber_Calculateable(Number_Calculateable object) {
				return createNumber_CalculateableAdapter();
			}
			@Override
			public Adapter caseNumber_CalculateableElement(Number_CalculateableElement object) {
				return createNumber_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseNumber_Argument(Number_Argument object) {
				return createNumber_ArgumentAdapter();
			}
			@Override
			public Adapter caseNumber_PrimitiveArgument(Number_PrimitiveArgument object) {
				return createNumber_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseNumber_EvaluationOperation_Argument(Number_EvaluationOperation_Argument object) {
				return createNumber_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseNumber_ExpressionOperator(Number_ExpressionOperator object) {
				return createNumber_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_BitOperator(Number_BitOperator object) {
				return createNumber_BitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_And_BitOperator(Number_And_BitOperator object) {
				return createNumber_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Or_BitOperator(Number_Or_BitOperator object) {
				return createNumber_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Original_FunctionalOperator(Number_Original_FunctionalOperator object) {
				return createNumber_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casegreaterThan_FunctionalOperator(greaterThan_FunctionalOperator object) {
				return creategreaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casegreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator object) {
				return creategreaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator object) {
				return createsmallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator object) {
				return createsmallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator object) {
				return createparseBoolean_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter casecompareTo_FunctionalOperator(compareTo_FunctionalOperator object) {
				return createcompareTo_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Number_equals_FunctionalOperator(Object_Number_equals_FunctionalOperator object) {
				return createObject_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Number_toString_FunctionalOperator(Object_Number_toString_FunctionalOperator object) {
				return createObject_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_FunctionalOperator(Number_FunctionalOperator object) {
				return createNumber_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_Number_FunctionalOperator(InheritedFrom_Object_to_Number_FunctionalOperator object) {
				return createInheritedFrom_Object_to_Number_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_greaterThan_FunctionalOperator(Number_Integer_greaterThan_FunctionalOperator object) {
				return createNumber_Integer_greaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_greaterEquals_FunctionalOperator(Number_Integer_greaterEquals_FunctionalOperator object) {
				return createNumber_Integer_greaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_smallerThan_FunctionalOperator(Number_Integer_smallerThan_FunctionalOperator object) {
				return createNumber_Integer_smallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_smallerEquals_FunctionalOperator(Number_Integer_smallerEquals_FunctionalOperator object) {
				return createNumber_Integer_smallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_Object_Number_equals_FunctionalOperator(Number_Integer_Object_Number_equals_FunctionalOperator object) {
				return createNumber_Integer_Object_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Integer_Object_Number_toString_FunctionalOperator(Number_Integer_Object_Number_toString_FunctionalOperator object) {
				return createNumber_Integer_Object_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInteger_FunctionalOperator(Integer_FunctionalOperator object) {
				return createInteger_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Number_to_Integer_FunctionalOperator(InheritedFrom_Number_to_Integer_FunctionalOperator object) {
				return createInheritedFrom_Number_to_Integer_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseLong_Calculateable(Long_Calculateable object) {
				return createLong_CalculateableAdapter();
			}
			@Override
			public Adapter caseLong_CalculateableElement(Long_CalculateableElement object) {
				return createLong_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseLong_Operator(Long_Operator object) {
				return createLong_OperatorAdapter();
			}
			@Override
			public Adapter caseLong_Type(Long_Type object) {
				return createLong_TypeAdapter();
			}
			@Override
			public Adapter caseLong_FunctionalType(Long_FunctionalType object) {
				return createLong_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseLong_CalculateableParameter(Long_CalculateableParameter object) {
				return createLong_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseLong_FunctionalParameter(Long_FunctionalParameter object) {
				return createLong_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseLong_Argument(Long_Argument object) {
				return createLong_ArgumentAdapter();
			}
			@Override
			public Adapter caseLong_PrimitiveArgument(Long_PrimitiveArgument object) {
				return createLong_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseLong_EvaluationOperation_Argument(Long_EvaluationOperation_Argument object) {
				return createLong_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseLong_ExpressionOperator(Long_ExpressionOperator object) {
				return createLong_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseLong_BitOperator(Long_BitOperator object) {
				return createLong_BitOperatorAdapter();
			}
			@Override
			public Adapter caseLong_And_BitOperator(Long_And_BitOperator object) {
				return createLong_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseLong_Or_BitOperator(Long_Or_BitOperator object) {
				return createLong_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseLong_Original_FunctionalOperator(Long_Original_FunctionalOperator object) {
				return createLong_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Long_greaterThan_FunctionalOperator(Number_Long_greaterThan_FunctionalOperator object) {
				return createNumber_Long_greaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Long_greaterEquals_FunctionalOperator(Number_Long_greaterEquals_FunctionalOperator object) {
				return createNumber_Long_greaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Long_smallerThan_FunctionalOperator(Number_Long_smallerThan_FunctionalOperator object) {
				return createNumber_Long_smallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Long_smallerEquals_FunctionalOperator(Number_Long_smallerEquals_FunctionalOperator object) {
				return createNumber_Long_smallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Long_Object_Number_equals_FunctionalOperator(Number_Long_Object_Number_equals_FunctionalOperator object) {
				return createNumber_Long_Object_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Long_Object_Number_toString_FunctionalOperator(Number_Long_Object_Number_toString_FunctionalOperator object) {
				return createNumber_Long_Object_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseLong_FunctionalOperator(Long_FunctionalOperator object) {
				return createLong_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Number_to_Long_FunctionalOperator(InheritedFrom_Number_to_Long_FunctionalOperator object) {
				return createInheritedFrom_Number_to_Long_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Calculateable(Double_Calculateable object) {
				return createDouble_CalculateableAdapter();
			}
			@Override
			public Adapter caseDouble_CalculateableElement(Double_CalculateableElement object) {
				return createDouble_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseDouble_Operator(Double_Operator object) {
				return createDouble_OperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Type(Double_Type object) {
				return createDouble_TypeAdapter();
			}
			@Override
			public Adapter caseDouble_FunctionalType(Double_FunctionalType object) {
				return createDouble_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseDouble_CalculateableParameter(Double_CalculateableParameter object) {
				return createDouble_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseDouble_FunctionalParameter(Double_FunctionalParameter object) {
				return createDouble_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseDouble_Argument(Double_Argument object) {
				return createDouble_ArgumentAdapter();
			}
			@Override
			public Adapter caseDouble_PrimitiveArgument(Double_PrimitiveArgument object) {
				return createDouble_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseDouble_EvaluationOperation_Argument(Double_EvaluationOperation_Argument object) {
				return createDouble_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseDouble_ExpressionOperator(Double_ExpressionOperator object) {
				return createDouble_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_BitOperator(Double_BitOperator object) {
				return createDouble_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_And_BitOperator(Double_And_BitOperator object) {
				return createDouble_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Or_BitOperator(Double_Or_BitOperator object) {
				return createDouble_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_Original_FunctionalOperator(Double_Original_FunctionalOperator object) {
				return createDouble_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_greaterThan_FunctionalOperator(Number_Double_greaterThan_FunctionalOperator object) {
				return createNumber_Double_greaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_greaterEquals_FunctionalOperator(Number_Double_greaterEquals_FunctionalOperator object) {
				return createNumber_Double_greaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_smallerThan_FunctionalOperator(Number_Double_smallerThan_FunctionalOperator object) {
				return createNumber_Double_smallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_smallerEquals_FunctionalOperator(Number_Double_smallerEquals_FunctionalOperator object) {
				return createNumber_Double_smallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_Object_Number_equals_FunctionalOperator(Number_Double_Object_Number_equals_FunctionalOperator object) {
				return createNumber_Double_Object_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Double_Object_Number_toString_FunctionalOperator(Number_Double_Object_Number_toString_FunctionalOperator object) {
				return createNumber_Double_Object_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseDouble_FunctionalOperator(Double_FunctionalOperator object) {
				return createDouble_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Number_to_Double_FunctionalOperator(InheritedFrom_Number_to_Double_FunctionalOperator object) {
				return createInheritedFrom_Number_to_Double_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseFloat_Calculateable(Float_Calculateable object) {
				return createFloat_CalculateableAdapter();
			}
			@Override
			public Adapter caseFloat_CalculateableElement(Float_CalculateableElement object) {
				return createFloat_CalculateableElementAdapter();
			}
			@Override
			public Adapter caseFloat_Operator(Float_Operator object) {
				return createFloat_OperatorAdapter();
			}
			@Override
			public Adapter caseFloat_Type(Float_Type object) {
				return createFloat_TypeAdapter();
			}
			@Override
			public Adapter caseFloat_FunctionalType(Float_FunctionalType object) {
				return createFloat_FunctionalTypeAdapter();
			}
			@Override
			public Adapter caseFloat_CalculateableParameter(Float_CalculateableParameter object) {
				return createFloat_CalculateableParameterAdapter();
			}
			@Override
			public Adapter caseFloat_FunctionalParameter(Float_FunctionalParameter object) {
				return createFloat_FunctionalParameterAdapter();
			}
			@Override
			public Adapter caseFloat_Argument(Float_Argument object) {
				return createFloat_ArgumentAdapter();
			}
			@Override
			public Adapter caseFloat_PrimitiveArgument(Float_PrimitiveArgument object) {
				return createFloat_PrimitiveArgumentAdapter();
			}
			@Override
			public Adapter caseFloat_EvaluationOperation_Argument(Float_EvaluationOperation_Argument object) {
				return createFloat_EvaluationOperation_ArgumentAdapter();
			}
			@Override
			public Adapter caseFloat_ExpressionOperator(Float_ExpressionOperator object) {
				return createFloat_ExpressionOperatorAdapter();
			}
			@Override
			public Adapter caseFloat_BitOperator(Float_BitOperator object) {
				return createFloat_BitOperatorAdapter();
			}
			@Override
			public Adapter caseFloat_And_BitOperator(Float_And_BitOperator object) {
				return createFloat_And_BitOperatorAdapter();
			}
			@Override
			public Adapter caseFloat_Or_BitOperator(Float_Or_BitOperator object) {
				return createFloat_Or_BitOperatorAdapter();
			}
			@Override
			public Adapter caseFloat_Original_FunctionalOperator(Float_Original_FunctionalOperator object) {
				return createFloat_Original_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Float_greaterThan_FunctionalOperator(Number_Float_greaterThan_FunctionalOperator object) {
				return createNumber_Float_greaterThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Float_greaterEquals_FunctionalOperator(Number_Float_greaterEquals_FunctionalOperator object) {
				return createNumber_Float_greaterEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Float_smallerThan_FunctionalOperator(Number_Float_smallerThan_FunctionalOperator object) {
				return createNumber_Float_smallerThan_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Float_smallerEquals_FunctionalOperator(Number_Float_smallerEquals_FunctionalOperator object) {
				return createNumber_Float_smallerEquals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Float_Object_Number_equals_FunctionalOperator(Number_Float_Object_Number_equals_FunctionalOperator object) {
				return createNumber_Float_Object_Number_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseNumber_Float_Object_Number_toString_FunctionalOperator(Number_Float_Object_Number_toString_FunctionalOperator object) {
				return createNumber_Float_Object_Number_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseFloat_FunctionalOperator(Float_FunctionalOperator object) {
				return createFloat_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Number_to_Float_FunctionalOperator(InheritedFrom_Number_to_Float_FunctionalOperator object) {
				return createInheritedFrom_Number_to_Float_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_CharSequence_equals_FunctionalOperator(Object_CharSequence_equals_FunctionalOperator object) {
				return createObject_CharSequence_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_CharSequence_toString_FunctionalOperator(Object_CharSequence_toString_FunctionalOperator object) {
				return createObject_CharSequence_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_FunctionalOperator(CharSequence_FunctionalOperator object) {
				return createCharSequence_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(InheritedFrom_Object_to_CharSequence_FunctionalOperator object) {
				return createInheritedFrom_Object_to_CharSequence_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Character_equals_FunctionalOperator(Object_Character_equals_FunctionalOperator object) {
				return createObject_Character_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Character_toString_FunctionalOperator(Object_Character_toString_FunctionalOperator object) {
				return createObject_Character_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharacter_FunctionalOperator(Character_FunctionalOperator object) {
				return createCharacter_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_Character_FunctionalOperator(InheritedFrom_Object_to_Character_FunctionalOperator object) {
				return createInheritedFrom_Object_to_Character_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Boolean_equals_FunctionalOperator(Object_Boolean_equals_FunctionalOperator object) {
				return createObject_Boolean_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseObject_Boolean_toString_FunctionalOperator(Object_Boolean_toString_FunctionalOperator object) {
				return createObject_Boolean_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseBoolean_FunctionalOperator(Boolean_FunctionalOperator object) {
				return createBoolean_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_Object_to_Boolean_FunctionalOperator(InheritedFrom_Object_to_Boolean_FunctionalOperator object) {
				return createInheritedFrom_Object_to_Boolean_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_String_length_FunctionalOperator(CharSequence_String_length_FunctionalOperator object) {
				return createCharSequence_String_length_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_String_Object_CharSequence_equals_FunctionalOperator(CharSequence_String_Object_CharSequence_equals_FunctionalOperator object) {
				return createCharSequence_String_Object_CharSequence_equals_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCharSequence_String_Object_CharSequence_toString_FunctionalOperator(CharSequence_String_Object_CharSequence_toString_FunctionalOperator object) {
				return createCharSequence_String_Object_CharSequence_toString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseString_FunctionalOperator(String_FunctionalOperator object) {
				return createString_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseInheritedFrom_CharSequence_to_String_FunctionalOperator(InheritedFrom_CharSequence_to_String_FunctionalOperator object) {
				return createInheritedFrom_CharSequence_to_String_FunctionalOperatorAdapter();
			}
			@Override
			public Adapter caseCount_AggregationOperator(Count_AggregationOperator object) {
				return createCount_AggregationOperatorAdapter();
			}
			@Override
			public Adapter caseSum_AggregationOperator(Sum_AggregationOperator object) {
				return createSum_AggregationOperatorAdapter();
			}
			@Override
			public Adapter caseMin_AggregationOperator(Min_AggregationOperator object) {
				return createMin_AggregationOperatorAdapter();
			}
			@Override
			public Adapter caseMax_AggregationOperator(Max_AggregationOperator object) {
				return createMax_AggregationOperatorAdapter();
			}
			@Override
			public Adapter caseIntegerParseInt_ClassOperator(IntegerParseInt_ClassOperator object) {
				return createIntegerParseInt_ClassOperatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeFamily <em>Attribute Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeFamily
	 * @generated
	 */
	public Adapter createAttributeFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeNameMapping
	 * @generated
	 */
	public Adapter createAttributeNameMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeLib <em>Attribute Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeLib
	 * @generated
	 */
	public Adapter createAttributeLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeValueRequirement <em>Attribute Value Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeValueRequirement
	 * @generated
	 */
	public Adapter createAttributeValueRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXBasicObject <em>CAEX Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXBasicObject
	 * @generated
	 */
	public Adapter createCAEXBasicObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXFile <em>CAEX File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXFile
	 * @generated
	 */
	public Adapter createCAEXFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXObject <em>CAEX Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXObject
	 * @generated
	 */
	public Adapter createCAEXObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExternalInterface
	 * @generated
	 */
	public Adapter createExternalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExternalReferenceType
	 * @generated
	 */
	public Adapter createExternalReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InstanceHierarchy
	 * @generated
	 */
	public Adapter createInstanceHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceClassLib
	 * @generated
	 */
	public Adapter createInterfaceClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceClass
	 * @generated
	 */
	public Adapter createInterfaceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceFamily <em>Interface Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceFamily
	 * @generated
	 */
	public Adapter createInterfaceFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceIDMapping <em>Interface ID Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceIDMapping
	 * @generated
	 */
	public Adapter createInterfaceIDMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InternalElement
	 * @generated
	 */
	public Adapter createInternalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InternalLink
	 * @generated
	 */
	public Adapter createInternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.NominalScaledType <em>Nominal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.NominalScaledType
	 * @generated
	 */
	public Adapter createNominalScaledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.OrdinalScaledType <em>Ordinal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.OrdinalScaledType
	 * @generated
	 */
	public Adapter createOrdinalScaledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RefSemantic
	 * @generated
	 */
	public Adapter createRefSemanticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleClassLib
	 * @generated
	 */
	public Adapter createRoleClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleClass
	 * @generated
	 */
	public Adapter createRoleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleFamily <em>Role Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleFamily
	 * @generated
	 */
	public Adapter createRoleFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleRequirements
	 * @generated
	 */
	public Adapter createRoleRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation <em>Source Document Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation
	 * @generated
	 */
	public Adapter createSourceDocumentInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SupportedRoleClass
	 * @generated
	 */
	public Adapter createSupportedRoleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SystemUnitClassLib
	 * @generated
	 */
	public Adapter createSystemUnitClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SystemUnitClass
	 * @generated
	 */
	public Adapter createSystemUnitClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SystemUnitFamily <em>System Unit Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SystemUnitFamily
	 * @generated
	 */
	public Adapter createSystemUnitFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.UnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.UnknownType
	 * @generated
	 */
	public Adapter createUnknownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Copyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Copyright
	 * @generated
	 */
	public Adapter createCopyrightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AdditionalInformation
	 * @generated
	 */
	public Adapter createAdditionalInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.GenericElement
	 * @generated
	 */
	public Adapter createGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.GenericAttribute <em>Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.GenericAttribute
	 * @generated
	 */
	public Adapter createGenericAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Countable <em>Countable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Countable
	 * @generated
	 */
	public Adapter createCountableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.NegatableElement <em>Negatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.NegatableElement
	 * @generated
	 */
	public Adapter createNegatableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.OrGroup <em>Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.OrGroup
	 * @generated
	 */
	public Adapter createOrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RootClass <em>Root Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RootClass
	 * @generated
	 */
	public Adapter createRootClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FindQuery <em>Find Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FindQuery
	 * @generated
	 */
	public Adapter createFindQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Calculateable <em>Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Calculateable
	 * @generated
	 */
	public Adapter createCalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculateableElement <em>Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculateableElement
	 * @generated
	 */
	public Adapter createCalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeEClass <em>Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeEClass
	 * @generated
	 */
	public Adapter createAttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RegularAttributeEClass <em>Regular Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RegularAttributeEClass
	 * @generated
	 */
	public Adapter createRegularAttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EnumerationAttributeEClass <em>Enumeration Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EnumerationAttributeEClass
	 * @generated
	 */
	public Adapter createEnumerationAttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalType <em>Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalType
	 * @generated
	 */
	public Adapter createFunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ReferenceArgument <em>Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ReferenceArgument
	 * @generated
	 */
	public Adapter createReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Countable_ReferenceArgument <em>Countable Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Countable_ReferenceArgument
	 * @generated
	 */
	public Adapter createCountable_ReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Calculateable_Argument <em>Calculateable Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Calculateable_Argument
	 * @generated
	 */
	public Adapter createCalculateable_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculateableElement_ReferenceArgument <em>Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculateableElement_ReferenceArgument
	 * @generated
	 */
	public Adapter createCalculateableElement_ReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalArgument <em>Functional Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalArgument
	 * @generated
	 */
	public Adapter createFunctionalArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationOperation_Argument <em>Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createEvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.PrimitiveArgument <em>Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.PrimitiveArgument
	 * @generated
	 */
	public Adapter createPrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CountableReferenceParameter <em>Countable Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CountableReferenceParameter
	 * @generated
	 */
	public Adapter createCountableReferenceParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculateableParameter <em>Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculateableParameter
	 * @generated
	 */
	public Adapter createCalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalParameter <em>Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalParameter
	 * @generated
	 */
	public Adapter createFunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Calculateable <em>Integer Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Calculateable
	 * @generated
	 */
	public Adapter createInteger_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_CalculateableElement <em>Integer Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_CalculateableElement
	 * @generated
	 */
	public Adapter createInteger_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExpressionOperator <em>Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExpressionOperator
	 * @generated
	 */
	public Adapter createExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EnumerationOperator <em>Enumeration Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EnumerationOperator
	 * @generated
	 */
	public Adapter createEnumerationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.BitOperator <em>Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.BitOperator
	 * @generated
	 */
	public Adapter createBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.FunctionalOperator <em>Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.FunctionalOperator
	 * @generated
	 */
	public Adapter createFunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ClassOperator <em>Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ClassOperator
	 * @generated
	 */
	public Adapter createClassOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationOperator <em>Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationOperator
	 * @generated
	 */
	public Adapter createEvaluationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationFunctionalOperator <em>Evaluation Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationFunctionalOperator
	 * @generated
	 */
	public Adapter createEvaluationFunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AggregationOperator <em>Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AggregationOperator
	 * @generated
	 */
	public Adapter createAggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EvaluationBitOperator <em>Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EvaluationBitOperator
	 * @generated
	 */
	public Adapter createEvaluationBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.And_EvaluationBitOperator <em>And Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.And_EvaluationBitOperator
	 * @generated
	 */
	public Adapter createAnd_EvaluationBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Or_EvaluationBitOperator <em>Or Evaluation Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Or_EvaluationBitOperator
	 * @generated
	 */
	public Adapter createOr_EvaluationBitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CountingAggregationOperator <em>Counting Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CountingAggregationOperator
	 * @generated
	 */
	public Adapter createCountingAggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CalculatingAggregationOperator <em>Calculating Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CalculatingAggregationOperator
	 * @generated
	 */
	public Adapter createCalculatingAggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Calculateable <em>String Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Calculateable
	 * @generated
	 */
	public Adapter createString_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_CalculateableElement <em>String Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_CalculateableElement
	 * @generated
	 */
	public Adapter createString_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_AttributeEClass <em>String Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_AttributeEClass
	 * @generated
	 */
	public Adapter createString_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Operator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Operator
	 * @generated
	 */
	public Adapter createString_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Type <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Type
	 * @generated
	 */
	public Adapter createString_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_FunctionalType <em>String Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_FunctionalType
	 * @generated
	 */
	public Adapter createString_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_CalculateableParameter <em>String Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_CalculateableParameter
	 * @generated
	 */
	public Adapter createString_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_FunctionalParameter <em>String Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_FunctionalParameter
	 * @generated
	 */
	public Adapter createString_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Argument <em>String Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Argument
	 * @generated
	 */
	public Adapter createString_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_PrimitiveArgument <em>String Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_PrimitiveArgument
	 * @generated
	 */
	public Adapter createString_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_EvaluationOperation_Argument <em>String Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createString_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_CalculateableElementReferenceArgument <em>String Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_CalculateableElementReferenceArgument
	 * @generated
	 */
	public Adapter createString_CalculateableElementReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_ExpressionOperator <em>String Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_ExpressionOperator
	 * @generated
	 */
	public Adapter createString_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_BitOperator <em>String Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_BitOperator
	 * @generated
	 */
	public Adapter createString_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_And_BitOperator <em>String And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_And_BitOperator
	 * @generated
	 */
	public Adapter createString_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Or_BitOperator <em>String Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Or_BitOperator
	 * @generated
	 */
	public Adapter createString_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_Original_FunctionalOperator <em>String Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createString_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeNameMapping_roleAttributeName_AttrEClass <em>Attribute Name Mapping role Attribute Name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeNameMapping_roleAttributeName_AttrEClass
	 * @generated
	 */
	public Adapter createAttributeNameMapping_roleAttributeName_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeNameMapping_systemUnitAttributeName_AttrEClass <em>Attribute Name Mapping system Unit Attribute Name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeNameMapping_systemUnitAttributeName_AttrEClass
	 * @generated
	 */
	public Adapter createAttributeNameMapping_systemUnitAttributeName_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Attribute_defaultValue_AttrEClass <em>Attribute default Value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Attribute_defaultValue_AttrEClass
	 * @generated
	 */
	public Adapter createAttribute_defaultValue_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Attribute_value_AttrEClass <em>Attribute value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Attribute_value_AttrEClass
	 * @generated
	 */
	public Adapter createAttribute_value_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_Calculateable <em>Attribute Data Type Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_Calculateable
	 * @generated
	 */
	public Adapter createAttributeDataType_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_CalculateableElement <em>Attribute Data Type Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_CalculateableElement
	 * @generated
	 */
	public Adapter createAttributeDataType_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_AttributeEClass <em>Attribute Data Type Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_AttributeEClass
	 * @generated
	 */
	public Adapter createAttributeDataType_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_Operator <em>Attribute Data Type Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_Operator
	 * @generated
	 */
	public Adapter createAttributeDataType_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_Type <em>Attribute Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_Type
	 * @generated
	 */
	public Adapter createAttributeDataType_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_FunctionalType <em>Attribute Data Type Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_FunctionalType
	 * @generated
	 */
	public Adapter createAttributeDataType_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_CalculateableParameter <em>Attribute Data Type Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_CalculateableParameter
	 * @generated
	 */
	public Adapter createAttributeDataType_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_FunctionalParameter <em>Attribute Data Type Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_FunctionalParameter
	 * @generated
	 */
	public Adapter createAttributeDataType_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_Argument <em>Attribute Data Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_Argument
	 * @generated
	 */
	public Adapter createAttributeDataType_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_PrimitiveArgument <em>Attribute Data Type Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_PrimitiveArgument
	 * @generated
	 */
	public Adapter createAttributeDataType_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_EvaluationOperation_Argument <em>Attribute Data Type Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createAttributeDataType_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_CalculateableElementReferenceArgument <em>Attribute Data Type Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_CalculateableElementReferenceArgument
	 * @generated
	 */
	public Adapter createAttributeDataType_CalculateableElementReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_ExpressionOperator <em>Attribute Data Type Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_ExpressionOperator
	 * @generated
	 */
	public Adapter createAttributeDataType_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_BitOperator <em>Attribute Data Type Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_BitOperator
	 * @generated
	 */
	public Adapter createAttributeDataType_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_And_BitOperator <em>Attribute Data Type And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_And_BitOperator
	 * @generated
	 */
	public Adapter createAttributeDataType_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_Or_BitOperator <em>Attribute Data Type Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_Or_BitOperator
	 * @generated
	 */
	public Adapter createAttributeDataType_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeDataType_FunctionalOperator <em>Attribute Data Type Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeDataType_FunctionalOperator
	 * @generated
	 */
	public Adapter createAttributeDataType_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Attribute_attributeDataType_AttrEClass <em>Attribute attribute Data Type Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Attribute_attributeDataType_AttrEClass
	 * @generated
	 */
	public Adapter createAttribute_attributeDataType_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Attribute_refAttributeType_AttrEClass <em>Attribute ref Attribute Type Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Attribute_refAttributeType_AttrEClass
	 * @generated
	 */
	public Adapter createAttribute_refAttributeType_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Attribute_unit_AttrEClass <em>Attribute unit Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Attribute_unit_AttrEClass
	 * @generated
	 */
	public Adapter createAttribute_unit_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeValueRequirement_name_AttrEClass <em>Attribute Value Requirement name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeValueRequirement_name_AttrEClass
	 * @generated
	 */
	public Adapter createAttributeValueRequirement_name_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ChangeMode_Calculateable <em>Change Mode Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ChangeMode_Calculateable
	 * @generated
	 */
	public Adapter createChangeMode_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ChangeMode_CalculateableElement <em>Change Mode Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ChangeMode_CalculateableElement
	 * @generated
	 */
	public Adapter createChangeMode_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ChangeMode_Operator <em>Change Mode Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ChangeMode_Operator
	 * @generated
	 */
	public Adapter createChangeMode_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ChangeMode_EnumerationOperator <em>Change Mode Enumeration Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ChangeMode_EnumerationOperator
	 * @generated
	 */
	public Adapter createChangeMode_EnumerationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ChangeMode_AttributeEClass <em>Change Mode Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ChangeMode_AttributeEClass
	 * @generated
	 */
	public Adapter createChangeMode_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXBasicObject_changeMode_AttrEClass <em>CAEX Basic Object change Mode Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXBasicObject_changeMode_AttrEClass
	 * @generated
	 */
	public Adapter createCAEXBasicObject_changeMode_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXFile_superiorStandardVersion_AttrEClass <em>CAEX File superior Standard Version Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXFile_superiorStandardVersion_AttrEClass
	 * @generated
	 */
	public Adapter createCAEXFile_superiorStandardVersion_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXFile_fileName_AttrEClass <em>CAEX File file Name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXFile_fileName_AttrEClass
	 * @generated
	 */
	public Adapter createCAEXFile_fileName_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXFile_schemaVersion_AttrEClass <em>CAEX File schema Version Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXFile_schemaVersion_AttrEClass
	 * @generated
	 */
	public Adapter createCAEXFile_schemaVersion_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXObject_iD_AttrEClass <em>CAEX Object iD Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXObject_iD_AttrEClass
	 * @generated
	 */
	public Adapter createCAEXObject_iD_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXObject_name_AttrEClass <em>CAEX Object name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXObject_name_AttrEClass
	 * @generated
	 */
	public Adapter createCAEXObject_name_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_Calculateable <em>EFeature Map Entry Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_Calculateable
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_CalculateableElement <em>EFeature Map Entry Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_CalculateableElement
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_AttributeEClass <em>EFeature Map Entry Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_AttributeEClass
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_Operator <em>EFeature Map Entry Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_Operator
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_Type <em>EFeature Map Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_Type
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_FunctionalType <em>EFeature Map Entry Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_FunctionalType
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_CalculateableParameter <em>EFeature Map Entry Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_CalculateableParameter
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_FunctionalParameter <em>EFeature Map Entry Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_FunctionalParameter
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_Argument <em>EFeature Map Entry Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_Argument
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_PrimitiveArgument <em>EFeature Map Entry Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_PrimitiveArgument
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_EvaluationOperation_Argument <em>EFeature Map Entry Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_CalculateableElementReferenceArgument <em>EFeature Map Entry Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_CalculateableElementReferenceArgument
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_CalculateableElementReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_ExpressionOperator <em>EFeature Map Entry Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_ExpressionOperator
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_BitOperator <em>EFeature Map Entry Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_BitOperator
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_And_BitOperator <em>EFeature Map Entry And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_And_BitOperator
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_Or_BitOperator <em>EFeature Map Entry Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_Or_BitOperator
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.EFeatureMapEntry_FunctionalOperator <em>EFeature Map Entry Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.EFeatureMapEntry_FunctionalOperator
	 * @generated
	 */
	public Adapter createEFeatureMapEntry_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DocumentRoot_mixed_AttrEClass <em>Document Root mixed Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DocumentRoot_mixed_AttrEClass
	 * @generated
	 */
	public Adapter createDocumentRoot_mixed_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExternalReferenceType_alias_AttrEClass <em>External Reference Type alias Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExternalReferenceType_alias_AttrEClass
	 * @generated
	 */
	public Adapter createExternalReferenceType_alias_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExternalReferenceType_path_AttrEClass <em>External Reference Type path Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExternalReferenceType_path_AttrEClass
	 * @generated
	 */
	public Adapter createExternalReferenceType_path_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceClass_refBaseClassPath_AttrEClass <em>Interface Class ref Base Class Path Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceClass_refBaseClassPath_AttrEClass
	 * @generated
	 */
	public Adapter createInterfaceClass_refBaseClassPath_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceIDMapping_roleInterfaceID_AttrEClass <em>Interface ID Mapping role Interface ID Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceIDMapping_roleInterfaceID_AttrEClass
	 * @generated
	 */
	public Adapter createInterfaceIDMapping_roleInterfaceID_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceIDMapping_systemUnitInterfaceID_AttrEClass <em>Interface ID Mapping system Unit Interface ID Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceIDMapping_systemUnitInterfaceID_AttrEClass
	 * @generated
	 */
	public Adapter createInterfaceIDMapping_systemUnitInterfaceID_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InternalElement_refBaseSystemUnitPath_AttrEClass <em>Internal Element ref Base System Unit Path Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InternalElement_refBaseSystemUnitPath_AttrEClass
	 * @generated
	 */
	public Adapter createInternalElement_refBaseSystemUnitPath_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InternalLink_refPartnerSideA_AttrEClass <em>Internal Link ref Partner Side AAttr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InternalLink_refPartnerSideA_AttrEClass
	 * @generated
	 */
	public Adapter createInternalLink_refPartnerSideA_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InternalLink_refPartnerSideB_AttrEClass <em>Internal Link ref Partner Side BAttr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InternalLink_refPartnerSideB_AttrEClass
	 * @generated
	 */
	public Adapter createInternalLink_refPartnerSideB_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.NominalScaledType_requiredValue_AttrEClass <em>Nominal Scaled Type required Value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.NominalScaledType_requiredValue_AttrEClass
	 * @generated
	 */
	public Adapter createNominalScaledType_requiredValue_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.OrdinalScaledType_requiredMaxValue_AttrEClass <em>Ordinal Scaled Type required Max Value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.OrdinalScaledType_requiredMaxValue_AttrEClass
	 * @generated
	 */
	public Adapter createOrdinalScaledType_requiredMaxValue_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.OrdinalScaledType_requiredValue_AttrEClass <em>Ordinal Scaled Type required Value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.OrdinalScaledType_requiredValue_AttrEClass
	 * @generated
	 */
	public Adapter createOrdinalScaledType_requiredValue_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.OrdinalScaledType_requiredMinValue_AttrEClass <em>Ordinal Scaled Type required Min Value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.OrdinalScaledType_requiredMinValue_AttrEClass
	 * @generated
	 */
	public Adapter createOrdinalScaledType_requiredMinValue_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RefSemantic_correspondingAttributePath_AttrEClass <em>Ref Semantic corresponding Attribute Path Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RefSemantic_correspondingAttributePath_AttrEClass
	 * @generated
	 */
	public Adapter createRefSemantic_correspondingAttributePath_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleClass_refBaseClassPath_AttrEClass <em>Role Class ref Base Class Path Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleClass_refBaseClassPath_AttrEClass
	 * @generated
	 */
	public Adapter createRoleClass_refBaseClassPath_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_Calculateable <em>Date Time Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_Calculateable
	 * @generated
	 */
	public Adapter createDateTime_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_CalculateableElement <em>Date Time Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_CalculateableElement
	 * @generated
	 */
	public Adapter createDateTime_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_AttributeEClass <em>Date Time Attribute EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_AttributeEClass
	 * @generated
	 */
	public Adapter createDateTime_AttributeEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_Operator <em>Date Time Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_Operator
	 * @generated
	 */
	public Adapter createDateTime_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_Type <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_Type
	 * @generated
	 */
	public Adapter createDateTime_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_FunctionalType <em>Date Time Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_FunctionalType
	 * @generated
	 */
	public Adapter createDateTime_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_CalculateableParameter <em>Date Time Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_CalculateableParameter
	 * @generated
	 */
	public Adapter createDateTime_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_FunctionalParameter <em>Date Time Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_FunctionalParameter
	 * @generated
	 */
	public Adapter createDateTime_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_Argument <em>Date Time Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_Argument
	 * @generated
	 */
	public Adapter createDateTime_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_PrimitiveArgument <em>Date Time Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_PrimitiveArgument
	 * @generated
	 */
	public Adapter createDateTime_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_EvaluationOperation_Argument <em>Date Time Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createDateTime_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_CalculateableElementReferenceArgument <em>Date Time Calculateable Element Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_CalculateableElementReferenceArgument
	 * @generated
	 */
	public Adapter createDateTime_CalculateableElementReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_ExpressionOperator <em>Date Time Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_ExpressionOperator
	 * @generated
	 */
	public Adapter createDateTime_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_BitOperator <em>Date Time Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_BitOperator
	 * @generated
	 */
	public Adapter createDateTime_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_And_BitOperator <em>Date Time And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_And_BitOperator
	 * @generated
	 */
	public Adapter createDateTime_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_Or_BitOperator <em>Date Time Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_Or_BitOperator
	 * @generated
	 */
	public Adapter createDateTime_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.DateTime_FunctionalOperator <em>Date Time Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.DateTime_FunctionalOperator
	 * @generated
	 */
	public Adapter createDateTime_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_lastWritingDateTime_AttrEClass <em>Source Document Information last Writing Date Time Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_lastWritingDateTime_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_lastWritingDateTime_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originID_AttrEClass <em>Source Document Information origin ID Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originID_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originID_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originName_AttrEClass <em>Source Document Information origin Name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originName_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originName_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originProjectID_AttrEClass <em>Source Document Information origin Project ID Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originProjectID_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originProjectID_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originProjectTitle_AttrEClass <em>Source Document Information origin Project Title Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originProjectTitle_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originProjectTitle_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originRelease_AttrEClass <em>Source Document Information origin Release Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originRelease_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originRelease_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originVendor_AttrEClass <em>Source Document Information origin Vendor Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originVendor_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originVendor_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originVendorURL_AttrEClass <em>Source Document Information origin Vendor URL Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originVendorURL_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originVendorURL_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_originVersion_AttrEClass <em>Source Document Information origin Version Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_originVersion_AttrEClass
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_originVersion_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SupportedRoleClass_refRoleClassPath_AttrEClass <em>Supported Role Class ref Role Class Path Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SupportedRoleClass_refRoleClassPath_AttrEClass
	 * @generated
	 */
	public Adapter createSupportedRoleClass_refRoleClassPath_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SystemUnitClass_refBaseClassPath_AttrEClass <em>System Unit Class ref Base Class Path Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SystemUnitClass_refBaseClassPath_AttrEClass
	 * @generated
	 */
	public Adapter createSystemUnitClass_refBaseClassPath_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.UnknownType_requirements_AttrEClass <em>Unknown Type requirements Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.UnknownType_requirements_AttrEClass
	 * @generated
	 */
	public Adapter createUnknownType_requirements_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Copyright_value_AttrEClass <em>Copyright value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Copyright_value_AttrEClass
	 * @generated
	 */
	public Adapter createCopyright_value_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Copyright_changeMode_AttrEClass <em>Copyright change Mode Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Copyright_changeMode_AttrEClass
	 * @generated
	 */
	public Adapter createCopyright_changeMode_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Description_value_AttrEClass <em>Description value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Description_value_AttrEClass
	 * @generated
	 */
	public Adapter createDescription_value_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Description_changeMode_AttrEClass <em>Description change Mode Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Description_changeMode_AttrEClass
	 * @generated
	 */
	public Adapter createDescription_changeMode_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Revision_revisionDate_AttrEClass <em>Revision revision Date Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Revision_revisionDate_AttrEClass
	 * @generated
	 */
	public Adapter createRevision_revisionDate_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Revision_oldVersion_AttrEClass <em>Revision old Version Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Revision_oldVersion_AttrEClass
	 * @generated
	 */
	public Adapter createRevision_oldVersion_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Revision_newVersion_AttrEClass <em>Revision new Version Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Revision_newVersion_AttrEClass
	 * @generated
	 */
	public Adapter createRevision_newVersion_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Revision_authorName_AttrEClass <em>Revision author Name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Revision_authorName_AttrEClass
	 * @generated
	 */
	public Adapter createRevision_authorName_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Revision_comment_AttrEClass <em>Revision comment Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Revision_comment_AttrEClass
	 * @generated
	 */
	public Adapter createRevision_comment_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Version_value_AttrEClass <em>Version value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Version_value_AttrEClass
	 * @generated
	 */
	public Adapter createVersion_value_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Version_changeMode_AttrEClass <em>Version change Mode Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Version_changeMode_AttrEClass
	 * @generated
	 */
	public Adapter createVersion_changeMode_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Element_name_AttrEClass <em>Element name Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Element_name_AttrEClass
	 * @generated
	 */
	public Adapter createElement_name_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Element_value_AttrEClass <em>Element value Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Element_value_AttrEClass
	 * @generated
	 */
	public Adapter createElement_value_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.GenericElement_elementFeatureMap_AttrEClass <em>Generic Element element Feature Map Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.GenericElement_elementFeatureMap_AttrEClass
	 * @generated
	 */
	public Adapter createGenericElement_elementFeatureMap_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.GenericElement_attributeFeatureMap_AttrEClass <em>Generic Element attribute Feature Map Attr EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.GenericElement_attributeFeatureMap_AttrEClass
	 * @generated
	 */
	public Adapter createGenericElement_attributeFeatureMap_AttrEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Attribute_OrGroup <em>Attribute Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Attribute_OrGroup
	 * @generated
	 */
	public Adapter createAttribute_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RefSemantic_OrGroup <em>Ref Semantic Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RefSemantic_OrGroup
	 * @generated
	 */
	public Adapter createRefSemantic_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeValueRequirement_OrGroup <em>Attribute Value Requirement Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeValueRequirement_OrGroup
	 * @generated
	 */
	public Adapter createAttributeValueRequirement_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.OrdinalScaledType_OrGroup <em>Ordinal Scaled Type Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.OrdinalScaledType_OrGroup
	 * @generated
	 */
	public Adapter createOrdinalScaledType_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.NominalScaledType_OrGroup <em>Nominal Scaled Type Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.NominalScaledType_OrGroup
	 * @generated
	 */
	public Adapter createNominalScaledType_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.UnknownType_OrGroup <em>Unknown Type Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.UnknownType_OrGroup
	 * @generated
	 */
	public Adapter createUnknownType_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Description_OrGroup <em>Description Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Description_OrGroup
	 * @generated
	 */
	public Adapter createDescription_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Version_OrGroup <em>Version Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Version_OrGroup
	 * @generated
	 */
	public Adapter createVersion_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Revision_OrGroup <em>Revision Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Revision_OrGroup
	 * @generated
	 */
	public Adapter createRevision_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Copyright_OrGroup <em>Copyright Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Copyright_OrGroup
	 * @generated
	 */
	public Adapter createCopyright_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AdditionalInformation_OrGroup <em>Additional Information Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AdditionalInformation_OrGroup
	 * @generated
	 */
	public Adapter createAdditionalInformation_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SourceDocumentInformation_OrGroup <em>Source Document Information Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SourceDocumentInformation_OrGroup
	 * @generated
	 */
	public Adapter createSourceDocumentInformation_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExternalReferenceType_OrGroup <em>External Reference Type Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExternalReferenceType_OrGroup
	 * @generated
	 */
	public Adapter createExternalReferenceType_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InstanceHierarchy_OrGroup <em>Instance Hierarchy Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InstanceHierarchy_OrGroup
	 * @generated
	 */
	public Adapter createInstanceHierarchy_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceClassLib_OrGroup <em>Interface Class Lib Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceClassLib_OrGroup
	 * @generated
	 */
	public Adapter createInterfaceClassLib_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleClassLib_OrGroup <em>Role Class Lib Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleClassLib_OrGroup
	 * @generated
	 */
	public Adapter createRoleClassLib_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SystemUnitClassLib_OrGroup <em>System Unit Class Lib Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SystemUnitClassLib_OrGroup
	 * @generated
	 */
	public Adapter createSystemUnitClassLib_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeLib_OrGroup <em>Attribute Lib Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeLib_OrGroup
	 * @generated
	 */
	public Adapter createAttributeLib_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CAEXFile_OrGroup <em>CAEX File Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CAEXFile_OrGroup
	 * @generated
	 */
	public Adapter createCAEXFile_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceClass_OrGroup <em>Interface Class Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceClass_OrGroup
	 * @generated
	 */
	public Adapter createInterfaceClass_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InternalElement_OrGroup <em>Internal Element Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InternalElement_OrGroup
	 * @generated
	 */
	public Adapter createInternalElement_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.ExternalInterface_OrGroup <em>External Interface Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.ExternalInterface_OrGroup
	 * @generated
	 */
	public Adapter createExternalInterface_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleRequirements_OrGroup <em>Role Requirements Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleRequirements_OrGroup
	 * @generated
	 */
	public Adapter createRoleRequirements_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SystemUnitClass_OrGroup <em>System Unit Class Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SystemUnitClass_OrGroup
	 * @generated
	 */
	public Adapter createSystemUnitClass_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.AttributeNameMapping_OrGroup <em>Attribute Name Mapping Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.AttributeNameMapping_OrGroup
	 * @generated
	 */
	public Adapter createAttributeNameMapping_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InterfaceIDMapping_OrGroup <em>Interface ID Mapping Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InterfaceIDMapping_OrGroup
	 * @generated
	 */
	public Adapter createInterfaceIDMapping_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.RoleClass_OrGroup <em>Role Class Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.RoleClass_OrGroup
	 * @generated
	 */
	public Adapter createRoleClass_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Mapping_OrGroup <em>Mapping Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Mapping_OrGroup
	 * @generated
	 */
	public Adapter createMapping_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.SupportedRoleClass_OrGroup <em>Supported Role Class Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.SupportedRoleClass_OrGroup
	 * @generated
	 */
	public Adapter createSupportedRoleClass_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InternalLink_OrGroup <em>Internal Link Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InternalLink_OrGroup
	 * @generated
	 */
	public Adapter createInternalLink_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.GenericElement_OrGroup <em>Generic Element Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.GenericElement_OrGroup
	 * @generated
	 */
	public Adapter createGenericElement_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.GenericAttribute_OrGroup <em>Generic Attribute Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.GenericAttribute_OrGroup
	 * @generated
	 */
	public Adapter createGenericAttribute_OrGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Operator <em>Object Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Operator
	 * @generated
	 */
	public Adapter createObject_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Type <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Type
	 * @generated
	 */
	public Adapter createObject_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_FunctionalType <em>Object Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_FunctionalType
	 * @generated
	 */
	public Adapter createObject_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CalculateableParameter <em>Object Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CalculateableParameter
	 * @generated
	 */
	public Adapter createObject_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_FunctionalParameter <em>Object Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_FunctionalParameter
	 * @generated
	 */
	public Adapter createObject_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Calculateable <em>Object Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Calculateable
	 * @generated
	 */
	public Adapter createObject_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CalculateableElement <em>Object Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CalculateableElement
	 * @generated
	 */
	public Adapter createObject_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Argument <em>Object Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Argument
	 * @generated
	 */
	public Adapter createObject_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_PrimitiveArgument <em>Object Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_PrimitiveArgument
	 * @generated
	 */
	public Adapter createObject_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_EvaluationOperation_Argument <em>Object Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createObject_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_ExpressionOperator <em>Object Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_ExpressionOperator
	 * @generated
	 */
	public Adapter createObject_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_BitOperator <em>Object Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_BitOperator
	 * @generated
	 */
	public Adapter createObject_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_And_BitOperator <em>Object And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_And_BitOperator
	 * @generated
	 */
	public Adapter createObject_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Or_BitOperator <em>Object Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Or_BitOperator
	 * @generated
	 */
	public Adapter createObject_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_FunctionalOperator <em>Object Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Operator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Operator
	 * @generated
	 */
	public Adapter createBoolean_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Type <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Type
	 * @generated
	 */
	public Adapter createBoolean_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_FunctionalType <em>Boolean Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_FunctionalType
	 * @generated
	 */
	public Adapter createBoolean_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_CalculateableParameter <em>Boolean Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_CalculateableParameter
	 * @generated
	 */
	public Adapter createBoolean_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_FunctionalParameter <em>Boolean Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_FunctionalParameter
	 * @generated
	 */
	public Adapter createBoolean_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Calculateable <em>Boolean Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Calculateable
	 * @generated
	 */
	public Adapter createBoolean_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_CalculateableElement <em>Boolean Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_CalculateableElement
	 * @generated
	 */
	public Adapter createBoolean_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Argument <em>Boolean Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Argument
	 * @generated
	 */
	public Adapter createBoolean_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_PrimitiveArgument <em>Boolean Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_PrimitiveArgument
	 * @generated
	 */
	public Adapter createBoolean_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_EvaluationOperation_Argument <em>Boolean Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createBoolean_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_ExpressionOperator <em>Boolean Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_ExpressionOperator
	 * @generated
	 */
	public Adapter createBoolean_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_BitOperator <em>Boolean Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_BitOperator
	 * @generated
	 */
	public Adapter createBoolean_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_And_BitOperator <em>Boolean And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_And_BitOperator
	 * @generated
	 */
	public Adapter createBoolean_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Or_BitOperator <em>Boolean Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Or_BitOperator
	 * @generated
	 */
	public Adapter createBoolean_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_Original_FunctionalOperator <em>Boolean Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createBoolean_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.equals_FunctionalOperator <em>equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createequals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.toString_FunctionalOperator <em>to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createtoString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Operator <em>Char Sequence Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Operator
	 * @generated
	 */
	public Adapter createCharSequence_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Type <em>Char Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Type
	 * @generated
	 */
	public Adapter createCharSequence_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_FunctionalType <em>Char Sequence Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_FunctionalType
	 * @generated
	 */
	public Adapter createCharSequence_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_CalculateableParameter <em>Char Sequence Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_CalculateableParameter
	 * @generated
	 */
	public Adapter createCharSequence_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_FunctionalParameter <em>Char Sequence Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_FunctionalParameter
	 * @generated
	 */
	public Adapter createCharSequence_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Calculateable <em>Char Sequence Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Calculateable
	 * @generated
	 */
	public Adapter createCharSequence_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_CalculateableElement <em>Char Sequence Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_CalculateableElement
	 * @generated
	 */
	public Adapter createCharSequence_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Argument <em>Char Sequence Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Argument
	 * @generated
	 */
	public Adapter createCharSequence_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_PrimitiveArgument <em>Char Sequence Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_PrimitiveArgument
	 * @generated
	 */
	public Adapter createCharSequence_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_EvaluationOperation_Argument <em>Char Sequence Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createCharSequence_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_ExpressionOperator <em>Char Sequence Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_ExpressionOperator
	 * @generated
	 */
	public Adapter createCharSequence_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_BitOperator <em>Char Sequence Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_BitOperator
	 * @generated
	 */
	public Adapter createCharSequence_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_And_BitOperator <em>Char Sequence And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_And_BitOperator
	 * @generated
	 */
	public Adapter createCharSequence_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Or_BitOperator <em>Char Sequence Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Or_BitOperator
	 * @generated
	 */
	public Adapter createCharSequence_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_Original_FunctionalOperator <em>Char Sequence Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Operator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Operator
	 * @generated
	 */
	public Adapter createInteger_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Type <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Type
	 * @generated
	 */
	public Adapter createInteger_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_FunctionalType <em>Integer Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_FunctionalType
	 * @generated
	 */
	public Adapter createInteger_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_CalculateableParameter <em>Integer Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_CalculateableParameter
	 * @generated
	 */
	public Adapter createInteger_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_FunctionalParameter <em>Integer Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_FunctionalParameter
	 * @generated
	 */
	public Adapter createInteger_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Argument <em>Integer Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Argument
	 * @generated
	 */
	public Adapter createInteger_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_PrimitiveArgument <em>Integer Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_PrimitiveArgument
	 * @generated
	 */
	public Adapter createInteger_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_EvaluationOperation_Argument <em>Integer Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createInteger_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_ExpressionOperator <em>Integer Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_ExpressionOperator
	 * @generated
	 */
	public Adapter createInteger_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_BitOperator <em>Integer Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_BitOperator
	 * @generated
	 */
	public Adapter createInteger_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_And_BitOperator <em>Integer And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_And_BitOperator
	 * @generated
	 */
	public Adapter createInteger_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Or_BitOperator <em>Integer Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Or_BitOperator
	 * @generated
	 */
	public Adapter createInteger_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_Original_FunctionalOperator <em>Integer Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createInteger_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.length_FunctionalOperator <em>length Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.length_FunctionalOperator
	 * @generated
	 */
	public Adapter createlength_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Operator <em>Character Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Operator
	 * @generated
	 */
	public Adapter createCharacter_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Type <em>Character Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Type
	 * @generated
	 */
	public Adapter createCharacter_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_FunctionalType <em>Character Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_FunctionalType
	 * @generated
	 */
	public Adapter createCharacter_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_CalculateableParameter <em>Character Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_CalculateableParameter
	 * @generated
	 */
	public Adapter createCharacter_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_FunctionalParameter <em>Character Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_FunctionalParameter
	 * @generated
	 */
	public Adapter createCharacter_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Calculateable <em>Character Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Calculateable
	 * @generated
	 */
	public Adapter createCharacter_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_CalculateableElement <em>Character Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_CalculateableElement
	 * @generated
	 */
	public Adapter createCharacter_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Argument <em>Character Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Argument
	 * @generated
	 */
	public Adapter createCharacter_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_PrimitiveArgument <em>Character Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_PrimitiveArgument
	 * @generated
	 */
	public Adapter createCharacter_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_EvaluationOperation_Argument <em>Character Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createCharacter_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_ExpressionOperator <em>Character Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_ExpressionOperator
	 * @generated
	 */
	public Adapter createCharacter_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_BitOperator <em>Character Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_BitOperator
	 * @generated
	 */
	public Adapter createCharacter_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_And_BitOperator <em>Character And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_And_BitOperator
	 * @generated
	 */
	public Adapter createCharacter_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Or_BitOperator <em>Character Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Or_BitOperator
	 * @generated
	 */
	public Adapter createCharacter_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_Original_FunctionalOperator <em>Character Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharacter_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.charAt_FunctionalOperator <em>char At Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.charAt_FunctionalOperator
	 * @generated
	 */
	public Adapter createcharAt_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.contains_FunctionalOperator <em>contains Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.contains_FunctionalOperator
	 * @generated
	 */
	public Adapter createcontains_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.substring_FunctionalOperator <em>substring Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.substring_FunctionalOperator
	 * @generated
	 */
	public Adapter createsubstring_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.concat_FunctionalOperator <em>concat Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.concat_FunctionalOperator
	 * @generated
	 */
	public Adapter createconcat_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.endsWith_FunctionalOperator <em>ends With Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.endsWith_FunctionalOperator
	 * @generated
	 */
	public Adapter createendsWith_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.equalsIgnoreCase_FunctionalOperator <em>equals Ignore Case Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.equalsIgnoreCase_FunctionalOperator
	 * @generated
	 */
	public Adapter createequalsIgnoreCase_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.indexOfString_FunctionalOperator <em>index Of String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.indexOfString_FunctionalOperator
	 * @generated
	 */
	public Adapter createindexOfString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.isEmpty_FunctionalOperator <em>is Empty Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.isEmpty_FunctionalOperator
	 * @generated
	 */
	public Adapter createisEmpty_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Operator <em>Number Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Operator
	 * @generated
	 */
	public Adapter createNumber_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Type <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Type
	 * @generated
	 */
	public Adapter createNumber_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_FunctionalType <em>Number Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_FunctionalType
	 * @generated
	 */
	public Adapter createNumber_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_CalculateableParameter <em>Number Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_CalculateableParameter
	 * @generated
	 */
	public Adapter createNumber_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_FunctionalParameter <em>Number Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_FunctionalParameter
	 * @generated
	 */
	public Adapter createNumber_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Calculateable <em>Number Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Calculateable
	 * @generated
	 */
	public Adapter createNumber_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_CalculateableElement <em>Number Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_CalculateableElement
	 * @generated
	 */
	public Adapter createNumber_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Argument <em>Number Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Argument
	 * @generated
	 */
	public Adapter createNumber_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_PrimitiveArgument <em>Number Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_PrimitiveArgument
	 * @generated
	 */
	public Adapter createNumber_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_EvaluationOperation_Argument <em>Number Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createNumber_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_ExpressionOperator <em>Number Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_ExpressionOperator
	 * @generated
	 */
	public Adapter createNumber_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_BitOperator <em>Number Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_BitOperator
	 * @generated
	 */
	public Adapter createNumber_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_And_BitOperator <em>Number And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_And_BitOperator
	 * @generated
	 */
	public Adapter createNumber_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Or_BitOperator <em>Number Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Or_BitOperator
	 * @generated
	 */
	public Adapter createNumber_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Original_FunctionalOperator <em>Number Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.greaterThan_FunctionalOperator <em>greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter creategreaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.greaterEquals_FunctionalOperator <em>greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter creategreaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.smallerThan_FunctionalOperator <em>smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createsmallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.smallerEquals_FunctionalOperator <em>smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createsmallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.parseBoolean_FunctionalOperator <em>parse Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.parseBoolean_FunctionalOperator
	 * @generated
	 */
	public Adapter createparseBoolean_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.compareTo_FunctionalOperator <em>compare To Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.compareTo_FunctionalOperator
	 * @generated
	 */
	public Adapter createcompareTo_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Number_equals_FunctionalOperator <em>Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Number_toString_FunctionalOperator <em>Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_FunctionalOperator <em>Number Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_Number_FunctionalOperator <em>Inherited From Object to Number Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_Number_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_Number_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_greaterThan_FunctionalOperator <em>Number Integer greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_greaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_greaterEquals_FunctionalOperator <em>Number Integer greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_greaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_smallerThan_FunctionalOperator <em>Number Integer smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_smallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_smallerEquals_FunctionalOperator <em>Number Integer smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_smallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_Object_Number_equals_FunctionalOperator <em>Number Integer Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_Object_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Integer_Object_Number_toString_FunctionalOperator <em>Number Integer Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Integer_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Integer_Object_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Integer_FunctionalOperator <em>Integer Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Integer_FunctionalOperator
	 * @generated
	 */
	public Adapter createInteger_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Number_to_Integer_FunctionalOperator <em>Inherited From Number to Integer Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Number_to_Integer_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Number_to_Integer_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_Calculateable <em>Long Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_Calculateable
	 * @generated
	 */
	public Adapter createLong_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_CalculateableElement <em>Long Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_CalculateableElement
	 * @generated
	 */
	public Adapter createLong_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_Operator <em>Long Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_Operator
	 * @generated
	 */
	public Adapter createLong_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_Type <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_Type
	 * @generated
	 */
	public Adapter createLong_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_FunctionalType <em>Long Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_FunctionalType
	 * @generated
	 */
	public Adapter createLong_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_CalculateableParameter <em>Long Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_CalculateableParameter
	 * @generated
	 */
	public Adapter createLong_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_FunctionalParameter <em>Long Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_FunctionalParameter
	 * @generated
	 */
	public Adapter createLong_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_Argument <em>Long Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_Argument
	 * @generated
	 */
	public Adapter createLong_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_PrimitiveArgument <em>Long Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_PrimitiveArgument
	 * @generated
	 */
	public Adapter createLong_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_EvaluationOperation_Argument <em>Long Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createLong_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_ExpressionOperator <em>Long Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_ExpressionOperator
	 * @generated
	 */
	public Adapter createLong_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_BitOperator <em>Long Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_BitOperator
	 * @generated
	 */
	public Adapter createLong_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_And_BitOperator <em>Long And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_And_BitOperator
	 * @generated
	 */
	public Adapter createLong_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_Or_BitOperator <em>Long Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_Or_BitOperator
	 * @generated
	 */
	public Adapter createLong_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_Original_FunctionalOperator <em>Long Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createLong_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Long_greaterThan_FunctionalOperator <em>Number Long greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Long_greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Long_greaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Long_greaterEquals_FunctionalOperator <em>Number Long greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Long_greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Long_greaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Long_smallerThan_FunctionalOperator <em>Number Long smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Long_smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Long_smallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Long_smallerEquals_FunctionalOperator <em>Number Long smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Long_smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Long_smallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Long_Object_Number_equals_FunctionalOperator <em>Number Long Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Long_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Long_Object_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Long_Object_Number_toString_FunctionalOperator <em>Number Long Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Long_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Long_Object_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Long_FunctionalOperator <em>Long Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Long_FunctionalOperator
	 * @generated
	 */
	public Adapter createLong_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Number_to_Long_FunctionalOperator <em>Inherited From Number to Long Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Number_to_Long_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Number_to_Long_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Calculateable <em>Double Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Calculateable
	 * @generated
	 */
	public Adapter createDouble_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_CalculateableElement <em>Double Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_CalculateableElement
	 * @generated
	 */
	public Adapter createDouble_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Operator <em>Double Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Operator
	 * @generated
	 */
	public Adapter createDouble_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Type <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Type
	 * @generated
	 */
	public Adapter createDouble_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_FunctionalType <em>Double Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_FunctionalType
	 * @generated
	 */
	public Adapter createDouble_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_CalculateableParameter <em>Double Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_CalculateableParameter
	 * @generated
	 */
	public Adapter createDouble_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_FunctionalParameter <em>Double Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_FunctionalParameter
	 * @generated
	 */
	public Adapter createDouble_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Argument <em>Double Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Argument
	 * @generated
	 */
	public Adapter createDouble_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_PrimitiveArgument <em>Double Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_PrimitiveArgument
	 * @generated
	 */
	public Adapter createDouble_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_EvaluationOperation_Argument <em>Double Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createDouble_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_ExpressionOperator <em>Double Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_ExpressionOperator
	 * @generated
	 */
	public Adapter createDouble_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_BitOperator <em>Double Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_BitOperator
	 * @generated
	 */
	public Adapter createDouble_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_And_BitOperator <em>Double And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_And_BitOperator
	 * @generated
	 */
	public Adapter createDouble_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Or_BitOperator <em>Double Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Or_BitOperator
	 * @generated
	 */
	public Adapter createDouble_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_Original_FunctionalOperator <em>Double Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createDouble_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_greaterThan_FunctionalOperator <em>Number Double greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_greaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_greaterEquals_FunctionalOperator <em>Number Double greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_greaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_smallerThan_FunctionalOperator <em>Number Double smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_smallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_smallerEquals_FunctionalOperator <em>Number Double smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_smallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_Object_Number_equals_FunctionalOperator <em>Number Double Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_Object_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Double_Object_Number_toString_FunctionalOperator <em>Number Double Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Double_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Double_Object_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Double_FunctionalOperator <em>Double Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Double_FunctionalOperator
	 * @generated
	 */
	public Adapter createDouble_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Number_to_Double_FunctionalOperator <em>Inherited From Number to Double Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Number_to_Double_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Number_to_Double_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_Calculateable <em>Float Calculateable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_Calculateable
	 * @generated
	 */
	public Adapter createFloat_CalculateableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_CalculateableElement <em>Float Calculateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_CalculateableElement
	 * @generated
	 */
	public Adapter createFloat_CalculateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_Operator <em>Float Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_Operator
	 * @generated
	 */
	public Adapter createFloat_OperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_Type <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_Type
	 * @generated
	 */
	public Adapter createFloat_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_FunctionalType <em>Float Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_FunctionalType
	 * @generated
	 */
	public Adapter createFloat_FunctionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_CalculateableParameter <em>Float Calculateable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_CalculateableParameter
	 * @generated
	 */
	public Adapter createFloat_CalculateableParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_FunctionalParameter <em>Float Functional Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_FunctionalParameter
	 * @generated
	 */
	public Adapter createFloat_FunctionalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_Argument <em>Float Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_Argument
	 * @generated
	 */
	public Adapter createFloat_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_PrimitiveArgument <em>Float Primitive Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_PrimitiveArgument
	 * @generated
	 */
	public Adapter createFloat_PrimitiveArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_EvaluationOperation_Argument <em>Float Evaluation Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_EvaluationOperation_Argument
	 * @generated
	 */
	public Adapter createFloat_EvaluationOperation_ArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_ExpressionOperator <em>Float Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_ExpressionOperator
	 * @generated
	 */
	public Adapter createFloat_ExpressionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_BitOperator <em>Float Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_BitOperator
	 * @generated
	 */
	public Adapter createFloat_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_And_BitOperator <em>Float And Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_And_BitOperator
	 * @generated
	 */
	public Adapter createFloat_And_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_Or_BitOperator <em>Float Or Bit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_Or_BitOperator
	 * @generated
	 */
	public Adapter createFloat_Or_BitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_Original_FunctionalOperator <em>Float Original Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_Original_FunctionalOperator
	 * @generated
	 */
	public Adapter createFloat_Original_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Float_greaterThan_FunctionalOperator <em>Number Float greater Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Float_greaterThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Float_greaterThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Float_greaterEquals_FunctionalOperator <em>Number Float greater Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Float_greaterEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Float_greaterEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Float_smallerThan_FunctionalOperator <em>Number Float smaller Than Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Float_smallerThan_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Float_smallerThan_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Float_smallerEquals_FunctionalOperator <em>Number Float smaller Equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Float_smallerEquals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Float_smallerEquals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Float_Object_Number_equals_FunctionalOperator <em>Number Float Object Number equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Float_Object_Number_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Float_Object_Number_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Number_Float_Object_Number_toString_FunctionalOperator <em>Number Float Object Number to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Number_Float_Object_Number_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createNumber_Float_Object_Number_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Float_FunctionalOperator <em>Float Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Float_FunctionalOperator
	 * @generated
	 */
	public Adapter createFloat_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Number_to_Float_FunctionalOperator <em>Inherited From Number to Float Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Number_to_Float_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Number_to_Float_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CharSequence_equals_FunctionalOperator <em>Object Char Sequence equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CharSequence_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_CharSequence_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_CharSequence_toString_FunctionalOperator <em>Object Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_CharSequence_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_CharSequence_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_FunctionalOperator <em>Char Sequence Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_CharSequence_FunctionalOperator <em>Inherited From Object to Char Sequence Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_CharSequence_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_CharSequence_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Character_equals_FunctionalOperator <em>Object Character equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Character_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Character_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Character_toString_FunctionalOperator <em>Object Character to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Character_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Character_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Character_FunctionalOperator <em>Character Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Character_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharacter_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_Character_FunctionalOperator <em>Inherited From Object to Character Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_Character_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_Character_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Boolean_equals_FunctionalOperator <em>Object Boolean equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Boolean_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Boolean_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Object_Boolean_toString_FunctionalOperator <em>Object Boolean to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Object_Boolean_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createObject_Boolean_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Boolean_FunctionalOperator <em>Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Boolean_FunctionalOperator
	 * @generated
	 */
	public Adapter createBoolean_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_Object_to_Boolean_FunctionalOperator <em>Inherited From Object to Boolean Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_Object_to_Boolean_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_Object_to_Boolean_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_String_length_FunctionalOperator <em>Char Sequence String length Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_String_length_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_String_length_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator <em>Char Sequence String Object Char Sequence equals Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_String_Object_CharSequence_equals_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_String_Object_CharSequence_equals_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator <em>Char Sequence String Object Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.CharSequence_String_Object_CharSequence_toString_FunctionalOperator
	 * @generated
	 */
	public Adapter createCharSequence_String_Object_CharSequence_toString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.String_FunctionalOperator <em>String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.String_FunctionalOperator
	 * @generated
	 */
	public Adapter createString_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.InheritedFrom_CharSequence_to_String_FunctionalOperator <em>Inherited From Char Sequence to String Functional Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.InheritedFrom_CharSequence_to_String_FunctionalOperator
	 * @generated
	 */
	public Adapter createInheritedFrom_CharSequence_to_String_FunctionalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Count_AggregationOperator <em>Count Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Count_AggregationOperator
	 * @generated
	 */
	public Adapter createCount_AggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Sum_AggregationOperator <em>Sum Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Sum_AggregationOperator
	 * @generated
	 */
	public Adapter createSum_AggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Min_AggregationOperator <em>Min Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Min_AggregationOperator
	 * @generated
	 */
	public Adapter createMin_AggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.Max_AggregationOperator <em>Max Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.Max_AggregationOperator
	 * @generated
	 */
	public Adapter createMax_AggregationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qmm.IntegerParseInt_ClassOperator <em>Integer Parse Int Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qmm.IntegerParseInt_ClassOperator
	 * @generated
	 */
	public Adapter createIntegerParseInt_ClassOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QmmAdapterFactory
