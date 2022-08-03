/**
 */
package TIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.FunctionalRequirement#getUpstreamArtifacts <em>Upstream Artifacts</em>}</li>
 *   <li>{@link TIM.FunctionalRequirement#getDownstreamArtifacts <em>Downstream Artifacts</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getFunctionalRequirement()
 * @model annotation="gmf.node label.pattern='{0}, Progress: {1}' color='175,0,0'"
 * @generated
 */
public interface FunctionalRequirement extends Artifact {
	/**
	 * Returns the value of the '<em><b>Upstream Artifacts</b></em>' reference list.
	 * The list contents are of type {@link TIM.Derive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Artifacts</em>' reference list.
	 * @see TIM.TIMPackage#getFunctionalRequirement_UpstreamArtifacts()
	 * @model
	 * @generated
	 */
	EList<Derive> getUpstreamArtifacts();

	/**
	 * Returns the value of the '<em><b>Downstream Artifacts</b></em>' reference list.
	 * The list contents are of type {@link TIM.Implement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Artifacts</em>' reference list.
	 * @see TIM.TIMPackage#getFunctionalRequirement_DownstreamArtifacts()
	 * @model
	 * @generated
	 */
	EList<Implement> getDownstreamArtifacts();

} // FunctionalRequirement
