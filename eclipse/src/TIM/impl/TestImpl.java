/**
 */
package TIM.impl;

import TIM.TIMPackage;
import TIM.Test;
import TIM.Verify;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.TestImpl#getUpstreamArtifacts <em>Upstream Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends ArtifactImpl implements Test {
	/**
	 * The cached value of the '{@link #getUpstreamArtifacts() <em>Upstream Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Verify> upstreamArtifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verify> getUpstreamArtifacts() {
		if (upstreamArtifacts == null) {
			upstreamArtifacts = new EObjectResolvingEList<Verify>(Verify.class, this, TIMPackage.TEST__UPSTREAM_ARTIFACTS);
		}
		return upstreamArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.TEST__UPSTREAM_ARTIFACTS:
				return getUpstreamArtifacts();
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
			case TIMPackage.TEST__UPSTREAM_ARTIFACTS:
				getUpstreamArtifacts().clear();
				getUpstreamArtifacts().addAll((Collection<? extends Verify>)newValue);
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
			case TIMPackage.TEST__UPSTREAM_ARTIFACTS:
				getUpstreamArtifacts().clear();
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
			case TIMPackage.TEST__UPSTREAM_ARTIFACTS:
				return upstreamArtifacts != null && !upstreamArtifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestImpl
