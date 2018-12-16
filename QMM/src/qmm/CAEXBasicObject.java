/**
 */
package qmm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAEX Basic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.CAEXBasicObject#getDescription <em>Description</em>}</li>
 *   <li>{@link qmm.CAEXBasicObject#getVersion <em>Version</em>}</li>
 *   <li>{@link qmm.CAEXBasicObject#getRevision <em>Revision</em>}</li>
 *   <li>{@link qmm.CAEXBasicObject#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link qmm.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link qmm.CAEXBasicObject#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getCAEXBasicObject()
 * @model
 * @generated
 */
public interface CAEXBasicObject extends RootClass {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Description_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXBasicObject_Description()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description_OrGroup> getDescription();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Version_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXBasicObject_Version()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version_OrGroup> getVersion();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Revision_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXBasicObject_Revision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision_OrGroup> getRevision();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.Copyright_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXBasicObject_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	EList<Copyright_OrGroup> getCopyright();

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.AdditionalInformation_OrGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference list.
	 * @see qmm.QmmPackage#getCAEXBasicObject_AdditionalInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionalInformation_OrGroup> getAdditionalInformation();

	/**
	 * Returns the value of the '<em><b>Change Mode Attr EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Mode Attr EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Mode Attr EClass</em>' containment reference.
	 * @see #setChangeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass)
	 * @see qmm.QmmPackage#getCAEXBasicObject_ChangeMode_AttrEClass()
	 * @model containment="true"
	 * @generated
	 */
	CAEXBasicObject_changeMode_AttrEClass getChangeMode_AttrEClass();

	/**
	 * Sets the value of the '{@link qmm.CAEXBasicObject#getChangeMode_AttrEClass <em>Change Mode Attr EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode Attr EClass</em>' containment reference.
	 * @see #getChangeMode_AttrEClass()
	 * @generated
	 */
	void setChangeMode_AttrEClass(CAEXBasicObject_changeMode_AttrEClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(diagnostic!=null){\n    if(this.evaluationOperator != null){\n    \tEList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateAllCheckExpressions(this.evaluationOperator);\n    \tfor(int i=0; i<diagnosticList.size(); i++){\n    \t\tdiagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));\n    \t}\n    }\n}\n\nfinal int description_upperBound = 1;\nint nr_nonTransitive_description = 0;\nif(this.description != null){\n\t\tfor(qmm.OrGroup og : this.description) if(!og.isTransitive()) nr_nonTransitive_description++;\n}\nif(nr_nonTransitive_description > description_upperBound && description_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_description + \" non-transitive description. Only \" + description_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int version_upperBound = 1;\nint nr_nonTransitive_version = 0;\nif(this.version != null){\n\t\tfor(qmm.OrGroup og : this.version) if(!og.isTransitive()) nr_nonTransitive_version++;\n}\nif(nr_nonTransitive_version > version_upperBound && version_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_version + \" non-transitive version. Only \" + version_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int revision_upperBound = -1;\nint nr_nonTransitive_revision = 0;\nif(this.revision != null){\n\t\tfor(qmm.OrGroup og : this.revision) if(!og.isTransitive()) nr_nonTransitive_revision++;\n}\nif(nr_nonTransitive_revision > revision_upperBound && revision_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_revision + \" non-transitive revision. Only \" + revision_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int copyright_upperBound = 1;\nint nr_nonTransitive_copyright = 0;\nif(this.copyright != null){\n\t\tfor(qmm.OrGroup og : this.copyright) if(!og.isTransitive()) nr_nonTransitive_copyright++;\n}\nif(nr_nonTransitive_copyright > copyright_upperBound && copyright_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_copyright + \" non-transitive copyright. Only \" + copyright_upperBound + \" are allowed.\",new Object[] { this }));\n\nfinal int additionalInformation_upperBound = 1;\nint nr_nonTransitive_additionalInformation = 0;\nif(this.additionalInformation != null){\n\t\tfor(qmm.OrGroup og : this.additionalInformation) if(!og.isTransitive()) nr_nonTransitive_additionalInformation++;\n}\nif(nr_nonTransitive_additionalInformation > additionalInformation_upperBound && additionalInformation_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"EClass contains \" + nr_nonTransitive_additionalInformation + \" non-transitive additionalInformation. Only \" + additionalInformation_upperBound + \" are allowed.\",new Object[] { this }));\n\nreturn true;'"
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostic, Map context);

} // CAEXBasicObject