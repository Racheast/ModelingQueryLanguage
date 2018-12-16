/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.QrmmFactory;
import qrmm.Revision;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RevisionTest extends CAEXBasicObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RevisionTest.class);
	}

	/**
	 * Constructs a new Revision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Revision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Revision getFixture() {
		return (Revision)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createRevision());
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

} //RevisionTest
