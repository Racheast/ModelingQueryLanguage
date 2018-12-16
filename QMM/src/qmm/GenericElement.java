/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.GenericElement#getNestedElements <em>Nested Elements</em>}</li>
 *   <li>{@link qmm.GenericElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link qmm.GenericElement#getElementFeatureMap_AttrEClass <em>Element Feature Map Attr EClass</em>}</li>
 *   <li>{@link qmm.GenericElement#getAttributeFeatureMap_AttrEClass <em>Attribute Feature Map Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getGenericElement()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
public interface GenericElement extends Element, RootClass {
	/**
	 * Returns the value of the '<em><b>Nested Elements</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.GenericElement_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Elements</em>' containment reference list.
	 * @see qmm.QmmPackage#getGenericElement_NestedElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='empty'"
	 * @generated
	 */
	EList<GenericElement_OrGroup> getNestedElements();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.GenericAttribute_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see qmm.QmmPackage#getGenericElement_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='empty'"
	 * @generated
	 */
	EList<GenericAttribute_OrGroup> getAttributes();

	/**
	 * Returns the value of the '<em><b>Element Feature Map Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.GenericElement_elementFeatureMap_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Feature Map Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Feature Map Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getGenericElement_ElementFeatureMap_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericElement_elementFeatureMap_AttrEClass> getElementFeatureMap_AttrEClass();

	/**
	 * Returns the value of the '<em><b>Attribute Feature Map Attr EClass</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.GenericElement_attributeFeatureMap_AttrEClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Feature Map Attr EClass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Feature Map Attr EClass</em>' containment reference list.
	 * @see qmm.QmmPackage#getGenericElement_AttributeFeatureMap_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericElement_attributeFeatureMap_AttrEClass> getAttributeFeatureMap_AttrEClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int nestedElements_upperBound = -1;\nint nr_nonTransitive_nestedElements = 0;\nif(this.nestedElements != null){\n\t\tfor(qmm.OrGroup og : this.nestedElements) if(!og.isTransitive()) nr_nonTransitive_nestedElements++;\n}\nif(nr_nonTransitive_nestedElements > nestedElements_upperBound && nestedElements_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_nestedElements + \" non-transitive nestedElements. Only \" + nestedElements_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int attributes_upperBound = -1;\nint nr_nonTransitive_attributes = 0;\nif(this.attributes != null){\n\t\tfor(qmm.OrGroup og : this.attributes) if(!og.isTransitive()) nr_nonTransitive_attributes++;\n}\nif(nr_nonTransitive_attributes > attributes_upperBound && attributes_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_attributes + \" non-transitive attributes. Only \" + attributes_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // GenericElement
