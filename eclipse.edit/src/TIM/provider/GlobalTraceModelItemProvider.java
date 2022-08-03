/**
 */
package TIM.provider;


import TIM.GlobalTraceModel;
import TIM.TIMFactory;
import TIM.TIMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TIM.GlobalTraceModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalTraceModelItemProvider 
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
	public GlobalTraceModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__GTM_CONTROLLER);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__LTM_CONTROLLER);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__GTM_VERSION);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__MODEL_BLOCKS);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__TEST_BLOCKS);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS);
			childrenFeatures.add(TIMPackage.Literals.GLOBAL_TRACE_MODEL__CR_TICKETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GlobalTraceModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GlobalTraceModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GlobalTraceModel_type");
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

		switch (notification.getFeatureID(GlobalTraceModel.class)) {
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_CONTROLLER:
			case TIMPackage.GLOBAL_TRACE_MODEL__LTM_CONTROLLER:
			case TIMPackage.GLOBAL_TRACE_MODEL__GTM_VERSION:
			case TIMPackage.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS:
			case TIMPackage.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS:
			case TIMPackage.GLOBAL_TRACE_MODEL__MODEL_BLOCKS:
			case TIMPackage.GLOBAL_TRACE_MODEL__TEST_BLOCKS:
			case TIMPackage.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS:
			case TIMPackage.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS:
			case TIMPackage.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS:
			case TIMPackage.GLOBAL_TRACE_MODEL__CR_TICKETS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__GTM_CONTROLLER,
				 TIMFactory.eINSTANCE.createGTMController()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__LTM_CONTROLLER,
				 TIMFactory.eINSTANCE.createLTMController()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__GTM_VERSION,
				 TIMFactory.eINSTANCE.createGTMVersion()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__SYS_REQUIREMENTS,
				 TIMFactory.eINSTANCE.createSystemRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__FUNC_REQUIREMENTS,
				 TIMFactory.eINSTANCE.createFunctionalRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__MODEL_BLOCKS,
				 TIMFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__TEST_BLOCKS,
				 TIMFactory.eINSTANCE.createTest()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__DERIVE_TRACE_LINKS,
				 TIMFactory.eINSTANCE.createDerive()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__IMPLEMENT_TRACE_LINKS,
				 TIMFactory.eINSTANCE.createImplement()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__VERIFY_TRACE_LINKS,
				 TIMFactory.eINSTANCE.createVerify()));

		newChildDescriptors.add
			(createChildParameter
				(TIMPackage.Literals.GLOBAL_TRACE_MODEL__CR_TICKETS,
				 TIMFactory.eINSTANCE.createChange_Request_Ticket()));
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
