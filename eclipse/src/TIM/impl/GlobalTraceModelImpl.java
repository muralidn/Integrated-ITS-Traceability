/**
 */
package TIM.impl;

import TIM.Change_Request_Ticket;
import TIM.Derive;
import TIM.FunctionalRequirement;
import TIM.GTMController;
import TIM.GTMVersion;
import TIM.GlobalTraceModel;
import TIM.Implement;
import TIM.LTMController;
import TIM.Model;
import TIM.SystemRequirement;
import TIM.TIMPackage;
import TIM.Test;
import TIM.Verify;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getGtmController <em>Gtm Controller</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getLtmController <em>Ltm Controller</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getGtmVersion <em>Gtm Version</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getSysRequirements <em>Sys Requirements</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getFuncRequirements <em>Func Requirements</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getModelBlocks <em>Model Blocks</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getTestBlocks <em>Test Blocks</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getDeriveTraceLinks <em>Derive Trace Links</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getImplementTraceLinks <em>Implement Trace Links</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getVerifyTraceLinks <em>Verify Trace Links</em>}</li>
 *   <li>{@link TIM.impl.GlobalTraceModelImpl#getCR_Tickets <em>CR Tickets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalTraceModelImpl extends EObjectImpl implements GlobalTraceModel {
	/**
	 * The cached value of the '{@link #getGtmController() <em>Gtm Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGtmController()
	 * @generated
	 * @ordered
	 */
	protected GTMController gtmController;

	/**
	 * The cached value of the '{@link #getLtmController() <em>Ltm Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtmController()
	 * @generated
	 * @ordered
	 */
	protected LTMController ltmController;

	/**
	 * The cached value of the '{@link #getGtmVersion() <em>Gtm Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGtmVersion()
	 * @generated
	 * @ordered
	 */
	protected GTMVersion gtmVersion;

	/**
	 * The cached value of the '{@link #getSysRequirements() <em>Sys Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemRequirement> sysRequirements;

	/**
	 * The cached value of the '{@link #getFuncRequirements() <em>Func Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalRequirement> funcRequirements;

	/**
	 * The cached value of the '{@link #getModelBlocks() <em>Model Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> modelBlocks;

	/**
	 * The cached value of the '{@link #getTestBlocks() <em>Test Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> testBlocks;

	/**
	 * The cached value of the '{@link #getDeriveTraceLinks() <em>Derive Trace Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeriveTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Derive> deriveTraceLinks;

	/**
	 * The cached value of the '{@link #getImplementTraceLinks() <em>Implement Trace Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Implement> implementTraceLinks;

	/**
	 * The cached value of the '{@link #getVerifyTraceLinks() <em>Verify Trace Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Verify> verifyTraceLinks;

	/**
	 * The cached value of the '{@link #getCR_Tickets() <em>CR Tickets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCR_Tickets()
	 * @generated
	 * @ordered
	 */
	protected EList<Change_Request_Ticket> cR_Tickets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalTraceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.GLOBAL_TRACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GTMController getGtmController() {
		return gtmController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGtmController(GTMController newGtmController, NotificationChain msgs) {
		GTMController oldGtmController = gtmController;
		gtmController = newGtmController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER, oldGtmController, newGtmController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGtmController(GTMController newGtmController) {
		if (newGtmController != gtmController) {
			NotificationChain msgs = null;
			if (gtmController != null)
				msgs = ((InternalEObject)gtmController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER, null, msgs);
			if (newGtmController != null)
				msgs = ((InternalEObject)newGtmController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER, null, msgs);
			msgs = basicSetGtmController(newGtmController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER, newGtmController, newGtmController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LTMController getLtmController() {
		return ltmController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLtmController(LTMController newLtmController, NotificationChain msgs) {
		LTMController oldLtmController = ltmController;
		ltmController = newLtmController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER, oldLtmController, newLtmController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLtmController(LTMController newLtmController) {
		if (newLtmController != ltmController) {
			NotificationChain msgs = null;
			if (ltmController != null)
				msgs = ((InternalEObject)ltmController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER, null, msgs);
			if (newLtmController != null)
				msgs = ((InternalEObject)newLtmController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER, null, msgs);
			msgs = basicSetLtmController(newLtmController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER, newLtmController, newLtmController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GTMVersion getGtmVersion() {
		return gtmVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGtmVersion(GTMVersion newGtmVersion, NotificationChain msgs) {
		GTMVersion oldGtmVersion = gtmVersion;
		gtmVersion = newGtmVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION, oldGtmVersion, newGtmVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGtmVersion(GTMVersion newGtmVersion) {
		if (newGtmVersion != gtmVersion) {
			NotificationChain msgs = null;
			if (gtmVersion != null)
				msgs = ((InternalEObject)gtmVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION, null, msgs);
			if (newGtmVersion != null)
				msgs = ((InternalEObject)newGtmVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION, null, msgs);
			msgs = basicSetGtmVersion(newGtmVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION, newGtmVersion, newGtmVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemRequirement> getSysRequirements() {
		if (sysRequirements == null) {
			sysRequirements = new EObjectContainmentEList<SystemRequirement>(SystemRequirement.class, this, TIMPackage.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS);
		}
		return sysRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalRequirement> getFuncRequirements() {
		if (funcRequirements == null) {
			funcRequirements = new EObjectContainmentEList<FunctionalRequirement>(FunctionalRequirement.class, this, TIMPackage.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS);
		}
		return funcRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getModelBlocks() {
		if (modelBlocks == null) {
			modelBlocks = new EObjectContainmentEList<Model>(Model.class, this, TIMPackage.GLOBAL_TRACE_MODEL__MODEL_BLOCKS);
		}
		return modelBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Test> getTestBlocks() {
		if (testBlocks == null) {
			testBlocks = new EObjectContainmentEList<Test>(Test.class, this, TIMPackage.GLOBAL_TRACE_MODEL__TEST_BLOCKS);
		}
		return testBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Derive> getDeriveTraceLinks() {
		if (deriveTraceLinks == null) {
			deriveTraceLinks = new EObjectContainmentEList<Derive>(Derive.class, this, TIMPackage.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS);
		}
		return deriveTraceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Implement> getImplementTraceLinks() {
		if (implementTraceLinks == null) {
			implementTraceLinks = new EObjectContainmentEList<Implement>(Implement.class, this, TIMPackage.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS);
		}
		return implementTraceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verify> getVerifyTraceLinks() {
		if (verifyTraceLinks == null) {
			verifyTraceLinks = new EObjectContainmentEList<Verify>(Verify.class, this, TIMPackage.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS);
		}
		return verifyTraceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Change_Request_Ticket> getCR_Tickets() {
		if (cR_Tickets == null) {
			cR_Tickets = new EObjectContainmentEList<Change_Request_Ticket>(Change_Request_Ticket.class, this, TIMPackage.GLOBAL_TRACE_MODEL__CR_TICKETS);
		}
		return cR_Tickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER:
				return basicSetGtmController(null, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER:
				return basicSetLtmController(null, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION:
				return basicSetGtmVersion(null, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS:
				return ((InternalEList<?>)getSysRequirements()).basicRemove(otherEnd, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS:
				return ((InternalEList<?>)getFuncRequirements()).basicRemove(otherEnd, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__MODEL_BLOCKS:
				return ((InternalEList<?>)getModelBlocks()).basicRemove(otherEnd, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__TEST_BLOCKS:
				return ((InternalEList<?>)getTestBlocks()).basicRemove(otherEnd, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS:
				return ((InternalEList<?>)getDeriveTraceLinks()).basicRemove(otherEnd, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS:
				return ((InternalEList<?>)getImplementTraceLinks()).basicRemove(otherEnd, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS:
				return ((InternalEList<?>)getVerifyTraceLinks()).basicRemove(otherEnd, msgs);
			case TIMPackage.GLOBAL_TRACE_MODEL__CR_TICKETS:
				return ((InternalEList<?>)getCR_Tickets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER:
				return getGtmController();
			case TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER:
				return getLtmController();
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION:
				return getGtmVersion();
			case TIMPackage.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS:
				return getSysRequirements();
			case TIMPackage.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS:
				return getFuncRequirements();
			case TIMPackage.GLOBAL_TRACE_MODEL__MODEL_BLOCKS:
				return getModelBlocks();
			case TIMPackage.GLOBAL_TRACE_MODEL__TEST_BLOCKS:
				return getTestBlocks();
			case TIMPackage.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS:
				return getDeriveTraceLinks();
			case TIMPackage.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS:
				return getImplementTraceLinks();
			case TIMPackage.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS:
				return getVerifyTraceLinks();
			case TIMPackage.GLOBAL_TRACE_MODEL__CR_TICKETS:
				return getCR_Tickets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER:
				setGtmController((GTMController)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER:
				setLtmController((LTMController)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION:
				setGtmVersion((GTMVersion)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS:
				getSysRequirements().clear();
				getSysRequirements().addAll((Collection<? extends SystemRequirement>)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS:
				getFuncRequirements().clear();
				getFuncRequirements().addAll((Collection<? extends FunctionalRequirement>)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__MODEL_BLOCKS:
				getModelBlocks().clear();
				getModelBlocks().addAll((Collection<? extends Model>)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__TEST_BLOCKS:
				getTestBlocks().clear();
				getTestBlocks().addAll((Collection<? extends Test>)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS:
				getDeriveTraceLinks().clear();
				getDeriveTraceLinks().addAll((Collection<? extends Derive>)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS:
				getImplementTraceLinks().clear();
				getImplementTraceLinks().addAll((Collection<? extends Implement>)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS:
				getVerifyTraceLinks().clear();
				getVerifyTraceLinks().addAll((Collection<? extends Verify>)newValue);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__CR_TICKETS:
				getCR_Tickets().clear();
				getCR_Tickets().addAll((Collection<? extends Change_Request_Ticket>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER:
				setGtmController((GTMController)null);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER:
				setLtmController((LTMController)null);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION:
				setGtmVersion((GTMVersion)null);
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS:
				getSysRequirements().clear();
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS:
				getFuncRequirements().clear();
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__MODEL_BLOCKS:
				getModelBlocks().clear();
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__TEST_BLOCKS:
				getTestBlocks().clear();
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS:
				getDeriveTraceLinks().clear();
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS:
				getImplementTraceLinks().clear();
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS:
				getVerifyTraceLinks().clear();
				return;
			case TIMPackage.GLOBAL_TRACE_MODEL__CR_TICKETS:
				getCR_Tickets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER:
				return gtmController != null;
			case TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER:
				return ltmController != null;
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION:
				return gtmVersion != null;
			case TIMPackage.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS:
				return sysRequirements != null && !sysRequirements.isEmpty();
			case TIMPackage.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS:
				return funcRequirements != null && !funcRequirements.isEmpty();
			case TIMPackage.GLOBAL_TRACE_MODEL__MODEL_BLOCKS:
				return modelBlocks != null && !modelBlocks.isEmpty();
			case TIMPackage.GLOBAL_TRACE_MODEL__TEST_BLOCKS:
				return testBlocks != null && !testBlocks.isEmpty();
			case TIMPackage.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS:
				return deriveTraceLinks != null && !deriveTraceLinks.isEmpty();
			case TIMPackage.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS:
				return implementTraceLinks != null && !implementTraceLinks.isEmpty();
			case TIMPackage.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS:
				return verifyTraceLinks != null && !verifyTraceLinks.isEmpty();
			case TIMPackage.GLOBAL_TRACE_MODEL__CR_TICKETS:
				return cR_Tickets != null && !cR_Tickets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalTraceModelImpl
