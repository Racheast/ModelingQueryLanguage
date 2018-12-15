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

import qrmm.CAEXFile;
import qrmm.QrmmFactory;
import qrmm.QrmmPackage;

/**
 * This is the item provider adapter for a {@link qrmm.CAEXFile} object.
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

			addSuperiorStandardVersionPropertyDescriptor(object);
			addFileNamePropertyDescriptor(object);
			addSchemaVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Superior Standard Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperiorStandardVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CAEXFile_superiorStandardVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CAEXFile_superiorStandardVersion_feature", "_UI_CAEXFile_type"),
				 QrmmPackage.Literals.CAEX_FILE__SUPERIOR_STANDARD_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CAEXFile_fileName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CAEXFile_fileName_feature", "_UI_CAEXFile_type"),
				 QrmmPackage.Literals.CAEX_FILE__FILE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CAEXFile_schemaVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CAEXFile_schemaVersion_feature", "_UI_CAEXFile_type"),
				 QrmmPackage.Literals.CAEX_FILE__SCHEMA_VERSION,
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
			childrenFeatures.add(QrmmPackage.Literals.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION);
			childrenFeatures.add(QrmmPackage.Literals.CAEX_FILE__EXTERNAL_REFERENCE);
			childrenFeatures.add(QrmmPackage.Literals.CAEX_FILE__INSTANCE_HIERARCHY);
			childrenFeatures.add(QrmmPackage.Literals.CAEX_FILE__INTERFACE_CLASS_LIB);
			childrenFeatures.add(QrmmPackage.Literals.CAEX_FILE__ROLE_CLASS_LIB);
			childrenFeatures.add(QrmmPackage.Literals.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB);
			childrenFeatures.add(QrmmPackage.Literals.CAEX_FILE__ATTRIBUTE_TYPE_LIB);
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
		String label = ((CAEXFile)object).getFileName();
		return label == null || label.length() == 0 ?
			getString("_UI_CAEXFile_type") :
			getString("_UI_CAEXFile_type") + " " + label;
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
			case QrmmPackage.CAEX_FILE__SUPERIOR_STANDARD_VERSION:
			case QrmmPackage.CAEX_FILE__FILE_NAME:
			case QrmmPackage.CAEX_FILE__SCHEMA_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QrmmPackage.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION:
			case QrmmPackage.CAEX_FILE__EXTERNAL_REFERENCE:
			case QrmmPackage.CAEX_FILE__INSTANCE_HIERARCHY:
			case QrmmPackage.CAEX_FILE__INTERFACE_CLASS_LIB:
			case QrmmPackage.CAEX_FILE__ROLE_CLASS_LIB:
			case QrmmPackage.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB:
			case QrmmPackage.CAEX_FILE__ATTRIBUTE_TYPE_LIB:
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
				(QrmmPackage.Literals.CAEX_FILE__SOURCE_DOCUMENT_INFORMATION,
				 QrmmFactory.eINSTANCE.createSourceDocumentInformation()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.CAEX_FILE__EXTERNAL_REFERENCE,
				 QrmmFactory.eINSTANCE.createExternalReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.CAEX_FILE__INSTANCE_HIERARCHY,
				 QrmmFactory.eINSTANCE.createInstanceHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.CAEX_FILE__INTERFACE_CLASS_LIB,
				 QrmmFactory.eINSTANCE.createInterfaceClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.CAEX_FILE__ROLE_CLASS_LIB,
				 QrmmFactory.eINSTANCE.createRoleClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.CAEX_FILE__SYSTEM_UNIT_CLASS_LIB,
				 QrmmFactory.eINSTANCE.createSystemUnitClassLib()));

		newChildDescriptors.add
			(createChildParameter
				(QrmmPackage.Literals.CAEX_FILE__ATTRIBUTE_TYPE_LIB,
				 QrmmFactory.eINSTANCE.createAttributeLib()));
	}

}
