/**
 */
package TIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Verify#getType <em>Type</em>}</li>
 *   <li>{@link TIM.Verify#getSource <em>Source</em>}</li>
 *   <li>{@link TIM.Verify#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getVerify()
 * @model annotation="gmf.link label='type'"
 * @generated
 */
public interface Verify extends Traceability {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"VERIFY"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see TIM.TIMPackage#getVerify_Type()
	 * @model default="VERIFY" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FunctionalRequirement)
	 * @see TIM.TIMPackage#getVerify_Source()
	 * @model
	 * @generated
	 */
	FunctionalRequirement getSource();

	/**
	 * Sets the value of the '{@link TIM.Verify#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FunctionalRequirement value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Test)
	 * @see TIM.TIMPackage#getVerify_Destination()
	 * @model
	 * @generated
	 */
	Test getDestination();

	/**
	 * Sets the value of the '{@link TIM.Verify#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Test value);

} // Verify
