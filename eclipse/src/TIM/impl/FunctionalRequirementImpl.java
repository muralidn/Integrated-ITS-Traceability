/**
 */
package TIM.impl;

import TIM.Derive;
import TIM.FunctionalRequirement;
import TIM.TIMPackage;
import TIM.Traceability;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.FunctionalRequirementImpl#getUpstreamTraceLinks <em>Upstream Trace Links</em>}</li>
 *   <li>{@link TIM.impl.FunctionalRequirementImpl#getDownstreamTraceLinks <em>Downstream Trace Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalRequirementImpl extends ArtifactImpl implements FunctionalRequirement {
	/**
	 * The cached value of the '{@link #getUpstreamTraceLinks() <em>Upstream Trace Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Derive> upstreamTraceLinks;

	/**
	 * The cached value of the '{@link #getDownstreamTraceLinks() <em>Downstream Trace Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceability> downstreamTraceLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.FUNCTIONAL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Derive> getUpstreamTraceLinks() {
		if (upstreamTraceLinks == null) {
			upstreamTraceLinks = new EObjectResolvingEList<Derive>(Derive.class, this, TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_TRACE_LINKS);
		}
		return upstreamTraceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Traceability> getDownstreamTraceLinks() {
		if (downstreamTraceLinks == null) {
			downstreamTraceLinks = new EObjectResolvingEList<Traceability>(Traceability.class, this, TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_TRACE_LINKS);
		}
		return downstreamTraceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_TRACE_LINKS:
				return getUpstreamTraceLinks();
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
				return getDownstreamTraceLinks();
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
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_TRACE_LINKS:
				getUpstreamTraceLinks().clear();
				getUpstreamTraceLinks().addAll((Collection<? extends Derive>)newValue);
				return;
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
				getDownstreamTraceLinks().clear();
				getDownstreamTraceLinks().addAll((Collection<? extends Traceability>)newValue);
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
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_TRACE_LINKS:
				getUpstreamTraceLinks().clear();
				return;
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
				getDownstreamTraceLinks().clear();
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
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_TRACE_LINKS:
				return upstreamTraceLinks != null && !upstreamTraceLinks.isEmpty();
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
				return downstreamTraceLinks != null && !downstreamTraceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalRequirementImpl
