/**
 */
package TIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GTM Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.GTMController#getCreateNewCR <em>Create New CR</em>}</li>
 *   <li>{@link TIM.GTMController#getLtmCR <em>Ltm CR</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getGTMController()
 * @model annotation="gmf.node label='createNewCR, ltmCR' label.icon='false' figure='rectangle' label.pattern='Create New CR: {0} (OR) LTM CR: {1}'"
 * @generated
 */
public interface GTMController extends EObject {
	/**
	 * Returns the value of the '<em><b>Create New CR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create New CR</em>' attribute.
	 * @see #setCreateNewCR(Boolean)
	 * @see TIM.TIMPackage#getGTMController_CreateNewCR()
	 * @model
	 * @generated
	 */
	Boolean getCreateNewCR();

	/**
	 * Sets the value of the '{@link TIM.GTMController#getCreateNewCR <em>Create New CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create New CR</em>' attribute.
	 * @see #getCreateNewCR()
	 * @generated
	 */
	void setCreateNewCR(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ltm CR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltm CR</em>' attribute.
	 * @see #setLtmCR(String)
	 * @see TIM.TIMPackage#getGTMController_LtmCR()
	 * @model
	 * @generated
	 */
	String getLtmCR();

	/**
	 * Sets the value of the '{@link TIM.GTMController#getLtmCR <em>Ltm CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltm CR</em>' attribute.
	 * @see #getLtmCR()
	 * @generated
	 */
	void setLtmCR(String value);

} // GTMController
