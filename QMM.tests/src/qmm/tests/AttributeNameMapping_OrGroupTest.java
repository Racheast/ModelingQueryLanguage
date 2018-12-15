/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.AttributeNameMapping_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Name Mapping Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeNameMapping_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeNameMapping_OrGroupTest.class);
	}

	/**
	 * Constructs a new Attribute Name Mapping Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNameMapping_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Name Mapping Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeNameMapping_OrGroup getFixture() {
		return (AttributeNameMapping_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createAttributeNameMapping_OrGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AttributeNameMapping_OrGroupTest
