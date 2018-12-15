/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.InterfaceClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qmm.InterfaceClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link qmm.InterfaceClass#getInterfaceClass <em>Interface Class</em>}</li>
 *   <li>{@link qmm.InterfaceClass#getRefBaseClassPath_AttrEClass <em>Ref Base Class Path Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getInterfaceClass()
 * @model
 * @generated
 */
public interface InterfaceClass extends CAEXObject, RootClass {
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
	 * @see qmm.QmmPackage#getInterfaceClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute_OrGroup> getAttribute();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceClass_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceClass_BaseClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass_OrGroup> getBaseClass();

	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.InterfaceClass_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see qmm.QmmPackage#getInterfaceClass_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass_OrGroup> getInterfaceClass();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Class Path Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base Class Path Attr EClass</em>' containment reference.
	 * @see #setRefBaseClassPath_AttrEClass(InterfaceClass_refBaseClassPath_AttrEClass)
	 * @see qmm.QmmPackage#getInterfaceClass_RefBaseClassPath_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceClass_refBaseClassPath_AttrEClass getRefBaseClassPath_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.InterfaceClass#getRefBaseClassPath_AttrEClass <em>Ref Base Class Path Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Class Path Attr EClass</em>' containment reference.
	 * @see #getRefBaseClassPath_AttrEClass()
	 * @generated
	 */
	void setRefBaseClassPath_AttrEClass(InterfaceClass_refBaseClassPath_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int attribute_upperBound = -1;\nint nr_nonTransitive_attribute = 0;\nif(this.attribute != null){\n\t\tfor(qmm.OrGroup og : this.attribute) if(!og.isTransitive()) nr_nonTransitive_attribute++;\n}\nif(nr_nonTransitive_attribute > attribute_upperBound && attribute_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_attribute + \" non-transitive attribute. Only \" + attribute_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int baseClass_upperBound = 1;\nint nr_nonTransitive_baseClass = 0;\nif(this.baseClass != null){\n\t\tfor(qmm.OrGroup og : this.baseClass) if(!og.isTransitive()) nr_nonTransitive_baseClass++;\n}\nif(nr_nonTransitive_baseClass > baseClass_upperBound && baseClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_baseClass + \" non-transitive baseClass. Only \" + baseClass_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int interfaceClass_upperBound = -1;\nint nr_nonTransitive_interfaceClass = 0;\nif(this.interfaceClass != null){\n\t\tfor(qmm.OrGroup og : this.interfaceClass) if(!og.isTransitive()) nr_nonTransitive_interfaceClass++;\n}\nif(nr_nonTransitive_interfaceClass > interfaceClass_upperBound && interfaceClass_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_interfaceClass + \" non-transitive interfaceClass. Only \" + interfaceClass_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // InterfaceClass
