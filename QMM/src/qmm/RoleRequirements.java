/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.RoleRequirements#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.RoleRequirements#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link qmm.RoleRequirements#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link qmm.RoleRequirements#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getRoleRequirements()
 * @model
 * @generated
 */
public interface RoleRequirements extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see qmm.QmmPackage#getRoleRequirements_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_OrGroup> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceClass_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see qmm.QmmPackage#getRoleRequirements_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass_OrGroup> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Mapping_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference list.
	 * @see qmm.QmmPackage#getRoleRequirements_MappingObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping_OrGroup> getMappingObject();

	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.RoleClass_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getRoleRequirements_RoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleClass_OrGroup> getRoleClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int attribute_upperBound = -1;\nint nr_nonTransitive_attribute = 0;\nif(this.attribute != null){\n\t\tfor(qmm.OrGroup og : this.attribute) if(!og.isTransitive()) nr_nonTransitive_attribute++;\n}\nif(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_attribute + \" non-transitive attribute. Only \" + attribute_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int externalInterface_upperBound = -1;\nint nr_nonTransitive_externalInterface = 0;\nif(this.externalInterface != null){\n\t\tfor(qmm.OrGroup og : this.externalInterface) if(!og.isTransitive()) nr_nonTransitive_externalInterface++;\n}\nif(nr_nonTransitive_externalInterface > externalInterface_upperBound && externalInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_externalInterface + \" non-transitive externalInterface. Only \" + externalInterface_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int mappingObject_upperBound = 1;\nint nr_nonTransitive_mappingObject = 0;\nif(this.mappingObject != null){\n\t\tfor(qmm.OrGroup og : this.mappingObject) if(!og.isTransitive()) nr_nonTransitive_mappingObject++;\n}\nif(nr_nonTransitive_mappingObject > mappingObject_upperBound && mappingObject_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_mappingObject + \" non-transitive mappingObject. Only \" + mappingObject_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int roleClass_upperBound = 1;\nint nr_nonTransitive_roleClass = 0;\nif(this.roleClass != null){\n\t\tfor(qmm.OrGroup og : this.roleClass) if(!og.isTransitive()) nr_nonTransitive_roleClass++;\n}\nif(nr_nonTransitive_roleClass > roleClass_upperBound && roleClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_roleClass + \" non-transitive roleClass. Only \" + roleClass_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // RoleRequirements
