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
import qmm.Revision;

/**
 * This is the item provider adapter for a {@link qmm.Revision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RevisionItemProvider extends CAEXBasicObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getRevision_RevisionDate_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRevision_OldVersion_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRevision_NewVersion_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRevision_AuthorName_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getRevision_Comment_AttrEClass());
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
	 * This returns Revision.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Revision"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Revision_type");
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

		switch (notification.getFeatureID(Revision.class)) {
			case QmmPackage.REVISION__REVISION_DATE_ATTR_ECLASS:
			case QmmPackage.REVISION__OLD_VERSION_ATTR_ECLASS:
			case QmmPackage.REVISION__NEW_VERSION_ATTR_ECLASS:
			case QmmPackage.REVISION__AUTHOR_NAME_ATTR_ECLASS:
			case QmmPackage.REVISION__COMMENT_ATTR_ECLASS:
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
				(QmmPackage.eINSTANCE.getRevision_RevisionDate_AttrEClass(),
				 QmmFactory.eINSTANCE.createRevision_revisionDate_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRevision_OldVersion_AttrEClass(),
				 QmmFactory.eINSTANCE.createRevision_oldVersion_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRevision_NewVersion_AttrEClass(),
				 QmmFactory.eINSTANCE.createRevision_newVersion_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRevision_AuthorName_AttrEClass(),
				 QmmFactory.eINSTANCE.createRevision_authorName_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getRevision_Comment_AttrEClass(),
				 QmmFactory.eINSTANCE.createRevision_comment_AttrEClass()));
	}

}
