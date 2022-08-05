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
 *   <li>{@link TIM.Model#getUpstreamTraceLinks <em>Upstream Trace Links</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getModel()
 * @model annotation="gmf.node label.pattern='{0}, Progress: {1}' color='0,125,0'"
 * @generated
 */
public interface Model extends Artifact {
	/**
	 * Returns the value of the '<em><b>Upstream Trace Links</b></em>' reference list.
	 * The list contents are of type {@link TIM.Implement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream Trace Links</em>' reference list.
	 * @see TIM.TIMPackage#getModel_UpstreamTraceLinks()
	 * @model
	 * @generated
	 */
	EList<Implement> getUpstreamTraceLinks();

} // Model
