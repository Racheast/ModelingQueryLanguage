/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.InternalLink;
import qrmm.QrmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalLinkTest extends CAEXObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InternalLinkTest.class);
	}

	/**
	 * Constructs a new Internal Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Internal Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InternalLink getFixture() {
		return (InternalLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createInternalLink());
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

} //InternalLinkTest
