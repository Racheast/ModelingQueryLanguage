package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcorePackage.Literals;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_OrGroups {

	static EClass createDefaultOrGroupEClass(){
		EClass orGroup = EObjectHelper.createEClass("OrGroup", true);
		orGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NamedElement"));
		orGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Countable"));
		orGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NegatableElement"));  
		EAttribute transitive = EObjectHelper.createEAttribute("transitive", EcorePackage.Literals.EBOOLEAN, 1, 1, false);
		transitive.setDefaultValue(new Boolean(false));
		orGroup.getEStructuralFeatures().add(transitive);
		orGroup.getEOperations().add(EObjectHelper.createValidationOperation(EClassMethodBodies.ORGROUP_VALIDATIONOPERATION_BODY));
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("OrGroup", orGroup);
		return orGroup;
	}

	static EClass createConcreteOrGroup(EReference eRef){
		EClass concreteOrGroup = QMMMetaModelBuilder_Collections.concreteOrGroups.get(eRef.getEType());
		
		if(concreteOrGroup==null){
			concreteOrGroup = EObjectHelper.createEClass(eRef.getEType().getName() + "_OrGroup", false);
			concreteOrGroup.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("OrGroup"));
			//EReference newERef = EObjectHelper.createEReference(eRef.getEType().getName().toLowerCase() + "_containment", eRef.getEType(), 0, -1, true);  //commented out on 9.12.18, trying to simplify refName
			EReference newERef = EObjectHelper.createEReference("containment", eRef.getEType(), 0, -1, true);
			concreteOrGroup.getEStructuralFeatures().add(newERef);
			QMMMetaModelBuilder_Collections.concreteOrGroups.put(eRef.getEType(), concreteOrGroup);
		}
		
		eRef.setLowerBound(0);
		eRef.setUpperBound(-1);
		eRef.setEType(concreteOrGroup);
		
		return concreteOrGroup;
	}

}
