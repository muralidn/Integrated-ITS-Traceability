/**
 */
package TIM.provider;


import TIM.Change_Request_Ticket;
import TIM.TIMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TIM.Change_Request_Ticket} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Change_Request_TicketItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Change_Request_TicketItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCrIDPropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addChHelpfulPropertyDescriptor(object);
			addMergeRationalePropertyDescriptor(object);
			addPlannedLOEPropertyDescriptor(object);
			addActualLOEPropertyDescriptor(object);
			addAffectedArtifactsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cr ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_crID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_crID_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__CR_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_summary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_summary_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_description_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_version_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ch Helpful feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChHelpfulPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_chHelpful_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_chHelpful_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__CH_HELPFUL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Merge Rationale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMergeRationalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_mergeRationale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_mergeRationale_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__MERGE_RATIONALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planned LOE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlannedLOEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_plannedLOE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_plannedLOE_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__PLANNED_LOE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual LOE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualLOEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_actualLOE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_actualLOE_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__ACTUAL_LOE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Affected Artifacts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffectedArtifactsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Change_Request_Ticket_affectedArtifacts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Change_Request_Ticket_affectedArtifacts_feature", "_UI_Change_Request_Ticket_type"),
				 TIMPackage.Literals.CHANGE_REQUEST_TICKET__AFFECTED_ARTIFACTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Change_Request_Ticket.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Change_Request_Ticket"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Change_Request_Ticket change_Request_Ticket = (Change_Request_Ticket)object;
		return getString("_UI_Change_Request_Ticket_type") + " " + change_Request_Ticket.getCrID();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Change_Request_Ticket.class)) {
			case TIMPackage.CHANGE_REQUEST_TICKET__CR_ID:
			case TIMPackage.CHANGE_REQUEST_TICKET__SUMMARY:
			case TIMPackage.CHANGE_REQUEST_TICKET__DESCRIPTION:
			case TIMPackage.CHANGE_REQUEST_TICKET__VERSION:
			case TIMPackage.CHANGE_REQUEST_TICKET__CH_HELPFUL:
			case TIMPackage.CHANGE_REQUEST_TICKET__MERGE_RATIONALE:
			case TIMPackage.CHANGE_REQUEST_TICKET__PLANNED_LOE:
			case TIMPackage.CHANGE_REQUEST_TICKET__ACTUAL_LOE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TIMEditPlugin.INSTANCE;
	}

}
