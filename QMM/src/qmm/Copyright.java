/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copyright</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Copyright#getValue_AttrEClass <em>Value Attr EClass</em>}</li>
 *   <li>{@link qmm.Copyright#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCopyright()
 * @model
 * @generated
 */
public interface Copyright extends RootClass {
	/**
	 * Returns the value of the '<em><b>Value Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attr EClass</em>' containment reference.
	 * @see #setValue_AttrEClass(Copyright_value_AttrEClass)
	 * @see qmm.QmmPackage#getCopyright_Value_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Copyright_value_AttrEClass getValue_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Copyright#getValue_AttrEClass <em>Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attr EClass</em>' containment reference.
	 * @see #getValue_AttrEClass()
	 * @generated
	 */
	void setValue_AttrEClass(Copyright_value_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Change Mode Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Mode Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Mode Attr EClass</em>' containment reference.
	 * @see #setChangeMode_AttrEClass(Copyright_changeMode_AttrEClass)
	 * @see qmm.QmmPackage#getCopyright_ChangeMode_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	Copyright_changeMode_AttrEClass getChangeMode_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.Copyright#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode Attr EClass</em>' containment reference.
	 * @see #getChangeMode_AttrEClass()
	 * @generated
	 */
	void setChangeMode_AttrEClass(Copyright_changeMode_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Copyright
