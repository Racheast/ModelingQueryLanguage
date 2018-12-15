/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.CAEXFile#getSourceDocumentInformation <em>Source Document Information</em>}</li>
 *   <li>{@link qmm.CAEXFile#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link qmm.CAEXFile#getInstanceHierarchy <em>Instance Hierarchy</em>}</li>
 *   <li>{@link qmm.CAEXFile#getInterfaceClassLib <em>Interface Class Lib</em>}</li>
 *   <li>{@link qmm.CAEXFile#getRoleClassLib <em>Role Class Lib</em>}</li>
 *   <li>{@link qmm.CAEXFile#getSystemUnitClassLib <em>System Unit Class Lib</em>}</li>
 *   <li>{@link qmm.CAEXFile#getAttributeTypeLib <em>Attribute Type Lib</em>}</li>
 *   <li>{@link qmm.CAEXFile#getSuperiorStandardVersion_AttrEClass <em>Superior Standard Version Attr EClass</em>}</li>
 *   <li>{@link qmm.CAEXFile#getFileName_AttrEClass <em>File Name Attr EClass</em>}</li>
 *   <li>{@link qmm.CAEXFile#getSchemaVersion_AttrEClass <em>Schema Version Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCAEXFile()
 * @model
 * @generated
 */
public interface CAEXFile extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Source Document Information</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SourceDocumentInformation_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Document Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Document Information</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_SourceDocumentInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceDocumentInformation_OrGroup> getSourceDocumentInformation();

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalReferenceType_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_ExternalReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalReferenceType_OrGroup> getExternalReference();

	/**
	 * Returns the value of the '<em><b>Instance Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InstanceHierarchy_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Hierarchy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Hierarchy</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_InstanceHierarchy()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceHierarchy_OrGroup> getInstanceHierarchy();

	/**
	 * Returns the value of the '<em><b>Interface Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceClassLib_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class Lib</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_InterfaceClassLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClassLib_OrGroup> getInterfaceClassLib();

	/**
	 * Returns the value of the '<em><b>Role Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.RoleClassLib_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class Lib</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_RoleClassLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleClassLib_OrGroup> getRoleClassLib();

	/**
	 * Returns the value of the '<em><b>System Unit Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.SystemUnitClassLib_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Class Lib</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_SystemUnitClassLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClassLib_OrGroup> getSystemUnitClassLib();

	/**
	 * Returns the value of the '<em><b>Attribute Type Lib</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AttributeLib_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type Lib</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_AttributeTypeLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeLib_OrGroup> getAttributeTypeLib();

	/**
	 * Returns the value of the '<em><b>Superior Standard Version Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.CAEXFile_superiorStandardVersion_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superior Standard Version Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superior Standard Version Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXFile_SuperiorStandardVersion_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<CAEXFile_superiorStandardVersion_AttrEClass> getSuperiorStandardVersion_AttrEClass();

	/**
	 * Returns the value of the '<em><b>File Name Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name Attr EClass</em>' containment reference.
	 * @see #setFileName_AttrEClass(CAEXFile_fileName_AttrEClass)
	 * @see qmm.QmmPackage#getCAEXFile_FileName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	CAEXFile_fileName_AttrEClass getFileName_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.CAEXFile#getFileName_AttrEClass <em>File Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name Attr EClass</em>' containment reference.
	 * @see #getFileName_AttrEClass()
	 * @generated
	 */
	void setFileName_AttrEClass(CAEXFile_fileName_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Schema Version Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version Attr EClass</em>' containment reference.
	 * @see #setSchemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass)
	 * @see qmm.QmmPackage#getCAEXFile_SchemaVersion_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	CAEXFile_schemaVersion_AttrEClass getSchemaVersion_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.CAEXFile#getSchemaVersion_AttrEClass <em>Schema Version Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version Attr EClass</em>' containment reference.
	 * @see #getSchemaVersion_AttrEClass()
	 * @generated
	 */
	void setSchemaVersion_AttrEClass(CAEXFile_schemaVersion_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int sourceDocumentInformation_upperBound = -1;\nint nr_nonTransitive_sourceDocumentInformation = 0;\nif(this.sourceDocumentInformation != null){\n\t\tfor(qmm.OrGroup og : this.sourceDocumentInformation) if(!og.isTransitive()) nr_nonTransitive_sourceDocumentInformation++;\n}\nif(nr_nonTransitive_sourceDocumentInformation > sourceDocumentInformation_upperBound && sourceDocumentInformation_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_sourceDocumentInformation + \" non-transitive sourceDocumentInformation. Only \" + sourceDocumentInformation_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int externalReference_upperBound = -1;\nint nr_nonTransitive_externalReference = 0;\nif(this.externalReference != null){\n\t\tfor(qmm.OrGroup og : this.externalReference) if(!og.isTransitive()) nr_nonTransitive_externalReference++;\n}\nif(nr_nonTransitive_externalReference > externalReference_upperBound && externalReference_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_externalReference + \" non-transitive externalReference. Only \" + externalReference_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int instanceHierarchy_upperBound = -1;\nint nr_nonTransitive_instanceHierarchy = 0;\nif(this.instanceHierarchy != null){\n\t\tfor(qmm.OrGroup og : this.instanceHierarchy) if(!og.isTransitive()) nr_nonTransitive_instanceHierarchy++;\n}\nif(nr_nonTransitive_instanceHierarchy > instanceHierarchy_upperBound && instanceHierarchy_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_instanceHierarchy + \" non-transitive instanceHierarchy. Only \" + instanceHierarchy_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int interfaceClassLib_upperBound = -1;\nint nr_nonTransitive_interfaceClassLib = 0;\nif(this.interfaceClassLib != null){\n\t\tfor(qmm.OrGroup og : this.interfaceClassLib) if(!og.isTransitive()) nr_nonTransitive_interfaceClassLib++;\n}\nif(nr_nonTransitive_interfaceClassLib > interfaceClassLib_upperBound && interfaceClassLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_interfaceClassLib + \" non-transitive interfaceClassLib. Only \" + interfaceClassLib_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int roleClassLib_upperBound = -1;\nint nr_nonTransitive_roleClassLib = 0;\nif(this.roleClassLib != null){\n\t\tfor(qmm.OrGroup og : this.roleClassLib) if(!og.isTransitive()) nr_nonTransitive_roleClassLib++;\n}\nif(nr_nonTransitive_roleClassLib > roleClassLib_upperBound && roleClassLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_roleClassLib + \" non-transitive roleClassLib. Only \" + roleClassLib_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int systemUnitClassLib_upperBound = -1;\nint nr_nonTransitive_systemUnitClassLib = 0;\nif(this.systemUnitClassLib != null){\n\t\tfor(qmm.OrGroup og : this.systemUnitClassLib) if(!og.isTransitive()) nr_nonTransitive_systemUnitClassLib++;\n}\nif(nr_nonTransitive_systemUnitClassLib > systemUnitClassLib_upperBound && systemUnitClassLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_systemUnitClassLib + \" non-transitive systemUnitClassLib. Only \" + systemUnitClassLib_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int attributeTypeLib_upperBound = -1;\nint nr_nonTransitive_attributeTypeLib = 0;\nif(this.attributeTypeLib != null){\n\t\tfor(qmm.OrGroup og : this.attributeTypeLib) if(!og.isTransitive()) nr_nonTransitive_attributeTypeLib++;\n}\nif(nr_nonTransitive_attributeTypeLib > attributeTypeLib_upperBound && attributeTypeLib_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_attributeTypeLib + \" non-transitive attributeTypeLib. Only \" + attributeTypeLib_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // CAEXFile
