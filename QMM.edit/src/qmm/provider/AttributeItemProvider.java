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

import qmm.Attribute;
import qmm.QmmFactory;
import qmm.QmmPackage;

/**
 * This is the item provider adapter for a {@link qmm.Attribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeItemProvider extends CAEXObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_RefSemantic());
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_Constraint());
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_Attribute());
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_DefaultValue_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_Value_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_AttributeDataType_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_RefAttributeType_AttrEClass());
			childrenFeatures.add(QmmPackage.eINSTANCE.getAttribute_Unit_AttrEClass());
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
	 * This returns Attribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Attribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Attribute_type");
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

		switch (notification.getFeatureID(Attribute.class)) {
			case QmmPackage.ATTRIBUTE__REF_SEMANTIC:
			case QmmPackage.ATTRIBUTE__CONSTRAINT:
			case QmmPackage.ATTRIBUTE__ATTRIBUTE:
			case QmmPackage.ATTRIBUTE__DEFAULT_VALUE_ATTR_ECLASS:
			case QmmPackage.ATTRIBUTE__VALUE_ATTR_ECLASS:
			case QmmPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE_ATTR_ECLASS:
			case QmmPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE_ATTR_ECLASS:
			case QmmPackage.ATTRIBUTE__UNIT_ATTR_ECLASS:
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
				(QmmPackage.eINSTANCE.getAttribute_RefSemantic(),
				 QmmFactory.eINSTANCE.createRefSemantic_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getAttribute_Constraint(),
				 QmmFactory.eINSTANCE.createAttributeValueRequirement_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getAttribute_Attribute(),
				 QmmFactory.eINSTANCE.createAttribute_OrGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getAttribute_DefaultValue_AttrEClass(),
				 QmmFactory.eINSTANCE.createAttribute_defaultValue_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getAttribute_Value_AttrEClass(),
				 QmmFactory.eINSTANCE.createAttribute_value_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getAttribute_AttributeDataType_AttrEClass(),
				 QmmFactory.eINSTANCE.createAttribute_attributeDataType_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getAttribute_RefAttributeType_AttrEClass(),
				 QmmFactory.eINSTANCE.createAttribute_refAttributeType_AttrEClass()));

		newChildDescriptors.add
			(createChildParameter
				(QmmPackage.eINSTANCE.getAttribute_Unit_AttrEClass(),
				 QmmFactory.eINSTANCE.createAttribute_unit_AttrEClass()));
	}

}
