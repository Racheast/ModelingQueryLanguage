/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.AdditionalInformation_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Additional Information Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdditionalInformation_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdditionalInformation_OrGroupTest.class);
	}

	/**
	 * Constructs a new Additional Information Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalInformation_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Additional Information Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdditionalInformation_OrGroup getFixture() {
		return (AdditionalInformation_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createAdditionalInformation_OrGroup());
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

} //AdditionalInformation_OrGroupTest
