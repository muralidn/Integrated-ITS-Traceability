/**
 */
package TIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TIM.Artifact#getArtifactID <em>Artifact ID</em>}</li>
 *   <li>{@link TIM.Artifact#getProgress <em>Progress</em>}</li>
 *   <li>{@link TIM.Artifact#getChangeRequests <em>Change Requests</em>}</li>
 *   <li>{@link TIM.Artifact#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see TIM.TIMPackage#getArtifact()
 * @model abstract="true"
 *        annotation="gmf.node label='artifactID, progress' label.icon='false' figure='ellipse' label.color='255,255,255' label.pattern='{0}, Prog: {1}'"
 * @generated
 */
public interface Artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact ID</em>' attribute.
	 * @see #setArtifactID(String)
	 * @see TIM.TIMPackage#getArtifact_ArtifactID()
	 * @model
	 * @generated
	 */
	String getArtifactID();

	/**
	 * Sets the value of the '{@link TIM.Artifact#getArtifactID <em>Artifact ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact ID</em>' attribute.
	 * @see #getArtifactID()
	 * @generated
	 */
	void setArtifactID(String value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * The literals are from the enumeration {@link TIM.Progress_Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see TIM.Progress_Enum
	 * @see #setProgress(Progress_Enum)
	 * @see TIM.TIMPackage#getArtifact_Progress()
	 * @model
	 * @generated
	 */
	Progress_Enum getProgress();

	/**
	 * Sets the value of the '{@link TIM.Artifact#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see TIM.Progress_Enum
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(Progress_Enum value);

	/**
	 * Returns the value of the '<em><b>Change Requests</b></em>' reference list.
	 * The list contents are of type {@link TIM.Change_Request_Ticket}.
	 * It is bidirectional and its opposite is '{@link TIM.Change_Request_Ticket#getAffectedArtifacts <em>Affected Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Requests</em>' reference list.
	 * @see TIM.TIMPackage#getArtifact_ChangeRequests()
	 * @see TIM.Change_Request_Ticket#getAffectedArtifacts
	 * @model opposite="affectedArtifacts"
	 * @generated
	 */
	EList<Change_Request_Ticket> getChangeRequests();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' attribute.
	 * @see #setSelect(Boolean)
	 * @see TIM.TIMPackage#getArtifact_Select()
	 * @model default="false"
	 * @generated
	 */
	Boolean getSelect();

	/**
	 * Sets the value of the '{@link TIM.Artifact#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(Boolean value);

} // Artifact
