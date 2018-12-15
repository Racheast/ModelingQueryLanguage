/**
 */
package qrmm.tests;

import junit.textui.TestRunner;

import qrmm.AttributeNameMapping;
import qrmm.QrmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeNameMappingTest extends CAEXBasicObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeNameMappingTest.class);
	}

	/**
	 * Constructs a new Attribute Name Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNameMappingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Name Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeNameMapping getFixture() {
		return (AttributeNameMapping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QrmmFactory.eINSTANCE.createAttributeNameMapping());
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

} //AttributeNameMappingTest
