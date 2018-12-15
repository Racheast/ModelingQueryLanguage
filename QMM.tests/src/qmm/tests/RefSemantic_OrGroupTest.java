/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.RefSemantic_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ref Semantic Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefSemantic_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RefSemantic_OrGroupTest.class);
	}

	/**
	 * Constructs a new Ref Semantic Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSemantic_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ref Semantic Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RefSemantic_OrGroup getFixture() {
		return (RefSemantic_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createRefSemantic_OrGroup());
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

} //RefSemantic_OrGroupTest
