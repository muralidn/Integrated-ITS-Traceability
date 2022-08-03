/**
 */
package TIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LTM Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.LTMController#getComplete <em>Complete</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getLTMController()
 * @model annotation="gmf.node label='complete' label.icon='false' figure='rectangle' label.pattern='CR Complete: {0}'"
 * @generated
 */
public interface LTMController extends EObject {
	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(Boolean)
	 * @see TIM.TIMPackage#getLTMController_Complete()
	 * @model
	 * @generated
	 */
	Boolean getComplete();

	/**
	 * Sets the value of the '{@link TIM.LTMController#getComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #getComplete()
	 * @generated
	 */
	void setComplete(Boolean value);

} // LTMController
