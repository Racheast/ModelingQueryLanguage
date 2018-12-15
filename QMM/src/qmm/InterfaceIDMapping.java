/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface ID Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.InterfaceIDMapping#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link qmm.InterfaceIDMapping#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 *   <li>{@link qmm.InterfaceIDMapping#getRoleInterfaceID_AttrEClass <em>Role Interface ID Attr EClass</em>}</li>
 *   <li>{@link qmm.InterfaceIDMapping#getSystemUnitInterfaceID_AttrEClass <em>System Unit Interface ID Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInterfaceIDMapping()
 * @model
 * @generated
 */
public interface InterfaceIDMapping extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>Role Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalInterface_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceIDMapping_RoleInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface_OrGroup> getRoleInterface();

	/**
	 * Returns the value of the '<em><b>System Unit Interface</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.ExternalInterface_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceIDMapping_SystemUnitInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface_OrGroup> getSystemUnitInterface();

	/**
	 * Returns the value of the '<em><b>Role Interface ID Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface ID Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface ID Attr EClass</em>' containment reference.
	 * @see #setRoleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass)
	 * @see qmm.QmmPackage#getInterfaceIDMapping_RoleInterfaceID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceIDMapping_roleInterfaceID_AttrEClass getRoleInterfaceID_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.InterfaceIDMapping#getRoleInterfaceID_AttrEClass <em>Role Interface ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Interface ID Attr EClass</em>' containment reference.
	 * @see #getRoleInterfaceID_AttrEClass()
	 * @generated
	 */
	void setRoleInterfaceID_AttrEClass(InterfaceIDMapping_roleInterfaceID_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>System Unit Interface ID Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface ID Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface ID Attr EClass</em>' containment reference.
	 * @see #setSystemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass)
	 * @see qmm.QmmPackage#getInterfaceIDMapping_SystemUnitInterfaceID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceIDMapping_systemUnitInterfaceID_AttrEClass getSystemUnitInterfaceID_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.InterfaceIDMapping#getSystemUnitInterfaceID_AttrEClass <em>System Unit Interface ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Interface ID Attr EClass</em>' containment reference.
	 * @see #getSystemUnitInterfaceID_AttrEClass()
	 * @generated
	 */
	void setSystemUnitInterfaceID_AttrEClass(InterfaceIDMapping_systemUnitInterfaceID_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int roleInterface_upperBound = 1;\nint nr_nonTransitive_roleInterface = 0;\nif(this.roleInterface != null){\n\t\tfor(qmm.OrGroup og : this.roleInterface) if(!og.isTransitive()) nr_nonTransitive_roleInterface++;\n}\nif(nr_nonTransitive_roleInterface > roleInterface_upperBound && roleInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_roleInterface + \" non-transitive roleInterface. Only \" + roleInterface_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int systemUnitInterface_upperBound = 1;\nint nr_nonTransitive_systemUnitInterface = 0;\nif(this.systemUnitInterface != null){\n\t\tfor(qmm.OrGroup og : this.systemUnitInterface) if(!og.isTransitive()) nr_nonTransitive_systemUnitInterface++;\n}\nif(nr_nonTransitive_systemUnitInterface > systemUnitInterface_upperBound && systemUnitInterface_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_systemUnitInterface + \" non-transitive systemUnitInterface. Only \" + systemUnitInterface_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // InterfaceIDMapping
