/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.QrmmFactory;
import qrmm.SystemUnitFamily;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Unit Family</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemUnitFamilyTest extends SystemUnitClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemUnitFamilyTest.class);
	}

	/**
	 * Constructs a new System Unit Family test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitFamilyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Unit Family test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemUnitFamily getFixture() {
		return (SystemUnitFamily)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createSystemUnitFamily());
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

} //SystemUnitFamilyTest
