/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.RoleClassLib_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Class Lib Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleClassLib_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleClassLib_OrGroupTest.class);
	}

	/**
	 * Constructs a new Role Class Lib Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassLib_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Class Lib Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleClassLib_OrGroup getFixture() {
		return (RoleClassLib_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createRoleClassLib_OrGroup());
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

} //RoleClassLib_OrGroupTest
