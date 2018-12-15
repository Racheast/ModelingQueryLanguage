/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.DateTime_PrimitiveArgument;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Time Primitive Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateTime_PrimitiveArgumentTest extends DateTime_ArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateTime_PrimitiveArgumentTest.class);
	}

	/**
	 * Constructs a new Date Time Primitive Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime_PrimitiveArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date Time Primitive Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DateTime_PrimitiveArgument getFixture() {
		return (DateTime_PrimitiveArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createDateTime_PrimitiveArgument());
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

} //DateTime_PrimitiveArgumentTest
