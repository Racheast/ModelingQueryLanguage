/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.SupportedRoleClass_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Supported Role Class Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupportedRoleClass_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SupportedRoleClass_OrGroupTest.class);
	}

	/**
	 * Constructs a new Supported Role Class Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedRoleClass_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Supported Role Class Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SupportedRoleClass_OrGroup getFixture() {
		return (SupportedRoleClass_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createSupportedRoleClass_OrGroup());
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

} //SupportedRoleClass_OrGroupTest
