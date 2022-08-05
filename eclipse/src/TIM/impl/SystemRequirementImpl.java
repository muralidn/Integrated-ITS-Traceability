/**
 */
package TIM.impl;

import TIM.Derive;
import TIM.SystemRequirement;
import TIM.TIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.SystemRequirementImpl#getDownstreamTraceLinks <em>Downstream Trace Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRequirementImpl extends ArtifactImpl implements SystemRequirement {
	/**
	 * The cached value of the '{@link #getDownstreamTraceLinks() <em>Downstream Trace Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Derive> downstreamTraceLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.SYSTEM_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Derive> getDownstreamTraceLinks() {
		if (downstreamTraceLinks == null) {
			downstreamTraceLinks = new EObjectResolvingEList<Derive>(Derive.class, this, TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_TRACE_LINKS);
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
				getDownstreamTraceLinks().clear();
				getDownstreamTraceLinks().addAll((Collection<? extends Derive>)newValue);
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_TRACE_LINKS:
				return downstreamTraceLinks != null && !downstreamTraceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemRequirementImpl
