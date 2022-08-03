/**
 */
package TIM.tests;

import TIM.LTMController;
import TIM.TIMFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LTM Controller</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LTMControllerTest extends TestCase {

	/**
	 * The fixture for this LTM Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTMController fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LTMControllerTest.class);
	}

	/**
	 * Constructs a new LTM Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTMControllerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this LTM Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LTMController fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this LTM Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTMController getFixture() {
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
		setFixture(TIMFactory.eINSTANCE.createLTMController());
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

} //LTMControllerTest
