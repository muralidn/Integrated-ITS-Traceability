/**
 */
package TIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TIM.TIMPackage
 * @generated
 */
public interface TIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TIMFactory eINSTANCE = TIM.impl.TIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Global Trace Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Trace Model</em>'.
	 * @generated
	 */
	GlobalTraceModel createGlobalTraceModel();

	/**
	 * Returns a new object of class '<em>GTM Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GTM Controller</em>'.
	 * @generated
	 */
	GTMController createGTMController();

	/**
	 * Returns a new object of class '<em>LTM Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LTM Controller</em>'.
	 * @generated
	 */
	LTMController createLTMController();

	/**
	 * Returns a new object of class '<em>GTM Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GTM Version</em>'.
	 * @generated
	 */
	GTMVersion createGTMVersion();

	/**
	 * Returns a new object of class '<em>Change Request Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Request Ticket</em>'.
	 * @generated
	 */
	Change_Request_Ticket createChange_Request_Ticket();

	/**
	 * Returns a new object of class '<em>Derive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derive</em>'.
	 * @generated
	 */
	Derive createDerive();

	/**
	 * Returns a new object of class '<em>Implement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implement</em>'.
	 * @generated
	 */
	Implement createImplement();

	/**
	 * Returns a new object of class '<em>Verify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verify</em>'.
	 * @generated
	 */
	Verify createVerify();

	/**
	 * Returns a new object of class '<em>System Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Requirement</em>'.
	 * @generated
	 */
	SystemRequirement createSystemRequirement();

	/**
	 * Returns a new object of class '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Requirement</em>'.
	 * @generated
	 */
	FunctionalRequirement createFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TIMPackage getTIMPackage();

} //TIMFactory
