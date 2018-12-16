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

import qmm.FindQuery;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.FindQuery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FindQueryItemProvider extends QueryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindQueryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getFindQuery_Where());
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
	 * This returns FindQuery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FindQuery"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FindQuery_type");
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

		switch (notification.getFeatureID(FindQuery.class)) {
			case QmmPackage.FIND_QUERY__WHERE:
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
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createCAEXBasicObject()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createCAEXObject()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createAttributeFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createAttributeNameMapping()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createAttributeLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createAttributeValueRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createCAEXFile()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createDocumentRoot()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createInterfaceClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createExternalInterface()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createExternalReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createInstanceHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createInterfaceClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createInterfaceFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createInterfaceIDMapping()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createSystemUnitClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createInternalElement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createInternalLink()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createMapping()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createNominalScaledType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createOrdinalScaledType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createRefSemantic()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createRoleClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createRoleFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createRoleRequirements()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createSupportedRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createSystemUnitClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createSystemUnitFamily()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createUnknownType()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createCopyright()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createRevision()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createGenericElement()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createAdditionalInformation()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getFindQuery_Where(),
				 QmmFactory.eINSTANCE.createGenericAttribute()));
	}

}
