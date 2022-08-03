/**
 */
package TIM.impl;

import TIM.GTMController;
import TIM.TIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GTM Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.GTMControllerImpl#getCreateNewCR <em>Create New CR</em>}</li>
 *   <li>{@link TIM.impl.GTMControllerImpl#getLtmCR <em>Ltm CR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GTMControllerImpl extends EObjectImpl implements GTMController {
	/**
	 * The default value of the '{@link #getCreateNewCR() <em>Create New CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateNewCR()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CREATE_NEW_CR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateNewCR() <em>Create New CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateNewCR()
	 * @generated
	 * @ordered
	 */
	protected Boolean createNewCR = CREATE_NEW_CR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLtmCR() <em>Ltm CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtmCR()
	 * @generated
	 * @ordered
	 */
	protected static final String LTM_CR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLtmCR() <em>Ltm CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtmCR()
	 * @generated
	 * @ordered
	 */
	protected String ltmCR = LTM_CR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTMControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.GTM_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCreateNewCR() {
		return createNewCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateNewCR(Boolean newCreateNewCR) {
		Boolean oldCreateNewCR = createNewCR;
		createNewCR = newCreateNewCR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.GTM_CONTROLLER__CREATE_NEW_CR, oldCreateNewCR, createNewCR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLtmCR() {
		return ltmCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLtmCR(String newLtmCR) {
		String oldLtmCR = ltmCR;
		ltmCR = newLtmCR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.GTM_CONTROLLER__LTM_CR, oldLtmCR, ltmCR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.GTM_CONTROLLER__CREATE_NEW_CR:
				return getCreateNewCR();
			case TIMPackage.GTM_CONTROLLER__LTM_CR:
				return getLtmCR();
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
			case TIMPackage.GTM_CONTROLLER__CREATE_NEW_CR:
				setCreateNewCR((Boolean)newValue);
				return;
			case TIMPackage.GTM_CONTROLLER__LTM_CR:
				setLtmCR((String)newValue);
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
			case TIMPackage.GTM_CONTROLLER__CREATE_NEW_CR:
				setCreateNewCR(CREATE_NEW_CR_EDEFAULT);
				return;
			case TIMPackage.GTM_CONTROLLER__LTM_CR:
				setLtmCR(LTM_CR_EDEFAULT);
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
			case TIMPackage.GTM_CONTROLLER__CREATE_NEW_CR:
				return CREATE_NEW_CR_EDEFAULT == null ? createNewCR != null : !CREATE_NEW_CR_EDEFAULT.equals(createNewCR);
			case TIMPackage.GTM_CONTROLLER__LTM_CR:
				return LTM_CR_EDEFAULT == null ? ltmCR != null : !LTM_CR_EDEFAULT.equals(ltmCR);
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
		result.append(" (createNewCR: ");
		result.append(createNewCR);
		result.append(", ltmCR: ");
		result.append(ltmCR);
		result.append(')');
		return result.toString();
	}

} //GTMControllerImpl
