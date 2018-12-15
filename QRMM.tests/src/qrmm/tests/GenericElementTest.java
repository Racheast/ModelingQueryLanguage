/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.GenericElement;
import qrmm.QrmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericElementTest.class);
	}

	/**
	 * Constructs a new Generic Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generic Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GenericElement getFixture() {
		return (GenericElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createGenericElement());
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

} //GenericElementTest
