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

import qmm.CAEXFile;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.CAEXFile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CAEXFileItemProvider extends CAEXBasicObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFileItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_SourceDocumentInformation());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_ExternalReference());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_InstanceHierarchy());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_InterfaceClassLib());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_RoleClassLib());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_SystemUnitClassLib());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_AttributeTypeLib());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_SuperiorStandardVersion_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_FileName_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getCAEXFile_SchemaVersion_AttrEClass());
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
	 * This returns CAEXFile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CAEXFile"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CAEXFile_type");
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

		switch (notification.getFeatureID(CAEXFile.class)) {
			case QmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
			case QmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
			case QmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
			case QmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
			case QmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
			case QmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
			case QmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
			case QmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION_ATTR_ECLASS:
			case QmmPackage.CAEX_FILE__FILE_NAME_ATTR_ECLASS:
			case QmmPackage.CAEX_FILE__SCHEMA_VERSION_ATTR_ECLASS:
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
				(QmmPackage.eINSTANCE.getCAEXFile_SourceDocumentInformation(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_ExternalReference(),
				 QmmFactory.eINSTANCE.createExternalReferenceType_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_InstanceHierarchy(),
				 QmmFactory.eINSTANCE.createInstanceHierarchy_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_InterfaceClassLib(),
				 QmmFactory.eINSTANCE.createInterfaceClassLib_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_RoleClassLib(),
				 QmmFactory.eINSTANCE.createRoleClassLib_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_SystemUnitClassLib(),
				 QmmFactory.eINSTANCE.createSystemUnitClassLib_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_AttributeTypeLib(),
				 QmmFactory.eINSTANCE.createAttributeLib_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_SuperiorStandardVersion_AttrEClass(),
				 QmmFactory.eINSTANCE.createCAEXFile_superiorStandardVersion_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_FileName_AttrEClass(),
				 QmmFactory.eINSTANCE.createCAEXFile_fileName_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getCAEXFile_SchemaVersion_AttrEClass(),
				 QmmFactory.eINSTANCE.createCAEXFile_schemaVersion_AttrEClass()));
	}

}
