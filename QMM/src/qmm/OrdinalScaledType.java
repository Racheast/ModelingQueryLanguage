/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.OrdinalScaledType#getRequiredMaxValue_AttrEClass <em>Required Max Value Attr EClass</em>}</li>
 *   <li>{@link qmm.OrdinalScaledType#getRequiredValue_AttrEClass <em>Required Value Attr EClass</em>}</li>
 *   <li>{@link qmm.OrdinalScaledType#getRequiredMinValue_AttrEClass <em>Required Min Value Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getOrdinalScaledType()
 * @model
 * @generated
 */
public interface OrdinalScaledType extends RootClass {
	/**
	 * Returns the value of the '<em><b>Required Max Value Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Max Value Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Max Value Attr EClass</em>' containment reference.
	 * @see #setRequiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass)
	 * @see qmm.QmmPackage#getOrdinalScaledType_RequiredMaxValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	OrdinalScaledType_requiredMaxValue_AttrEClass getRequiredMaxValue_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.OrdinalScaledType#getRequiredMaxValue_AttrEClass <em>Required Max Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Max Value Attr EClass</em>' containment reference.
	 * @see #getRequiredMaxValue_AttrEClass()
	 * @generated
	 */
	void setRequiredMaxValue_AttrEClass(OrdinalScaledType_requiredMaxValue_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Required Value Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Value Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Value Attr EClass</em>' containment reference.
	 * @see #setRequiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass)
	 * @see qmm.QmmPackage#getOrdinalScaledType_RequiredValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	OrdinalScaledType_requiredValue_AttrEClass getRequiredValue_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.OrdinalScaledType#getRequiredValue_AttrEClass <em>Required Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Value Attr EClass</em>' containment reference.
	 * @see #getRequiredValue_AttrEClass()
	 * @generated
	 */
	void setRequiredValue_AttrEClass(OrdinalScaledType_requiredValue_AttrEClass value);

	/**
	 * Returns the value of the '<em><b>Required Min Value Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Min Value Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Min Value Attr EClass</em>' containment reference.
	 * @see #setRequiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass)
	 * @see qmm.QmmPackage#getOrdinalScaledType_RequiredMinValue_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	OrdinalScaledType_requiredMinValue_AttrEClass getRequiredMinValue_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.OrdinalScaledType#getRequiredMinValue_AttrEClass <em>Required Min Value Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Min Value Attr EClass</em>' containment reference.
	 * @see #getRequiredMinValue_AttrEClass()
	 * @generated
	 */
	void setRequiredMinValue_AttrEClass(OrdinalScaledType_requiredMinValue_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // OrdinalScaledType
