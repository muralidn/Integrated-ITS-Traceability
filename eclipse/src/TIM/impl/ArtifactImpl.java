/**
 */
package TIM.impl;

import TIM.Artifact;
import TIM.Change_Request_Ticket;
import TIM.Progress_Enum;
import TIM.TIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.ArtifactImpl#getArtifactID <em>Artifact ID</em>}</li>
 *   <li>{@link TIM.impl.ArtifactImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link TIM.impl.ArtifactImpl#getChangeRequests <em>Change Requests</em>}</li>
 *   <li>{@link TIM.impl.ArtifactImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtifactImpl extends EObjectImpl implements Artifact {
	/**
	 * The default value of the '{@link #getArtifactID() <em>Artifact ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactID()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactID() <em>Artifact ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactID()
	 * @generated
	 * @ordered
	 */
	protected String artifactID = ARTIFACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Progress_Enum PROGRESS_EDEFAULT = Progress_Enum.ZERO;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected Progress_Enum progress = PROGRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChangeRequests() <em>Change Requests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Change_Request_Ticket> changeRequests;

	/**
	 * The default value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SELECT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected Boolean select = SELECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactID() {
		return artifactID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactID(String newArtifactID) {
		String oldArtifactID = artifactID;
		artifactID = newArtifactID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.ARTIFACT__ARTIFACT_ID, oldArtifactID, artifactID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Progress_Enum getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgress(Progress_Enum newProgress) {
		Progress_Enum oldProgress = progress;
		progress = newProgress == null ? PROGRESS_EDEFAULT : newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.ARTIFACT__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Change_Request_Ticket> getChangeRequests() {
		if (changeRequests == null) {
			changeRequests = new EObjectWithInverseResolvingEList.ManyInverse<Change_Request_Ticket>(Change_Request_Ticket.class, this, TIMPackage.ARTIFACT__CHANGE_REQUESTS, TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS);
		}
		return changeRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(Boolean newSelect) {
		Boolean oldSelect = select;
		select = newSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.ARTIFACT__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TIMPackage.ARTIFACT__CHANGE_REQUESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeRequests()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TIMPackage.ARTIFACT__CHANGE_REQUESTS:
				return ((InternalEList<?>)getChangeRequests()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TIMPackage.ARTIFACT__ARTIFACT_ID:
				return getArtifactID();
			case TIMPackage.ARTIFACT__PROGRESS:
				return getProgress();
			case TIMPackage.ARTIFACT__CHANGE_REQUESTS:
				return getChangeRequests();
			case TIMPackage.ARTIFACT__SELECT:
				return getSelect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TIMPackage.ARTIFACT__ARTIFACT_ID:
				setArtifactID((String)newValue);
				return;
			case TIMPackage.ARTIFACT__PROGRESS:
				setProgress((Progress_Enum)newValue);
				return;
			case TIMPackage.ARTIFACT__CHANGE_REQUESTS:
				getChangeRequests().clear();
				getChangeRequests().addAll((Collection<? extends Change_Request_Ticket>)newValue);
				return;
			case TIMPackage.ARTIFACT__SELECT:
				setSelect((Boolean)newValue);
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
			case TIMPackage.ARTIFACT__ARTIFACT_ID:
				setArtifactID(ARTIFACT_ID_EDEFAULT);
				return;
			case TIMPackage.ARTIFACT__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case TIMPackage.ARTIFACT__CHANGE_REQUESTS:
				getChangeRequests().clear();
				return;
			case TIMPackage.ARTIFACT__SELECT:
				setSelect(SELECT_EDEFAULT);
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
			case TIMPackage.ARTIFACT__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactID != null : !ARTIFACT_ID_EDEFAULT.equals(artifactID);
			case TIMPackage.ARTIFACT__PROGRESS:
				return progress != PROGRESS_EDEFAULT;
			case TIMPackage.ARTIFACT__CHANGE_REQUESTS:
				return changeRequests != null && !changeRequests.isEmpty();
			case TIMPackage.ARTIFACT__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
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
		result.append(" (artifactID: ");
		result.append(artifactID);
		result.append(", progress: ");
		result.append(progress);
		result.append(", select: ");
		result.append(select);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
