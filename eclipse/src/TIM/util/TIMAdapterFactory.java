/**
 */
package TIM.util;

import TIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TIM.TIMPackage
 * @generated
 */
public class TIMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TIMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TIMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TIMSwitch<Adapter> modelSwitch =
		new TIMSwitch<Adapter>() {
			@Override
			public Adapter caseGlobalTraceModel(GlobalTraceModel object) {
				return createGlobalTraceModelAdapter();
			}
			@Override
			public Adapter caseGTMController(GTMController object) {
				return createGTMControllerAdapter();
			}
			@Override
			public Adapter caseLTMController(LTMController object) {
				return createLTMControllerAdapter();
			}
			@Override
			public Adapter caseGTMVersion(GTMVersion object) {
				return createGTMVersionAdapter();
			}
			@Override
			public Adapter caseChange_Request_Ticket(Change_Request_Ticket object) {
				return createChange_Request_TicketAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseTraceability(Traceability object) {
				return createTraceabilityAdapter();
			}
			@Override
			public Adapter caseDerive(Derive object) {
				return createDeriveAdapter();
			}
			@Override
			public Adapter caseImplement(Implement object) {
				return createImplementAdapter();
			}
			@Override
			public Adapter caseVerify(Verify object) {
				return createVerifyAdapter();
			}
			@Override
			public Adapter caseSystemRequirement(SystemRequirement object) {
				return createSystemRequirementAdapter();
			}
			@Override
			public Adapter caseFunctionalRequirement(FunctionalRequirement object) {
				return createFunctionalRequirementAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link TIM.GlobalTraceModel <em>Global Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.GlobalTraceModel
	 * @generated
	 */
	public Adapter createGlobalTraceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.GTMController <em>GTM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.GTMController
	 * @generated
	 */
	public Adapter createGTMControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.LTMController <em>LTM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.LTMController
	 * @generated
	 */
	public Adapter createLTMControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.GTMVersion <em>GTM Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.GTMVersion
	 * @generated
	 */
	public Adapter createGTMVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Change_Request_Ticket <em>Change Request Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Change_Request_Ticket
	 * @generated
	 */
	public Adapter createChange_Request_TicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Traceability <em>Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Traceability
	 * @generated
	 */
	public Adapter createTraceabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Derive <em>Derive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Derive
	 * @generated
	 */
	public Adapter createDeriveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Implement <em>Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Implement
	 * @generated
	 */
	public Adapter createImplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Verify
	 * @generated
	 */
	public Adapter createVerifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.SystemRequirement <em>System Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.SystemRequirement
	 * @generated
	 */
	public Adapter createSystemRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.FunctionalRequirement
	 * @generated
	 */
	public Adapter createFunctionalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TIM.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TIM.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TIMAdapterFactory
