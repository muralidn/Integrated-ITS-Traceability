/**
 */
package TIM.tests;

import TIM.Change_Request_Ticket;
import TIM.TIMFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Request Ticket</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Change_Request_TicketTest extends TestCase {

	/**
	 * The fixture for this Change Request Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Change_Request_Ticket fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Change_Request_TicketTest.class);
	}

	/**
	 * Constructs a new Change Request Ticket test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Change_Request_TicketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Change Request Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Change_Request_Ticket fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Change Request Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Change_Request_Ticket getFixture() {
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
		setFixture(TIMFactory.eINSTANCE.createChange_Request_Ticket());
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

} //Change_Request_TicketTest
