/**
 */
package TIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Implement#getType <em>Type</em>}</li>
 *   <li>{@link TIM.Implement#getSource <em>Source</em>}</li>
 *   <li>{@link TIM.Implement#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getImplement()
 * @model annotation="gmf.link label='type'"
 * @generated
 */
public interface Implement extends Traceability {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"IMPLEMENT"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see TIM.TIMPackage#getImplement_Type()
	 * @model default="IMPLEMENT" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FunctionalRequirement)
	 * @see TIM.TIMPackage#getImplement_Source()
	 * @model
	 * @generated
	 */
	FunctionalRequirement getSource();

	/**
	 * Sets the value of the '{@link TIM.Implement#getSource <em>Source</em>}' reference.
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
	 * @see #setDestination(Model)
	 * @see TIM.TIMPackage#getImplement_Destination()
	 * @model
	 * @generated
	 */
	Model getDestination();

	/**
	 * Sets the value of the '{@link TIM.Implement#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Model value);

} // Implement
