/**
 */
package TIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Model#getUpstreamArtifacts <em>Upstream Artifacts</em>}</li>
 *   <li>{@link TIM.Model#getDownstreamArtifacts <em>Downstream Artifacts</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getModel()
 * @model annotation="gmf.node label.pattern='{0}, Progress: {1}' color='0,125,0'"
 * @generated
 */
public interface Model extends Artifact {
	/**
	 * Returns the value of the '<em><b>Upstream Artifacts</b></em>' reference list.
	 * The list contents are of type {@link TIM.Implement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Artifacts</em>' reference list.
	 * @see TIM.TIMPackage#getModel_UpstreamArtifacts()
	 * @model
	 * @generated
	 */
	EList<Implement> getUpstreamArtifacts();

	/**
	 * Returns the value of the '<em><b>Downstream Artifacts</b></em>' reference list.
	 * The list contents are of type {@link TIM.Verify}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Artifacts</em>' reference list.
	 * @see TIM.TIMPackage#getModel_DownstreamArtifacts()
	 * @model
	 * @generated
	 */
	EList<Verify> getDownstreamArtifacts();

} // Model
