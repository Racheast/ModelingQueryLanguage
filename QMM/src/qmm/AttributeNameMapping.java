/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.AttributeNameMapping#getRoleAttribute <em>Role Attribute</em>}</li>
 *   <li>{@link qmm.AttributeNameMapping#getSystemUnitAttribute <em>System Unit Attribute</em>}</li>
 *   <li>{@link qmm.AttributeNameMapping#getRoleAttributeName_AttrEClass <em>Role Attribute Name Attr EClass</em>}</li>
 *   <li>{@link qmm.AttributeNameMapping#getSystemUnitAttributeName_AttrEClass <em>System Unit Attribute Name Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getAttributeNameMapping()
 * @model
 * @generated
 */
public interface AttributeNameMapping extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Role Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeNameMapping_RoleAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_OrGroup> getRoleAttribute();

	/**
	 * Returns the value of the '<em><b>System Unit Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Attribute_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeNameMapping_SystemUnitAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_OrGroup> getSystemUnitAttribute();

	/**
	 * Returns the value of the '<em><b>Role Attribute Name Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute Name Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute Name Attr EClass</em>' containment reference.
	 * @see #setRoleAttributeName_AttrEClass(AttributeNameMapping_roleAttributeName_AttrEClass)
	 * @see qmm.QmmPackage#getAttributeNameMapping_RoleAttributeName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	AttributeNameMapping_roleAttributeName_AttrEClass getRoleAttributeName_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.AttributeNameMapping#getRoleAttributeName_AttrEClass <em>Role Attribute Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Attribute Name Attr EClass</em>' containment reference.
	 * @see #getRoleAttributeName_AttrEClass()
	 * @generated
	 */
	void setRoleAttributeName_AttrEClass(AttributeNameMapping_roleAttributeName_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>System Unit Attribute Name Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute Name Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute Name Attr EClass</em>' containment reference.
	 * @see #setSystemUnitAttributeName_AttrEClass(AttributeNameMapping_systemUnitAttributeName_AttrEClass)
	 * @see qmm.QmmPackage#getAttributeNameMapping_SystemUnitAttributeName_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	AttributeNameMapping_systemUnitAttributeName_AttrEClass getSystemUnitAttributeName_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.AttributeNameMapping#getSystemUnitAttributeName_AttrEClass <em>System Unit Attribute Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Attribute Name Attr EClass</em>' containment reference.
	 * @see #getSystemUnitAttributeName_AttrEClass()
	 * @generated
	 */
	void setSystemUnitAttributeName_AttrEClass(AttributeNameMapping_systemUnitAttributeName_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int roleAttribute_upperBound = 1;\nint nr_nonTransitive_roleAttribute = 0;\nif(this.roleAttribute != null){\n\t\tfor(qmm.OrGroup og : this.roleAttribute) if(!og.isTransitive()) nr_nonTransitive_roleAttribute++;\n}\nif(nr_nonTransitive_roleAttribute > roleAttribute_upperBound && roleAttribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_roleAttribute + \" non-transitive roleAttribute. Only \" + roleAttribute_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int systemUnitAttribute_upperBound = 1;\nint nr_nonTransitive_systemUnitAttribute = 0;\nif(this.systemUnitAttribute != null){\n\t\tfor(qmm.OrGroup og : this.systemUnitAttribute) if(!og.isTransitive()) nr_nonTransitive_systemUnitAttribute++;\n}\nif(nr_nonTransitive_systemUnitAttribute > systemUnitAttribute_upperBound && systemUnitAttribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_systemUnitAttribute + \" non-transitive systemUnitAttribute. Only \" + systemUnitAttribute_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // AttributeNameMapping
