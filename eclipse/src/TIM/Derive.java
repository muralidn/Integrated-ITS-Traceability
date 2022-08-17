/**
 */
package TIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Derive#getType <em>Type</em>}</li>
 *   <li>{@link TIM.Derive#getSource <em>Source</em>}</li>
 *   <li>{@link TIM.Derive#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getDerive()
 * @model annotation="gmf.link label='type'"
 * @generated
 */
public interface Derive extends Traceability {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DERIVE"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see TIM.TIMPackage#getDerive_Type()
	 * @model default="DERIVE" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SystemRequirement)
	 * @see TIM.TIMPackage#getDerive_Source()
	 * @model
	 * @generated
	 */
	SystemRequirement getSource();

	/**
	 * Sets the value of the '{@link TIM.Derive#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SystemRequirement value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(FunctionalRequirement)
	 * @see TIM.TIMPackage#getDerive_Destination()
	 * @model
	 * @generated
	 */
	FunctionalRequirement getDestination();

	/**
	 * Sets the value of the '{@link TIM.Derive#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(FunctionalRequirement value);

} // Derive
