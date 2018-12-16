/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.RoleRequirements_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Requirements Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleRequirements_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleRequirements_OrGroupTest.class);
	}

	/**
	 * Constructs a new Role Requirements Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequirements_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Requirements Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleRequirements_OrGroup getFixture() {
		return (RoleRequirements_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createRoleRequirements_OrGroup());
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

} //RoleRequirements_OrGroupTest
