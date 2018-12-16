/**
 */
package qmm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public class QmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmSwitch() {
		if (modelPackage == null) {
			modelPackage = QmmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QmmPackage.ATTRIBUTE_FAMILY: {
				AttributeFamily attributeFamily = (AttributeFamily)theEObject;
				T result = caseAttributeFamily(attributeFamily);
				if (result == null) result = caseAttribute(attributeFamily);
				if (result == null) result = caseCAEXObject(attributeFamily);
				if (result == null) result = caseCAEXBasicObject(attributeFamily);
				if (result == null) result = caseRootClass(attributeFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_NAME_MAPPING: {
				AttributeNameMapping attributeNameMapping = (AttributeNameMapping)theEObject;
				T result = caseAttributeNameMapping(attributeNameMapping);
				if (result == null) result = caseCAEXBasicObject(attributeNameMapping);
				if (result == null) result = caseRootClass(attributeNameMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseCAEXObject(attribute);
				if (result == null) result = caseCAEXBasicObject(attribute);
				if (result == null) result = caseRootClass(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_LIB: {
				AttributeLib attributeLib = (AttributeLib)theEObject;
				T result = caseAttributeLib(attributeLib);
				if (result == null) result = caseCAEXObject(attributeLib);
				if (result == null) result = caseCAEXBasicObject(attributeLib);
				if (result == null) result = caseRootClass(attributeLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT: {
				AttributeValueRequirement attributeValueRequirement = (AttributeValueRequirement)theEObject;
				T result = caseAttributeValueRequirement(attributeValueRequirement);
				if (result == null) result = caseCAEXBasicObject(attributeValueRequirement);
				if (result == null) result = caseRootClass(attributeValueRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_BASIC_OBJECT: {
				CAEXBasicObject caexBasicObject = (CAEXBasicObject)theEObject;
				T result = caseCAEXBasicObject(caexBasicObject);
				if (result == null) result = caseRootClass(caexBasicObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_FILE: {
				CAEXFile caexFile = (CAEXFile)theEObject;
				T result = caseCAEXFile(caexFile);
				if (result == null) result = caseCAEXBasicObject(caexFile);
				if (result == null) result = caseRootClass(caexFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_OBJECT: {
				CAEXObject caexObject = (CAEXObject)theEObject;
				T result = caseCAEXObject(caexObject);
				if (result == null) result = caseCAEXBasicObject(caexObject);
				if (result == null) result = caseRootClass(caexObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = caseRootClass(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXTERNAL_INTERFACE: {
				ExternalInterface externalInterface = (ExternalInterface)theEObject;
				T result = caseExternalInterface(externalInterface);
				if (result == null) result = caseInterfaceClass(externalInterface);
				if (result == null) result = caseCAEXObject(externalInterface);
				if (result == null) result = caseCAEXBasicObject(externalInterface);
				if (result == null) result = caseRootClass(externalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXTERNAL_REFERENCE_TYPE: {
				ExternalReferenceType externalReferenceType = (ExternalReferenceType)theEObject;
				T result = caseExternalReferenceType(externalReferenceType);
				if (result == null) result = caseCAEXBasicObject(externalReferenceType);
				if (result == null) result = caseRootClass(externalReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INSTANCE_HIERARCHY: {
				InstanceHierarchy instanceHierarchy = (InstanceHierarchy)theEObject;
				T result = caseInstanceHierarchy(instanceHierarchy);
				if (result == null) result = caseCAEXObject(instanceHierarchy);
				if (result == null) result = caseCAEXBasicObject(instanceHierarchy);
				if (result == null) result = caseRootClass(instanceHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_CLASS_LIB: {
				InterfaceClassLib interfaceClassLib = (InterfaceClassLib)theEObject;
				T result = caseInterfaceClassLib(interfaceClassLib);
				if (result == null) result = caseCAEXObject(interfaceClassLib);
				if (result == null) result = caseCAEXBasicObject(interfaceClassLib);
				if (result == null) result = caseRootClass(interfaceClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_CLASS: {
				InterfaceClass interfaceClass = (InterfaceClass)theEObject;
				T result = caseInterfaceClass(interfaceClass);
				if (result == null) result = caseCAEXObject(interfaceClass);
				if (result == null) result = caseCAEXBasicObject(interfaceClass);
				if (result == null) result = caseRootClass(interfaceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_FAMILY: {
				InterfaceFamily interfaceFamily = (InterfaceFamily)theEObject;
				T result = caseInterfaceFamily(interfaceFamily);
				if (result == null) result = caseInterfaceClass(interfaceFamily);
				if (result == null) result = caseCAEXObject(interfaceFamily);
				if (result == null) result = caseCAEXBasicObject(interfaceFamily);
				if (result == null) result = caseRootClass(interfaceFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_ID_MAPPING: {
				InterfaceIDMapping interfaceIDMapping = (InterfaceIDMapping)theEObject;
				T result = caseInterfaceIDMapping(interfaceIDMapping);
				if (result == null) result = caseCAEXBasicObject(interfaceIDMapping);
				if (result == null) result = caseRootClass(interfaceIDMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERNAL_ELEMENT: {
				InternalElement internalElement = (InternalElement)theEObject;
				T result = caseInternalElement(internalElement);
				if (result == null) result = caseSystemUnitClass(internalElement);
				if (result == null) result = caseCAEXObject(internalElement);
				if (result == null) result = caseCAEXBasicObject(internalElement);
				if (result == null) result = caseRootClass(internalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERNAL_LINK: {
				InternalLink internalLink = (InternalLink)theEObject;
				T result = caseInternalLink(internalLink);
				if (result == null) result = caseCAEXObject(internalLink);
				if (result == null) result = caseCAEXBasicObject(internalLink);
				if (result == null) result = caseRootClass(internalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseCAEXBasicObject(mapping);
				if (result == null) result = caseRootClass(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NOMINAL_SCALED_TYPE: {
				NominalScaledType nominalScaledType = (NominalScaledType)theEObject;
				T result = caseNominalScaledType(nominalScaledType);
				if (result == null) result = caseRootClass(nominalScaledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ORDINAL_SCALED_TYPE: {
				OrdinalScaledType ordinalScaledType = (OrdinalScaledType)theEObject;
				T result = caseOrdinalScaledType(ordinalScaledType);
				if (result == null) result = caseRootClass(ordinalScaledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REF_SEMANTIC: {
				RefSemantic refSemantic = (RefSemantic)theEObject;
				T result = caseRefSemantic(refSemantic);
				if (result == null) result = caseCAEXBasicObject(refSemantic);
				if (result == null) result = caseRootClass(refSemantic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_CLASS_LIB: {
				RoleClassLib roleClassLib = (RoleClassLib)theEObject;
				T result = caseRoleClassLib(roleClassLib);
				if (result == null) result = caseCAEXObject(roleClassLib);
				if (result == null) result = caseCAEXBasicObject(roleClassLib);
				if (result == null) result = caseRootClass(roleClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_CLASS: {
				RoleClass roleClass = (RoleClass)theEObject;
				T result = caseRoleClass(roleClass);
				if (result == null) result = caseCAEXObject(roleClass);
				if (result == null) result = caseCAEXBasicObject(roleClass);
				if (result == null) result = caseRootClass(roleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_FAMILY: {
				RoleFamily roleFamily = (RoleFamily)theEObject;
				T result = caseRoleFamily(roleFamily);
				if (result == null) result = caseRoleClass(roleFamily);
				if (result == null) result = caseCAEXObject(roleFamily);
				if (result == null) result = caseCAEXBasicObject(roleFamily);
				if (result == null) result = caseRootClass(roleFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_REQUIREMENTS: {
				RoleRequirements roleRequirements = (RoleRequirements)theEObject;
				T result = caseRoleRequirements(roleRequirements);
				if (result == null) result = caseCAEXBasicObject(roleRequirements);
				if (result == null) result = caseRootClass(roleRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION: {
				SourceDocumentInformation sourceDocumentInformation = (SourceDocumentInformation)theEObject;
				T result = caseSourceDocumentInformation(sourceDocumentInformation);
				if (result == null) result = caseRootClass(sourceDocumentInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUPPORTED_ROLE_CLASS: {
				SupportedRoleClass supportedRoleClass = (SupportedRoleClass)theEObject;
				T result = caseSupportedRoleClass(supportedRoleClass);
				if (result == null) result = caseCAEXBasicObject(supportedRoleClass);
				if (result == null) result = caseRootClass(supportedRoleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB: {
				SystemUnitClassLib systemUnitClassLib = (SystemUnitClassLib)theEObject;
				T result = caseSystemUnitClassLib(systemUnitClassLib);
				if (result == null) result = caseCAEXObject(systemUnitClassLib);
				if (result == null) result = caseCAEXBasicObject(systemUnitClassLib);
				if (result == null) result = caseRootClass(systemUnitClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SYSTEM_UNIT_CLASS: {
				SystemUnitClass systemUnitClass = (SystemUnitClass)theEObject;
				T result = caseSystemUnitClass(systemUnitClass);
				if (result == null) result = caseCAEXObject(systemUnitClass);
				if (result == null) result = caseCAEXBasicObject(systemUnitClass);
				if (result == null) result = caseRootClass(systemUnitClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SYSTEM_UNIT_FAMILY: {
				SystemUnitFamily systemUnitFamily = (SystemUnitFamily)theEObject;
				T result = caseSystemUnitFamily(systemUnitFamily);
				if (result == null) result = caseSystemUnitClass(systemUnitFamily);
				if (result == null) result = caseCAEXObject(systemUnitFamily);
				if (result == null) result = caseCAEXBasicObject(systemUnitFamily);
				if (result == null) result = caseRootClass(systemUnitFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.UNKNOWN_TYPE: {
				UnknownType unknownType = (UnknownType)theEObject;
				T result = caseUnknownType(unknownType);
				if (result == null) result = caseRootClass(unknownType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COPYRIGHT: {
				Copyright copyright = (Copyright)theEObject;
				T result = caseCopyright(copyright);
				if (result == null) result = caseRootClass(copyright);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseRootClass(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REVISION: {
				Revision revision = (Revision)theEObject;
				T result = caseRevision(revision);
				if (result == null) result = caseCAEXBasicObject(revision);
				if (result == null) result = caseRootClass(revision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseRootClass(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ADDITIONAL_INFORMATION: {
				AdditionalInformation additionalInformation = (AdditionalInformation)theEObject;
				T result = caseAdditionalInformation(additionalInformation);
				if (result == null) result = caseGenericElement(additionalInformation);
				if (result == null) result = caseElement(additionalInformation);
				if (result == null) result = caseRootClass(additionalInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseRootClass(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GENERIC_ELEMENT: {
				GenericElement genericElement = (GenericElement)theEObject;
				T result = caseGenericElement(genericElement);
				if (result == null) result = caseElement(genericElement);
				if (result == null) result = caseRootClass(genericElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GENERIC_ATTRIBUTE: {
				GenericAttribute genericAttribute = (GenericAttribute)theEObject;
				T result = caseGenericAttribute(genericAttribute);
				if (result == null) result = caseElement(genericAttribute);
				if (result == null) result = caseRootClass(genericAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTABLE: {
				Countable countable = (Countable)theEObject;
				T result = caseCountable(countable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NEGATABLE_ELEMENT: {
				NegatableElement negatableElement = (NegatableElement)theEObject;
				T result = caseNegatableElement(negatableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OR_GROUP: {
				OrGroup orGroup = (OrGroup)theEObject;
				T result = caseOrGroup(orGroup);
				if (result == null) result = caseNamedElement(orGroup);
				if (result == null) result = caseCountable(orGroup);
				if (result == null) result = caseNegatableElement(orGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROOT_CLASS: {
				RootClass rootClass = (RootClass)theEObject;
				T result = caseRootClass(rootClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FIND_QUERY: {
				FindQuery findQuery = (FindQuery)theEObject;
				T result = caseFindQuery(findQuery);
				if (result == null) result = caseQuery(findQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE: {
				Calculateable calculateable = (Calculateable)theEObject;
				T result = caseCalculateable(calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_ELEMENT: {
				CalculateableElement calculateableElement = (CalculateableElement)theEObject;
				T result = caseCalculateableElement(calculateableElement);
				if (result == null) result = caseCalculateable(calculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_ECLASS: {
				AttributeEClass attributeEClass = (AttributeEClass)theEObject;
				T result = caseAttributeEClass(attributeEClass);
				if (result == null) result = caseNamedElement(attributeEClass);
				if (result == null) result = caseNegatableElement(attributeEClass);
				if (result == null) result = caseCountable(attributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS: {
				RegularAttributeEClass regularAttributeEClass = (RegularAttributeEClass)theEObject;
				T result = caseRegularAttributeEClass(regularAttributeEClass);
				if (result == null) result = caseAttributeEClass(regularAttributeEClass);
				if (result == null) result = caseNamedElement(regularAttributeEClass);
				if (result == null) result = caseNegatableElement(regularAttributeEClass);
				if (result == null) result = caseCountable(regularAttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ENUMERATION_ATTRIBUTE_ECLASS: {
				EnumerationAttributeEClass enumerationAttributeEClass = (EnumerationAttributeEClass)theEObject;
				T result = caseEnumerationAttributeEClass(enumerationAttributeEClass);
				if (result == null) result = caseAttributeEClass(enumerationAttributeEClass);
				if (result == null) result = caseNamedElement(enumerationAttributeEClass);
				if (result == null) result = caseNegatableElement(enumerationAttributeEClass);
				if (result == null) result = caseCountable(enumerationAttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_TYPE: {
				FunctionalType functionalType = (FunctionalType)theEObject;
				T result = caseFunctionalType(functionalType);
				if (result == null) result = caseType(functionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseTypedElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REFERENCE_ARGUMENT: {
				ReferenceArgument referenceArgument = (ReferenceArgument)theEObject;
				T result = caseReferenceArgument(referenceArgument);
				if (result == null) result = caseArgument(referenceArgument);
				if (result == null) result = caseTypedElement(referenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT: {
				Countable_ReferenceArgument countable_ReferenceArgument = (Countable_ReferenceArgument)theEObject;
				T result = caseCountable_ReferenceArgument(countable_ReferenceArgument);
				if (result == null) result = caseReferenceArgument(countable_ReferenceArgument);
				if (result == null) result = caseArgument(countable_ReferenceArgument);
				if (result == null) result = caseTypedElement(countable_ReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_ARGUMENT: {
				Calculateable_Argument calculateable_Argument = (Calculateable_Argument)theEObject;
				T result = caseCalculateable_Argument(calculateable_Argument);
				if (result == null) result = caseReferenceArgument(calculateable_Argument);
				if (result == null) result = caseFunctionalArgument(calculateable_Argument);
				if (result == null) result = caseArgument(calculateable_Argument);
				if (result == null) result = caseTypedElement(calculateable_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				CalculateableElement_ReferenceArgument calculateableElement_ReferenceArgument = (CalculateableElement_ReferenceArgument)theEObject;
				T result = caseCalculateableElement_ReferenceArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseReferenceArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseFunctionalArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseArgument(calculateableElement_ReferenceArgument);
				if (result == null) result = caseTypedElement(calculateableElement_ReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_ARGUMENT: {
				FunctionalArgument functionalArgument = (FunctionalArgument)theEObject;
				T result = caseFunctionalArgument(functionalArgument);
				if (result == null) result = caseArgument(functionalArgument);
				if (result == null) result = caseTypedElement(functionalArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_OPERATION_ARGUMENT: {
				EvaluationOperation_Argument evaluationOperation_Argument = (EvaluationOperation_Argument)theEObject;
				T result = caseEvaluationOperation_Argument(evaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(evaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(evaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(evaluationOperation_Argument);
				if (result == null) result = caseArgument(evaluationOperation_Argument);
				if (result == null) result = caseTypedElement(evaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PRIMITIVE_ARGUMENT: {
				PrimitiveArgument primitiveArgument = (PrimitiveArgument)theEObject;
				T result = casePrimitiveArgument(primitiveArgument);
				if (result == null) result = caseFunctionalArgument(primitiveArgument);
				if (result == null) result = caseArgument(primitiveArgument);
				if (result == null) result = caseTypedElement(primitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER: {
				CountableReferenceParameter countableReferenceParameter = (CountableReferenceParameter)theEObject;
				T result = caseCountableReferenceParameter(countableReferenceParameter);
				if (result == null) result = caseParameter(countableReferenceParameter);
				if (result == null) result = caseTypedElement(countableReferenceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATEABLE_PARAMETER: {
				CalculateableParameter calculateableParameter = (CalculateableParameter)theEObject;
				T result = caseCalculateableParameter(calculateableParameter);
				if (result == null) result = caseParameter(calculateableParameter);
				if (result == null) result = caseTypedElement(calculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_PARAMETER: {
				FunctionalParameter functionalParameter = (FunctionalParameter)theEObject;
				T result = caseFunctionalParameter(functionalParameter);
				if (result == null) result = caseParameter(functionalParameter);
				if (result == null) result = caseTypedElement(functionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_CALCULATEABLE: {
				Integer_Calculateable integer_Calculateable = (Integer_Calculateable)theEObject;
				T result = caseInteger_Calculateable(integer_Calculateable);
				if (result == null) result = caseCalculateable(integer_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT: {
				Integer_CalculateableElement integer_CalculateableElement = (Integer_CalculateableElement)theEObject;
				T result = caseInteger_CalculateableElement(integer_CalculateableElement);
				if (result == null) result = caseInteger_Calculateable(integer_CalculateableElement);
				if (result == null) result = caseCalculateableElement(integer_CalculateableElement);
				if (result == null) result = caseCalculateable(integer_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXPRESSION_OPERATOR: {
				ExpressionOperator expressionOperator = (ExpressionOperator)theEObject;
				T result = caseExpressionOperator(expressionOperator);
				if (result == null) result = caseOperator(expressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ENUMERATION_OPERATOR: {
				EnumerationOperator enumerationOperator = (EnumerationOperator)theEObject;
				T result = caseEnumerationOperator(enumerationOperator);
				if (result == null) result = caseOperator(enumerationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BIT_OPERATOR: {
				BitOperator bitOperator = (BitOperator)theEObject;
				T result = caseBitOperator(bitOperator);
				if (result == null) result = caseExpressionOperator(bitOperator);
				if (result == null) result = caseNegatableElement(bitOperator);
				if (result == null) result = caseOperator(bitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FUNCTIONAL_OPERATOR: {
				FunctionalOperator functionalOperator = (FunctionalOperator)theEObject;
				T result = caseFunctionalOperator(functionalOperator);
				if (result == null) result = caseExpressionOperator(functionalOperator);
				if (result == null) result = caseTypedElement(functionalOperator);
				if (result == null) result = caseOperator(functionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CLASS_OPERATOR: {
				ClassOperator classOperator = (ClassOperator)theEObject;
				T result = caseClassOperator(classOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(classOperator);
				if (result == null) result = caseEvaluationOperator(classOperator);
				if (result == null) result = caseFunctionalOperator(classOperator);
				if (result == null) result = caseExpressionOperator(classOperator);
				if (result == null) result = caseTypedElement(classOperator);
				if (result == null) result = caseOperator(classOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_OPERATOR: {
				EvaluationOperator evaluationOperator = (EvaluationOperator)theEObject;
				T result = caseEvaluationOperator(evaluationOperator);
				if (result == null) result = caseOperator(evaluationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_FUNCTIONAL_OPERATOR: {
				EvaluationFunctionalOperator evaluationFunctionalOperator = (EvaluationFunctionalOperator)theEObject;
				T result = caseEvaluationFunctionalOperator(evaluationFunctionalOperator);
				if (result == null) result = caseEvaluationOperator(evaluationFunctionalOperator);
				if (result == null) result = caseFunctionalOperator(evaluationFunctionalOperator);
				if (result == null) result = caseExpressionOperator(evaluationFunctionalOperator);
				if (result == null) result = caseTypedElement(evaluationFunctionalOperator);
				if (result == null) result = caseOperator(evaluationFunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.AGGREGATION_OPERATOR: {
				AggregationOperator aggregationOperator = (AggregationOperator)theEObject;
				T result = caseAggregationOperator(aggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(aggregationOperator);
				if (result == null) result = caseInteger_Calculateable(aggregationOperator);
				if (result == null) result = caseEvaluationOperator(aggregationOperator);
				if (result == null) result = caseFunctionalOperator(aggregationOperator);
				if (result == null) result = caseCalculateable(aggregationOperator);
				if (result == null) result = caseExpressionOperator(aggregationOperator);
				if (result == null) result = caseTypedElement(aggregationOperator);
				if (result == null) result = caseOperator(aggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EVALUATION_BIT_OPERATOR: {
				EvaluationBitOperator evaluationBitOperator = (EvaluationBitOperator)theEObject;
				T result = caseEvaluationBitOperator(evaluationBitOperator);
				if (result == null) result = caseEvaluationOperator(evaluationBitOperator);
				if (result == null) result = caseBitOperator(evaluationBitOperator);
				if (result == null) result = caseExpressionOperator(evaluationBitOperator);
				if (result == null) result = caseNegatableElement(evaluationBitOperator);
				if (result == null) result = caseOperator(evaluationBitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.AND_EVALUATION_BIT_OPERATOR: {
				And_EvaluationBitOperator and_EvaluationBitOperator = (And_EvaluationBitOperator)theEObject;
				T result = caseAnd_EvaluationBitOperator(and_EvaluationBitOperator);
				if (result == null) result = caseEvaluationBitOperator(and_EvaluationBitOperator);
				if (result == null) result = caseEvaluationOperator(and_EvaluationBitOperator);
				if (result == null) result = caseBitOperator(and_EvaluationBitOperator);
				if (result == null) result = caseExpressionOperator(and_EvaluationBitOperator);
				if (result == null) result = caseNegatableElement(and_EvaluationBitOperator);
				if (result == null) result = caseOperator(and_EvaluationBitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OR_EVALUATION_BIT_OPERATOR: {
				Or_EvaluationBitOperator or_EvaluationBitOperator = (Or_EvaluationBitOperator)theEObject;
				T result = caseOr_EvaluationBitOperator(or_EvaluationBitOperator);
				if (result == null) result = caseEvaluationBitOperator(or_EvaluationBitOperator);
				if (result == null) result = caseEvaluationOperator(or_EvaluationBitOperator);
				if (result == null) result = caseBitOperator(or_EvaluationBitOperator);
				if (result == null) result = caseExpressionOperator(or_EvaluationBitOperator);
				if (result == null) result = caseNegatableElement(or_EvaluationBitOperator);
				if (result == null) result = caseOperator(or_EvaluationBitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR: {
				CountingAggregationOperator countingAggregationOperator = (CountingAggregationOperator)theEObject;
				T result = caseCountingAggregationOperator(countingAggregationOperator);
				if (result == null) result = caseAggregationOperator(countingAggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(countingAggregationOperator);
				if (result == null) result = caseInteger_Calculateable(countingAggregationOperator);
				if (result == null) result = caseEvaluationOperator(countingAggregationOperator);
				if (result == null) result = caseFunctionalOperator(countingAggregationOperator);
				if (result == null) result = caseCalculateable(countingAggregationOperator);
				if (result == null) result = caseExpressionOperator(countingAggregationOperator);
				if (result == null) result = caseTypedElement(countingAggregationOperator);
				if (result == null) result = caseOperator(countingAggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CALCULATING_AGGREGATION_OPERATOR: {
				CalculatingAggregationOperator calculatingAggregationOperator = (CalculatingAggregationOperator)theEObject;
				T result = caseCalculatingAggregationOperator(calculatingAggregationOperator);
				if (result == null) result = caseAggregationOperator(calculatingAggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(calculatingAggregationOperator);
				if (result == null) result = caseInteger_Calculateable(calculatingAggregationOperator);
				if (result == null) result = caseEvaluationOperator(calculatingAggregationOperator);
				if (result == null) result = caseFunctionalOperator(calculatingAggregationOperator);
				if (result == null) result = caseCalculateable(calculatingAggregationOperator);
				if (result == null) result = caseExpressionOperator(calculatingAggregationOperator);
				if (result == null) result = caseTypedElement(calculatingAggregationOperator);
				if (result == null) result = caseOperator(calculatingAggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE: {
				String_Calculateable string_Calculateable = (String_Calculateable)theEObject;
				T result = caseString_Calculateable(string_Calculateable);
				if (result == null) result = caseCalculateable(string_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT: {
				String_CalculateableElement string_CalculateableElement = (String_CalculateableElement)theEObject;
				T result = caseString_CalculateableElement(string_CalculateableElement);
				if (result == null) result = caseString_Calculateable(string_CalculateableElement);
				if (result == null) result = caseCalculateableElement(string_CalculateableElement);
				if (result == null) result = caseCalculateable(string_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_ATTRIBUTE_ECLASS: {
				String_AttributeEClass string_AttributeEClass = (String_AttributeEClass)theEObject;
				T result = caseString_AttributeEClass(string_AttributeEClass);
				if (result == null) result = caseRegularAttributeEClass(string_AttributeEClass);
				if (result == null) result = caseString_CalculateableElement(string_AttributeEClass);
				if (result == null) result = caseAttributeEClass(string_AttributeEClass);
				if (result == null) result = caseString_Calculateable(string_AttributeEClass);
				if (result == null) result = caseCalculateableElement(string_AttributeEClass);
				if (result == null) result = caseNamedElement(string_AttributeEClass);
				if (result == null) result = caseNegatableElement(string_AttributeEClass);
				if (result == null) result = caseCountable(string_AttributeEClass);
				if (result == null) result = caseCalculateable(string_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_OPERATOR: {
				String_Operator string_Operator = (String_Operator)theEObject;
				T result = caseString_Operator(string_Operator);
				if (result == null) result = caseOperator(string_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_TYPE: {
				String_Type string_Type = (String_Type)theEObject;
				T result = caseString_Type(string_Type);
				if (result == null) result = caseCharSequence_Type(string_Type);
				if (result == null) result = caseObject_Type(string_Type);
				if (result == null) result = caseType(string_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_FUNCTIONAL_TYPE: {
				String_FunctionalType string_FunctionalType = (String_FunctionalType)theEObject;
				T result = caseString_FunctionalType(string_FunctionalType);
				if (result == null) result = caseString_Type(string_FunctionalType);
				if (result == null) result = caseFunctionalType(string_FunctionalType);
				if (result == null) result = caseCharSequence_Type(string_FunctionalType);
				if (result == null) result = caseObject_Type(string_FunctionalType);
				if (result == null) result = caseType(string_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER: {
				String_CalculateableParameter string_CalculateableParameter = (String_CalculateableParameter)theEObject;
				T result = caseString_CalculateableParameter(string_CalculateableParameter);
				if (result == null) result = caseString_Type(string_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(string_CalculateableParameter);
				if (result == null) result = caseCharSequence_Type(string_CalculateableParameter);
				if (result == null) result = caseParameter(string_CalculateableParameter);
				if (result == null) result = caseObject_Type(string_CalculateableParameter);
				if (result == null) result = caseTypedElement(string_CalculateableParameter);
				if (result == null) result = caseType(string_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_FUNCTIONAL_PARAMETER: {
				String_FunctionalParameter string_FunctionalParameter = (String_FunctionalParameter)theEObject;
				T result = caseString_FunctionalParameter(string_FunctionalParameter);
				if (result == null) result = caseString_Type(string_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(string_FunctionalParameter);
				if (result == null) result = caseCharSequence_Type(string_FunctionalParameter);
				if (result == null) result = caseParameter(string_FunctionalParameter);
				if (result == null) result = caseObject_Type(string_FunctionalParameter);
				if (result == null) result = caseTypedElement(string_FunctionalParameter);
				if (result == null) result = caseType(string_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_ARGUMENT: {
				String_Argument string_Argument = (String_Argument)theEObject;
				T result = caseString_Argument(string_Argument);
				if (result == null) result = caseFunctionalArgument(string_Argument);
				if (result == null) result = caseString_FunctionalType(string_Argument);
				if (result == null) result = caseArgument(string_Argument);
				if (result == null) result = caseString_Type(string_Argument);
				if (result == null) result = caseFunctionalType(string_Argument);
				if (result == null) result = caseTypedElement(string_Argument);
				if (result == null) result = caseCharSequence_Type(string_Argument);
				if (result == null) result = caseObject_Type(string_Argument);
				if (result == null) result = caseType(string_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_PRIMITIVE_ARGUMENT: {
				String_PrimitiveArgument string_PrimitiveArgument = (String_PrimitiveArgument)theEObject;
				T result = caseString_PrimitiveArgument(string_PrimitiveArgument);
				if (result == null) result = caseString_Argument(string_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(string_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(string_PrimitiveArgument);
				if (result == null) result = caseString_FunctionalType(string_PrimitiveArgument);
				if (result == null) result = caseArgument(string_PrimitiveArgument);
				if (result == null) result = caseString_Type(string_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(string_PrimitiveArgument);
				if (result == null) result = caseTypedElement(string_PrimitiveArgument);
				if (result == null) result = caseCharSequence_Type(string_PrimitiveArgument);
				if (result == null) result = caseObject_Type(string_PrimitiveArgument);
				if (result == null) result = caseType(string_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_EVALUATION_OPERATION_ARGUMENT: {
				String_EvaluationOperation_Argument string_EvaluationOperation_Argument = (String_EvaluationOperation_Argument)theEObject;
				T result = caseString_EvaluationOperation_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseString_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(string_EvaluationOperation_Argument);
				if (result == null) result = caseString_FunctionalType(string_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(string_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(string_EvaluationOperation_Argument);
				if (result == null) result = caseString_Type(string_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(string_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(string_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_Type(string_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(string_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(string_EvaluationOperation_Argument);
				if (result == null) result = caseType(string_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument = (String_CalculateableElementReferenceArgument)theEObject;
				T result = caseString_CalculateableElementReferenceArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateableElement_ReferenceArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseString_FunctionalType(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseString_Type(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalType(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseReferenceArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseCharSequence_Type(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseArgument(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseObject_Type(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseTypedElement(string_CalculateableElementReferenceArgument);
				if (result == null) result = caseType(string_CalculateableElementReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_EXPRESSION_OPERATOR: {
				String_ExpressionOperator string_ExpressionOperator = (String_ExpressionOperator)theEObject;
				T result = caseString_ExpressionOperator(string_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(string_ExpressionOperator);
				if (result == null) result = caseString_Operator(string_ExpressionOperator);
				if (result == null) result = caseOperator(string_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_BIT_OPERATOR: {
				String_BitOperator string_BitOperator = (String_BitOperator)theEObject;
				T result = caseString_BitOperator(string_BitOperator);
				if (result == null) result = caseString_ExpressionOperator(string_BitOperator);
				if (result == null) result = caseBitOperator(string_BitOperator);
				if (result == null) result = caseExpressionOperator(string_BitOperator);
				if (result == null) result = caseString_Operator(string_BitOperator);
				if (result == null) result = caseNegatableElement(string_BitOperator);
				if (result == null) result = caseOperator(string_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_AND_BIT_OPERATOR: {
				String_And_BitOperator string_And_BitOperator = (String_And_BitOperator)theEObject;
				T result = caseString_And_BitOperator(string_And_BitOperator);
				if (result == null) result = caseString_BitOperator(string_And_BitOperator);
				if (result == null) result = caseString_ExpressionOperator(string_And_BitOperator);
				if (result == null) result = caseBitOperator(string_And_BitOperator);
				if (result == null) result = caseExpressionOperator(string_And_BitOperator);
				if (result == null) result = caseString_Operator(string_And_BitOperator);
				if (result == null) result = caseNegatableElement(string_And_BitOperator);
				if (result == null) result = caseOperator(string_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_OR_BIT_OPERATOR: {
				String_Or_BitOperator string_Or_BitOperator = (String_Or_BitOperator)theEObject;
				T result = caseString_Or_BitOperator(string_Or_BitOperator);
				if (result == null) result = caseString_BitOperator(string_Or_BitOperator);
				if (result == null) result = caseString_ExpressionOperator(string_Or_BitOperator);
				if (result == null) result = caseBitOperator(string_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(string_Or_BitOperator);
				if (result == null) result = caseString_Operator(string_Or_BitOperator);
				if (result == null) result = caseNegatableElement(string_Or_BitOperator);
				if (result == null) result = caseOperator(string_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_ORIGINAL_FUNCTIONAL_OPERATOR: {
				String_Original_FunctionalOperator string_Original_FunctionalOperator = (String_Original_FunctionalOperator)theEObject;
				T result = caseString_Original_FunctionalOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(string_Original_FunctionalOperator);
				if (result == null) result = caseString_Operator(string_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(string_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_ROLE_ATTRIBUTE_NAME_ATTR_ECLASS: {
				AttributeNameMapping_roleAttributeName_AttrEClass attributeNameMapping_roleAttributeName_AttrEClass = (AttributeNameMapping_roleAttributeName_AttrEClass)theEObject;
				T result = caseAttributeNameMapping_roleAttributeName_AttrEClass(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseAttributeEClass(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseString_Calculateable(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseCalculateableElement(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseNamedElement(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseNegatableElement(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseCountable(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = caseCalculateable(attributeNameMapping_roleAttributeName_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS: {
				AttributeNameMapping_systemUnitAttributeName_AttrEClass attributeNameMapping_systemUnitAttributeName_AttrEClass = (AttributeNameMapping_systemUnitAttributeName_AttrEClass)theEObject;
				T result = caseAttributeNameMapping_systemUnitAttributeName_AttrEClass(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseAttributeEClass(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseString_Calculateable(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseCalculateableElement(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseNamedElement(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseNegatableElement(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseCountable(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = caseCalculateable(attributeNameMapping_systemUnitAttributeName_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DEFAULT_VALUE_ATTR_ECLASS: {
				Attribute_defaultValue_AttrEClass attribute_defaultValue_AttrEClass = (Attribute_defaultValue_AttrEClass)theEObject;
				T result = caseAttribute_defaultValue_AttrEClass(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseAttributeEClass(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseString_Calculateable(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseCalculateableElement(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseNamedElement(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseNegatableElement(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseCountable(attribute_defaultValue_AttrEClass);
				if (result == null) result = caseCalculateable(attribute_defaultValue_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_VALUE_ATTR_ECLASS: {
				Attribute_value_AttrEClass attribute_value_AttrEClass = (Attribute_value_AttrEClass)theEObject;
				T result = caseAttribute_value_AttrEClass(attribute_value_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(attribute_value_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attribute_value_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(attribute_value_AttrEClass);
				if (result == null) result = caseAttributeEClass(attribute_value_AttrEClass);
				if (result == null) result = caseString_Calculateable(attribute_value_AttrEClass);
				if (result == null) result = caseCalculateableElement(attribute_value_AttrEClass);
				if (result == null) result = caseNamedElement(attribute_value_AttrEClass);
				if (result == null) result = caseNegatableElement(attribute_value_AttrEClass);
				if (result == null) result = caseCountable(attribute_value_AttrEClass);
				if (result == null) result = caseCalculateable(attribute_value_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE: {
				AttributeDataType_Calculateable attributeDataType_Calculateable = (AttributeDataType_Calculateable)theEObject;
				T result = caseAttributeDataType_Calculateable(attributeDataType_Calculateable);
				if (result == null) result = caseCalculateable(attributeDataType_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT: {
				AttributeDataType_CalculateableElement attributeDataType_CalculateableElement = (AttributeDataType_CalculateableElement)theEObject;
				T result = caseAttributeDataType_CalculateableElement(attributeDataType_CalculateableElement);
				if (result == null) result = caseAttributeDataType_Calculateable(attributeDataType_CalculateableElement);
				if (result == null) result = caseCalculateableElement(attributeDataType_CalculateableElement);
				if (result == null) result = caseCalculateable(attributeDataType_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_ATTRIBUTE_ECLASS: {
				AttributeDataType_AttributeEClass attributeDataType_AttributeEClass = (AttributeDataType_AttributeEClass)theEObject;
				T result = caseAttributeDataType_AttributeEClass(attributeDataType_AttributeEClass);
				if (result == null) result = caseRegularAttributeEClass(attributeDataType_AttributeEClass);
				if (result == null) result = caseAttributeDataType_CalculateableElement(attributeDataType_AttributeEClass);
				if (result == null) result = caseAttributeEClass(attributeDataType_AttributeEClass);
				if (result == null) result = caseAttributeDataType_Calculateable(attributeDataType_AttributeEClass);
				if (result == null) result = caseCalculateableElement(attributeDataType_AttributeEClass);
				if (result == null) result = caseNamedElement(attributeDataType_AttributeEClass);
				if (result == null) result = caseNegatableElement(attributeDataType_AttributeEClass);
				if (result == null) result = caseCountable(attributeDataType_AttributeEClass);
				if (result == null) result = caseCalculateable(attributeDataType_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_OPERATOR: {
				AttributeDataType_Operator attributeDataType_Operator = (AttributeDataType_Operator)theEObject;
				T result = caseAttributeDataType_Operator(attributeDataType_Operator);
				if (result == null) result = caseOperator(attributeDataType_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_TYPE: {
				AttributeDataType_Type attributeDataType_Type = (AttributeDataType_Type)theEObject;
				T result = caseAttributeDataType_Type(attributeDataType_Type);
				if (result == null) result = caseType(attributeDataType_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_TYPE: {
				AttributeDataType_FunctionalType attributeDataType_FunctionalType = (AttributeDataType_FunctionalType)theEObject;
				T result = caseAttributeDataType_FunctionalType(attributeDataType_FunctionalType);
				if (result == null) result = caseAttributeDataType_Type(attributeDataType_FunctionalType);
				if (result == null) result = caseFunctionalType(attributeDataType_FunctionalType);
				if (result == null) result = caseType(attributeDataType_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_PARAMETER: {
				AttributeDataType_CalculateableParameter attributeDataType_CalculateableParameter = (AttributeDataType_CalculateableParameter)theEObject;
				T result = caseAttributeDataType_CalculateableParameter(attributeDataType_CalculateableParameter);
				if (result == null) result = caseAttributeDataType_Type(attributeDataType_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(attributeDataType_CalculateableParameter);
				if (result == null) result = caseType(attributeDataType_CalculateableParameter);
				if (result == null) result = caseParameter(attributeDataType_CalculateableParameter);
				if (result == null) result = caseTypedElement(attributeDataType_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_PARAMETER: {
				AttributeDataType_FunctionalParameter attributeDataType_FunctionalParameter = (AttributeDataType_FunctionalParameter)theEObject;
				T result = caseAttributeDataType_FunctionalParameter(attributeDataType_FunctionalParameter);
				if (result == null) result = caseAttributeDataType_Type(attributeDataType_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(attributeDataType_FunctionalParameter);
				if (result == null) result = caseType(attributeDataType_FunctionalParameter);
				if (result == null) result = caseParameter(attributeDataType_FunctionalParameter);
				if (result == null) result = caseTypedElement(attributeDataType_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_ARGUMENT: {
				AttributeDataType_Argument attributeDataType_Argument = (AttributeDataType_Argument)theEObject;
				T result = caseAttributeDataType_Argument(attributeDataType_Argument);
				if (result == null) result = caseFunctionalArgument(attributeDataType_Argument);
				if (result == null) result = caseAttributeDataType_FunctionalType(attributeDataType_Argument);
				if (result == null) result = caseArgument(attributeDataType_Argument);
				if (result == null) result = caseAttributeDataType_Type(attributeDataType_Argument);
				if (result == null) result = caseFunctionalType(attributeDataType_Argument);
				if (result == null) result = caseTypedElement(attributeDataType_Argument);
				if (result == null) result = caseType(attributeDataType_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_PRIMITIVE_ARGUMENT: {
				AttributeDataType_PrimitiveArgument attributeDataType_PrimitiveArgument = (AttributeDataType_PrimitiveArgument)theEObject;
				T result = caseAttributeDataType_PrimitiveArgument(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseAttributeDataType_Argument(attributeDataType_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseAttributeDataType_FunctionalType(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseArgument(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseAttributeDataType_Type(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseTypedElement(attributeDataType_PrimitiveArgument);
				if (result == null) result = caseType(attributeDataType_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_EVALUATION_OPERATION_ARGUMENT: {
				AttributeDataType_EvaluationOperation_Argument attributeDataType_EvaluationOperation_Argument = (AttributeDataType_EvaluationOperation_Argument)theEObject;
				T result = caseAttributeDataType_EvaluationOperation_Argument(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseAttributeDataType_Argument(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseAttributeDataType_FunctionalType(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseAttributeDataType_Type(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseType(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(attributeDataType_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				AttributeDataType_CalculateableElementReferenceArgument attributeDataType_CalculateableElementReferenceArgument = (AttributeDataType_CalculateableElementReferenceArgument)theEObject;
				T result = caseAttributeDataType_CalculateableElementReferenceArgument(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateableElement_ReferenceArgument(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseAttributeDataType_FunctionalType(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseAttributeDataType_Type(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalType(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseReferenceArgument(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalArgument(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseType(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseArgument(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = caseTypedElement(attributeDataType_CalculateableElementReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_EXPRESSION_OPERATOR: {
				AttributeDataType_ExpressionOperator attributeDataType_ExpressionOperator = (AttributeDataType_ExpressionOperator)theEObject;
				T result = caseAttributeDataType_ExpressionOperator(attributeDataType_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(attributeDataType_ExpressionOperator);
				if (result == null) result = caseAttributeDataType_Operator(attributeDataType_ExpressionOperator);
				if (result == null) result = caseOperator(attributeDataType_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_BIT_OPERATOR: {
				AttributeDataType_BitOperator attributeDataType_BitOperator = (AttributeDataType_BitOperator)theEObject;
				T result = caseAttributeDataType_BitOperator(attributeDataType_BitOperator);
				if (result == null) result = caseAttributeDataType_ExpressionOperator(attributeDataType_BitOperator);
				if (result == null) result = caseBitOperator(attributeDataType_BitOperator);
				if (result == null) result = caseExpressionOperator(attributeDataType_BitOperator);
				if (result == null) result = caseAttributeDataType_Operator(attributeDataType_BitOperator);
				if (result == null) result = caseNegatableElement(attributeDataType_BitOperator);
				if (result == null) result = caseOperator(attributeDataType_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_AND_BIT_OPERATOR: {
				AttributeDataType_And_BitOperator attributeDataType_And_BitOperator = (AttributeDataType_And_BitOperator)theEObject;
				T result = caseAttributeDataType_And_BitOperator(attributeDataType_And_BitOperator);
				if (result == null) result = caseAttributeDataType_BitOperator(attributeDataType_And_BitOperator);
				if (result == null) result = caseAttributeDataType_ExpressionOperator(attributeDataType_And_BitOperator);
				if (result == null) result = caseBitOperator(attributeDataType_And_BitOperator);
				if (result == null) result = caseExpressionOperator(attributeDataType_And_BitOperator);
				if (result == null) result = caseAttributeDataType_Operator(attributeDataType_And_BitOperator);
				if (result == null) result = caseNegatableElement(attributeDataType_And_BitOperator);
				if (result == null) result = caseOperator(attributeDataType_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_OR_BIT_OPERATOR: {
				AttributeDataType_Or_BitOperator attributeDataType_Or_BitOperator = (AttributeDataType_Or_BitOperator)theEObject;
				T result = caseAttributeDataType_Or_BitOperator(attributeDataType_Or_BitOperator);
				if (result == null) result = caseAttributeDataType_BitOperator(attributeDataType_Or_BitOperator);
				if (result == null) result = caseAttributeDataType_ExpressionOperator(attributeDataType_Or_BitOperator);
				if (result == null) result = caseBitOperator(attributeDataType_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(attributeDataType_Or_BitOperator);
				if (result == null) result = caseAttributeDataType_Operator(attributeDataType_Or_BitOperator);
				if (result == null) result = caseNegatableElement(attributeDataType_Or_BitOperator);
				if (result == null) result = caseOperator(attributeDataType_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_OPERATOR: {
				AttributeDataType_FunctionalOperator attributeDataType_FunctionalOperator = (AttributeDataType_FunctionalOperator)theEObject;
				T result = caseAttributeDataType_FunctionalOperator(attributeDataType_FunctionalOperator);
				if (result == null) result = caseAttributeDataType_ExpressionOperator(attributeDataType_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(attributeDataType_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(attributeDataType_FunctionalOperator);
				if (result == null) result = caseAttributeDataType_Operator(attributeDataType_FunctionalOperator);
				if (result == null) result = caseTypedElement(attributeDataType_FunctionalOperator);
				if (result == null) result = caseOperator(attributeDataType_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_ATTRIBUTE_DATA_TYPE_ATTR_ECLASS: {
				Attribute_attributeDataType_AttrEClass attribute_attributeDataType_AttrEClass = (Attribute_attributeDataType_AttrEClass)theEObject;
				T result = caseAttribute_attributeDataType_AttrEClass(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseAttributeDataType_AttributeEClass(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseAttributeDataType_CalculateableElement(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseAttributeEClass(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseAttributeDataType_Calculateable(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseCalculateableElement(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseNamedElement(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseNegatableElement(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseCountable(attribute_attributeDataType_AttrEClass);
				if (result == null) result = caseCalculateable(attribute_attributeDataType_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_REF_ATTRIBUTE_TYPE_ATTR_ECLASS: {
				Attribute_refAttributeType_AttrEClass attribute_refAttributeType_AttrEClass = (Attribute_refAttributeType_AttrEClass)theEObject;
				T result = caseAttribute_refAttributeType_AttrEClass(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseAttributeEClass(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseString_Calculateable(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseCalculateableElement(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseNamedElement(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseNegatableElement(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseCountable(attribute_refAttributeType_AttrEClass);
				if (result == null) result = caseCalculateable(attribute_refAttributeType_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_UNIT_ATTR_ECLASS: {
				Attribute_unit_AttrEClass attribute_unit_AttrEClass = (Attribute_unit_AttrEClass)theEObject;
				T result = caseAttribute_unit_AttrEClass(attribute_unit_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(attribute_unit_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attribute_unit_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(attribute_unit_AttrEClass);
				if (result == null) result = caseAttributeEClass(attribute_unit_AttrEClass);
				if (result == null) result = caseString_Calculateable(attribute_unit_AttrEClass);
				if (result == null) result = caseCalculateableElement(attribute_unit_AttrEClass);
				if (result == null) result = caseNamedElement(attribute_unit_AttrEClass);
				if (result == null) result = caseNegatableElement(attribute_unit_AttrEClass);
				if (result == null) result = caseCountable(attribute_unit_AttrEClass);
				if (result == null) result = caseCalculateable(attribute_unit_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_NAME_ATTR_ECLASS: {
				AttributeValueRequirement_name_AttrEClass attributeValueRequirement_name_AttrEClass = (AttributeValueRequirement_name_AttrEClass)theEObject;
				T result = caseAttributeValueRequirement_name_AttrEClass(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseAttributeEClass(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseString_Calculateable(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseCalculateableElement(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseNamedElement(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseNegatableElement(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseCountable(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = caseCalculateable(attributeValueRequirement_name_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHANGE_MODE_CALCULATEABLE: {
				ChangeMode_Calculateable changeMode_Calculateable = (ChangeMode_Calculateable)theEObject;
				T result = caseChangeMode_Calculateable(changeMode_Calculateable);
				if (result == null) result = caseCalculateable(changeMode_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHANGE_MODE_CALCULATEABLE_ELEMENT: {
				ChangeMode_CalculateableElement changeMode_CalculateableElement = (ChangeMode_CalculateableElement)theEObject;
				T result = caseChangeMode_CalculateableElement(changeMode_CalculateableElement);
				if (result == null) result = caseChangeMode_Calculateable(changeMode_CalculateableElement);
				if (result == null) result = caseCalculateableElement(changeMode_CalculateableElement);
				if (result == null) result = caseCalculateable(changeMode_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHANGE_MODE_OPERATOR: {
				ChangeMode_Operator changeMode_Operator = (ChangeMode_Operator)theEObject;
				T result = caseChangeMode_Operator(changeMode_Operator);
				if (result == null) result = caseOperator(changeMode_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR: {
				ChangeMode_EnumerationOperator changeMode_EnumerationOperator = (ChangeMode_EnumerationOperator)theEObject;
				T result = caseChangeMode_EnumerationOperator(changeMode_EnumerationOperator);
				if (result == null) result = caseEnumerationOperator(changeMode_EnumerationOperator);
				if (result == null) result = caseChangeMode_Operator(changeMode_EnumerationOperator);
				if (result == null) result = caseOperator(changeMode_EnumerationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHANGE_MODE_ATTRIBUTE_ECLASS: {
				ChangeMode_AttributeEClass changeMode_AttributeEClass = (ChangeMode_AttributeEClass)theEObject;
				T result = caseChangeMode_AttributeEClass(changeMode_AttributeEClass);
				if (result == null) result = caseEnumerationAttributeEClass(changeMode_AttributeEClass);
				if (result == null) result = caseAttributeEClass(changeMode_AttributeEClass);
				if (result == null) result = caseNamedElement(changeMode_AttributeEClass);
				if (result == null) result = caseNegatableElement(changeMode_AttributeEClass);
				if (result == null) result = caseCountable(changeMode_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_BASIC_OBJECT_CHANGE_MODE_ATTR_ECLASS: {
				CAEXBasicObject_changeMode_AttrEClass caexBasicObject_changeMode_AttrEClass = (CAEXBasicObject_changeMode_AttrEClass)theEObject;
				T result = caseCAEXBasicObject_changeMode_AttrEClass(caexBasicObject_changeMode_AttrEClass);
				if (result == null) result = caseChangeMode_AttributeEClass(caexBasicObject_changeMode_AttrEClass);
				if (result == null) result = caseEnumerationAttributeEClass(caexBasicObject_changeMode_AttrEClass);
				if (result == null) result = caseAttributeEClass(caexBasicObject_changeMode_AttrEClass);
				if (result == null) result = caseNamedElement(caexBasicObject_changeMode_AttrEClass);
				if (result == null) result = caseNegatableElement(caexBasicObject_changeMode_AttrEClass);
				if (result == null) result = caseCountable(caexBasicObject_changeMode_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_FILE_SUPERIOR_STANDARD_VERSION_ATTR_ECLASS: {
				CAEXFile_superiorStandardVersion_AttrEClass caexFile_superiorStandardVersion_AttrEClass = (CAEXFile_superiorStandardVersion_AttrEClass)theEObject;
				T result = caseCAEXFile_superiorStandardVersion_AttrEClass(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseAttributeEClass(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseString_Calculateable(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseCalculateableElement(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseNamedElement(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseNegatableElement(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseCountable(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = caseCalculateable(caexFile_superiorStandardVersion_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_FILE_FILE_NAME_ATTR_ECLASS: {
				CAEXFile_fileName_AttrEClass caexFile_fileName_AttrEClass = (CAEXFile_fileName_AttrEClass)theEObject;
				T result = caseCAEXFile_fileName_AttrEClass(caexFile_fileName_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(caexFile_fileName_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(caexFile_fileName_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(caexFile_fileName_AttrEClass);
				if (result == null) result = caseAttributeEClass(caexFile_fileName_AttrEClass);
				if (result == null) result = caseString_Calculateable(caexFile_fileName_AttrEClass);
				if (result == null) result = caseCalculateableElement(caexFile_fileName_AttrEClass);
				if (result == null) result = caseNamedElement(caexFile_fileName_AttrEClass);
				if (result == null) result = caseNegatableElement(caexFile_fileName_AttrEClass);
				if (result == null) result = caseCountable(caexFile_fileName_AttrEClass);
				if (result == null) result = caseCalculateable(caexFile_fileName_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_FILE_SCHEMA_VERSION_ATTR_ECLASS: {
				CAEXFile_schemaVersion_AttrEClass caexFile_schemaVersion_AttrEClass = (CAEXFile_schemaVersion_AttrEClass)theEObject;
				T result = caseCAEXFile_schemaVersion_AttrEClass(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseAttributeEClass(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseString_Calculateable(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseCalculateableElement(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseNamedElement(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseNegatableElement(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseCountable(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = caseCalculateable(caexFile_schemaVersion_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_OBJECT_ID_ATTR_ECLASS: {
				CAEXObject_iD_AttrEClass caexObject_iD_AttrEClass = (CAEXObject_iD_AttrEClass)theEObject;
				T result = caseCAEXObject_iD_AttrEClass(caexObject_iD_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(caexObject_iD_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(caexObject_iD_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(caexObject_iD_AttrEClass);
				if (result == null) result = caseAttributeEClass(caexObject_iD_AttrEClass);
				if (result == null) result = caseString_Calculateable(caexObject_iD_AttrEClass);
				if (result == null) result = caseCalculateableElement(caexObject_iD_AttrEClass);
				if (result == null) result = caseNamedElement(caexObject_iD_AttrEClass);
				if (result == null) result = caseNegatableElement(caexObject_iD_AttrEClass);
				if (result == null) result = caseCountable(caexObject_iD_AttrEClass);
				if (result == null) result = caseCalculateable(caexObject_iD_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_OBJECT_NAME_ATTR_ECLASS: {
				CAEXObject_name_AttrEClass caexObject_name_AttrEClass = (CAEXObject_name_AttrEClass)theEObject;
				T result = caseCAEXObject_name_AttrEClass(caexObject_name_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(caexObject_name_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(caexObject_name_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(caexObject_name_AttrEClass);
				if (result == null) result = caseAttributeEClass(caexObject_name_AttrEClass);
				if (result == null) result = caseString_Calculateable(caexObject_name_AttrEClass);
				if (result == null) result = caseCalculateableElement(caexObject_name_AttrEClass);
				if (result == null) result = caseNamedElement(caexObject_name_AttrEClass);
				if (result == null) result = caseNegatableElement(caexObject_name_AttrEClass);
				if (result == null) result = caseCountable(caexObject_name_AttrEClass);
				if (result == null) result = caseCalculateable(caexObject_name_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE: {
				EFeatureMapEntry_Calculateable eFeatureMapEntry_Calculateable = (EFeatureMapEntry_Calculateable)theEObject;
				T result = caseEFeatureMapEntry_Calculateable(eFeatureMapEntry_Calculateable);
				if (result == null) result = caseCalculateable(eFeatureMapEntry_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT: {
				EFeatureMapEntry_CalculateableElement eFeatureMapEntry_CalculateableElement = (EFeatureMapEntry_CalculateableElement)theEObject;
				T result = caseEFeatureMapEntry_CalculateableElement(eFeatureMapEntry_CalculateableElement);
				if (result == null) result = caseEFeatureMapEntry_Calculateable(eFeatureMapEntry_CalculateableElement);
				if (result == null) result = caseCalculateableElement(eFeatureMapEntry_CalculateableElement);
				if (result == null) result = caseCalculateable(eFeatureMapEntry_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_ATTRIBUTE_ECLASS: {
				EFeatureMapEntry_AttributeEClass eFeatureMapEntry_AttributeEClass = (EFeatureMapEntry_AttributeEClass)theEObject;
				T result = caseEFeatureMapEntry_AttributeEClass(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseRegularAttributeEClass(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseEFeatureMapEntry_CalculateableElement(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseAttributeEClass(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseEFeatureMapEntry_Calculateable(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseCalculateableElement(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseNamedElement(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseNegatableElement(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseCountable(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = caseCalculateable(eFeatureMapEntry_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_OPERATOR: {
				EFeatureMapEntry_Operator eFeatureMapEntry_Operator = (EFeatureMapEntry_Operator)theEObject;
				T result = caseEFeatureMapEntry_Operator(eFeatureMapEntry_Operator);
				if (result == null) result = caseOperator(eFeatureMapEntry_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_TYPE: {
				EFeatureMapEntry_Type eFeatureMapEntry_Type = (EFeatureMapEntry_Type)theEObject;
				T result = caseEFeatureMapEntry_Type(eFeatureMapEntry_Type);
				if (result == null) result = caseType(eFeatureMapEntry_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_TYPE: {
				EFeatureMapEntry_FunctionalType eFeatureMapEntry_FunctionalType = (EFeatureMapEntry_FunctionalType)theEObject;
				T result = caseEFeatureMapEntry_FunctionalType(eFeatureMapEntry_FunctionalType);
				if (result == null) result = caseEFeatureMapEntry_Type(eFeatureMapEntry_FunctionalType);
				if (result == null) result = caseFunctionalType(eFeatureMapEntry_FunctionalType);
				if (result == null) result = caseType(eFeatureMapEntry_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_PARAMETER: {
				EFeatureMapEntry_CalculateableParameter eFeatureMapEntry_CalculateableParameter = (EFeatureMapEntry_CalculateableParameter)theEObject;
				T result = caseEFeatureMapEntry_CalculateableParameter(eFeatureMapEntry_CalculateableParameter);
				if (result == null) result = caseEFeatureMapEntry_Type(eFeatureMapEntry_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(eFeatureMapEntry_CalculateableParameter);
				if (result == null) result = caseType(eFeatureMapEntry_CalculateableParameter);
				if (result == null) result = caseParameter(eFeatureMapEntry_CalculateableParameter);
				if (result == null) result = caseTypedElement(eFeatureMapEntry_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_PARAMETER: {
				EFeatureMapEntry_FunctionalParameter eFeatureMapEntry_FunctionalParameter = (EFeatureMapEntry_FunctionalParameter)theEObject;
				T result = caseEFeatureMapEntry_FunctionalParameter(eFeatureMapEntry_FunctionalParameter);
				if (result == null) result = caseEFeatureMapEntry_Type(eFeatureMapEntry_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(eFeatureMapEntry_FunctionalParameter);
				if (result == null) result = caseType(eFeatureMapEntry_FunctionalParameter);
				if (result == null) result = caseParameter(eFeatureMapEntry_FunctionalParameter);
				if (result == null) result = caseTypedElement(eFeatureMapEntry_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_ARGUMENT: {
				EFeatureMapEntry_Argument eFeatureMapEntry_Argument = (EFeatureMapEntry_Argument)theEObject;
				T result = caseEFeatureMapEntry_Argument(eFeatureMapEntry_Argument);
				if (result == null) result = caseFunctionalArgument(eFeatureMapEntry_Argument);
				if (result == null) result = caseEFeatureMapEntry_FunctionalType(eFeatureMapEntry_Argument);
				if (result == null) result = caseArgument(eFeatureMapEntry_Argument);
				if (result == null) result = caseEFeatureMapEntry_Type(eFeatureMapEntry_Argument);
				if (result == null) result = caseFunctionalType(eFeatureMapEntry_Argument);
				if (result == null) result = caseTypedElement(eFeatureMapEntry_Argument);
				if (result == null) result = caseType(eFeatureMapEntry_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_PRIMITIVE_ARGUMENT: {
				EFeatureMapEntry_PrimitiveArgument eFeatureMapEntry_PrimitiveArgument = (EFeatureMapEntry_PrimitiveArgument)theEObject;
				T result = caseEFeatureMapEntry_PrimitiveArgument(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseEFeatureMapEntry_Argument(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseEFeatureMapEntry_FunctionalType(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseArgument(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseEFeatureMapEntry_Type(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseTypedElement(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = caseType(eFeatureMapEntry_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_EVALUATION_OPERATION_ARGUMENT: {
				EFeatureMapEntry_EvaluationOperation_Argument eFeatureMapEntry_EvaluationOperation_Argument = (EFeatureMapEntry_EvaluationOperation_Argument)theEObject;
				T result = caseEFeatureMapEntry_EvaluationOperation_Argument(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseEFeatureMapEntry_Argument(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseEFeatureMapEntry_FunctionalType(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseEFeatureMapEntry_Type(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseType(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(eFeatureMapEntry_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				EFeatureMapEntry_CalculateableElementReferenceArgument eFeatureMapEntry_CalculateableElementReferenceArgument = (EFeatureMapEntry_CalculateableElementReferenceArgument)theEObject;
				T result = caseEFeatureMapEntry_CalculateableElementReferenceArgument(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateableElement_ReferenceArgument(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseEFeatureMapEntry_FunctionalType(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseEFeatureMapEntry_Type(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalType(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseReferenceArgument(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalArgument(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseType(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseArgument(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = caseTypedElement(eFeatureMapEntry_CalculateableElementReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_EXPRESSION_OPERATOR: {
				EFeatureMapEntry_ExpressionOperator eFeatureMapEntry_ExpressionOperator = (EFeatureMapEntry_ExpressionOperator)theEObject;
				T result = caseEFeatureMapEntry_ExpressionOperator(eFeatureMapEntry_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(eFeatureMapEntry_ExpressionOperator);
				if (result == null) result = caseEFeatureMapEntry_Operator(eFeatureMapEntry_ExpressionOperator);
				if (result == null) result = caseOperator(eFeatureMapEntry_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR: {
				EFeatureMapEntry_BitOperator eFeatureMapEntry_BitOperator = (EFeatureMapEntry_BitOperator)theEObject;
				T result = caseEFeatureMapEntry_BitOperator(eFeatureMapEntry_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_ExpressionOperator(eFeatureMapEntry_BitOperator);
				if (result == null) result = caseBitOperator(eFeatureMapEntry_BitOperator);
				if (result == null) result = caseExpressionOperator(eFeatureMapEntry_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_Operator(eFeatureMapEntry_BitOperator);
				if (result == null) result = caseNegatableElement(eFeatureMapEntry_BitOperator);
				if (result == null) result = caseOperator(eFeatureMapEntry_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_AND_BIT_OPERATOR: {
				EFeatureMapEntry_And_BitOperator eFeatureMapEntry_And_BitOperator = (EFeatureMapEntry_And_BitOperator)theEObject;
				T result = caseEFeatureMapEntry_And_BitOperator(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_BitOperator(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_ExpressionOperator(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = caseBitOperator(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = caseExpressionOperator(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_Operator(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = caseNegatableElement(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = caseOperator(eFeatureMapEntry_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_OR_BIT_OPERATOR: {
				EFeatureMapEntry_Or_BitOperator eFeatureMapEntry_Or_BitOperator = (EFeatureMapEntry_Or_BitOperator)theEObject;
				T result = caseEFeatureMapEntry_Or_BitOperator(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_BitOperator(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_ExpressionOperator(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = caseBitOperator(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = caseEFeatureMapEntry_Operator(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = caseNegatableElement(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = caseOperator(eFeatureMapEntry_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_OPERATOR: {
				EFeatureMapEntry_FunctionalOperator eFeatureMapEntry_FunctionalOperator = (EFeatureMapEntry_FunctionalOperator)theEObject;
				T result = caseEFeatureMapEntry_FunctionalOperator(eFeatureMapEntry_FunctionalOperator);
				if (result == null) result = caseEFeatureMapEntry_ExpressionOperator(eFeatureMapEntry_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(eFeatureMapEntry_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(eFeatureMapEntry_FunctionalOperator);
				if (result == null) result = caseEFeatureMapEntry_Operator(eFeatureMapEntry_FunctionalOperator);
				if (result == null) result = caseTypedElement(eFeatureMapEntry_FunctionalOperator);
				if (result == null) result = caseOperator(eFeatureMapEntry_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOCUMENT_ROOT_MIXED_ATTR_ECLASS: {
				DocumentRoot_mixed_AttrEClass documentRoot_mixed_AttrEClass = (DocumentRoot_mixed_AttrEClass)theEObject;
				T result = caseDocumentRoot_mixed_AttrEClass(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_AttributeEClass(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_CalculateableElement(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseAttributeEClass(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_Calculateable(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseCalculateableElement(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseNamedElement(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseNegatableElement(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseCountable(documentRoot_mixed_AttrEClass);
				if (result == null) result = caseCalculateable(documentRoot_mixed_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_ALIAS_ATTR_ECLASS: {
				ExternalReferenceType_alias_AttrEClass externalReferenceType_alias_AttrEClass = (ExternalReferenceType_alias_AttrEClass)theEObject;
				T result = caseExternalReferenceType_alias_AttrEClass(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseAttributeEClass(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseString_Calculateable(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseCalculateableElement(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseNamedElement(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseNegatableElement(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseCountable(externalReferenceType_alias_AttrEClass);
				if (result == null) result = caseCalculateable(externalReferenceType_alias_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_PATH_ATTR_ECLASS: {
				ExternalReferenceType_path_AttrEClass externalReferenceType_path_AttrEClass = (ExternalReferenceType_path_AttrEClass)theEObject;
				T result = caseExternalReferenceType_path_AttrEClass(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseAttributeEClass(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseString_Calculateable(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseCalculateableElement(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseNamedElement(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseNegatableElement(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseCountable(externalReferenceType_path_AttrEClass);
				if (result == null) result = caseCalculateable(externalReferenceType_path_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS: {
				InterfaceClass_refBaseClassPath_AttrEClass interfaceClass_refBaseClassPath_AttrEClass = (InterfaceClass_refBaseClassPath_AttrEClass)theEObject;
				T result = caseInterfaceClass_refBaseClassPath_AttrEClass(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseAttributeEClass(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_Calculateable(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCalculateableElement(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseNamedElement(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseNegatableElement(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCountable(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCalculateable(interfaceClass_refBaseClassPath_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_ID_MAPPING_ROLE_INTERFACE_ID_ATTR_ECLASS: {
				InterfaceIDMapping_roleInterfaceID_AttrEClass interfaceIDMapping_roleInterfaceID_AttrEClass = (InterfaceIDMapping_roleInterfaceID_AttrEClass)theEObject;
				T result = caseInterfaceIDMapping_roleInterfaceID_AttrEClass(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseAttributeEClass(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseString_Calculateable(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseCalculateableElement(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseNamedElement(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseNegatableElement(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseCountable(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = caseCalculateable(interfaceIDMapping_roleInterfaceID_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_ID_MAPPING_SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS: {
				InterfaceIDMapping_systemUnitInterfaceID_AttrEClass interfaceIDMapping_systemUnitInterfaceID_AttrEClass = (InterfaceIDMapping_systemUnitInterfaceID_AttrEClass)theEObject;
				T result = caseInterfaceIDMapping_systemUnitInterfaceID_AttrEClass(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseAttributeEClass(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseString_Calculateable(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseCalculateableElement(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseNamedElement(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseNegatableElement(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseCountable(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = caseCalculateable(interfaceIDMapping_systemUnitInterfaceID_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERNAL_ELEMENT_REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS: {
				InternalElement_refBaseSystemUnitPath_AttrEClass internalElement_refBaseSystemUnitPath_AttrEClass = (InternalElement_refBaseSystemUnitPath_AttrEClass)theEObject;
				T result = caseInternalElement_refBaseSystemUnitPath_AttrEClass(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseAttributeEClass(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseString_Calculateable(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseCalculateableElement(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseNamedElement(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseNegatableElement(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseCountable(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = caseCalculateable(internalElement_refBaseSystemUnitPath_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_AATTR_ECLASS: {
				InternalLink_refPartnerSideA_AttrEClass internalLink_refPartnerSideA_AttrEClass = (InternalLink_refPartnerSideA_AttrEClass)theEObject;
				T result = caseInternalLink_refPartnerSideA_AttrEClass(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseAttributeEClass(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseString_Calculateable(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseCalculateableElement(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseNamedElement(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseNegatableElement(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseCountable(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = caseCalculateable(internalLink_refPartnerSideA_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_BATTR_ECLASS: {
				InternalLink_refPartnerSideB_AttrEClass internalLink_refPartnerSideB_AttrEClass = (InternalLink_refPartnerSideB_AttrEClass)theEObject;
				T result = caseInternalLink_refPartnerSideB_AttrEClass(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseAttributeEClass(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseString_Calculateable(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseCalculateableElement(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseNamedElement(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseNegatableElement(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseCountable(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = caseCalculateable(internalLink_refPartnerSideB_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NOMINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS: {
				NominalScaledType_requiredValue_AttrEClass nominalScaledType_requiredValue_AttrEClass = (NominalScaledType_requiredValue_AttrEClass)theEObject;
				T result = caseNominalScaledType_requiredValue_AttrEClass(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseAttributeEClass(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseString_Calculateable(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseCalculateableElement(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseNamedElement(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseNegatableElement(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseCountable(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseCalculateable(nominalScaledType_requiredValue_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MAX_VALUE_ATTR_ECLASS: {
				OrdinalScaledType_requiredMaxValue_AttrEClass ordinalScaledType_requiredMaxValue_AttrEClass = (OrdinalScaledType_requiredMaxValue_AttrEClass)theEObject;
				T result = caseOrdinalScaledType_requiredMaxValue_AttrEClass(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseAttributeEClass(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseString_Calculateable(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseCalculateableElement(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseNamedElement(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseNegatableElement(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseCountable(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = caseCalculateable(ordinalScaledType_requiredMaxValue_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS: {
				OrdinalScaledType_requiredValue_AttrEClass ordinalScaledType_requiredValue_AttrEClass = (OrdinalScaledType_requiredValue_AttrEClass)theEObject;
				T result = caseOrdinalScaledType_requiredValue_AttrEClass(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseAttributeEClass(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseString_Calculateable(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseCalculateableElement(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseNamedElement(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseNegatableElement(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseCountable(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = caseCalculateable(ordinalScaledType_requiredValue_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MIN_VALUE_ATTR_ECLASS: {
				OrdinalScaledType_requiredMinValue_AttrEClass ordinalScaledType_requiredMinValue_AttrEClass = (OrdinalScaledType_requiredMinValue_AttrEClass)theEObject;
				T result = caseOrdinalScaledType_requiredMinValue_AttrEClass(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseAttributeEClass(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseString_Calculateable(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseCalculateableElement(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseNamedElement(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseNegatableElement(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseCountable(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = caseCalculateable(ordinalScaledType_requiredMinValue_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REF_SEMANTIC_CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS: {
				RefSemantic_correspondingAttributePath_AttrEClass refSemantic_correspondingAttributePath_AttrEClass = (RefSemantic_correspondingAttributePath_AttrEClass)theEObject;
				T result = caseRefSemantic_correspondingAttributePath_AttrEClass(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseAttributeEClass(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseString_Calculateable(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseCalculateableElement(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseNamedElement(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseNegatableElement(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseCountable(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = caseCalculateable(refSemantic_correspondingAttributePath_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS: {
				RoleClass_refBaseClassPath_AttrEClass roleClass_refBaseClassPath_AttrEClass = (RoleClass_refBaseClassPath_AttrEClass)theEObject;
				T result = caseRoleClass_refBaseClassPath_AttrEClass(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseAttributeEClass(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_Calculateable(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCalculateableElement(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseNamedElement(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseNegatableElement(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCountable(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCalculateable(roleClass_refBaseClassPath_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_CALCULATEABLE: {
				DateTime_Calculateable dateTime_Calculateable = (DateTime_Calculateable)theEObject;
				T result = caseDateTime_Calculateable(dateTime_Calculateable);
				if (result == null) result = caseCalculateable(dateTime_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_CALCULATEABLE_ELEMENT: {
				DateTime_CalculateableElement dateTime_CalculateableElement = (DateTime_CalculateableElement)theEObject;
				T result = caseDateTime_CalculateableElement(dateTime_CalculateableElement);
				if (result == null) result = caseDateTime_Calculateable(dateTime_CalculateableElement);
				if (result == null) result = caseCalculateableElement(dateTime_CalculateableElement);
				if (result == null) result = caseCalculateable(dateTime_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_ATTRIBUTE_ECLASS: {
				DateTime_AttributeEClass dateTime_AttributeEClass = (DateTime_AttributeEClass)theEObject;
				T result = caseDateTime_AttributeEClass(dateTime_AttributeEClass);
				if (result == null) result = caseRegularAttributeEClass(dateTime_AttributeEClass);
				if (result == null) result = caseDateTime_CalculateableElement(dateTime_AttributeEClass);
				if (result == null) result = caseAttributeEClass(dateTime_AttributeEClass);
				if (result == null) result = caseDateTime_Calculateable(dateTime_AttributeEClass);
				if (result == null) result = caseCalculateableElement(dateTime_AttributeEClass);
				if (result == null) result = caseNamedElement(dateTime_AttributeEClass);
				if (result == null) result = caseNegatableElement(dateTime_AttributeEClass);
				if (result == null) result = caseCountable(dateTime_AttributeEClass);
				if (result == null) result = caseCalculateable(dateTime_AttributeEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_OPERATOR: {
				DateTime_Operator dateTime_Operator = (DateTime_Operator)theEObject;
				T result = caseDateTime_Operator(dateTime_Operator);
				if (result == null) result = caseOperator(dateTime_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_TYPE: {
				DateTime_Type dateTime_Type = (DateTime_Type)theEObject;
				T result = caseDateTime_Type(dateTime_Type);
				if (result == null) result = caseType(dateTime_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_FUNCTIONAL_TYPE: {
				DateTime_FunctionalType dateTime_FunctionalType = (DateTime_FunctionalType)theEObject;
				T result = caseDateTime_FunctionalType(dateTime_FunctionalType);
				if (result == null) result = caseDateTime_Type(dateTime_FunctionalType);
				if (result == null) result = caseFunctionalType(dateTime_FunctionalType);
				if (result == null) result = caseType(dateTime_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_CALCULATEABLE_PARAMETER: {
				DateTime_CalculateableParameter dateTime_CalculateableParameter = (DateTime_CalculateableParameter)theEObject;
				T result = caseDateTime_CalculateableParameter(dateTime_CalculateableParameter);
				if (result == null) result = caseDateTime_Type(dateTime_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(dateTime_CalculateableParameter);
				if (result == null) result = caseType(dateTime_CalculateableParameter);
				if (result == null) result = caseParameter(dateTime_CalculateableParameter);
				if (result == null) result = caseTypedElement(dateTime_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_FUNCTIONAL_PARAMETER: {
				DateTime_FunctionalParameter dateTime_FunctionalParameter = (DateTime_FunctionalParameter)theEObject;
				T result = caseDateTime_FunctionalParameter(dateTime_FunctionalParameter);
				if (result == null) result = caseDateTime_Type(dateTime_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(dateTime_FunctionalParameter);
				if (result == null) result = caseType(dateTime_FunctionalParameter);
				if (result == null) result = caseParameter(dateTime_FunctionalParameter);
				if (result == null) result = caseTypedElement(dateTime_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_ARGUMENT: {
				DateTime_Argument dateTime_Argument = (DateTime_Argument)theEObject;
				T result = caseDateTime_Argument(dateTime_Argument);
				if (result == null) result = caseFunctionalArgument(dateTime_Argument);
				if (result == null) result = caseDateTime_FunctionalType(dateTime_Argument);
				if (result == null) result = caseArgument(dateTime_Argument);
				if (result == null) result = caseDateTime_Type(dateTime_Argument);
				if (result == null) result = caseFunctionalType(dateTime_Argument);
				if (result == null) result = caseTypedElement(dateTime_Argument);
				if (result == null) result = caseType(dateTime_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_PRIMITIVE_ARGUMENT: {
				DateTime_PrimitiveArgument dateTime_PrimitiveArgument = (DateTime_PrimitiveArgument)theEObject;
				T result = caseDateTime_PrimitiveArgument(dateTime_PrimitiveArgument);
				if (result == null) result = caseDateTime_Argument(dateTime_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(dateTime_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(dateTime_PrimitiveArgument);
				if (result == null) result = caseDateTime_FunctionalType(dateTime_PrimitiveArgument);
				if (result == null) result = caseArgument(dateTime_PrimitiveArgument);
				if (result == null) result = caseDateTime_Type(dateTime_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(dateTime_PrimitiveArgument);
				if (result == null) result = caseTypedElement(dateTime_PrimitiveArgument);
				if (result == null) result = caseType(dateTime_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_EVALUATION_OPERATION_ARGUMENT: {
				DateTime_EvaluationOperation_Argument dateTime_EvaluationOperation_Argument = (DateTime_EvaluationOperation_Argument)theEObject;
				T result = caseDateTime_EvaluationOperation_Argument(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseDateTime_Argument(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseDateTime_FunctionalType(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseDateTime_Type(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseType(dateTime_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(dateTime_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT: {
				DateTime_CalculateableElementReferenceArgument dateTime_CalculateableElementReferenceArgument = (DateTime_CalculateableElementReferenceArgument)theEObject;
				T result = caseDateTime_CalculateableElementReferenceArgument(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateableElement_ReferenceArgument(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseDateTime_FunctionalType(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseCalculateable_Argument(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseDateTime_Type(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalType(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseReferenceArgument(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseFunctionalArgument(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseType(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseArgument(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = caseTypedElement(dateTime_CalculateableElementReferenceArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_EXPRESSION_OPERATOR: {
				DateTime_ExpressionOperator dateTime_ExpressionOperator = (DateTime_ExpressionOperator)theEObject;
				T result = caseDateTime_ExpressionOperator(dateTime_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(dateTime_ExpressionOperator);
				if (result == null) result = caseDateTime_Operator(dateTime_ExpressionOperator);
				if (result == null) result = caseOperator(dateTime_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_BIT_OPERATOR: {
				DateTime_BitOperator dateTime_BitOperator = (DateTime_BitOperator)theEObject;
				T result = caseDateTime_BitOperator(dateTime_BitOperator);
				if (result == null) result = caseDateTime_ExpressionOperator(dateTime_BitOperator);
				if (result == null) result = caseBitOperator(dateTime_BitOperator);
				if (result == null) result = caseExpressionOperator(dateTime_BitOperator);
				if (result == null) result = caseDateTime_Operator(dateTime_BitOperator);
				if (result == null) result = caseNegatableElement(dateTime_BitOperator);
				if (result == null) result = caseOperator(dateTime_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_AND_BIT_OPERATOR: {
				DateTime_And_BitOperator dateTime_And_BitOperator = (DateTime_And_BitOperator)theEObject;
				T result = caseDateTime_And_BitOperator(dateTime_And_BitOperator);
				if (result == null) result = caseDateTime_BitOperator(dateTime_And_BitOperator);
				if (result == null) result = caseDateTime_ExpressionOperator(dateTime_And_BitOperator);
				if (result == null) result = caseBitOperator(dateTime_And_BitOperator);
				if (result == null) result = caseExpressionOperator(dateTime_And_BitOperator);
				if (result == null) result = caseDateTime_Operator(dateTime_And_BitOperator);
				if (result == null) result = caseNegatableElement(dateTime_And_BitOperator);
				if (result == null) result = caseOperator(dateTime_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_OR_BIT_OPERATOR: {
				DateTime_Or_BitOperator dateTime_Or_BitOperator = (DateTime_Or_BitOperator)theEObject;
				T result = caseDateTime_Or_BitOperator(dateTime_Or_BitOperator);
				if (result == null) result = caseDateTime_BitOperator(dateTime_Or_BitOperator);
				if (result == null) result = caseDateTime_ExpressionOperator(dateTime_Or_BitOperator);
				if (result == null) result = caseBitOperator(dateTime_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(dateTime_Or_BitOperator);
				if (result == null) result = caseDateTime_Operator(dateTime_Or_BitOperator);
				if (result == null) result = caseNegatableElement(dateTime_Or_BitOperator);
				if (result == null) result = caseOperator(dateTime_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DATE_TIME_FUNCTIONAL_OPERATOR: {
				DateTime_FunctionalOperator dateTime_FunctionalOperator = (DateTime_FunctionalOperator)theEObject;
				T result = caseDateTime_FunctionalOperator(dateTime_FunctionalOperator);
				if (result == null) result = caseDateTime_ExpressionOperator(dateTime_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(dateTime_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(dateTime_FunctionalOperator);
				if (result == null) result = caseDateTime_Operator(dateTime_FunctionalOperator);
				if (result == null) result = caseTypedElement(dateTime_FunctionalOperator);
				if (result == null) result = caseOperator(dateTime_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_LAST_WRITING_DATE_TIME_ATTR_ECLASS: {
				SourceDocumentInformation_lastWritingDateTime_AttrEClass sourceDocumentInformation_lastWritingDateTime_AttrEClass = (SourceDocumentInformation_lastWritingDateTime_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_lastWritingDateTime_AttrEClass(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseDateTime_AttributeEClass(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseDateTime_CalculateableElement(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseDateTime_Calculateable(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_lastWritingDateTime_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_ID_ATTR_ECLASS: {
				SourceDocumentInformation_originID_AttrEClass sourceDocumentInformation_originID_AttrEClass = (SourceDocumentInformation_originID_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originID_AttrEClass(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originID_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_NAME_ATTR_ECLASS: {
				SourceDocumentInformation_originName_AttrEClass sourceDocumentInformation_originName_AttrEClass = (SourceDocumentInformation_originName_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originName_AttrEClass(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originName_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_ID_ATTR_ECLASS: {
				SourceDocumentInformation_originProjectID_AttrEClass sourceDocumentInformation_originProjectID_AttrEClass = (SourceDocumentInformation_originProjectID_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originProjectID_AttrEClass(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originProjectID_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_TITLE_ATTR_ECLASS: {
				SourceDocumentInformation_originProjectTitle_AttrEClass sourceDocumentInformation_originProjectTitle_AttrEClass = (SourceDocumentInformation_originProjectTitle_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originProjectTitle_AttrEClass(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originProjectTitle_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_RELEASE_ATTR_ECLASS: {
				SourceDocumentInformation_originRelease_AttrEClass sourceDocumentInformation_originRelease_AttrEClass = (SourceDocumentInformation_originRelease_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originRelease_AttrEClass(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originRelease_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_ATTR_ECLASS: {
				SourceDocumentInformation_originVendor_AttrEClass sourceDocumentInformation_originVendor_AttrEClass = (SourceDocumentInformation_originVendor_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originVendor_AttrEClass(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originVendor_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_URL_ATTR_ECLASS: {
				SourceDocumentInformation_originVendorURL_AttrEClass sourceDocumentInformation_originVendorURL_AttrEClass = (SourceDocumentInformation_originVendorURL_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originVendorURL_AttrEClass(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originVendorURL_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VERSION_ATTR_ECLASS: {
				SourceDocumentInformation_originVersion_AttrEClass sourceDocumentInformation_originVersion_AttrEClass = (SourceDocumentInformation_originVersion_AttrEClass)theEObject;
				T result = caseSourceDocumentInformation_originVersion_AttrEClass(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseAttributeEClass(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseString_Calculateable(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseCalculateableElement(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseCountable(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = caseCalculateable(sourceDocumentInformation_originVersion_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUPPORTED_ROLE_CLASS_REF_ROLE_CLASS_PATH_ATTR_ECLASS: {
				SupportedRoleClass_refRoleClassPath_AttrEClass supportedRoleClass_refRoleClassPath_AttrEClass = (SupportedRoleClass_refRoleClassPath_AttrEClass)theEObject;
				T result = caseSupportedRoleClass_refRoleClassPath_AttrEClass(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseAttributeEClass(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseString_Calculateable(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseCalculateableElement(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseNamedElement(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseNegatableElement(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseCountable(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = caseCalculateable(supportedRoleClass_refRoleClassPath_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SYSTEM_UNIT_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS: {
				SystemUnitClass_refBaseClassPath_AttrEClass systemUnitClass_refBaseClassPath_AttrEClass = (SystemUnitClass_refBaseClassPath_AttrEClass)theEObject;
				T result = caseSystemUnitClass_refBaseClassPath_AttrEClass(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseAttributeEClass(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseString_Calculateable(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCalculateableElement(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseNamedElement(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseNegatableElement(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCountable(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = caseCalculateable(systemUnitClass_refBaseClassPath_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.UNKNOWN_TYPE_REQUIREMENTS_ATTR_ECLASS: {
				UnknownType_requirements_AttrEClass unknownType_requirements_AttrEClass = (UnknownType_requirements_AttrEClass)theEObject;
				T result = caseUnknownType_requirements_AttrEClass(unknownType_requirements_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(unknownType_requirements_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(unknownType_requirements_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(unknownType_requirements_AttrEClass);
				if (result == null) result = caseAttributeEClass(unknownType_requirements_AttrEClass);
				if (result == null) result = caseString_Calculateable(unknownType_requirements_AttrEClass);
				if (result == null) result = caseCalculateableElement(unknownType_requirements_AttrEClass);
				if (result == null) result = caseNamedElement(unknownType_requirements_AttrEClass);
				if (result == null) result = caseNegatableElement(unknownType_requirements_AttrEClass);
				if (result == null) result = caseCountable(unknownType_requirements_AttrEClass);
				if (result == null) result = caseCalculateable(unknownType_requirements_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COPYRIGHT_VALUE_ATTR_ECLASS: {
				Copyright_value_AttrEClass copyright_value_AttrEClass = (Copyright_value_AttrEClass)theEObject;
				T result = caseCopyright_value_AttrEClass(copyright_value_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(copyright_value_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(copyright_value_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(copyright_value_AttrEClass);
				if (result == null) result = caseAttributeEClass(copyright_value_AttrEClass);
				if (result == null) result = caseString_Calculateable(copyright_value_AttrEClass);
				if (result == null) result = caseCalculateableElement(copyright_value_AttrEClass);
				if (result == null) result = caseNamedElement(copyright_value_AttrEClass);
				if (result == null) result = caseNegatableElement(copyright_value_AttrEClass);
				if (result == null) result = caseCountable(copyright_value_AttrEClass);
				if (result == null) result = caseCalculateable(copyright_value_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COPYRIGHT_CHANGE_MODE_ATTR_ECLASS: {
				Copyright_changeMode_AttrEClass copyright_changeMode_AttrEClass = (Copyright_changeMode_AttrEClass)theEObject;
				T result = caseCopyright_changeMode_AttrEClass(copyright_changeMode_AttrEClass);
				if (result == null) result = caseChangeMode_AttributeEClass(copyright_changeMode_AttrEClass);
				if (result == null) result = caseEnumerationAttributeEClass(copyright_changeMode_AttrEClass);
				if (result == null) result = caseAttributeEClass(copyright_changeMode_AttrEClass);
				if (result == null) result = caseNamedElement(copyright_changeMode_AttrEClass);
				if (result == null) result = caseNegatableElement(copyright_changeMode_AttrEClass);
				if (result == null) result = caseCountable(copyright_changeMode_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DESCRIPTION_VALUE_ATTR_ECLASS: {
				Description_value_AttrEClass description_value_AttrEClass = (Description_value_AttrEClass)theEObject;
				T result = caseDescription_value_AttrEClass(description_value_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(description_value_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(description_value_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(description_value_AttrEClass);
				if (result == null) result = caseAttributeEClass(description_value_AttrEClass);
				if (result == null) result = caseString_Calculateable(description_value_AttrEClass);
				if (result == null) result = caseCalculateableElement(description_value_AttrEClass);
				if (result == null) result = caseNamedElement(description_value_AttrEClass);
				if (result == null) result = caseNegatableElement(description_value_AttrEClass);
				if (result == null) result = caseCountable(description_value_AttrEClass);
				if (result == null) result = caseCalculateable(description_value_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DESCRIPTION_CHANGE_MODE_ATTR_ECLASS: {
				Description_changeMode_AttrEClass description_changeMode_AttrEClass = (Description_changeMode_AttrEClass)theEObject;
				T result = caseDescription_changeMode_AttrEClass(description_changeMode_AttrEClass);
				if (result == null) result = caseChangeMode_AttributeEClass(description_changeMode_AttrEClass);
				if (result == null) result = caseEnumerationAttributeEClass(description_changeMode_AttrEClass);
				if (result == null) result = caseAttributeEClass(description_changeMode_AttrEClass);
				if (result == null) result = caseNamedElement(description_changeMode_AttrEClass);
				if (result == null) result = caseNegatableElement(description_changeMode_AttrEClass);
				if (result == null) result = caseCountable(description_changeMode_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REVISION_REVISION_DATE_ATTR_ECLASS: {
				Revision_revisionDate_AttrEClass revision_revisionDate_AttrEClass = (Revision_revisionDate_AttrEClass)theEObject;
				T result = caseRevision_revisionDate_AttrEClass(revision_revisionDate_AttrEClass);
				if (result == null) result = caseDateTime_AttributeEClass(revision_revisionDate_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(revision_revisionDate_AttrEClass);
				if (result == null) result = caseDateTime_CalculateableElement(revision_revisionDate_AttrEClass);
				if (result == null) result = caseAttributeEClass(revision_revisionDate_AttrEClass);
				if (result == null) result = caseDateTime_Calculateable(revision_revisionDate_AttrEClass);
				if (result == null) result = caseCalculateableElement(revision_revisionDate_AttrEClass);
				if (result == null) result = caseNamedElement(revision_revisionDate_AttrEClass);
				if (result == null) result = caseNegatableElement(revision_revisionDate_AttrEClass);
				if (result == null) result = caseCountable(revision_revisionDate_AttrEClass);
				if (result == null) result = caseCalculateable(revision_revisionDate_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REVISION_OLD_VERSION_ATTR_ECLASS: {
				Revision_oldVersion_AttrEClass revision_oldVersion_AttrEClass = (Revision_oldVersion_AttrEClass)theEObject;
				T result = caseRevision_oldVersion_AttrEClass(revision_oldVersion_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(revision_oldVersion_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(revision_oldVersion_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(revision_oldVersion_AttrEClass);
				if (result == null) result = caseAttributeEClass(revision_oldVersion_AttrEClass);
				if (result == null) result = caseString_Calculateable(revision_oldVersion_AttrEClass);
				if (result == null) result = caseCalculateableElement(revision_oldVersion_AttrEClass);
				if (result == null) result = caseNamedElement(revision_oldVersion_AttrEClass);
				if (result == null) result = caseNegatableElement(revision_oldVersion_AttrEClass);
				if (result == null) result = caseCountable(revision_oldVersion_AttrEClass);
				if (result == null) result = caseCalculateable(revision_oldVersion_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REVISION_NEW_VERSION_ATTR_ECLASS: {
				Revision_newVersion_AttrEClass revision_newVersion_AttrEClass = (Revision_newVersion_AttrEClass)theEObject;
				T result = caseRevision_newVersion_AttrEClass(revision_newVersion_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(revision_newVersion_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(revision_newVersion_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(revision_newVersion_AttrEClass);
				if (result == null) result = caseAttributeEClass(revision_newVersion_AttrEClass);
				if (result == null) result = caseString_Calculateable(revision_newVersion_AttrEClass);
				if (result == null) result = caseCalculateableElement(revision_newVersion_AttrEClass);
				if (result == null) result = caseNamedElement(revision_newVersion_AttrEClass);
				if (result == null) result = caseNegatableElement(revision_newVersion_AttrEClass);
				if (result == null) result = caseCountable(revision_newVersion_AttrEClass);
				if (result == null) result = caseCalculateable(revision_newVersion_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REVISION_AUTHOR_NAME_ATTR_ECLASS: {
				Revision_authorName_AttrEClass revision_authorName_AttrEClass = (Revision_authorName_AttrEClass)theEObject;
				T result = caseRevision_authorName_AttrEClass(revision_authorName_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(revision_authorName_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(revision_authorName_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(revision_authorName_AttrEClass);
				if (result == null) result = caseAttributeEClass(revision_authorName_AttrEClass);
				if (result == null) result = caseString_Calculateable(revision_authorName_AttrEClass);
				if (result == null) result = caseCalculateableElement(revision_authorName_AttrEClass);
				if (result == null) result = caseNamedElement(revision_authorName_AttrEClass);
				if (result == null) result = caseNegatableElement(revision_authorName_AttrEClass);
				if (result == null) result = caseCountable(revision_authorName_AttrEClass);
				if (result == null) result = caseCalculateable(revision_authorName_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REVISION_COMMENT_ATTR_ECLASS: {
				Revision_comment_AttrEClass revision_comment_AttrEClass = (Revision_comment_AttrEClass)theEObject;
				T result = caseRevision_comment_AttrEClass(revision_comment_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(revision_comment_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(revision_comment_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(revision_comment_AttrEClass);
				if (result == null) result = caseAttributeEClass(revision_comment_AttrEClass);
				if (result == null) result = caseString_Calculateable(revision_comment_AttrEClass);
				if (result == null) result = caseCalculateableElement(revision_comment_AttrEClass);
				if (result == null) result = caseNamedElement(revision_comment_AttrEClass);
				if (result == null) result = caseNegatableElement(revision_comment_AttrEClass);
				if (result == null) result = caseCountable(revision_comment_AttrEClass);
				if (result == null) result = caseCalculateable(revision_comment_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.VERSION_VALUE_ATTR_ECLASS: {
				Version_value_AttrEClass version_value_AttrEClass = (Version_value_AttrEClass)theEObject;
				T result = caseVersion_value_AttrEClass(version_value_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(version_value_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(version_value_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(version_value_AttrEClass);
				if (result == null) result = caseAttributeEClass(version_value_AttrEClass);
				if (result == null) result = caseString_Calculateable(version_value_AttrEClass);
				if (result == null) result = caseCalculateableElement(version_value_AttrEClass);
				if (result == null) result = caseNamedElement(version_value_AttrEClass);
				if (result == null) result = caseNegatableElement(version_value_AttrEClass);
				if (result == null) result = caseCountable(version_value_AttrEClass);
				if (result == null) result = caseCalculateable(version_value_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.VERSION_CHANGE_MODE_ATTR_ECLASS: {
				Version_changeMode_AttrEClass version_changeMode_AttrEClass = (Version_changeMode_AttrEClass)theEObject;
				T result = caseVersion_changeMode_AttrEClass(version_changeMode_AttrEClass);
				if (result == null) result = caseChangeMode_AttributeEClass(version_changeMode_AttrEClass);
				if (result == null) result = caseEnumerationAttributeEClass(version_changeMode_AttrEClass);
				if (result == null) result = caseAttributeEClass(version_changeMode_AttrEClass);
				if (result == null) result = caseNamedElement(version_changeMode_AttrEClass);
				if (result == null) result = caseNegatableElement(version_changeMode_AttrEClass);
				if (result == null) result = caseCountable(version_changeMode_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ELEMENT_NAME_ATTR_ECLASS: {
				Element_name_AttrEClass element_name_AttrEClass = (Element_name_AttrEClass)theEObject;
				T result = caseElement_name_AttrEClass(element_name_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(element_name_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(element_name_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(element_name_AttrEClass);
				if (result == null) result = caseAttributeEClass(element_name_AttrEClass);
				if (result == null) result = caseString_Calculateable(element_name_AttrEClass);
				if (result == null) result = caseCalculateableElement(element_name_AttrEClass);
				if (result == null) result = caseNamedElement(element_name_AttrEClass);
				if (result == null) result = caseNegatableElement(element_name_AttrEClass);
				if (result == null) result = caseCountable(element_name_AttrEClass);
				if (result == null) result = caseCalculateable(element_name_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ELEMENT_VALUE_ATTR_ECLASS: {
				Element_value_AttrEClass element_value_AttrEClass = (Element_value_AttrEClass)theEObject;
				T result = caseElement_value_AttrEClass(element_value_AttrEClass);
				if (result == null) result = caseString_AttributeEClass(element_value_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(element_value_AttrEClass);
				if (result == null) result = caseString_CalculateableElement(element_value_AttrEClass);
				if (result == null) result = caseAttributeEClass(element_value_AttrEClass);
				if (result == null) result = caseString_Calculateable(element_value_AttrEClass);
				if (result == null) result = caseCalculateableElement(element_value_AttrEClass);
				if (result == null) result = caseNamedElement(element_value_AttrEClass);
				if (result == null) result = caseNegatableElement(element_value_AttrEClass);
				if (result == null) result = caseCountable(element_value_AttrEClass);
				if (result == null) result = caseCalculateable(element_value_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GENERIC_ELEMENT_ELEMENT_FEATURE_MAP_ATTR_ECLASS: {
				GenericElement_elementFeatureMap_AttrEClass genericElement_elementFeatureMap_AttrEClass = (GenericElement_elementFeatureMap_AttrEClass)theEObject;
				T result = caseGenericElement_elementFeatureMap_AttrEClass(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_AttributeEClass(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_CalculateableElement(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseAttributeEClass(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_Calculateable(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseCalculateableElement(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseNamedElement(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseNegatableElement(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseCountable(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = caseCalculateable(genericElement_elementFeatureMap_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GENERIC_ELEMENT_ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS: {
				GenericElement_attributeFeatureMap_AttrEClass genericElement_attributeFeatureMap_AttrEClass = (GenericElement_attributeFeatureMap_AttrEClass)theEObject;
				T result = caseGenericElement_attributeFeatureMap_AttrEClass(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_AttributeEClass(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseRegularAttributeEClass(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_CalculateableElement(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseAttributeEClass(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseEFeatureMapEntry_Calculateable(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseCalculateableElement(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseNamedElement(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseNegatableElement(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseCountable(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = caseCalculateable(genericElement_attributeFeatureMap_AttrEClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_OR_GROUP: {
				Attribute_OrGroup attribute_OrGroup = (Attribute_OrGroup)theEObject;
				T result = caseAttribute_OrGroup(attribute_OrGroup);
				if (result == null) result = caseOrGroup(attribute_OrGroup);
				if (result == null) result = caseNamedElement(attribute_OrGroup);
				if (result == null) result = caseCountable(attribute_OrGroup);
				if (result == null) result = caseNegatableElement(attribute_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REF_SEMANTIC_OR_GROUP: {
				RefSemantic_OrGroup refSemantic_OrGroup = (RefSemantic_OrGroup)theEObject;
				T result = caseRefSemantic_OrGroup(refSemantic_OrGroup);
				if (result == null) result = caseOrGroup(refSemantic_OrGroup);
				if (result == null) result = caseNamedElement(refSemantic_OrGroup);
				if (result == null) result = caseCountable(refSemantic_OrGroup);
				if (result == null) result = caseNegatableElement(refSemantic_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_OR_GROUP: {
				AttributeValueRequirement_OrGroup attributeValueRequirement_OrGroup = (AttributeValueRequirement_OrGroup)theEObject;
				T result = caseAttributeValueRequirement_OrGroup(attributeValueRequirement_OrGroup);
				if (result == null) result = caseOrGroup(attributeValueRequirement_OrGroup);
				if (result == null) result = caseNamedElement(attributeValueRequirement_OrGroup);
				if (result == null) result = caseCountable(attributeValueRequirement_OrGroup);
				if (result == null) result = caseNegatableElement(attributeValueRequirement_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ORDINAL_SCALED_TYPE_OR_GROUP: {
				OrdinalScaledType_OrGroup ordinalScaledType_OrGroup = (OrdinalScaledType_OrGroup)theEObject;
				T result = caseOrdinalScaledType_OrGroup(ordinalScaledType_OrGroup);
				if (result == null) result = caseOrGroup(ordinalScaledType_OrGroup);
				if (result == null) result = caseNamedElement(ordinalScaledType_OrGroup);
				if (result == null) result = caseCountable(ordinalScaledType_OrGroup);
				if (result == null) result = caseNegatableElement(ordinalScaledType_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NOMINAL_SCALED_TYPE_OR_GROUP: {
				NominalScaledType_OrGroup nominalScaledType_OrGroup = (NominalScaledType_OrGroup)theEObject;
				T result = caseNominalScaledType_OrGroup(nominalScaledType_OrGroup);
				if (result == null) result = caseOrGroup(nominalScaledType_OrGroup);
				if (result == null) result = caseNamedElement(nominalScaledType_OrGroup);
				if (result == null) result = caseCountable(nominalScaledType_OrGroup);
				if (result == null) result = caseNegatableElement(nominalScaledType_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.UNKNOWN_TYPE_OR_GROUP: {
				UnknownType_OrGroup unknownType_OrGroup = (UnknownType_OrGroup)theEObject;
				T result = caseUnknownType_OrGroup(unknownType_OrGroup);
				if (result == null) result = caseOrGroup(unknownType_OrGroup);
				if (result == null) result = caseNamedElement(unknownType_OrGroup);
				if (result == null) result = caseCountable(unknownType_OrGroup);
				if (result == null) result = caseNegatableElement(unknownType_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DESCRIPTION_OR_GROUP: {
				Description_OrGroup description_OrGroup = (Description_OrGroup)theEObject;
				T result = caseDescription_OrGroup(description_OrGroup);
				if (result == null) result = caseOrGroup(description_OrGroup);
				if (result == null) result = caseNamedElement(description_OrGroup);
				if (result == null) result = caseCountable(description_OrGroup);
				if (result == null) result = caseNegatableElement(description_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.VERSION_OR_GROUP: {
				Version_OrGroup version_OrGroup = (Version_OrGroup)theEObject;
				T result = caseVersion_OrGroup(version_OrGroup);
				if (result == null) result = caseOrGroup(version_OrGroup);
				if (result == null) result = caseNamedElement(version_OrGroup);
				if (result == null) result = caseCountable(version_OrGroup);
				if (result == null) result = caseNegatableElement(version_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.REVISION_OR_GROUP: {
				Revision_OrGroup revision_OrGroup = (Revision_OrGroup)theEObject;
				T result = caseRevision_OrGroup(revision_OrGroup);
				if (result == null) result = caseOrGroup(revision_OrGroup);
				if (result == null) result = caseNamedElement(revision_OrGroup);
				if (result == null) result = caseCountable(revision_OrGroup);
				if (result == null) result = caseNegatableElement(revision_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COPYRIGHT_OR_GROUP: {
				Copyright_OrGroup copyright_OrGroup = (Copyright_OrGroup)theEObject;
				T result = caseCopyright_OrGroup(copyright_OrGroup);
				if (result == null) result = caseOrGroup(copyright_OrGroup);
				if (result == null) result = caseNamedElement(copyright_OrGroup);
				if (result == null) result = caseCountable(copyright_OrGroup);
				if (result == null) result = caseNegatableElement(copyright_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ADDITIONAL_INFORMATION_OR_GROUP: {
				AdditionalInformation_OrGroup additionalInformation_OrGroup = (AdditionalInformation_OrGroup)theEObject;
				T result = caseAdditionalInformation_OrGroup(additionalInformation_OrGroup);
				if (result == null) result = caseOrGroup(additionalInformation_OrGroup);
				if (result == null) result = caseNamedElement(additionalInformation_OrGroup);
				if (result == null) result = caseCountable(additionalInformation_OrGroup);
				if (result == null) result = caseNegatableElement(additionalInformation_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_OR_GROUP: {
				SourceDocumentInformation_OrGroup sourceDocumentInformation_OrGroup = (SourceDocumentInformation_OrGroup)theEObject;
				T result = caseSourceDocumentInformation_OrGroup(sourceDocumentInformation_OrGroup);
				if (result == null) result = caseOrGroup(sourceDocumentInformation_OrGroup);
				if (result == null) result = caseNamedElement(sourceDocumentInformation_OrGroup);
				if (result == null) result = caseCountable(sourceDocumentInformation_OrGroup);
				if (result == null) result = caseNegatableElement(sourceDocumentInformation_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_OR_GROUP: {
				ExternalReferenceType_OrGroup externalReferenceType_OrGroup = (ExternalReferenceType_OrGroup)theEObject;
				T result = caseExternalReferenceType_OrGroup(externalReferenceType_OrGroup);
				if (result == null) result = caseOrGroup(externalReferenceType_OrGroup);
				if (result == null) result = caseNamedElement(externalReferenceType_OrGroup);
				if (result == null) result = caseCountable(externalReferenceType_OrGroup);
				if (result == null) result = caseNegatableElement(externalReferenceType_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INSTANCE_HIERARCHY_OR_GROUP: {
				InstanceHierarchy_OrGroup instanceHierarchy_OrGroup = (InstanceHierarchy_OrGroup)theEObject;
				T result = caseInstanceHierarchy_OrGroup(instanceHierarchy_OrGroup);
				if (result == null) result = caseOrGroup(instanceHierarchy_OrGroup);
				if (result == null) result = caseNamedElement(instanceHierarchy_OrGroup);
				if (result == null) result = caseCountable(instanceHierarchy_OrGroup);
				if (result == null) result = caseNegatableElement(instanceHierarchy_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_CLASS_LIB_OR_GROUP: {
				InterfaceClassLib_OrGroup interfaceClassLib_OrGroup = (InterfaceClassLib_OrGroup)theEObject;
				T result = caseInterfaceClassLib_OrGroup(interfaceClassLib_OrGroup);
				if (result == null) result = caseOrGroup(interfaceClassLib_OrGroup);
				if (result == null) result = caseNamedElement(interfaceClassLib_OrGroup);
				if (result == null) result = caseCountable(interfaceClassLib_OrGroup);
				if (result == null) result = caseNegatableElement(interfaceClassLib_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_CLASS_LIB_OR_GROUP: {
				RoleClassLib_OrGroup roleClassLib_OrGroup = (RoleClassLib_OrGroup)theEObject;
				T result = caseRoleClassLib_OrGroup(roleClassLib_OrGroup);
				if (result == null) result = caseOrGroup(roleClassLib_OrGroup);
				if (result == null) result = caseNamedElement(roleClassLib_OrGroup);
				if (result == null) result = caseCountable(roleClassLib_OrGroup);
				if (result == null) result = caseNegatableElement(roleClassLib_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB_OR_GROUP: {
				SystemUnitClassLib_OrGroup systemUnitClassLib_OrGroup = (SystemUnitClassLib_OrGroup)theEObject;
				T result = caseSystemUnitClassLib_OrGroup(systemUnitClassLib_OrGroup);
				if (result == null) result = caseOrGroup(systemUnitClassLib_OrGroup);
				if (result == null) result = caseNamedElement(systemUnitClassLib_OrGroup);
				if (result == null) result = caseCountable(systemUnitClassLib_OrGroup);
				if (result == null) result = caseNegatableElement(systemUnitClassLib_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_LIB_OR_GROUP: {
				AttributeLib_OrGroup attributeLib_OrGroup = (AttributeLib_OrGroup)theEObject;
				T result = caseAttributeLib_OrGroup(attributeLib_OrGroup);
				if (result == null) result = caseOrGroup(attributeLib_OrGroup);
				if (result == null) result = caseNamedElement(attributeLib_OrGroup);
				if (result == null) result = caseCountable(attributeLib_OrGroup);
				if (result == null) result = caseNegatableElement(attributeLib_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CAEX_FILE_OR_GROUP: {
				CAEXFile_OrGroup caexFile_OrGroup = (CAEXFile_OrGroup)theEObject;
				T result = caseCAEXFile_OrGroup(caexFile_OrGroup);
				if (result == null) result = caseOrGroup(caexFile_OrGroup);
				if (result == null) result = caseNamedElement(caexFile_OrGroup);
				if (result == null) result = caseCountable(caexFile_OrGroup);
				if (result == null) result = caseNegatableElement(caexFile_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_CLASS_OR_GROUP: {
				InterfaceClass_OrGroup interfaceClass_OrGroup = (InterfaceClass_OrGroup)theEObject;
				T result = caseInterfaceClass_OrGroup(interfaceClass_OrGroup);
				if (result == null) result = caseOrGroup(interfaceClass_OrGroup);
				if (result == null) result = caseNamedElement(interfaceClass_OrGroup);
				if (result == null) result = caseCountable(interfaceClass_OrGroup);
				if (result == null) result = caseNegatableElement(interfaceClass_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERNAL_ELEMENT_OR_GROUP: {
				InternalElement_OrGroup internalElement_OrGroup = (InternalElement_OrGroup)theEObject;
				T result = caseInternalElement_OrGroup(internalElement_OrGroup);
				if (result == null) result = caseOrGroup(internalElement_OrGroup);
				if (result == null) result = caseNamedElement(internalElement_OrGroup);
				if (result == null) result = caseCountable(internalElement_OrGroup);
				if (result == null) result = caseNegatableElement(internalElement_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EXTERNAL_INTERFACE_OR_GROUP: {
				ExternalInterface_OrGroup externalInterface_OrGroup = (ExternalInterface_OrGroup)theEObject;
				T result = caseExternalInterface_OrGroup(externalInterface_OrGroup);
				if (result == null) result = caseOrGroup(externalInterface_OrGroup);
				if (result == null) result = caseNamedElement(externalInterface_OrGroup);
				if (result == null) result = caseCountable(externalInterface_OrGroup);
				if (result == null) result = caseNegatableElement(externalInterface_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_REQUIREMENTS_OR_GROUP: {
				RoleRequirements_OrGroup roleRequirements_OrGroup = (RoleRequirements_OrGroup)theEObject;
				T result = caseRoleRequirements_OrGroup(roleRequirements_OrGroup);
				if (result == null) result = caseOrGroup(roleRequirements_OrGroup);
				if (result == null) result = caseNamedElement(roleRequirements_OrGroup);
				if (result == null) result = caseCountable(roleRequirements_OrGroup);
				if (result == null) result = caseNegatableElement(roleRequirements_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SYSTEM_UNIT_CLASS_OR_GROUP: {
				SystemUnitClass_OrGroup systemUnitClass_OrGroup = (SystemUnitClass_OrGroup)theEObject;
				T result = caseSystemUnitClass_OrGroup(systemUnitClass_OrGroup);
				if (result == null) result = caseOrGroup(systemUnitClass_OrGroup);
				if (result == null) result = caseNamedElement(systemUnitClass_OrGroup);
				if (result == null) result = caseCountable(systemUnitClass_OrGroup);
				if (result == null) result = caseNegatableElement(systemUnitClass_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_OR_GROUP: {
				AttributeNameMapping_OrGroup attributeNameMapping_OrGroup = (AttributeNameMapping_OrGroup)theEObject;
				T result = caseAttributeNameMapping_OrGroup(attributeNameMapping_OrGroup);
				if (result == null) result = caseOrGroup(attributeNameMapping_OrGroup);
				if (result == null) result = caseNamedElement(attributeNameMapping_OrGroup);
				if (result == null) result = caseCountable(attributeNameMapping_OrGroup);
				if (result == null) result = caseNegatableElement(attributeNameMapping_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERFACE_ID_MAPPING_OR_GROUP: {
				InterfaceIDMapping_OrGroup interfaceIDMapping_OrGroup = (InterfaceIDMapping_OrGroup)theEObject;
				T result = caseInterfaceIDMapping_OrGroup(interfaceIDMapping_OrGroup);
				if (result == null) result = caseOrGroup(interfaceIDMapping_OrGroup);
				if (result == null) result = caseNamedElement(interfaceIDMapping_OrGroup);
				if (result == null) result = caseCountable(interfaceIDMapping_OrGroup);
				if (result == null) result = caseNegatableElement(interfaceIDMapping_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ROLE_CLASS_OR_GROUP: {
				RoleClass_OrGroup roleClass_OrGroup = (RoleClass_OrGroup)theEObject;
				T result = caseRoleClass_OrGroup(roleClass_OrGroup);
				if (result == null) result = caseOrGroup(roleClass_OrGroup);
				if (result == null) result = caseNamedElement(roleClass_OrGroup);
				if (result == null) result = caseCountable(roleClass_OrGroup);
				if (result == null) result = caseNegatableElement(roleClass_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MAPPING_OR_GROUP: {
				Mapping_OrGroup mapping_OrGroup = (Mapping_OrGroup)theEObject;
				T result = caseMapping_OrGroup(mapping_OrGroup);
				if (result == null) result = caseOrGroup(mapping_OrGroup);
				if (result == null) result = caseNamedElement(mapping_OrGroup);
				if (result == null) result = caseCountable(mapping_OrGroup);
				if (result == null) result = caseNegatableElement(mapping_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUPPORTED_ROLE_CLASS_OR_GROUP: {
				SupportedRoleClass_OrGroup supportedRoleClass_OrGroup = (SupportedRoleClass_OrGroup)theEObject;
				T result = caseSupportedRoleClass_OrGroup(supportedRoleClass_OrGroup);
				if (result == null) result = caseOrGroup(supportedRoleClass_OrGroup);
				if (result == null) result = caseNamedElement(supportedRoleClass_OrGroup);
				if (result == null) result = caseCountable(supportedRoleClass_OrGroup);
				if (result == null) result = caseNegatableElement(supportedRoleClass_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTERNAL_LINK_OR_GROUP: {
				InternalLink_OrGroup internalLink_OrGroup = (InternalLink_OrGroup)theEObject;
				T result = caseInternalLink_OrGroup(internalLink_OrGroup);
				if (result == null) result = caseOrGroup(internalLink_OrGroup);
				if (result == null) result = caseNamedElement(internalLink_OrGroup);
				if (result == null) result = caseCountable(internalLink_OrGroup);
				if (result == null) result = caseNegatableElement(internalLink_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GENERIC_ELEMENT_OR_GROUP: {
				GenericElement_OrGroup genericElement_OrGroup = (GenericElement_OrGroup)theEObject;
				T result = caseGenericElement_OrGroup(genericElement_OrGroup);
				if (result == null) result = caseOrGroup(genericElement_OrGroup);
				if (result == null) result = caseNamedElement(genericElement_OrGroup);
				if (result == null) result = caseCountable(genericElement_OrGroup);
				if (result == null) result = caseNegatableElement(genericElement_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GENERIC_ATTRIBUTE_OR_GROUP: {
				GenericAttribute_OrGroup genericAttribute_OrGroup = (GenericAttribute_OrGroup)theEObject;
				T result = caseGenericAttribute_OrGroup(genericAttribute_OrGroup);
				if (result == null) result = caseOrGroup(genericAttribute_OrGroup);
				if (result == null) result = caseNamedElement(genericAttribute_OrGroup);
				if (result == null) result = caseCountable(genericAttribute_OrGroup);
				if (result == null) result = caseNegatableElement(genericAttribute_OrGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_OPERATOR: {
				Object_Operator object_Operator = (Object_Operator)theEObject;
				T result = caseObject_Operator(object_Operator);
				if (result == null) result = caseOperator(object_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_TYPE: {
				Object_Type object_Type = (Object_Type)theEObject;
				T result = caseObject_Type(object_Type);
				if (result == null) result = caseType(object_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_FUNCTIONAL_TYPE: {
				Object_FunctionalType object_FunctionalType = (Object_FunctionalType)theEObject;
				T result = caseObject_FunctionalType(object_FunctionalType);
				if (result == null) result = caseObject_Type(object_FunctionalType);
				if (result == null) result = caseFunctionalType(object_FunctionalType);
				if (result == null) result = caseType(object_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CALCULATEABLE_PARAMETER: {
				Object_CalculateableParameter object_CalculateableParameter = (Object_CalculateableParameter)theEObject;
				T result = caseObject_CalculateableParameter(object_CalculateableParameter);
				if (result == null) result = caseObject_Type(object_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(object_CalculateableParameter);
				if (result == null) result = caseType(object_CalculateableParameter);
				if (result == null) result = caseParameter(object_CalculateableParameter);
				if (result == null) result = caseTypedElement(object_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_FUNCTIONAL_PARAMETER: {
				Object_FunctionalParameter object_FunctionalParameter = (Object_FunctionalParameter)theEObject;
				T result = caseObject_FunctionalParameter(object_FunctionalParameter);
				if (result == null) result = caseObject_Type(object_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(object_FunctionalParameter);
				if (result == null) result = caseType(object_FunctionalParameter);
				if (result == null) result = caseParameter(object_FunctionalParameter);
				if (result == null) result = caseTypedElement(object_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CALCULATEABLE: {
				Object_Calculateable object_Calculateable = (Object_Calculateable)theEObject;
				T result = caseObject_Calculateable(object_Calculateable);
				if (result == null) result = caseCalculateable(object_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CALCULATEABLE_ELEMENT: {
				Object_CalculateableElement object_CalculateableElement = (Object_CalculateableElement)theEObject;
				T result = caseObject_CalculateableElement(object_CalculateableElement);
				if (result == null) result = caseObject_Calculateable(object_CalculateableElement);
				if (result == null) result = caseCalculateableElement(object_CalculateableElement);
				if (result == null) result = caseCalculateable(object_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_ARGUMENT: {
				Object_Argument object_Argument = (Object_Argument)theEObject;
				T result = caseObject_Argument(object_Argument);
				if (result == null) result = caseFunctionalArgument(object_Argument);
				if (result == null) result = caseObject_FunctionalType(object_Argument);
				if (result == null) result = caseArgument(object_Argument);
				if (result == null) result = caseObject_Type(object_Argument);
				if (result == null) result = caseFunctionalType(object_Argument);
				if (result == null) result = caseTypedElement(object_Argument);
				if (result == null) result = caseType(object_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_PRIMITIVE_ARGUMENT: {
				Object_PrimitiveArgument object_PrimitiveArgument = (Object_PrimitiveArgument)theEObject;
				T result = caseObject_PrimitiveArgument(object_PrimitiveArgument);
				if (result == null) result = caseObject_Argument(object_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(object_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(object_PrimitiveArgument);
				if (result == null) result = caseObject_FunctionalType(object_PrimitiveArgument);
				if (result == null) result = caseArgument(object_PrimitiveArgument);
				if (result == null) result = caseObject_Type(object_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(object_PrimitiveArgument);
				if (result == null) result = caseTypedElement(object_PrimitiveArgument);
				if (result == null) result = caseType(object_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_EVALUATION_OPERATION_ARGUMENT: {
				Object_EvaluationOperation_Argument object_EvaluationOperation_Argument = (Object_EvaluationOperation_Argument)theEObject;
				T result = caseObject_EvaluationOperation_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(object_EvaluationOperation_Argument);
				if (result == null) result = caseObject_FunctionalType(object_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(object_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(object_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(object_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(object_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(object_EvaluationOperation_Argument);
				if (result == null) result = caseType(object_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(object_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_EXPRESSION_OPERATOR: {
				Object_ExpressionOperator object_ExpressionOperator = (Object_ExpressionOperator)theEObject;
				T result = caseObject_ExpressionOperator(object_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(object_ExpressionOperator);
				if (result == null) result = caseObject_Operator(object_ExpressionOperator);
				if (result == null) result = caseOperator(object_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_BIT_OPERATOR: {
				Object_BitOperator object_BitOperator = (Object_BitOperator)theEObject;
				T result = caseObject_BitOperator(object_BitOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_BitOperator);
				if (result == null) result = caseBitOperator(object_BitOperator);
				if (result == null) result = caseExpressionOperator(object_BitOperator);
				if (result == null) result = caseObject_Operator(object_BitOperator);
				if (result == null) result = caseNegatableElement(object_BitOperator);
				if (result == null) result = caseOperator(object_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_AND_BIT_OPERATOR: {
				Object_And_BitOperator object_And_BitOperator = (Object_And_BitOperator)theEObject;
				T result = caseObject_And_BitOperator(object_And_BitOperator);
				if (result == null) result = caseObject_BitOperator(object_And_BitOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_And_BitOperator);
				if (result == null) result = caseBitOperator(object_And_BitOperator);
				if (result == null) result = caseExpressionOperator(object_And_BitOperator);
				if (result == null) result = caseObject_Operator(object_And_BitOperator);
				if (result == null) result = caseNegatableElement(object_And_BitOperator);
				if (result == null) result = caseOperator(object_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_OR_BIT_OPERATOR: {
				Object_Or_BitOperator object_Or_BitOperator = (Object_Or_BitOperator)theEObject;
				T result = caseObject_Or_BitOperator(object_Or_BitOperator);
				if (result == null) result = caseObject_BitOperator(object_Or_BitOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_Or_BitOperator);
				if (result == null) result = caseBitOperator(object_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(object_Or_BitOperator);
				if (result == null) result = caseObject_Operator(object_Or_BitOperator);
				if (result == null) result = caseNegatableElement(object_Or_BitOperator);
				if (result == null) result = caseOperator(object_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_FUNCTIONAL_OPERATOR: {
				Object_FunctionalOperator object_FunctionalOperator = (Object_FunctionalOperator)theEObject;
				T result = caseObject_FunctionalOperator(object_FunctionalOperator);
				if (result == null) result = caseObject_ExpressionOperator(object_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_FunctionalOperator);
				if (result == null) result = caseObject_Operator(object_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_FunctionalOperator);
				if (result == null) result = caseOperator(object_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_OPERATOR: {
				Boolean_Operator boolean_Operator = (Boolean_Operator)theEObject;
				T result = caseBoolean_Operator(boolean_Operator);
				if (result == null) result = caseOperator(boolean_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_TYPE: {
				Boolean_Type boolean_Type = (Boolean_Type)theEObject;
				T result = caseBoolean_Type(boolean_Type);
				if (result == null) result = caseObject_Type(boolean_Type);
				if (result == null) result = caseType(boolean_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_FUNCTIONAL_TYPE: {
				Boolean_FunctionalType boolean_FunctionalType = (Boolean_FunctionalType)theEObject;
				T result = caseBoolean_FunctionalType(boolean_FunctionalType);
				if (result == null) result = caseBoolean_Type(boolean_FunctionalType);
				if (result == null) result = caseFunctionalType(boolean_FunctionalType);
				if (result == null) result = caseNegatableElement(boolean_FunctionalType);
				if (result == null) result = caseObject_Type(boolean_FunctionalType);
				if (result == null) result = caseType(boolean_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_CALCULATEABLE_PARAMETER: {
				Boolean_CalculateableParameter boolean_CalculateableParameter = (Boolean_CalculateableParameter)theEObject;
				T result = caseBoolean_CalculateableParameter(boolean_CalculateableParameter);
				if (result == null) result = caseBoolean_Type(boolean_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(boolean_CalculateableParameter);
				if (result == null) result = caseObject_Type(boolean_CalculateableParameter);
				if (result == null) result = caseParameter(boolean_CalculateableParameter);
				if (result == null) result = caseType(boolean_CalculateableParameter);
				if (result == null) result = caseTypedElement(boolean_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_FUNCTIONAL_PARAMETER: {
				Boolean_FunctionalParameter boolean_FunctionalParameter = (Boolean_FunctionalParameter)theEObject;
				T result = caseBoolean_FunctionalParameter(boolean_FunctionalParameter);
				if (result == null) result = caseBoolean_Type(boolean_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(boolean_FunctionalParameter);
				if (result == null) result = caseObject_Type(boolean_FunctionalParameter);
				if (result == null) result = caseParameter(boolean_FunctionalParameter);
				if (result == null) result = caseType(boolean_FunctionalParameter);
				if (result == null) result = caseTypedElement(boolean_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_CALCULATEABLE: {
				Boolean_Calculateable boolean_Calculateable = (Boolean_Calculateable)theEObject;
				T result = caseBoolean_Calculateable(boolean_Calculateable);
				if (result == null) result = caseCalculateable(boolean_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_CALCULATEABLE_ELEMENT: {
				Boolean_CalculateableElement boolean_CalculateableElement = (Boolean_CalculateableElement)theEObject;
				T result = caseBoolean_CalculateableElement(boolean_CalculateableElement);
				if (result == null) result = caseBoolean_Calculateable(boolean_CalculateableElement);
				if (result == null) result = caseCalculateableElement(boolean_CalculateableElement);
				if (result == null) result = caseCalculateable(boolean_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_ARGUMENT: {
				Boolean_Argument boolean_Argument = (Boolean_Argument)theEObject;
				T result = caseBoolean_Argument(boolean_Argument);
				if (result == null) result = caseFunctionalArgument(boolean_Argument);
				if (result == null) result = caseBoolean_FunctionalType(boolean_Argument);
				if (result == null) result = caseArgument(boolean_Argument);
				if (result == null) result = caseBoolean_Type(boolean_Argument);
				if (result == null) result = caseFunctionalType(boolean_Argument);
				if (result == null) result = caseNegatableElement(boolean_Argument);
				if (result == null) result = caseTypedElement(boolean_Argument);
				if (result == null) result = caseObject_Type(boolean_Argument);
				if (result == null) result = caseType(boolean_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_PRIMITIVE_ARGUMENT: {
				Boolean_PrimitiveArgument boolean_PrimitiveArgument = (Boolean_PrimitiveArgument)theEObject;
				T result = caseBoolean_PrimitiveArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseBoolean_Argument(boolean_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseBoolean_FunctionalType(boolean_PrimitiveArgument);
				if (result == null) result = caseArgument(boolean_PrimitiveArgument);
				if (result == null) result = caseBoolean_Type(boolean_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(boolean_PrimitiveArgument);
				if (result == null) result = caseNegatableElement(boolean_PrimitiveArgument);
				if (result == null) result = caseTypedElement(boolean_PrimitiveArgument);
				if (result == null) result = caseObject_Type(boolean_PrimitiveArgument);
				if (result == null) result = caseType(boolean_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_EVALUATION_OPERATION_ARGUMENT: {
				Boolean_EvaluationOperation_Argument boolean_EvaluationOperation_Argument = (Boolean_EvaluationOperation_Argument)theEObject;
				T result = caseBoolean_EvaluationOperation_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseBoolean_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseBoolean_FunctionalType(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseBoolean_Type(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseNegatableElement(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(boolean_EvaluationOperation_Argument);
				if (result == null) result = caseType(boolean_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_EXPRESSION_OPERATOR: {
				Boolean_ExpressionOperator boolean_ExpressionOperator = (Boolean_ExpressionOperator)theEObject;
				T result = caseBoolean_ExpressionOperator(boolean_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(boolean_ExpressionOperator);
				if (result == null) result = caseBoolean_Operator(boolean_ExpressionOperator);
				if (result == null) result = caseOperator(boolean_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_BIT_OPERATOR: {
				Boolean_BitOperator boolean_BitOperator = (Boolean_BitOperator)theEObject;
				T result = caseBoolean_BitOperator(boolean_BitOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_BitOperator);
				if (result == null) result = caseBitOperator(boolean_BitOperator);
				if (result == null) result = caseExpressionOperator(boolean_BitOperator);
				if (result == null) result = caseBoolean_Operator(boolean_BitOperator);
				if (result == null) result = caseNegatableElement(boolean_BitOperator);
				if (result == null) result = caseOperator(boolean_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_AND_BIT_OPERATOR: {
				Boolean_And_BitOperator boolean_And_BitOperator = (Boolean_And_BitOperator)theEObject;
				T result = caseBoolean_And_BitOperator(boolean_And_BitOperator);
				if (result == null) result = caseBoolean_BitOperator(boolean_And_BitOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_And_BitOperator);
				if (result == null) result = caseBitOperator(boolean_And_BitOperator);
				if (result == null) result = caseExpressionOperator(boolean_And_BitOperator);
				if (result == null) result = caseBoolean_Operator(boolean_And_BitOperator);
				if (result == null) result = caseNegatableElement(boolean_And_BitOperator);
				if (result == null) result = caseOperator(boolean_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_OR_BIT_OPERATOR: {
				Boolean_Or_BitOperator boolean_Or_BitOperator = (Boolean_Or_BitOperator)theEObject;
				T result = caseBoolean_Or_BitOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBoolean_BitOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBitOperator(boolean_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(boolean_Or_BitOperator);
				if (result == null) result = caseBoolean_Operator(boolean_Or_BitOperator);
				if (result == null) result = caseNegatableElement(boolean_Or_BitOperator);
				if (result == null) result = caseOperator(boolean_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Boolean_Original_FunctionalOperator boolean_Original_FunctionalOperator = (Boolean_Original_FunctionalOperator)theEObject;
				T result = caseBoolean_Original_FunctionalOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(boolean_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(boolean_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EQUALS_FUNCTIONAL_OPERATOR: {
				equals_FunctionalOperator equals_FunctionalOperator = (equals_FunctionalOperator)theEObject;
				T result = caseequals_FunctionalOperator(equals_FunctionalOperator);
				if (result == null) result = caseObject_FunctionalOperator(equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(equals_FunctionalOperator);
				if (result == null) result = caseObject_ExpressionOperator(equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(equals_FunctionalOperator);
				if (result == null) result = caseObject_Operator(equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(equals_FunctionalOperator);
				if (result == null) result = caseOperator(equals_FunctionalOperator);
				if (result == null) result = caseType(equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.TO_STRING_FUNCTIONAL_OPERATOR: {
				toString_FunctionalOperator toString_FunctionalOperator = (toString_FunctionalOperator)theEObject;
				T result = casetoString_FunctionalOperator(toString_FunctionalOperator);
				if (result == null) result = caseObject_FunctionalOperator(toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(toString_FunctionalOperator);
				if (result == null) result = caseObject_ExpressionOperator(toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(toString_FunctionalOperator);
				if (result == null) result = caseString_Type(toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(toString_FunctionalOperator);
				if (result == null) result = caseObject_Operator(toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(toString_FunctionalOperator);
				if (result == null) result = caseOperator(toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(toString_FunctionalOperator);
				if (result == null) result = caseType(toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_OPERATOR: {
				CharSequence_Operator charSequence_Operator = (CharSequence_Operator)theEObject;
				T result = caseCharSequence_Operator(charSequence_Operator);
				if (result == null) result = caseOperator(charSequence_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_TYPE: {
				CharSequence_Type charSequence_Type = (CharSequence_Type)theEObject;
				T result = caseCharSequence_Type(charSequence_Type);
				if (result == null) result = caseObject_Type(charSequence_Type);
				if (result == null) result = caseType(charSequence_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_TYPE: {
				CharSequence_FunctionalType charSequence_FunctionalType = (CharSequence_FunctionalType)theEObject;
				T result = caseCharSequence_FunctionalType(charSequence_FunctionalType);
				if (result == null) result = caseCharSequence_Type(charSequence_FunctionalType);
				if (result == null) result = caseFunctionalType(charSequence_FunctionalType);
				if (result == null) result = caseObject_Type(charSequence_FunctionalType);
				if (result == null) result = caseType(charSequence_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_PARAMETER: {
				CharSequence_CalculateableParameter charSequence_CalculateableParameter = (CharSequence_CalculateableParameter)theEObject;
				T result = caseCharSequence_CalculateableParameter(charSequence_CalculateableParameter);
				if (result == null) result = caseCharSequence_Type(charSequence_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(charSequence_CalculateableParameter);
				if (result == null) result = caseObject_Type(charSequence_CalculateableParameter);
				if (result == null) result = caseParameter(charSequence_CalculateableParameter);
				if (result == null) result = caseType(charSequence_CalculateableParameter);
				if (result == null) result = caseTypedElement(charSequence_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_PARAMETER: {
				CharSequence_FunctionalParameter charSequence_FunctionalParameter = (CharSequence_FunctionalParameter)theEObject;
				T result = caseCharSequence_FunctionalParameter(charSequence_FunctionalParameter);
				if (result == null) result = caseCharSequence_Type(charSequence_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(charSequence_FunctionalParameter);
				if (result == null) result = caseObject_Type(charSequence_FunctionalParameter);
				if (result == null) result = caseParameter(charSequence_FunctionalParameter);
				if (result == null) result = caseType(charSequence_FunctionalParameter);
				if (result == null) result = caseTypedElement(charSequence_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE: {
				CharSequence_Calculateable charSequence_Calculateable = (CharSequence_Calculateable)theEObject;
				T result = caseCharSequence_Calculateable(charSequence_Calculateable);
				if (result == null) result = caseCalculateable(charSequence_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_ELEMENT: {
				CharSequence_CalculateableElement charSequence_CalculateableElement = (CharSequence_CalculateableElement)theEObject;
				T result = caseCharSequence_CalculateableElement(charSequence_CalculateableElement);
				if (result == null) result = caseCharSequence_Calculateable(charSequence_CalculateableElement);
				if (result == null) result = caseCalculateableElement(charSequence_CalculateableElement);
				if (result == null) result = caseCalculateable(charSequence_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_ARGUMENT: {
				CharSequence_Argument charSequence_Argument = (CharSequence_Argument)theEObject;
				T result = caseCharSequence_Argument(charSequence_Argument);
				if (result == null) result = caseFunctionalArgument(charSequence_Argument);
				if (result == null) result = caseCharSequence_FunctionalType(charSequence_Argument);
				if (result == null) result = caseArgument(charSequence_Argument);
				if (result == null) result = caseCharSequence_Type(charSequence_Argument);
				if (result == null) result = caseFunctionalType(charSequence_Argument);
				if (result == null) result = caseTypedElement(charSequence_Argument);
				if (result == null) result = caseObject_Type(charSequence_Argument);
				if (result == null) result = caseType(charSequence_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_PRIMITIVE_ARGUMENT: {
				CharSequence_PrimitiveArgument charSequence_PrimitiveArgument = (CharSequence_PrimitiveArgument)theEObject;
				T result = caseCharSequence_PrimitiveArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseCharSequence_Argument(charSequence_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseCharSequence_FunctionalType(charSequence_PrimitiveArgument);
				if (result == null) result = caseArgument(charSequence_PrimitiveArgument);
				if (result == null) result = caseCharSequence_Type(charSequence_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(charSequence_PrimitiveArgument);
				if (result == null) result = caseTypedElement(charSequence_PrimitiveArgument);
				if (result == null) result = caseObject_Type(charSequence_PrimitiveArgument);
				if (result == null) result = caseType(charSequence_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT: {
				CharSequence_EvaluationOperation_Argument charSequence_EvaluationOperation_Argument = (CharSequence_EvaluationOperation_Argument)theEObject;
				T result = caseCharSequence_EvaluationOperation_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_FunctionalType(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseCharSequence_Type(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(charSequence_EvaluationOperation_Argument);
				if (result == null) result = caseType(charSequence_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_EXPRESSION_OPERATOR: {
				CharSequence_ExpressionOperator charSequence_ExpressionOperator = (CharSequence_ExpressionOperator)theEObject;
				T result = caseCharSequence_ExpressionOperator(charSequence_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(charSequence_ExpressionOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_ExpressionOperator);
				if (result == null) result = caseOperator(charSequence_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_BIT_OPERATOR: {
				CharSequence_BitOperator charSequence_BitOperator = (CharSequence_BitOperator)theEObject;
				T result = caseCharSequence_BitOperator(charSequence_BitOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_BitOperator);
				if (result == null) result = caseBitOperator(charSequence_BitOperator);
				if (result == null) result = caseExpressionOperator(charSequence_BitOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_BitOperator);
				if (result == null) result = caseNegatableElement(charSequence_BitOperator);
				if (result == null) result = caseOperator(charSequence_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_AND_BIT_OPERATOR: {
				CharSequence_And_BitOperator charSequence_And_BitOperator = (CharSequence_And_BitOperator)theEObject;
				T result = caseCharSequence_And_BitOperator(charSequence_And_BitOperator);
				if (result == null) result = caseCharSequence_BitOperator(charSequence_And_BitOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_And_BitOperator);
				if (result == null) result = caseBitOperator(charSequence_And_BitOperator);
				if (result == null) result = caseExpressionOperator(charSequence_And_BitOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_And_BitOperator);
				if (result == null) result = caseNegatableElement(charSequence_And_BitOperator);
				if (result == null) result = caseOperator(charSequence_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_OR_BIT_OPERATOR: {
				CharSequence_Or_BitOperator charSequence_Or_BitOperator = (CharSequence_Or_BitOperator)theEObject;
				T result = caseCharSequence_Or_BitOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseCharSequence_BitOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseBitOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(charSequence_Or_BitOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_Or_BitOperator);
				if (result == null) result = caseNegatableElement(charSequence_Or_BitOperator);
				if (result == null) result = caseOperator(charSequence_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR: {
				CharSequence_Original_FunctionalOperator charSequence_Original_FunctionalOperator = (CharSequence_Original_FunctionalOperator)theEObject;
				T result = caseCharSequence_Original_FunctionalOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_OPERATOR: {
				Integer_Operator integer_Operator = (Integer_Operator)theEObject;
				T result = caseInteger_Operator(integer_Operator);
				if (result == null) result = caseOperator(integer_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_TYPE: {
				Integer_Type integer_Type = (Integer_Type)theEObject;
				T result = caseInteger_Type(integer_Type);
				if (result == null) result = caseNumber_Type(integer_Type);
				if (result == null) result = caseObject_Type(integer_Type);
				if (result == null) result = caseType(integer_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_FUNCTIONAL_TYPE: {
				Integer_FunctionalType integer_FunctionalType = (Integer_FunctionalType)theEObject;
				T result = caseInteger_FunctionalType(integer_FunctionalType);
				if (result == null) result = caseInteger_Type(integer_FunctionalType);
				if (result == null) result = caseFunctionalType(integer_FunctionalType);
				if (result == null) result = caseNumber_Type(integer_FunctionalType);
				if (result == null) result = caseObject_Type(integer_FunctionalType);
				if (result == null) result = caseType(integer_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_CALCULATEABLE_PARAMETER: {
				Integer_CalculateableParameter integer_CalculateableParameter = (Integer_CalculateableParameter)theEObject;
				T result = caseInteger_CalculateableParameter(integer_CalculateableParameter);
				if (result == null) result = caseInteger_Type(integer_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(integer_CalculateableParameter);
				if (result == null) result = caseNumber_Type(integer_CalculateableParameter);
				if (result == null) result = caseParameter(integer_CalculateableParameter);
				if (result == null) result = caseObject_Type(integer_CalculateableParameter);
				if (result == null) result = caseTypedElement(integer_CalculateableParameter);
				if (result == null) result = caseType(integer_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER: {
				Integer_FunctionalParameter integer_FunctionalParameter = (Integer_FunctionalParameter)theEObject;
				T result = caseInteger_FunctionalParameter(integer_FunctionalParameter);
				if (result == null) result = caseInteger_Type(integer_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(integer_FunctionalParameter);
				if (result == null) result = caseNumber_Type(integer_FunctionalParameter);
				if (result == null) result = caseParameter(integer_FunctionalParameter);
				if (result == null) result = caseObject_Type(integer_FunctionalParameter);
				if (result == null) result = caseTypedElement(integer_FunctionalParameter);
				if (result == null) result = caseType(integer_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_ARGUMENT: {
				Integer_Argument integer_Argument = (Integer_Argument)theEObject;
				T result = caseInteger_Argument(integer_Argument);
				if (result == null) result = caseFunctionalArgument(integer_Argument);
				if (result == null) result = caseInteger_FunctionalType(integer_Argument);
				if (result == null) result = caseArgument(integer_Argument);
				if (result == null) result = caseInteger_Type(integer_Argument);
				if (result == null) result = caseFunctionalType(integer_Argument);
				if (result == null) result = caseTypedElement(integer_Argument);
				if (result == null) result = caseNumber_Type(integer_Argument);
				if (result == null) result = caseObject_Type(integer_Argument);
				if (result == null) result = caseType(integer_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_PRIMITIVE_ARGUMENT: {
				Integer_PrimitiveArgument integer_PrimitiveArgument = (Integer_PrimitiveArgument)theEObject;
				T result = caseInteger_PrimitiveArgument(integer_PrimitiveArgument);
				if (result == null) result = caseInteger_Argument(integer_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(integer_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(integer_PrimitiveArgument);
				if (result == null) result = caseInteger_FunctionalType(integer_PrimitiveArgument);
				if (result == null) result = caseArgument(integer_PrimitiveArgument);
				if (result == null) result = caseInteger_Type(integer_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(integer_PrimitiveArgument);
				if (result == null) result = caseTypedElement(integer_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(integer_PrimitiveArgument);
				if (result == null) result = caseObject_Type(integer_PrimitiveArgument);
				if (result == null) result = caseType(integer_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_EVALUATION_OPERATION_ARGUMENT: {
				Integer_EvaluationOperation_Argument integer_EvaluationOperation_Argument = (Integer_EvaluationOperation_Argument)theEObject;
				T result = caseInteger_EvaluationOperation_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseInteger_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseInteger_FunctionalType(integer_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseInteger_Type(integer_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(integer_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(integer_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(integer_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(integer_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(integer_EvaluationOperation_Argument);
				if (result == null) result = caseType(integer_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_EXPRESSION_OPERATOR: {
				Integer_ExpressionOperator integer_ExpressionOperator = (Integer_ExpressionOperator)theEObject;
				T result = caseInteger_ExpressionOperator(integer_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(integer_ExpressionOperator);
				if (result == null) result = caseInteger_Operator(integer_ExpressionOperator);
				if (result == null) result = caseOperator(integer_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_BIT_OPERATOR: {
				Integer_BitOperator integer_BitOperator = (Integer_BitOperator)theEObject;
				T result = caseInteger_BitOperator(integer_BitOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_BitOperator);
				if (result == null) result = caseBitOperator(integer_BitOperator);
				if (result == null) result = caseExpressionOperator(integer_BitOperator);
				if (result == null) result = caseInteger_Operator(integer_BitOperator);
				if (result == null) result = caseNegatableElement(integer_BitOperator);
				if (result == null) result = caseOperator(integer_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_AND_BIT_OPERATOR: {
				Integer_And_BitOperator integer_And_BitOperator = (Integer_And_BitOperator)theEObject;
				T result = caseInteger_And_BitOperator(integer_And_BitOperator);
				if (result == null) result = caseInteger_BitOperator(integer_And_BitOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_And_BitOperator);
				if (result == null) result = caseBitOperator(integer_And_BitOperator);
				if (result == null) result = caseExpressionOperator(integer_And_BitOperator);
				if (result == null) result = caseInteger_Operator(integer_And_BitOperator);
				if (result == null) result = caseNegatableElement(integer_And_BitOperator);
				if (result == null) result = caseOperator(integer_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_OR_BIT_OPERATOR: {
				Integer_Or_BitOperator integer_Or_BitOperator = (Integer_Or_BitOperator)theEObject;
				T result = caseInteger_Or_BitOperator(integer_Or_BitOperator);
				if (result == null) result = caseInteger_BitOperator(integer_Or_BitOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_Or_BitOperator);
				if (result == null) result = caseBitOperator(integer_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(integer_Or_BitOperator);
				if (result == null) result = caseInteger_Operator(integer_Or_BitOperator);
				if (result == null) result = caseNegatableElement(integer_Or_BitOperator);
				if (result == null) result = caseOperator(integer_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Integer_Original_FunctionalOperator integer_Original_FunctionalOperator = (Integer_Original_FunctionalOperator)theEObject;
				T result = caseInteger_Original_FunctionalOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(integer_Original_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(integer_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(integer_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LENGTH_FUNCTIONAL_OPERATOR: {
				length_FunctionalOperator length_FunctionalOperator = (length_FunctionalOperator)theEObject;
				T result = caselength_FunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_Original_FunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseInteger_Type(length_FunctionalOperator);
				if (result == null) result = caseFunctionalType(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(length_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(length_FunctionalOperator);
				if (result == null) result = caseNumber_Type(length_FunctionalOperator);
				if (result == null) result = caseOperator(length_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(length_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(length_FunctionalOperator);
				if (result == null) result = caseTypedElement(length_FunctionalOperator);
				if (result == null) result = caseObject_Type(length_FunctionalOperator);
				if (result == null) result = caseType(length_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_OPERATOR: {
				Character_Operator character_Operator = (Character_Operator)theEObject;
				T result = caseCharacter_Operator(character_Operator);
				if (result == null) result = caseOperator(character_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_TYPE: {
				Character_Type character_Type = (Character_Type)theEObject;
				T result = caseCharacter_Type(character_Type);
				if (result == null) result = caseObject_Type(character_Type);
				if (result == null) result = caseType(character_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_FUNCTIONAL_TYPE: {
				Character_FunctionalType character_FunctionalType = (Character_FunctionalType)theEObject;
				T result = caseCharacter_FunctionalType(character_FunctionalType);
				if (result == null) result = caseCharacter_Type(character_FunctionalType);
				if (result == null) result = caseFunctionalType(character_FunctionalType);
				if (result == null) result = caseObject_Type(character_FunctionalType);
				if (result == null) result = caseType(character_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_CALCULATEABLE_PARAMETER: {
				Character_CalculateableParameter character_CalculateableParameter = (Character_CalculateableParameter)theEObject;
				T result = caseCharacter_CalculateableParameter(character_CalculateableParameter);
				if (result == null) result = caseCharacter_Type(character_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(character_CalculateableParameter);
				if (result == null) result = caseObject_Type(character_CalculateableParameter);
				if (result == null) result = caseParameter(character_CalculateableParameter);
				if (result == null) result = caseType(character_CalculateableParameter);
				if (result == null) result = caseTypedElement(character_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_FUNCTIONAL_PARAMETER: {
				Character_FunctionalParameter character_FunctionalParameter = (Character_FunctionalParameter)theEObject;
				T result = caseCharacter_FunctionalParameter(character_FunctionalParameter);
				if (result == null) result = caseCharacter_Type(character_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(character_FunctionalParameter);
				if (result == null) result = caseObject_Type(character_FunctionalParameter);
				if (result == null) result = caseParameter(character_FunctionalParameter);
				if (result == null) result = caseType(character_FunctionalParameter);
				if (result == null) result = caseTypedElement(character_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_CALCULATEABLE: {
				Character_Calculateable character_Calculateable = (Character_Calculateable)theEObject;
				T result = caseCharacter_Calculateable(character_Calculateable);
				if (result == null) result = caseCalculateable(character_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_CALCULATEABLE_ELEMENT: {
				Character_CalculateableElement character_CalculateableElement = (Character_CalculateableElement)theEObject;
				T result = caseCharacter_CalculateableElement(character_CalculateableElement);
				if (result == null) result = caseCharacter_Calculateable(character_CalculateableElement);
				if (result == null) result = caseCalculateableElement(character_CalculateableElement);
				if (result == null) result = caseCalculateable(character_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_ARGUMENT: {
				Character_Argument character_Argument = (Character_Argument)theEObject;
				T result = caseCharacter_Argument(character_Argument);
				if (result == null) result = caseFunctionalArgument(character_Argument);
				if (result == null) result = caseCharacter_FunctionalType(character_Argument);
				if (result == null) result = caseArgument(character_Argument);
				if (result == null) result = caseCharacter_Type(character_Argument);
				if (result == null) result = caseFunctionalType(character_Argument);
				if (result == null) result = caseTypedElement(character_Argument);
				if (result == null) result = caseObject_Type(character_Argument);
				if (result == null) result = caseType(character_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_PRIMITIVE_ARGUMENT: {
				Character_PrimitiveArgument character_PrimitiveArgument = (Character_PrimitiveArgument)theEObject;
				T result = caseCharacter_PrimitiveArgument(character_PrimitiveArgument);
				if (result == null) result = caseCharacter_Argument(character_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(character_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(character_PrimitiveArgument);
				if (result == null) result = caseCharacter_FunctionalType(character_PrimitiveArgument);
				if (result == null) result = caseArgument(character_PrimitiveArgument);
				if (result == null) result = caseCharacter_Type(character_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(character_PrimitiveArgument);
				if (result == null) result = caseTypedElement(character_PrimitiveArgument);
				if (result == null) result = caseObject_Type(character_PrimitiveArgument);
				if (result == null) result = caseType(character_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_EVALUATION_OPERATION_ARGUMENT: {
				Character_EvaluationOperation_Argument character_EvaluationOperation_Argument = (Character_EvaluationOperation_Argument)theEObject;
				T result = caseCharacter_EvaluationOperation_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCharacter_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCharacter_FunctionalType(character_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(character_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(character_EvaluationOperation_Argument);
				if (result == null) result = caseCharacter_Type(character_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(character_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(character_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(character_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(character_EvaluationOperation_Argument);
				if (result == null) result = caseType(character_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_EXPRESSION_OPERATOR: {
				Character_ExpressionOperator character_ExpressionOperator = (Character_ExpressionOperator)theEObject;
				T result = caseCharacter_ExpressionOperator(character_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(character_ExpressionOperator);
				if (result == null) result = caseCharacter_Operator(character_ExpressionOperator);
				if (result == null) result = caseOperator(character_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_BIT_OPERATOR: {
				Character_BitOperator character_BitOperator = (Character_BitOperator)theEObject;
				T result = caseCharacter_BitOperator(character_BitOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_BitOperator);
				if (result == null) result = caseBitOperator(character_BitOperator);
				if (result == null) result = caseExpressionOperator(character_BitOperator);
				if (result == null) result = caseCharacter_Operator(character_BitOperator);
				if (result == null) result = caseNegatableElement(character_BitOperator);
				if (result == null) result = caseOperator(character_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR: {
				Character_And_BitOperator character_And_BitOperator = (Character_And_BitOperator)theEObject;
				T result = caseCharacter_And_BitOperator(character_And_BitOperator);
				if (result == null) result = caseCharacter_BitOperator(character_And_BitOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_And_BitOperator);
				if (result == null) result = caseBitOperator(character_And_BitOperator);
				if (result == null) result = caseExpressionOperator(character_And_BitOperator);
				if (result == null) result = caseCharacter_Operator(character_And_BitOperator);
				if (result == null) result = caseNegatableElement(character_And_BitOperator);
				if (result == null) result = caseOperator(character_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_OR_BIT_OPERATOR: {
				Character_Or_BitOperator character_Or_BitOperator = (Character_Or_BitOperator)theEObject;
				T result = caseCharacter_Or_BitOperator(character_Or_BitOperator);
				if (result == null) result = caseCharacter_BitOperator(character_Or_BitOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_Or_BitOperator);
				if (result == null) result = caseBitOperator(character_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(character_Or_BitOperator);
				if (result == null) result = caseCharacter_Operator(character_Or_BitOperator);
				if (result == null) result = caseNegatableElement(character_Or_BitOperator);
				if (result == null) result = caseOperator(character_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Character_Original_FunctionalOperator character_Original_FunctionalOperator = (Character_Original_FunctionalOperator)theEObject;
				T result = caseCharacter_Original_FunctionalOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(character_Original_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(character_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(character_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_AT_FUNCTIONAL_OPERATOR: {
				charAt_FunctionalOperator charAt_FunctionalOperator = (charAt_FunctionalOperator)theEObject;
				T result = casecharAt_FunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_Original_FunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalType(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_Type(charAt_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(charAt_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charAt_FunctionalOperator);
				if (result == null) result = caseObject_Type(charAt_FunctionalOperator);
				if (result == null) result = caseOperator(charAt_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charAt_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(charAt_FunctionalOperator);
				if (result == null) result = caseTypedElement(charAt_FunctionalOperator);
				if (result == null) result = caseType(charAt_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR: {
				contains_FunctionalOperator contains_FunctionalOperator = (contains_FunctionalOperator)theEObject;
				T result = casecontains_FunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(contains_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(contains_FunctionalOperator);
				if (result == null) result = caseFunctionalType(contains_FunctionalOperator);
				if (result == null) result = caseNegatableElement(contains_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(contains_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(contains_FunctionalOperator);
				if (result == null) result = caseObject_Type(contains_FunctionalOperator);
				if (result == null) result = caseOperator(contains_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(contains_FunctionalOperator);
				if (result == null) result = caseString_Operator(contains_FunctionalOperator);
				if (result == null) result = caseTypedElement(contains_FunctionalOperator);
				if (result == null) result = caseType(contains_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR: {
				substring_FunctionalOperator substring_FunctionalOperator = (substring_FunctionalOperator)theEObject;
				T result = casesubstring_FunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(substring_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_Type(substring_FunctionalOperator);
				if (result == null) result = caseFunctionalType(substring_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(substring_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(substring_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(substring_FunctionalOperator);
				if (result == null) result = caseOperator(substring_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(substring_FunctionalOperator);
				if (result == null) result = caseString_Operator(substring_FunctionalOperator);
				if (result == null) result = caseTypedElement(substring_FunctionalOperator);
				if (result == null) result = caseObject_Type(substring_FunctionalOperator);
				if (result == null) result = caseType(substring_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CONCAT_FUNCTIONAL_OPERATOR: {
				concat_FunctionalOperator concat_FunctionalOperator = (concat_FunctionalOperator)theEObject;
				T result = caseconcat_FunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(concat_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_Type(concat_FunctionalOperator);
				if (result == null) result = caseFunctionalType(concat_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(concat_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(concat_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(concat_FunctionalOperator);
				if (result == null) result = caseOperator(concat_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(concat_FunctionalOperator);
				if (result == null) result = caseString_Operator(concat_FunctionalOperator);
				if (result == null) result = caseTypedElement(concat_FunctionalOperator);
				if (result == null) result = caseObject_Type(concat_FunctionalOperator);
				if (result == null) result = caseType(concat_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.ENDS_WITH_FUNCTIONAL_OPERATOR: {
				endsWith_FunctionalOperator endsWith_FunctionalOperator = (endsWith_FunctionalOperator)theEObject;
				T result = caseendsWith_FunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(endsWith_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(endsWith_FunctionalOperator);
				if (result == null) result = caseFunctionalType(endsWith_FunctionalOperator);
				if (result == null) result = caseNegatableElement(endsWith_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseObject_Type(endsWith_FunctionalOperator);
				if (result == null) result = caseOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(endsWith_FunctionalOperator);
				if (result == null) result = caseString_Operator(endsWith_FunctionalOperator);
				if (result == null) result = caseTypedElement(endsWith_FunctionalOperator);
				if (result == null) result = caseType(endsWith_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR: {
				equalsIgnoreCase_FunctionalOperator equalsIgnoreCase_FunctionalOperator = (equalsIgnoreCase_FunctionalOperator)theEObject;
				T result = caseequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseFunctionalType(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseNegatableElement(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseObject_Type(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseString_Operator(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseTypedElement(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = caseType(equalsIgnoreCase_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INDEX_OF_STRING_FUNCTIONAL_OPERATOR: {
				indexOfString_FunctionalOperator indexOfString_FunctionalOperator = (indexOfString_FunctionalOperator)theEObject;
				T result = caseindexOfString_FunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseInteger_Type(indexOfString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseNumber_Type(indexOfString_FunctionalOperator);
				if (result == null) result = caseOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(indexOfString_FunctionalOperator);
				if (result == null) result = caseString_Operator(indexOfString_FunctionalOperator);
				if (result == null) result = caseTypedElement(indexOfString_FunctionalOperator);
				if (result == null) result = caseObject_Type(indexOfString_FunctionalOperator);
				if (result == null) result = caseType(indexOfString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.IS_EMPTY_FUNCTIONAL_OPERATOR: {
				isEmpty_FunctionalOperator isEmpty_FunctionalOperator = (isEmpty_FunctionalOperator)theEObject;
				T result = caseisEmpty_FunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_Original_FunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(isEmpty_FunctionalOperator);
				if (result == null) result = caseFunctionalType(isEmpty_FunctionalOperator);
				if (result == null) result = caseNegatableElement(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseObject_Type(isEmpty_FunctionalOperator);
				if (result == null) result = caseOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(isEmpty_FunctionalOperator);
				if (result == null) result = caseString_Operator(isEmpty_FunctionalOperator);
				if (result == null) result = caseTypedElement(isEmpty_FunctionalOperator);
				if (result == null) result = caseType(isEmpty_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_OPERATOR: {
				Number_Operator number_Operator = (Number_Operator)theEObject;
				T result = caseNumber_Operator(number_Operator);
				if (result == null) result = caseOperator(number_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_TYPE: {
				Number_Type number_Type = (Number_Type)theEObject;
				T result = caseNumber_Type(number_Type);
				if (result == null) result = caseObject_Type(number_Type);
				if (result == null) result = caseType(number_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FUNCTIONAL_TYPE: {
				Number_FunctionalType number_FunctionalType = (Number_FunctionalType)theEObject;
				T result = caseNumber_FunctionalType(number_FunctionalType);
				if (result == null) result = caseNumber_Type(number_FunctionalType);
				if (result == null) result = caseFunctionalType(number_FunctionalType);
				if (result == null) result = caseObject_Type(number_FunctionalType);
				if (result == null) result = caseType(number_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_CALCULATEABLE_PARAMETER: {
				Number_CalculateableParameter number_CalculateableParameter = (Number_CalculateableParameter)theEObject;
				T result = caseNumber_CalculateableParameter(number_CalculateableParameter);
				if (result == null) result = caseNumber_Type(number_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(number_CalculateableParameter);
				if (result == null) result = caseObject_Type(number_CalculateableParameter);
				if (result == null) result = caseParameter(number_CalculateableParameter);
				if (result == null) result = caseType(number_CalculateableParameter);
				if (result == null) result = caseTypedElement(number_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FUNCTIONAL_PARAMETER: {
				Number_FunctionalParameter number_FunctionalParameter = (Number_FunctionalParameter)theEObject;
				T result = caseNumber_FunctionalParameter(number_FunctionalParameter);
				if (result == null) result = caseNumber_Type(number_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(number_FunctionalParameter);
				if (result == null) result = caseObject_Type(number_FunctionalParameter);
				if (result == null) result = caseParameter(number_FunctionalParameter);
				if (result == null) result = caseType(number_FunctionalParameter);
				if (result == null) result = caseTypedElement(number_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_CALCULATEABLE: {
				Number_Calculateable number_Calculateable = (Number_Calculateable)theEObject;
				T result = caseNumber_Calculateable(number_Calculateable);
				if (result == null) result = caseCalculateable(number_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_CALCULATEABLE_ELEMENT: {
				Number_CalculateableElement number_CalculateableElement = (Number_CalculateableElement)theEObject;
				T result = caseNumber_CalculateableElement(number_CalculateableElement);
				if (result == null) result = caseNumber_Calculateable(number_CalculateableElement);
				if (result == null) result = caseCalculateableElement(number_CalculateableElement);
				if (result == null) result = caseCalculateable(number_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_ARGUMENT: {
				Number_Argument number_Argument = (Number_Argument)theEObject;
				T result = caseNumber_Argument(number_Argument);
				if (result == null) result = caseFunctionalArgument(number_Argument);
				if (result == null) result = caseNumber_FunctionalType(number_Argument);
				if (result == null) result = caseArgument(number_Argument);
				if (result == null) result = caseNumber_Type(number_Argument);
				if (result == null) result = caseFunctionalType(number_Argument);
				if (result == null) result = caseTypedElement(number_Argument);
				if (result == null) result = caseObject_Type(number_Argument);
				if (result == null) result = caseType(number_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_PRIMITIVE_ARGUMENT: {
				Number_PrimitiveArgument number_PrimitiveArgument = (Number_PrimitiveArgument)theEObject;
				T result = caseNumber_PrimitiveArgument(number_PrimitiveArgument);
				if (result == null) result = caseNumber_Argument(number_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(number_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(number_PrimitiveArgument);
				if (result == null) result = caseNumber_FunctionalType(number_PrimitiveArgument);
				if (result == null) result = caseArgument(number_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(number_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(number_PrimitiveArgument);
				if (result == null) result = caseTypedElement(number_PrimitiveArgument);
				if (result == null) result = caseObject_Type(number_PrimitiveArgument);
				if (result == null) result = caseType(number_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_EVALUATION_OPERATION_ARGUMENT: {
				Number_EvaluationOperation_Argument number_EvaluationOperation_Argument = (Number_EvaluationOperation_Argument)theEObject;
				T result = caseNumber_EvaluationOperation_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(number_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_FunctionalType(number_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(number_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(number_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(number_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(number_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(number_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(number_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(number_EvaluationOperation_Argument);
				if (result == null) result = caseType(number_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_EXPRESSION_OPERATOR: {
				Number_ExpressionOperator number_ExpressionOperator = (Number_ExpressionOperator)theEObject;
				T result = caseNumber_ExpressionOperator(number_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(number_ExpressionOperator);
				if (result == null) result = caseNumber_Operator(number_ExpressionOperator);
				if (result == null) result = caseOperator(number_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_BIT_OPERATOR: {
				Number_BitOperator number_BitOperator = (Number_BitOperator)theEObject;
				T result = caseNumber_BitOperator(number_BitOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_BitOperator);
				if (result == null) result = caseBitOperator(number_BitOperator);
				if (result == null) result = caseExpressionOperator(number_BitOperator);
				if (result == null) result = caseNumber_Operator(number_BitOperator);
				if (result == null) result = caseNegatableElement(number_BitOperator);
				if (result == null) result = caseOperator(number_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_AND_BIT_OPERATOR: {
				Number_And_BitOperator number_And_BitOperator = (Number_And_BitOperator)theEObject;
				T result = caseNumber_And_BitOperator(number_And_BitOperator);
				if (result == null) result = caseNumber_BitOperator(number_And_BitOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_And_BitOperator);
				if (result == null) result = caseBitOperator(number_And_BitOperator);
				if (result == null) result = caseExpressionOperator(number_And_BitOperator);
				if (result == null) result = caseNumber_Operator(number_And_BitOperator);
				if (result == null) result = caseNegatableElement(number_And_BitOperator);
				if (result == null) result = caseOperator(number_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_OR_BIT_OPERATOR: {
				Number_Or_BitOperator number_Or_BitOperator = (Number_Or_BitOperator)theEObject;
				T result = caseNumber_Or_BitOperator(number_Or_BitOperator);
				if (result == null) result = caseNumber_BitOperator(number_Or_BitOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_Or_BitOperator);
				if (result == null) result = caseBitOperator(number_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(number_Or_BitOperator);
				if (result == null) result = caseNumber_Operator(number_Or_BitOperator);
				if (result == null) result = caseNegatableElement(number_Or_BitOperator);
				if (result == null) result = caseOperator(number_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Number_Original_FunctionalOperator number_Original_FunctionalOperator = (Number_Original_FunctionalOperator)theEObject;
				T result = caseNumber_Original_FunctionalOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Original_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(number_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GREATER_THAN_FUNCTIONAL_OPERATOR: {
				greaterThan_FunctionalOperator greaterThan_FunctionalOperator = (greaterThan_FunctionalOperator)theEObject;
				T result = casegreaterThan_FunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(greaterThan_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(greaterThan_FunctionalOperator);
				if (result == null) result = caseType(greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				greaterEquals_FunctionalOperator greaterEquals_FunctionalOperator = (greaterEquals_FunctionalOperator)theEObject;
				T result = casegreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				smallerThan_FunctionalOperator smallerThan_FunctionalOperator = (smallerThan_FunctionalOperator)theEObject;
				T result = casesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(smallerThan_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(smallerThan_FunctionalOperator);
				if (result == null) result = caseType(smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				smallerEquals_FunctionalOperator smallerEquals_FunctionalOperator = (smallerEquals_FunctionalOperator)theEObject;
				T result = casesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Original_FunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.PARSE_BOOLEAN_FUNCTIONAL_OPERATOR: {
				parseBoolean_FunctionalOperator parseBoolean_FunctionalOperator = (parseBoolean_FunctionalOperator)theEObject;
				T result = caseparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Original_FunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(parseBoolean_FunctionalOperator);
				if (result == null) result = caseFunctionalType(parseBoolean_FunctionalOperator);
				if (result == null) result = caseNegatableElement(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseObject_Type(parseBoolean_FunctionalOperator);
				if (result == null) result = caseOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(parseBoolean_FunctionalOperator);
				if (result == null) result = caseTypedElement(parseBoolean_FunctionalOperator);
				if (result == null) result = caseType(parseBoolean_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COMPARE_TO_FUNCTIONAL_OPERATOR: {
				compareTo_FunctionalOperator compareTo_FunctionalOperator = (compareTo_FunctionalOperator)theEObject;
				T result = casecompareTo_FunctionalOperator(compareTo_FunctionalOperator);
				if (result == null) result = caseBoolean_Original_FunctionalOperator(compareTo_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(compareTo_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(compareTo_FunctionalOperator);
				if (result == null) result = caseInteger_Type(compareTo_FunctionalOperator);
				if (result == null) result = caseFunctionalType(compareTo_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(compareTo_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(compareTo_FunctionalOperator);
				if (result == null) result = caseNumber_Type(compareTo_FunctionalOperator);
				if (result == null) result = caseOperator(compareTo_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(compareTo_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(compareTo_FunctionalOperator);
				if (result == null) result = caseTypedElement(compareTo_FunctionalOperator);
				if (result == null) result = caseObject_Type(compareTo_FunctionalOperator);
				if (result == null) result = caseType(compareTo_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_Number_equals_FunctionalOperator object_Number_equals_FunctionalOperator = (Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseObject_Number_equals_FunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Number_FunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_Number_toString_FunctionalOperator object_Number_toString_FunctionalOperator = (Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseObject_Number_toString_FunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Number_FunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FUNCTIONAL_OPERATOR: {
				Number_FunctionalOperator number_FunctionalOperator = (Number_FunctionalOperator)theEObject;
				T result = caseNumber_FunctionalOperator(number_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(number_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_FunctionalOperator);
				if (result == null) result = caseOperator(number_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(number_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_Number_FunctionalOperator inheritedFrom_Object_to_Number_FunctionalOperator = (InheritedFrom_Object_to_Number_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_Number_FunctionalOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseNumber_FunctionalOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseNumber_ExpressionOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseNumber_Operator(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_Number_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Integer_greaterThan_FunctionalOperator number_Integer_greaterThan_FunctionalOperator = (Number_Integer_greaterThan_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_greaterThan_FunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Integer_greaterEquals_FunctionalOperator number_Integer_greaterEquals_FunctionalOperator = (Number_Integer_greaterEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_greaterEquals_FunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Integer_smallerThan_FunctionalOperator number_Integer_smallerThan_FunctionalOperator = (Number_Integer_smallerThan_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_smallerThan_FunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Integer_smallerEquals_FunctionalOperator number_Integer_smallerEquals_FunctionalOperator = (Number_Integer_smallerEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_smallerEquals_FunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Integer_Object_Number_equals_FunctionalOperator number_Integer_Object_Number_equals_FunctionalOperator = (Number_Integer_Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_Object_Number_equals_FunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_Object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Number_Integer_Object_Number_toString_FunctionalOperator number_Integer_Object_Number_toString_FunctionalOperator = (Number_Integer_Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseNumber_Integer_Object_Number_toString_FunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(number_Integer_Object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_FUNCTIONAL_OPERATOR: {
				Integer_FunctionalOperator integer_FunctionalOperator = (Integer_FunctionalOperator)theEObject;
				T result = caseInteger_FunctionalOperator(integer_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(integer_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(integer_FunctionalOperator);
				if (result == null) result = caseOperator(integer_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(integer_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(integer_FunctionalOperator);
				if (result == null) result = caseTypedElement(integer_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Number_to_Integer_FunctionalOperator inheritedFrom_Number_to_Integer_FunctionalOperator = (InheritedFrom_Number_to_Integer_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Number_to_Integer_FunctionalOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseInteger_ExpressionOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseInteger_Operator(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Number_to_Integer_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_CALCULATEABLE: {
				Long_Calculateable long_Calculateable = (Long_Calculateable)theEObject;
				T result = caseLong_Calculateable(long_Calculateable);
				if (result == null) result = caseCalculateable(long_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_CALCULATEABLE_ELEMENT: {
				Long_CalculateableElement long_CalculateableElement = (Long_CalculateableElement)theEObject;
				T result = caseLong_CalculateableElement(long_CalculateableElement);
				if (result == null) result = caseLong_Calculateable(long_CalculateableElement);
				if (result == null) result = caseCalculateableElement(long_CalculateableElement);
				if (result == null) result = caseCalculateable(long_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_OPERATOR: {
				Long_Operator long_Operator = (Long_Operator)theEObject;
				T result = caseLong_Operator(long_Operator);
				if (result == null) result = caseOperator(long_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_TYPE: {
				Long_Type long_Type = (Long_Type)theEObject;
				T result = caseLong_Type(long_Type);
				if (result == null) result = caseNumber_Type(long_Type);
				if (result == null) result = caseObject_Type(long_Type);
				if (result == null) result = caseType(long_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_FUNCTIONAL_TYPE: {
				Long_FunctionalType long_FunctionalType = (Long_FunctionalType)theEObject;
				T result = caseLong_FunctionalType(long_FunctionalType);
				if (result == null) result = caseLong_Type(long_FunctionalType);
				if (result == null) result = caseFunctionalType(long_FunctionalType);
				if (result == null) result = caseNumber_Type(long_FunctionalType);
				if (result == null) result = caseObject_Type(long_FunctionalType);
				if (result == null) result = caseType(long_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_CALCULATEABLE_PARAMETER: {
				Long_CalculateableParameter long_CalculateableParameter = (Long_CalculateableParameter)theEObject;
				T result = caseLong_CalculateableParameter(long_CalculateableParameter);
				if (result == null) result = caseLong_Type(long_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(long_CalculateableParameter);
				if (result == null) result = caseNumber_Type(long_CalculateableParameter);
				if (result == null) result = caseParameter(long_CalculateableParameter);
				if (result == null) result = caseObject_Type(long_CalculateableParameter);
				if (result == null) result = caseTypedElement(long_CalculateableParameter);
				if (result == null) result = caseType(long_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_FUNCTIONAL_PARAMETER: {
				Long_FunctionalParameter long_FunctionalParameter = (Long_FunctionalParameter)theEObject;
				T result = caseLong_FunctionalParameter(long_FunctionalParameter);
				if (result == null) result = caseLong_Type(long_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(long_FunctionalParameter);
				if (result == null) result = caseNumber_Type(long_FunctionalParameter);
				if (result == null) result = caseParameter(long_FunctionalParameter);
				if (result == null) result = caseObject_Type(long_FunctionalParameter);
				if (result == null) result = caseTypedElement(long_FunctionalParameter);
				if (result == null) result = caseType(long_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_ARGUMENT: {
				Long_Argument long_Argument = (Long_Argument)theEObject;
				T result = caseLong_Argument(long_Argument);
				if (result == null) result = caseFunctionalArgument(long_Argument);
				if (result == null) result = caseLong_FunctionalType(long_Argument);
				if (result == null) result = caseArgument(long_Argument);
				if (result == null) result = caseLong_Type(long_Argument);
				if (result == null) result = caseFunctionalType(long_Argument);
				if (result == null) result = caseTypedElement(long_Argument);
				if (result == null) result = caseNumber_Type(long_Argument);
				if (result == null) result = caseObject_Type(long_Argument);
				if (result == null) result = caseType(long_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_PRIMITIVE_ARGUMENT: {
				Long_PrimitiveArgument long_PrimitiveArgument = (Long_PrimitiveArgument)theEObject;
				T result = caseLong_PrimitiveArgument(long_PrimitiveArgument);
				if (result == null) result = caseLong_Argument(long_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(long_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(long_PrimitiveArgument);
				if (result == null) result = caseLong_FunctionalType(long_PrimitiveArgument);
				if (result == null) result = caseArgument(long_PrimitiveArgument);
				if (result == null) result = caseLong_Type(long_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(long_PrimitiveArgument);
				if (result == null) result = caseTypedElement(long_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(long_PrimitiveArgument);
				if (result == null) result = caseObject_Type(long_PrimitiveArgument);
				if (result == null) result = caseType(long_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_EVALUATION_OPERATION_ARGUMENT: {
				Long_EvaluationOperation_Argument long_EvaluationOperation_Argument = (Long_EvaluationOperation_Argument)theEObject;
				T result = caseLong_EvaluationOperation_Argument(long_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(long_EvaluationOperation_Argument);
				if (result == null) result = caseLong_Argument(long_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(long_EvaluationOperation_Argument);
				if (result == null) result = caseLong_FunctionalType(long_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(long_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(long_EvaluationOperation_Argument);
				if (result == null) result = caseLong_Type(long_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(long_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(long_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(long_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(long_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(long_EvaluationOperation_Argument);
				if (result == null) result = caseType(long_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_EXPRESSION_OPERATOR: {
				Long_ExpressionOperator long_ExpressionOperator = (Long_ExpressionOperator)theEObject;
				T result = caseLong_ExpressionOperator(long_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(long_ExpressionOperator);
				if (result == null) result = caseLong_Operator(long_ExpressionOperator);
				if (result == null) result = caseOperator(long_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_BIT_OPERATOR: {
				Long_BitOperator long_BitOperator = (Long_BitOperator)theEObject;
				T result = caseLong_BitOperator(long_BitOperator);
				if (result == null) result = caseLong_ExpressionOperator(long_BitOperator);
				if (result == null) result = caseBitOperator(long_BitOperator);
				if (result == null) result = caseExpressionOperator(long_BitOperator);
				if (result == null) result = caseLong_Operator(long_BitOperator);
				if (result == null) result = caseNegatableElement(long_BitOperator);
				if (result == null) result = caseOperator(long_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_AND_BIT_OPERATOR: {
				Long_And_BitOperator long_And_BitOperator = (Long_And_BitOperator)theEObject;
				T result = caseLong_And_BitOperator(long_And_BitOperator);
				if (result == null) result = caseLong_BitOperator(long_And_BitOperator);
				if (result == null) result = caseLong_ExpressionOperator(long_And_BitOperator);
				if (result == null) result = caseBitOperator(long_And_BitOperator);
				if (result == null) result = caseExpressionOperator(long_And_BitOperator);
				if (result == null) result = caseLong_Operator(long_And_BitOperator);
				if (result == null) result = caseNegatableElement(long_And_BitOperator);
				if (result == null) result = caseOperator(long_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_OR_BIT_OPERATOR: {
				Long_Or_BitOperator long_Or_BitOperator = (Long_Or_BitOperator)theEObject;
				T result = caseLong_Or_BitOperator(long_Or_BitOperator);
				if (result == null) result = caseLong_BitOperator(long_Or_BitOperator);
				if (result == null) result = caseLong_ExpressionOperator(long_Or_BitOperator);
				if (result == null) result = caseBitOperator(long_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(long_Or_BitOperator);
				if (result == null) result = caseLong_Operator(long_Or_BitOperator);
				if (result == null) result = caseNegatableElement(long_Or_BitOperator);
				if (result == null) result = caseOperator(long_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Long_Original_FunctionalOperator long_Original_FunctionalOperator = (Long_Original_FunctionalOperator)theEObject;
				T result = caseLong_Original_FunctionalOperator(long_Original_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(long_Original_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(long_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(long_Original_FunctionalOperator);
				if (result == null) result = caseOperator(long_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(long_Original_FunctionalOperator);
				if (result == null) result = caseLong_Operator(long_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(long_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_LONG_GREATER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Long_greaterThan_FunctionalOperator number_Long_greaterThan_FunctionalOperator = (Number_Long_greaterThan_FunctionalOperator)theEObject;
				T result = caseNumber_Long_greaterThan_FunctionalOperator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Long_FunctionalOperator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseLong_Operator(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = caseType(number_Long_greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_LONG_GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Long_greaterEquals_FunctionalOperator number_Long_greaterEquals_FunctionalOperator = (Number_Long_greaterEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Long_greaterEquals_FunctionalOperator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Long_FunctionalOperator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseLong_Operator(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Long_greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_LONG_SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Long_smallerThan_FunctionalOperator number_Long_smallerThan_FunctionalOperator = (Number_Long_smallerThan_FunctionalOperator)theEObject;
				T result = caseNumber_Long_smallerThan_FunctionalOperator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Long_FunctionalOperator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseLong_Operator(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = caseType(number_Long_smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_LONG_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Long_smallerEquals_FunctionalOperator number_Long_smallerEquals_FunctionalOperator = (Number_Long_smallerEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Long_smallerEquals_FunctionalOperator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Long_FunctionalOperator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseLong_Operator(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Long_smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_LONG_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Long_Object_Number_equals_FunctionalOperator number_Long_Object_Number_equals_FunctionalOperator = (Number_Long_Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseNumber_Long_Object_Number_equals_FunctionalOperator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Long_FunctionalOperator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseLong_Operator(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(number_Long_Object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_LONG_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Number_Long_Object_Number_toString_FunctionalOperator number_Long_Object_Number_toString_FunctionalOperator = (Number_Long_Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseNumber_Long_Object_Number_toString_FunctionalOperator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Long_FunctionalOperator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseLong_Operator(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(number_Long_Object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.LONG_FUNCTIONAL_OPERATOR: {
				Long_FunctionalOperator long_FunctionalOperator = (Long_FunctionalOperator)theEObject;
				T result = caseLong_FunctionalOperator(long_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(long_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(long_FunctionalOperator);
				if (result == null) result = caseOperator(long_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(long_FunctionalOperator);
				if (result == null) result = caseLong_Operator(long_FunctionalOperator);
				if (result == null) result = caseTypedElement(long_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_NUMBER_TO_LONG_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Number_to_Long_FunctionalOperator inheritedFrom_Number_to_Long_FunctionalOperator = (InheritedFrom_Number_to_Long_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Number_to_Long_FunctionalOperator(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = caseLong_FunctionalOperator(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = caseLong_ExpressionOperator(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = caseLong_Operator(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Number_to_Long_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_CALCULATEABLE: {
				Double_Calculateable double_Calculateable = (Double_Calculateable)theEObject;
				T result = caseDouble_Calculateable(double_Calculateable);
				if (result == null) result = caseCalculateable(double_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_CALCULATEABLE_ELEMENT: {
				Double_CalculateableElement double_CalculateableElement = (Double_CalculateableElement)theEObject;
				T result = caseDouble_CalculateableElement(double_CalculateableElement);
				if (result == null) result = caseDouble_Calculateable(double_CalculateableElement);
				if (result == null) result = caseCalculateableElement(double_CalculateableElement);
				if (result == null) result = caseCalculateable(double_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_OPERATOR: {
				Double_Operator double_Operator = (Double_Operator)theEObject;
				T result = caseDouble_Operator(double_Operator);
				if (result == null) result = caseOperator(double_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_TYPE: {
				Double_Type double_Type = (Double_Type)theEObject;
				T result = caseDouble_Type(double_Type);
				if (result == null) result = caseNumber_Type(double_Type);
				if (result == null) result = caseObject_Type(double_Type);
				if (result == null) result = caseType(double_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_FUNCTIONAL_TYPE: {
				Double_FunctionalType double_FunctionalType = (Double_FunctionalType)theEObject;
				T result = caseDouble_FunctionalType(double_FunctionalType);
				if (result == null) result = caseDouble_Type(double_FunctionalType);
				if (result == null) result = caseFunctionalType(double_FunctionalType);
				if (result == null) result = caseNumber_Type(double_FunctionalType);
				if (result == null) result = caseObject_Type(double_FunctionalType);
				if (result == null) result = caseType(double_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_CALCULATEABLE_PARAMETER: {
				Double_CalculateableParameter double_CalculateableParameter = (Double_CalculateableParameter)theEObject;
				T result = caseDouble_CalculateableParameter(double_CalculateableParameter);
				if (result == null) result = caseDouble_Type(double_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(double_CalculateableParameter);
				if (result == null) result = caseNumber_Type(double_CalculateableParameter);
				if (result == null) result = caseParameter(double_CalculateableParameter);
				if (result == null) result = caseObject_Type(double_CalculateableParameter);
				if (result == null) result = caseTypedElement(double_CalculateableParameter);
				if (result == null) result = caseType(double_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_FUNCTIONAL_PARAMETER: {
				Double_FunctionalParameter double_FunctionalParameter = (Double_FunctionalParameter)theEObject;
				T result = caseDouble_FunctionalParameter(double_FunctionalParameter);
				if (result == null) result = caseDouble_Type(double_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(double_FunctionalParameter);
				if (result == null) result = caseNumber_Type(double_FunctionalParameter);
				if (result == null) result = caseParameter(double_FunctionalParameter);
				if (result == null) result = caseObject_Type(double_FunctionalParameter);
				if (result == null) result = caseTypedElement(double_FunctionalParameter);
				if (result == null) result = caseType(double_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_ARGUMENT: {
				Double_Argument double_Argument = (Double_Argument)theEObject;
				T result = caseDouble_Argument(double_Argument);
				if (result == null) result = caseFunctionalArgument(double_Argument);
				if (result == null) result = caseDouble_FunctionalType(double_Argument);
				if (result == null) result = caseArgument(double_Argument);
				if (result == null) result = caseDouble_Type(double_Argument);
				if (result == null) result = caseFunctionalType(double_Argument);
				if (result == null) result = caseTypedElement(double_Argument);
				if (result == null) result = caseNumber_Type(double_Argument);
				if (result == null) result = caseObject_Type(double_Argument);
				if (result == null) result = caseType(double_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_PRIMITIVE_ARGUMENT: {
				Double_PrimitiveArgument double_PrimitiveArgument = (Double_PrimitiveArgument)theEObject;
				T result = caseDouble_PrimitiveArgument(double_PrimitiveArgument);
				if (result == null) result = caseDouble_Argument(double_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(double_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(double_PrimitiveArgument);
				if (result == null) result = caseDouble_FunctionalType(double_PrimitiveArgument);
				if (result == null) result = caseArgument(double_PrimitiveArgument);
				if (result == null) result = caseDouble_Type(double_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(double_PrimitiveArgument);
				if (result == null) result = caseTypedElement(double_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(double_PrimitiveArgument);
				if (result == null) result = caseObject_Type(double_PrimitiveArgument);
				if (result == null) result = caseType(double_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_EVALUATION_OPERATION_ARGUMENT: {
				Double_EvaluationOperation_Argument double_EvaluationOperation_Argument = (Double_EvaluationOperation_Argument)theEObject;
				T result = caseDouble_EvaluationOperation_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseDouble_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(double_EvaluationOperation_Argument);
				if (result == null) result = caseDouble_FunctionalType(double_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(double_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(double_EvaluationOperation_Argument);
				if (result == null) result = caseDouble_Type(double_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(double_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(double_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(double_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(double_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(double_EvaluationOperation_Argument);
				if (result == null) result = caseType(double_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_EXPRESSION_OPERATOR: {
				Double_ExpressionOperator double_ExpressionOperator = (Double_ExpressionOperator)theEObject;
				T result = caseDouble_ExpressionOperator(double_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(double_ExpressionOperator);
				if (result == null) result = caseDouble_Operator(double_ExpressionOperator);
				if (result == null) result = caseOperator(double_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_BIT_OPERATOR: {
				Double_BitOperator double_BitOperator = (Double_BitOperator)theEObject;
				T result = caseDouble_BitOperator(double_BitOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_BitOperator);
				if (result == null) result = caseBitOperator(double_BitOperator);
				if (result == null) result = caseExpressionOperator(double_BitOperator);
				if (result == null) result = caseDouble_Operator(double_BitOperator);
				if (result == null) result = caseNegatableElement(double_BitOperator);
				if (result == null) result = caseOperator(double_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_AND_BIT_OPERATOR: {
				Double_And_BitOperator double_And_BitOperator = (Double_And_BitOperator)theEObject;
				T result = caseDouble_And_BitOperator(double_And_BitOperator);
				if (result == null) result = caseDouble_BitOperator(double_And_BitOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_And_BitOperator);
				if (result == null) result = caseBitOperator(double_And_BitOperator);
				if (result == null) result = caseExpressionOperator(double_And_BitOperator);
				if (result == null) result = caseDouble_Operator(double_And_BitOperator);
				if (result == null) result = caseNegatableElement(double_And_BitOperator);
				if (result == null) result = caseOperator(double_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_OR_BIT_OPERATOR: {
				Double_Or_BitOperator double_Or_BitOperator = (Double_Or_BitOperator)theEObject;
				T result = caseDouble_Or_BitOperator(double_Or_BitOperator);
				if (result == null) result = caseDouble_BitOperator(double_Or_BitOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_Or_BitOperator);
				if (result == null) result = caseBitOperator(double_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(double_Or_BitOperator);
				if (result == null) result = caseDouble_Operator(double_Or_BitOperator);
				if (result == null) result = caseNegatableElement(double_Or_BitOperator);
				if (result == null) result = caseOperator(double_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Double_Original_FunctionalOperator double_Original_FunctionalOperator = (Double_Original_FunctionalOperator)theEObject;
				T result = caseDouble_Original_FunctionalOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(double_Original_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(double_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(double_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Double_greaterThan_FunctionalOperator number_Double_greaterThan_FunctionalOperator = (Number_Double_greaterThan_FunctionalOperator)theEObject;
				T result = caseNumber_Double_greaterThan_FunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = caseType(number_Double_greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Double_greaterEquals_FunctionalOperator number_Double_greaterEquals_FunctionalOperator = (Number_Double_greaterEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Double_greaterEquals_FunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Double_greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Double_smallerThan_FunctionalOperator number_Double_smallerThan_FunctionalOperator = (Number_Double_smallerThan_FunctionalOperator)theEObject;
				T result = caseNumber_Double_smallerThan_FunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = caseType(number_Double_smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Double_smallerEquals_FunctionalOperator number_Double_smallerEquals_FunctionalOperator = (Number_Double_smallerEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Double_smallerEquals_FunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Double_smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Double_Object_Number_equals_FunctionalOperator number_Double_Object_Number_equals_FunctionalOperator = (Number_Double_Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseNumber_Double_Object_Number_equals_FunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(number_Double_Object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Number_Double_Object_Number_toString_FunctionalOperator number_Double_Object_Number_toString_FunctionalOperator = (Number_Double_Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseNumber_Double_Object_Number_toString_FunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Double_FunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(number_Double_Object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.DOUBLE_FUNCTIONAL_OPERATOR: {
				Double_FunctionalOperator double_FunctionalOperator = (Double_FunctionalOperator)theEObject;
				T result = caseDouble_FunctionalOperator(double_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(double_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(double_FunctionalOperator);
				if (result == null) result = caseOperator(double_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(double_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(double_FunctionalOperator);
				if (result == null) result = caseTypedElement(double_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Number_to_Double_FunctionalOperator inheritedFrom_Number_to_Double_FunctionalOperator = (InheritedFrom_Number_to_Double_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Number_to_Double_FunctionalOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseDouble_FunctionalOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseDouble_ExpressionOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseDouble_Operator(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Number_to_Double_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_CALCULATEABLE: {
				Float_Calculateable float_Calculateable = (Float_Calculateable)theEObject;
				T result = caseFloat_Calculateable(float_Calculateable);
				if (result == null) result = caseCalculateable(float_Calculateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_CALCULATEABLE_ELEMENT: {
				Float_CalculateableElement float_CalculateableElement = (Float_CalculateableElement)theEObject;
				T result = caseFloat_CalculateableElement(float_CalculateableElement);
				if (result == null) result = caseFloat_Calculateable(float_CalculateableElement);
				if (result == null) result = caseCalculateableElement(float_CalculateableElement);
				if (result == null) result = caseCalculateable(float_CalculateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_OPERATOR: {
				Float_Operator float_Operator = (Float_Operator)theEObject;
				T result = caseFloat_Operator(float_Operator);
				if (result == null) result = caseOperator(float_Operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_TYPE: {
				Float_Type float_Type = (Float_Type)theEObject;
				T result = caseFloat_Type(float_Type);
				if (result == null) result = caseNumber_Type(float_Type);
				if (result == null) result = caseObject_Type(float_Type);
				if (result == null) result = caseType(float_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_FUNCTIONAL_TYPE: {
				Float_FunctionalType float_FunctionalType = (Float_FunctionalType)theEObject;
				T result = caseFloat_FunctionalType(float_FunctionalType);
				if (result == null) result = caseFloat_Type(float_FunctionalType);
				if (result == null) result = caseFunctionalType(float_FunctionalType);
				if (result == null) result = caseNumber_Type(float_FunctionalType);
				if (result == null) result = caseObject_Type(float_FunctionalType);
				if (result == null) result = caseType(float_FunctionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_CALCULATEABLE_PARAMETER: {
				Float_CalculateableParameter float_CalculateableParameter = (Float_CalculateableParameter)theEObject;
				T result = caseFloat_CalculateableParameter(float_CalculateableParameter);
				if (result == null) result = caseFloat_Type(float_CalculateableParameter);
				if (result == null) result = caseCalculateableParameter(float_CalculateableParameter);
				if (result == null) result = caseNumber_Type(float_CalculateableParameter);
				if (result == null) result = caseParameter(float_CalculateableParameter);
				if (result == null) result = caseObject_Type(float_CalculateableParameter);
				if (result == null) result = caseTypedElement(float_CalculateableParameter);
				if (result == null) result = caseType(float_CalculateableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_FUNCTIONAL_PARAMETER: {
				Float_FunctionalParameter float_FunctionalParameter = (Float_FunctionalParameter)theEObject;
				T result = caseFloat_FunctionalParameter(float_FunctionalParameter);
				if (result == null) result = caseFloat_Type(float_FunctionalParameter);
				if (result == null) result = caseFunctionalParameter(float_FunctionalParameter);
				if (result == null) result = caseNumber_Type(float_FunctionalParameter);
				if (result == null) result = caseParameter(float_FunctionalParameter);
				if (result == null) result = caseObject_Type(float_FunctionalParameter);
				if (result == null) result = caseTypedElement(float_FunctionalParameter);
				if (result == null) result = caseType(float_FunctionalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_ARGUMENT: {
				Float_Argument float_Argument = (Float_Argument)theEObject;
				T result = caseFloat_Argument(float_Argument);
				if (result == null) result = caseFunctionalArgument(float_Argument);
				if (result == null) result = caseFloat_FunctionalType(float_Argument);
				if (result == null) result = caseArgument(float_Argument);
				if (result == null) result = caseFloat_Type(float_Argument);
				if (result == null) result = caseFunctionalType(float_Argument);
				if (result == null) result = caseTypedElement(float_Argument);
				if (result == null) result = caseNumber_Type(float_Argument);
				if (result == null) result = caseObject_Type(float_Argument);
				if (result == null) result = caseType(float_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_PRIMITIVE_ARGUMENT: {
				Float_PrimitiveArgument float_PrimitiveArgument = (Float_PrimitiveArgument)theEObject;
				T result = caseFloat_PrimitiveArgument(float_PrimitiveArgument);
				if (result == null) result = caseFloat_Argument(float_PrimitiveArgument);
				if (result == null) result = casePrimitiveArgument(float_PrimitiveArgument);
				if (result == null) result = caseFunctionalArgument(float_PrimitiveArgument);
				if (result == null) result = caseFloat_FunctionalType(float_PrimitiveArgument);
				if (result == null) result = caseArgument(float_PrimitiveArgument);
				if (result == null) result = caseFloat_Type(float_PrimitiveArgument);
				if (result == null) result = caseFunctionalType(float_PrimitiveArgument);
				if (result == null) result = caseTypedElement(float_PrimitiveArgument);
				if (result == null) result = caseNumber_Type(float_PrimitiveArgument);
				if (result == null) result = caseObject_Type(float_PrimitiveArgument);
				if (result == null) result = caseType(float_PrimitiveArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_EVALUATION_OPERATION_ARGUMENT: {
				Float_EvaluationOperation_Argument float_EvaluationOperation_Argument = (Float_EvaluationOperation_Argument)theEObject;
				T result = caseFloat_EvaluationOperation_Argument(float_EvaluationOperation_Argument);
				if (result == null) result = caseEvaluationOperation_Argument(float_EvaluationOperation_Argument);
				if (result == null) result = caseFloat_Argument(float_EvaluationOperation_Argument);
				if (result == null) result = caseCalculateable_Argument(float_EvaluationOperation_Argument);
				if (result == null) result = caseFloat_FunctionalType(float_EvaluationOperation_Argument);
				if (result == null) result = caseReferenceArgument(float_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalArgument(float_EvaluationOperation_Argument);
				if (result == null) result = caseFloat_Type(float_EvaluationOperation_Argument);
				if (result == null) result = caseFunctionalType(float_EvaluationOperation_Argument);
				if (result == null) result = caseArgument(float_EvaluationOperation_Argument);
				if (result == null) result = caseNumber_Type(float_EvaluationOperation_Argument);
				if (result == null) result = caseTypedElement(float_EvaluationOperation_Argument);
				if (result == null) result = caseObject_Type(float_EvaluationOperation_Argument);
				if (result == null) result = caseType(float_EvaluationOperation_Argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_EXPRESSION_OPERATOR: {
				Float_ExpressionOperator float_ExpressionOperator = (Float_ExpressionOperator)theEObject;
				T result = caseFloat_ExpressionOperator(float_ExpressionOperator);
				if (result == null) result = caseExpressionOperator(float_ExpressionOperator);
				if (result == null) result = caseFloat_Operator(float_ExpressionOperator);
				if (result == null) result = caseOperator(float_ExpressionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_BIT_OPERATOR: {
				Float_BitOperator float_BitOperator = (Float_BitOperator)theEObject;
				T result = caseFloat_BitOperator(float_BitOperator);
				if (result == null) result = caseFloat_ExpressionOperator(float_BitOperator);
				if (result == null) result = caseBitOperator(float_BitOperator);
				if (result == null) result = caseExpressionOperator(float_BitOperator);
				if (result == null) result = caseFloat_Operator(float_BitOperator);
				if (result == null) result = caseNegatableElement(float_BitOperator);
				if (result == null) result = caseOperator(float_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_AND_BIT_OPERATOR: {
				Float_And_BitOperator float_And_BitOperator = (Float_And_BitOperator)theEObject;
				T result = caseFloat_And_BitOperator(float_And_BitOperator);
				if (result == null) result = caseFloat_BitOperator(float_And_BitOperator);
				if (result == null) result = caseFloat_ExpressionOperator(float_And_BitOperator);
				if (result == null) result = caseBitOperator(float_And_BitOperator);
				if (result == null) result = caseExpressionOperator(float_And_BitOperator);
				if (result == null) result = caseFloat_Operator(float_And_BitOperator);
				if (result == null) result = caseNegatableElement(float_And_BitOperator);
				if (result == null) result = caseOperator(float_And_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_OR_BIT_OPERATOR: {
				Float_Or_BitOperator float_Or_BitOperator = (Float_Or_BitOperator)theEObject;
				T result = caseFloat_Or_BitOperator(float_Or_BitOperator);
				if (result == null) result = caseFloat_BitOperator(float_Or_BitOperator);
				if (result == null) result = caseFloat_ExpressionOperator(float_Or_BitOperator);
				if (result == null) result = caseBitOperator(float_Or_BitOperator);
				if (result == null) result = caseExpressionOperator(float_Or_BitOperator);
				if (result == null) result = caseFloat_Operator(float_Or_BitOperator);
				if (result == null) result = caseNegatableElement(float_Or_BitOperator);
				if (result == null) result = caseOperator(float_Or_BitOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_ORIGINAL_FUNCTIONAL_OPERATOR: {
				Float_Original_FunctionalOperator float_Original_FunctionalOperator = (Float_Original_FunctionalOperator)theEObject;
				T result = caseFloat_Original_FunctionalOperator(float_Original_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(float_Original_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(float_Original_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(float_Original_FunctionalOperator);
				if (result == null) result = caseOperator(float_Original_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(float_Original_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(float_Original_FunctionalOperator);
				if (result == null) result = caseTypedElement(float_Original_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FLOAT_GREATER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Float_greaterThan_FunctionalOperator number_Float_greaterThan_FunctionalOperator = (Number_Float_greaterThan_FunctionalOperator)theEObject;
				T result = caseNumber_Float_greaterThan_FunctionalOperator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Float_FunctionalOperator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = caseType(number_Float_greaterThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FLOAT_GREATER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Float_greaterEquals_FunctionalOperator number_Float_greaterEquals_FunctionalOperator = (Number_Float_greaterEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Float_greaterEquals_FunctionalOperator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Float_FunctionalOperator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Float_greaterEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FLOAT_SMALLER_THAN_FUNCTIONAL_OPERATOR: {
				Number_Float_smallerThan_FunctionalOperator number_Float_smallerThan_FunctionalOperator = (Number_Float_smallerThan_FunctionalOperator)theEObject;
				T result = caseNumber_Float_smallerThan_FunctionalOperator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Float_FunctionalOperator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseOperator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = caseType(number_Float_smallerThan_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FLOAT_SMALLER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Float_smallerEquals_FunctionalOperator number_Float_smallerEquals_FunctionalOperator = (Number_Float_smallerEquals_FunctionalOperator)theEObject;
				T result = caseNumber_Float_smallerEquals_FunctionalOperator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Float_FunctionalOperator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = caseType(number_Float_smallerEquals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FLOAT_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR: {
				Number_Float_Object_Number_equals_FunctionalOperator number_Float_Object_Number_equals_FunctionalOperator = (Number_Float_Object_Number_equals_FunctionalOperator)theEObject;
				T result = caseNumber_Float_Object_Number_equals_FunctionalOperator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Float_FunctionalOperator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseOperator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = caseType(number_Float_Object_Number_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.NUMBER_FLOAT_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Number_Float_Object_Number_toString_FunctionalOperator number_Float_Object_Number_toString_FunctionalOperator = (Number_Float_Object_Number_toString_FunctionalOperator)theEObject;
				T result = caseNumber_Float_Object_Number_toString_FunctionalOperator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Number_to_Float_FunctionalOperator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseOperator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = caseType(number_Float_Object_Number_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.FLOAT_FUNCTIONAL_OPERATOR: {
				Float_FunctionalOperator float_FunctionalOperator = (Float_FunctionalOperator)theEObject;
				T result = caseFloat_FunctionalOperator(float_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(float_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(float_FunctionalOperator);
				if (result == null) result = caseOperator(float_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(float_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(float_FunctionalOperator);
				if (result == null) result = caseTypedElement(float_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_NUMBER_TO_FLOAT_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Number_to_Float_FunctionalOperator inheritedFrom_Number_to_Float_FunctionalOperator = (InheritedFrom_Number_to_Float_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Number_to_Float_FunctionalOperator(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = caseFloat_FunctionalOperator(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = caseFloat_ExpressionOperator(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = caseFloat_Operator(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Number_to_Float_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_CharSequence_equals_FunctionalOperator object_CharSequence_equals_FunctionalOperator = (Object_CharSequence_equals_FunctionalOperator)theEObject;
				T result = caseObject_CharSequence_equals_FunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseType(object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_CharSequence_toString_FunctionalOperator object_CharSequence_toString_FunctionalOperator = (Object_CharSequence_toString_FunctionalOperator)theEObject;
				T result = caseObject_CharSequence_toString_FunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseType(object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR: {
				CharSequence_FunctionalOperator charSequence_FunctionalOperator = (CharSequence_FunctionalOperator)theEObject;
				T result = caseCharSequence_FunctionalOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(charSequence_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_CharSequence_FunctionalOperator inheritedFrom_Object_to_CharSequence_FunctionalOperator = (InheritedFrom_Object_to_CharSequence_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_FunctionalOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_ExpressionOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseCharSequence_Operator(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_CharSequence_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_Character_equals_FunctionalOperator object_Character_equals_FunctionalOperator = (Object_Character_equals_FunctionalOperator)theEObject;
				T result = caseObject_Character_equals_FunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Character_FunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Character_equals_FunctionalOperator);
				if (result == null) result = caseType(object_Character_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_Character_toString_FunctionalOperator object_Character_toString_FunctionalOperator = (Object_Character_toString_FunctionalOperator)theEObject;
				T result = caseObject_Character_toString_FunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Character_FunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Character_toString_FunctionalOperator);
				if (result == null) result = caseType(object_Character_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR: {
				Character_FunctionalOperator character_FunctionalOperator = (Character_FunctionalOperator)theEObject;
				T result = caseCharacter_FunctionalOperator(character_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(character_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(character_FunctionalOperator);
				if (result == null) result = caseOperator(character_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(character_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(character_FunctionalOperator);
				if (result == null) result = caseTypedElement(character_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_Character_FunctionalOperator inheritedFrom_Object_to_Character_FunctionalOperator = (InheritedFrom_Object_to_Character_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_Character_FunctionalOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseCharacter_FunctionalOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseCharacter_ExpressionOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseCharacter_Operator(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_Character_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR: {
				Object_Boolean_equals_FunctionalOperator object_Boolean_equals_FunctionalOperator = (Object_Boolean_equals_FunctionalOperator)theEObject;
				T result = caseObject_Boolean_equals_FunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Boolean_FunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = caseType(object_Boolean_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR: {
				Object_Boolean_toString_FunctionalOperator object_Boolean_toString_FunctionalOperator = (Object_Boolean_toString_FunctionalOperator)theEObject;
				T result = caseObject_Boolean_toString_FunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_Object_to_Boolean_FunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = caseType(object_Boolean_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.BOOLEAN_FUNCTIONAL_OPERATOR: {
				Boolean_FunctionalOperator boolean_FunctionalOperator = (Boolean_FunctionalOperator)theEObject;
				T result = caseBoolean_FunctionalOperator(boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(boolean_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(boolean_FunctionalOperator);
				if (result == null) result = caseOperator(boolean_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(boolean_FunctionalOperator);
				if (result == null) result = caseTypedElement(boolean_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR: {
				InheritedFrom_Object_to_Boolean_FunctionalOperator inheritedFrom_Object_to_Boolean_FunctionalOperator = (InheritedFrom_Object_to_Boolean_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_Object_to_Boolean_FunctionalOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_ExpressionOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseBoolean_Operator(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_Object_to_Boolean_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR: {
				CharSequence_String_length_FunctionalOperator charSequence_String_length_FunctionalOperator = (CharSequence_String_length_FunctionalOperator)theEObject;
				T result = caseCharSequence_String_length_FunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseInteger_FunctionalType(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseInteger_Type(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseNumber_Type(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseString_Operator(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseObject_Type(charSequence_String_length_FunctionalOperator);
				if (result == null) result = caseType(charSequence_String_length_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR: {
				CharSequence_String_Object_CharSequence_equals_FunctionalOperator charSequence_String_Object_CharSequence_equals_FunctionalOperator = (CharSequence_String_Object_CharSequence_equals_FunctionalOperator)theEObject;
				T result = caseCharSequence_String_Object_CharSequence_equals_FunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_FunctionalType(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseBoolean_Type(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseNegatableElement(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseObject_Type(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseString_Operator(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = caseType(charSequence_String_Object_CharSequence_equals_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: {
				CharSequence_String_Object_CharSequence_toString_FunctionalOperator charSequence_String_Object_CharSequence_toString_FunctionalOperator = (CharSequence_String_Object_CharSequence_toString_FunctionalOperator)theEObject;
				T result = caseCharSequence_String_Object_CharSequence_toString_FunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalType(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_Type(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalType(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseCharSequence_Type(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseString_Operator(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseTypedElement(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseObject_Type(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = caseType(charSequence_String_Object_CharSequence_toString_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.STRING_FUNCTIONAL_OPERATOR: {
				String_FunctionalOperator string_FunctionalOperator = (String_FunctionalOperator)theEObject;
				T result = caseString_FunctionalOperator(string_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(string_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(string_FunctionalOperator);
				if (result == null) result = caseOperator(string_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(string_FunctionalOperator);
				if (result == null) result = caseString_Operator(string_FunctionalOperator);
				if (result == null) result = caseTypedElement(string_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR: {
				InheritedFrom_CharSequence_to_String_FunctionalOperator inheritedFrom_CharSequence_to_String_FunctionalOperator = (InheritedFrom_CharSequence_to_String_FunctionalOperator)theEObject;
				T result = caseInheritedFrom_CharSequence_to_String_FunctionalOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseString_FunctionalOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseString_ExpressionOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseFunctionalOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseExpressionOperator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseString_Operator(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = caseTypedElement(inheritedFrom_CharSequence_to_String_FunctionalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.COUNT_AGGREGATION_OPERATOR: {
				Count_AggregationOperator count_AggregationOperator = (Count_AggregationOperator)theEObject;
				T result = caseCount_AggregationOperator(count_AggregationOperator);
				if (result == null) result = caseCountingAggregationOperator(count_AggregationOperator);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(count_AggregationOperator);
				if (result == null) result = caseAggregationOperator(count_AggregationOperator);
				if (result == null) result = caseEvaluationOperation_Argument(count_AggregationOperator);
				if (result == null) result = caseInteger_Argument(count_AggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(count_AggregationOperator);
				if (result == null) result = caseInteger_Calculateable(count_AggregationOperator);
				if (result == null) result = caseCalculateable_Argument(count_AggregationOperator);
				if (result == null) result = caseInteger_FunctionalType(count_AggregationOperator);
				if (result == null) result = caseEvaluationOperator(count_AggregationOperator);
				if (result == null) result = caseFunctionalOperator(count_AggregationOperator);
				if (result == null) result = caseCalculateable(count_AggregationOperator);
				if (result == null) result = caseReferenceArgument(count_AggregationOperator);
				if (result == null) result = caseFunctionalArgument(count_AggregationOperator);
				if (result == null) result = caseInteger_Type(count_AggregationOperator);
				if (result == null) result = caseFunctionalType(count_AggregationOperator);
				if (result == null) result = caseExpressionOperator(count_AggregationOperator);
				if (result == null) result = caseArgument(count_AggregationOperator);
				if (result == null) result = caseNumber_Type(count_AggregationOperator);
				if (result == null) result = caseOperator(count_AggregationOperator);
				if (result == null) result = caseTypedElement(count_AggregationOperator);
				if (result == null) result = caseObject_Type(count_AggregationOperator);
				if (result == null) result = caseType(count_AggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.SUM_AGGREGATION_OPERATOR: {
				Sum_AggregationOperator sum_AggregationOperator = (Sum_AggregationOperator)theEObject;
				T result = caseSum_AggregationOperator(sum_AggregationOperator);
				if (result == null) result = caseCalculatingAggregationOperator(sum_AggregationOperator);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(sum_AggregationOperator);
				if (result == null) result = caseAggregationOperator(sum_AggregationOperator);
				if (result == null) result = caseEvaluationOperation_Argument(sum_AggregationOperator);
				if (result == null) result = caseInteger_Argument(sum_AggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(sum_AggregationOperator);
				if (result == null) result = caseInteger_Calculateable(sum_AggregationOperator);
				if (result == null) result = caseCalculateable_Argument(sum_AggregationOperator);
				if (result == null) result = caseInteger_FunctionalType(sum_AggregationOperator);
				if (result == null) result = caseEvaluationOperator(sum_AggregationOperator);
				if (result == null) result = caseFunctionalOperator(sum_AggregationOperator);
				if (result == null) result = caseCalculateable(sum_AggregationOperator);
				if (result == null) result = caseReferenceArgument(sum_AggregationOperator);
				if (result == null) result = caseFunctionalArgument(sum_AggregationOperator);
				if (result == null) result = caseInteger_Type(sum_AggregationOperator);
				if (result == null) result = caseFunctionalType(sum_AggregationOperator);
				if (result == null) result = caseExpressionOperator(sum_AggregationOperator);
				if (result == null) result = caseArgument(sum_AggregationOperator);
				if (result == null) result = caseNumber_Type(sum_AggregationOperator);
				if (result == null) result = caseOperator(sum_AggregationOperator);
				if (result == null) result = caseTypedElement(sum_AggregationOperator);
				if (result == null) result = caseObject_Type(sum_AggregationOperator);
				if (result == null) result = caseType(sum_AggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MIN_AGGREGATION_OPERATOR: {
				Min_AggregationOperator min_AggregationOperator = (Min_AggregationOperator)theEObject;
				T result = caseMin_AggregationOperator(min_AggregationOperator);
				if (result == null) result = caseCalculatingAggregationOperator(min_AggregationOperator);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(min_AggregationOperator);
				if (result == null) result = caseAggregationOperator(min_AggregationOperator);
				if (result == null) result = caseEvaluationOperation_Argument(min_AggregationOperator);
				if (result == null) result = caseInteger_Argument(min_AggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(min_AggregationOperator);
				if (result == null) result = caseInteger_Calculateable(min_AggregationOperator);
				if (result == null) result = caseCalculateable_Argument(min_AggregationOperator);
				if (result == null) result = caseInteger_FunctionalType(min_AggregationOperator);
				if (result == null) result = caseEvaluationOperator(min_AggregationOperator);
				if (result == null) result = caseFunctionalOperator(min_AggregationOperator);
				if (result == null) result = caseCalculateable(min_AggregationOperator);
				if (result == null) result = caseReferenceArgument(min_AggregationOperator);
				if (result == null) result = caseFunctionalArgument(min_AggregationOperator);
				if (result == null) result = caseInteger_Type(min_AggregationOperator);
				if (result == null) result = caseFunctionalType(min_AggregationOperator);
				if (result == null) result = caseExpressionOperator(min_AggregationOperator);
				if (result == null) result = caseArgument(min_AggregationOperator);
				if (result == null) result = caseNumber_Type(min_AggregationOperator);
				if (result == null) result = caseOperator(min_AggregationOperator);
				if (result == null) result = caseTypedElement(min_AggregationOperator);
				if (result == null) result = caseObject_Type(min_AggregationOperator);
				if (result == null) result = caseType(min_AggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.MAX_AGGREGATION_OPERATOR: {
				Max_AggregationOperator max_AggregationOperator = (Max_AggregationOperator)theEObject;
				T result = caseMax_AggregationOperator(max_AggregationOperator);
				if (result == null) result = caseCalculatingAggregationOperator(max_AggregationOperator);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(max_AggregationOperator);
				if (result == null) result = caseAggregationOperator(max_AggregationOperator);
				if (result == null) result = caseEvaluationOperation_Argument(max_AggregationOperator);
				if (result == null) result = caseInteger_Argument(max_AggregationOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(max_AggregationOperator);
				if (result == null) result = caseInteger_Calculateable(max_AggregationOperator);
				if (result == null) result = caseCalculateable_Argument(max_AggregationOperator);
				if (result == null) result = caseInteger_FunctionalType(max_AggregationOperator);
				if (result == null) result = caseEvaluationOperator(max_AggregationOperator);
				if (result == null) result = caseFunctionalOperator(max_AggregationOperator);
				if (result == null) result = caseCalculateable(max_AggregationOperator);
				if (result == null) result = caseReferenceArgument(max_AggregationOperator);
				if (result == null) result = caseFunctionalArgument(max_AggregationOperator);
				if (result == null) result = caseInteger_Type(max_AggregationOperator);
				if (result == null) result = caseFunctionalType(max_AggregationOperator);
				if (result == null) result = caseExpressionOperator(max_AggregationOperator);
				if (result == null) result = caseArgument(max_AggregationOperator);
				if (result == null) result = caseNumber_Type(max_AggregationOperator);
				if (result == null) result = caseOperator(max_AggregationOperator);
				if (result == null) result = caseTypedElement(max_AggregationOperator);
				if (result == null) result = caseObject_Type(max_AggregationOperator);
				if (result == null) result = caseType(max_AggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QmmPackage.INTEGER_PARSE_INT_CLASS_OPERATOR: {
				IntegerParseInt_ClassOperator integerParseInt_ClassOperator = (IntegerParseInt_ClassOperator)theEObject;
				T result = caseIntegerParseInt_ClassOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseClassOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_EvaluationOperation_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseEvaluationFunctionalOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseEvaluationOperation_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseEvaluationOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseFunctionalOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseCalculateable_Argument(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_FunctionalType(integerParseInt_ClassOperator);
				if (result == null) result = caseExpressionOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseReferenceArgument(integerParseInt_ClassOperator);
				if (result == null) result = caseFunctionalArgument(integerParseInt_ClassOperator);
				if (result == null) result = caseInteger_Type(integerParseInt_ClassOperator);
				if (result == null) result = caseFunctionalType(integerParseInt_ClassOperator);
				if (result == null) result = caseOperator(integerParseInt_ClassOperator);
				if (result == null) result = caseArgument(integerParseInt_ClassOperator);
				if (result == null) result = caseNumber_Type(integerParseInt_ClassOperator);
				if (result == null) result = caseTypedElement(integerParseInt_ClassOperator);
				if (result == null) result = caseObject_Type(integerParseInt_ClassOperator);
				if (result == null) result = caseType(integerParseInt_ClassOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeFamily(AttributeFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Name Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNameMapping(AttributeNameMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeLib(AttributeLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueRequirement(AttributeValueRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Basic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXBasicObject(CAEXBasicObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXFile(CAEXFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXObject(CAEXObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalInterface(ExternalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReferenceType(ExternalReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceHierarchy(InstanceHierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClassLib(InterfaceClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClass(InterfaceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceFamily(InterfaceFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface ID Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface ID Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceIDMapping(InterfaceIDMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalElement(InternalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink(InternalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nominal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nominal Scaled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNominalScaledType(NominalScaledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scaled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScaledType(OrdinalScaledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Semantic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Semantic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSemantic(RefSemantic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClassLib(RoleClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClass(RoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFamily(RoleFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequirements(RoleRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation(SourceDocumentInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedRoleClass(SupportedRoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClassLib(SystemUnitClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClass(SystemUnitClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitFamily(SystemUnitFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownType(UnknownType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyright(Copyright object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision(Revision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalInformation(AdditionalInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement(GenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAttribute(GenericAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountable(Countable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negatable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatableElement(NegatableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrGroup(OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootClass(RootClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindQuery(FindQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateable(Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateableElement(CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeEClass(AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularAttributeEClass(RegularAttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationAttributeEClass(EnumerationAttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalType(FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceArgument(ReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countable Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countable Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountable_ReferenceArgument(Countable_ReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateable_Argument(Calculateable_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateableElement_ReferenceArgument(CalculateableElement_ReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalArgument(FunctionalArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationOperation_Argument(EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveArgument(PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countable Reference Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countable Reference Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountableReferenceParameter(CountableReferenceParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateableParameter(CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalParameter(FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Calculateable(Integer_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_CalculateableElement(Integer_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionOperator(ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationOperator(EnumerationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitOperator(BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalOperator(FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOperator(ClassOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationOperator(EvaluationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationFunctionalOperator(EvaluationFunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationOperator(AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationBitOperator(EvaluationBitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Evaluation Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd_EvaluationBitOperator(And_EvaluationBitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Evaluation Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Evaluation Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr_EvaluationBitOperator(Or_EvaluationBitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counting Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counting Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountingAggregationOperator(CountingAggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculating Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculating Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatingAggregationOperator(CalculatingAggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Calculateable(String_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_CalculateableElement(String_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_AttributeEClass(String_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Operator(String_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Type(String_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_FunctionalType(String_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_CalculateableParameter(String_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_FunctionalParameter(String_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Argument(String_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_PrimitiveArgument(String_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_EvaluationOperation_Argument(String_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_CalculateableElementReferenceArgument(String_CalculateableElementReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_ExpressionOperator(String_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_BitOperator(String_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_And_BitOperator(String_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Or_BitOperator(String_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_Original_FunctionalOperator(String_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Name Mapping role Attribute Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Name Mapping role Attribute Name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNameMapping_roleAttributeName_AttrEClass(AttributeNameMapping_roleAttributeName_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Name Mapping system Unit Attribute Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Name Mapping system Unit Attribute Name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNameMapping_systemUnitAttributeName_AttrEClass(AttributeNameMapping_systemUnitAttributeName_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute default Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute default Value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_defaultValue_AttrEClass(Attribute_defaultValue_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_value_AttrEClass(Attribute_value_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_Calculateable(AttributeDataType_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_CalculateableElement(AttributeDataType_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_AttributeEClass(AttributeDataType_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_Operator(AttributeDataType_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_Type(AttributeDataType_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_FunctionalType(AttributeDataType_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_CalculateableParameter(AttributeDataType_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_FunctionalParameter(AttributeDataType_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_Argument(AttributeDataType_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_PrimitiveArgument(AttributeDataType_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_EvaluationOperation_Argument(AttributeDataType_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_CalculateableElementReferenceArgument(AttributeDataType_CalculateableElementReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_ExpressionOperator(AttributeDataType_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_BitOperator(AttributeDataType_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_And_BitOperator(AttributeDataType_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_Or_BitOperator(AttributeDataType_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Data Type Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Data Type Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDataType_FunctionalOperator(AttributeDataType_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute attribute Data Type Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute attribute Data Type Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_attributeDataType_AttrEClass(Attribute_attributeDataType_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute ref Attribute Type Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute ref Attribute Type Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_refAttributeType_AttrEClass(Attribute_refAttributeType_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute unit Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute unit Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_unit_AttrEClass(Attribute_unit_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Requirement name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Requirement name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueRequirement_name_AttrEClass(AttributeValueRequirement_name_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Mode Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Mode Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeMode_Calculateable(ChangeMode_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Mode Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Mode Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeMode_CalculateableElement(ChangeMode_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Mode Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Mode Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeMode_Operator(ChangeMode_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Mode Enumeration Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Mode Enumeration Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeMode_EnumerationOperator(ChangeMode_EnumerationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Mode Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Mode Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeMode_AttributeEClass(ChangeMode_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Basic Object change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Basic Object change Mode Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXBasicObject_changeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX File superior Standard Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX File superior Standard Version Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXFile_superiorStandardVersion_AttrEClass(CAEXFile_superiorStandardVersion_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX File file Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX File file Name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXFile_fileName_AttrEClass(CAEXFile_fileName_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX File schema Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX File schema Version Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXFile_schemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Object iD Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Object iD Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXObject_iD_AttrEClass(CAEXObject_iD_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX Object name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX Object name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXObject_name_AttrEClass(CAEXObject_name_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_Calculateable(EFeatureMapEntry_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_CalculateableElement(EFeatureMapEntry_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_AttributeEClass(EFeatureMapEntry_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_Operator(EFeatureMapEntry_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_Type(EFeatureMapEntry_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_FunctionalType(EFeatureMapEntry_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_CalculateableParameter(EFeatureMapEntry_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_FunctionalParameter(EFeatureMapEntry_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_Argument(EFeatureMapEntry_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_PrimitiveArgument(EFeatureMapEntry_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_EvaluationOperation_Argument(EFeatureMapEntry_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_CalculateableElementReferenceArgument(EFeatureMapEntry_CalculateableElementReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_ExpressionOperator(EFeatureMapEntry_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_BitOperator(EFeatureMapEntry_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_And_BitOperator(EFeatureMapEntry_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_Or_BitOperator(EFeatureMapEntry_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Map Entry Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Map Entry Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureMapEntry_FunctionalOperator(EFeatureMapEntry_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root mixed Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root mixed Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot_mixed_AttrEClass(DocumentRoot_mixed_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference Type alias Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference Type alias Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReferenceType_alias_AttrEClass(ExternalReferenceType_alias_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference Type path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference Type path Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReferenceType_path_AttrEClass(ExternalReferenceType_path_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class ref Base Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class ref Base Class Path Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClass_refBaseClassPath_AttrEClass(InterfaceClass_refBaseClassPath_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface ID Mapping role Interface ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface ID Mapping role Interface ID Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceIDMapping_roleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface ID Mapping system Unit Interface ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface ID Mapping system Unit Interface ID Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceIDMapping_systemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Element ref Base System Unit Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Element ref Base System Unit Path Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalElement_refBaseSystemUnitPath_AttrEClass(InternalElement_refBaseSystemUnitPath_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link ref Partner Side AAttr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link ref Partner Side AAttr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink_refPartnerSideA_AttrEClass(InternalLink_refPartnerSideA_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link ref Partner Side BAttr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link ref Partner Side BAttr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink_refPartnerSideB_AttrEClass(InternalLink_refPartnerSideB_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nominal Scaled Type required Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nominal Scaled Type required Value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNominalScaledType_requiredValue_AttrEClass(NominalScaledType_requiredValue_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scaled Type required Max Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scaled Type required Max Value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScaledType_requiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scaled Type required Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scaled Type required Value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScaledType_requiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scaled Type required Min Value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scaled Type required Min Value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScaledType_requiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Semantic corresponding Attribute Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Semantic corresponding Attribute Path Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSemantic_correspondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class ref Base Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class ref Base Class Path Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClass_refBaseClassPath_AttrEClass(RoleClass_refBaseClassPath_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_Calculateable(DateTime_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_CalculateableElement(DateTime_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Attribute EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_AttributeEClass(DateTime_AttributeEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_Operator(DateTime_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_Type(DateTime_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_FunctionalType(DateTime_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_CalculateableParameter(DateTime_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_FunctionalParameter(DateTime_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_Argument(DateTime_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_PrimitiveArgument(DateTime_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_EvaluationOperation_Argument(DateTime_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Calculateable Element Reference Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_CalculateableElementReferenceArgument(DateTime_CalculateableElementReferenceArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_ExpressionOperator(DateTime_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_BitOperator(DateTime_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_And_BitOperator(DateTime_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_Or_BitOperator(DateTime_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime_FunctionalOperator(DateTime_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information last Writing Date Time Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information last Writing Date Time Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_lastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin ID Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originID_AttrEClass(SourceDocumentInformation_originID_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin Name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originName_AttrEClass(SourceDocumentInformation_originName_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin Project ID Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin Project ID Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin Project Title Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin Project Title Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin Release Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin Release Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin Vendor Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin Vendor Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin Vendor URL Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin Vendor URL Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information origin Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information origin Version Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_originVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Role Class ref Role Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Role Class ref Role Class Path Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedRoleClass_refRoleClassPath_AttrEClass(SupportedRoleClass_refRoleClassPath_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class ref Base Class Path Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class ref Base Class Path Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClass_refBaseClassPath_AttrEClass(SystemUnitClass_refBaseClassPath_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Type requirements Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Type requirements Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownType_requirements_AttrEClass(UnknownType_requirements_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyright_value_AttrEClass(Copyright_value_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright change Mode Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyright_changeMode_AttrEClass(Copyright_changeMode_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription_value_AttrEClass(Description_value_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description change Mode Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription_changeMode_AttrEClass(Description_changeMode_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision revision Date Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision revision Date Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision_revisionDate_AttrEClass(Revision_revisionDate_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision old Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision old Version Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision_oldVersion_AttrEClass(Revision_oldVersion_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision new Version Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision new Version Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision_newVersion_AttrEClass(Revision_newVersion_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision author Name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision author Name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision_authorName_AttrEClass(Revision_authorName_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision comment Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision comment Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision_comment_AttrEClass(Revision_comment_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion_value_AttrEClass(Version_value_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version change Mode Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version change Mode Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion_changeMode_AttrEClass(Version_changeMode_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element name Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element name Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_name_AttrEClass(Element_name_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element value Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element value Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_value_AttrEClass(Element_value_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element element Feature Map Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element element Feature Map Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement_elementFeatureMap_AttrEClass(GenericElement_elementFeatureMap_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element attribute Feature Map Attr EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element attribute Feature Map Attr EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement_attributeFeatureMap_AttrEClass(GenericElement_attributeFeatureMap_AttrEClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_OrGroup(Attribute_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Semantic Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Semantic Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSemantic_OrGroup(RefSemantic_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Requirement Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Requirement Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueRequirement_OrGroup(AttributeValueRequirement_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scaled Type Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scaled Type Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScaledType_OrGroup(OrdinalScaledType_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nominal Scaled Type Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nominal Scaled Type Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNominalScaledType_OrGroup(NominalScaledType_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Type Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Type Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownType_OrGroup(UnknownType_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription_OrGroup(Description_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion_OrGroup(Version_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision_OrGroup(Revision_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyright_OrGroup(Copyright_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Information Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Information Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalInformation_OrGroup(AdditionalInformation_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Document Information Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document Information Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentInformation_OrGroup(SourceDocumentInformation_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference Type Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference Type Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReferenceType_OrGroup(ExternalReferenceType_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Hierarchy Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Hierarchy Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceHierarchy_OrGroup(InstanceHierarchy_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class Lib Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class Lib Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClassLib_OrGroup(InterfaceClassLib_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class Lib Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class Lib Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClassLib_OrGroup(RoleClassLib_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class Lib Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class Lib Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClassLib_OrGroup(SystemUnitClassLib_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Lib Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Lib Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeLib_OrGroup(AttributeLib_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAEX File Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAEX File Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXFile_OrGroup(CAEXFile_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClass_OrGroup(InterfaceClass_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Element Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Element Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalElement_OrGroup(InternalElement_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Interface Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Interface Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalInterface_OrGroup(ExternalInterface_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requirements Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requirements Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequirements_OrGroup(RoleRequirements_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClass_OrGroup(SystemUnitClass_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Name Mapping Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Name Mapping Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNameMapping_OrGroup(AttributeNameMapping_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface ID Mapping Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface ID Mapping Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceIDMapping_OrGroup(InterfaceIDMapping_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClass_OrGroup(RoleClass_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping_OrGroup(Mapping_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Role Class Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Role Class Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedRoleClass_OrGroup(SupportedRoleClass_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink_OrGroup(InternalLink_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement_OrGroup(GenericElement_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Attribute Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Attribute Or Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAttribute_OrGroup(GenericAttribute_OrGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Operator(Object_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Type(Object_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_FunctionalType(Object_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CalculateableParameter(Object_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_FunctionalParameter(Object_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Calculateable(Object_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CalculateableElement(Object_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Argument(Object_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_PrimitiveArgument(Object_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_EvaluationOperation_Argument(Object_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_ExpressionOperator(Object_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_BitOperator(Object_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_And_BitOperator(Object_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Or_BitOperator(Object_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_FunctionalOperator(Object_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Operator(Boolean_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Type(Boolean_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_FunctionalType(Boolean_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_CalculateableParameter(Boolean_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_FunctionalParameter(Boolean_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Calculateable(Boolean_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_CalculateableElement(Boolean_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Argument(Boolean_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_PrimitiveArgument(Boolean_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_EvaluationOperation_Argument(Boolean_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_ExpressionOperator(Boolean_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_BitOperator(Boolean_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_And_BitOperator(Boolean_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Or_BitOperator(Boolean_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_Original_FunctionalOperator(Boolean_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseequals_FunctionalOperator(equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetoString_FunctionalOperator(toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Operator(CharSequence_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Type(CharSequence_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_FunctionalType(CharSequence_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_CalculateableParameter(CharSequence_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_FunctionalParameter(CharSequence_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Calculateable(CharSequence_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_CalculateableElement(CharSequence_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Argument(CharSequence_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_PrimitiveArgument(CharSequence_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_EvaluationOperation_Argument(CharSequence_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_ExpressionOperator(CharSequence_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_BitOperator(CharSequence_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_And_BitOperator(CharSequence_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Or_BitOperator(CharSequence_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_Original_FunctionalOperator(CharSequence_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Operator(Integer_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Type(Integer_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_FunctionalType(Integer_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_CalculateableParameter(Integer_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_FunctionalParameter(Integer_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Argument(Integer_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_PrimitiveArgument(Integer_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_EvaluationOperation_Argument(Integer_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_ExpressionOperator(Integer_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_BitOperator(Integer_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_And_BitOperator(Integer_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Or_BitOperator(Integer_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_Original_FunctionalOperator(Integer_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>length Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselength_FunctionalOperator(length_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Operator(Character_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Type(Character_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_FunctionalType(Character_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_CalculateableParameter(Character_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_FunctionalParameter(Character_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Calculateable(Character_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_CalculateableElement(Character_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Argument(Character_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_PrimitiveArgument(Character_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_EvaluationOperation_Argument(Character_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_ExpressionOperator(Character_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_BitOperator(Character_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_And_BitOperator(Character_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Or_BitOperator(Character_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_Original_FunctionalOperator(Character_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>char At Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>char At Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecharAt_FunctionalOperator(charAt_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>contains Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>contains Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecontains_FunctionalOperator(contains_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>substring Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>substring Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubstring_FunctionalOperator(substring_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>concat Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>concat Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconcat_FunctionalOperator(concat_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ends With Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ends With Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseendsWith_FunctionalOperator(endsWith_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equals Ignore Case Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equals Ignore Case Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>index Of String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>index Of String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseindexOfString_FunctionalOperator(indexOfString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Empty Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Empty Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisEmpty_FunctionalOperator(isEmpty_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Operator(Number_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Type(Number_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_FunctionalType(Number_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_CalculateableParameter(Number_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_FunctionalParameter(Number_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Calculateable(Number_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_CalculateableElement(Number_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Argument(Number_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_PrimitiveArgument(Number_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_EvaluationOperation_Argument(Number_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_ExpressionOperator(Number_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_BitOperator(Number_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_And_BitOperator(Number_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Or_BitOperator(Number_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Original_FunctionalOperator(Number_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegreaterThan_FunctionalOperator(greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>parse Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>parse Boolean Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>compare To Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>compare To Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecompareTo_FunctionalOperator(compareTo_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Number_equals_FunctionalOperator(Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Number_toString_FunctionalOperator(Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_FunctionalOperator(Number_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Number Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Number Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_Number_FunctionalOperator(InheritedFrom_Object_to_Number_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_greaterThan_FunctionalOperator(Number_Integer_greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_greaterEquals_FunctionalOperator(Number_Integer_greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_smallerThan_FunctionalOperator(Number_Integer_smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_smallerEquals_FunctionalOperator(Number_Integer_smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_Object_Number_equals_FunctionalOperator(Number_Integer_Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Integer Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Integer_Object_Number_toString_FunctionalOperator(Number_Integer_Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger_FunctionalOperator(Integer_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Number to Integer Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Number to Integer Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Number_to_Integer_FunctionalOperator(InheritedFrom_Number_to_Integer_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_Calculateable(Long_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_CalculateableElement(Long_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_Operator(Long_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_Type(Long_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_FunctionalType(Long_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_CalculateableParameter(Long_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_FunctionalParameter(Long_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_Argument(Long_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_PrimitiveArgument(Long_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_EvaluationOperation_Argument(Long_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_ExpressionOperator(Long_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_BitOperator(Long_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_And_BitOperator(Long_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_Or_BitOperator(Long_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_Original_FunctionalOperator(Long_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Long greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Long greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Long_greaterThan_FunctionalOperator(Number_Long_greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Long greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Long greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Long_greaterEquals_FunctionalOperator(Number_Long_greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Long smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Long smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Long_smallerThan_FunctionalOperator(Number_Long_smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Long smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Long smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Long_smallerEquals_FunctionalOperator(Number_Long_smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Long Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Long Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Long_Object_Number_equals_FunctionalOperator(Number_Long_Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Long Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Long Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Long_Object_Number_toString_FunctionalOperator(Number_Long_Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong_FunctionalOperator(Long_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Number to Long Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Number to Long Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Number_to_Long_FunctionalOperator(InheritedFrom_Number_to_Long_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Calculateable(Double_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_CalculateableElement(Double_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Operator(Double_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Type(Double_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_FunctionalType(Double_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_CalculateableParameter(Double_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_FunctionalParameter(Double_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Argument(Double_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_PrimitiveArgument(Double_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_EvaluationOperation_Argument(Double_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_ExpressionOperator(Double_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_BitOperator(Double_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_And_BitOperator(Double_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Or_BitOperator(Double_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_Original_FunctionalOperator(Double_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_greaterThan_FunctionalOperator(Number_Double_greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_greaterEquals_FunctionalOperator(Number_Double_greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_smallerThan_FunctionalOperator(Number_Double_smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_smallerEquals_FunctionalOperator(Number_Double_smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_Object_Number_equals_FunctionalOperator(Number_Double_Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Double Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Double Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Double_Object_Number_toString_FunctionalOperator(Number_Double_Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble_FunctionalOperator(Double_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Number to Double Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Number to Double Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Number_to_Double_FunctionalOperator(InheritedFrom_Number_to_Double_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Calculateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Calculateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_Calculateable(Float_Calculateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Calculateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Calculateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_CalculateableElement(Float_CalculateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_Operator(Float_Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_Type(Float_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Functional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Functional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_FunctionalType(Float_FunctionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Calculateable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_CalculateableParameter(Float_CalculateableParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Functional Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_FunctionalParameter(Float_FunctionalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_Argument(Float_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Primitive Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Primitive Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_PrimitiveArgument(Float_PrimitiveArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Evaluation Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Evaluation Operation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_EvaluationOperation_Argument(Float_EvaluationOperation_Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Expression Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Expression Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_ExpressionOperator(Float_ExpressionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_BitOperator(Float_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float And Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float And Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_And_BitOperator(Float_And_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Or Bit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Or Bit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_Or_BitOperator(Float_Or_BitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Original Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Original Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_Original_FunctionalOperator(Float_Original_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Float greater Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Float greater Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Float_greaterThan_FunctionalOperator(Number_Float_greaterThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Float greater Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Float greater Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Float_greaterEquals_FunctionalOperator(Number_Float_greaterEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Float smaller Than Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Float smaller Than Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Float_smallerThan_FunctionalOperator(Number_Float_smallerThan_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Float smaller Equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Float smaller Equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Float_smallerEquals_FunctionalOperator(Number_Float_smallerEquals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Float Object Number equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Float Object Number equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Float_Object_Number_equals_FunctionalOperator(Number_Float_Object_Number_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Float Object Number to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Float Object Number to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber_Float_Object_Number_toString_FunctionalOperator(Number_Float_Object_Number_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat_FunctionalOperator(Float_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Number to Float Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Number to Float Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Number_to_Float_FunctionalOperator(InheritedFrom_Number_to_Float_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Char Sequence equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CharSequence_equals_FunctionalOperator(Object_CharSequence_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Char Sequence to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_CharSequence_toString_FunctionalOperator(Object_CharSequence_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_FunctionalOperator(CharSequence_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Char Sequence Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Char Sequence Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_CharSequence_FunctionalOperator(InheritedFrom_Object_to_CharSequence_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Character equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Character equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Character_equals_FunctionalOperator(Object_Character_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Character to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Character to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Character_toString_FunctionalOperator(Object_Character_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter_FunctionalOperator(Character_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Character Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Character Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_Character_FunctionalOperator(InheritedFrom_Object_to_Character_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Boolean equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Boolean equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Boolean_equals_FunctionalOperator(Object_Boolean_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Boolean to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Boolean to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject_Boolean_toString_FunctionalOperator(Object_Boolean_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean_FunctionalOperator(Boolean_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Object to Boolean Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Object to Boolean Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_Object_to_Boolean_FunctionalOperator(InheritedFrom_Object_to_Boolean_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence String length Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence String length Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_String_length_FunctionalOperator(CharSequence_String_length_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence equals Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_String_Object_CharSequence_equals_FunctionalOperator(CharSequence_String_Object_CharSequence_equals_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Sequence String Object Char Sequence to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharSequence_String_Object_CharSequence_toString_FunctionalOperator(CharSequence_String_Object_CharSequence_toString_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString_FunctionalOperator(String_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited From Char Sequence to String Functional Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited From Char Sequence to String Functional Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedFrom_CharSequence_to_String_FunctionalOperator(InheritedFrom_CharSequence_to_String_FunctionalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount_AggregationOperator(Count_AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSum_AggregationOperator(Sum_AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMin_AggregationOperator(Min_AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax_AggregationOperator(Max_AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Parse Int Class Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Parse Int Class Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerParseInt_ClassOperator(IntegerParseInt_ClassOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QmmSwitch
