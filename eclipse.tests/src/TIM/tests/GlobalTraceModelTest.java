/**
 */
package TIM.tests;

import TIM.GlobalTraceModel;
import TIM.TIMFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Global Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalTraceModelTest extends TestCase {

	/**
	 * The fixture for this Global Trace Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalTraceModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GlobalTraceModelTest.class);
	}

	/**
	 * Constructs a new Global Trace Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTraceModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Global Trace Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GlobalTraceModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Global Trace Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalTraceModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TIMFactory.eINSTANCE.createGlobalTraceModel());
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

} //GlobalTraceModelTest
