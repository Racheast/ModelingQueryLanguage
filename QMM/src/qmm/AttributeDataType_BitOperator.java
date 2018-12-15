/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Data Type Bit Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.AttributeDataType_BitOperator#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getAttributeDataType_BitOperator()
 * @model abstract="true"
 *        annotation="information type='AttributeDataType'"
 * @generated
 */
public interface AttributeDataType_BitOperator extends AttributeDataType_ExpressionOperator, BitOperator {
	/**
	 * Returns the value of the '<em><b>Connects</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AttributeDataType_ExpressionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects</em>' containment reference list.
	 * @see qmm.QmmPackage#getAttributeDataType_BitOperator_Connects()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<AttributeDataType_ExpressionOperator> getConnects();

} // AttributeDataType_BitOperator
