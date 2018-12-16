/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.QrmmFactory;
import qrmm.SourceDocumentInformation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Document Information</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceDocumentInformationTest extends SearchableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SourceDocumentInformationTest.class);
	}

	/**
	 * Constructs a new Source Document Information test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Source Document Information test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SourceDocumentInformation getFixture() {
		return (SourceDocumentInformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createSourceDocumentInformation());
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

} //SourceDocumentInformationTest
