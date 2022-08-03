/**
 */
package TIM.impl;

import TIM.Implement;
import TIM.Model;
import TIM.TIMPackage;
import TIM.Verify;

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
 *   <li>{@link TIM.impl.ModelImpl#getUpstreamArtifacts <em>Upstream Artifacts</em>}</li>
 *   <li>{@link TIM.impl.ModelImpl#getDownstreamArtifacts <em>Downstream Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends ArtifactImpl implements Model {
	/**
	 * The cached value of the '{@link #getUpstreamArtifacts() <em>Upstream Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Implement> upstreamArtifacts;

	/**
	 * The cached value of the '{@link #getDownstreamArtifacts() <em>Downstream Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Verify> downstreamArtifacts;

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
	public EList<Implement> getUpstreamArtifacts() {
		if (upstreamArtifacts == null) {
			upstreamArtifacts = new EObjectResolvingEList<Implement>(Implement.class, this, TIMPackage.MODEL__UPSTREAM_ARTIFACTS);
		}
		return upstreamArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verify> getDownstreamArtifacts() {
		if (downstreamArtifacts == null) {
			downstreamArtifacts = new EObjectResolvingEList<Verify>(Verify.class, this, TIMPackage.MODEL__DOWNSTREAM_ARTIFACTS);
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
			case TIMPackage.MODEL__UPSTREAM_ARTIFACTS:
				return getUpstreamArtifacts();
			case TIMPackage.MODEL__DOWNSTREAM_ARTIFACTS:
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
			case TIMPackage.MODEL__UPSTREAM_ARTIFACTS:
				getUpstreamArtifacts().clear();
				getUpstreamArtifacts().addAll((Collection<? extends Implement>)newValue);
				return;
			case TIMPackage.MODEL__DOWNSTREAM_ARTIFACTS:
				getDownstreamArtifacts().clear();
				getDownstreamArtifacts().addAll((Collection<? extends Verify>)newValue);
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
			case TIMPackage.MODEL__UPSTREAM_ARTIFACTS:
				getUpstreamArtifacts().clear();
				return;
			case TIMPackage.MODEL__DOWNSTREAM_ARTIFACTS:
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
			case TIMPackage.MODEL__UPSTREAM_ARTIFACTS:
				return upstreamArtifacts != null && !upstreamArtifacts.isEmpty();
			case TIMPackage.MODEL__DOWNSTREAM_ARTIFACTS:
				return downstreamArtifacts != null && !downstreamArtifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
