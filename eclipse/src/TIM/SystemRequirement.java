/**
 */
package TIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.SystemRequirement#getDownstreamArtifacts <em>Downstream Artifacts</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getSystemRequirement()
 * @model annotation="gmf.node label.pattern='{0}, Progress: {1}' color='75,0,0'"
 * @generated
 */
public interface SystemRequirement extends Artifact {
	/**
	 * Returns the value of the '<em><b>Downstream Artifacts</b></em>' reference list.
	 * The list contents are of type {@link TIM.Derive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Artifacts</em>' reference list.
	 * @see TIM.TIMPackage#getSystemRequirement_DownstreamArtifacts()
	 * @model
	 * @generated
	 */
	EList<Derive> getDownstreamArtifacts();

} // SystemRequirement
