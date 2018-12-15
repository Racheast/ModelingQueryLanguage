/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Bit Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Object_BitOperator#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getObject_BitOperator()
 * @model abstract="true"
 *        annotation="information type='Object'"
 * @generated
 */
public interface Object_BitOperator extends Object_ExpressionOperator, BitOperator {
	/**
	 * Returns the value of the '<em><b>Connects</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Object_ExpressionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects</em>' containment reference list.
	 * @see qmm.QmmPackage#getObject_BitOperator_Connects()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Object_ExpressionOperator> getConnects();

} // Object_BitOperator
