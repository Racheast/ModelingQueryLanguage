/**
 */
package qrmm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qrmm.ChangeMode;
import qrmm.QrmmFactory;
import qrmm.QrmmPackage;
import qrmm.RoleRequirements;

/**
 * This is the item provider adapter for a {@link qrmm.RoleRequirements} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleRequirementsItemProvider extends CAEXBasicObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequirementsItemProvider(AdapterFactory adapterFactory) {
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

			addRoleClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Role Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoleRequirements_roleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoleRequirements_roleClass_feature", "_UI_RoleRequirements_type"),
				 QrmmPackage.Literals.ROLE_REQUIREMENTS__ROLE_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(QrmmPackage.Literals.ROLE_REQUIREMENTS__ATTRIBUTE);
			childrenFeatures.add(QrmmPackage.Literals.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE);
			childrenFeatures.add(QrmmPackage.Literals.ROLE_REQUIREMENTS__MAPPING_OBJECT);
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
	 * This returns RoleRequirements.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoleRequirements"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ChangeMode labelValue = ((RoleRequirements)object).getChangeMode();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_RoleRequirements_type") :
			getString("_UI_RoleRequirements_type") + " " + label;
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

		switch (notification.getFeatureID(RoleRequirements.class)) {
			case QrmmPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
			case QrmmPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
			case QrmmPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
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
				(QrmmPackage.Literals.ROLE_REQUIREMENTS__ATTRIBUTE,
				 QrmmFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.ROLE_REQUIREMENTS__ATTRIBUTE,
				 QrmmFactory.eINSTANCE.createAttributeFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE,
				 QrmmFactory.eINSTANCE.createInterfaceClass()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE,
				 QrmmFactory.eINSTANCE.createExternalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE,
				 QrmmFactory.eINSTANCE.createInterfaceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.ROLE_REQUIREMENTS__MAPPING_OBJECT,
				 QrmmFactory.eINSTANCE.createMapping()));
	}

}
