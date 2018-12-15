/**
 */
package qmm.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import qmm.QmmFactory;
import qmm.QmmPackage;

import qmm.util.QmmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QmmPackageImpl extends EPackageImpl implements QmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "qmm.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeNameMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexBasicObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceIDMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nominalScaledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSemanticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedRoleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyrightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularAttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationAttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countable_ReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateable_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableElement_ReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countableReferenceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationFunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationBitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass and_EvaluationBitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass or_EvaluationBitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countingAggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatingAggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_CalculateableElementReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeNameMapping_roleAttributeName_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeNameMapping_systemUnitAttributeName_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_defaultValue_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_value_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_CalculateableElementReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataType_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_attributeDataType_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_refAttributeType_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_unit_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueRequirement_name_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeMode_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeMode_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeMode_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeMode_EnumerationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeMode_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexBasicObject_changeMode_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexFile_superiorStandardVersion_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexFile_fileName_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexFile_schemaVersion_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexObject_iD_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexObject_name_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_CalculateableElementReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntry_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRoot_mixed_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceType_alias_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceType_path_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClass_refBaseClassPath_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceIDMapping_roleInterfaceID_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceIDMapping_systemUnitInterfaceID_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalElement_refBaseSystemUnitPath_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLink_refPartnerSideA_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLink_refPartnerSideB_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nominalScaledType_requiredValue_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaledType_requiredMaxValue_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaledType_requiredValue_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaledType_requiredMinValue_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSemantic_correspondingAttributePath_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClass_refBaseClassPath_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_AttributeEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_CalculateableElementReferenceArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTime_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_lastWritingDateTime_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originID_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originName_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originProjectID_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originProjectTitle_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originRelease_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originVendor_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originVendorURL_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_originVersion_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedRoleClass_refRoleClassPath_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClass_refBaseClassPath_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownType_requirements_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyright_value_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyright_changeMode_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass description_value_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass description_changeMode_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revision_revisionDate_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revision_oldVersion_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revision_newVersion_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revision_authorName_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revision_comment_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass version_value_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass version_changeMode_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_name_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_value_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElement_elementFeatureMap_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElement_attributeFeatureMap_AttrEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSemantic_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueRequirement_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaledType_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nominalScaledType_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownType_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass description_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass version_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revision_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyright_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalInformation_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformation_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceType_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceHierarchy_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassLib_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClassLib_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClassLib_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeLib_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexFile_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClass_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalElement_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalInterface_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequirements_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClass_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeNameMapping_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceIDMapping_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClass_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapping_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedRoleClass_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLink_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElement_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAttribute_OrGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass length_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charAt_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contains_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substring_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concat_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endsWith_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsIgnoreCase_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexOfString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEmpty_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseBoolean_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareTo_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_Number_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_Object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Integer_Object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integer_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Number_to_Integer_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Long_greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Long_greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Long_smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Long_smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Long_Object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Long_Object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass long_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Number_to_Long_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_Object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Double_Object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass double_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Number_to_Double_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_CalculateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_CalculateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_OperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_FunctionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_CalculateableParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_FunctionalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_PrimitiveArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_EvaluationOperation_ArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_ExpressionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_And_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_Or_BitOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_Original_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Float_greaterThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Float_greaterEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Float_smallerThan_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Float_smallerEquals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Float_Object_Number_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass number_Float_Object_Number_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass float_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Number_to_Float_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CharSequence_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_CharSequence_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Character_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Character_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass character_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_Character_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Boolean_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass object_Boolean_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolean_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_String_length_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass string_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass count_AggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sum_AggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass min_AggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass max_AggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerParseInt_ClassOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType changeModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charSequenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qmm.QmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QmmPackageImpl() {
		super(eNS_URI, QmmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static QmmPackage init() {
		if (isInited) return (QmmPackage)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI);

		// Obtain or create and register package
		QmmPackageImpl theQmmPackage = (QmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QmmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theQmmPackage.loadPackage();

		// Fix loaded packages
		theQmmPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQmmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return QmmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QmmPackage.eNS_URI, theQmmPackage);
		return theQmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeFamily() {
		if (attributeFamilyEClass == null) {
			attributeFamilyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(1);
		}
		return attributeFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeFamily__Validate__DiagnosticChain_Map() {
        return getAttributeFamily().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeNameMapping() {
		if (attributeNameMappingEClass == null) {
			attributeNameMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(2);
		}
		return attributeNameMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNameMapping_RoleAttribute() {
        return (EReference)getAttributeNameMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNameMapping_SystemUnitAttribute() {
        return (EReference)getAttributeNameMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNameMapping_RoleAttributeName_AttrEClass() {
        return (EReference)getAttributeNameMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNameMapping_SystemUnitAttributeName_AttrEClass() {
        return (EReference)getAttributeNameMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeNameMapping__Validate__DiagnosticChain_Map() {
        return getAttributeNameMapping().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		if (attributeEClass == null) {
			attributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(3);
		}
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_RefSemantic() {
        return (EReference)getAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Constraint() {
        return (EReference)getAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attribute() {
        return (EReference)getAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_DefaultValue_AttrEClass() {
        return (EReference)getAttribute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Value_AttrEClass() {
        return (EReference)getAttribute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AttributeDataType_AttrEClass() {
        return (EReference)getAttribute().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_RefAttributeType_AttrEClass() {
        return (EReference)getAttribute().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Unit_AttrEClass() {
        return (EReference)getAttribute().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttribute__Validate__DiagnosticChain_Map() {
        return getAttribute().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeLib() {
		if (attributeLibEClass == null) {
			attributeLibEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(4);
		}
		return attributeLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeLib_AttributeType() {
        return (EReference)getAttributeLib().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeLib__Validate__DiagnosticChain_Map() {
        return getAttributeLib().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueRequirement() {
		if (attributeValueRequirementEClass == null) {
			attributeValueRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(5);
		}
		return attributeValueRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_OrdinalScaledType() {
        return (EReference)getAttributeValueRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_NominalScaledType() {
        return (EReference)getAttributeValueRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_UnknownType() {
        return (EReference)getAttributeValueRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_Name_AttrEClass() {
        return (EReference)getAttributeValueRequirement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeValueRequirement__Validate__DiagnosticChain_Map() {
        return getAttributeValueRequirement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXBasicObject() {
		if (caexBasicObjectEClass == null) {
			caexBasicObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(6);
		}
		return caexBasicObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Description() {
        return (EReference)getCAEXBasicObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Version() {
        return (EReference)getCAEXBasicObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Revision() {
        return (EReference)getCAEXBasicObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Copyright() {
        return (EReference)getCAEXBasicObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_AdditionalInformation() {
        return (EReference)getCAEXBasicObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_ChangeMode_AttrEClass() {
        return (EReference)getCAEXBasicObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCAEXBasicObject__Validate__DiagnosticChain_Map() {
        return getCAEXBasicObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXFile() {
		if (caexFileEClass == null) {
			caexFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(7);
		}
		return caexFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_SourceDocumentInformation() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_ExternalReference() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_InstanceHierarchy() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_InterfaceClassLib() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_RoleClassLib() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_SystemUnitClassLib() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_AttributeTypeLib() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_SuperiorStandardVersion_AttrEClass() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_FileName_AttrEClass() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_SchemaVersion_AttrEClass() {
        return (EReference)getCAEXFile().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCAEXFile__Validate__DiagnosticChain_Map() {
        return getCAEXFile().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXObject() {
		if (caexObjectEClass == null) {
			caexObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(8);
		}
		return caexObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXObject_ID_AttrEClass() {
        return (EReference)getCAEXObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXObject_Name_AttrEClass() {
        return (EReference)getCAEXObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCAEXObject__Validate__DiagnosticChain_Map() {
        return getCAEXObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(11);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CAEXFile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mixed_AttrEClass() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocumentRoot__Validate__DiagnosticChain_Map() {
        return getDocumentRoot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalInterface() {
		if (externalInterfaceEClass == null) {
			externalInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(12);
		}
		return externalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalInterface_ExternalInterface() {
        return (EReference)getExternalInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalInterface__Validate__DiagnosticChain_Map() {
        return getExternalInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReferenceType() {
		if (externalReferenceTypeEClass == null) {
			externalReferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(13);
		}
		return externalReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalReferenceType_Alias_AttrEClass() {
        return (EReference)getExternalReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalReferenceType_Path_AttrEClass() {
        return (EReference)getExternalReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExternalReferenceType__Validate__DiagnosticChain_Map() {
        return getExternalReferenceType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceHierarchy() {
		if (instanceHierarchyEClass == null) {
			instanceHierarchyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(14);
		}
		return instanceHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceHierarchy_InternalElement() {
        return (EReference)getInstanceHierarchy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceHierarchy__Validate__DiagnosticChain_Map() {
        return getInstanceHierarchy().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClassLib() {
		if (interfaceClassLibEClass == null) {
			interfaceClassLibEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(15);
		}
		return interfaceClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClassLib_InterfaceClass() {
        return (EReference)getInterfaceClassLib().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceClassLib__Validate__DiagnosticChain_Map() {
        return getInterfaceClassLib().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClass() {
		if (interfaceClassEClass == null) {
			interfaceClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(16);
		}
		return interfaceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_Attribute() {
        return (EReference)getInterfaceClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_BaseClass() {
        return (EReference)getInterfaceClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_InterfaceClass() {
        return (EReference)getInterfaceClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_RefBaseClassPath_AttrEClass() {
        return (EReference)getInterfaceClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceClass__Validate__DiagnosticChain_Map() {
        return getInterfaceClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceFamily() {
		if (interfaceFamilyEClass == null) {
			interfaceFamilyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(17);
		}
		return interfaceFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceFamily__Validate__DiagnosticChain_Map() {
        return getInterfaceFamily().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceIDMapping() {
		if (interfaceIDMappingEClass == null) {
			interfaceIDMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(18);
		}
		return interfaceIDMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceIDMapping_RoleInterface() {
        return (EReference)getInterfaceIDMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceIDMapping_SystemUnitInterface() {
        return (EReference)getInterfaceIDMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceIDMapping_RoleInterfaceID_AttrEClass() {
        return (EReference)getInterfaceIDMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceIDMapping_SystemUnitInterfaceID_AttrEClass() {
        return (EReference)getInterfaceIDMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterfaceIDMapping__Validate__DiagnosticChain_Map() {
        return getInterfaceIDMapping().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalElement() {
		if (internalElementEClass == null) {
			internalElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(19);
		}
		return internalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalElement_RoleRequirements() {
        return (EReference)getInternalElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalElement_BaseSystemUnit() {
        return (EReference)getInternalElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalElement_RefBaseSystemUnitPath_AttrEClass() {
        return (EReference)getInternalElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalElement__Validate__DiagnosticChain_Map() {
        return getInternalElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLink() {
		if (internalLinkEClass == null) {
			internalLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(20);
		}
		return internalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_PartnerSideA() {
        return (EReference)getInternalLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_PartnerSideB() {
        return (EReference)getInternalLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_RefPartnerSideA_AttrEClass() {
        return (EReference)getInternalLink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_RefPartnerSideB_AttrEClass() {
        return (EReference)getInternalLink().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalLink__Validate__DiagnosticChain_Map() {
        return getInternalLink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		if (mappingEClass == null) {
			mappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(21);
		}
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_AttributeNameMapping() {
        return (EReference)getMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_InterfaceIDMapping() {
        return (EReference)getMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapping__Validate__DiagnosticChain_Map() {
        return getMapping().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNominalScaledType() {
		if (nominalScaledTypeEClass == null) {
			nominalScaledTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(22);
		}
		return nominalScaledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNominalScaledType_RequiredValue_AttrEClass() {
        return (EReference)getNominalScaledType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNominalScaledType__Validate__DiagnosticChain_Map() {
        return getNominalScaledType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalScaledType() {
		if (ordinalScaledTypeEClass == null) {
			ordinalScaledTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(23);
		}
		return ordinalScaledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdinalScaledType_RequiredMaxValue_AttrEClass() {
        return (EReference)getOrdinalScaledType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdinalScaledType_RequiredValue_AttrEClass() {
        return (EReference)getOrdinalScaledType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdinalScaledType_RequiredMinValue_AttrEClass() {
        return (EReference)getOrdinalScaledType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrdinalScaledType__Validate__DiagnosticChain_Map() {
        return getOrdinalScaledType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefSemantic() {
		if (refSemanticEClass == null) {
			refSemanticEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(24);
		}
		return refSemanticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSemantic_CorrespondingAttributePath_AttrEClass() {
        return (EReference)getRefSemantic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefSemantic__Validate__DiagnosticChain_Map() {
        return getRefSemantic().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleClassLib() {
		if (roleClassLibEClass == null) {
			roleClassLibEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(25);
		}
		return roleClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClassLib_RoleClass() {
        return (EReference)getRoleClassLib().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoleClassLib__Validate__DiagnosticChain_Map() {
        return getRoleClassLib().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleClass() {
		if (roleClassEClass == null) {
			roleClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(26);
		}
		return roleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_Attribute() {
        return (EReference)getRoleClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_ExternalInterface() {
        return (EReference)getRoleClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_BaseClass() {
        return (EReference)getRoleClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_RoleClass() {
        return (EReference)getRoleClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_RefBaseClassPath_AttrEClass() {
        return (EReference)getRoleClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoleClass__Validate__DiagnosticChain_Map() {
        return getRoleClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFamily() {
		if (roleFamilyEClass == null) {
			roleFamilyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(27);
		}
		return roleFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoleFamily__Validate__DiagnosticChain_Map() {
        return getRoleFamily().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequirements() {
		if (roleRequirementsEClass == null) {
			roleRequirementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(28);
		}
		return roleRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_Attribute() {
        return (EReference)getRoleRequirements().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_ExternalInterface() {
        return (EReference)getRoleRequirements().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_MappingObject() {
        return (EReference)getRoleRequirements().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_RoleClass() {
        return (EReference)getRoleRequirements().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoleRequirements__Validate__DiagnosticChain_Map() {
        return getRoleRequirements().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation() {
		if (sourceDocumentInformationEClass == null) {
			sourceDocumentInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(29);
		}
		return sourceDocumentInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_LastWritingDateTime_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginID_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginName_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginProjectID_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginProjectTitle_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginRelease_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginVendor_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginVendorURL_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OriginVersion_AttrEClass() {
        return (EReference)getSourceDocumentInformation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSourceDocumentInformation__Validate__DiagnosticChain_Map() {
        return getSourceDocumentInformation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedRoleClass() {
		if (supportedRoleClassEClass == null) {
			supportedRoleClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(30);
		}
		return supportedRoleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedRoleClass_MappingObject() {
        return (EReference)getSupportedRoleClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedRoleClass_RoleClass() {
        return (EReference)getSupportedRoleClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedRoleClass_RefRoleClassPath_AttrEClass() {
        return (EReference)getSupportedRoleClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSupportedRoleClass__Validate__DiagnosticChain_Map() {
        return getSupportedRoleClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitClassLib() {
		if (systemUnitClassLibEClass == null) {
			systemUnitClassLibEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(31);
		}
		return systemUnitClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClassLib_SystemUnitClass() {
        return (EReference)getSystemUnitClassLib().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemUnitClassLib__Validate__DiagnosticChain_Map() {
        return getSystemUnitClassLib().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitClass() {
		if (systemUnitClassEClass == null) {
			systemUnitClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(32);
		}
		return systemUnitClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_Attribute() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_ExternalInterface() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_InternalElement() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_SupportedRoleClass() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_InternalLink() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_BaseClass() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_SystemUnitClass() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_RefBaseClassPath_AttrEClass() {
        return (EReference)getSystemUnitClass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemUnitClass__Validate__DiagnosticChain_Map() {
        return getSystemUnitClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitFamily() {
		if (systemUnitFamilyEClass == null) {
			systemUnitFamilyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(33);
		}
		return systemUnitFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemUnitFamily__Validate__DiagnosticChain_Map() {
        return getSystemUnitFamily().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownType() {
		if (unknownTypeEClass == null) {
			unknownTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(34);
		}
		return unknownTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnknownType_Requirements_AttrEClass() {
        return (EReference)getUnknownType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnknownType__Validate__DiagnosticChain_Map() {
        return getUnknownType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyright() {
		if (copyrightEClass == null) {
			copyrightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(35);
		}
		return copyrightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyright_Value_AttrEClass() {
        return (EReference)getCopyright().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyright_ChangeMode_AttrEClass() {
        return (EReference)getCopyright().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCopyright__Validate__DiagnosticChain_Map() {
        return getCopyright().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		if (descriptionEClass == null) {
			descriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(36);
		}
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescription_Value_AttrEClass() {
        return (EReference)getDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescription_ChangeMode_AttrEClass() {
        return (EReference)getDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescription__Validate__DiagnosticChain_Map() {
        return getDescription().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision() {
		if (revisionEClass == null) {
			revisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(37);
		}
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_RevisionDate_AttrEClass() {
        return (EReference)getRevision().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_OldVersion_AttrEClass() {
        return (EReference)getRevision().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_NewVersion_AttrEClass() {
        return (EReference)getRevision().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_AuthorName_AttrEClass() {
        return (EReference)getRevision().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Comment_AttrEClass() {
        return (EReference)getRevision().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRevision__Validate__DiagnosticChain_Map() {
        return getRevision().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		if (versionEClass == null) {
			versionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(38);
		}
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Value_AttrEClass() {
        return (EReference)getVersion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_ChangeMode_AttrEClass() {
        return (EReference)getVersion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Validate__DiagnosticChain_Map() {
        return getVersion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalInformation() {
		if (additionalInformationEClass == null) {
			additionalInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(39);
		}
		return additionalInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalInformation__Validate__DiagnosticChain_Map() {
        return getAdditionalInformation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		if (elementEClass == null) {
			elementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(40);
		}
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Name_AttrEClass() {
        return (EReference)getElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Value_AttrEClass() {
        return (EReference)getElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__Validate__DiagnosticChain_Map() {
        return getElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElement() {
		if (genericElementEClass == null) {
			genericElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(41);
		}
		return genericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_NestedElements() {
        return (EReference)getGenericElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_Attributes() {
        return (EReference)getGenericElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_ElementFeatureMap_AttrEClass() {
        return (EReference)getGenericElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_AttributeFeatureMap_AttrEClass() {
        return (EReference)getGenericElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenericElement__Validate__DiagnosticChain_Map() {
        return getGenericElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAttribute() {
		if (genericAttributeEClass == null) {
			genericAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(42);
		}
		return genericAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenericAttribute__Validate__DiagnosticChain_Map() {
        return getGenericAttribute().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		if (namedElementEClass == null) {
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(43);
		}
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountable() {
		if (countableEClass == null) {
			countableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(44);
		}
		return countableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatableElement() {
		if (negatableElementEClass == null) {
			negatableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(45);
		}
		return negatableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegatableElement_Negated() {
        return (EAttribute)getNegatableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrGroup() {
		if (orGroupEClass == null) {
			orGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(46);
		}
		return orGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrGroup_Transitive() {
        return (EAttribute)getOrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrGroup__Validate__DiagnosticChain_Map() {
        return getOrGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		if (typedElementEClass == null) {
			typedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(47);
		}
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypedElement__GetType() {
        return getTypedElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootClass() {
		if (rootClassEClass == null) {
			rootClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(48);
		}
		return rootClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootClass_EvaluationOperator() {
        return (EReference)getRootClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRootClass__ValidateCheckExpression__Object() {
        return getRootClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRootClass__ValidateAllCheckExpressions__Object() {
        return getRootClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		if (queryEClass == null) {
			queryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(49);
		}
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindQuery() {
		if (findQueryEClass == null) {
			findQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(50);
		}
		return findQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindQuery_Where() {
        return (EReference)getFindQuery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateable() {
		if (calculateableEClass == null) {
			calculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(51);
		}
		return calculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateableElement() {
		if (calculateableElementEClass == null) {
			calculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(52);
		}
		return calculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeEClass() {
		if (attributeEClassEClass == null) {
			attributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(53);
		}
		return attributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularAttributeEClass() {
		if (regularAttributeEClassEClass == null) {
			regularAttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(54);
		}
		return regularAttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegularAttributeEClass__ValidateCheckExpression__Object() {
        return getRegularAttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationAttributeEClass() {
		if (enumerationAttributeEClassEClass == null) {
			enumerationAttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(55);
		}
		return enumerationAttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(56);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalType() {
		if (functionalTypeEClass == null) {
			functionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(57);
		}
		return functionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		if (argumentEClass == null) {
			argumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(58);
		}
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceArgument() {
		if (referenceArgumentEClass == null) {
			referenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(59);
		}
		return referenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountable_ReferenceArgument() {
		if (countable_ReferenceArgumentEClass == null) {
			countable_ReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(60);
		}
		return countable_ReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountable_ReferenceArgument_Reference() {
        return (EReference)getCountable_ReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountable_ReferenceArgument__Validate__DiagnosticChain_Map() {
        return getCountable_ReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateable_Argument() {
		if (calculateable_ArgumentEClass == null) {
			calculateable_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(61);
		}
		return calculateable_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateableElement_ReferenceArgument() {
		if (calculateableElement_ReferenceArgumentEClass == null) {
			calculateableElement_ReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(62);
		}
		return calculateableElement_ReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalArgument() {
		if (functionalArgumentEClass == null) {
			functionalArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(63);
		}
		return functionalArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationOperation_Argument() {
		if (evaluationOperation_ArgumentEClass == null) {
			evaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(64);
		}
		return evaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveArgument() {
		if (primitiveArgumentEClass == null) {
			primitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(65);
		}
		return primitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		if (parameterEClass == null) {
			parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(66);
		}
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountableReferenceParameter() {
		if (countableReferenceParameterEClass == null) {
			countableReferenceParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(67);
		}
		return countableReferenceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountableReferenceParameter_Argument() {
        return (EReference)getCountableReferenceParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateableParameter() {
		if (calculateableParameterEClass == null) {
			calculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(68);
		}
		return calculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculateableParameter_Argument() {
        return (EReference)getCalculateableParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalParameter() {
		if (functionalParameterEClass == null) {
			functionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(69);
		}
		return functionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalParameter_Argument() {
        return (EReference)getFunctionalParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Calculateable() {
		if (integer_CalculateableEClass == null) {
			integer_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(70);
		}
		return integer_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_CalculateableElement() {
		if (integer_CalculateableElementEClass == null) {
			integer_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(71);
		}
		return integer_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		if (operatorEClass == null) {
			operatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(72);
		}
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionOperator() {
		if (expressionOperatorEClass == null) {
			expressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(73);
		}
		return expressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationOperator() {
		if (enumerationOperatorEClass == null) {
			enumerationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(74);
		}
		return enumerationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitOperator() {
		if (bitOperatorEClass == null) {
			bitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(75);
		}
		return bitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalOperator() {
		if (functionalOperatorEClass == null) {
			functionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(76);
		}
		return functionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionalOperator__GetLastOperator() {
        return getFunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOperator() {
		if (classOperatorEClass == null) {
			classOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(77);
		}
		return classOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationOperator() {
		if (evaluationOperatorEClass == null) {
			evaluationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(78);
		}
		return evaluationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationFunctionalOperator() {
		if (evaluationFunctionalOperatorEClass == null) {
			evaluationFunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(79);
		}
		return evaluationFunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationOperator() {
		if (aggregationOperatorEClass == null) {
			aggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(80);
		}
		return aggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationBitOperator() {
		if (evaluationBitOperatorEClass == null) {
			evaluationBitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(81);
		}
		return evaluationBitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationBitOperator_Connects() {
        return (EReference)getEvaluationBitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd_EvaluationBitOperator() {
		if (and_EvaluationBitOperatorEClass == null) {
			and_EvaluationBitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(82);
		}
		return and_EvaluationBitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnd_EvaluationBitOperator__GetLiteral() {
        return getAnd_EvaluationBitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr_EvaluationBitOperator() {
		if (or_EvaluationBitOperatorEClass == null) {
			or_EvaluationBitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(83);
		}
		return or_EvaluationBitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOr_EvaluationBitOperator__GetLiteral() {
        return getOr_EvaluationBitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountingAggregationOperator() {
		if (countingAggregationOperatorEClass == null) {
			countingAggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(84);
		}
		return countingAggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountingAggregationOperator_Countable() {
        return (EReference)getCountingAggregationOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountingAggregationOperator__GetAllParameters() {
        return getCountingAggregationOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatingAggregationOperator() {
		if (calculatingAggregationOperatorEClass == null) {
			calculatingAggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(85);
		}
		return calculatingAggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Calculateable() {
		if (string_CalculateableEClass == null) {
			string_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(86);
		}
		return string_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_CalculateableElement() {
		if (string_CalculateableElementEClass == null) {
			string_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(87);
		}
		return string_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_AttributeEClass() {
		if (string_AttributeEClassEClass == null) {
			string_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(88);
		}
		return string_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_AttributeEClass_Operator() {
        return (EReference)getString_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_AttributeEClass__Validate__DiagnosticChain_Map() {
        return getString_AttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Operator() {
		if (string_OperatorEClass == null) {
			string_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(89);
		}
		return string_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Type() {
		if (string_TypeEClass == null) {
			string_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(90);
		}
		return string_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_FunctionalType() {
		if (string_FunctionalTypeEClass == null) {
			string_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(91);
		}
		return string_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_FunctionalType_Operator() {
        return (EReference)getString_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_CalculateableParameter() {
		if (string_CalculateableParameterEClass == null) {
			string_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(92);
		}
		return string_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getString_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_FunctionalParameter() {
		if (string_FunctionalParameterEClass == null) {
			string_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(93);
		}
		return string_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getString_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Argument() {
		if (string_ArgumentEClass == null) {
			string_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(94);
		}
		return string_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_PrimitiveArgument() {
		if (string_PrimitiveArgumentEClass == null) {
			string_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(95);
		}
		return string_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_PrimitiveArgument_Value() {
        return (EAttribute)getString_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_EvaluationOperation_Argument() {
		if (string_EvaluationOperation_ArgumentEClass == null) {
			string_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(96);
		}
		return string_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_CalculateableElementReferenceArgument() {
		if (string_CalculateableElementReferenceArgumentEClass == null) {
			string_CalculateableElementReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(97);
		}
		return string_CalculateableElementReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_CalculateableElementReferenceArgument_Reference() {
        return (EReference)getString_CalculateableElementReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map() {
        return getString_CalculateableElementReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_ExpressionOperator() {
		if (string_ExpressionOperatorEClass == null) {
			string_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(98);
		}
		return string_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_BitOperator() {
		if (string_BitOperatorEClass == null) {
			string_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(99);
		}
		return string_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getString_BitOperator_Connects() {
        return (EReference)getString_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_And_BitOperator() {
		if (string_And_BitOperatorEClass == null) {
			string_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(100);
		}
		return string_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_And_BitOperator__GetLiteral() {
        return getString_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Or_BitOperator() {
		if (string_Or_BitOperatorEClass == null) {
			string_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(101);
		}
		return string_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getString_Or_BitOperator__GetLiteral() {
        return getString_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_Original_FunctionalOperator() {
		if (string_Original_FunctionalOperatorEClass == null) {
			string_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(102);
		}
		return string_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeNameMapping_roleAttributeName_AttrEClass() {
		if (attributeNameMapping_roleAttributeName_AttrEClassEClass == null) {
			attributeNameMapping_roleAttributeName_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(103);
		}
		return attributeNameMapping_roleAttributeName_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeNameMapping_systemUnitAttributeName_AttrEClass() {
		if (attributeNameMapping_systemUnitAttributeName_AttrEClassEClass == null) {
			attributeNameMapping_systemUnitAttributeName_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(104);
		}
		return attributeNameMapping_systemUnitAttributeName_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_defaultValue_AttrEClass() {
		if (attribute_defaultValue_AttrEClassEClass == null) {
			attribute_defaultValue_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(105);
		}
		return attribute_defaultValue_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_value_AttrEClass() {
		if (attribute_value_AttrEClassEClass == null) {
			attribute_value_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(106);
		}
		return attribute_value_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_Calculateable() {
		if (attributeDataType_CalculateableEClass == null) {
			attributeDataType_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(107);
		}
		return attributeDataType_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_CalculateableElement() {
		if (attributeDataType_CalculateableElementEClass == null) {
			attributeDataType_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(108);
		}
		return attributeDataType_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_AttributeEClass() {
		if (attributeDataType_AttributeEClassEClass == null) {
			attributeDataType_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(109);
		}
		return attributeDataType_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDataType_AttributeEClass_Operator() {
        return (EReference)getAttributeDataType_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeDataType_AttributeEClass__Validate__DiagnosticChain_Map() {
        return getAttributeDataType_AttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_Operator() {
		if (attributeDataType_OperatorEClass == null) {
			attributeDataType_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(110);
		}
		return attributeDataType_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_Type() {
		if (attributeDataType_TypeEClass == null) {
			attributeDataType_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(111);
		}
		return attributeDataType_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_FunctionalType() {
		if (attributeDataType_FunctionalTypeEClass == null) {
			attributeDataType_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(112);
		}
		return attributeDataType_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDataType_FunctionalType_Operator() {
        return (EReference)getAttributeDataType_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_CalculateableParameter() {
		if (attributeDataType_CalculateableParameterEClass == null) {
			attributeDataType_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(113);
		}
		return attributeDataType_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeDataType_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getAttributeDataType_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_FunctionalParameter() {
		if (attributeDataType_FunctionalParameterEClass == null) {
			attributeDataType_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(114);
		}
		return attributeDataType_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeDataType_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getAttributeDataType_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_Argument() {
		if (attributeDataType_ArgumentEClass == null) {
			attributeDataType_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(115);
		}
		return attributeDataType_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_PrimitiveArgument() {
		if (attributeDataType_PrimitiveArgumentEClass == null) {
			attributeDataType_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(116);
		}
		return attributeDataType_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDataType_PrimitiveArgument_Value() {
        return (EAttribute)getAttributeDataType_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_EvaluationOperation_Argument() {
		if (attributeDataType_EvaluationOperation_ArgumentEClass == null) {
			attributeDataType_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(117);
		}
		return attributeDataType_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_CalculateableElementReferenceArgument() {
		if (attributeDataType_CalculateableElementReferenceArgumentEClass == null) {
			attributeDataType_CalculateableElementReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(118);
		}
		return attributeDataType_CalculateableElementReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDataType_CalculateableElementReferenceArgument_Reference() {
        return (EReference)getAttributeDataType_CalculateableElementReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeDataType_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map() {
        return getAttributeDataType_CalculateableElementReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_ExpressionOperator() {
		if (attributeDataType_ExpressionOperatorEClass == null) {
			attributeDataType_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(119);
		}
		return attributeDataType_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_BitOperator() {
		if (attributeDataType_BitOperatorEClass == null) {
			attributeDataType_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(120);
		}
		return attributeDataType_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDataType_BitOperator_Connects() {
        return (EReference)getAttributeDataType_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_And_BitOperator() {
		if (attributeDataType_And_BitOperatorEClass == null) {
			attributeDataType_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(121);
		}
		return attributeDataType_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeDataType_And_BitOperator__GetLiteral() {
        return getAttributeDataType_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_Or_BitOperator() {
		if (attributeDataType_Or_BitOperatorEClass == null) {
			attributeDataType_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(122);
		}
		return attributeDataType_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeDataType_Or_BitOperator__GetLiteral() {
        return getAttributeDataType_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDataType_FunctionalOperator() {
		if (attributeDataType_FunctionalOperatorEClass == null) {
			attributeDataType_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(123);
		}
		return attributeDataType_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_attributeDataType_AttrEClass() {
		if (attribute_attributeDataType_AttrEClassEClass == null) {
			attribute_attributeDataType_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(124);
		}
		return attribute_attributeDataType_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_refAttributeType_AttrEClass() {
		if (attribute_refAttributeType_AttrEClassEClass == null) {
			attribute_refAttributeType_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(125);
		}
		return attribute_refAttributeType_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_unit_AttrEClass() {
		if (attribute_unit_AttrEClassEClass == null) {
			attribute_unit_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(126);
		}
		return attribute_unit_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueRequirement_name_AttrEClass() {
		if (attributeValueRequirement_name_AttrEClassEClass == null) {
			attributeValueRequirement_name_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(127);
		}
		return attributeValueRequirement_name_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeMode_Calculateable() {
		if (changeMode_CalculateableEClass == null) {
			changeMode_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(128);
		}
		return changeMode_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeMode_CalculateableElement() {
		if (changeMode_CalculateableElementEClass == null) {
			changeMode_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(129);
		}
		return changeMode_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeMode_Operator() {
		if (changeMode_OperatorEClass == null) {
			changeMode_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(130);
		}
		return changeMode_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeMode_EnumerationOperator() {
		if (changeMode_EnumerationOperatorEClass == null) {
			changeMode_EnumerationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(131);
		}
		return changeMode_EnumerationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeMode_EnumerationOperator_Argument() {
        return (EAttribute)getChangeMode_EnumerationOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeMode_EnumerationOperator_Or() {
        return (EReference)getChangeMode_EnumerationOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeMode_AttributeEClass() {
		if (changeMode_AttributeEClassEClass == null) {
			changeMode_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(132);
		}
		return changeMode_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeMode_AttributeEClass_Operator() {
        return (EReference)getChangeMode_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXBasicObject_changeMode_AttrEClass() {
		if (caexBasicObject_changeMode_AttrEClassEClass == null) {
			caexBasicObject_changeMode_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(133);
		}
		return caexBasicObject_changeMode_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXFile_superiorStandardVersion_AttrEClass() {
		if (caexFile_superiorStandardVersion_AttrEClassEClass == null) {
			caexFile_superiorStandardVersion_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(134);
		}
		return caexFile_superiorStandardVersion_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXFile_fileName_AttrEClass() {
		if (caexFile_fileName_AttrEClassEClass == null) {
			caexFile_fileName_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(135);
		}
		return caexFile_fileName_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXFile_schemaVersion_AttrEClass() {
		if (caexFile_schemaVersion_AttrEClassEClass == null) {
			caexFile_schemaVersion_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(136);
		}
		return caexFile_schemaVersion_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXObject_iD_AttrEClass() {
		if (caexObject_iD_AttrEClassEClass == null) {
			caexObject_iD_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(137);
		}
		return caexObject_iD_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXObject_name_AttrEClass() {
		if (caexObject_name_AttrEClassEClass == null) {
			caexObject_name_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(138);
		}
		return caexObject_name_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_Calculateable() {
		if (eFeatureMapEntry_CalculateableEClass == null) {
			eFeatureMapEntry_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(139);
		}
		return eFeatureMapEntry_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_CalculateableElement() {
		if (eFeatureMapEntry_CalculateableElementEClass == null) {
			eFeatureMapEntry_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(140);
		}
		return eFeatureMapEntry_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_AttributeEClass() {
		if (eFeatureMapEntry_AttributeEClassEClass == null) {
			eFeatureMapEntry_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(141);
		}
		return eFeatureMapEntry_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapEntry_AttributeEClass_Operator() {
        return (EReference)getEFeatureMapEntry_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFeatureMapEntry_AttributeEClass__Validate__DiagnosticChain_Map() {
        return getEFeatureMapEntry_AttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_Operator() {
		if (eFeatureMapEntry_OperatorEClass == null) {
			eFeatureMapEntry_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(142);
		}
		return eFeatureMapEntry_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_Type() {
		if (eFeatureMapEntry_TypeEClass == null) {
			eFeatureMapEntry_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(143);
		}
		return eFeatureMapEntry_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_FunctionalType() {
		if (eFeatureMapEntry_FunctionalTypeEClass == null) {
			eFeatureMapEntry_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(144);
		}
		return eFeatureMapEntry_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapEntry_FunctionalType_Operator() {
        return (EReference)getEFeatureMapEntry_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_CalculateableParameter() {
		if (eFeatureMapEntry_CalculateableParameterEClass == null) {
			eFeatureMapEntry_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(145);
		}
		return eFeatureMapEntry_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFeatureMapEntry_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getEFeatureMapEntry_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_FunctionalParameter() {
		if (eFeatureMapEntry_FunctionalParameterEClass == null) {
			eFeatureMapEntry_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(146);
		}
		return eFeatureMapEntry_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFeatureMapEntry_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getEFeatureMapEntry_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_Argument() {
		if (eFeatureMapEntry_ArgumentEClass == null) {
			eFeatureMapEntry_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(147);
		}
		return eFeatureMapEntry_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_PrimitiveArgument() {
		if (eFeatureMapEntry_PrimitiveArgumentEClass == null) {
			eFeatureMapEntry_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(148);
		}
		return eFeatureMapEntry_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFeatureMapEntry_PrimitiveArgument_Value() {
        return (EAttribute)getEFeatureMapEntry_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_EvaluationOperation_Argument() {
		if (eFeatureMapEntry_EvaluationOperation_ArgumentEClass == null) {
			eFeatureMapEntry_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(149);
		}
		return eFeatureMapEntry_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_CalculateableElementReferenceArgument() {
		if (eFeatureMapEntry_CalculateableElementReferenceArgumentEClass == null) {
			eFeatureMapEntry_CalculateableElementReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(150);
		}
		return eFeatureMapEntry_CalculateableElementReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapEntry_CalculateableElementReferenceArgument_Reference() {
        return (EReference)getEFeatureMapEntry_CalculateableElementReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFeatureMapEntry_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map() {
        return getEFeatureMapEntry_CalculateableElementReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_ExpressionOperator() {
		if (eFeatureMapEntry_ExpressionOperatorEClass == null) {
			eFeatureMapEntry_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(151);
		}
		return eFeatureMapEntry_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_BitOperator() {
		if (eFeatureMapEntry_BitOperatorEClass == null) {
			eFeatureMapEntry_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(152);
		}
		return eFeatureMapEntry_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapEntry_BitOperator_Connects() {
        return (EReference)getEFeatureMapEntry_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_And_BitOperator() {
		if (eFeatureMapEntry_And_BitOperatorEClass == null) {
			eFeatureMapEntry_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(153);
		}
		return eFeatureMapEntry_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFeatureMapEntry_And_BitOperator__GetLiteral() {
        return getEFeatureMapEntry_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_Or_BitOperator() {
		if (eFeatureMapEntry_Or_BitOperatorEClass == null) {
			eFeatureMapEntry_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(154);
		}
		return eFeatureMapEntry_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFeatureMapEntry_Or_BitOperator__GetLiteral() {
        return getEFeatureMapEntry_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry_FunctionalOperator() {
		if (eFeatureMapEntry_FunctionalOperatorEClass == null) {
			eFeatureMapEntry_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(155);
		}
		return eFeatureMapEntry_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot_mixed_AttrEClass() {
		if (documentRoot_mixed_AttrEClassEClass == null) {
			documentRoot_mixed_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(156);
		}
		return documentRoot_mixed_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReferenceType_alias_AttrEClass() {
		if (externalReferenceType_alias_AttrEClassEClass == null) {
			externalReferenceType_alias_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(157);
		}
		return externalReferenceType_alias_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReferenceType_path_AttrEClass() {
		if (externalReferenceType_path_AttrEClassEClass == null) {
			externalReferenceType_path_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(158);
		}
		return externalReferenceType_path_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClass_refBaseClassPath_AttrEClass() {
		if (interfaceClass_refBaseClassPath_AttrEClassEClass == null) {
			interfaceClass_refBaseClassPath_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(159);
		}
		return interfaceClass_refBaseClassPath_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceIDMapping_roleInterfaceID_AttrEClass() {
		if (interfaceIDMapping_roleInterfaceID_AttrEClassEClass == null) {
			interfaceIDMapping_roleInterfaceID_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(160);
		}
		return interfaceIDMapping_roleInterfaceID_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceIDMapping_systemUnitInterfaceID_AttrEClass() {
		if (interfaceIDMapping_systemUnitInterfaceID_AttrEClassEClass == null) {
			interfaceIDMapping_systemUnitInterfaceID_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(161);
		}
		return interfaceIDMapping_systemUnitInterfaceID_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalElement_refBaseSystemUnitPath_AttrEClass() {
		if (internalElement_refBaseSystemUnitPath_AttrEClassEClass == null) {
			internalElement_refBaseSystemUnitPath_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(162);
		}
		return internalElement_refBaseSystemUnitPath_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLink_refPartnerSideA_AttrEClass() {
		if (internalLink_refPartnerSideA_AttrEClassEClass == null) {
			internalLink_refPartnerSideA_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(163);
		}
		return internalLink_refPartnerSideA_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLink_refPartnerSideB_AttrEClass() {
		if (internalLink_refPartnerSideB_AttrEClassEClass == null) {
			internalLink_refPartnerSideB_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(164);
		}
		return internalLink_refPartnerSideB_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNominalScaledType_requiredValue_AttrEClass() {
		if (nominalScaledType_requiredValue_AttrEClassEClass == null) {
			nominalScaledType_requiredValue_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(165);
		}
		return nominalScaledType_requiredValue_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalScaledType_requiredMaxValue_AttrEClass() {
		if (ordinalScaledType_requiredMaxValue_AttrEClassEClass == null) {
			ordinalScaledType_requiredMaxValue_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(166);
		}
		return ordinalScaledType_requiredMaxValue_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalScaledType_requiredValue_AttrEClass() {
		if (ordinalScaledType_requiredValue_AttrEClassEClass == null) {
			ordinalScaledType_requiredValue_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(167);
		}
		return ordinalScaledType_requiredValue_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalScaledType_requiredMinValue_AttrEClass() {
		if (ordinalScaledType_requiredMinValue_AttrEClassEClass == null) {
			ordinalScaledType_requiredMinValue_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(168);
		}
		return ordinalScaledType_requiredMinValue_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefSemantic_correspondingAttributePath_AttrEClass() {
		if (refSemantic_correspondingAttributePath_AttrEClassEClass == null) {
			refSemantic_correspondingAttributePath_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(169);
		}
		return refSemantic_correspondingAttributePath_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleClass_refBaseClassPath_AttrEClass() {
		if (roleClass_refBaseClassPath_AttrEClassEClass == null) {
			roleClass_refBaseClassPath_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(170);
		}
		return roleClass_refBaseClassPath_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_Calculateable() {
		if (dateTime_CalculateableEClass == null) {
			dateTime_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(171);
		}
		return dateTime_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_CalculateableElement() {
		if (dateTime_CalculateableElementEClass == null) {
			dateTime_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(172);
		}
		return dateTime_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_AttributeEClass() {
		if (dateTime_AttributeEClassEClass == null) {
			dateTime_AttributeEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(173);
		}
		return dateTime_AttributeEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_AttributeEClass_Operator() {
        return (EReference)getDateTime_AttributeEClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateTime_AttributeEClass__Validate__DiagnosticChain_Map() {
        return getDateTime_AttributeEClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_Operator() {
		if (dateTime_OperatorEClass == null) {
			dateTime_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(174);
		}
		return dateTime_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_Type() {
		if (dateTime_TypeEClass == null) {
			dateTime_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(175);
		}
		return dateTime_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_FunctionalType() {
		if (dateTime_FunctionalTypeEClass == null) {
			dateTime_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(176);
		}
		return dateTime_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_FunctionalType_Operator() {
        return (EReference)getDateTime_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_CalculateableParameter() {
		if (dateTime_CalculateableParameterEClass == null) {
			dateTime_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(177);
		}
		return dateTime_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateTime_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getDateTime_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_FunctionalParameter() {
		if (dateTime_FunctionalParameterEClass == null) {
			dateTime_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(178);
		}
		return dateTime_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateTime_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getDateTime_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_Argument() {
		if (dateTime_ArgumentEClass == null) {
			dateTime_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(179);
		}
		return dateTime_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_PrimitiveArgument() {
		if (dateTime_PrimitiveArgumentEClass == null) {
			dateTime_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(180);
		}
		return dateTime_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_PrimitiveArgument_Value() {
        return (EAttribute)getDateTime_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_EvaluationOperation_Argument() {
		if (dateTime_EvaluationOperation_ArgumentEClass == null) {
			dateTime_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(181);
		}
		return dateTime_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_CalculateableElementReferenceArgument() {
		if (dateTime_CalculateableElementReferenceArgumentEClass == null) {
			dateTime_CalculateableElementReferenceArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(182);
		}
		return dateTime_CalculateableElementReferenceArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_CalculateableElementReferenceArgument_Reference() {
        return (EReference)getDateTime_CalculateableElementReferenceArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateTime_CalculateableElementReferenceArgument__Validate__DiagnosticChain_Map() {
        return getDateTime_CalculateableElementReferenceArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_ExpressionOperator() {
		if (dateTime_ExpressionOperatorEClass == null) {
			dateTime_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(183);
		}
		return dateTime_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_BitOperator() {
		if (dateTime_BitOperatorEClass == null) {
			dateTime_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(184);
		}
		return dateTime_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_BitOperator_Connects() {
        return (EReference)getDateTime_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_And_BitOperator() {
		if (dateTime_And_BitOperatorEClass == null) {
			dateTime_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(185);
		}
		return dateTime_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateTime_And_BitOperator__GetLiteral() {
        return getDateTime_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_Or_BitOperator() {
		if (dateTime_Or_BitOperatorEClass == null) {
			dateTime_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(186);
		}
		return dateTime_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateTime_Or_BitOperator__GetLiteral() {
        return getDateTime_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime_FunctionalOperator() {
		if (dateTime_FunctionalOperatorEClass == null) {
			dateTime_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(187);
		}
		return dateTime_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_lastWritingDateTime_AttrEClass() {
		if (sourceDocumentInformation_lastWritingDateTime_AttrEClassEClass == null) {
			sourceDocumentInformation_lastWritingDateTime_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(188);
		}
		return sourceDocumentInformation_lastWritingDateTime_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originID_AttrEClass() {
		if (sourceDocumentInformation_originID_AttrEClassEClass == null) {
			sourceDocumentInformation_originID_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(189);
		}
		return sourceDocumentInformation_originID_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originName_AttrEClass() {
		if (sourceDocumentInformation_originName_AttrEClassEClass == null) {
			sourceDocumentInformation_originName_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(190);
		}
		return sourceDocumentInformation_originName_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originProjectID_AttrEClass() {
		if (sourceDocumentInformation_originProjectID_AttrEClassEClass == null) {
			sourceDocumentInformation_originProjectID_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(191);
		}
		return sourceDocumentInformation_originProjectID_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originProjectTitle_AttrEClass() {
		if (sourceDocumentInformation_originProjectTitle_AttrEClassEClass == null) {
			sourceDocumentInformation_originProjectTitle_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(192);
		}
		return sourceDocumentInformation_originProjectTitle_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originRelease_AttrEClass() {
		if (sourceDocumentInformation_originRelease_AttrEClassEClass == null) {
			sourceDocumentInformation_originRelease_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(193);
		}
		return sourceDocumentInformation_originRelease_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originVendor_AttrEClass() {
		if (sourceDocumentInformation_originVendor_AttrEClassEClass == null) {
			sourceDocumentInformation_originVendor_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(194);
		}
		return sourceDocumentInformation_originVendor_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originVendorURL_AttrEClass() {
		if (sourceDocumentInformation_originVendorURL_AttrEClassEClass == null) {
			sourceDocumentInformation_originVendorURL_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(195);
		}
		return sourceDocumentInformation_originVendorURL_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_originVersion_AttrEClass() {
		if (sourceDocumentInformation_originVersion_AttrEClassEClass == null) {
			sourceDocumentInformation_originVersion_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(196);
		}
		return sourceDocumentInformation_originVersion_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedRoleClass_refRoleClassPath_AttrEClass() {
		if (supportedRoleClass_refRoleClassPath_AttrEClassEClass == null) {
			supportedRoleClass_refRoleClassPath_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(197);
		}
		return supportedRoleClass_refRoleClassPath_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitClass_refBaseClassPath_AttrEClass() {
		if (systemUnitClass_refBaseClassPath_AttrEClassEClass == null) {
			systemUnitClass_refBaseClassPath_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(198);
		}
		return systemUnitClass_refBaseClassPath_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownType_requirements_AttrEClass() {
		if (unknownType_requirements_AttrEClassEClass == null) {
			unknownType_requirements_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(199);
		}
		return unknownType_requirements_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyright_value_AttrEClass() {
		if (copyright_value_AttrEClassEClass == null) {
			copyright_value_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(200);
		}
		return copyright_value_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyright_changeMode_AttrEClass() {
		if (copyright_changeMode_AttrEClassEClass == null) {
			copyright_changeMode_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(201);
		}
		return copyright_changeMode_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription_value_AttrEClass() {
		if (description_value_AttrEClassEClass == null) {
			description_value_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(202);
		}
		return description_value_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription_changeMode_AttrEClass() {
		if (description_changeMode_AttrEClassEClass == null) {
			description_changeMode_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(203);
		}
		return description_changeMode_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision_revisionDate_AttrEClass() {
		if (revision_revisionDate_AttrEClassEClass == null) {
			revision_revisionDate_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(204);
		}
		return revision_revisionDate_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision_oldVersion_AttrEClass() {
		if (revision_oldVersion_AttrEClassEClass == null) {
			revision_oldVersion_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(205);
		}
		return revision_oldVersion_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision_newVersion_AttrEClass() {
		if (revision_newVersion_AttrEClassEClass == null) {
			revision_newVersion_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(206);
		}
		return revision_newVersion_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision_authorName_AttrEClass() {
		if (revision_authorName_AttrEClassEClass == null) {
			revision_authorName_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(207);
		}
		return revision_authorName_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision_comment_AttrEClass() {
		if (revision_comment_AttrEClassEClass == null) {
			revision_comment_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(208);
		}
		return revision_comment_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion_value_AttrEClass() {
		if (version_value_AttrEClassEClass == null) {
			version_value_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(209);
		}
		return version_value_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion_changeMode_AttrEClass() {
		if (version_changeMode_AttrEClassEClass == null) {
			version_changeMode_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(210);
		}
		return version_changeMode_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement_name_AttrEClass() {
		if (element_name_AttrEClassEClass == null) {
			element_name_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(211);
		}
		return element_name_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement_value_AttrEClass() {
		if (element_value_AttrEClassEClass == null) {
			element_value_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(212);
		}
		return element_value_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElement_elementFeatureMap_AttrEClass() {
		if (genericElement_elementFeatureMap_AttrEClassEClass == null) {
			genericElement_elementFeatureMap_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(213);
		}
		return genericElement_elementFeatureMap_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElement_attributeFeatureMap_AttrEClass() {
		if (genericElement_attributeFeatureMap_AttrEClassEClass == null) {
			genericElement_attributeFeatureMap_AttrEClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(214);
		}
		return genericElement_attributeFeatureMap_AttrEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_OrGroup() {
		if (attribute_OrGroupEClass == null) {
			attribute_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(215);
		}
		return attribute_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_OrGroup_Containment() {
        return (EReference)getAttribute_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefSemantic_OrGroup() {
		if (refSemantic_OrGroupEClass == null) {
			refSemantic_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(216);
		}
		return refSemantic_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSemantic_OrGroup_Containment() {
        return (EReference)getRefSemantic_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueRequirement_OrGroup() {
		if (attributeValueRequirement_OrGroupEClass == null) {
			attributeValueRequirement_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(217);
		}
		return attributeValueRequirement_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_OrGroup_Containment() {
        return (EReference)getAttributeValueRequirement_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalScaledType_OrGroup() {
		if (ordinalScaledType_OrGroupEClass == null) {
			ordinalScaledType_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(218);
		}
		return ordinalScaledType_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdinalScaledType_OrGroup_Containment() {
        return (EReference)getOrdinalScaledType_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNominalScaledType_OrGroup() {
		if (nominalScaledType_OrGroupEClass == null) {
			nominalScaledType_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(219);
		}
		return nominalScaledType_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNominalScaledType_OrGroup_Containment() {
        return (EReference)getNominalScaledType_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownType_OrGroup() {
		if (unknownType_OrGroupEClass == null) {
			unknownType_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(220);
		}
		return unknownType_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnknownType_OrGroup_Containment() {
        return (EReference)getUnknownType_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription_OrGroup() {
		if (description_OrGroupEClass == null) {
			description_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(221);
		}
		return description_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescription_OrGroup_Containment() {
        return (EReference)getDescription_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion_OrGroup() {
		if (version_OrGroupEClass == null) {
			version_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(222);
		}
		return version_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_OrGroup_Containment() {
        return (EReference)getVersion_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision_OrGroup() {
		if (revision_OrGroupEClass == null) {
			revision_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(223);
		}
		return revision_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_OrGroup_Containment() {
        return (EReference)getRevision_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyright_OrGroup() {
		if (copyright_OrGroupEClass == null) {
			copyright_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(224);
		}
		return copyright_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyright_OrGroup_Containment() {
        return (EReference)getCopyright_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalInformation_OrGroup() {
		if (additionalInformation_OrGroupEClass == null) {
			additionalInformation_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(225);
		}
		return additionalInformation_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalInformation_OrGroup_Containment() {
        return (EReference)getAdditionalInformation_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation_OrGroup() {
		if (sourceDocumentInformation_OrGroupEClass == null) {
			sourceDocumentInformation_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(226);
		}
		return sourceDocumentInformation_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentInformation_OrGroup_Containment() {
        return (EReference)getSourceDocumentInformation_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReferenceType_OrGroup() {
		if (externalReferenceType_OrGroupEClass == null) {
			externalReferenceType_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(227);
		}
		return externalReferenceType_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalReferenceType_OrGroup_Containment() {
        return (EReference)getExternalReferenceType_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceHierarchy_OrGroup() {
		if (instanceHierarchy_OrGroupEClass == null) {
			instanceHierarchy_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(228);
		}
		return instanceHierarchy_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceHierarchy_OrGroup_Containment() {
        return (EReference)getInstanceHierarchy_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClassLib_OrGroup() {
		if (interfaceClassLib_OrGroupEClass == null) {
			interfaceClassLib_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(229);
		}
		return interfaceClassLib_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClassLib_OrGroup_Containment() {
        return (EReference)getInterfaceClassLib_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleClassLib_OrGroup() {
		if (roleClassLib_OrGroupEClass == null) {
			roleClassLib_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(230);
		}
		return roleClassLib_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClassLib_OrGroup_Containment() {
        return (EReference)getRoleClassLib_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitClassLib_OrGroup() {
		if (systemUnitClassLib_OrGroupEClass == null) {
			systemUnitClassLib_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(231);
		}
		return systemUnitClassLib_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClassLib_OrGroup_Containment() {
        return (EReference)getSystemUnitClassLib_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeLib_OrGroup() {
		if (attributeLib_OrGroupEClass == null) {
			attributeLib_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(232);
		}
		return attributeLib_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeLib_OrGroup_Containment() {
        return (EReference)getAttributeLib_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXFile_OrGroup() {
		if (caexFile_OrGroupEClass == null) {
			caexFile_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(233);
		}
		return caexFile_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_OrGroup_Containment() {
        return (EReference)getCAEXFile_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClass_OrGroup() {
		if (interfaceClass_OrGroupEClass == null) {
			interfaceClass_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(234);
		}
		return interfaceClass_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_OrGroup_Containment() {
        return (EReference)getInterfaceClass_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalElement_OrGroup() {
		if (internalElement_OrGroupEClass == null) {
			internalElement_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(235);
		}
		return internalElement_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalElement_OrGroup_Containment() {
        return (EReference)getInternalElement_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalInterface_OrGroup() {
		if (externalInterface_OrGroupEClass == null) {
			externalInterface_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(236);
		}
		return externalInterface_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalInterface_OrGroup_Containment() {
        return (EReference)getExternalInterface_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequirements_OrGroup() {
		if (roleRequirements_OrGroupEClass == null) {
			roleRequirements_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(237);
		}
		return roleRequirements_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_OrGroup_Containment() {
        return (EReference)getRoleRequirements_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitClass_OrGroup() {
		if (systemUnitClass_OrGroupEClass == null) {
			systemUnitClass_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(238);
		}
		return systemUnitClass_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_OrGroup_Containment() {
        return (EReference)getSystemUnitClass_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeNameMapping_OrGroup() {
		if (attributeNameMapping_OrGroupEClass == null) {
			attributeNameMapping_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(239);
		}
		return attributeNameMapping_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNameMapping_OrGroup_Containment() {
        return (EReference)getAttributeNameMapping_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceIDMapping_OrGroup() {
		if (interfaceIDMapping_OrGroupEClass == null) {
			interfaceIDMapping_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(240);
		}
		return interfaceIDMapping_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceIDMapping_OrGroup_Containment() {
        return (EReference)getInterfaceIDMapping_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleClass_OrGroup() {
		if (roleClass_OrGroupEClass == null) {
			roleClass_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(241);
		}
		return roleClass_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_OrGroup_Containment() {
        return (EReference)getRoleClass_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping_OrGroup() {
		if (mapping_OrGroupEClass == null) {
			mapping_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(242);
		}
		return mapping_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_OrGroup_Containment() {
        return (EReference)getMapping_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedRoleClass_OrGroup() {
		if (supportedRoleClass_OrGroupEClass == null) {
			supportedRoleClass_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(243);
		}
		return supportedRoleClass_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedRoleClass_OrGroup_Containment() {
        return (EReference)getSupportedRoleClass_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLink_OrGroup() {
		if (internalLink_OrGroupEClass == null) {
			internalLink_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(244);
		}
		return internalLink_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_OrGroup_Containment() {
        return (EReference)getInternalLink_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElement_OrGroup() {
		if (genericElement_OrGroupEClass == null) {
			genericElement_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(245);
		}
		return genericElement_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_OrGroup_Containment() {
        return (EReference)getGenericElement_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAttribute_OrGroup() {
		if (genericAttribute_OrGroupEClass == null) {
			genericAttribute_OrGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(246);
		}
		return genericAttribute_OrGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericAttribute_OrGroup_Containment() {
        return (EReference)getGenericAttribute_OrGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Operator() {
		if (object_OperatorEClass == null) {
			object_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(247);
		}
		return object_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Type() {
		if (object_TypeEClass == null) {
			object_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(248);
		}
		return object_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_FunctionalType() {
		if (object_FunctionalTypeEClass == null) {
			object_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(249);
		}
		return object_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_FunctionalType_Operator() {
        return (EReference)getObject_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CalculateableParameter() {
		if (object_CalculateableParameterEClass == null) {
			object_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(250);
		}
		return object_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getObject_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_FunctionalParameter() {
		if (object_FunctionalParameterEClass == null) {
			object_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(251);
		}
		return object_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getObject_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Calculateable() {
		if (object_CalculateableEClass == null) {
			object_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(252);
		}
		return object_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CalculateableElement() {
		if (object_CalculateableElementEClass == null) {
			object_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(253);
		}
		return object_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Argument() {
		if (object_ArgumentEClass == null) {
			object_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(255);
		}
		return object_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_PrimitiveArgument() {
		if (object_PrimitiveArgumentEClass == null) {
			object_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(256);
		}
		return object_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_PrimitiveArgument_Value() {
        return (EAttribute)getObject_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_EvaluationOperation_Argument() {
		if (object_EvaluationOperation_ArgumentEClass == null) {
			object_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(257);
		}
		return object_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_ExpressionOperator() {
		if (object_ExpressionOperatorEClass == null) {
			object_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(258);
		}
		return object_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_BitOperator() {
		if (object_BitOperatorEClass == null) {
			object_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(259);
		}
		return object_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_BitOperator_Connects() {
        return (EReference)getObject_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_And_BitOperator() {
		if (object_And_BitOperatorEClass == null) {
			object_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(260);
		}
		return object_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_And_BitOperator__GetLiteral() {
        return getObject_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Or_BitOperator() {
		if (object_Or_BitOperatorEClass == null) {
			object_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(261);
		}
		return object_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Or_BitOperator__GetLiteral() {
        return getObject_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_FunctionalOperator() {
		if (object_FunctionalOperatorEClass == null) {
			object_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(262);
		}
		return object_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Operator() {
		if (boolean_OperatorEClass == null) {
			boolean_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(263);
		}
		return boolean_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Type() {
		if (boolean_TypeEClass == null) {
			boolean_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(264);
		}
		return boolean_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_FunctionalType() {
		if (boolean_FunctionalTypeEClass == null) {
			boolean_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(265);
		}
		return boolean_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolean_FunctionalType_Operator() {
        return (EReference)getBoolean_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_CalculateableParameter() {
		if (boolean_CalculateableParameterEClass == null) {
			boolean_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(266);
		}
		return boolean_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getBoolean_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_FunctionalParameter() {
		if (boolean_FunctionalParameterEClass == null) {
			boolean_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(267);
		}
		return boolean_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getBoolean_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Calculateable() {
		if (boolean_CalculateableEClass == null) {
			boolean_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(268);
		}
		return boolean_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_CalculateableElement() {
		if (boolean_CalculateableElementEClass == null) {
			boolean_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(269);
		}
		return boolean_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Argument() {
		if (boolean_ArgumentEClass == null) {
			boolean_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(271);
		}
		return boolean_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_PrimitiveArgument() {
		if (boolean_PrimitiveArgumentEClass == null) {
			boolean_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(272);
		}
		return boolean_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_PrimitiveArgument_Value() {
        return (EAttribute)getBoolean_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_EvaluationOperation_Argument() {
		if (boolean_EvaluationOperation_ArgumentEClass == null) {
			boolean_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(273);
		}
		return boolean_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_ExpressionOperator() {
		if (boolean_ExpressionOperatorEClass == null) {
			boolean_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(274);
		}
		return boolean_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_BitOperator() {
		if (boolean_BitOperatorEClass == null) {
			boolean_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(275);
		}
		return boolean_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoolean_BitOperator_Connects() {
        return (EReference)getBoolean_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_And_BitOperator() {
		if (boolean_And_BitOperatorEClass == null) {
			boolean_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(276);
		}
		return boolean_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_And_BitOperator__GetLiteral() {
        return getBoolean_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Or_BitOperator() {
		if (boolean_Or_BitOperatorEClass == null) {
			boolean_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(277);
		}
		return boolean_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoolean_Or_BitOperator__GetLiteral() {
        return getBoolean_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_Original_FunctionalOperator() {
		if (boolean_Original_FunctionalOperatorEClass == null) {
			boolean_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(278);
		}
		return boolean_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getequals_FunctionalOperator() {
		if (equals_FunctionalOperatorEClass == null) {
			equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(279);
		}
		return equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getequals_FunctionalOperator_Obj() {
        return (EReference)getequals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequals_FunctionalOperator__GetLiteral() {
        return getequals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequals_FunctionalOperator__GetAllParameters() {
        return getequals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoString_FunctionalOperator() {
		if (toString_FunctionalOperatorEClass == null) {
			toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(280);
		}
		return toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoString_FunctionalOperator__GetLiteral() {
        return gettoString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation gettoString_FunctionalOperator__GetAllParameters() {
        return gettoString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Operator() {
		if (charSequence_OperatorEClass == null) {
			charSequence_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(281);
		}
		return charSequence_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Type() {
		if (charSequence_TypeEClass == null) {
			charSequence_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(282);
		}
		return charSequence_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_FunctionalType() {
		if (charSequence_FunctionalTypeEClass == null) {
			charSequence_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(283);
		}
		return charSequence_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharSequence_FunctionalType_Operator() {
        return (EReference)getCharSequence_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_CalculateableParameter() {
		if (charSequence_CalculateableParameterEClass == null) {
			charSequence_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(284);
		}
		return charSequence_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getCharSequence_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_FunctionalParameter() {
		if (charSequence_FunctionalParameterEClass == null) {
			charSequence_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(285);
		}
		return charSequence_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getCharSequence_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Calculateable() {
		if (charSequence_CalculateableEClass == null) {
			charSequence_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(286);
		}
		return charSequence_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_CalculateableElement() {
		if (charSequence_CalculateableElementEClass == null) {
			charSequence_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(287);
		}
		return charSequence_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Argument() {
		if (charSequence_ArgumentEClass == null) {
			charSequence_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(289);
		}
		return charSequence_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_PrimitiveArgument() {
		if (charSequence_PrimitiveArgumentEClass == null) {
			charSequence_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(290);
		}
		return charSequence_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharSequence_PrimitiveArgument_Value() {
        return (EAttribute)getCharSequence_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_EvaluationOperation_Argument() {
		if (charSequence_EvaluationOperation_ArgumentEClass == null) {
			charSequence_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(291);
		}
		return charSequence_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_ExpressionOperator() {
		if (charSequence_ExpressionOperatorEClass == null) {
			charSequence_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(292);
		}
		return charSequence_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_BitOperator() {
		if (charSequence_BitOperatorEClass == null) {
			charSequence_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(293);
		}
		return charSequence_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharSequence_BitOperator_Connects() {
        return (EReference)getCharSequence_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_And_BitOperator() {
		if (charSequence_And_BitOperatorEClass == null) {
			charSequence_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(294);
		}
		return charSequence_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_And_BitOperator__GetLiteral() {
        return getCharSequence_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Or_BitOperator() {
		if (charSequence_Or_BitOperatorEClass == null) {
			charSequence_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(295);
		}
		return charSequence_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_Or_BitOperator__GetLiteral() {
        return getCharSequence_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_Original_FunctionalOperator() {
		if (charSequence_Original_FunctionalOperatorEClass == null) {
			charSequence_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(296);
		}
		return charSequence_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Operator() {
		if (integer_OperatorEClass == null) {
			integer_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(297);
		}
		return integer_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Type() {
		if (integer_TypeEClass == null) {
			integer_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(298);
		}
		return integer_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_FunctionalType() {
		if (integer_FunctionalTypeEClass == null) {
			integer_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(299);
		}
		return integer_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteger_FunctionalType_Operator() {
        return (EReference)getInteger_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_CalculateableParameter() {
		if (integer_CalculateableParameterEClass == null) {
			integer_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(300);
		}
		return integer_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getInteger_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_FunctionalParameter() {
		if (integer_FunctionalParameterEClass == null) {
			integer_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(301);
		}
		return integer_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getInteger_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Argument() {
		if (integer_ArgumentEClass == null) {
			integer_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(303);
		}
		return integer_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_PrimitiveArgument() {
		if (integer_PrimitiveArgumentEClass == null) {
			integer_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(304);
		}
		return integer_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_PrimitiveArgument_Value() {
        return (EAttribute)getInteger_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_EvaluationOperation_Argument() {
		if (integer_EvaluationOperation_ArgumentEClass == null) {
			integer_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(305);
		}
		return integer_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_ExpressionOperator() {
		if (integer_ExpressionOperatorEClass == null) {
			integer_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(306);
		}
		return integer_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_BitOperator() {
		if (integer_BitOperatorEClass == null) {
			integer_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(307);
		}
		return integer_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteger_BitOperator_Connects() {
        return (EReference)getInteger_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_And_BitOperator() {
		if (integer_And_BitOperatorEClass == null) {
			integer_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(308);
		}
		return integer_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_And_BitOperator__GetLiteral() {
        return getInteger_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Or_BitOperator() {
		if (integer_Or_BitOperatorEClass == null) {
			integer_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(309);
		}
		return integer_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteger_Or_BitOperator__GetLiteral() {
        return getInteger_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_Original_FunctionalOperator() {
		if (integer_Original_FunctionalOperatorEClass == null) {
			integer_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(310);
		}
		return integer_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlength_FunctionalOperator() {
		if (length_FunctionalOperatorEClass == null) {
			length_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(311);
		}
		return length_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getlength_FunctionalOperator__GetLiteral() {
        return getlength_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getlength_FunctionalOperator__GetAllParameters() {
        return getlength_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Operator() {
		if (character_OperatorEClass == null) {
			character_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(312);
		}
		return character_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Type() {
		if (character_TypeEClass == null) {
			character_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(313);
		}
		return character_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_FunctionalType() {
		if (character_FunctionalTypeEClass == null) {
			character_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(314);
		}
		return character_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_FunctionalType_Operator() {
        return (EReference)getCharacter_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_CalculateableParameter() {
		if (character_CalculateableParameterEClass == null) {
			character_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(315);
		}
		return character_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getCharacter_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_FunctionalParameter() {
		if (character_FunctionalParameterEClass == null) {
			character_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(316);
		}
		return character_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getCharacter_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Calculateable() {
		if (character_CalculateableEClass == null) {
			character_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(317);
		}
		return character_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_CalculateableElement() {
		if (character_CalculateableElementEClass == null) {
			character_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(318);
		}
		return character_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Argument() {
		if (character_ArgumentEClass == null) {
			character_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(320);
		}
		return character_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_PrimitiveArgument() {
		if (character_PrimitiveArgumentEClass == null) {
			character_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(321);
		}
		return character_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_PrimitiveArgument_Value() {
        return (EAttribute)getCharacter_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_EvaluationOperation_Argument() {
		if (character_EvaluationOperation_ArgumentEClass == null) {
			character_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(322);
		}
		return character_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_ExpressionOperator() {
		if (character_ExpressionOperatorEClass == null) {
			character_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(323);
		}
		return character_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_BitOperator() {
		if (character_BitOperatorEClass == null) {
			character_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(324);
		}
		return character_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_BitOperator_Connects() {
        return (EReference)getCharacter_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_And_BitOperator() {
		if (character_And_BitOperatorEClass == null) {
			character_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(325);
		}
		return character_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_And_BitOperator__GetLiteral() {
        return getCharacter_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Or_BitOperator() {
		if (character_Or_BitOperatorEClass == null) {
			character_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(326);
		}
		return character_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharacter_Or_BitOperator__GetLiteral() {
        return getCharacter_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_Original_FunctionalOperator() {
		if (character_Original_FunctionalOperatorEClass == null) {
			character_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(327);
		}
		return character_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcharAt_FunctionalOperator() {
		if (charAt_FunctionalOperatorEClass == null) {
			charAt_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(328);
		}
		return charAt_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcharAt_FunctionalOperator_I() {
        return (EReference)getcharAt_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcharAt_FunctionalOperator__GetLiteral() {
        return getcharAt_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcharAt_FunctionalOperator__GetAllParameters() {
        return getcharAt_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcontains_FunctionalOperator() {
		if (contains_FunctionalOperatorEClass == null) {
			contains_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(329);
		}
		return contains_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcontains_FunctionalOperator_CharSequence() {
        return (EReference)getcontains_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcontains_FunctionalOperator__GetLiteral() {
        return getcontains_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcontains_FunctionalOperator__GetAllParameters() {
        return getcontains_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsubstring_FunctionalOperator() {
		if (substring_FunctionalOperatorEClass == null) {
			substring_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(330);
		}
		return substring_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubstring_FunctionalOperator_StartIndex() {
        return (EReference)getsubstring_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubstring_FunctionalOperator_EndIndex() {
        return (EReference)getsubstring_FunctionalOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsubstring_FunctionalOperator__GetLiteral() {
        return getsubstring_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsubstring_FunctionalOperator__GetAllParameters() {
        return getsubstring_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getconcat_FunctionalOperator() {
		if (concat_FunctionalOperatorEClass == null) {
			concat_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(331);
		}
		return concat_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconcat_FunctionalOperator_Str() {
        return (EReference)getconcat_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getconcat_FunctionalOperator__GetLiteral() {
        return getconcat_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getconcat_FunctionalOperator__GetAllParameters() {
        return getconcat_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getendsWith_FunctionalOperator() {
		if (endsWith_FunctionalOperatorEClass == null) {
			endsWith_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(332);
		}
		return endsWith_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getendsWith_FunctionalOperator_Suffix() {
        return (EReference)getendsWith_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getendsWith_FunctionalOperator__GetLiteral() {
        return getendsWith_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getendsWith_FunctionalOperator__GetAllParameters() {
        return getendsWith_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getequalsIgnoreCase_FunctionalOperator() {
		if (equalsIgnoreCase_FunctionalOperatorEClass == null) {
			equalsIgnoreCase_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(333);
		}
		return equalsIgnoreCase_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getequalsIgnoreCase_FunctionalOperator_AnotherString() {
        return (EReference)getequalsIgnoreCase_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequalsIgnoreCase_FunctionalOperator__GetLiteral() {
        return getequalsIgnoreCase_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getequalsIgnoreCase_FunctionalOperator__GetAllParameters() {
        return getequalsIgnoreCase_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getindexOfString_FunctionalOperator() {
		if (indexOfString_FunctionalOperatorEClass == null) {
			indexOfString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(334);
		}
		return indexOfString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getindexOfString_FunctionalOperator_Str() {
        return (EReference)getindexOfString_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfString_FunctionalOperator__GetLiteral() {
        return getindexOfString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getindexOfString_FunctionalOperator__GetAllParameters() {
        return getindexOfString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisEmpty_FunctionalOperator() {
		if (isEmpty_FunctionalOperatorEClass == null) {
			isEmpty_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(335);
		}
		return isEmpty_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getisEmpty_FunctionalOperator__GetLiteral() {
        return getisEmpty_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getisEmpty_FunctionalOperator__GetAllParameters() {
        return getisEmpty_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Operator() {
		if (number_OperatorEClass == null) {
			number_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(336);
		}
		return number_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Type() {
		if (number_TypeEClass == null) {
			number_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(337);
		}
		return number_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_FunctionalType() {
		if (number_FunctionalTypeEClass == null) {
			number_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(338);
		}
		return number_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_FunctionalType_Operator() {
        return (EReference)getNumber_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_CalculateableParameter() {
		if (number_CalculateableParameterEClass == null) {
			number_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(339);
		}
		return number_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getNumber_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_FunctionalParameter() {
		if (number_FunctionalParameterEClass == null) {
			number_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(340);
		}
		return number_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getNumber_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Calculateable() {
		if (number_CalculateableEClass == null) {
			number_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(341);
		}
		return number_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_CalculateableElement() {
		if (number_CalculateableElementEClass == null) {
			number_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(342);
		}
		return number_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Argument() {
		if (number_ArgumentEClass == null) {
			number_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(344);
		}
		return number_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_PrimitiveArgument() {
		if (number_PrimitiveArgumentEClass == null) {
			number_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(345);
		}
		return number_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumber_PrimitiveArgument_Value() {
        return (EAttribute)getNumber_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_EvaluationOperation_Argument() {
		if (number_EvaluationOperation_ArgumentEClass == null) {
			number_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(346);
		}
		return number_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_ExpressionOperator() {
		if (number_ExpressionOperatorEClass == null) {
			number_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(347);
		}
		return number_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_BitOperator() {
		if (number_BitOperatorEClass == null) {
			number_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(348);
		}
		return number_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_BitOperator_Connects() {
        return (EReference)getNumber_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_And_BitOperator() {
		if (number_And_BitOperatorEClass == null) {
			number_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(349);
		}
		return number_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_And_BitOperator__GetLiteral() {
        return getNumber_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Or_BitOperator() {
		if (number_Or_BitOperatorEClass == null) {
			number_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(350);
		}
		return number_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Or_BitOperator__GetLiteral() {
        return getNumber_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Original_FunctionalOperator() {
		if (number_Original_FunctionalOperatorEClass == null) {
			number_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(351);
		}
		return number_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgreaterThan_FunctionalOperator() {
		if (greaterThan_FunctionalOperatorEClass == null) {
			greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(352);
		}
		return greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgreaterThan_FunctionalOperator_I() {
        return (EReference)getgreaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterThan_FunctionalOperator__GetLiteral() {
        return getgreaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterThan_FunctionalOperator__GetAllParameters() {
        return getgreaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgreaterEquals_FunctionalOperator() {
		if (greaterEquals_FunctionalOperatorEClass == null) {
			greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(353);
		}
		return greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgreaterEquals_FunctionalOperator_I() {
        return (EReference)getgreaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterEquals_FunctionalOperator__GetLiteral() {
        return getgreaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getgreaterEquals_FunctionalOperator__GetAllParameters() {
        return getgreaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsmallerThan_FunctionalOperator() {
		if (smallerThan_FunctionalOperatorEClass == null) {
			smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(354);
		}
		return smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsmallerThan_FunctionalOperator_I() {
        return (EReference)getsmallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerThan_FunctionalOperator__GetLiteral() {
        return getsmallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerThan_FunctionalOperator__GetAllParameters() {
        return getsmallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsmallerEquals_FunctionalOperator() {
		if (smallerEquals_FunctionalOperatorEClass == null) {
			smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(355);
		}
		return smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsmallerEquals_FunctionalOperator_I() {
        return (EReference)getsmallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerEquals_FunctionalOperator__GetLiteral() {
        return getsmallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsmallerEquals_FunctionalOperator__GetAllParameters() {
        return getsmallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getparseBoolean_FunctionalOperator() {
		if (parseBoolean_FunctionalOperatorEClass == null) {
			parseBoolean_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(356);
		}
		return parseBoolean_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getparseBoolean_FunctionalOperator_S() {
        return (EReference)getparseBoolean_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getparseBoolean_FunctionalOperator__GetLiteral() {
        return getparseBoolean_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getparseBoolean_FunctionalOperator__GetAllParameters() {
        return getparseBoolean_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcompareTo_FunctionalOperator() {
		if (compareTo_FunctionalOperatorEClass == null) {
			compareTo_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(357);
		}
		return compareTo_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcompareTo_FunctionalOperator_B() {
        return (EReference)getcompareTo_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareTo_FunctionalOperator__GetLiteral() {
        return getcompareTo_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcompareTo_FunctionalOperator__GetAllParameters() {
        return getcompareTo_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Number_equals_FunctionalOperator() {
		if (object_Number_equals_FunctionalOperatorEClass == null) {
			object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(358);
		}
		return object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_equals_FunctionalOperator__GetLiteral() {
        return getObject_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_equals_FunctionalOperator__GetAllParameters() {
        return getObject_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Number_toString_FunctionalOperator() {
		if (object_Number_toString_FunctionalOperatorEClass == null) {
			object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(359);
		}
		return object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_toString_FunctionalOperator__GetLiteral() {
        return getObject_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Number_toString_FunctionalOperator__GetAllParameters() {
        return getObject_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_FunctionalOperator() {
		if (number_FunctionalOperatorEClass == null) {
			number_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(360);
		}
		return number_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_Number_FunctionalOperator() {
		if (inheritedFrom_Object_to_Number_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_Number_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(361);
		}
		return inheritedFrom_Object_to_Number_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_greaterThan_FunctionalOperator() {
		if (number_Integer_greaterThan_FunctionalOperatorEClass == null) {
			number_Integer_greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(362);
		}
		return number_Integer_greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_greaterThan_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_greaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterThan_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_greaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_greaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_greaterEquals_FunctionalOperator() {
		if (number_Integer_greaterEquals_FunctionalOperatorEClass == null) {
			number_Integer_greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(363);
		}
		return number_Integer_greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_greaterEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_greaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_greaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_greaterEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_greaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_smallerThan_FunctionalOperator() {
		if (number_Integer_smallerThan_FunctionalOperatorEClass == null) {
			number_Integer_smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(364);
		}
		return number_Integer_smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_smallerThan_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_smallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerThan_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_smallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_smallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_smallerEquals_FunctionalOperator() {
		if (number_Integer_smallerEquals_FunctionalOperatorEClass == null) {
			number_Integer_smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(365);
		}
		return number_Integer_smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_smallerEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Integer_smallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_smallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_smallerEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_smallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_Object_Number_equals_FunctionalOperator() {
		if (number_Integer_Object_Number_equals_FunctionalOperatorEClass == null) {
			number_Integer_Object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(366);
		}
		return number_Integer_Object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Integer_Object_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getNumber_Integer_Object_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_equals_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_Object_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_equals_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_Object_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Integer_Object_Number_toString_FunctionalOperator() {
		if (number_Integer_Object_Number_toString_FunctionalOperatorEClass == null) {
			number_Integer_Object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(367);
		}
		return number_Integer_Object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_toString_FunctionalOperator__GetLiteral() {
        return getNumber_Integer_Object_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Integer_Object_Number_toString_FunctionalOperator__GetAllParameters() {
        return getNumber_Integer_Object_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger_FunctionalOperator() {
		if (integer_FunctionalOperatorEClass == null) {
			integer_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(368);
		}
		return integer_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Number_to_Integer_FunctionalOperator() {
		if (inheritedFrom_Number_to_Integer_FunctionalOperatorEClass == null) {
			inheritedFrom_Number_to_Integer_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(369);
		}
		return inheritedFrom_Number_to_Integer_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_Calculateable() {
		if (long_CalculateableEClass == null) {
			long_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(370);
		}
		return long_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_CalculateableElement() {
		if (long_CalculateableElementEClass == null) {
			long_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(371);
		}
		return long_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_Operator() {
		if (long_OperatorEClass == null) {
			long_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(372);
		}
		return long_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_Type() {
		if (long_TypeEClass == null) {
			long_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(373);
		}
		return long_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_FunctionalType() {
		if (long_FunctionalTypeEClass == null) {
			long_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(374);
		}
		return long_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLong_FunctionalType_Operator() {
        return (EReference)getLong_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_CalculateableParameter() {
		if (long_CalculateableParameterEClass == null) {
			long_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(375);
		}
		return long_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLong_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getLong_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_FunctionalParameter() {
		if (long_FunctionalParameterEClass == null) {
			long_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(376);
		}
		return long_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLong_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getLong_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_Argument() {
		if (long_ArgumentEClass == null) {
			long_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(378);
		}
		return long_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_PrimitiveArgument() {
		if (long_PrimitiveArgumentEClass == null) {
			long_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(379);
		}
		return long_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLong_PrimitiveArgument_Value() {
        return (EAttribute)getLong_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_EvaluationOperation_Argument() {
		if (long_EvaluationOperation_ArgumentEClass == null) {
			long_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(380);
		}
		return long_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_ExpressionOperator() {
		if (long_ExpressionOperatorEClass == null) {
			long_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(381);
		}
		return long_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_BitOperator() {
		if (long_BitOperatorEClass == null) {
			long_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(382);
		}
		return long_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLong_BitOperator_Connects() {
        return (EReference)getLong_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_And_BitOperator() {
		if (long_And_BitOperatorEClass == null) {
			long_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(383);
		}
		return long_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLong_And_BitOperator__GetLiteral() {
        return getLong_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_Or_BitOperator() {
		if (long_Or_BitOperatorEClass == null) {
			long_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(384);
		}
		return long_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLong_Or_BitOperator__GetLiteral() {
        return getLong_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_Original_FunctionalOperator() {
		if (long_Original_FunctionalOperatorEClass == null) {
			long_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(385);
		}
		return long_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Long_greaterThan_FunctionalOperator() {
		if (number_Long_greaterThan_FunctionalOperatorEClass == null) {
			number_Long_greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(386);
		}
		return number_Long_greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Long_greaterThan_FunctionalOperator_I() {
        return (EReference)getNumber_Long_greaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_greaterThan_FunctionalOperator__GetLiteral() {
        return getNumber_Long_greaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_greaterThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Long_greaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Long_greaterEquals_FunctionalOperator() {
		if (number_Long_greaterEquals_FunctionalOperatorEClass == null) {
			number_Long_greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(387);
		}
		return number_Long_greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Long_greaterEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Long_greaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_greaterEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Long_greaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_greaterEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Long_greaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Long_smallerThan_FunctionalOperator() {
		if (number_Long_smallerThan_FunctionalOperatorEClass == null) {
			number_Long_smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(388);
		}
		return number_Long_smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Long_smallerThan_FunctionalOperator_I() {
        return (EReference)getNumber_Long_smallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_smallerThan_FunctionalOperator__GetLiteral() {
        return getNumber_Long_smallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_smallerThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Long_smallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Long_smallerEquals_FunctionalOperator() {
		if (number_Long_smallerEquals_FunctionalOperatorEClass == null) {
			number_Long_smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(389);
		}
		return number_Long_smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Long_smallerEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Long_smallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_smallerEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Long_smallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_smallerEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Long_smallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Long_Object_Number_equals_FunctionalOperator() {
		if (number_Long_Object_Number_equals_FunctionalOperatorEClass == null) {
			number_Long_Object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(390);
		}
		return number_Long_Object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Long_Object_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getNumber_Long_Object_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_Object_Number_equals_FunctionalOperator__GetLiteral() {
        return getNumber_Long_Object_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_Object_Number_equals_FunctionalOperator__GetAllParameters() {
        return getNumber_Long_Object_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Long_Object_Number_toString_FunctionalOperator() {
		if (number_Long_Object_Number_toString_FunctionalOperatorEClass == null) {
			number_Long_Object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(391);
		}
		return number_Long_Object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_Object_Number_toString_FunctionalOperator__GetLiteral() {
        return getNumber_Long_Object_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Long_Object_Number_toString_FunctionalOperator__GetAllParameters() {
        return getNumber_Long_Object_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong_FunctionalOperator() {
		if (long_FunctionalOperatorEClass == null) {
			long_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(392);
		}
		return long_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Number_to_Long_FunctionalOperator() {
		if (inheritedFrom_Number_to_Long_FunctionalOperatorEClass == null) {
			inheritedFrom_Number_to_Long_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(393);
		}
		return inheritedFrom_Number_to_Long_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Calculateable() {
		if (double_CalculateableEClass == null) {
			double_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(394);
		}
		return double_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_CalculateableElement() {
		if (double_CalculateableElementEClass == null) {
			double_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(395);
		}
		return double_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Operator() {
		if (double_OperatorEClass == null) {
			double_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(396);
		}
		return double_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Type() {
		if (double_TypeEClass == null) {
			double_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(397);
		}
		return double_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_FunctionalType() {
		if (double_FunctionalTypeEClass == null) {
			double_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(398);
		}
		return double_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDouble_FunctionalType_Operator() {
        return (EReference)getDouble_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_CalculateableParameter() {
		if (double_CalculateableParameterEClass == null) {
			double_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(399);
		}
		return double_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getDouble_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_FunctionalParameter() {
		if (double_FunctionalParameterEClass == null) {
			double_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(400);
		}
		return double_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getDouble_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Argument() {
		if (double_ArgumentEClass == null) {
			double_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(402);
		}
		return double_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_PrimitiveArgument() {
		if (double_PrimitiveArgumentEClass == null) {
			double_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(403);
		}
		return double_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_PrimitiveArgument_Value() {
        return (EAttribute)getDouble_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_EvaluationOperation_Argument() {
		if (double_EvaluationOperation_ArgumentEClass == null) {
			double_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(404);
		}
		return double_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_ExpressionOperator() {
		if (double_ExpressionOperatorEClass == null) {
			double_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(405);
		}
		return double_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_BitOperator() {
		if (double_BitOperatorEClass == null) {
			double_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(406);
		}
		return double_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDouble_BitOperator_Connects() {
        return (EReference)getDouble_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_And_BitOperator() {
		if (double_And_BitOperatorEClass == null) {
			double_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(407);
		}
		return double_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_And_BitOperator__GetLiteral() {
        return getDouble_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Or_BitOperator() {
		if (double_Or_BitOperatorEClass == null) {
			double_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(408);
		}
		return double_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDouble_Or_BitOperator__GetLiteral() {
        return getDouble_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_Original_FunctionalOperator() {
		if (double_Original_FunctionalOperatorEClass == null) {
			double_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(409);
		}
		return double_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_greaterThan_FunctionalOperator() {
		if (number_Double_greaterThan_FunctionalOperatorEClass == null) {
			number_Double_greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(410);
		}
		return number_Double_greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_greaterThan_FunctionalOperator_I() {
        return (EReference)getNumber_Double_greaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterThan_FunctionalOperator__GetLiteral() {
        return getNumber_Double_greaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_greaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_greaterEquals_FunctionalOperator() {
		if (number_Double_greaterEquals_FunctionalOperatorEClass == null) {
			number_Double_greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(411);
		}
		return number_Double_greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_greaterEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Double_greaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Double_greaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_greaterEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_greaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_smallerThan_FunctionalOperator() {
		if (number_Double_smallerThan_FunctionalOperatorEClass == null) {
			number_Double_smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(412);
		}
		return number_Double_smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_smallerThan_FunctionalOperator_I() {
        return (EReference)getNumber_Double_smallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerThan_FunctionalOperator__GetLiteral() {
        return getNumber_Double_smallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_smallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_smallerEquals_FunctionalOperator() {
		if (number_Double_smallerEquals_FunctionalOperatorEClass == null) {
			number_Double_smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(413);
		}
		return number_Double_smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_smallerEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Double_smallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Double_smallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_smallerEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_smallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_Object_Number_equals_FunctionalOperator() {
		if (number_Double_Object_Number_equals_FunctionalOperatorEClass == null) {
			number_Double_Object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(414);
		}
		return number_Double_Object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Double_Object_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getNumber_Double_Object_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_equals_FunctionalOperator__GetLiteral() {
        return getNumber_Double_Object_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_equals_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_Object_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Double_Object_Number_toString_FunctionalOperator() {
		if (number_Double_Object_Number_toString_FunctionalOperatorEClass == null) {
			number_Double_Object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(415);
		}
		return number_Double_Object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_toString_FunctionalOperator__GetLiteral() {
        return getNumber_Double_Object_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Double_Object_Number_toString_FunctionalOperator__GetAllParameters() {
        return getNumber_Double_Object_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble_FunctionalOperator() {
		if (double_FunctionalOperatorEClass == null) {
			double_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(416);
		}
		return double_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Number_to_Double_FunctionalOperator() {
		if (inheritedFrom_Number_to_Double_FunctionalOperatorEClass == null) {
			inheritedFrom_Number_to_Double_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(417);
		}
		return inheritedFrom_Number_to_Double_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_Calculateable() {
		if (float_CalculateableEClass == null) {
			float_CalculateableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(418);
		}
		return float_CalculateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_CalculateableElement() {
		if (float_CalculateableElementEClass == null) {
			float_CalculateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(419);
		}
		return float_CalculateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_Operator() {
		if (float_OperatorEClass == null) {
			float_OperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(420);
		}
		return float_OperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_Type() {
		if (float_TypeEClass == null) {
			float_TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(421);
		}
		return float_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_FunctionalType() {
		if (float_FunctionalTypeEClass == null) {
			float_FunctionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(422);
		}
		return float_FunctionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloat_FunctionalType_Operator() {
        return (EReference)getFloat_FunctionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_CalculateableParameter() {
		if (float_CalculateableParameterEClass == null) {
			float_CalculateableParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(423);
		}
		return float_CalculateableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFloat_CalculateableParameter__Validate__DiagnosticChain_Map() {
        return getFloat_CalculateableParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_FunctionalParameter() {
		if (float_FunctionalParameterEClass == null) {
			float_FunctionalParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(424);
		}
		return float_FunctionalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFloat_FunctionalParameter__Validate__DiagnosticChain_Map() {
        return getFloat_FunctionalParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_Argument() {
		if (float_ArgumentEClass == null) {
			float_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(426);
		}
		return float_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_PrimitiveArgument() {
		if (float_PrimitiveArgumentEClass == null) {
			float_PrimitiveArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(427);
		}
		return float_PrimitiveArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_PrimitiveArgument_Value() {
        return (EAttribute)getFloat_PrimitiveArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_EvaluationOperation_Argument() {
		if (float_EvaluationOperation_ArgumentEClass == null) {
			float_EvaluationOperation_ArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(428);
		}
		return float_EvaluationOperation_ArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_ExpressionOperator() {
		if (float_ExpressionOperatorEClass == null) {
			float_ExpressionOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(429);
		}
		return float_ExpressionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_BitOperator() {
		if (float_BitOperatorEClass == null) {
			float_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(430);
		}
		return float_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloat_BitOperator_Connects() {
        return (EReference)getFloat_BitOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_And_BitOperator() {
		if (float_And_BitOperatorEClass == null) {
			float_And_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(431);
		}
		return float_And_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFloat_And_BitOperator__GetLiteral() {
        return getFloat_And_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_Or_BitOperator() {
		if (float_Or_BitOperatorEClass == null) {
			float_Or_BitOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(432);
		}
		return float_Or_BitOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFloat_Or_BitOperator__GetLiteral() {
        return getFloat_Or_BitOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_Original_FunctionalOperator() {
		if (float_Original_FunctionalOperatorEClass == null) {
			float_Original_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(433);
		}
		return float_Original_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Float_greaterThan_FunctionalOperator() {
		if (number_Float_greaterThan_FunctionalOperatorEClass == null) {
			number_Float_greaterThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(434);
		}
		return number_Float_greaterThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Float_greaterThan_FunctionalOperator_I() {
        return (EReference)getNumber_Float_greaterThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_greaterThan_FunctionalOperator__GetLiteral() {
        return getNumber_Float_greaterThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_greaterThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Float_greaterThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Float_greaterEquals_FunctionalOperator() {
		if (number_Float_greaterEquals_FunctionalOperatorEClass == null) {
			number_Float_greaterEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(435);
		}
		return number_Float_greaterEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Float_greaterEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Float_greaterEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_greaterEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Float_greaterEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_greaterEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Float_greaterEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Float_smallerThan_FunctionalOperator() {
		if (number_Float_smallerThan_FunctionalOperatorEClass == null) {
			number_Float_smallerThan_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(436);
		}
		return number_Float_smallerThan_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Float_smallerThan_FunctionalOperator_I() {
        return (EReference)getNumber_Float_smallerThan_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_smallerThan_FunctionalOperator__GetLiteral() {
        return getNumber_Float_smallerThan_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_smallerThan_FunctionalOperator__GetAllParameters() {
        return getNumber_Float_smallerThan_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Float_smallerEquals_FunctionalOperator() {
		if (number_Float_smallerEquals_FunctionalOperatorEClass == null) {
			number_Float_smallerEquals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(437);
		}
		return number_Float_smallerEquals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Float_smallerEquals_FunctionalOperator_I() {
        return (EReference)getNumber_Float_smallerEquals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_smallerEquals_FunctionalOperator__GetLiteral() {
        return getNumber_Float_smallerEquals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_smallerEquals_FunctionalOperator__GetAllParameters() {
        return getNumber_Float_smallerEquals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Float_Object_Number_equals_FunctionalOperator() {
		if (number_Float_Object_Number_equals_FunctionalOperatorEClass == null) {
			number_Float_Object_Number_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(438);
		}
		return number_Float_Object_Number_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumber_Float_Object_Number_equals_FunctionalOperator_Obj() {
        return (EReference)getNumber_Float_Object_Number_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_Object_Number_equals_FunctionalOperator__GetLiteral() {
        return getNumber_Float_Object_Number_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_Object_Number_equals_FunctionalOperator__GetAllParameters() {
        return getNumber_Float_Object_Number_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber_Float_Object_Number_toString_FunctionalOperator() {
		if (number_Float_Object_Number_toString_FunctionalOperatorEClass == null) {
			number_Float_Object_Number_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(439);
		}
		return number_Float_Object_Number_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_Object_Number_toString_FunctionalOperator__GetLiteral() {
        return getNumber_Float_Object_Number_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumber_Float_Object_Number_toString_FunctionalOperator__GetAllParameters() {
        return getNumber_Float_Object_Number_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat_FunctionalOperator() {
		if (float_FunctionalOperatorEClass == null) {
			float_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(440);
		}
		return float_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Number_to_Float_FunctionalOperator() {
		if (inheritedFrom_Number_to_Float_FunctionalOperatorEClass == null) {
			inheritedFrom_Number_to_Float_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(441);
		}
		return inheritedFrom_Number_to_Float_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CharSequence_equals_FunctionalOperator() {
		if (object_CharSequence_equals_FunctionalOperatorEClass == null) {
			object_CharSequence_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(442);
		}
		return object_CharSequence_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_CharSequence_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_CharSequence_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_equals_FunctionalOperator__GetLiteral() {
        return getObject_CharSequence_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_equals_FunctionalOperator__GetAllParameters() {
        return getObject_CharSequence_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_CharSequence_toString_FunctionalOperator() {
		if (object_CharSequence_toString_FunctionalOperatorEClass == null) {
			object_CharSequence_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(443);
		}
		return object_CharSequence_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_toString_FunctionalOperator__GetLiteral() {
        return getObject_CharSequence_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_CharSequence_toString_FunctionalOperator__GetAllParameters() {
        return getObject_CharSequence_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_FunctionalOperator() {
		if (charSequence_FunctionalOperatorEClass == null) {
			charSequence_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(444);
		}
		return charSequence_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_CharSequence_FunctionalOperator() {
		if (inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(445);
		}
		return inheritedFrom_Object_to_CharSequence_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Character_equals_FunctionalOperator() {
		if (object_Character_equals_FunctionalOperatorEClass == null) {
			object_Character_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(446);
		}
		return object_Character_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Character_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_Character_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_equals_FunctionalOperator__GetLiteral() {
        return getObject_Character_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_equals_FunctionalOperator__GetAllParameters() {
        return getObject_Character_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Character_toString_FunctionalOperator() {
		if (object_Character_toString_FunctionalOperatorEClass == null) {
			object_Character_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(447);
		}
		return object_Character_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_toString_FunctionalOperator__GetLiteral() {
        return getObject_Character_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Character_toString_FunctionalOperator__GetAllParameters() {
        return getObject_Character_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter_FunctionalOperator() {
		if (character_FunctionalOperatorEClass == null) {
			character_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(448);
		}
		return character_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_Character_FunctionalOperator() {
		if (inheritedFrom_Object_to_Character_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_Character_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(449);
		}
		return inheritedFrom_Object_to_Character_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Boolean_equals_FunctionalOperator() {
		if (object_Boolean_equals_FunctionalOperatorEClass == null) {
			object_Boolean_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(450);
		}
		return object_Boolean_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Boolean_equals_FunctionalOperator_Obj() {
        return (EReference)getObject_Boolean_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_equals_FunctionalOperator__GetLiteral() {
        return getObject_Boolean_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_equals_FunctionalOperator__GetAllParameters() {
        return getObject_Boolean_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject_Boolean_toString_FunctionalOperator() {
		if (object_Boolean_toString_FunctionalOperatorEClass == null) {
			object_Boolean_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(451);
		}
		return object_Boolean_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_toString_FunctionalOperator__GetLiteral() {
        return getObject_Boolean_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject_Boolean_toString_FunctionalOperator__GetAllParameters() {
        return getObject_Boolean_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean_FunctionalOperator() {
		if (boolean_FunctionalOperatorEClass == null) {
			boolean_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(452);
		}
		return boolean_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_Object_to_Boolean_FunctionalOperator() {
		if (inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass == null) {
			inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(453);
		}
		return inheritedFrom_Object_to_Boolean_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_String_length_FunctionalOperator() {
		if (charSequence_String_length_FunctionalOperatorEClass == null) {
			charSequence_String_length_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(454);
		}
		return charSequence_String_length_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_length_FunctionalOperator__GetLiteral() {
        return getCharSequence_String_length_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_length_FunctionalOperator__GetAllParameters() {
        return getCharSequence_String_length_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_String_Object_CharSequence_equals_FunctionalOperator() {
		if (charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass == null) {
			charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(455);
		}
		return charSequence_String_Object_CharSequence_equals_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharSequence_String_Object_CharSequence_equals_FunctionalOperator_Obj() {
        return (EReference)getCharSequence_String_Object_CharSequence_equals_FunctionalOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_equals_FunctionalOperator__GetLiteral() {
        return getCharSequence_String_Object_CharSequence_equals_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_equals_FunctionalOperator__GetAllParameters() {
        return getCharSequence_String_Object_CharSequence_equals_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharSequence_String_Object_CharSequence_toString_FunctionalOperator() {
		if (charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass == null) {
			charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(456);
		}
		return charSequence_String_Object_CharSequence_toString_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_toString_FunctionalOperator__GetLiteral() {
        return getCharSequence_String_Object_CharSequence_toString_FunctionalOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCharSequence_String_Object_CharSequence_toString_FunctionalOperator__GetAllParameters() {
        return getCharSequence_String_Object_CharSequence_toString_FunctionalOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString_FunctionalOperator() {
		if (string_FunctionalOperatorEClass == null) {
			string_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(457);
		}
		return string_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedFrom_CharSequence_to_String_FunctionalOperator() {
		if (inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass == null) {
			inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(458);
		}
		return inheritedFrom_CharSequence_to_String_FunctionalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount_AggregationOperator() {
		if (count_AggregationOperatorEClass == null) {
			count_AggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(459);
		}
		return count_AggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCount_AggregationOperator__GetLiteral() {
        return getCount_AggregationOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSum_AggregationOperator() {
		if (sum_AggregationOperatorEClass == null) {
			sum_AggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(460);
		}
		return sum_AggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSum_AggregationOperator_Calculateable() {
        return (EReference)getSum_AggregationOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSum_AggregationOperator__GetLiteral() {
        return getSum_AggregationOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSum_AggregationOperator__GetAllParameters() {
        return getSum_AggregationOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMin_AggregationOperator() {
		if (min_AggregationOperatorEClass == null) {
			min_AggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(461);
		}
		return min_AggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMin_AggregationOperator_Calculateable() {
        return (EReference)getMin_AggregationOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMin_AggregationOperator__GetLiteral() {
        return getMin_AggregationOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMin_AggregationOperator__GetAllParameters() {
        return getMin_AggregationOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMax_AggregationOperator() {
		if (max_AggregationOperatorEClass == null) {
			max_AggregationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(462);
		}
		return max_AggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMax_AggregationOperator_Calculateable() {
        return (EReference)getMax_AggregationOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMax_AggregationOperator__GetLiteral() {
        return getMax_AggregationOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMax_AggregationOperator__GetAllParameters() {
        return getMax_AggregationOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerParseInt_ClassOperator() {
		if (integerParseInt_ClassOperatorEClass == null) {
			integerParseInt_ClassOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(463);
		}
		return integerParseInt_ClassOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerParseInt_ClassOperator_Calculateable() {
        return (EReference)getIntegerParseInt_ClassOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerParseInt_ClassOperator__GetLiteral() {
        return getIntegerParseInt_ClassOperator().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerParseInt_ClassOperator__GetAllParameters() {
        return getIntegerParseInt_ClassOperator().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeMode() {
		if (changeModeEEnum == null) {
			changeModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(9);
		}
		return changeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributeDataType() {
		if (attributeDataTypeEDataType == null) {
			attributeDataTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(0);
		}
		return attributeDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChangeModeObject() {
		if (changeModeObjectEDataType == null) {
			changeModeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(10);
		}
		return changeModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		if (objectEDataType == null) {
			objectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(254);
		}
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		if (booleanEDataType == null) {
			booleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(270);
		}
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharSequence() {
		if (charSequenceEDataType == null) {
			charSequenceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(288);
		}
		return charSequenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		if (integerEDataType == null) {
			integerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(302);
		}
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharacter() {
		if (characterEDataType == null) {
			characterEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(319);
		}
		return characterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumber() {
		if (numberEDataType == null) {
			numberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(343);
		}
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLong() {
		if (longEDataType == null) {
			longEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(377);
		}
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		if (doubleEDataType == null) {
			doubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(401);
		}
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		if (floatEDataType == null) {
			floatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(QmmPackage.eNS_URI).getEClassifiers().get(425);
		}
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmFactory getQmmFactory() {
		return (QmmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("qmm." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //QmmPackageImpl
