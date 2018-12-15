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
import qmm.RoleClass;

/**
 * This is the item provider adapter for a {@link qmm.RoleClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleClassItemProvider extends CAEXObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getRoleClass_Attribute());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRoleClass_ExternalInterface());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRoleClass_BaseClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRoleClass_RoleClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRoleClass_RefBaseClassPath_AttrEClass());
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
	 * This returns RoleClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoleClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RoleClass_type");
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

		switch (notification.getFeatureID(RoleClass.class)) {
			case QmmPackage.ROLE_CLASS__ATTRIBUTE:
			case QmmPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
			case QmmPackage.ROLE_CLASS__BASE_CLASS:
			case QmmPackage.ROLE_CLASS__ROLE_CLASS:
			case QmmPackage.ROLE_CLASS__REF_BASE_CLASS_PATH_ATTR_ECLASS:
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
				(QmmPackage.eINSTANCE.getRoleClass_Attribute(),
				 QmmFactory.eINSTANCE.createAttribute_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRoleClass_ExternalInterface(),
				 QmmFactory.eINSTANCE.createExternalInterface_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRoleClass_BaseClass(),
				 QmmFactory.eINSTANCE.createRoleClass_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRoleClass_RoleClass(),
				 QmmFactory.eINSTANCE.createRoleClass_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRoleClass_RefBaseClassPath_AttrEClass(),
				 QmmFactory.eINSTANCE.createRoleClass_refBaseClassPath_AttrEClass()));
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
			childFeature == QmmPackage.eINSTANCE.getRoleClass_BaseClass() ||
			childFeature == QmmPackage.eINSTANCE.getRoleClass_RoleClass();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
