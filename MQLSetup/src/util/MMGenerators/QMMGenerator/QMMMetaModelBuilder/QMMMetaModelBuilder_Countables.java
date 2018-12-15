package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import org.eclipse.emf.ecore.EClass;

import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Countables {

	static EClass createDefaultCountableEClass(){
		EClass countableEClass = EObjectHelper.createEClass("Countable", true);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Countable", countableEClass);
		return countableEClass;
	}

}
