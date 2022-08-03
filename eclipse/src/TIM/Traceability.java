/**
 */
package TIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Traceability#getTraceUID <em>Trace UID</em>}</li>
 *   <li>{@link TIM.Traceability#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getTraceability()
 * @model abstract="true"
 *        annotation="gmf.link source='source' target='destination' source.constraint='self &lt;&gt; oppositeEnd' source.decoration='filledclosedarrow' target.constraint='self &lt;&gt; oppositeEnd' target.decoration='filledclosedarrow'"
 * @generated
 */
public interface Traceability extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace UID</em>' attribute.
	 * @see #setTraceUID(int)
	 * @see TIM.TIMPackage#getTraceability_TraceUID()
	 * @model
	 * @generated
	 */
	int getTraceUID();

	/**
	 * Sets the value of the '{@link TIM.Traceability#getTraceUID <em>Trace UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace UID</em>' attribute.
	 * @see #getTraceUID()
	 * @generated
	 */
	void setTraceUID(int value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(Boolean)
	 * @see TIM.TIMPackage#getTraceability_Valid()
	 * @model default="true"
	 * @generated
	 */
	Boolean getValid();

	/**
	 * Sets the value of the '{@link TIM.Traceability#getValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #getValid()
	 * @generated
	 */
	void setValid(Boolean value);

} // Traceability
