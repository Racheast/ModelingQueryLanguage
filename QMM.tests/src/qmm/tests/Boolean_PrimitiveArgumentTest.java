/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.Boolean_PrimitiveArgument;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Primitive Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Boolean_PrimitiveArgumentTest extends Boolean_ArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Boolean_PrimitiveArgumentTest.class);
	}

	/**
	 * Constructs a new Boolean Primitive Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean_PrimitiveArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Primitive Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Boolean_PrimitiveArgument getFixture() {
		return (Boolean_PrimitiveArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createBoolean_PrimitiveArgument());
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

} //Boolean_PrimitiveArgumentTest
