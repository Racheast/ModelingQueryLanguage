/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countable Reference Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.Countable_ReferenceArgument#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCountable_ReferenceArgument()
 * @model
 * @generated
 */
public interface Countable_ReferenceArgument extends ReferenceArgument {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Countable)
	 * @see qmm.QmmPackage#getCountable_ReferenceArgument_Reference()
	 * @model required="true"
	 * @generated
	 */
	Countable getReference();

	/**
	 * Sets the value of the '{@link qmm.Countable_ReferenceArgument#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Countable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='qmm.RootClass containingRootClass = null;\nqmm.RootClass referencesRootClass = null;\nqmm.Countable containingCountable = null;\n\nif(this.eContainer() != null && this.reference != null){\n\t\torg.eclipse.emf.ecore.EObject eContainer = this.eContainer();\n\t\twhile(eContainer != null && !(eContainer instanceof qmm.RootClass)){\n\t\t\tif(eContainer instanceof qmm.Countable){\n\t\t\t\tcontainingCountable = (qmm.Countable)eContainer;\n\t\t\t}\n\t\t\teContainer = eContainer.eContainer();\n\t\t}\n\t\tcontainingRootClass = (qmm.RootClass)eContainer;\n\n\t\teContainer = this.reference.eContainer();\n\t\twhile(eContainer != null && !(eContainer instanceof qmm.RootClass)){\n\t\t\teContainer = eContainer.eContainer();\n\t\t}\n\n\t\treferencesRootClass = (qmm.RootClass)eContainer;\n\n\t\tif(containingCountable != null && containingCountable == reference){  //self-reference in expression !\n\t\t\tString errorMessage = \"Self-reference in expression of \" + containingCountable + \" detected. Self-references are not allowed!\";\n\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));\n\t\t}\n\n\t\tif(containingRootClass != referencesRootClass){\n\t\t\tString errorMessage = \"The referenced element \" + this.reference + \" is contained by a different parent-element than the expression\'s parent-element. Cross-references are not supported.\";\n\t\t\tdiagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));\n\t\t}\n\n\t\tif(this.reference instanceof qmm.NegatableElement && ((qmm.NegatableElement)this.reference).isNegated())diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Reference to a negated element in \" + this + \" has been detected. References to negated elements are not allowed.\",new Object[] { this }));\n}\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // Countable_ReferenceArgument
