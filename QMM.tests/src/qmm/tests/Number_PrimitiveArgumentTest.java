/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Number_PrimitiveArgument;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Primitive Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Number_PrimitiveArgumentTest extends Number_ArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Number_PrimitiveArgumentTest.class);
	}

	/**
	 * Constructs a new Number Primitive Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number_PrimitiveArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Primitive Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Number_PrimitiveArgument getFixture() {
		return (Number_PrimitiveArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createNumber_PrimitiveArgument());
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

} //Number_PrimitiveArgumentTest
