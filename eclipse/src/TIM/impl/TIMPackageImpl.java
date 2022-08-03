/**
 */
package TIM.impl;

import TIM.Artifact;
import TIM.Change_Request_Ticket;
import TIM.Derive;
import TIM.FunctionalRequirement;
import TIM.GTMController;
import TIM.GTMVersion;
import TIM.GlobalTraceModel;
import TIM.Implement;
import TIM.LTMController;
import TIM.Model;
import TIM.Progress_Enum;
import TIM.SystemRequirement;
import TIM.TIMFactory;
import TIM.TIMPackage;
import TIM.Test;
import TIM.Traceability;
import TIM.Verify;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TIMPackageImpl extends EPackageImpl implements TIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalTraceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtmControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltmControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtmVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass change_Request_TicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum progress_EnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TIM.TIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TIMPackageImpl() {
		super(eNS_URI, TIMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TIMPackage init() {
		if (isInited) return (TIMPackage)EPackage.Registry.INSTANCE.getEPackage(TIMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTIMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TIMPackageImpl theTIMPackage = registeredTIMPackage instanceof TIMPackageImpl ? (TIMPackageImpl)registeredTIMPackage : new TIMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTIMPackage.createPackageContents();

		// Initialize created meta-data
		theTIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTIMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TIMPackage.eNS_URI, theTIMPackage);
		return theTIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalTraceModel() {
		return globalTraceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_GtmController() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_LtmController() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_GtmVersion() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_SysRequirements() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_FuncRequirements() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_ModelBlocks() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_TestBlocks() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_DeriveTraceLinks() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_ImplementTraceLinks() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_VerifyTraceLinks() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalTraceModel_CR_Tickets() {
		return (EReference)globalTraceModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGTMController() {
		return gtmControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGTMController_CreateNewCR() {
		return (EAttribute)gtmControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGTMController_LtmCR() {
		return (EAttribute)gtmControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTMController() {
		return ltmControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLTMController_Complete() {
		return (EAttribute)ltmControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGTMVersion() {
		return gtmVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGTMVersion_Version() {
		return (EAttribute)gtmVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChange_Request_Ticket() {
		return change_Request_TicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_CrID() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_Summary() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_Description() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_Version() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_ChHelpful() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_MergeRationale() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_PlannedLOE() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChange_Request_Ticket_ActualLOE() {
		return (EAttribute)change_Request_TicketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChange_Request_Ticket_AffectedArtifacts() {
		return (EReference)change_Request_TicketEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_ArtifactID() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Progress() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ChangeRequests() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Select() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraceability() {
		return traceabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraceability_TraceUID() {
		return (EAttribute)traceabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraceability_Valid() {
		return (EAttribute)traceabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerive() {
		return deriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDerive_Type() {
		return (EAttribute)deriveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerive_Source() {
		return (EReference)deriveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerive_Destination() {
		return (EReference)deriveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplement() {
		return implementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImplement_Type() {
		return (EAttribute)implementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplement_Source() {
		return (EReference)implementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplement_Destination() {
		return (EReference)implementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerify() {
		return verifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerify_Type() {
		return (EAttribute)verifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerify_Source() {
		return (EReference)verifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerify_Destination() {
		return (EReference)verifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemRequirement() {
		return systemRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemRequirement_DownstreamArtifacts() {
		return (EReference)systemRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalRequirement() {
		return functionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalRequirement_UpstreamArtifacts() {
		return (EReference)functionalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalRequirement_DownstreamArtifacts() {
		return (EReference)functionalRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_UpstreamArtifacts() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_DownstreamArtifacts() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTest_UpstreamArtifacts() {
		return (EReference)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProgress_Enum() {
		return progress_EnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIMFactory getTIMFactory() {
		return (TIMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		globalTraceModelEClass = createEClass(GLOBAL_TRACE_MODEL);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__GTM_CONTROLLER);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__LTM_CONTROLLER);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__GTM_VERSION);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__MODEL_BLOCKS);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__TEST_BLOCKS);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS);
		createEReference(globalTraceModelEClass, GLOBAL_TRACE_MODEL__CR_TICKETS);

		gtmControllerEClass = createEClass(GTM_CONTROLLER);
		createEAttribute(gtmControllerEClass, GTM_CONTROLLER__CREATE_NEW_CR);
		createEAttribute(gtmControllerEClass, GTM_CONTROLLER__LTM_CR);

		ltmControllerEClass = createEClass(LTM_CONTROLLER);
		createEAttribute(ltmControllerEClass, LTM_CONTROLLER__COMPLETE);

		gtmVersionEClass = createEClass(GTM_VERSION);
		createEAttribute(gtmVersionEClass, GTM_VERSION__VERSION);

		change_Request_TicketEClass = createEClass(CHANGE_REQUEST_TICKET);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__CR_ID);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__SUMMARY);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__DESCRIPTION);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__VERSION);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__CH_HELPFUL);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__MERGE_RATIONALE);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__PLANNED_LOE);
		createEAttribute(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__ACTUAL_LOE);
		createEReference(change_Request_TicketEClass, CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__ARTIFACT_ID);
		createEAttribute(artifactEClass, ARTIFACT__PROGRESS);
		createEReference(artifactEClass, ARTIFACT__CHANGE_REQUESTS);
		createEAttribute(artifactEClass, ARTIFACT__SELECT);

		traceabilityEClass = createEClass(TRACEABILITY);
		createEAttribute(traceabilityEClass, TRACEABILITY__TRACE_UID);
		createEAttribute(traceabilityEClass, TRACEABILITY__VALID);

		deriveEClass = createEClass(DERIVE);
		createEAttribute(deriveEClass, DERIVE__TYPE);
		createEReference(deriveEClass, DERIVE__SOURCE);
		createEReference(deriveEClass, DERIVE__DESTINATION);

		implementEClass = createEClass(IMPLEMENT);
		createEAttribute(implementEClass, IMPLEMENT__TYPE);
		createEReference(implementEClass, IMPLEMENT__SOURCE);
		createEReference(implementEClass, IMPLEMENT__DESTINATION);

		verifyEClass = createEClass(VERIFY);
		createEAttribute(verifyEClass, VERIFY__TYPE);
		createEReference(verifyEClass, VERIFY__SOURCE);
		createEReference(verifyEClass, VERIFY__DESTINATION);

		systemRequirementEClass = createEClass(SYSTEM_REQUIREMENT);
		createEReference(systemRequirementEClass, SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS);

		functionalRequirementEClass = createEClass(FUNCTIONAL_REQUIREMENT);
		createEReference(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS);
		createEReference(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__UPSTREAM_ARTIFACTS);
		createEReference(modelEClass, MODEL__DOWNSTREAM_ARTIFACTS);

		testEClass = createEClass(TEST);
		createEReference(testEClass, TEST__UPSTREAM_ARTIFACTS);

		// Create enums
		progress_EnumEEnum = createEEnum(PROGRESS_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deriveEClass.getESuperTypes().add(this.getTraceability());
		implementEClass.getESuperTypes().add(this.getTraceability());
		verifyEClass.getESuperTypes().add(this.getTraceability());
		systemRequirementEClass.getESuperTypes().add(this.getArtifact());
		functionalRequirementEClass.getESuperTypes().add(this.getArtifact());
		modelEClass.getESuperTypes().add(this.getArtifact());
		testEClass.getESuperTypes().add(this.getArtifact());

		// Initialize classes and features; add operations and parameters
		initEClass(globalTraceModelEClass, GlobalTraceModel.class, "GlobalTraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalTraceModel_GtmController(), this.getGTMController(), null, "gtmController", null, 0, 1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_LtmController(), this.getLTMController(), null, "ltmController", null, 0, 1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_GtmVersion(), this.getGTMVersion(), null, "gtmVersion", null, 0, 1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_SysRequirements(), this.getSystemRequirement(), null, "sysRequirements", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_FuncRequirements(), this.getFunctionalRequirement(), null, "funcRequirements", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_ModelBlocks(), this.getModel(), null, "modelBlocks", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_TestBlocks(), this.getTest(), null, "testBlocks", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_DeriveTraceLinks(), this.getDerive(), null, "deriveTraceLinks", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_ImplementTraceLinks(), this.getImplement(), null, "implementTraceLinks", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_VerifyTraceLinks(), this.getVerify(), null, "verifyTraceLinks", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalTraceModel_CR_Tickets(), this.getChange_Request_Ticket(), null, "CR_Tickets", null, 0, -1, GlobalTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gtmControllerEClass, GTMController.class, "GTMController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGTMController_CreateNewCR(), ecorePackage.getEBooleanObject(), "createNewCR", null, 0, 1, GTMController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGTMController_LtmCR(), ecorePackage.getEString(), "ltmCR", null, 0, 1, GTMController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltmControllerEClass, LTMController.class, "LTMController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLTMController_Complete(), ecorePackage.getEBooleanObject(), "complete", null, 0, 1, LTMController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gtmVersionEClass, GTMVersion.class, "GTMVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGTMVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, GTMVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(change_Request_TicketEClass, Change_Request_Ticket.class, "Change_Request_Ticket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChange_Request_Ticket_CrID(), ecorePackage.getEInt(), "crID", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_Request_Ticket_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_Request_Ticket_Description(), ecorePackage.getEString(), "description", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_Request_Ticket_Version(), ecorePackage.getEString(), "version", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_Request_Ticket_ChHelpful(), ecorePackage.getEString(), "chHelpful", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_Request_Ticket_MergeRationale(), ecorePackage.getEString(), "mergeRationale", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_Request_Ticket_PlannedLOE(), ecorePackage.getEFloatObject(), "plannedLOE", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChange_Request_Ticket_ActualLOE(), ecorePackage.getEFloatObject(), "actualLOE", null, 0, 1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChange_Request_Ticket_AffectedArtifacts(), this.getArtifact(), this.getArtifact_ChangeRequests(), "affectedArtifacts", null, 0, -1, Change_Request_Ticket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_ArtifactID(), ecorePackage.getEString(), "artifactID", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Progress(), this.getProgress_Enum(), "progress", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ChangeRequests(), this.getChange_Request_Ticket(), this.getChange_Request_Ticket_AffectedArtifacts(), "changeRequests", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Select(), ecorePackage.getEBooleanObject(), "select", "false", 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceabilityEClass, Traceability.class, "Traceability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceability_TraceUID(), ecorePackage.getEInt(), "traceUID", null, 0, 1, Traceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceability_Valid(), ecorePackage.getEBooleanObject(), "valid", "true", 0, 1, Traceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deriveEClass, Derive.class, "Derive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerive_Type(), ecorePackage.getEString(), "type", "DERIVE", 0, 1, Derive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerive_Source(), this.getSystemRequirement(), null, "source", null, 0, 1, Derive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerive_Destination(), this.getFunctionalRequirement(), null, "destination", null, 0, 1, Derive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementEClass, Implement.class, "Implement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplement_Type(), ecorePackage.getEString(), "type", "IMPLEMENT", 0, 1, Implement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplement_Source(), this.getFunctionalRequirement(), null, "source", null, 0, 1, Implement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplement_Destination(), this.getModel(), null, "destination", null, 0, 1, Implement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verifyEClass, Verify.class, "Verify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerify_Type(), ecorePackage.getEString(), "type", "VERIFY", 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerify_Source(), this.getFunctionalRequirement(), null, "source", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerify_Destination(), this.getTest(), null, "destination", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemRequirementEClass, SystemRequirement.class, "SystemRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRequirement_DownstreamArtifacts(), this.getDerive(), null, "downstreamArtifacts", null, 0, -1, SystemRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalRequirementEClass, FunctionalRequirement.class, "FunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalRequirement_UpstreamArtifacts(), this.getDerive(), null, "upstreamArtifacts", null, 0, -1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalRequirement_DownstreamArtifacts(), this.getImplement(), null, "downstreamArtifacts", null, 0, -1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_UpstreamArtifacts(), this.getImplement(), null, "upstreamArtifacts", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_DownstreamArtifacts(), this.getVerify(), null, "downstreamArtifacts", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTest_UpstreamArtifacts(), this.getVerify(), null, "upstreamArtifacts", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(progress_EnumEEnum, Progress_Enum.class, "Progress_Enum");
		addEEnumLiteral(progress_EnumEEnum, Progress_Enum.ZERO);
		addEEnumLiteral(progress_EnumEEnum, Progress_Enum.TWENTY_FIVE_PERCENT);
		addEEnumLiteral(progress_EnumEEnum, Progress_Enum.FIFTY_PERCENT);
		addEEnumLiteral(progress_EnumEEnum, Progress_Enum.SEVENTY_FIVE_PERCENT);
		addEEnumLiteral(progress_EnumEEnum, Progress_Enum.HUNDERD_PERCENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (globalTraceModelEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (gtmControllerEClass,
		   source,
		   new String[] {
			   "label", "createNewCR, ltmCR",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "label.pattern", "Create New CR: {0} (OR) LTM CR: {1}"
		   });
		addAnnotation
		  (ltmControllerEClass,
		   source,
		   new String[] {
			   "label", "complete",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "label.pattern", "CR Complete: {0}"
		   });
		addAnnotation
		  (gtmVersionEClass,
		   source,
		   new String[] {
			   "label", "version",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "label.pattern", "Build Version: {0}"
		   });
		addAnnotation
		  (change_Request_TicketEClass,
		   source,
		   new String[] {
			   "label", "crID",
			   "label.pattern", "CR - #{0}",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "phantom", "true"
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "label", "artifactID, progress",
			   "label.icon", "false",
			   "figure", "ellipse",
			   "label.color", "255,255,255",
			   "label.pattern", "{0}, Prog: {1}"
		   });
		addAnnotation
		  (systemRequirementEClass,
		   source,
		   new String[] {
			   "label.pattern", "{0}, Progress: {1}",
			   "color", "75,0,0"
		   });
		addAnnotation
		  (functionalRequirementEClass,
		   source,
		   new String[] {
			   "label.pattern", "{0}, Progress: {1}",
			   "color", "175,0,0"
		   });
		addAnnotation
		  (modelEClass,
		   source,
		   new String[] {
			   "label.pattern", "{0}, Progress: {1}",
			   "color", "0,125,0"
		   });
		addAnnotation
		  (testEClass,
		   source,
		   new String[] {
			   "label.pattern", "{0}, Progress: {1}",
			   "color", "0,0,125"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (traceabilityEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "destination",
			   "source.constraint", "self <> oppositeEnd",
			   "source.decoration", "filledclosedarrow",
			   "target.constraint", "self <> oppositeEnd",
			   "target.decoration", "filledclosedarrow"
		   });
		addAnnotation
		  (deriveEClass,
		   source,
		   new String[] {
			   "label", "type"
		   });
		addAnnotation
		  (implementEClass,
		   source,
		   new String[] {
			   "label", "type"
		   });
		addAnnotation
		  (verifyEClass,
		   source,
		   new String[] {
			   "label", "type"
		   });
	}

} //TIMPackageImpl
