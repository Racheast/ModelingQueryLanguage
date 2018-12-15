/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.GenericAttribute_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Attribute Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericAttribute_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericAttribute_OrGroupTest.class);
	}

	/**
	 * Constructs a new Generic Attribute Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttribute_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generic Attribute Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GenericAttribute_OrGroup getFixture() {
		return (GenericAttribute_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createGenericAttribute_OrGroup());
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

} //GenericAttribute_OrGroupTest
