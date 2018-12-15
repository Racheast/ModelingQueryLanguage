/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.SystemUnitClass_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Unit Class Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemUnitClass_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemUnitClass_OrGroupTest.class);
	}

	/**
	 * Constructs a new System Unit Class Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Unit Class Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemUnitClass_OrGroup getFixture() {
		return (SystemUnitClass_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createSystemUnitClass_OrGroup());
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

} //SystemUnitClass_OrGroupTest
