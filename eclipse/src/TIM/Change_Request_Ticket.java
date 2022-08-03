/**
 */
package TIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Request Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Change_Request_Ticket#getCrID <em>Cr ID</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getSummary <em>Summary</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getDescription <em>Description</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getVersion <em>Version</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getChHelpful <em>Ch Helpful</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getMergeRationale <em>Merge Rationale</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getPlannedLOE <em>Planned LOE</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getActualLOE <em>Actual LOE</em>}</li>
 *   <li>{@link TIM.Change_Request_Ticket#getAffectedArtifacts <em>Affected Artifacts</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getChange_Request_Ticket()
 * @model annotation="gmf.node label='crID' label.pattern='CR - #{0}' label.icon='false' figure='rectangle' phantom='true'"
 * @generated
 */
public interface Change_Request_Ticket extends EObject {
	/**
	 * Returns the value of the '<em><b>Cr ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cr ID</em>' attribute.
	 * @see #setCrID(int)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_CrID()
	 * @model
	 * @generated
	 */
	int getCrID();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getCrID <em>Cr ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cr ID</em>' attribute.
	 * @see #getCrID()
	 * @generated
	 */
	void setCrID(int value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Ch Helpful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ch Helpful</em>' attribute.
	 * @see #setChHelpful(String)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_ChHelpful()
	 * @model
	 * @generated
	 */
	String getChHelpful();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getChHelpful <em>Ch Helpful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ch Helpful</em>' attribute.
	 * @see #getChHelpful()
	 * @generated
	 */
	void setChHelpful(String value);

	/**
	 * Returns the value of the '<em><b>Merge Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Rationale</em>' attribute.
	 * @see #setMergeRationale(String)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_MergeRationale()
	 * @model
	 * @generated
	 */
	String getMergeRationale();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getMergeRationale <em>Merge Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Rationale</em>' attribute.
	 * @see #getMergeRationale()
	 * @generated
	 */
	void setMergeRationale(String value);

	/**
	 * Returns the value of the '<em><b>Planned LOE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned LOE</em>' attribute.
	 * @see #setPlannedLOE(Float)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_PlannedLOE()
	 * @model
	 * @generated
	 */
	Float getPlannedLOE();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getPlannedLOE <em>Planned LOE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned LOE</em>' attribute.
	 * @see #getPlannedLOE()
	 * @generated
	 */
	void setPlannedLOE(Float value);

	/**
	 * Returns the value of the '<em><b>Actual LOE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual LOE</em>' attribute.
	 * @see #setActualLOE(Float)
	 * @see TIM.TIMPackage#getChange_Request_Ticket_ActualLOE()
	 * @model
	 * @generated
	 */
	Float getActualLOE();

	/**
	 * Sets the value of the '{@link TIM.Change_Request_Ticket#getActualLOE <em>Actual LOE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual LOE</em>' attribute.
	 * @see #getActualLOE()
	 * @generated
	 */
	void setActualLOE(Float value);

	/**
	 * Returns the value of the '<em><b>Affected Artifacts</b></em>' reference list.
	 * The list contents are of type {@link TIM.Artifact}.
	 * It is bidirectional and its opposite is '{@link TIM.Artifact#getChangeRequests <em>Change Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Artifacts</em>' reference list.
	 * @see TIM.TIMPackage#getChange_Request_Ticket_AffectedArtifacts()
	 * @see TIM.Artifact#getChangeRequests
	 * @model opposite="changeRequests"
	 * @generated
	 */
	EList<Artifact> getAffectedArtifacts();

} // Change_Request_Ticket
