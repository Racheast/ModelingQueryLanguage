package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;

import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Calculateables {

	static ArrayList<EClass> createDefaultCalculateableEClasses(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		EClass calculateableEClass = EObjectHelper.createEClass("Calculateable", true);
		EClass calculateableElementEClass = EObjectHelper.createEClass("CalculateableElement", true);
		calculateableElementEClass.getESuperTypes().add(calculateableEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Calculateable", calculateableEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("CalculateableElement", calculateableElementEClass);
		eClasses.add(calculateableEClass);
		eClasses.add(calculateableElementEClass);
		return eClasses;
	}

	static ArrayList<EClass> updateTypedCalculateables(String eType){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		if(QMMMetaModelBuilder_Collections.typedCalculateables.get(eType)==null)
			eClasses.addAll(QMMMetaModelBuilder_Calculateables.createTypedCalculateables(eType));
		return eClasses;
	}

	static ArrayList<EClass> createTypedCalculateables(String eType){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		
		EClass typedCalculateable = EObjectHelper.createEClass(eType + "_Calculateable", true);
		typedCalculateable.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Calculateable"));
		QMMMetaModelBuilder_Collections.typedCalculateables.put(eType,typedCalculateable);
		
		EClass typedCalculateableElement = EObjectHelper.createEClass(eType + "_CalculateableElement", true);
		typedCalculateableElement.getESuperTypes().add(typedCalculateable);
		typedCalculateableElement.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("CalculateableElement"));
		QMMMetaModelBuilder_Collections.typedCalculateableElements.put(eType, typedCalculateableElement);
		
		eClasses.add(typedCalculateable);
		eClasses.add(typedCalculateableElement);
		
		return eClasses;
	}

}
