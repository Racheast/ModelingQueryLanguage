/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.QrmmFactory;
import qrmm.SystemUnitClass;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Unit Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemUnitClassTest extends CAEXObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemUnitClassTest.class);
	}

	/**
	 * Constructs a new System Unit Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Unit Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemUnitClass getFixture() {
		return (SystemUnitClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createSystemUnitClass());
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

} //SystemUnitClassTest
