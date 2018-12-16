/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.QrmmFactory;
import qrmm.UnknownType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnknownTypeTest extends SearchableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnknownTypeTest.class);
	}

	/**
	 * Constructs a new Unknown Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unknown Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnknownType getFixture() {
		return (UnknownType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createUnknownType());
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

} //UnknownTypeTest
