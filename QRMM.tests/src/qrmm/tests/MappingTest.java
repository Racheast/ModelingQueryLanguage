/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.Mapping;
import qrmm.QrmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingTest extends CAEXBasicObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingTest.class);
	}

	/**
	 * Constructs a new Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mapping getFixture() {
		return (Mapping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createMapping());
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

} //MappingTest
