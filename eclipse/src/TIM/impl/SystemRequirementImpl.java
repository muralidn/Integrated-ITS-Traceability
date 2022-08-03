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
 *   <li>{@link TIM.impl.SystemRequirementImpl#getDownstreamArtifacts <em>Downstream Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRequirementImpl extends ArtifactImpl implements SystemRequirement {
	/**
	 * The cached value of the '{@link #getDownstreamArtifacts() <em>Downstream Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Derive> downstreamArtifacts;

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
	public EList<Derive> getDownstreamArtifacts() {
		if (downstreamArtifacts == null) {
			downstreamArtifacts = new EObjectResolvingEList<Derive>(Derive.class, this, TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS);
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
				getDownstreamArtifacts().clear();
				getDownstreamArtifacts().addAll((Collection<? extends Derive>)newValue);
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
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
			case TIMPackage.SYSTEM_REQUIREMENT__DOWNSTREAM_ARTIFACTS:
				return downstreamArtifacts != null && !downstreamArtifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemRequirementImpl
