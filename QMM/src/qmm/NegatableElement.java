/**
 */
package qmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negatable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.NegatableElement#isNegated <em>Negated</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getNegatableElement()
 * @model abstract="true"
 * @generated
 */
public interface NegatableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see qmm.QmmPackage#getNegatableElement_Negated()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link qmm.NegatableElement#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

} // NegatableElement
