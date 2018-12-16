/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.String_PrimitiveArgument;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Primitive Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class String_PrimitiveArgumentTest extends String_ArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(String_PrimitiveArgumentTest.class);
	}

	/**
	 * Constructs a new String Primitive Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String_PrimitiveArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Primitive Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected String_PrimitiveArgument getFixture() {
		return (String_PrimitiveArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createString_PrimitiveArgument());
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

} //String_PrimitiveArgumentTest
