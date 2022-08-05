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
 *   <li>{@link TIM.FunctionalRequirement#getUpstreamTraceLinks <em>Upstream Trace Links</em>}</li>
 *   <li>{@link TIM.FunctionalRequirement#getDownstreamTraceLinks <em>Downstream Trace Links</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getFunctionalRequirement()
 * @model annotation="gmf.node label.pattern='{0}, Progress: {1}' color='175,0,0'"
 * @generated
 */
public interface FunctionalRequirement extends Artifact {
	/**
	 * Returns the value of the '<em><b>Upstream Trace Links</b></em>' reference list.
	 * The list contents are of type {@link TIM.Derive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Trace Links</em>' reference list.
	 * @see TIM.TIMPackage#getFunctionalRequirement_UpstreamTraceLinks()
	 * @model
	 * @generated
	 */
	EList<Derive> getUpstreamTraceLinks();

	/**
	 * Returns the value of the '<em><b>Downstream Trace Links</b></em>' reference list.
	 * The list contents are of type {@link TIM.Traceability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downstream Trace Links</em>' reference list.
	 * @see TIM.TIMPackage#getFunctionalRequirement_DownstreamTraceLinks()
	 * @model
	 * @generated
	 */
	EList<Traceability> getDownstreamTraceLinks();

} // FunctionalRequirement
