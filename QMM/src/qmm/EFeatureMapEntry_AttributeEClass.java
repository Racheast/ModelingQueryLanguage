/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature Map Entry Attribute EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.EFeatureMapEntry_AttributeEClass#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getEFeatureMapEntry_AttributeEClass()
 * @model abstract="true"
 * @generated
 */
public interface EFeatureMapEntry_AttributeEClass extends RegularAttributeEClass, EFeatureMapEntry_CalculateableElement {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(EFeatureMapEntry_ExpressionOperator)
	 * @see qmm.QmmPackage#getEFeatureMapEntry_AttributeEClass_Operator()
	 * @model containment="true"
	 * @generated
	 */
	EFeatureMapEntry_ExpressionOperator getOperator();

	/**
	 * Sets the value of the '{@link qmm.EFeatureMapEntry_AttributeEClass#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EFeatureMapEntry_ExpressionOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.operator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateCheckExpression(this.operator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // EFeatureMapEntry_AttributeEClass