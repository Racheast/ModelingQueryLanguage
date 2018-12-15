/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.NominalScaledType;
import qrmm.QrmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nominal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NominalScaledTypeTest extends SearchableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NominalScaledTypeTest.class);
	}

	/**
	 * Constructs a new Nominal Scaled Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalScaledTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nominal Scaled Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NominalScaledType getFixture() {
		return (NominalScaledType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createNominalScaledType());
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

} //NominalScaledTypeTest
