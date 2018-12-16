/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature Map Entry Bit Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.EFeatureMapEntry_BitOperator#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getEFeatureMapEntry_BitOperator()
 * @model abstract="true"
 *        annotation="information type='EFeatureMapEntry'"
 * @generated
 */
public interface EFeatureMapEntry_BitOperator extends EFeatureMapEntry_ExpressionOperator, BitOperator {
	/**
	 * Returns the value of the '<em><b>Connects</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.EFeatureMapEntry_ExpressionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects</em>' containment reference list.
	 * @see qmm.QmmPackage#getEFeatureMapEntry_BitOperator_Connects()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<EFeatureMapEntry_ExpressionOperator> getConnects();

} // EFeatureMapEntry_BitOperator
