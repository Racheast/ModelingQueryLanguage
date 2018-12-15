/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.AttributeLib_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Lib Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeLib_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeLib_OrGroupTest.class);
	}

	/**
	 * Constructs a new Attribute Lib Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLib_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Lib Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeLib_OrGroup getFixture() {
		return (AttributeLib_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createAttributeLib_OrGroup());
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

} //AttributeLib_OrGroupTest
