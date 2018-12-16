/**
 */
package qmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qmm.FindQuery#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see qmm.QmmPackage#getFindQuery()
 * @model
 * @generated
 */
public interface FindQuery extends Query {
	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference list.
	 * The list contents are of type {@link qmm.RootClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference list.
	 * @see qmm.QmmPackage#getFindQuery_Where()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RootClass> getWhere();

} // FindQuery
