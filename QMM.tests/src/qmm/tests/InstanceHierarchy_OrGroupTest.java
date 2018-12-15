/**
 */
package qmm.tests;

import junit.textui.TestRunner;

import qmm.InstanceHierarchy_OrGroup;
import qmm.QmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instance Hierarchy Or Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceHierarchy_OrGroupTest extends OrGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstanceHierarchy_OrGroupTest.class);
	}

	/**
	 * Constructs a new Instance Hierarchy Or Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceHierarchy_OrGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instance Hierarchy Or Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InstanceHierarchy_OrGroup getFixture() {
		return (InstanceHierarchy_OrGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QmmFactory.eINSTANCE.createInstanceHierarchy_OrGroup());
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

} //InstanceHierarchy_OrGroupTest
