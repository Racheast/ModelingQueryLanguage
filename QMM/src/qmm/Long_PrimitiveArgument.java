/**
 */
package qmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Primitive Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Long_PrimitiveArgument#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getLong_PrimitiveArgument()
 * @model
 * @generated
 */
public interface Long_PrimitiveArgument extends Long_Argument, PrimitiveArgument {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Long)
	 * @see qmm.QmmPackage#getLong_PrimitiveArgument_Value()
	 * @model dataType="qmm.Long" required="true"
	 * @generated
	 */
	Long getValue();

	/**
	 * Sets the value of the '{@link qmm.Long_PrimitiveArgument#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Long value);

} // Long_PrimitiveArgument
