/**
 */
package TIM.impl;

import TIM.TIMPackage;
import TIM.Traceability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.TraceabilityImpl#getTraceUID <em>Trace UID</em>}</li>
 *   <li>{@link TIM.impl.TraceabilityImpl#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceabilityImpl extends EObjectImpl implements Traceability {
	/**
	 * The default value of the '{@link #getTraceUID() <em>Trace UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceUID()
	 * @generated
	 * @ordered
	 */
	protected static final int TRACE_UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTraceUID() <em>Trace UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceUID()
	 * @generated
	 * @ordered
	 */
	protected int traceUID = TRACE_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALID_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected Boolean valid = VALID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.TRACEABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTraceUID() {
		return traceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceUID(int newTraceUID) {
		int oldTraceUID = traceUID;
		traceUID = newTraceUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.TRACEABILITY__TRACE_UID, oldTraceUID, traceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValid(Boolean newValid) {
		Boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.TRACEABILITY__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.TRACEABILITY__TRACE_UID:
				return getTraceUID();
			case TIMPackage.TRACEABILITY__VALID:
				return getValid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TIMPackage.TRACEABILITY__TRACE_UID:
				setTraceUID((Integer)newValue);
				return;
			case TIMPackage.TRACEABILITY__VALID:
				setValid((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TIMPackage.TRACEABILITY__TRACE_UID:
				setTraceUID(TRACE_UID_EDEFAULT);
				return;
			case TIMPackage.TRACEABILITY__VALID:
				setValid(VALID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TIMPackage.TRACEABILITY__TRACE_UID:
				return traceUID != TRACE_UID_EDEFAULT;
			case TIMPackage.TRACEABILITY__VALID:
				return VALID_EDEFAULT == null ? valid != null : !VALID_EDEFAULT.equals(valid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (traceUID: ");
		result.append(traceUID);
		result.append(", valid: ");
		result.append(valid);
		result.append(')');
		return result.toString();
	}

} //TraceabilityImpl
