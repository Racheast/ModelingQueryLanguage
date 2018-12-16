/**
 */
package qmm;

import java.lang.CharSequence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char Sequence Primitive Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.CharSequence_PrimitiveArgument#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCharSequence_PrimitiveArgument()
 * @model
 * @generated
 */
public interface CharSequence_PrimitiveArgument extends CharSequence_Argument, PrimitiveArgument {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(CharSequence)
	 * @see qmm.QmmPackage#getCharSequence_PrimitiveArgument_Value()
	 * @model dataType="qmm.CharSequence" required="true"
	 * @generated
	 */
	CharSequence getValue();

	/**
	 * Sets the value of the '{@link qmm.CharSequence_PrimitiveArgument#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CharSequence value);

} // CharSequence_PrimitiveArgument
