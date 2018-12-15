/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.Version_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Version Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Version_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Version_OrGroupTest.class);
	}

	/**
	 * Constructs a new Version Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Version Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Version_OrGroup getFixture() {
		return (Version_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createVersion_OrGroup());
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

} //Version_OrGroupTest
