/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Element#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 *   <li>{@link qmm.Element#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends RootClass {
	/**
	 * Returns the value of the '<em><b>Name Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attr EClass</em>' containment reference.
	 * @see #setName_AttrEClass(Element_name_AttrEClass)
	 * @see qmm.QmmPackage#getElement_Name_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Element_name_AttrEClass getName_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Element#getName_AttrEClass <em>Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Attr EClass</em>' containment reference.
	 * @see #getName_AttrEClass()
	 * @generated
	 */
	void setName_AttrEClass(Element_name_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Value Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attr EClass</em>' containment reference.
	 * @see #setValue_AttrEClass(Element_value_AttrEClass)
	 * @see qmm.QmmPackage#getElement_Value_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Element_value_AttrEClass getValue_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Element#getValue_AttrEClass <em>Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attr EClass</em>' containment reference.
	 * @see #getValue_AttrEClass()
	 * @generated
	 */
	void setValue_AttrEClass(Element_value_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Element
