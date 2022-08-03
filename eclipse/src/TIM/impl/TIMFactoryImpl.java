/**
 */
package TIM.impl;

import TIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TIMFactoryImpl extends EFactoryImpl implements TIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TIMFactory init() {
		try {
			TIMFactory theTIMFactory = (TIMFactory)EPackage.Registry.INSTANCE.getEFactory(TIMPackage.eNS_URI);
			if (theTIMFactory != null) {
				return theTIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TIMPackage.GLOBAL_TRACE_MODEL: return createGlobalTraceModel();
			case TIMPackage.GTM_CONTROLLER: return createGTMController();
			case TIMPackage.LTM_CONTROLLER: return createLTMController();
			case TIMPackage.GTM_VERSION: return createGTMVersion();
			case TIMPackage.CHANGE_REQUEST_TICKET: return createChange_Request_Ticket();
			case TIMPackage.DERIVE: return createDerive();
			case TIMPackage.IMPLEMENT: return createImplement();
			case TIMPackage.VERIFY: return createVerify();
			case TIMPackage.SYSTEM_REQUIREMENT: return createSystemRequirement();
			case TIMPackage.FUNCTIONAL_REQUIREMENT: return createFunctionalRequirement();
			case TIMPackage.MODEL: return createModel();
			case TIMPackage.TEST: return createTest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TIMPackage.PROGRESS_ENUM:
				return createProgress_EnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TIMPackage.PROGRESS_ENUM:
				return convertProgress_EnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalTraceModel createGlobalTraceModel() {
		GlobalTraceModelImpl globalTraceModel = new GlobalTraceModelImpl();
		return globalTraceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GTMController createGTMController() {
		GTMControllerImpl gtmController = new GTMControllerImpl();
		return gtmController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LTMController createLTMController() {
		LTMControllerImpl ltmController = new LTMControllerImpl();
		return ltmController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GTMVersion createGTMVersion() {
		GTMVersionImpl gtmVersion = new GTMVersionImpl();
		return gtmVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Change_Request_Ticket createChange_Request_Ticket() {
		Change_Request_TicketImpl change_Request_Ticket = new Change_Request_TicketImpl();
		return change_Request_Ticket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Derive createDerive() {
		DeriveImpl derive = new DeriveImpl();
		return derive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Implement createImplement() {
		ImplementImpl implement = new ImplementImpl();
		return implement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verify createVerify() {
		VerifyImpl verify = new VerifyImpl();
		return verify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemRequirement createSystemRequirement() {
		SystemRequirementImpl systemRequirement = new SystemRequirementImpl();
		return systemRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalRequirement createFunctionalRequirement() {
		FunctionalRequirementImpl functionalRequirement = new FunctionalRequirementImpl();
		return functionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Progress_Enum createProgress_EnumFromString(EDataType eDataType, String initialValue) {
		Progress_Enum result = Progress_Enum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgress_EnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIMPackage getTIMPackage() {
		return (TIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TIMPackage getPackage() {
		return TIMPackage.eINSTANCE;
	}

} //TIMFactoryImpl
