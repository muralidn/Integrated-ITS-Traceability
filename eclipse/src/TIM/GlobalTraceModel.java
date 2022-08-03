/**
 */
package TIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Trace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.GlobalTraceModel#getGtmController <em>Gtm Controller</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getLtmController <em>Ltm Controller</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getGtmVersion <em>Gtm Version</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getSysRequirements <em>Sys Requirements</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getFuncRequirements <em>Func Requirements</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getModelBlocks <em>Model Blocks</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getTestBlocks <em>Test Blocks</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getDeriveTraceLinks <em>Derive Trace Links</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getImplementTraceLinks <em>Implement Trace Links</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getVerifyTraceLinks <em>Verify Trace Links</em>}</li>
 *   <li>{@link TIM.GlobalTraceModel#getCR_Tickets <em>CR Tickets</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getGlobalTraceModel()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface GlobalTraceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Gtm Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gtm Controller</em>' containment reference.
	 * @see #setGtmController(GTMController)
	 * @see TIM.TIMPackage#getGlobalTraceModel_GtmController()
	 * @model containment="true"
	 * @generated
	 */
	GTMController getGtmController();

	/**
	 * Sets the value of the '{@link TIM.GlobalTraceModel#getGtmController <em>Gtm Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gtm Controller</em>' containment reference.
	 * @see #getGtmController()
	 * @generated
	 */
	void setGtmController(GTMController value);

	/**
	 * Returns the value of the '<em><b>Ltm Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltm Controller</em>' containment reference.
	 * @see #setLtmController(LTMController)
	 * @see TIM.TIMPackage#getGlobalTraceModel_LtmController()
	 * @model containment="true"
	 * @generated
	 */
	LTMController getLtmController();

	/**
	 * Sets the value of the '{@link TIM.GlobalTraceModel#getLtmController <em>Ltm Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltm Controller</em>' containment reference.
	 * @see #getLtmController()
	 * @generated
	 */
	void setLtmController(LTMController value);

	/**
	 * Returns the value of the '<em><b>Gtm Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gtm Version</em>' containment reference.
	 * @see #setGtmVersion(GTMVersion)
	 * @see TIM.TIMPackage#getGlobalTraceModel_GtmVersion()
	 * @model containment="true"
	 * @generated
	 */
	GTMVersion getGtmVersion();

	/**
	 * Sets the value of the '{@link TIM.GlobalTraceModel#getGtmVersion <em>Gtm Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gtm Version</em>' containment reference.
	 * @see #getGtmVersion()
	 * @generated
	 */
	void setGtmVersion(GTMVersion value);

	/**
	 * Returns the value of the '<em><b>Sys Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.SystemRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys Requirements</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_SysRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemRequirement> getSysRequirements();

	/**
	 * Returns the value of the '<em><b>Func Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.FunctionalRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Requirements</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_FuncRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalRequirement> getFuncRequirements();

	/**
	 * Returns the value of the '<em><b>Model Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Blocks</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_ModelBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModelBlocks();

	/**
	 * Returns the value of the '<em><b>Test Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Blocks</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_TestBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTestBlocks();

	/**
	 * Returns the value of the '<em><b>Derive Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.Derive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derive Trace Links</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_DeriveTraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Derive> getDeriveTraceLinks();

	/**
	 * Returns the value of the '<em><b>Implement Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.Implement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implement Trace Links</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_ImplementTraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Implement> getImplementTraceLinks();

	/**
	 * Returns the value of the '<em><b>Verify Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.Verify}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Trace Links</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_VerifyTraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Verify> getVerifyTraceLinks();

	/**
	 * Returns the value of the '<em><b>CR Tickets</b></em>' containment reference list.
	 * The list contents are of type {@link TIM.Change_Request_Ticket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CR Tickets</em>' containment reference list.
	 * @see TIM.TIMPackage#getGlobalTraceModel_CR_Tickets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Change_Request_Ticket> getCR_Tickets();

} // GlobalTraceModel
