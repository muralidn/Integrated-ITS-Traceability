/**
 */
package TIM.impl;

import TIM.Artifact;
import TIM.Change_Request_Ticket;
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
 * An implementation of the model object '<em><b>Change Request Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getCrID <em>Cr ID</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getChHelpful <em>Ch Helpful</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getMergeRationale <em>Merge Rationale</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getPlannedLOE <em>Planned LOE</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getActualLOE <em>Actual LOE</em>}</li>
 *   <li>{@link TIM.impl.Change_Request_TicketImpl#getAffectedArtifacts <em>Affected Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Change_Request_TicketImpl extends EObjectImpl implements Change_Request_Ticket {
	/**
	 * The default value of the '{@link #getCrID() <em>Cr ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrID()
	 * @generated
	 * @ordered
	 */
	protected static final int CR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCrID() <em>Cr ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrID()
	 * @generated
	 * @ordered
	 */
	protected int crID = CR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getChHelpful() <em>Ch Helpful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChHelpful()
	 * @generated
	 * @ordered
	 */
	protected static final String CH_HELPFUL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChHelpful() <em>Ch Helpful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChHelpful()
	 * @generated
	 * @ordered
	 */
	protected String chHelpful = CH_HELPFUL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMergeRationale() <em>Merge Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGE_RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMergeRationale() <em>Merge Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeRationale()
	 * @generated
	 * @ordered
	 */
	protected String mergeRationale = MERGE_RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlannedLOE() <em>Planned LOE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedLOE()
	 * @generated
	 * @ordered
	 */
	protected static final Float PLANNED_LOE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlannedLOE() <em>Planned LOE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedLOE()
	 * @generated
	 * @ordered
	 */
	protected Float plannedLOE = PLANNED_LOE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualLOE() <em>Actual LOE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLOE()
	 * @generated
	 * @ordered
	 */
	protected static final Float ACTUAL_LOE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualLOE() <em>Actual LOE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLOE()
	 * @generated
	 * @ordered
	 */
	protected Float actualLOE = ACTUAL_LOE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffectedArtifacts() <em>Affected Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> affectedArtifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Change_Request_TicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TIMPackage.Literals.CHANGE_REQUEST_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCrID() {
		return crID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrID(int newCrID) {
		int oldCrID = crID;
		crID = newCrID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__CR_ID, oldCrID, crID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChHelpful() {
		return chHelpful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChHelpful(String newChHelpful) {
		String oldChHelpful = chHelpful;
		chHelpful = newChHelpful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__CH_HELPFUL, oldChHelpful, chHelpful));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMergeRationale() {
		return mergeRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeRationale(String newMergeRationale) {
		String oldMergeRationale = mergeRationale;
		mergeRationale = newMergeRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__MERGE_RATIONALE, oldMergeRationale, mergeRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPlannedLOE() {
		return plannedLOE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedLOE(Float newPlannedLOE) {
		Float oldPlannedLOE = plannedLOE;
		plannedLOE = newPlannedLOE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__PLANNED_LOE, oldPlannedLOE, plannedLOE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getActualLOE() {
		return actualLOE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualLOE(Float newActualLOE) {
		Float oldActualLOE = actualLOE;
		actualLOE = newActualLOE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TIMPackage.CHANGE_REQUEST_TICKET__ACTUAL_LOE, oldActualLOE, actualLOE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getAffectedArtifacts() {
		if (affectedArtifacts == null) {
			affectedArtifacts = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS, TIMPackage.ARTIFACT__CHANGE_REQUESTS);
		}
		return affectedArtifacts;
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
			case TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAffectedArtifacts()).basicAdd(otherEnd, msgs);
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
			case TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS:
				return ((InternalEList<?>)getAffectedArtifacts()).basicRemove(otherEnd, msgs);
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
			case TIMPackage.CHANGE_REQUEST_TICKET__CR_ID:
				return getCrID();
			case TIMPackage.CHANGE_REQUEST_TICKET__SUMMARY:
				return getSummary();
			case TIMPackage.CHANGE_REQUEST_TICKET__DESCRIPTION:
				return getDescription();
			case TIMPackage.CHANGE_REQUEST_TICKET__VERSION:
				return getVersion();
			case TIMPackage.CHANGE_REQUEST_TICKET__CH_HELPFUL:
				return getChHelpful();
			case TIMPackage.CHANGE_REQUEST_TICKET__MERGE_RATIONALE:
				return getMergeRationale();
			case TIMPackage.CHANGE_REQUEST_TICKET__PLANNED_LOE:
				return getPlannedLOE();
			case TIMPackage.CHANGE_REQUEST_TICKET__ACTUAL_LOE:
				return getActualLOE();
			case TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS:
				return getAffectedArtifacts();
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
			case TIMPackage.CHANGE_REQUEST_TICKET__CR_ID:
				setCrID((Integer)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__SUMMARY:
				setSummary((String)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__VERSION:
				setVersion((String)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__CH_HELPFUL:
				setChHelpful((String)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__MERGE_RATIONALE:
				setMergeRationale((String)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__PLANNED_LOE:
				setPlannedLOE((Float)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__ACTUAL_LOE:
				setActualLOE((Float)newValue);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS:
				getAffectedArtifacts().clear();
				getAffectedArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case TIMPackage.CHANGE_REQUEST_TICKET__CR_ID:
				setCrID(CR_ID_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__CH_HELPFUL:
				setChHelpful(CH_HELPFUL_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__MERGE_RATIONALE:
				setMergeRationale(MERGE_RATIONALE_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__PLANNED_LOE:
				setPlannedLOE(PLANNED_LOE_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__ACTUAL_LOE:
				setActualLOE(ACTUAL_LOE_EDEFAULT);
				return;
			case TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS:
				getAffectedArtifacts().clear();
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
			case TIMPackage.CHANGE_REQUEST_TICKET__CR_ID:
				return crID != CR_ID_EDEFAULT;
			case TIMPackage.CHANGE_REQUEST_TICKET__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case TIMPackage.CHANGE_REQUEST_TICKET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TIMPackage.CHANGE_REQUEST_TICKET__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TIMPackage.CHANGE_REQUEST_TICKET__CH_HELPFUL:
				return CH_HELPFUL_EDEFAULT == null ? chHelpful != null : !CH_HELPFUL_EDEFAULT.equals(chHelpful);
			case TIMPackage.CHANGE_REQUEST_TICKET__MERGE_RATIONALE:
				return MERGE_RATIONALE_EDEFAULT == null ? mergeRationale != null : !MERGE_RATIONALE_EDEFAULT.equals(mergeRationale);
			case TIMPackage.CHANGE_REQUEST_TICKET__PLANNED_LOE:
				return PLANNED_LOE_EDEFAULT == null ? plannedLOE != null : !PLANNED_LOE_EDEFAULT.equals(plannedLOE);
			case TIMPackage.CHANGE_REQUEST_TICKET__ACTUAL_LOE:
				return ACTUAL_LOE_EDEFAULT == null ? actualLOE != null : !ACTUAL_LOE_EDEFAULT.equals(actualLOE);
			case TIMPackage.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS:
				return affectedArtifacts != null && !affectedArtifacts.isEmpty();
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
		result.append(" (crID: ");
		result.append(crID);
		result.append(", summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", version: ");
		result.append(version);
		result.append(", chHelpful: ");
		result.append(chHelpful);
		result.append(", mergeRationale: ");
		result.append(mergeRationale);
		result.append(", plannedLOE: ");
		result.append(plannedLOE);
		result.append(", actualLOE: ");
		result.append(actualLOE);
		result.append(')');
		return result.toString();
	}

} //Change_Request_TicketImpl
