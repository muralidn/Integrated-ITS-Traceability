/**
 */
package TIM.impl;

import TIM.Implement;
import TIM.Model;
import TIM.TIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.ModelImpl#getUpstreamTraceLinks <em>Upstream Trace Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends ArtifactImpl implements Model {
	/**
	 * The cached value of the '{@link #getUpstreamTraceLinks() <em>Upstream Trace Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Implement> upstreamTraceLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Implement> getUpstreamTraceLinks() {
		if (upstreamTraceLinks == null) {
			upstreamTraceLinks = new EObjectResolvingEList<Implement>(Implement.class, this, TIMPackage.MODEL__UPSTREAM_TRACE_LINKS);
		}
		return upstreamTraceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.MODEL__UPSTREAM_TRACE_LINKS:
				return getUpstreamTraceLinks();
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
			case TIMPackage.MODEL__UPSTREAM_TRACE_LINKS:
				getUpstreamTraceLinks().clear();
				getUpstreamTraceLinks().addAll((Collection<? extends Implement>)newValue);
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
			case TIMPackage.MODEL__UPSTREAM_TRACE_LINKS:
				getUpstreamTraceLinks().clear();
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
			case TIMPackage.MODEL__UPSTREAM_TRACE_LINKS:
				return upstreamTraceLinks != null && !upstreamTraceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
