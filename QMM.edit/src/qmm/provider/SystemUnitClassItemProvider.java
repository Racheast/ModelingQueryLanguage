/**
 */
package qmm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qmm.QmmFactory;
import qmm.QmmPackage;
import qmm.SystemUnitClass;

/**
 * This is the item provider adapter for a {@link qmm.SystemUnitClass} object.
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_Attribute());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_ExternalInterface());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_InternalElement());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_SupportedRoleClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_InternalLink());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_BaseClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_SystemUnitClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSystemUnitClass_RefBaseClassPath_AttrEClass());
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
		return getString("_UI_SystemUnitClass_type");
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
			case QmmPackage.SYSTEM_UNIT_CLASS__ATTRIBUTE:
			case QmmPackage.SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE:
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT:
			case QmmPackage.SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS:
			case QmmPackage.SYSTEM_UNIT_CLASS__INTERNAL_LINK:
			case QmmPackage.SYSTEM_UNIT_CLASS__BASE_CLASS:
			case QmmPackage.SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS:
			case QmmPackage.SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
				(QmmPackage.eINSTANCE.getSystemUnitClass_Attribute(),
				 QmmFactory.eINSTANCE.createAttribute_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSystemUnitClass_ExternalInterface(),
				 QmmFactory.eINSTANCE.createInterfaceClass_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSystemUnitClass_InternalElement(),
				 QmmFactory.eINSTANCE.createInternalElement_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSystemUnitClass_SupportedRoleClass(),
				 QmmFactory.eINSTANCE.createSupportedRoleClass_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSystemUnitClass_InternalLink(),
				 QmmFactory.eINSTANCE.createInternalLink_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSystemUnitClass_BaseClass(),
				 QmmFactory.eINSTANCE.createSystemUnitClass_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSystemUnitClass_SystemUnitClass(),
				 QmmFactory.eINSTANCE.createSystemUnitClass_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSystemUnitClass_RefBaseClassPath_AttrEClass(),
				 QmmFactory.eINSTANCE.createSystemUnitClass_refBaseClassPath_AttrEClass()));
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
			childFeature == QmmPackage.eINSTANCE.getSystemUnitClass_BaseClass() ||
			childFeature == QmmPackage.eINSTANCE.getSystemUnitClass_SystemUnitClass();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
