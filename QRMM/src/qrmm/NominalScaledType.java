/**
 */
package qrmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qrmm.NominalScaledType#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @see qrmm.QrmmPackage#getNominalScaledType()
 * @model
 * @generated
 */
public interface NominalScaledType extends SearchableElement {
	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute list.
	 * @see qrmm.QrmmPackage#getNominalScaledType_RequiredValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getRequiredValue();

} // NominalScaledType
