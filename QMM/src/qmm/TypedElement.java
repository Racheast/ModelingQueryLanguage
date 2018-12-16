/**
 */
package qmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qmm.QmmPackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EClass typeEClass = QmmPackage.eINSTANCE.getType();\n    EClass type = null;\n    for(EClass possibleTypeSubClass : this.eClass().getEAllSuperTypes()){\n    \tif(typeEClass.isSuperTypeOf(possibleTypeSubClass) && !typeEClass.equals(possibleTypeSubClass)){\n    \t\ttype = possibleTypeSubClass;\n    \t}\n    }\n    return type;'"
	 * @generated
	 */
	Object getType();

} // TypedElement
