/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link qrmm.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link qrmm.Attribute#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link qrmm.Attribute#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link qrmm.Attribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link qrmm.Attribute#getAttributeDataType <em>Attribute Data Type</em>}</li>
 *   <li>{@link qrmm.Attribute#getRefAttributeType <em>Ref Attribute Type</em>}</li>
 *   <li>{@link qrmm.Attribute#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends CAEXObject, SearchableElement {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see qrmm.QrmmPackage#getAttribute_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link qrmm.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qrmm.QrmmPackage#getAttribute_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qrmm.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.RefSemantic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Semantic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Semantic</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getAttribute_RefSemantic()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefSemantic> getRefSemantic();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.AttributeValueRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getAttribute_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeValueRequirement> getConstraint();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link qrmm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see qrmm.QrmmPackage#getAttribute_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Attribute Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Data Type</em>' attribute.
	 * @see #setAttributeDataType(String)
	 * @see qrmm.QrmmPackage#getAttribute_AttributeDataType()
	 * @model dataType="qrmm.AttributeDataType"
	 * @generated
	 */
	String getAttributeDataType();

	/**
	 * Sets the value of the '{@link qrmm.Attribute#getAttributeDataType <em>Attribute Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Data Type</em>' attribute.
	 * @see #getAttributeDataType()
	 * @generated
	 */
	void setAttributeDataType(String value);

	/**
	 * Returns the value of the '<em><b>Ref Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Attribute Type</em>' attribute.
	 * @see #setRefAttributeType(String)
	 * @see qrmm.QrmmPackage#getAttribute_RefAttributeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefAttributeType();

	/**
	 * Sets the value of the '{@link qrmm.Attribute#getRefAttributeType <em>Ref Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Attribute Type</em>' attribute.
	 * @see #getRefAttributeType()
	 * @generated
	 */
	void setRefAttributeType(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see qrmm.QrmmPackage#getAttribute_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link qrmm.Attribute#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Attribute
