/**
 */
package qmm.util;

import java.lang.CharSequence;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qmm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qmm.QmmPackage
 * @generated
 */
public class QmmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QmmValidator INSTANCE = new QmmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qmm";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_FAMILY__VALIDATE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Name Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_NAME_MAPPING__VALIDATE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE__VALIDATE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_LIB__VALIDATE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Value Requirement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_VALUE_REQUIREMENT__VALIDATE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX Basic Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_BASIC_OBJECT__VALIDATE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX File'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_FILE__VALIDATE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'CAEX Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAEX_OBJECT__VALIDATE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Document Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOCUMENT_ROOT__VALIDATE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'External Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_INTERFACE__VALIDATE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'External Reference Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_REFERENCE_TYPE__VALIDATE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Instance Hierarchy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_HIERARCHY__VALIDATE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Class Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_CLASS_LIB__VALIDATE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_CLASS__VALIDATE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_FAMILY__VALIDATE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Interface ID Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE_ID_MAPPING__VALIDATE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Internal Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_ELEMENT__VALIDATE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Internal Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_LINK__VALIDATE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Mapping'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAPPING__VALIDATE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Nominal Scaled Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOMINAL_SCALED_TYPE__VALIDATE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Ordinal Scaled Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORDINAL_SCALED_TYPE__VALIDATE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Ref Semantic'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REF_SEMANTIC__VALIDATE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Class Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_CLASS_LIB__VALIDATE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_CLASS__VALIDATE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_FAMILY__VALIDATE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Role Requirements'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROLE_REQUIREMENTS__VALIDATE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Source Document Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOURCE_DOCUMENT_INFORMATION__VALIDATE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Supported Role Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPORTED_ROLE_CLASS__VALIDATE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Class Lib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_CLASS_LIB__VALIDATE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_CLASS__VALIDATE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'System Unit Family'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_UNIT_FAMILY__VALIDATE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Unknown Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNKNOWN_TYPE__VALIDATE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Copyright'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COPYRIGHT__VALIDATE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCRIPTION__VALIDATE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Revision'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVISION__VALIDATE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Version'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VERSION__VALIDATE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Additional Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDITIONAL_INFORMATION__VALIDATE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__VALIDATE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Generic Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERIC_ELEMENT__VALIDATE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Generic Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERIC_ATTRIBUTE__VALIDATE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Or Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OR_GROUP__VALIDATE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Countable Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COUNTABLE_REFERENCE_ARGUMENT__VALIDATE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_ATTRIBUTE_ECLASS__VALIDATE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_CALCULATEABLE_PARAMETER__VALIDATE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_FUNCTIONAL_PARAMETER__VALIDATE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'String Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_ATTRIBUTE_ECLASS__VALIDATE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_CALCULATEABLE_PARAMETER__VALIDATE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_FUNCTIONAL_PARAMETER__VALIDATE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Attribute Data Type Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_ATTRIBUTE_ECLASS__VALIDATE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_CALCULATEABLE_PARAMETER__VALIDATE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_FUNCTIONAL_PARAMETER__VALIDATE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'EFeature Map Entry Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Attribute EClass'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_ATTRIBUTE_ECLASS__VALIDATE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_CALCULATEABLE_PARAMETER__VALIDATE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_FUNCTIONAL_PARAMETER__VALIDATE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Date Time Calculateable Element Reference Argument'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATE_TIME_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT__VALIDATE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Object Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CALCULATEABLE_PARAMETER__VALIDATE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Object Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FUNCTIONAL_PARAMETER__VALIDATE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Boolean Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_CALCULATEABLE_PARAMETER__VALIDATE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Boolean Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_FUNCTIONAL_PARAMETER__VALIDATE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Char Sequence Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHAR_SEQUENCE_CALCULATEABLE_PARAMETER__VALIDATE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Char Sequence Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHAR_SEQUENCE_FUNCTIONAL_PARAMETER__VALIDATE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_CALCULATEABLE_PARAMETER__VALIDATE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Integer Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_FUNCTIONAL_PARAMETER__VALIDATE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Character Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTER_CALCULATEABLE_PARAMETER__VALIDATE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Character Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHARACTER_FUNCTIONAL_PARAMETER__VALIDATE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Number Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBER_CALCULATEABLE_PARAMETER__VALIDATE = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Number Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBER_FUNCTIONAL_PARAMETER__VALIDATE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Long Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LONG_CALCULATEABLE_PARAMETER__VALIDATE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Long Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LONG_FUNCTIONAL_PARAMETER__VALIDATE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Double Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOUBLE_CALCULATEABLE_PARAMETER__VALIDATE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Double Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOUBLE_FUNCTIONAL_PARAMETER__VALIDATE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Float Calculateable Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FLOAT_CALCULATEABLE_PARAMETER__VALIDATE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Float Functional Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FLOAT_FUNCTIONAL_PARAMETER__VALIDATE = 76;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 76;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QmmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QmmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QmmPackage.ATTRIBUTE_FAMILY:
				return validateAttributeFamily((AttributeFamily)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING:
				return validateAttributeNameMapping((AttributeNameMapping)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_LIB:
				return validateAttributeLib((AttributeLib)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT:
				return validateAttributeValueRequirement((AttributeValueRequirement)value, diagnostics, context);
			case QmmPackage.CAEX_BASIC_OBJECT:
				return validateCAEXBasicObject((CAEXBasicObject)value, diagnostics, context);
			case QmmPackage.CAEX_FILE:
				return validateCAEXFile((CAEXFile)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT:
				return validateCAEXObject((CAEXObject)value, diagnostics, context);
			case QmmPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case QmmPackage.EXTERNAL_INTERFACE:
				return validateExternalInterface((ExternalInterface)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE:
				return validateExternalReferenceType((ExternalReferenceType)value, diagnostics, context);
			case QmmPackage.INSTANCE_HIERARCHY:
				return validateInstanceHierarchy((InstanceHierarchy)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_LIB:
				return validateInterfaceClassLib((InterfaceClassLib)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS:
				return validateInterfaceClass((InterfaceClass)value, diagnostics, context);
			case QmmPackage.INTERFACE_FAMILY:
				return validateInterfaceFamily((InterfaceFamily)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING:
				return validateInterfaceIDMapping((InterfaceIDMapping)value, diagnostics, context);
			case QmmPackage.INTERNAL_ELEMENT:
				return validateInternalElement((InternalElement)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK:
				return validateInternalLink((InternalLink)value, diagnostics, context);
			case QmmPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case QmmPackage.NOMINAL_SCALED_TYPE:
				return validateNominalScaledType((NominalScaledType)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE:
				return validateOrdinalScaledType((OrdinalScaledType)value, diagnostics, context);
			case QmmPackage.REF_SEMANTIC:
				return validateRefSemantic((RefSemantic)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_LIB:
				return validateRoleClassLib((RoleClassLib)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS:
				return validateRoleClass((RoleClass)value, diagnostics, context);
			case QmmPackage.ROLE_FAMILY:
				return validateRoleFamily((RoleFamily)value, diagnostics, context);
			case QmmPackage.ROLE_REQUIREMENTS:
				return validateRoleRequirements((RoleRequirements)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION:
				return validateSourceDocumentInformation((SourceDocumentInformation)value, diagnostics, context);
			case QmmPackage.SUPPORTED_ROLE_CLASS:
				return validateSupportedRoleClass((SupportedRoleClass)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB:
				return validateSystemUnitClassLib((SystemUnitClassLib)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS:
				return validateSystemUnitClass((SystemUnitClass)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_FAMILY:
				return validateSystemUnitFamily((SystemUnitFamily)value, diagnostics, context);
			case QmmPackage.UNKNOWN_TYPE:
				return validateUnknownType((UnknownType)value, diagnostics, context);
			case QmmPackage.COPYRIGHT:
				return validateCopyright((Copyright)value, diagnostics, context);
			case QmmPackage.DESCRIPTION:
				return validateDescription((Description)value, diagnostics, context);
			case QmmPackage.REVISION:
				return validateRevision((Revision)value, diagnostics, context);
			case QmmPackage.VERSION:
				return validateVersion((Version)value, diagnostics, context);
			case QmmPackage.ADDITIONAL_INFORMATION:
				return validateAdditionalInformation((AdditionalInformation)value, diagnostics, context);
			case QmmPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT:
				return validateGenericElement((GenericElement)value, diagnostics, context);
			case QmmPackage.GENERIC_ATTRIBUTE:
				return validateGenericAttribute((GenericAttribute)value, diagnostics, context);
			case QmmPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case QmmPackage.COUNTABLE:
				return validateCountable((Countable)value, diagnostics, context);
			case QmmPackage.NEGATABLE_ELEMENT:
				return validateNegatableElement((NegatableElement)value, diagnostics, context);
			case QmmPackage.OR_GROUP:
				return validateOrGroup((OrGroup)value, diagnostics, context);
			case QmmPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case QmmPackage.ROOT_CLASS:
				return validateRootClass((RootClass)value, diagnostics, context);
			case QmmPackage.QUERY:
				return validateQuery((Query)value, diagnostics, context);
			case QmmPackage.FIND_QUERY:
				return validateFindQuery((FindQuery)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE:
				return validateCalculateable((Calculateable)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ELEMENT:
				return validateCalculateableElement((CalculateableElement)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_ECLASS:
				return validateAttributeEClass((AttributeEClass)value, diagnostics, context);
			case QmmPackage.REGULAR_ATTRIBUTE_ECLASS:
				return validateRegularAttributeEClass((RegularAttributeEClass)value, diagnostics, context);
			case QmmPackage.ENUMERATION_ATTRIBUTE_ECLASS:
				return validateEnumerationAttributeEClass((EnumerationAttributeEClass)value, diagnostics, context);
			case QmmPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_TYPE:
				return validateFunctionalType((FunctionalType)value, diagnostics, context);
			case QmmPackage.ARGUMENT:
				return validateArgument((Argument)value, diagnostics, context);
			case QmmPackage.REFERENCE_ARGUMENT:
				return validateReferenceArgument((ReferenceArgument)value, diagnostics, context);
			case QmmPackage.COUNTABLE_REFERENCE_ARGUMENT:
				return validateCountable_ReferenceArgument((Countable_ReferenceArgument)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ARGUMENT:
				return validateCalculateable_Argument((Calculateable_Argument)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateCalculateableElement_ReferenceArgument((CalculateableElement_ReferenceArgument)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_ARGUMENT:
				return validateFunctionalArgument((FunctionalArgument)value, diagnostics, context);
			case QmmPackage.EVALUATION_OPERATION_ARGUMENT:
				return validateEvaluationOperation_Argument((EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.PRIMITIVE_ARGUMENT:
				return validatePrimitiveArgument((PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case QmmPackage.COUNTABLE_REFERENCE_PARAMETER:
				return validateCountableReferenceParameter((CountableReferenceParameter)value, diagnostics, context);
			case QmmPackage.CALCULATEABLE_PARAMETER:
				return validateCalculateableParameter((CalculateableParameter)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_PARAMETER:
				return validateFunctionalParameter((FunctionalParameter)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE:
				return validateInteger_Calculateable((Integer_Calculateable)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE_ELEMENT:
				return validateInteger_CalculateableElement((Integer_CalculateableElement)value, diagnostics, context);
			case QmmPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case QmmPackage.EXPRESSION_OPERATOR:
				return validateExpressionOperator((ExpressionOperator)value, diagnostics, context);
			case QmmPackage.ENUMERATION_OPERATOR:
				return validateEnumerationOperator((EnumerationOperator)value, diagnostics, context);
			case QmmPackage.BIT_OPERATOR:
				return validateBitOperator((BitOperator)value, diagnostics, context);
			case QmmPackage.FUNCTIONAL_OPERATOR:
				return validateFunctionalOperator((FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CLASS_OPERATOR:
				return validateClassOperator((ClassOperator)value, diagnostics, context);
			case QmmPackage.EVALUATION_OPERATOR:
				return validateEvaluationOperator((EvaluationOperator)value, diagnostics, context);
			case QmmPackage.EVALUATION_FUNCTIONAL_OPERATOR:
				return validateEvaluationFunctionalOperator((EvaluationFunctionalOperator)value, diagnostics, context);
			case QmmPackage.AGGREGATION_OPERATOR:
				return validateAggregationOperator((AggregationOperator)value, diagnostics, context);
			case QmmPackage.EVALUATION_BIT_OPERATOR:
				return validateEvaluationBitOperator((EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.AND_EVALUATION_BIT_OPERATOR:
				return validateAnd_EvaluationBitOperator((And_EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.OR_EVALUATION_BIT_OPERATOR:
				return validateOr_EvaluationBitOperator((Or_EvaluationBitOperator)value, diagnostics, context);
			case QmmPackage.COUNTING_AGGREGATION_OPERATOR:
				return validateCountingAggregationOperator((CountingAggregationOperator)value, diagnostics, context);
			case QmmPackage.CALCULATING_AGGREGATION_OPERATOR:
				return validateCalculatingAggregationOperator((CalculatingAggregationOperator)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE:
				return validateString_Calculateable((String_Calculateable)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT:
				return validateString_CalculateableElement((String_CalculateableElement)value, diagnostics, context);
			case QmmPackage.STRING_ATTRIBUTE_ECLASS:
				return validateString_AttributeEClass((String_AttributeEClass)value, diagnostics, context);
			case QmmPackage.STRING_OPERATOR:
				return validateString_Operator((String_Operator)value, diagnostics, context);
			case QmmPackage.STRING_TYPE:
				return validateString_Type((String_Type)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_TYPE:
				return validateString_FunctionalType((String_FunctionalType)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_PARAMETER:
				return validateString_CalculateableParameter((String_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_PARAMETER:
				return validateString_FunctionalParameter((String_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.STRING_ARGUMENT:
				return validateString_Argument((String_Argument)value, diagnostics, context);
			case QmmPackage.STRING_PRIMITIVE_ARGUMENT:
				return validateString_PrimitiveArgument((String_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.STRING_EVALUATION_OPERATION_ARGUMENT:
				return validateString_EvaluationOperation_Argument((String_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.STRING_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateString_CalculateableElementReferenceArgument((String_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.STRING_EXPRESSION_OPERATOR:
				return validateString_ExpressionOperator((String_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.STRING_BIT_OPERATOR:
				return validateString_BitOperator((String_BitOperator)value, diagnostics, context);
			case QmmPackage.STRING_AND_BIT_OPERATOR:
				return validateString_And_BitOperator((String_And_BitOperator)value, diagnostics, context);
			case QmmPackage.STRING_OR_BIT_OPERATOR:
				return validateString_Or_BitOperator((String_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.STRING_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateString_Original_FunctionalOperator((String_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_ROLE_ATTRIBUTE_NAME_ATTR_ECLASS:
				return validateAttributeNameMapping_roleAttributeName_AttrEClass((AttributeNameMapping_roleAttributeName_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_SYSTEM_UNIT_ATTRIBUTE_NAME_ATTR_ECLASS:
				return validateAttributeNameMapping_systemUnitAttributeName_AttrEClass((AttributeNameMapping_systemUnitAttributeName_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DEFAULT_VALUE_ATTR_ECLASS:
				return validateAttribute_defaultValue_AttrEClass((Attribute_defaultValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_ATTR_ECLASS:
				return validateAttribute_value_AttrEClass((Attribute_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE:
				return validateAttributeDataType_Calculateable((AttributeDataType_Calculateable)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT:
				return validateAttributeDataType_CalculateableElement((AttributeDataType_CalculateableElement)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_ATTRIBUTE_ECLASS:
				return validateAttributeDataType_AttributeEClass((AttributeDataType_AttributeEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_OPERATOR:
				return validateAttributeDataType_Operator((AttributeDataType_Operator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_TYPE:
				return validateAttributeDataType_Type((AttributeDataType_Type)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_TYPE:
				return validateAttributeDataType_FunctionalType((AttributeDataType_FunctionalType)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_PARAMETER:
				return validateAttributeDataType_CalculateableParameter((AttributeDataType_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_PARAMETER:
				return validateAttributeDataType_FunctionalParameter((AttributeDataType_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_ARGUMENT:
				return validateAttributeDataType_Argument((AttributeDataType_Argument)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_PRIMITIVE_ARGUMENT:
				return validateAttributeDataType_PrimitiveArgument((AttributeDataType_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_EVALUATION_OPERATION_ARGUMENT:
				return validateAttributeDataType_EvaluationOperation_Argument((AttributeDataType_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateAttributeDataType_CalculateableElementReferenceArgument((AttributeDataType_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_EXPRESSION_OPERATOR:
				return validateAttributeDataType_ExpressionOperator((AttributeDataType_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_BIT_OPERATOR:
				return validateAttributeDataType_BitOperator((AttributeDataType_BitOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_AND_BIT_OPERATOR:
				return validateAttributeDataType_And_BitOperator((AttributeDataType_And_BitOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_OR_BIT_OPERATOR:
				return validateAttributeDataType_Or_BitOperator((AttributeDataType_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE_FUNCTIONAL_OPERATOR:
				return validateAttributeDataType_FunctionalOperator((AttributeDataType_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
				return validateAttribute_attributeDataType_AttrEClass((Attribute_attributeDataType_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
				return validateAttribute_refAttributeType_AttrEClass((Attribute_refAttributeType_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_UNIT_ATTR_ECLASS:
				return validateAttribute_unit_AttrEClass((Attribute_unit_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_NAME_ATTR_ECLASS:
				return validateAttributeValueRequirement_name_AttrEClass((AttributeValueRequirement_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_CALCULATEABLE:
				return validateChangeMode_Calculateable((ChangeMode_Calculateable)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_CALCULATEABLE_ELEMENT:
				return validateChangeMode_CalculateableElement((ChangeMode_CalculateableElement)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_OPERATOR:
				return validateChangeMode_Operator((ChangeMode_Operator)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_ENUMERATION_OPERATOR:
				return validateChangeMode_EnumerationOperator((ChangeMode_EnumerationOperator)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_ATTRIBUTE_ECLASS:
				return validateChangeMode_AttributeEClass((ChangeMode_AttributeEClass)value, diagnostics, context);
			case QmmPackage.CAEX_BASIC_OBJECT_CHANGE_MODE_ATTR_ECLASS:
				return validateCAEXBasicObject_changeMode_AttrEClass((CAEXBasicObject_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
				return validateCAEXFile_superiorStandardVersion_AttrEClass((CAEXFile_superiorStandardVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_FILE_NAME_ATTR_ECLASS:
				return validateCAEXFile_fileName_AttrEClass((CAEXFile_fileName_AttrEClass)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_SCHEMA_VERSION_ATTR_ECLASS:
				return validateCAEXFile_schemaVersion_AttrEClass((CAEXFile_schemaVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT_ID_ATTR_ECLASS:
				return validateCAEXObject_iD_AttrEClass((CAEXObject_iD_AttrEClass)value, diagnostics, context);
			case QmmPackage.CAEX_OBJECT_NAME_ATTR_ECLASS:
				return validateCAEXObject_name_AttrEClass((CAEXObject_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE:
				return validateEFeatureMapEntry_Calculateable((EFeatureMapEntry_Calculateable)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT:
				return validateEFeatureMapEntry_CalculateableElement((EFeatureMapEntry_CalculateableElement)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_ATTRIBUTE_ECLASS:
				return validateEFeatureMapEntry_AttributeEClass((EFeatureMapEntry_AttributeEClass)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_OPERATOR:
				return validateEFeatureMapEntry_Operator((EFeatureMapEntry_Operator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_TYPE:
				return validateEFeatureMapEntry_Type((EFeatureMapEntry_Type)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_TYPE:
				return validateEFeatureMapEntry_FunctionalType((EFeatureMapEntry_FunctionalType)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_PARAMETER:
				return validateEFeatureMapEntry_CalculateableParameter((EFeatureMapEntry_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_PARAMETER:
				return validateEFeatureMapEntry_FunctionalParameter((EFeatureMapEntry_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_ARGUMENT:
				return validateEFeatureMapEntry_Argument((EFeatureMapEntry_Argument)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_PRIMITIVE_ARGUMENT:
				return validateEFeatureMapEntry_PrimitiveArgument((EFeatureMapEntry_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_EVALUATION_OPERATION_ARGUMENT:
				return validateEFeatureMapEntry_EvaluationOperation_Argument((EFeatureMapEntry_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateEFeatureMapEntry_CalculateableElementReferenceArgument((EFeatureMapEntry_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_EXPRESSION_OPERATOR:
				return validateEFeatureMapEntry_ExpressionOperator((EFeatureMapEntry_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_BIT_OPERATOR:
				return validateEFeatureMapEntry_BitOperator((EFeatureMapEntry_BitOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_AND_BIT_OPERATOR:
				return validateEFeatureMapEntry_And_BitOperator((EFeatureMapEntry_And_BitOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_OR_BIT_OPERATOR:
				return validateEFeatureMapEntry_Or_BitOperator((EFeatureMapEntry_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.EFEATURE_MAP_ENTRY_FUNCTIONAL_OPERATOR:
				return validateEFeatureMapEntry_FunctionalOperator((EFeatureMapEntry_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOCUMENT_ROOT_MIXED_ATTR_ECLASS:
				return validateDocumentRoot_mixed_AttrEClass((DocumentRoot_mixed_AttrEClass)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_ALIAS_ATTR_ECLASS:
				return validateExternalReferenceType_alias_AttrEClass((ExternalReferenceType_alias_AttrEClass)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_PATH_ATTR_ECLASS:
				return validateExternalReferenceType_path_AttrEClass((ExternalReferenceType_path_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return validateInterfaceClass_refBaseClassPath_AttrEClass((InterfaceClass_refBaseClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING_ROLE_INTERFACE_ID_ATTR_ECLASS:
				return validateInterfaceIDMapping_roleInterfaceID_AttrEClass((InterfaceIDMapping_roleInterfaceID_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING_SYSTEM_UNIT_INTERFACE_ID_ATTR_ECLASS:
				return validateInterfaceIDMapping_systemUnitInterfaceID_AttrEClass((InterfaceIDMapping_systemUnitInterfaceID_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTERNAL_ELEMENT_REF_BASE_SYSTEM_UNIT_PATH_ATTR_ECLASS:
				return validateInternalElement_refBaseSystemUnitPath_AttrEClass((InternalElement_refBaseSystemUnitPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_AATTR_ECLASS:
				return validateInternalLink_refPartnerSideA_AttrEClass((InternalLink_refPartnerSideA_AttrEClass)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK_REF_PARTNER_SIDE_BATTR_ECLASS:
				return validateInternalLink_refPartnerSideB_AttrEClass((InternalLink_refPartnerSideB_AttrEClass)value, diagnostics, context);
			case QmmPackage.NOMINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS:
				return validateNominalScaledType_requiredValue_AttrEClass((NominalScaledType_requiredValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MAX_VALUE_ATTR_ECLASS:
				return validateOrdinalScaledType_requiredMaxValue_AttrEClass((OrdinalScaledType_requiredMaxValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_VALUE_ATTR_ECLASS:
				return validateOrdinalScaledType_requiredValue_AttrEClass((OrdinalScaledType_requiredValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_REQUIRED_MIN_VALUE_ATTR_ECLASS:
				return validateOrdinalScaledType_requiredMinValue_AttrEClass((OrdinalScaledType_requiredMinValue_AttrEClass)value, diagnostics, context);
			case QmmPackage.REF_SEMANTIC_CORRESPONDING_ATTRIBUTE_PATH_ATTR_ECLASS:
				return validateRefSemantic_correspondingAttributePath_AttrEClass((RefSemantic_correspondingAttributePath_AttrEClass)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return validateRoleClass_refBaseClassPath_AttrEClass((RoleClass_refBaseClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE:
				return validateDateTime_Calculateable((DateTime_Calculateable)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE_ELEMENT:
				return validateDateTime_CalculateableElement((DateTime_CalculateableElement)value, diagnostics, context);
			case QmmPackage.DATE_TIME_ATTRIBUTE_ECLASS:
				return validateDateTime_AttributeEClass((DateTime_AttributeEClass)value, diagnostics, context);
			case QmmPackage.DATE_TIME_OPERATOR:
				return validateDateTime_Operator((DateTime_Operator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_TYPE:
				return validateDateTime_Type((DateTime_Type)value, diagnostics, context);
			case QmmPackage.DATE_TIME_FUNCTIONAL_TYPE:
				return validateDateTime_FunctionalType((DateTime_FunctionalType)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE_PARAMETER:
				return validateDateTime_CalculateableParameter((DateTime_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.DATE_TIME_FUNCTIONAL_PARAMETER:
				return validateDateTime_FunctionalParameter((DateTime_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.DATE_TIME_ARGUMENT:
				return validateDateTime_Argument((DateTime_Argument)value, diagnostics, context);
			case QmmPackage.DATE_TIME_PRIMITIVE_ARGUMENT:
				return validateDateTime_PrimitiveArgument((DateTime_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.DATE_TIME_EVALUATION_OPERATION_ARGUMENT:
				return validateDateTime_EvaluationOperation_Argument((DateTime_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.DATE_TIME_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT:
				return validateDateTime_CalculateableElementReferenceArgument((DateTime_CalculateableElementReferenceArgument)value, diagnostics, context);
			case QmmPackage.DATE_TIME_EXPRESSION_OPERATOR:
				return validateDateTime_ExpressionOperator((DateTime_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_BIT_OPERATOR:
				return validateDateTime_BitOperator((DateTime_BitOperator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_AND_BIT_OPERATOR:
				return validateDateTime_And_BitOperator((DateTime_And_BitOperator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_OR_BIT_OPERATOR:
				return validateDateTime_Or_BitOperator((DateTime_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.DATE_TIME_FUNCTIONAL_OPERATOR:
				return validateDateTime_FunctionalOperator((DateTime_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_LAST_WRITING_DATE_TIME_ATTR_ECLASS:
				return validateSourceDocumentInformation_lastWritingDateTime_AttrEClass((SourceDocumentInformation_lastWritingDateTime_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_ID_ATTR_ECLASS:
				return validateSourceDocumentInformation_originID_AttrEClass((SourceDocumentInformation_originID_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_NAME_ATTR_ECLASS:
				return validateSourceDocumentInformation_originName_AttrEClass((SourceDocumentInformation_originName_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_ID_ATTR_ECLASS:
				return validateSourceDocumentInformation_originProjectID_AttrEClass((SourceDocumentInformation_originProjectID_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
				return validateSourceDocumentInformation_originProjectTitle_AttrEClass((SourceDocumentInformation_originProjectTitle_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_RELEASE_ATTR_ECLASS:
				return validateSourceDocumentInformation_originRelease_AttrEClass((SourceDocumentInformation_originRelease_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_ATTR_ECLASS:
				return validateSourceDocumentInformation_originVendor_AttrEClass((SourceDocumentInformation_originVendor_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VENDOR_URL_ATTR_ECLASS:
				return validateSourceDocumentInformation_originVendorURL_AttrEClass((SourceDocumentInformation_originVendorURL_AttrEClass)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_ORIGIN_VERSION_ATTR_ECLASS:
				return validateSourceDocumentInformation_originVersion_AttrEClass((SourceDocumentInformation_originVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.SUPPORTED_ROLE_CLASS_REF_ROLE_CLASS_PATH_ATTR_ECLASS:
				return validateSupportedRoleClass_refRoleClassPath_AttrEClass((SupportedRoleClass_refRoleClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_REF_BASE_CLASS_PATH_ATTR_ECLASS:
				return validateSystemUnitClass_refBaseClassPath_AttrEClass((SystemUnitClass_refBaseClassPath_AttrEClass)value, diagnostics, context);
			case QmmPackage.UNKNOWN_TYPE_REQUIREMENTS_ATTR_ECLASS:
				return validateUnknownType_requirements_AttrEClass((UnknownType_requirements_AttrEClass)value, diagnostics, context);
			case QmmPackage.COPYRIGHT_VALUE_ATTR_ECLASS:
				return validateCopyright_value_AttrEClass((Copyright_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.COPYRIGHT_CHANGE_MODE_ATTR_ECLASS:
				return validateCopyright_changeMode_AttrEClass((Copyright_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.DESCRIPTION_VALUE_ATTR_ECLASS:
				return validateDescription_value_AttrEClass((Description_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.DESCRIPTION_CHANGE_MODE_ATTR_ECLASS:
				return validateDescription_changeMode_AttrEClass((Description_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.REVISION_REVISION_DATE_ATTR_ECLASS:
				return validateRevision_revisionDate_AttrEClass((Revision_revisionDate_AttrEClass)value, diagnostics, context);
			case QmmPackage.REVISION_OLD_VERSION_ATTR_ECLASS:
				return validateRevision_oldVersion_AttrEClass((Revision_oldVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.REVISION_NEW_VERSION_ATTR_ECLASS:
				return validateRevision_newVersion_AttrEClass((Revision_newVersion_AttrEClass)value, diagnostics, context);
			case QmmPackage.REVISION_AUTHOR_NAME_ATTR_ECLASS:
				return validateRevision_authorName_AttrEClass((Revision_authorName_AttrEClass)value, diagnostics, context);
			case QmmPackage.REVISION_COMMENT_ATTR_ECLASS:
				return validateRevision_comment_AttrEClass((Revision_comment_AttrEClass)value, diagnostics, context);
			case QmmPackage.VERSION_VALUE_ATTR_ECLASS:
				return validateVersion_value_AttrEClass((Version_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.VERSION_CHANGE_MODE_ATTR_ECLASS:
				return validateVersion_changeMode_AttrEClass((Version_changeMode_AttrEClass)value, diagnostics, context);
			case QmmPackage.ELEMENT_NAME_ATTR_ECLASS:
				return validateElement_name_AttrEClass((Element_name_AttrEClass)value, diagnostics, context);
			case QmmPackage.ELEMENT_VALUE_ATTR_ECLASS:
				return validateElement_value_AttrEClass((Element_value_AttrEClass)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT_ELEMENT_FEATURE_MAP_ATTR_ECLASS:
				return validateGenericElement_elementFeatureMap_AttrEClass((GenericElement_elementFeatureMap_AttrEClass)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT_ATTRIBUTE_FEATURE_MAP_ATTR_ECLASS:
				return validateGenericElement_attributeFeatureMap_AttrEClass((GenericElement_attributeFeatureMap_AttrEClass)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_OR_GROUP:
				return validateAttribute_OrGroup((Attribute_OrGroup)value, diagnostics, context);
			case QmmPackage.REF_SEMANTIC_OR_GROUP:
				return validateRefSemantic_OrGroup((RefSemantic_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_VALUE_REQUIREMENT_OR_GROUP:
				return validateAttributeValueRequirement_OrGroup((AttributeValueRequirement_OrGroup)value, diagnostics, context);
			case QmmPackage.ORDINAL_SCALED_TYPE_OR_GROUP:
				return validateOrdinalScaledType_OrGroup((OrdinalScaledType_OrGroup)value, diagnostics, context);
			case QmmPackage.NOMINAL_SCALED_TYPE_OR_GROUP:
				return validateNominalScaledType_OrGroup((NominalScaledType_OrGroup)value, diagnostics, context);
			case QmmPackage.UNKNOWN_TYPE_OR_GROUP:
				return validateUnknownType_OrGroup((UnknownType_OrGroup)value, diagnostics, context);
			case QmmPackage.DESCRIPTION_OR_GROUP:
				return validateDescription_OrGroup((Description_OrGroup)value, diagnostics, context);
			case QmmPackage.VERSION_OR_GROUP:
				return validateVersion_OrGroup((Version_OrGroup)value, diagnostics, context);
			case QmmPackage.REVISION_OR_GROUP:
				return validateRevision_OrGroup((Revision_OrGroup)value, diagnostics, context);
			case QmmPackage.COPYRIGHT_OR_GROUP:
				return validateCopyright_OrGroup((Copyright_OrGroup)value, diagnostics, context);
			case QmmPackage.ADDITIONAL_INFORMATION_OR_GROUP:
				return validateAdditionalInformation_OrGroup((AdditionalInformation_OrGroup)value, diagnostics, context);
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION_OR_GROUP:
				return validateSourceDocumentInformation_OrGroup((SourceDocumentInformation_OrGroup)value, diagnostics, context);
			case QmmPackage.EXTERNAL_REFERENCE_TYPE_OR_GROUP:
				return validateExternalReferenceType_OrGroup((ExternalReferenceType_OrGroup)value, diagnostics, context);
			case QmmPackage.INSTANCE_HIERARCHY_OR_GROUP:
				return validateInstanceHierarchy_OrGroup((InstanceHierarchy_OrGroup)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_LIB_OR_GROUP:
				return validateInterfaceClassLib_OrGroup((InterfaceClassLib_OrGroup)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_LIB_OR_GROUP:
				return validateRoleClassLib_OrGroup((RoleClassLib_OrGroup)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_LIB_OR_GROUP:
				return validateSystemUnitClassLib_OrGroup((SystemUnitClassLib_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_LIB_OR_GROUP:
				return validateAttributeLib_OrGroup((AttributeLib_OrGroup)value, diagnostics, context);
			case QmmPackage.CAEX_FILE_OR_GROUP:
				return validateCAEXFile_OrGroup((CAEXFile_OrGroup)value, diagnostics, context);
			case QmmPackage.INTERFACE_CLASS_OR_GROUP:
				return validateInterfaceClass_OrGroup((InterfaceClass_OrGroup)value, diagnostics, context);
			case QmmPackage.INTERNAL_ELEMENT_OR_GROUP:
				return validateInternalElement_OrGroup((InternalElement_OrGroup)value, diagnostics, context);
			case QmmPackage.EXTERNAL_INTERFACE_OR_GROUP:
				return validateExternalInterface_OrGroup((ExternalInterface_OrGroup)value, diagnostics, context);
			case QmmPackage.ROLE_REQUIREMENTS_OR_GROUP:
				return validateRoleRequirements_OrGroup((RoleRequirements_OrGroup)value, diagnostics, context);
			case QmmPackage.SYSTEM_UNIT_CLASS_OR_GROUP:
				return validateSystemUnitClass_OrGroup((SystemUnitClass_OrGroup)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_NAME_MAPPING_OR_GROUP:
				return validateAttributeNameMapping_OrGroup((AttributeNameMapping_OrGroup)value, diagnostics, context);
			case QmmPackage.INTERFACE_ID_MAPPING_OR_GROUP:
				return validateInterfaceIDMapping_OrGroup((InterfaceIDMapping_OrGroup)value, diagnostics, context);
			case QmmPackage.ROLE_CLASS_OR_GROUP:
				return validateRoleClass_OrGroup((RoleClass_OrGroup)value, diagnostics, context);
			case QmmPackage.MAPPING_OR_GROUP:
				return validateMapping_OrGroup((Mapping_OrGroup)value, diagnostics, context);
			case QmmPackage.SUPPORTED_ROLE_CLASS_OR_GROUP:
				return validateSupportedRoleClass_OrGroup((SupportedRoleClass_OrGroup)value, diagnostics, context);
			case QmmPackage.INTERNAL_LINK_OR_GROUP:
				return validateInternalLink_OrGroup((InternalLink_OrGroup)value, diagnostics, context);
			case QmmPackage.GENERIC_ELEMENT_OR_GROUP:
				return validateGenericElement_OrGroup((GenericElement_OrGroup)value, diagnostics, context);
			case QmmPackage.GENERIC_ATTRIBUTE_OR_GROUP:
				return validateGenericAttribute_OrGroup((GenericAttribute_OrGroup)value, diagnostics, context);
			case QmmPackage.OBJECT_OPERATOR:
				return validateObject_Operator((Object_Operator)value, diagnostics, context);
			case QmmPackage.OBJECT_TYPE:
				return validateObject_Type((Object_Type)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_TYPE:
				return validateObject_FunctionalType((Object_FunctionalType)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE_PARAMETER:
				return validateObject_CalculateableParameter((Object_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_PARAMETER:
				return validateObject_FunctionalParameter((Object_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE:
				return validateObject_Calculateable((Object_Calculateable)value, diagnostics, context);
			case QmmPackage.OBJECT_CALCULATEABLE_ELEMENT:
				return validateObject_CalculateableElement((Object_CalculateableElement)value, diagnostics, context);
			case QmmPackage.OBJECT_ARGUMENT:
				return validateObject_Argument((Object_Argument)value, diagnostics, context);
			case QmmPackage.OBJECT_PRIMITIVE_ARGUMENT:
				return validateObject_PrimitiveArgument((Object_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.OBJECT_EVALUATION_OPERATION_ARGUMENT:
				return validateObject_EvaluationOperation_Argument((Object_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.OBJECT_EXPRESSION_OPERATOR:
				return validateObject_ExpressionOperator((Object_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_BIT_OPERATOR:
				return validateObject_BitOperator((Object_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_AND_BIT_OPERATOR:
				return validateObject_And_BitOperator((Object_And_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_OR_BIT_OPERATOR:
				return validateObject_Or_BitOperator((Object_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_FUNCTIONAL_OPERATOR:
				return validateObject_FunctionalOperator((Object_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_OPERATOR:
				return validateBoolean_Operator((Boolean_Operator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_TYPE:
				return validateBoolean_Type((Boolean_Type)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_TYPE:
				return validateBoolean_FunctionalType((Boolean_FunctionalType)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE_PARAMETER:
				return validateBoolean_CalculateableParameter((Boolean_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_PARAMETER:
				return validateBoolean_FunctionalParameter((Boolean_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE:
				return validateBoolean_Calculateable((Boolean_Calculateable)value, diagnostics, context);
			case QmmPackage.BOOLEAN_CALCULATEABLE_ELEMENT:
				return validateBoolean_CalculateableElement((Boolean_CalculateableElement)value, diagnostics, context);
			case QmmPackage.BOOLEAN_ARGUMENT:
				return validateBoolean_Argument((Boolean_Argument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_PRIMITIVE_ARGUMENT:
				return validateBoolean_PrimitiveArgument((Boolean_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_EVALUATION_OPERATION_ARGUMENT:
				return validateBoolean_EvaluationOperation_Argument((Boolean_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.BOOLEAN_EXPRESSION_OPERATOR:
				return validateBoolean_ExpressionOperator((Boolean_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_BIT_OPERATOR:
				return validateBoolean_BitOperator((Boolean_BitOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_AND_BIT_OPERATOR:
				return validateBoolean_And_BitOperator((Boolean_And_BitOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_OR_BIT_OPERATOR:
				return validateBoolean_Or_BitOperator((Boolean_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateBoolean_Original_FunctionalOperator((Boolean_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EQUALS_FUNCTIONAL_OPERATOR:
				return validateequals_FunctionalOperator((equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.TO_STRING_FUNCTIONAL_OPERATOR:
				return validatetoString_FunctionalOperator((toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_OPERATOR:
				return validateCharSequence_Operator((CharSequence_Operator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_TYPE:
				return validateCharSequence_Type((CharSequence_Type)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_TYPE:
				return validateCharSequence_FunctionalType((CharSequence_FunctionalType)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_PARAMETER:
				return validateCharSequence_CalculateableParameter((CharSequence_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_PARAMETER:
				return validateCharSequence_FunctionalParameter((CharSequence_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE:
				return validateCharSequence_Calculateable((CharSequence_Calculateable)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_CALCULATEABLE_ELEMENT:
				return validateCharSequence_CalculateableElement((CharSequence_CalculateableElement)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_ARGUMENT:
				return validateCharSequence_Argument((CharSequence_Argument)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_PRIMITIVE_ARGUMENT:
				return validateCharSequence_PrimitiveArgument((CharSequence_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_EVALUATION_OPERATION_ARGUMENT:
				return validateCharSequence_EvaluationOperation_Argument((CharSequence_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_EXPRESSION_OPERATOR:
				return validateCharSequence_ExpressionOperator((CharSequence_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_BIT_OPERATOR:
				return validateCharSequence_BitOperator((CharSequence_BitOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_AND_BIT_OPERATOR:
				return validateCharSequence_And_BitOperator((CharSequence_And_BitOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_OR_BIT_OPERATOR:
				return validateCharSequence_Or_BitOperator((CharSequence_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateCharSequence_Original_FunctionalOperator((CharSequence_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_OPERATOR:
				return validateInteger_Operator((Integer_Operator)value, diagnostics, context);
			case QmmPackage.INTEGER_TYPE:
				return validateInteger_Type((Integer_Type)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_TYPE:
				return validateInteger_FunctionalType((Integer_FunctionalType)value, diagnostics, context);
			case QmmPackage.INTEGER_CALCULATEABLE_PARAMETER:
				return validateInteger_CalculateableParameter((Integer_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_PARAMETER:
				return validateInteger_FunctionalParameter((Integer_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.INTEGER_ARGUMENT:
				return validateInteger_Argument((Integer_Argument)value, diagnostics, context);
			case QmmPackage.INTEGER_PRIMITIVE_ARGUMENT:
				return validateInteger_PrimitiveArgument((Integer_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.INTEGER_EVALUATION_OPERATION_ARGUMENT:
				return validateInteger_EvaluationOperation_Argument((Integer_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.INTEGER_EXPRESSION_OPERATOR:
				return validateInteger_ExpressionOperator((Integer_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_BIT_OPERATOR:
				return validateInteger_BitOperator((Integer_BitOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_AND_BIT_OPERATOR:
				return validateInteger_And_BitOperator((Integer_And_BitOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_OR_BIT_OPERATOR:
				return validateInteger_Or_BitOperator((Integer_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateInteger_Original_FunctionalOperator((Integer_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.LENGTH_FUNCTIONAL_OPERATOR:
				return validatelength_FunctionalOperator((length_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_OPERATOR:
				return validateCharacter_Operator((Character_Operator)value, diagnostics, context);
			case QmmPackage.CHARACTER_TYPE:
				return validateCharacter_Type((Character_Type)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_TYPE:
				return validateCharacter_FunctionalType((Character_FunctionalType)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE_PARAMETER:
				return validateCharacter_CalculateableParameter((Character_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_PARAMETER:
				return validateCharacter_FunctionalParameter((Character_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE:
				return validateCharacter_Calculateable((Character_Calculateable)value, diagnostics, context);
			case QmmPackage.CHARACTER_CALCULATEABLE_ELEMENT:
				return validateCharacter_CalculateableElement((Character_CalculateableElement)value, diagnostics, context);
			case QmmPackage.CHARACTER_ARGUMENT:
				return validateCharacter_Argument((Character_Argument)value, diagnostics, context);
			case QmmPackage.CHARACTER_PRIMITIVE_ARGUMENT:
				return validateCharacter_PrimitiveArgument((Character_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.CHARACTER_EVALUATION_OPERATION_ARGUMENT:
				return validateCharacter_EvaluationOperation_Argument((Character_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.CHARACTER_EXPRESSION_OPERATOR:
				return validateCharacter_ExpressionOperator((Character_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_BIT_OPERATOR:
				return validateCharacter_BitOperator((Character_BitOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_AND_BIT_OPERATOR:
				return validateCharacter_And_BitOperator((Character_And_BitOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_OR_BIT_OPERATOR:
				return validateCharacter_Or_BitOperator((Character_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateCharacter_Original_FunctionalOperator((Character_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_AT_FUNCTIONAL_OPERATOR:
				return validatecharAt_FunctionalOperator((charAt_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CONTAINS_FUNCTIONAL_OPERATOR:
				return validatecontains_FunctionalOperator((contains_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SUBSTRING_FUNCTIONAL_OPERATOR:
				return validatesubstring_FunctionalOperator((substring_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CONCAT_FUNCTIONAL_OPERATOR:
				return validateconcat_FunctionalOperator((concat_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.ENDS_WITH_FUNCTIONAL_OPERATOR:
				return validateendsWith_FunctionalOperator((endsWith_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.EQUALS_IGNORE_CASE_FUNCTIONAL_OPERATOR:
				return validateequalsIgnoreCase_FunctionalOperator((equalsIgnoreCase_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INDEX_OF_STRING_FUNCTIONAL_OPERATOR:
				return validateindexOfString_FunctionalOperator((indexOfString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.IS_EMPTY_FUNCTIONAL_OPERATOR:
				return validateisEmpty_FunctionalOperator((isEmpty_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_OPERATOR:
				return validateNumber_Operator((Number_Operator)value, diagnostics, context);
			case QmmPackage.NUMBER_TYPE:
				return validateNumber_Type((Number_Type)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_TYPE:
				return validateNumber_FunctionalType((Number_FunctionalType)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE_PARAMETER:
				return validateNumber_CalculateableParameter((Number_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_PARAMETER:
				return validateNumber_FunctionalParameter((Number_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE:
				return validateNumber_Calculateable((Number_Calculateable)value, diagnostics, context);
			case QmmPackage.NUMBER_CALCULATEABLE_ELEMENT:
				return validateNumber_CalculateableElement((Number_CalculateableElement)value, diagnostics, context);
			case QmmPackage.NUMBER_ARGUMENT:
				return validateNumber_Argument((Number_Argument)value, diagnostics, context);
			case QmmPackage.NUMBER_PRIMITIVE_ARGUMENT:
				return validateNumber_PrimitiveArgument((Number_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.NUMBER_EVALUATION_OPERATION_ARGUMENT:
				return validateNumber_EvaluationOperation_Argument((Number_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.NUMBER_EXPRESSION_OPERATOR:
				return validateNumber_ExpressionOperator((Number_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_BIT_OPERATOR:
				return validateNumber_BitOperator((Number_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_AND_BIT_OPERATOR:
				return validateNumber_And_BitOperator((Number_And_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_OR_BIT_OPERATOR:
				return validateNumber_Or_BitOperator((Number_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateNumber_Original_FunctionalOperator((Number_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validategreaterThan_FunctionalOperator((greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validategreaterEquals_FunctionalOperator((greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validatesmallerThan_FunctionalOperator((smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validatesmallerEquals_FunctionalOperator((smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.PARSE_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateparseBoolean_FunctionalOperator((parseBoolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COMPARE_TO_FUNCTIONAL_OPERATOR:
				return validatecompareTo_FunctionalOperator((compareTo_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Number_equals_FunctionalOperator((Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Number_toString_FunctionalOperator((Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FUNCTIONAL_OPERATOR:
				return validateNumber_FunctionalOperator((Number_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_NUMBER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Number_FunctionalOperator((InheritedFrom_Object_to_Number_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_greaterThan_FunctionalOperator((Number_Integer_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_greaterEquals_FunctionalOperator((Number_Integer_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_smallerThan_FunctionalOperator((Number_Integer_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_smallerEquals_FunctionalOperator((Number_Integer_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_equals_FunctionalOperator((Number_Integer_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_INTEGER_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Integer_Object_Number_toString_FunctionalOperator((Number_Integer_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_FUNCTIONAL_OPERATOR:
				return validateInteger_FunctionalOperator((Integer_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_INTEGER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Integer_FunctionalOperator((InheritedFrom_Number_to_Integer_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.LONG_CALCULATEABLE:
				return validateLong_Calculateable((Long_Calculateable)value, diagnostics, context);
			case QmmPackage.LONG_CALCULATEABLE_ELEMENT:
				return validateLong_CalculateableElement((Long_CalculateableElement)value, diagnostics, context);
			case QmmPackage.LONG_OPERATOR:
				return validateLong_Operator((Long_Operator)value, diagnostics, context);
			case QmmPackage.LONG_TYPE:
				return validateLong_Type((Long_Type)value, diagnostics, context);
			case QmmPackage.LONG_FUNCTIONAL_TYPE:
				return validateLong_FunctionalType((Long_FunctionalType)value, diagnostics, context);
			case QmmPackage.LONG_CALCULATEABLE_PARAMETER:
				return validateLong_CalculateableParameter((Long_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.LONG_FUNCTIONAL_PARAMETER:
				return validateLong_FunctionalParameter((Long_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.LONG_ARGUMENT:
				return validateLong_Argument((Long_Argument)value, diagnostics, context);
			case QmmPackage.LONG_PRIMITIVE_ARGUMENT:
				return validateLong_PrimitiveArgument((Long_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.LONG_EVALUATION_OPERATION_ARGUMENT:
				return validateLong_EvaluationOperation_Argument((Long_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.LONG_EXPRESSION_OPERATOR:
				return validateLong_ExpressionOperator((Long_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.LONG_BIT_OPERATOR:
				return validateLong_BitOperator((Long_BitOperator)value, diagnostics, context);
			case QmmPackage.LONG_AND_BIT_OPERATOR:
				return validateLong_And_BitOperator((Long_And_BitOperator)value, diagnostics, context);
			case QmmPackage.LONG_OR_BIT_OPERATOR:
				return validateLong_Or_BitOperator((Long_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.LONG_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateLong_Original_FunctionalOperator((Long_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_LONG_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Long_greaterThan_FunctionalOperator((Number_Long_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_LONG_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Long_greaterEquals_FunctionalOperator((Number_Long_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_LONG_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Long_smallerThan_FunctionalOperator((Number_Long_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_LONG_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Long_smallerEquals_FunctionalOperator((Number_Long_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_LONG_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Long_Object_Number_equals_FunctionalOperator((Number_Long_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_LONG_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Long_Object_Number_toString_FunctionalOperator((Number_Long_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.LONG_FUNCTIONAL_OPERATOR:
				return validateLong_FunctionalOperator((Long_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_LONG_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Long_FunctionalOperator((InheritedFrom_Number_to_Long_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE:
				return validateDouble_Calculateable((Double_Calculateable)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE_ELEMENT:
				return validateDouble_CalculateableElement((Double_CalculateableElement)value, diagnostics, context);
			case QmmPackage.DOUBLE_OPERATOR:
				return validateDouble_Operator((Double_Operator)value, diagnostics, context);
			case QmmPackage.DOUBLE_TYPE:
				return validateDouble_Type((Double_Type)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_TYPE:
				return validateDouble_FunctionalType((Double_FunctionalType)value, diagnostics, context);
			case QmmPackage.DOUBLE_CALCULATEABLE_PARAMETER:
				return validateDouble_CalculateableParameter((Double_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_PARAMETER:
				return validateDouble_FunctionalParameter((Double_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.DOUBLE_ARGUMENT:
				return validateDouble_Argument((Double_Argument)value, diagnostics, context);
			case QmmPackage.DOUBLE_PRIMITIVE_ARGUMENT:
				return validateDouble_PrimitiveArgument((Double_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.DOUBLE_EVALUATION_OPERATION_ARGUMENT:
				return validateDouble_EvaluationOperation_Argument((Double_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.DOUBLE_EXPRESSION_OPERATOR:
				return validateDouble_ExpressionOperator((Double_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_BIT_OPERATOR:
				return validateDouble_BitOperator((Double_BitOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_AND_BIT_OPERATOR:
				return validateDouble_And_BitOperator((Double_And_BitOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_OR_BIT_OPERATOR:
				return validateDouble_Or_BitOperator((Double_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateDouble_Original_FunctionalOperator((Double_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_greaterThan_FunctionalOperator((Number_Double_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_greaterEquals_FunctionalOperator((Number_Double_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_smallerThan_FunctionalOperator((Number_Double_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_smallerEquals_FunctionalOperator((Number_Double_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_equals_FunctionalOperator((Number_Double_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_DOUBLE_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Double_Object_Number_toString_FunctionalOperator((Number_Double_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.DOUBLE_FUNCTIONAL_OPERATOR:
				return validateDouble_FunctionalOperator((Double_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_DOUBLE_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Double_FunctionalOperator((InheritedFrom_Number_to_Double_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.FLOAT_CALCULATEABLE:
				return validateFloat_Calculateable((Float_Calculateable)value, diagnostics, context);
			case QmmPackage.FLOAT_CALCULATEABLE_ELEMENT:
				return validateFloat_CalculateableElement((Float_CalculateableElement)value, diagnostics, context);
			case QmmPackage.FLOAT_OPERATOR:
				return validateFloat_Operator((Float_Operator)value, diagnostics, context);
			case QmmPackage.FLOAT_TYPE:
				return validateFloat_Type((Float_Type)value, diagnostics, context);
			case QmmPackage.FLOAT_FUNCTIONAL_TYPE:
				return validateFloat_FunctionalType((Float_FunctionalType)value, diagnostics, context);
			case QmmPackage.FLOAT_CALCULATEABLE_PARAMETER:
				return validateFloat_CalculateableParameter((Float_CalculateableParameter)value, diagnostics, context);
			case QmmPackage.FLOAT_FUNCTIONAL_PARAMETER:
				return validateFloat_FunctionalParameter((Float_FunctionalParameter)value, diagnostics, context);
			case QmmPackage.FLOAT_ARGUMENT:
				return validateFloat_Argument((Float_Argument)value, diagnostics, context);
			case QmmPackage.FLOAT_PRIMITIVE_ARGUMENT:
				return validateFloat_PrimitiveArgument((Float_PrimitiveArgument)value, diagnostics, context);
			case QmmPackage.FLOAT_EVALUATION_OPERATION_ARGUMENT:
				return validateFloat_EvaluationOperation_Argument((Float_EvaluationOperation_Argument)value, diagnostics, context);
			case QmmPackage.FLOAT_EXPRESSION_OPERATOR:
				return validateFloat_ExpressionOperator((Float_ExpressionOperator)value, diagnostics, context);
			case QmmPackage.FLOAT_BIT_OPERATOR:
				return validateFloat_BitOperator((Float_BitOperator)value, diagnostics, context);
			case QmmPackage.FLOAT_AND_BIT_OPERATOR:
				return validateFloat_And_BitOperator((Float_And_BitOperator)value, diagnostics, context);
			case QmmPackage.FLOAT_OR_BIT_OPERATOR:
				return validateFloat_Or_BitOperator((Float_Or_BitOperator)value, diagnostics, context);
			case QmmPackage.FLOAT_ORIGINAL_FUNCTIONAL_OPERATOR:
				return validateFloat_Original_FunctionalOperator((Float_Original_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FLOAT_GREATER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Float_greaterThan_FunctionalOperator((Number_Float_greaterThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FLOAT_GREATER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Float_greaterEquals_FunctionalOperator((Number_Float_greaterEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FLOAT_SMALLER_THAN_FUNCTIONAL_OPERATOR:
				return validateNumber_Float_smallerThan_FunctionalOperator((Number_Float_smallerThan_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FLOAT_SMALLER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Float_smallerEquals_FunctionalOperator((Number_Float_smallerEquals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FLOAT_OBJECT_NUMBER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateNumber_Float_Object_Number_equals_FunctionalOperator((Number_Float_Object_Number_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.NUMBER_FLOAT_OBJECT_NUMBER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateNumber_Float_Object_Number_toString_FunctionalOperator((Number_Float_Object_Number_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.FLOAT_FUNCTIONAL_OPERATOR:
				return validateFloat_FunctionalOperator((Float_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_NUMBER_TO_FLOAT_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Number_to_Float_FunctionalOperator((InheritedFrom_Number_to_Float_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_equals_FunctionalOperator((Object_CharSequence_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_CharSequence_toString_FunctionalOperator((Object_CharSequence_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_FUNCTIONAL_OPERATOR:
				return validateCharSequence_FunctionalOperator((CharSequence_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHAR_SEQUENCE_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_CharSequence_FunctionalOperator((InheritedFrom_Object_to_CharSequence_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Character_equals_FunctionalOperator((Object_Character_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_CHARACTER_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Character_toString_FunctionalOperator((Object_Character_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHARACTER_FUNCTIONAL_OPERATOR:
				return validateCharacter_FunctionalOperator((Character_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_CHARACTER_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Character_FunctionalOperator((InheritedFrom_Object_to_Character_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_EQUALS_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_equals_FunctionalOperator((Object_Boolean_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.OBJECT_BOOLEAN_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateObject_Boolean_toString_FunctionalOperator((Object_Boolean_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateBoolean_FunctionalOperator((Boolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_OBJECT_TO_BOOLEAN_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_Object_to_Boolean_FunctionalOperator((InheritedFrom_Object_to_Boolean_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_LENGTH_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_length_FunctionalOperator((CharSequence_String_length_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_EQUALS_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_equals_FunctionalOperator((CharSequence_String_Object_CharSequence_equals_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE_STRING_OBJECT_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateCharSequence_String_Object_CharSequence_toString_FunctionalOperator((CharSequence_String_Object_CharSequence_toString_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.STRING_FUNCTIONAL_OPERATOR:
				return validateString_FunctionalOperator((String_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.INHERITED_FROM_CHAR_SEQUENCE_TO_STRING_FUNCTIONAL_OPERATOR:
				return validateInheritedFrom_CharSequence_to_String_FunctionalOperator((InheritedFrom_CharSequence_to_String_FunctionalOperator)value, diagnostics, context);
			case QmmPackage.COUNT_AGGREGATION_OPERATOR:
				return validateCount_AggregationOperator((Count_AggregationOperator)value, diagnostics, context);
			case QmmPackage.SUM_AGGREGATION_OPERATOR:
				return validateSum_AggregationOperator((Sum_AggregationOperator)value, diagnostics, context);
			case QmmPackage.MIN_AGGREGATION_OPERATOR:
				return validateMin_AggregationOperator((Min_AggregationOperator)value, diagnostics, context);
			case QmmPackage.MAX_AGGREGATION_OPERATOR:
				return validateMax_AggregationOperator((Max_AggregationOperator)value, diagnostics, context);
			case QmmPackage.INTEGER_PARSE_INT_CLASS_OPERATOR:
				return validateIntegerParseInt_ClassOperator((IntegerParseInt_ClassOperator)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE:
				return validateChangeMode((ChangeMode)value, diagnostics, context);
			case QmmPackage.ATTRIBUTE_DATA_TYPE:
				return validateAttributeDataType((String)value, diagnostics, context);
			case QmmPackage.CHANGE_MODE_OBJECT:
				return validateChangeModeObject((Enumerator)value, diagnostics, context);
			case QmmPackage.OBJECT:
				return validateObject(value, diagnostics, context);
			case QmmPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			case QmmPackage.CHAR_SEQUENCE:
				return validateCharSequence((CharSequence)value, diagnostics, context);
			case QmmPackage.INTEGER:
				return validateInteger((Integer)value, diagnostics, context);
			case QmmPackage.CHARACTER:
				return validateCharacter((Character)value, diagnostics, context);
			case QmmPackage.NUMBER:
				return validateNumber((Number)value, diagnostics, context);
			case QmmPackage.LONG:
				return validateLong((Long)value, diagnostics, context);
			case QmmPackage.DOUBLE:
				return validateDouble((Double)value, diagnostics, context);
			case QmmPackage.FLOAT:
				return validateFloat((Float)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeFamily(AttributeFamily attributeFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeFamily_validate(attributeFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeFamily_validate(AttributeFamily attributeFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping(AttributeNameMapping attributeNameMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeNameMapping_validate(attributeNameMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_validate(AttributeNameMapping attributeNameMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeNameMapping.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_validate(attribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_validate(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attribute.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib(AttributeLib attributeLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeLib_validate(attributeLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib_validate(AttributeLib attributeLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement(AttributeValueRequirement attributeValueRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeValueRequirement_validate(attributeValueRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Value Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_validate(AttributeValueRequirement attributeValueRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeValueRequirement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject(CAEXBasicObject caexBasicObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexBasicObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexBasicObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXBasicObject_validate(caexBasicObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject_validate(CAEXBasicObject caexBasicObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexBasicObject.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile(CAEXFile caexFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXFile_validate(caexFile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_validate(CAEXFile caexFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexFile.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject(CAEXObject caexObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCAEXObject_validate(caexObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>CAEX Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_validate(CAEXObject caexObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return caexObject.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentRoot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateDocumentRoot_validate(documentRoot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot_validate(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return documentRoot.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface(ExternalInterface externalInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalInterface_validate(externalInterface, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface_validate(ExternalInterface externalInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalInterface.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType(ExternalReferenceType externalReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalReferenceType_validate(externalReferenceType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>External Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_validate(ExternalReferenceType externalReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalReferenceType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy(InstanceHierarchy instanceHierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceHierarchy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceHierarchy, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceHierarchy_validate(instanceHierarchy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Instance Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy_validate(InstanceHierarchy instanceHierarchy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instanceHierarchy.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib(InterfaceClassLib interfaceClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClassLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceClassLib_validate(interfaceClassLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib_validate(InterfaceClassLib interfaceClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceClassLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass(InterfaceClass interfaceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceClass_validate(interfaceClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_validate(InterfaceClass interfaceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceFamily(InterfaceFamily interfaceFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceFamily_validate(interfaceFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceFamily_validate(InterfaceFamily interfaceFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping(InterfaceIDMapping interfaceIDMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterfaceIDMapping_validate(interfaceIDMapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Interface ID Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_validate(InterfaceIDMapping interfaceIDMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interfaceIDMapping.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement(InternalElement internalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalElement_validate(internalElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_validate(InternalElement internalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink(InternalLink internalLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalLink_validate(internalLink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_validate(InternalLink internalLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalLink.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateMapping_validate(mapping, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_validate(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mapping.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType(NominalScaledType nominalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nominalScaledType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nominalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNominalScaledType_validate(nominalScaledType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Nominal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_validate(NominalScaledType nominalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return nominalScaledType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType(OrdinalScaledType ordinalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrdinalScaledType_validate(ordinalScaledType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Ordinal Scaled Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_validate(OrdinalScaledType ordinalScaledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ordinalScaledType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic(RefSemantic refSemantic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refSemantic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refSemantic, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefSemantic_validate(refSemantic, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Ref Semantic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_validate(RefSemantic refSemantic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refSemantic.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib(RoleClassLib roleClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClassLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleClassLib_validate(roleClassLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib_validate(RoleClassLib roleClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleClassLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass(RoleClass roleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleClass_validate(roleClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_validate(RoleClass roleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleFamily(RoleFamily roleFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleFamily_validate(roleFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleFamily_validate(RoleFamily roleFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements(RoleRequirements roleRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleRequirements, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleRequirements, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleRequirements_validate(roleRequirements, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Role Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements_validate(RoleRequirements roleRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return roleRequirements.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation(SourceDocumentInformation sourceDocumentInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSourceDocumentInformation_validate(sourceDocumentInformation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Source Document Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_validate(SourceDocumentInformation sourceDocumentInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sourceDocumentInformation.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass(SupportedRoleClass supportedRoleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportedRoleClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportedRoleClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupportedRoleClass_validate(supportedRoleClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Supported Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_validate(SupportedRoleClass supportedRoleClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supportedRoleClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib(SystemUnitClassLib systemUnitClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClassLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClassLib, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitClassLib_validate(systemUnitClassLib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib_validate(SystemUnitClassLib systemUnitClassLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitClassLib.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass(SystemUnitClass systemUnitClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitClass_validate(systemUnitClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_validate(SystemUnitClass systemUnitClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitFamily(SystemUnitFamily systemUnitFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitFamily, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitFamily, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemUnitFamily_validate(systemUnitFamily, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>System Unit Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitFamily_validate(SystemUnitFamily systemUnitFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemUnitFamily.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType(UnknownType unknownType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownType, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnknownType_validate(unknownType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Unknown Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_validate(UnknownType unknownType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unknownType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright(Copyright copyright, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright, diagnostics, context);
		if (result || diagnostics != null) result &= validateCopyright_validate(copyright, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Copyright</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_validate(Copyright copyright, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return copyright.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescription_validate(description, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_validate(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return description.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision(Revision revision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision, diagnostics, context);
		if (result || diagnostics != null) result &= validateRevision_validate(revision, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_validate(Revision revision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return revision.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= validateVersion_validate(version, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_validate(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return version.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation(AdditionalInformation additionalInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(additionalInformation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(additionalInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdditionalInformation_validate(additionalInformation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation_validate(AdditionalInformation additionalInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return additionalInformation.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_validate(element, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_validate(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement(GenericElement genericElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenericElement_validate(genericElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_validate(GenericElement genericElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return genericElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute(GenericAttribute genericAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenericAttribute_validate(genericAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Generic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute_validate(GenericAttribute genericAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return genericAttribute.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable(Countable countable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegatableElement(NegatableElement negatableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negatableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrGroup(OrGroup orGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(orGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrGroup_validate(OrGroup orGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return orGroup.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootClass(RootClass rootClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rootClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuery(Query query, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(query, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindQuery(FindQuery findQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateable(Calculateable calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableElement(CalculateableElement calculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeEClass(AttributeEClass attributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularAttributeEClass(RegularAttributeEClass regularAttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularAttributeEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationAttributeEClass(EnumerationAttributeEClass enumerationAttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationAttributeEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalType(FunctionalType functionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceArgument(ReferenceArgument referenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable_ReferenceArgument(Countable_ReferenceArgument countable_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(countable_ReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(countable_ReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountable_ReferenceArgument_validate(countable_ReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Countable Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountable_ReferenceArgument_validate(Countable_ReferenceArgument countable_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return countable_ReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateable_Argument(Calculateable_Argument calculateable_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateable_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableElement_ReferenceArgument(CalculateableElement_ReferenceArgument calculateableElement_ReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableElement_ReferenceArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalArgument(FunctionalArgument functionalArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationOperation_Argument(EvaluationOperation_Argument evaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveArgument(PrimitiveArgument primitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountableReferenceParameter(CountableReferenceParameter countableReferenceParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countableReferenceParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculateableParameter(CalculateableParameter calculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculateableParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalParameter(FunctionalParameter functionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Calculateable(Integer_Calculateable integer_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableElement(Integer_CalculateableElement integer_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionOperator(ExpressionOperator expressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationOperator(EnumerationOperator enumerationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitOperator(BitOperator bitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalOperator(FunctionalOperator functionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOperator(ClassOperator classOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationOperator(EvaluationOperator evaluationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationFunctionalOperator(EvaluationFunctionalOperator evaluationFunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationFunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationOperator(AggregationOperator aggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationBitOperator(EvaluationBitOperator evaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd_EvaluationBitOperator(And_EvaluationBitOperator and_EvaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and_EvaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr_EvaluationBitOperator(Or_EvaluationBitOperator or_EvaluationBitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or_EvaluationBitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountingAggregationOperator(CountingAggregationOperator countingAggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countingAggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculatingAggregationOperator(CalculatingAggregationOperator calculatingAggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculatingAggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Calculateable(String_Calculateable string_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElement(String_CalculateableElement string_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_AttributeEClass(String_AttributeEClass string_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(string_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_AttributeEClass_validate(String_AttributeEClass string_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Operator(String_Operator string_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Type(String_Type string_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalType(String_FunctionalType string_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableParameter(String_CalculateableParameter string_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_CalculateableParameter_validate(string_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableParameter_validate(String_CalculateableParameter string_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalParameter(String_FunctionalParameter string_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_FunctionalParameter_validate(string_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalParameter_validate(String_FunctionalParameter string_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Argument(String_Argument string_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_PrimitiveArgument(String_PrimitiveArgument string_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_EvaluationOperation_Argument(String_EvaluationOperation_Argument string_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElementReferenceArgument(String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(string_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(string_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_CalculateableElementReferenceArgument_validate(string_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>String Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_CalculateableElementReferenceArgument_validate(String_CalculateableElementReferenceArgument string_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return string_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_ExpressionOperator(String_ExpressionOperator string_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_BitOperator(String_BitOperator string_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_And_BitOperator(String_And_BitOperator string_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Or_BitOperator(String_Or_BitOperator string_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_Original_FunctionalOperator(String_Original_FunctionalOperator string_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_roleAttributeName_AttrEClass(AttributeNameMapping_roleAttributeName_AttrEClass attributeNameMapping_roleAttributeName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attributeNameMapping_roleAttributeName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_systemUnitAttributeName_AttrEClass(AttributeNameMapping_systemUnitAttributeName_AttrEClass attributeNameMapping_systemUnitAttributeName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attributeNameMapping_systemUnitAttributeName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_defaultValue_AttrEClass(Attribute_defaultValue_AttrEClass attribute_defaultValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_defaultValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_defaultValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_defaultValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_value_AttrEClass(Attribute_value_AttrEClass attribute_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Calculateable(AttributeDataType_Calculateable attributeDataType_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableElement(AttributeDataType_CalculateableElement attributeDataType_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_AttributeEClass(AttributeDataType_AttributeEClass attributeDataType_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_AttributeEClass_validate(attributeDataType_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_AttributeEClass_validate(AttributeDataType_AttributeEClass attributeDataType_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Operator(AttributeDataType_Operator attributeDataType_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Type(AttributeDataType_Type attributeDataType_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalType(AttributeDataType_FunctionalType attributeDataType_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableParameter(AttributeDataType_CalculateableParameter attributeDataType_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_CalculateableParameter_validate(attributeDataType_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableParameter_validate(AttributeDataType_CalculateableParameter attributeDataType_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalParameter(AttributeDataType_FunctionalParameter attributeDataType_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_FunctionalParameter_validate(attributeDataType_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalParameter_validate(AttributeDataType_FunctionalParameter attributeDataType_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Argument(AttributeDataType_Argument attributeDataType_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_PrimitiveArgument(AttributeDataType_PrimitiveArgument attributeDataType_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_EvaluationOperation_Argument(AttributeDataType_EvaluationOperation_Argument attributeDataType_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableElementReferenceArgument(AttributeDataType_CalculateableElementReferenceArgument attributeDataType_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_CalculateableElementReferenceArgument_validate(attributeDataType_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Attribute Data Type Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_CalculateableElementReferenceArgument_validate(AttributeDataType_CalculateableElementReferenceArgument attributeDataType_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attributeDataType_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_ExpressionOperator(AttributeDataType_ExpressionOperator attributeDataType_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_BitOperator(AttributeDataType_BitOperator attributeDataType_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_And_BitOperator(AttributeDataType_And_BitOperator attributeDataType_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_Or_BitOperator(AttributeDataType_Or_BitOperator attributeDataType_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType_FunctionalOperator(AttributeDataType_FunctionalOperator attributeDataType_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDataType_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_attributeDataType_AttrEClass(Attribute_attributeDataType_AttrEClass attribute_attributeDataType_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_attributeDataType_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_attributeDataType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeDataType_AttributeEClass_validate(attribute_attributeDataType_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_refAttributeType_AttrEClass(Attribute_refAttributeType_AttrEClass attribute_refAttributeType_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_refAttributeType_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_refAttributeType_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_refAttributeType_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_unit_AttrEClass(Attribute_unit_AttrEClass attribute_unit_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_unit_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_unit_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attribute_unit_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_name_AttrEClass(AttributeValueRequirement_name_AttrEClass attributeValueRequirement_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueRequirement_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(attributeValueRequirement_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_Calculateable(ChangeMode_Calculateable changeMode_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_CalculateableElement(ChangeMode_CalculateableElement changeMode_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_Operator(ChangeMode_Operator changeMode_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_EnumerationOperator(ChangeMode_EnumerationOperator changeMode_EnumerationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_EnumerationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode_AttributeEClass(ChangeMode_AttributeEClass changeMode_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMode_AttributeEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXBasicObject_changeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass caexBasicObject_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caexBasicObject_changeMode_AttrEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_superiorStandardVersion_AttrEClass(CAEXFile_superiorStandardVersion_AttrEClass caexFile_superiorStandardVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexFile_superiorStandardVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_fileName_AttrEClass(CAEXFile_fileName_AttrEClass caexFile_fileName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_fileName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_fileName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexFile_fileName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_schemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass caexFile_schemaVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_schemaVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexFile_schemaVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_iD_AttrEClass(CAEXObject_iD_AttrEClass caexObject_iD_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject_iD_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject_iD_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexObject_iD_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXObject_name_AttrEClass(CAEXObject_name_AttrEClass caexObject_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexObject_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexObject_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(caexObject_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Calculateable(EFeatureMapEntry_Calculateable eFeatureMapEntry_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableElement(EFeatureMapEntry_CalculateableElement eFeatureMapEntry_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_AttributeEClass(EFeatureMapEntry_AttributeEClass eFeatureMapEntry_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(eFeatureMapEntry_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_AttributeEClass_validate(EFeatureMapEntry_AttributeEClass eFeatureMapEntry_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Operator(EFeatureMapEntry_Operator eFeatureMapEntry_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Type(EFeatureMapEntry_Type eFeatureMapEntry_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalType(EFeatureMapEntry_FunctionalType eFeatureMapEntry_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableParameter(EFeatureMapEntry_CalculateableParameter eFeatureMapEntry_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_CalculateableParameter_validate(eFeatureMapEntry_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableParameter_validate(EFeatureMapEntry_CalculateableParameter eFeatureMapEntry_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalParameter(EFeatureMapEntry_FunctionalParameter eFeatureMapEntry_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_FunctionalParameter_validate(eFeatureMapEntry_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalParameter_validate(EFeatureMapEntry_FunctionalParameter eFeatureMapEntry_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Argument(EFeatureMapEntry_Argument eFeatureMapEntry_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_PrimitiveArgument(EFeatureMapEntry_PrimitiveArgument eFeatureMapEntry_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_EvaluationOperation_Argument(EFeatureMapEntry_EvaluationOperation_Argument eFeatureMapEntry_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableElementReferenceArgument(EFeatureMapEntry_CalculateableElementReferenceArgument eFeatureMapEntry_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_CalculateableElementReferenceArgument_validate(eFeatureMapEntry_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>EFeature Map Entry Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_CalculateableElementReferenceArgument_validate(EFeatureMapEntry_CalculateableElementReferenceArgument eFeatureMapEntry_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eFeatureMapEntry_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_ExpressionOperator(EFeatureMapEntry_ExpressionOperator eFeatureMapEntry_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_BitOperator(EFeatureMapEntry_BitOperator eFeatureMapEntry_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_And_BitOperator(EFeatureMapEntry_And_BitOperator eFeatureMapEntry_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_Or_BitOperator(EFeatureMapEntry_Or_BitOperator eFeatureMapEntry_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEFeatureMapEntry_FunctionalOperator(EFeatureMapEntry_FunctionalOperator eFeatureMapEntry_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eFeatureMapEntry_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot_mixed_AttrEClass(DocumentRoot_mixed_AttrEClass documentRoot_mixed_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentRoot_mixed_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentRoot_mixed_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(documentRoot_mixed_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_alias_AttrEClass(ExternalReferenceType_alias_AttrEClass externalReferenceType_alias_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType_alias_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType_alias_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(externalReferenceType_alias_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_path_AttrEClass(ExternalReferenceType_path_AttrEClass externalReferenceType_path_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType_path_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType_path_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(externalReferenceType_path_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_refBaseClassPath_AttrEClass(InterfaceClass_refBaseClassPath_AttrEClass interfaceClass_refBaseClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(interfaceClass_refBaseClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_roleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass interfaceIDMapping_roleInterfaceID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(interfaceIDMapping_roleInterfaceID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_systemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass interfaceIDMapping_systemUnitInterfaceID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(interfaceIDMapping_systemUnitInterfaceID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_refBaseSystemUnitPath_AttrEClass(InternalElement_refBaseSystemUnitPath_AttrEClass internalElement_refBaseSystemUnitPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(internalElement_refBaseSystemUnitPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_refPartnerSideA_AttrEClass(InternalLink_refPartnerSideA_AttrEClass internalLink_refPartnerSideA_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink_refPartnerSideA_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(internalLink_refPartnerSideA_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_refPartnerSideB_AttrEClass(InternalLink_refPartnerSideB_AttrEClass internalLink_refPartnerSideB_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink_refPartnerSideB_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(internalLink_refPartnerSideB_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_requiredValue_AttrEClass(NominalScaledType_requiredValue_AttrEClass nominalScaledType_requiredValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nominalScaledType_requiredValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(nominalScaledType_requiredValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_requiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass ordinalScaledType_requiredMaxValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(ordinalScaledType_requiredMaxValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_requiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass ordinalScaledType_requiredValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(ordinalScaledType_requiredValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_requiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass ordinalScaledType_requiredMinValue_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(ordinalScaledType_requiredMinValue_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_correspondingAttributePath_AttrEClass(RefSemantic_correspondingAttributePath_AttrEClass refSemantic_correspondingAttributePath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(refSemantic_correspondingAttributePath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_refBaseClassPath_AttrEClass(RoleClass_refBaseClassPath_AttrEClass roleClass_refBaseClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClass_refBaseClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(roleClass_refBaseClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Calculateable(DateTime_Calculateable dateTime_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableElement(DateTime_CalculateableElement dateTime_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_AttributeEClass(DateTime_AttributeEClass dateTime_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_AttributeEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_AttributeEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_AttributeEClass_validate(dateTime_AttributeEClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Attribute EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_AttributeEClass_validate(DateTime_AttributeEClass dateTime_AttributeEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_AttributeEClass.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Operator(DateTime_Operator dateTime_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Type(DateTime_Type dateTime_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalType(DateTime_FunctionalType dateTime_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableParameter(DateTime_CalculateableParameter dateTime_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_CalculateableParameter_validate(dateTime_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableParameter_validate(DateTime_CalculateableParameter dateTime_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalParameter(DateTime_FunctionalParameter dateTime_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_FunctionalParameter_validate(dateTime_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalParameter_validate(DateTime_FunctionalParameter dateTime_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Argument(DateTime_Argument dateTime_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_PrimitiveArgument(DateTime_PrimitiveArgument dateTime_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_EvaluationOperation_Argument(DateTime_EvaluationOperation_Argument dateTime_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableElementReferenceArgument(DateTime_CalculateableElementReferenceArgument dateTime_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTime_CalculateableElementReferenceArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_CalculateableElementReferenceArgument_validate(dateTime_CalculateableElementReferenceArgument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Date Time Calculateable Element Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_CalculateableElementReferenceArgument_validate(DateTime_CalculateableElementReferenceArgument dateTime_CalculateableElementReferenceArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dateTime_CalculateableElementReferenceArgument.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_ExpressionOperator(DateTime_ExpressionOperator dateTime_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_BitOperator(DateTime_BitOperator dateTime_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_And_BitOperator(DateTime_And_BitOperator dateTime_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Or_BitOperator(DateTime_Or_BitOperator dateTime_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_FunctionalOperator(DateTime_FunctionalOperator dateTime_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_lastWritingDateTime_AttrEClass(SourceDocumentInformation_lastWritingDateTime_AttrEClass sourceDocumentInformation_lastWritingDateTime_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_AttributeEClass_validate(sourceDocumentInformation_lastWritingDateTime_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originID_AttrEClass(SourceDocumentInformation_originID_AttrEClass sourceDocumentInformation_originID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originName_AttrEClass(SourceDocumentInformation_originName_AttrEClass sourceDocumentInformation_originName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originProjectID_AttrEClass(SourceDocumentInformation_originProjectID_AttrEClass sourceDocumentInformation_originProjectID_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originProjectID_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originProjectTitle_AttrEClass(SourceDocumentInformation_originProjectTitle_AttrEClass sourceDocumentInformation_originProjectTitle_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originProjectTitle_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originRelease_AttrEClass(SourceDocumentInformation_originRelease_AttrEClass sourceDocumentInformation_originRelease_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originRelease_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originVendor_AttrEClass(SourceDocumentInformation_originVendor_AttrEClass sourceDocumentInformation_originVendor_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originVendor_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originVendorURL_AttrEClass(SourceDocumentInformation_originVendorURL_AttrEClass sourceDocumentInformation_originVendorURL_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originVendorURL_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_originVersion_AttrEClass(SourceDocumentInformation_originVersion_AttrEClass sourceDocumentInformation_originVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(sourceDocumentInformation_originVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_refRoleClassPath_AttrEClass(SupportedRoleClass_refRoleClassPath_AttrEClass supportedRoleClass_refRoleClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(supportedRoleClass_refRoleClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_refBaseClassPath_AttrEClass(SystemUnitClass_refBaseClassPath_AttrEClass systemUnitClass_refBaseClassPath_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(systemUnitClass_refBaseClassPath_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_requirements_AttrEClass(UnknownType_requirements_AttrEClass unknownType_requirements_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownType_requirements_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownType_requirements_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(unknownType_requirements_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_value_AttrEClass(Copyright_value_AttrEClass copyright_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(copyright_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_changeMode_AttrEClass(Copyright_changeMode_AttrEClass copyright_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(copyright_changeMode_AttrEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_value_AttrEClass(Description_value_AttrEClass description_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(description_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_changeMode_AttrEClass(Description_changeMode_AttrEClass description_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(description_changeMode_AttrEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_revisionDate_AttrEClass(Revision_revisionDate_AttrEClass revision_revisionDate_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_revisionDate_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_revisionDate_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTime_AttributeEClass_validate(revision_revisionDate_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_oldVersion_AttrEClass(Revision_oldVersion_AttrEClass revision_oldVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_oldVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_oldVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_oldVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_newVersion_AttrEClass(Revision_newVersion_AttrEClass revision_newVersion_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_newVersion_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_newVersion_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_newVersion_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_authorName_AttrEClass(Revision_authorName_AttrEClass revision_authorName_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_authorName_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_authorName_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_authorName_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_comment_AttrEClass(Revision_comment_AttrEClass revision_comment_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_comment_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_comment_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(revision_comment_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_value_AttrEClass(Version_value_AttrEClass version_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(version_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_changeMode_AttrEClass(Version_changeMode_AttrEClass version_changeMode_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(version_changeMode_AttrEClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_name_AttrEClass(Element_name_AttrEClass element_name_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element_name_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element_name_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(element_name_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_value_AttrEClass(Element_value_AttrEClass element_value_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element_value_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element_value_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateString_AttributeEClass_validate(element_value_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_elementFeatureMap_AttrEClass(GenericElement_elementFeatureMap_AttrEClass genericElement_elementFeatureMap_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement_elementFeatureMap_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(genericElement_elementFeatureMap_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_attributeFeatureMap_AttrEClass(GenericElement_attributeFeatureMap_AttrEClass genericElement_attributeFeatureMap_AttrEClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateEFeatureMapEntry_AttributeEClass_validate(genericElement_attributeFeatureMap_AttrEClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_OrGroup(Attribute_OrGroup attribute_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attribute_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefSemantic_OrGroup(RefSemantic_OrGroup refSemantic_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refSemantic_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refSemantic_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(refSemantic_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRequirement_OrGroup(AttributeValueRequirement_OrGroup attributeValueRequirement_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueRequirement_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueRequirement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attributeValueRequirement_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScaledType_OrGroup(OrdinalScaledType_OrGroup ordinalScaledType_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScaledType_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(ordinalScaledType_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalScaledType_OrGroup(NominalScaledType_OrGroup nominalScaledType_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nominalScaledType_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nominalScaledType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(nominalScaledType_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownType_OrGroup(UnknownType_OrGroup unknownType_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unknownType_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unknownType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(unknownType_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription_OrGroup(Description_OrGroup description_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(description_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(description_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(description_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_OrGroup(Version_OrGroup version_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(version_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision_OrGroup(Revision_OrGroup revision_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(revision_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(revision_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(revision_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyright_OrGroup(Copyright_OrGroup copyright_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(copyright_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(copyright_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(copyright_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalInformation_OrGroup(AdditionalInformation_OrGroup additionalInformation_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(additionalInformation_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(additionalInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(additionalInformation_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentInformation_OrGroup(SourceDocumentInformation_OrGroup sourceDocumentInformation_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDocumentInformation_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDocumentInformation_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(sourceDocumentInformation_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType_OrGroup(ExternalReferenceType_OrGroup externalReferenceType_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalReferenceType_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalReferenceType_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(externalReferenceType_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceHierarchy_OrGroup(InstanceHierarchy_OrGroup instanceHierarchy_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceHierarchy_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceHierarchy_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(instanceHierarchy_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClassLib_OrGroup(InterfaceClassLib_OrGroup interfaceClassLib_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClassLib_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(interfaceClassLib_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClassLib_OrGroup(RoleClassLib_OrGroup roleClassLib_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClassLib_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(roleClassLib_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClassLib_OrGroup(SystemUnitClassLib_OrGroup systemUnitClassLib_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClassLib_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClassLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(systemUnitClassLib_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeLib_OrGroup(AttributeLib_OrGroup attributeLib_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeLib_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeLib_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attributeLib_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAEXFile_OrGroup(CAEXFile_OrGroup caexFile_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(caexFile_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caexFile_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(caexFile_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceClass_OrGroup(InterfaceClass_OrGroup interfaceClass_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceClass_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(interfaceClass_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalElement_OrGroup(InternalElement_OrGroup internalElement_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalElement_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(internalElement_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalInterface_OrGroup(ExternalInterface_OrGroup externalInterface_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalInterface_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalInterface_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(externalInterface_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleRequirements_OrGroup(RoleRequirements_OrGroup roleRequirements_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleRequirements_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleRequirements_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(roleRequirements_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitClass_OrGroup(SystemUnitClass_OrGroup systemUnitClass_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemUnitClass_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUnitClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(systemUnitClass_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeNameMapping_OrGroup(AttributeNameMapping_OrGroup attributeNameMapping_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeNameMapping_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeNameMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(attributeNameMapping_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceIDMapping_OrGroup(InterfaceIDMapping_OrGroup interfaceIDMapping_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceIDMapping_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceIDMapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(interfaceIDMapping_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleClass_OrGroup(RoleClass_OrGroup roleClass_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleClass_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(roleClass_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_OrGroup(Mapping_OrGroup mapping_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(mapping_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedRoleClass_OrGroup(SupportedRoleClass_OrGroup supportedRoleClass_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportedRoleClass_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportedRoleClass_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(supportedRoleClass_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalLink_OrGroup(InternalLink_OrGroup internalLink_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalLink_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalLink_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(internalLink_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericElement_OrGroup(GenericElement_OrGroup genericElement_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericElement_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericElement_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(genericElement_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericAttribute_OrGroup(GenericAttribute_OrGroup genericAttribute_OrGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericAttribute_OrGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericAttribute_OrGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrGroup_validate(genericAttribute_OrGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Operator(Object_Operator object_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Type(Object_Type object_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalType(Object_FunctionalType object_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableParameter(Object_CalculateableParameter object_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(object_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(object_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateObject_CalculateableParameter_validate(object_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Object Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableParameter_validate(Object_CalculateableParameter object_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return object_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalParameter(Object_FunctionalParameter object_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(object_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(object_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateObject_FunctionalParameter_validate(object_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Object Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalParameter_validate(Object_FunctionalParameter object_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return object_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Calculateable(Object_Calculateable object_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CalculateableElement(Object_CalculateableElement object_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Argument(Object_Argument object_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_PrimitiveArgument(Object_PrimitiveArgument object_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_EvaluationOperation_Argument(Object_EvaluationOperation_Argument object_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_ExpressionOperator(Object_ExpressionOperator object_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_BitOperator(Object_BitOperator object_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_And_BitOperator(Object_And_BitOperator object_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Or_BitOperator(Object_Or_BitOperator object_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_FunctionalOperator(Object_FunctionalOperator object_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Operator(Boolean_Operator boolean_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Type(Boolean_Type boolean_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalType(Boolean_FunctionalType boolean_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableParameter(Boolean_CalculateableParameter boolean_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolean_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateBoolean_CalculateableParameter_validate(boolean_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Boolean Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableParameter_validate(Boolean_CalculateableParameter boolean_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return boolean_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalParameter(Boolean_FunctionalParameter boolean_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolean_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boolean_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateBoolean_FunctionalParameter_validate(boolean_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Boolean Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalParameter_validate(Boolean_FunctionalParameter boolean_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return boolean_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Calculateable(Boolean_Calculateable boolean_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_CalculateableElement(Boolean_CalculateableElement boolean_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Argument(Boolean_Argument boolean_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_PrimitiveArgument(Boolean_PrimitiveArgument boolean_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_EvaluationOperation_Argument(Boolean_EvaluationOperation_Argument boolean_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_ExpressionOperator(Boolean_ExpressionOperator boolean_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_BitOperator(Boolean_BitOperator boolean_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_And_BitOperator(Boolean_And_BitOperator boolean_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Or_BitOperator(Boolean_Or_BitOperator boolean_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Original_FunctionalOperator(Boolean_Original_FunctionalOperator boolean_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateequals_FunctionalOperator(equals_FunctionalOperator equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoString_FunctionalOperator(toString_FunctionalOperator toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Operator(CharSequence_Operator charSequence_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Type(CharSequence_Type charSequence_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalType(CharSequence_FunctionalType charSequence_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableParameter(CharSequence_CalculateableParameter charSequence_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(charSequence_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(charSequence_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharSequence_CalculateableParameter_validate(charSequence_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Char Sequence Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableParameter_validate(CharSequence_CalculateableParameter charSequence_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return charSequence_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalParameter(CharSequence_FunctionalParameter charSequence_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(charSequence_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(charSequence_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharSequence_FunctionalParameter_validate(charSequence_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Char Sequence Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalParameter_validate(CharSequence_FunctionalParameter charSequence_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return charSequence_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Calculateable(CharSequence_Calculateable charSequence_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_CalculateableElement(CharSequence_CalculateableElement charSequence_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Argument(CharSequence_Argument charSequence_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_PrimitiveArgument(CharSequence_PrimitiveArgument charSequence_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_EvaluationOperation_Argument(CharSequence_EvaluationOperation_Argument charSequence_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_ExpressionOperator(CharSequence_ExpressionOperator charSequence_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_BitOperator(CharSequence_BitOperator charSequence_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_And_BitOperator(CharSequence_And_BitOperator charSequence_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Or_BitOperator(CharSequence_Or_BitOperator charSequence_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_Original_FunctionalOperator(CharSequence_Original_FunctionalOperator charSequence_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Operator(Integer_Operator integer_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Type(Integer_Type integer_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalType(Integer_FunctionalType integer_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableParameter(Integer_CalculateableParameter integer_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_CalculateableParameter_validate(integer_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_CalculateableParameter_validate(Integer_CalculateableParameter integer_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalParameter(Integer_FunctionalParameter integer_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integer_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integer_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteger_FunctionalParameter_validate(integer_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Integer Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalParameter_validate(Integer_FunctionalParameter integer_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integer_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Argument(Integer_Argument integer_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_PrimitiveArgument(Integer_PrimitiveArgument integer_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_EvaluationOperation_Argument(Integer_EvaluationOperation_Argument integer_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_ExpressionOperator(Integer_ExpressionOperator integer_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_BitOperator(Integer_BitOperator integer_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_And_BitOperator(Integer_And_BitOperator integer_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Or_BitOperator(Integer_Or_BitOperator integer_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Original_FunctionalOperator(Integer_Original_FunctionalOperator integer_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelength_FunctionalOperator(length_FunctionalOperator length_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(length_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Operator(Character_Operator character_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Type(Character_Type character_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalType(Character_FunctionalType character_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableParameter(Character_CalculateableParameter character_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(character_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(character_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_CalculateableParameter_validate(character_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Character Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableParameter_validate(Character_CalculateableParameter character_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return character_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalParameter(Character_FunctionalParameter character_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(character_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(character_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_FunctionalParameter_validate(character_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Character Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalParameter_validate(Character_FunctionalParameter character_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return character_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Calculateable(Character_Calculateable character_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_CalculateableElement(Character_CalculateableElement character_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Argument(Character_Argument character_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_PrimitiveArgument(Character_PrimitiveArgument character_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_EvaluationOperation_Argument(Character_EvaluationOperation_Argument character_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_ExpressionOperator(Character_ExpressionOperator character_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_BitOperator(Character_BitOperator character_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_And_BitOperator(Character_And_BitOperator character_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Or_BitOperator(Character_Or_BitOperator character_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_Original_FunctionalOperator(Character_Original_FunctionalOperator character_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecharAt_FunctionalOperator(charAt_FunctionalOperator charAt_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charAt_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecontains_FunctionalOperator(contains_FunctionalOperator contains_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contains_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesubstring_FunctionalOperator(substring_FunctionalOperator substring_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substring_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateconcat_FunctionalOperator(concat_FunctionalOperator concat_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concat_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateendsWith_FunctionalOperator(endsWith_FunctionalOperator endsWith_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endsWith_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateequalsIgnoreCase_FunctionalOperator(equalsIgnoreCase_FunctionalOperator equalsIgnoreCase_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equalsIgnoreCase_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateindexOfString_FunctionalOperator(indexOfString_FunctionalOperator indexOfString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexOfString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateisEmpty_FunctionalOperator(isEmpty_FunctionalOperator isEmpty_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isEmpty_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Operator(Number_Operator number_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Type(Number_Type number_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalType(Number_FunctionalType number_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableParameter(Number_CalculateableParameter number_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(number_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(number_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_CalculateableParameter_validate(number_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Number Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableParameter_validate(Number_CalculateableParameter number_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return number_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalParameter(Number_FunctionalParameter number_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(number_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(number_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_FunctionalParameter_validate(number_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Number Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalParameter_validate(Number_FunctionalParameter number_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return number_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Calculateable(Number_Calculateable number_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_CalculateableElement(Number_CalculateableElement number_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Argument(Number_Argument number_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_PrimitiveArgument(Number_PrimitiveArgument number_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_EvaluationOperation_Argument(Number_EvaluationOperation_Argument number_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_ExpressionOperator(Number_ExpressionOperator number_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_BitOperator(Number_BitOperator number_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_And_BitOperator(Number_And_BitOperator number_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Or_BitOperator(Number_Or_BitOperator number_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Original_FunctionalOperator(Number_Original_FunctionalOperator number_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validategreaterThan_FunctionalOperator(greaterThan_FunctionalOperator greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validategreaterEquals_FunctionalOperator(greaterEquals_FunctionalOperator greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesmallerThan_FunctionalOperator(smallerThan_FunctionalOperator smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesmallerEquals_FunctionalOperator(smallerEquals_FunctionalOperator smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateparseBoolean_FunctionalOperator(parseBoolean_FunctionalOperator parseBoolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parseBoolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecompareTo_FunctionalOperator(compareTo_FunctionalOperator compareTo_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareTo_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_equals_FunctionalOperator(Object_Number_equals_FunctionalOperator object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Number_toString_FunctionalOperator(Object_Number_toString_FunctionalOperator object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_FunctionalOperator(Number_FunctionalOperator number_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Number_FunctionalOperator(InheritedFrom_Object_to_Number_FunctionalOperator inheritedFrom_Object_to_Number_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Number_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_greaterThan_FunctionalOperator(Number_Integer_greaterThan_FunctionalOperator number_Integer_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_greaterEquals_FunctionalOperator(Number_Integer_greaterEquals_FunctionalOperator number_Integer_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_smallerThan_FunctionalOperator(Number_Integer_smallerThan_FunctionalOperator number_Integer_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_smallerEquals_FunctionalOperator(Number_Integer_smallerEquals_FunctionalOperator number_Integer_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_equals_FunctionalOperator(Number_Integer_Object_Number_equals_FunctionalOperator number_Integer_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Integer_Object_Number_toString_FunctionalOperator(Number_Integer_Object_Number_toString_FunctionalOperator number_Integer_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Integer_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_FunctionalOperator(Integer_FunctionalOperator integer_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Integer_FunctionalOperator(InheritedFrom_Number_to_Integer_FunctionalOperator inheritedFrom_Number_to_Integer_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Integer_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_Calculateable(Long_Calculateable long_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_CalculateableElement(Long_CalculateableElement long_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_Operator(Long_Operator long_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_Type(Long_Type long_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_FunctionalType(Long_FunctionalType long_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_CalculateableParameter(Long_CalculateableParameter long_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(long_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(long_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateLong_CalculateableParameter_validate(long_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Long Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_CalculateableParameter_validate(Long_CalculateableParameter long_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return long_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_FunctionalParameter(Long_FunctionalParameter long_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(long_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(long_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateLong_FunctionalParameter_validate(long_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Long Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_FunctionalParameter_validate(Long_FunctionalParameter long_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return long_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_Argument(Long_Argument long_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_PrimitiveArgument(Long_PrimitiveArgument long_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_EvaluationOperation_Argument(Long_EvaluationOperation_Argument long_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_ExpressionOperator(Long_ExpressionOperator long_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_BitOperator(Long_BitOperator long_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_And_BitOperator(Long_And_BitOperator long_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_Or_BitOperator(Long_Or_BitOperator long_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_Original_FunctionalOperator(Long_Original_FunctionalOperator long_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Long_greaterThan_FunctionalOperator(Number_Long_greaterThan_FunctionalOperator number_Long_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Long_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Long_greaterEquals_FunctionalOperator(Number_Long_greaterEquals_FunctionalOperator number_Long_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Long_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Long_smallerThan_FunctionalOperator(Number_Long_smallerThan_FunctionalOperator number_Long_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Long_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Long_smallerEquals_FunctionalOperator(Number_Long_smallerEquals_FunctionalOperator number_Long_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Long_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Long_Object_Number_equals_FunctionalOperator(Number_Long_Object_Number_equals_FunctionalOperator number_Long_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Long_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Long_Object_Number_toString_FunctionalOperator(Number_Long_Object_Number_toString_FunctionalOperator number_Long_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Long_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong_FunctionalOperator(Long_FunctionalOperator long_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Long_FunctionalOperator(InheritedFrom_Number_to_Long_FunctionalOperator inheritedFrom_Number_to_Long_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Long_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Calculateable(Double_Calculateable double_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableElement(Double_CalculateableElement double_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Operator(Double_Operator double_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Type(Double_Type double_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalType(Double_FunctionalType double_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableParameter(Double_CalculateableParameter double_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(double_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(double_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDouble_CalculateableParameter_validate(double_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Double Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_CalculateableParameter_validate(Double_CalculateableParameter double_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return double_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalParameter(Double_FunctionalParameter double_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(double_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(double_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDouble_FunctionalParameter_validate(double_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Double Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalParameter_validate(Double_FunctionalParameter double_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return double_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Argument(Double_Argument double_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_PrimitiveArgument(Double_PrimitiveArgument double_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_EvaluationOperation_Argument(Double_EvaluationOperation_Argument double_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_ExpressionOperator(Double_ExpressionOperator double_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_BitOperator(Double_BitOperator double_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_And_BitOperator(Double_And_BitOperator double_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Or_BitOperator(Double_Or_BitOperator double_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_Original_FunctionalOperator(Double_Original_FunctionalOperator double_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_greaterThan_FunctionalOperator(Number_Double_greaterThan_FunctionalOperator number_Double_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_greaterEquals_FunctionalOperator(Number_Double_greaterEquals_FunctionalOperator number_Double_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_smallerThan_FunctionalOperator(Number_Double_smallerThan_FunctionalOperator number_Double_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_smallerEquals_FunctionalOperator(Number_Double_smallerEquals_FunctionalOperator number_Double_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_equals_FunctionalOperator(Number_Double_Object_Number_equals_FunctionalOperator number_Double_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Double_Object_Number_toString_FunctionalOperator(Number_Double_Object_Number_toString_FunctionalOperator number_Double_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Double_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble_FunctionalOperator(Double_FunctionalOperator double_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(double_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Double_FunctionalOperator(InheritedFrom_Number_to_Double_FunctionalOperator inheritedFrom_Number_to_Double_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Double_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_Calculateable(Float_Calculateable float_Calculateable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_Calculateable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_CalculateableElement(Float_CalculateableElement float_CalculateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_CalculateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_Operator(Float_Operator float_Operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_Operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_Type(Float_Type float_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_FunctionalType(Float_FunctionalType float_FunctionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_FunctionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_CalculateableParameter(Float_CalculateableParameter float_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(float_CalculateableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(float_CalculateableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateFloat_CalculateableParameter_validate(float_CalculateableParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Float Calculateable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_CalculateableParameter_validate(Float_CalculateableParameter float_CalculateableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return float_CalculateableParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_FunctionalParameter(Float_FunctionalParameter float_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(float_FunctionalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(float_FunctionalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateFloat_FunctionalParameter_validate(float_FunctionalParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Float Functional Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_FunctionalParameter_validate(Float_FunctionalParameter float_FunctionalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return float_FunctionalParameter.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_Argument(Float_Argument float_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_PrimitiveArgument(Float_PrimitiveArgument float_PrimitiveArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_PrimitiveArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_EvaluationOperation_Argument(Float_EvaluationOperation_Argument float_EvaluationOperation_Argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_EvaluationOperation_Argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_ExpressionOperator(Float_ExpressionOperator float_ExpressionOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_ExpressionOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_BitOperator(Float_BitOperator float_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_And_BitOperator(Float_And_BitOperator float_And_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_And_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_Or_BitOperator(Float_Or_BitOperator float_Or_BitOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_Or_BitOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_Original_FunctionalOperator(Float_Original_FunctionalOperator float_Original_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_Original_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Float_greaterThan_FunctionalOperator(Number_Float_greaterThan_FunctionalOperator number_Float_greaterThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Float_greaterThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Float_greaterEquals_FunctionalOperator(Number_Float_greaterEquals_FunctionalOperator number_Float_greaterEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Float_greaterEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Float_smallerThan_FunctionalOperator(Number_Float_smallerThan_FunctionalOperator number_Float_smallerThan_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Float_smallerThan_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Float_smallerEquals_FunctionalOperator(Number_Float_smallerEquals_FunctionalOperator number_Float_smallerEquals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Float_smallerEquals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Float_Object_Number_equals_FunctionalOperator(Number_Float_Object_Number_equals_FunctionalOperator number_Float_Object_Number_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Float_Object_Number_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Float_Object_Number_toString_FunctionalOperator(Number_Float_Object_Number_toString_FunctionalOperator number_Float_Object_Number_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number_Float_Object_Number_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat_FunctionalOperator(Float_FunctionalOperator float_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Number_to_Float_FunctionalOperator(InheritedFrom_Number_to_Float_FunctionalOperator inheritedFrom_Number_to_Float_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Number_to_Float_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_equals_FunctionalOperator(Object_CharSequence_equals_FunctionalOperator object_CharSequence_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_CharSequence_toString_FunctionalOperator(Object_CharSequence_toString_FunctionalOperator object_CharSequence_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_CharSequence_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_FunctionalOperator(CharSequence_FunctionalOperator charSequence_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_CharSequence_FunctionalOperator(InheritedFrom_Object_to_CharSequence_FunctionalOperator inheritedFrom_Object_to_CharSequence_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_CharSequence_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_equals_FunctionalOperator(Object_Character_equals_FunctionalOperator object_Character_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Character_toString_FunctionalOperator(Object_Character_toString_FunctionalOperator object_Character_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Character_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_FunctionalOperator(Character_FunctionalOperator character_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Character_FunctionalOperator(InheritedFrom_Object_to_Character_FunctionalOperator inheritedFrom_Object_to_Character_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Character_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_equals_FunctionalOperator(Object_Boolean_equals_FunctionalOperator object_Boolean_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject_Boolean_toString_FunctionalOperator(Object_Boolean_toString_FunctionalOperator object_Boolean_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object_Boolean_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_FunctionalOperator(Boolean_FunctionalOperator boolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_Object_to_Boolean_FunctionalOperator(InheritedFrom_Object_to_Boolean_FunctionalOperator inheritedFrom_Object_to_Boolean_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_Object_to_Boolean_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_length_FunctionalOperator(CharSequence_String_length_FunctionalOperator charSequence_String_length_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_length_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_equals_FunctionalOperator(CharSequence_String_Object_CharSequence_equals_FunctionalOperator charSequence_String_Object_CharSequence_equals_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_equals_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence_String_Object_CharSequence_toString_FunctionalOperator(CharSequence_String_Object_CharSequence_toString_FunctionalOperator charSequence_String_Object_CharSequence_toString_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charSequence_String_Object_CharSequence_toString_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString_FunctionalOperator(String_FunctionalOperator string_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritedFrom_CharSequence_to_String_FunctionalOperator(InheritedFrom_CharSequence_to_String_FunctionalOperator inheritedFrom_CharSequence_to_String_FunctionalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inheritedFrom_CharSequence_to_String_FunctionalOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount_AggregationOperator(Count_AggregationOperator count_AggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count_AggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSum_AggregationOperator(Sum_AggregationOperator sum_AggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sum_AggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMin_AggregationOperator(Min_AggregationOperator min_AggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(min_AggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMax_AggregationOperator(Max_AggregationOperator max_AggregationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(max_AggregationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerParseInt_ClassOperator(IntegerParseInt_ClassOperator integerParseInt_ClassOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerParseInt_ClassOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMode(ChangeMode changeMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDataType(String attributeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeModeObject(Enumerator changeModeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharSequence(CharSequence charSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(Character character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(Number number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong(Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QmmValidator
