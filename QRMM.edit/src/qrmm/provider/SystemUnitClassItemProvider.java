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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qrmm.QrmmFactory;
import qrmm.QrmmPackage;
import qrmm.SystemUnitClass;

/**
 * This is the item provider adapter for a {@link qrmm.SystemUnitClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemUnitClassItemProvider extends CAEXObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClassItemProvider(AdapterFactory adapterFactory) {
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

			addBaseClassPropertyDescriptor(object);
			addRefBaseClassPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemUnitClass_baseClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemUnitClass_baseClass_feature", "_UI_SystemUnitClass_type"),
				 QrmmPackage.Literals.SYSTEM_UNIT_CLASS__BASE_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref Base Class Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefBaseClassPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemUnitClass_refBaseClassPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemUnitClass_refBaseClassPath_feature", "_UI_SystemUnitClass_type"),
				 QrmmPackage.Literals.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__ATTRIBUTE);
			childrenFeatures.add(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE);
			childrenFeatures.add(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT);
			childrenFeatures.add(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS);
			childrenFeatures.add(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__INTERNAL_LINK);
			childrenFeatures.add(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS);
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
	 * This returns SystemUnitClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemUnitClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SystemUnitClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemUnitClass_type") :
			getString("_UI_SystemUnitClass_type") + " " + label;
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

		switch (notification.getFeatureID(SystemUnitClass.class)) {
			case QrmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QrmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
			case QrmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
			case QrmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
			case QrmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
			case QrmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
			case QrmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
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
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__ATTRIBUTE,
				 QrmmFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__ATTRIBUTE,
				 QrmmFactory.eINSTANCE.createAttributeFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE,
				 QrmmFactory.eINSTANCE.createInterfaceClass()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE,
				 QrmmFactory.eINSTANCE.createExternalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE,
				 QrmmFactory.eINSTANCE.createInterfaceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT,
				 QrmmFactory.eINSTANCE.createInternalElement()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS,
				 QrmmFactory.eINSTANCE.createSupportedRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__INTERNAL_LINK,
				 QrmmFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS,
				 QrmmFactory.eINSTANCE.createSystemUnitClass()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS,
				 QrmmFactory.eINSTANCE.createInternalElement()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS,
				 QrmmFactory.eINSTANCE.createSystemUnitFamily()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == QrmmPackage.Literals.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT ||
			childFeature == QrmmPackage.Literals.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
