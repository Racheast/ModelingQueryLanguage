/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.AttributeValueRequirement_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Value Requirement Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeValueRequirement_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeValueRequirement_OrGroupTest.class);
	}

	/**
	 * Constructs a new Attribute Value Requirement Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRequirement_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Value Requirement Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeValueRequirement_OrGroup getFixture() {
		return (AttributeValueRequirement_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createAttributeValueRequirement_OrGroup());
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

} //AttributeValueRequirement_OrGroupTest
