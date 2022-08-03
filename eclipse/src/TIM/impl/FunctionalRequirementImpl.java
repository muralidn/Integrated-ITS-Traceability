/**
 */
package TIM.impl;

import TIM.Derive;
import TIM.FunctionalRequirement;
import TIM.Implement;
import TIM.TIMPackage;

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
 *   <li>{@link TIM.impl.FunctionalRequirementImpl#getUpstreamArtifacts <em>Upstream Artifacts</em>}</li>
 *   <li>{@link TIM.impl.FunctionalRequirementImpl#getDownstreamArtifacts <em>Downstream Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalRequirementImpl extends ArtifactImpl implements FunctionalRequirement {
	/**
	 * The cached value of the '{@link #getUpstreamArtifacts() <em>Upstream Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Derive> upstreamArtifacts;

	/**
	 * The cached value of the '{@link #getDownstreamArtifacts() <em>Downstream Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Implement> downstreamArtifacts;

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
	public EList<Derive> getUpstreamArtifacts() {
		if (upstreamArtifacts == null) {
			upstreamArtifacts = new EObjectResolvingEList<Derive>(Derive.class, this, TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS);
		}
		return upstreamArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Implement> getDownstreamArtifacts() {
		if (downstreamArtifacts == null) {
			downstreamArtifacts = new EObjectResolvingEList<Implement>(Implement.class, this, TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS);
		}
		return downstreamArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS:
				return getUpstreamArtifacts();
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
				return getDownstreamArtifacts();
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
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS:
				getUpstreamArtifacts().clear();
				getUpstreamArtifacts().addAll((Collection<? extends Derive>)newValue);
				return;
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
				getDownstreamArtifacts().clear();
				getDownstreamArtifacts().addAll((Collection<? extends Implement>)newValue);
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
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS:
				getUpstreamArtifacts().clear();
				return;
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
				getDownstreamArtifacts().clear();
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
			case TIMPackage.FUNCTIONAL_REQUIREMENT__UPSTREAM_ARTIFACTS:
				return upstreamArtifacts != null && !upstreamArtifacts.isEmpty();
			case TIMPackage.FUNCTIONAL_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
				return downstreamArtifacts != null && !downstreamArtifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalRequirementImpl
