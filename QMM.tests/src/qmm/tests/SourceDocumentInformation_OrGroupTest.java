/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.QmmFactory;
import qmm.SourceDocumentInformation_OrGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Document Information Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceDocumentInformation_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SourceDocumentInformation_OrGroupTest.class);
	}

	/**
	 * Constructs a new Source Document Information Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformation_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Source Document Information Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SourceDocumentInformation_OrGroup getFixture() {
		return (SourceDocumentInformation_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createSourceDocumentInformation_OrGroup());
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

} //SourceDocumentInformation_OrGroupTest
