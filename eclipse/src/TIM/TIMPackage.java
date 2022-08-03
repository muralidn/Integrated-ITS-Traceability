/**
 */
package TIM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TIM.TIMFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface TIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Trace_Information_Model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TIMPackage eINSTANCE = TIM.impl.TIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link TIM.impl.GlobalTraceModelImpl <em>Global Trace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.GlobalTraceModelImpl
	 * @see TIM.impl.TIMPackageImpl#getGlobalTraceModel()
	 * @generated
	 */
	int GLOBAL_TRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Gtm Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__GTM_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Ltm Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__LTM_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Gtm Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__GTM_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Sys Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS = 3;

	/**
	 * The feature id for the '<em><b>Func Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS = 4;

	/**
	 * The feature id for the '<em><b>Model Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__MODEL_BLOCKS = 5;

	/**
	 * The feature id for the '<em><b>Test Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__TEST_BLOCKS = 6;

	/**
	 * The feature id for the '<em><b>Derive Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS = 7;

	/**
	 * The feature id for the '<em><b>Implement Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS = 8;

	/**
	 * The feature id for the '<em><b>Verify Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS = 9;

	/**
	 * The feature id for the '<em><b>CR Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL__CR_TICKETS = 10;

	/**
	 * The number of structural features of the '<em>Global Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TRACE_MODEL_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link TIM.impl.GTMControllerImpl <em>GTM Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.GTMControllerImpl
	 * @see TIM.impl.TIMPackageImpl#getGTMController()
	 * @generated
	 */
	int GTM_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Create New CR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_CONTROLLER__CREATE_NEW_CR = 0;

	/**
	 * The feature id for the '<em><b>Ltm CR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_CONTROLLER__LTM_CR = 1;

	/**
	 * The number of structural features of the '<em>GTM Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link TIM.impl.LTMControllerImpl <em>LTM Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.LTMControllerImpl
	 * @see TIM.impl.TIMPackageImpl#getLTMController()
	 * @generated
	 */
	int LTM_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTM_CONTROLLER__COMPLETE = 0;

	/**
	 * The number of structural features of the '<em>LTM Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTM_CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link TIM.impl.GTMVersionImpl <em>GTM Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.GTMVersionImpl
	 * @see TIM.impl.TIMPackageImpl#getGTMVersion()
	 * @generated
	 */
	int GTM_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_VERSION__VERSION = 0;

	/**
	 * The number of structural features of the '<em>GTM Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_VERSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link TIM.impl.Change_Request_TicketImpl <em>Change Request Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.Change_Request_TicketImpl
	 * @see TIM.impl.TIMPackageImpl#getChange_Request_Ticket()
	 * @generated
	 */
	int CHANGE_REQUEST_TICKET = 4;

	/**
	 * The feature id for the '<em><b>Cr ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__CR_ID = 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Ch Helpful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__CH_HELPFUL = 4;

	/**
	 * The feature id for the '<em><b>Merge Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__MERGE_RATIONALE = 5;

	/**
	 * The feature id for the '<em><b>Planned LOE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__PLANNED_LOE = 6;

	/**
	 * The feature id for the '<em><b>Actual LOE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__ACTUAL_LOE = 7;

	/**
	 * The feature id for the '<em><b>Affected Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS = 8;

	/**
	 * The number of structural features of the '<em>Change Request Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_TICKET_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link TIM.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.ArtifactImpl
	 * @see TIM.impl.TIMPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 5;

	/**
	 * The feature id for the '<em><b>Artifact ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ARTIFACT_ID = 0;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PROGRESS = 1;

	/**
	 * The feature id for the '<em><b>Change Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CHANGE_REQUESTS = 2;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__SELECT = 3;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link TIM.impl.TraceabilityImpl <em>Traceability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.TraceabilityImpl
	 * @see TIM.impl.TIMPackageImpl#getTraceability()
	 * @generated
	 */
	int TRACEABILITY = 6;

	/**
	 * The feature id for the '<em><b>Trace UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY__TRACE_UID = 0;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY__VALID = 1;

	/**
	 * The number of structural features of the '<em>Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link TIM.impl.DeriveImpl <em>Derive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.DeriveImpl
	 * @see TIM.impl.TIMPackageImpl#getDerive()
	 * @generated
	 */
	int DERIVE = 7;

	/**
	 * The feature id for the '<em><b>Trace UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__TRACE_UID = TRACEABILITY__TRACE_UID;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__VALID = TRACEABILITY__VALID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__TYPE = TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__SOURCE = TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE__DESTINATION = TRACEABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Derive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_FEATURE_COUNT = TRACEABILITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link TIM.impl.ImplementImpl <em>Implement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.ImplementImpl
	 * @see TIM.impl.TIMPackageImpl#getImplement()
	 * @generated
	 */
	int IMPLEMENT = 8;

	/**
	 * The feature id for the '<em><b>Trace UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT__TRACE_UID = TRACEABILITY__TRACE_UID;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT__VALID = TRACEABILITY__VALID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT__TYPE = TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT__SOURCE = TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT__DESTINATION = TRACEABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Implement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_FEATURE_COUNT = TRACEABILITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link TIM.impl.VerifyImpl <em>Verify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.VerifyImpl
	 * @see TIM.impl.TIMPackageImpl#getVerify()
	 * @generated
	 */
	int VERIFY = 9;

	/**
	 * The feature id for the '<em><b>Trace UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TRACE_UID = TRACEABILITY__TRACE_UID;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__VALID = TRACEABILITY__VALID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TYPE = TRACEABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SOURCE = TRACEABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__DESTINATION = TRACEABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_FEATURE_COUNT = TRACEABILITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link TIM.impl.SystemRequirementImpl <em>System Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.SystemRequirementImpl
	 * @see TIM.impl.TIMPackageImpl#getSystemRequirement()
	 * @generated
	 */
	int SYSTEM_REQUIREMENT = 10;

	/**
	 * The feature id for the '<em><b>Artifact ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__ARTIFACT_ID = ARTIFACT__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__PROGRESS = ARTIFACT__PROGRESS;

	/**
	 * The feature id for the '<em><b>Change Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__CHANGE_REQUESTS = ARTIFACT__CHANGE_REQUESTS;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__SELECT = ARTIFACT__SELECT;

	/**
	 * The feature id for the '<em><b>Downstream Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TIM.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.FunctionalRequirementImpl
	 * @see TIM.impl.TIMPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Artifact ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ARTIFACT_ID = ARTIFACT__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PROGRESS = ARTIFACT__PROGRESS;

	/**
	 * The feature id for the '<em><b>Change Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__CHANGE_REQUESTS = ARTIFACT__CHANGE_REQUESTS;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SELECT = ARTIFACT__SELECT;

	/**
	 * The feature id for the '<em><b>Upstream Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Downstream Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link TIM.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.ModelImpl
	 * @see TIM.impl.TIMPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 12;

	/**
	 * The feature id for the '<em><b>Artifact ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARTIFACT_ID = ARTIFACT__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROGRESS = ARTIFACT__PROGRESS;

	/**
	 * The feature id for the '<em><b>Change Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CHANGE_REQUESTS = ARTIFACT__CHANGE_REQUESTS;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SELECT = ARTIFACT__SELECT;

	/**
	 * The feature id for the '<em><b>Upstream Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__UPSTREAM_ARTIFACTS = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Downstream Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOWNSTREAM_ARTIFACTS = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link TIM.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.impl.TestImpl
	 * @see TIM.impl.TIMPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 13;

	/**
	 * The feature id for the '<em><b>Artifact ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ARTIFACT_ID = ARTIFACT__ARTIFACT_ID;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PROGRESS = ARTIFACT__PROGRESS;

	/**
	 * The feature id for the '<em><b>Change Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CHANGE_REQUESTS = ARTIFACT__CHANGE_REQUESTS;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SELECT = ARTIFACT__SELECT;

	/**
	 * The feature id for the '<em><b>Upstream Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__UPSTREAM_ARTIFACTS = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TIM.Progress_Enum <em>Progress Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TIM.Progress_Enum
	 * @see TIM.impl.TIMPackageImpl#getProgress_Enum()
	 * @generated
	 */
	int PROGRESS_ENUM = 14;


	/**
	 * Returns the meta object for class '{@link TIM.GlobalTraceModel <em>Global Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Trace Model</em>'.
	 * @see TIM.GlobalTraceModel
	 * @generated
	 */
	EClass getGlobalTraceModel();

	/**
	 * Returns the meta object for the containment reference '{@link TIM.GlobalTraceModel#getGtmController <em>Gtm Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gtm Controller</em>'.
	 * @see TIM.GlobalTraceModel#getGtmController()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_GtmController();

	/**
	 * Returns the meta object for the containment reference '{@link TIM.GlobalTraceModel#getLtmController <em>Ltm Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ltm Controller</em>'.
	 * @see TIM.GlobalTraceModel#getLtmController()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_LtmController();

	/**
	 * Returns the meta object for the containment reference '{@link TIM.GlobalTraceModel#getGtmVersion <em>Gtm Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gtm Version</em>'.
	 * @see TIM.GlobalTraceModel#getGtmVersion()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_GtmVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getSysRequirements <em>Sys Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sys Requirements</em>'.
	 * @see TIM.GlobalTraceModel#getSysRequirements()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_SysRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getFuncRequirements <em>Func Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Func Requirements</em>'.
	 * @see TIM.GlobalTraceModel#getFuncRequirements()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_FuncRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getModelBlocks <em>Model Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Blocks</em>'.
	 * @see TIM.GlobalTraceModel#getModelBlocks()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_ModelBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getTestBlocks <em>Test Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Blocks</em>'.
	 * @see TIM.GlobalTraceModel#getTestBlocks()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_TestBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getDeriveTraceLinks <em>Derive Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derive Trace Links</em>'.
	 * @see TIM.GlobalTraceModel#getDeriveTraceLinks()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_DeriveTraceLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getImplementTraceLinks <em>Implement Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implement Trace Links</em>'.
	 * @see TIM.GlobalTraceModel#getImplementTraceLinks()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_ImplementTraceLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getVerifyTraceLinks <em>Verify Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verify Trace Links</em>'.
	 * @see TIM.GlobalTraceModel#getVerifyTraceLinks()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_VerifyTraceLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link TIM.GlobalTraceModel#getCR_Tickets <em>CR Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CR Tickets</em>'.
	 * @see TIM.GlobalTraceModel#getCR_Tickets()
	 * @see #getGlobalTraceModel()
	 * @generated
	 */
	EReference getGlobalTraceModel_CR_Tickets();

	/**
	 * Returns the meta object for class '{@link TIM.GTMController <em>GTM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTM Controller</em>'.
	 * @see TIM.GTMController
	 * @generated
	 */
	EClass getGTMController();

	/**
	 * Returns the meta object for the attribute '{@link TIM.GTMController#getCreateNewCR <em>Create New CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create New CR</em>'.
	 * @see TIM.GTMController#getCreateNewCR()
	 * @see #getGTMController()
	 * @generated
	 */
	EAttribute getGTMController_CreateNewCR();

	/**
	 * Returns the meta object for the attribute '{@link TIM.GTMController#getLtmCR <em>Ltm CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltm CR</em>'.
	 * @see TIM.GTMController#getLtmCR()
	 * @see #getGTMController()
	 * @generated
	 */
	EAttribute getGTMController_LtmCR();

	/**
	 * Returns the meta object for class '{@link TIM.LTMController <em>LTM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTM Controller</em>'.
	 * @see TIM.LTMController
	 * @generated
	 */
	EClass getLTMController();

	/**
	 * Returns the meta object for the attribute '{@link TIM.LTMController#getComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see TIM.LTMController#getComplete()
	 * @see #getLTMController()
	 * @generated
	 */
	EAttribute getLTMController_Complete();

	/**
	 * Returns the meta object for class '{@link TIM.GTMVersion <em>GTM Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTM Version</em>'.
	 * @see TIM.GTMVersion
	 * @generated
	 */
	EClass getGTMVersion();

	/**
	 * Returns the meta object for the attribute '{@link TIM.GTMVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see TIM.GTMVersion#getVersion()
	 * @see #getGTMVersion()
	 * @generated
	 */
	EAttribute getGTMVersion_Version();

	/**
	 * Returns the meta object for class '{@link TIM.Change_Request_Ticket <em>Change Request Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Request Ticket</em>'.
	 * @see TIM.Change_Request_Ticket
	 * @generated
	 */
	EClass getChange_Request_Ticket();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getCrID <em>Cr ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr ID</em>'.
	 * @see TIM.Change_Request_Ticket#getCrID()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_CrID();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see TIM.Change_Request_Ticket#getSummary()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_Summary();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see TIM.Change_Request_Ticket#getDescription()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_Description();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see TIM.Change_Request_Ticket#getVersion()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_Version();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getChHelpful <em>Ch Helpful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ch Helpful</em>'.
	 * @see TIM.Change_Request_Ticket#getChHelpful()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_ChHelpful();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getMergeRationale <em>Merge Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Rationale</em>'.
	 * @see TIM.Change_Request_Ticket#getMergeRationale()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_MergeRationale();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getPlannedLOE <em>Planned LOE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned LOE</em>'.
	 * @see TIM.Change_Request_Ticket#getPlannedLOE()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_PlannedLOE();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Change_Request_Ticket#getActualLOE <em>Actual LOE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual LOE</em>'.
	 * @see TIM.Change_Request_Ticket#getActualLOE()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EAttribute getChange_Request_Ticket_ActualLOE();

	/**
	 * Returns the meta object for the reference list '{@link TIM.Change_Request_Ticket#getAffectedArtifacts <em>Affected Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Artifacts</em>'.
	 * @see TIM.Change_Request_Ticket#getAffectedArtifacts()
	 * @see #getChange_Request_Ticket()
	 * @generated
	 */
	EReference getChange_Request_Ticket_AffectedArtifacts();

	/**
	 * Returns the meta object for class '{@link TIM.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see TIM.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Artifact#getArtifactID <em>Artifact ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact ID</em>'.
	 * @see TIM.Artifact#getArtifactID()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_ArtifactID();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Artifact#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see TIM.Artifact#getProgress()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Progress();

	/**
	 * Returns the meta object for the reference list '{@link TIM.Artifact#getChangeRequests <em>Change Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Requests</em>'.
	 * @see TIM.Artifact#getChangeRequests()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ChangeRequests();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Artifact#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select</em>'.
	 * @see TIM.Artifact#getSelect()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Select();

	/**
	 * Returns the meta object for class '{@link TIM.Traceability <em>Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability</em>'.
	 * @see TIM.Traceability
	 * @generated
	 */
	EClass getTraceability();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Traceability#getTraceUID <em>Trace UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace UID</em>'.
	 * @see TIM.Traceability#getTraceUID()
	 * @see #getTraceability()
	 * @generated
	 */
	EAttribute getTraceability_TraceUID();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Traceability#getValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see TIM.Traceability#getValid()
	 * @see #getTraceability()
	 * @generated
	 */
	EAttribute getTraceability_Valid();

	/**
	 * Returns the meta object for class '{@link TIM.Derive <em>Derive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derive</em>'.
	 * @see TIM.Derive
	 * @generated
	 */
	EClass getDerive();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Derive#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TIM.Derive#getType()
	 * @see #getDerive()
	 * @generated
	 */
	EAttribute getDerive_Type();

	/**
	 * Returns the meta object for the reference '{@link TIM.Derive#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see TIM.Derive#getSource()
	 * @see #getDerive()
	 * @generated
	 */
	EReference getDerive_Source();

	/**
	 * Returns the meta object for the reference '{@link TIM.Derive#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see TIM.Derive#getDestination()
	 * @see #getDerive()
	 * @generated
	 */
	EReference getDerive_Destination();

	/**
	 * Returns the meta object for class '{@link TIM.Implement <em>Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implement</em>'.
	 * @see TIM.Implement
	 * @generated
	 */
	EClass getImplement();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Implement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TIM.Implement#getType()
	 * @see #getImplement()
	 * @generated
	 */
	EAttribute getImplement_Type();

	/**
	 * Returns the meta object for the reference '{@link TIM.Implement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see TIM.Implement#getSource()
	 * @see #getImplement()
	 * @generated
	 */
	EReference getImplement_Source();

	/**
	 * Returns the meta object for the reference '{@link TIM.Implement#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see TIM.Implement#getDestination()
	 * @see #getImplement()
	 * @generated
	 */
	EReference getImplement_Destination();

	/**
	 * Returns the meta object for class '{@link TIM.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verify</em>'.
	 * @see TIM.Verify
	 * @generated
	 */
	EClass getVerify();

	/**
	 * Returns the meta object for the attribute '{@link TIM.Verify#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TIM.Verify#getType()
	 * @see #getVerify()
	 * @generated
	 */
	EAttribute getVerify_Type();

	/**
	 * Returns the meta object for the reference '{@link TIM.Verify#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see TIM.Verify#getSource()
	 * @see #getVerify()
	 * @generated
	 */
	EReference getVerify_Source();

	/**
	 * Returns the meta object for the reference '{@link TIM.Verify#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see TIM.Verify#getDestination()
	 * @see #getVerify()
	 * @generated
	 */
	EReference getVerify_Destination();

	/**
	 * Returns the meta object for class '{@link TIM.SystemRequirement <em>System Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Requirement</em>'.
	 * @see TIM.SystemRequirement
	 * @generated
	 */
	EClass getSystemRequirement();

	/**
	 * Returns the meta object for the reference list '{@link TIM.SystemRequirement#getDownstreamArtifacts <em>Downstream Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Downstream Artifacts</em>'.
	 * @see TIM.SystemRequirement#getDownstreamArtifacts()
	 * @see #getSystemRequirement()
	 * @generated
	 */
	EReference getSystemRequirement_DownstreamArtifacts();

	/**
	 * Returns the meta object for class '{@link TIM.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see TIM.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for the reference list '{@link TIM.FunctionalRequirement#getUpstreamArtifacts <em>Upstream Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upstream Artifacts</em>'.
	 * @see TIM.FunctionalRequirement#getUpstreamArtifacts()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_UpstreamArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link TIM.FunctionalRequirement#getDownstreamArtifacts <em>Downstream Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Downstream Artifacts</em>'.
	 * @see TIM.FunctionalRequirement#getDownstreamArtifacts()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_DownstreamArtifacts();

	/**
	 * Returns the meta object for class '{@link TIM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see TIM.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the reference list '{@link TIM.Model#getUpstreamArtifacts <em>Upstream Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upstream Artifacts</em>'.
	 * @see TIM.Model#getUpstreamArtifacts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_UpstreamArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link TIM.Model#getDownstreamArtifacts <em>Downstream Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Downstream Artifacts</em>'.
	 * @see TIM.Model#getDownstreamArtifacts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DownstreamArtifacts();

	/**
	 * Returns the meta object for class '{@link TIM.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see TIM.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the reference list '{@link TIM.Test#getUpstreamArtifacts <em>Upstream Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upstream Artifacts</em>'.
	 * @see TIM.Test#getUpstreamArtifacts()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_UpstreamArtifacts();

	/**
	 * Returns the meta object for enum '{@link TIM.Progress_Enum <em>Progress Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Progress Enum</em>'.
	 * @see TIM.Progress_Enum
	 * @generated
	 */
	EEnum getProgress_Enum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TIMFactory getTIMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TIM.impl.GlobalTraceModelImpl <em>Global Trace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.GlobalTraceModelImpl
		 * @see TIM.impl.TIMPackageImpl#getGlobalTraceModel()
		 * @generated
		 */
		EClass GLOBAL_TRACE_MODEL = eINSTANCE.getGlobalTraceModel();

		/**
		 * The meta object literal for the '<em><b>Gtm Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__GTM_CONTROLLER = eINSTANCE.getGlobalTraceModel_GtmController();

		/**
		 * The meta object literal for the '<em><b>Ltm Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__LTM_CONTROLLER = eINSTANCE.getGlobalTraceModel_LtmController();

		/**
		 * The meta object literal for the '<em><b>Gtm Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__GTM_VERSION = eINSTANCE.getGlobalTraceModel_GtmVersion();

		/**
		 * The meta object literal for the '<em><b>Sys Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS = eINSTANCE.getGlobalTraceModel_SysRequirements();

		/**
		 * The meta object literal for the '<em><b>Func Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS = eINSTANCE.getGlobalTraceModel_FuncRequirements();

		/**
		 * The meta object literal for the '<em><b>Model Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__MODEL_BLOCKS = eINSTANCE.getGlobalTraceModel_ModelBlocks();

		/**
		 * The meta object literal for the '<em><b>Test Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__TEST_BLOCKS = eINSTANCE.getGlobalTraceModel_TestBlocks();

		/**
		 * The meta object literal for the '<em><b>Derive Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS = eINSTANCE.getGlobalTraceModel_DeriveTraceLinks();

		/**
		 * The meta object literal for the '<em><b>Implement Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS = eINSTANCE.getGlobalTraceModel_ImplementTraceLinks();

		/**
		 * The meta object literal for the '<em><b>Verify Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS = eINSTANCE.getGlobalTraceModel_VerifyTraceLinks();

		/**
		 * The meta object literal for the '<em><b>CR Tickets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TRACE_MODEL__CR_TICKETS = eINSTANCE.getGlobalTraceModel_CR_Tickets();

		/**
		 * The meta object literal for the '{@link TIM.impl.GTMControllerImpl <em>GTM Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.GTMControllerImpl
		 * @see TIM.impl.TIMPackageImpl#getGTMController()
		 * @generated
		 */
		EClass GTM_CONTROLLER = eINSTANCE.getGTMController();

		/**
		 * The meta object literal for the '<em><b>Create New CR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GTM_CONTROLLER__CREATE_NEW_CR = eINSTANCE.getGTMController_CreateNewCR();

		/**
		 * The meta object literal for the '<em><b>Ltm CR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GTM_CONTROLLER__LTM_CR = eINSTANCE.getGTMController_LtmCR();

		/**
		 * The meta object literal for the '{@link TIM.impl.LTMControllerImpl <em>LTM Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.LTMControllerImpl
		 * @see TIM.impl.TIMPackageImpl#getLTMController()
		 * @generated
		 */
		EClass LTM_CONTROLLER = eINSTANCE.getLTMController();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTM_CONTROLLER__COMPLETE = eINSTANCE.getLTMController_Complete();

		/**
		 * The meta object literal for the '{@link TIM.impl.GTMVersionImpl <em>GTM Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.GTMVersionImpl
		 * @see TIM.impl.TIMPackageImpl#getGTMVersion()
		 * @generated
		 */
		EClass GTM_VERSION = eINSTANCE.getGTMVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GTM_VERSION__VERSION = eINSTANCE.getGTMVersion_Version();

		/**
		 * The meta object literal for the '{@link TIM.impl.Change_Request_TicketImpl <em>Change Request Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.Change_Request_TicketImpl
		 * @see TIM.impl.TIMPackageImpl#getChange_Request_Ticket()
		 * @generated
		 */
		EClass CHANGE_REQUEST_TICKET = eINSTANCE.getChange_Request_Ticket();

		/**
		 * The meta object literal for the '<em><b>Cr ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__CR_ID = eINSTANCE.getChange_Request_Ticket_CrID();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__SUMMARY = eINSTANCE.getChange_Request_Ticket_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__DESCRIPTION = eINSTANCE.getChange_Request_Ticket_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__VERSION = eINSTANCE.getChange_Request_Ticket_Version();

		/**
		 * The meta object literal for the '<em><b>Ch Helpful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__CH_HELPFUL = eINSTANCE.getChange_Request_Ticket_ChHelpful();

		/**
		 * The meta object literal for the '<em><b>Merge Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__MERGE_RATIONALE = eINSTANCE.getChange_Request_Ticket_MergeRationale();

		/**
		 * The meta object literal for the '<em><b>Planned LOE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__PLANNED_LOE = eINSTANCE.getChange_Request_Ticket_PlannedLOE();

		/**
		 * The meta object literal for the '<em><b>Actual LOE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST_TICKET__ACTUAL_LOE = eINSTANCE.getChange_Request_Ticket_ActualLOE();

		/**
		 * The meta object literal for the '<em><b>Affected Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS = eINSTANCE.getChange_Request_Ticket_AffectedArtifacts();

		/**
		 * The meta object literal for the '{@link TIM.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.ArtifactImpl
		 * @see TIM.impl.TIMPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__ARTIFACT_ID = eINSTANCE.getArtifact_ArtifactID();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PROGRESS = eINSTANCE.getArtifact_Progress();

		/**
		 * The meta object literal for the '<em><b>Change Requests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CHANGE_REQUESTS = eINSTANCE.getArtifact_ChangeRequests();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__SELECT = eINSTANCE.getArtifact_Select();

		/**
		 * The meta object literal for the '{@link TIM.impl.TraceabilityImpl <em>Traceability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.TraceabilityImpl
		 * @see TIM.impl.TIMPackageImpl#getTraceability()
		 * @generated
		 */
		EClass TRACEABILITY = eINSTANCE.getTraceability();

		/**
		 * The meta object literal for the '<em><b>Trace UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY__TRACE_UID = eINSTANCE.getTraceability_TraceUID();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY__VALID = eINSTANCE.getTraceability_Valid();

		/**
		 * The meta object literal for the '{@link TIM.impl.DeriveImpl <em>Derive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.DeriveImpl
		 * @see TIM.impl.TIMPackageImpl#getDerive()
		 * @generated
		 */
		EClass DERIVE = eINSTANCE.getDerive();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVE__TYPE = eINSTANCE.getDerive_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE__SOURCE = eINSTANCE.getDerive_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE__DESTINATION = eINSTANCE.getDerive_Destination();

		/**
		 * The meta object literal for the '{@link TIM.impl.ImplementImpl <em>Implement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.ImplementImpl
		 * @see TIM.impl.TIMPackageImpl#getImplement()
		 * @generated
		 */
		EClass IMPLEMENT = eINSTANCE.getImplement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENT__TYPE = eINSTANCE.getImplement_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENT__SOURCE = eINSTANCE.getImplement_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENT__DESTINATION = eINSTANCE.getImplement_Destination();

		/**
		 * The meta object literal for the '{@link TIM.impl.VerifyImpl <em>Verify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.VerifyImpl
		 * @see TIM.impl.TIMPackageImpl#getVerify()
		 * @generated
		 */
		EClass VERIFY = eINSTANCE.getVerify();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFY__TYPE = eINSTANCE.getVerify_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFY__SOURCE = eINSTANCE.getVerify_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFY__DESTINATION = eINSTANCE.getVerify_Destination();

		/**
		 * The meta object literal for the '{@link TIM.impl.SystemRequirementImpl <em>System Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.SystemRequirementImpl
		 * @see TIM.impl.TIMPackageImpl#getSystemRequirement()
		 * @generated
		 */
		EClass SYSTEM_REQUIREMENT = eINSTANCE.getSystemRequirement();

		/**
		 * The meta object literal for the '<em><b>Downstream Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS = eINSTANCE.getSystemRequirement_DownstreamArtifacts();

		/**
		 * The meta object literal for the '{@link TIM.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.FunctionalRequirementImpl
		 * @see TIM.impl.TIMPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Upstream Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS = eINSTANCE.getFunctionalRequirement_UpstreamArtifacts();

		/**
		 * The meta object literal for the '<em><b>Downstream Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS = eINSTANCE.getFunctionalRequirement_DownstreamArtifacts();

		/**
		 * The meta object literal for the '{@link TIM.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.ModelImpl
		 * @see TIM.impl.TIMPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Upstream Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__UPSTREAM_ARTIFACTS = eINSTANCE.getModel_UpstreamArtifacts();

		/**
		 * The meta object literal for the '<em><b>Downstream Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DOWNSTREAM_ARTIFACTS = eINSTANCE.getModel_DownstreamArtifacts();

		/**
		 * The meta object literal for the '{@link TIM.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.impl.TestImpl
		 * @see TIM.impl.TIMPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Upstream Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__UPSTREAM_ARTIFACTS = eINSTANCE.getTest_UpstreamArtifacts();

		/**
		 * The meta object literal for the '{@link TIM.Progress_Enum <em>Progress Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TIM.Progress_Enum
		 * @see TIM.impl.TIMPackageImpl#getProgress_Enum()
		 * @generated
		 */
		EEnum PROGRESS_ENUM = eINSTANCE.getProgress_Enum();

	}

} //TIMPackage
