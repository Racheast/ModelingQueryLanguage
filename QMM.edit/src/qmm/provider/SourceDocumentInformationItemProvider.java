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
import qmm.SourceDocumentInformation;

/**
 * This is the item provider adapter for a {@link qmm.SourceDocumentInformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceDocumentInformationItemProvider extends RootClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentInformationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_LastWritingDateTime_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginID_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginName_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginProjectID_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginProjectTitle_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginRelease_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginVendor_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginVendorURL_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginVersion_AttrEClass());
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
	 * This returns SourceDocumentInformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SourceDocumentInformation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SourceDocumentInformation_type");
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

		switch (notification.getFeatureID(SourceDocumentInformation.class)) {
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL_ATTR_ECLASS:
			case QmmPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION_ATTR_ECLASS:
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
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_LastWritingDateTime_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_lastWritingDateTime_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginID_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originID_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginName_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originName_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginProjectID_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originProjectID_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginProjectTitle_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originProjectTitle_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginRelease_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originRelease_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginVendor_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originVendor_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginVendorURL_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originVendorURL_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getSourceDocumentInformation_OriginVersion_AttrEClass(),
				 QmmFactory.eINSTANCE.createSourceDocumentInformation_originVersion_AttrEClass()));
	}

}
