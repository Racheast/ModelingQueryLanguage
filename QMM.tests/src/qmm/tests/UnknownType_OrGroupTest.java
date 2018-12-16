/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.UnknownType_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unknown Type Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnknownType_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnknownType_OrGroupTest.class);
	}

	/**
	 * Constructs a new Unknown Type Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unknown Type Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnknownType_OrGroup getFixture() {
		return (UnknownType_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createUnknownType_OrGroup());
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

} //UnknownType_OrGroupTest
