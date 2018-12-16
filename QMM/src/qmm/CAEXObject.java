/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.CAEXObject#getID_AttrEClass <em>ID Attr EClass</em>}</li>
 *   <li>{@link qmm.CAEXObject#getName_AttrEClass <em>Name Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCAEXObject()
 * @model
 * @generated
 */
public interface CAEXObject extends CAEXBasicObject, RootClass {
	/**
	 * Returns the value of the '<em><b>ID Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Attr EClass</em>' containment reference.
	 * @see #setID_AttrEClass(CAEXObject_iD_AttrEClass)
	 * @see qmm.QmmPackage#getCAEXObject_ID_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	CAEXObject_iD_AttrEClass getID_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.CAEXObject#getID_AttrEClass <em>ID Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Attr EClass</em>' containment reference.
	 * @see #getID_AttrEClass()
	 * @generated
	 */
	void setID_AttrEClass(CAEXObject_iD_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Name Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attr EClass</em>' containment reference.
	 * @see #setName_AttrEClass(CAEXObject_name_AttrEClass)
	 * @see qmm.QmmPackage#getCAEXObject_Name_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	CAEXObject_name_AttrEClass getName_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.CAEXObject#getName_AttrEClass <em>Name Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Attr EClass</em>' containment reference.
	 * @see #getName_AttrEClass()
	 * @generated
	 */
	void setName_AttrEClass(CAEXObject_name_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // CAEXObject
