/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.OrGroup#isTransitive <em>Transitive</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getOrGroup()
 * @model abstract="true"
 * @generated
 */
public interface OrGroup extends NamedElement, Countable, NegatableElement {
	/**
	 * Returns the value of the '<em><b>Transitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive</em>' attribute.
	 * @see #setTransitive(boolean)
	 * @see qmm.QmmPackage#getOrGroup_Transitive()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTransitive();

	/**
	 * Sets the value of the '{@link qmm.OrGroup#isTransitive <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive</em>' attribute.
	 * @see #isTransitive()
	 * @generated
	 */
	void setTransitive(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EClass containerEClass = this.eContainingFeature().getEContainingClass();org.eclipse.emf.ecore.EClassifier eType = this.eClass().getEStructuralFeature(\"containment\").getEType();if(eType != null && eType instanceof EClass){\tEClass typeEClass = (EClass)eType;\tif(!containerEClass.isSuperTypeOf(typeEClass) && this.transitive){\t\tString errorMessage = \"Feature \" + this.name + \" can\'t be transitive! It is defined by the type \" + containerEClass.getName() + \", but is itself not a subtype of this type.\";\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OR_GROUP__VALIDATE, errorMessage,new Object[] { this }));\t}}return true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // OrGroup
