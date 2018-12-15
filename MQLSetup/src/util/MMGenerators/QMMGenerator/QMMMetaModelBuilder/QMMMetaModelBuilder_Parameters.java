package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Parameters {

	static ArrayList<EClass> createDefaultParameterEClasses(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		EClass parameterEClass = EObjectHelper.createEClass("Parameter", true);
		parameterEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("TypedElement"));
		
		//ReferenceParameter
		
		EClass countableReferenceParameterEClass = EObjectHelper.createEClass("CountableReferenceParameter", false);
		countableReferenceParameterEClass.getESuperTypes().add(parameterEClass);
		EReference countableArgumentERef = EObjectHelper.createEReference("argument", QMMMetaModelBuilder_Collections.defaultEClasses.get("Countable_ReferenceArgument"), 1, 1, true);
		countableReferenceParameterEClass.getEStructuralFeatures().add(countableArgumentERef);
		
		EClass calculateableParameterEClass = EObjectHelper.createEClass("CalculateableParameter", true); 
		calculateableParameterEClass.getESuperTypes().add(parameterEClass);
		EReference calculateableArgumentERef = EObjectHelper.createEReference("argument", QMMMetaModelBuilder_Collections.defaultEClasses.get("Calculateable_Argument"), 1, 1, true);
		calculateableParameterEClass.getEStructuralFeatures().add(calculateableArgumentERef);
		
		//FunctionalParameter
		
		EClass functionalParameter = EObjectHelper.createEClass("FunctionalParameter", true);
		functionalParameter.getESuperTypes().add(parameterEClass);
		EReference argumentERef = EObjectHelper.createEReference("argument", QMMMetaModelBuilder_Collections.defaultEClasses.get("FunctionalArgument"), 1, 1, true);
		functionalParameter.getEStructuralFeatures().add(argumentERef);
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Parameter", parameterEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("CountableReferenceParameter", countableReferenceParameterEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("CalculateableParameter", calculateableParameterEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("FunctionalParameter", functionalParameter);
		
		eClasses.add(parameterEClass);
		eClasses.add(countableReferenceParameterEClass);
		eClasses.add(calculateableParameterEClass);
		eClasses.add(functionalParameter);
		
		return eClasses;
	}

	static ArrayList<EClass> createTypedParameter(String eType){
		
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		
		String paramName = eType + "_CalculateableParameter";
		
		EOperation validationOperation = EObjectHelper.createValidationOperation(EObjectHelper.writeTypedParameterValidationBodyForEClass(paramName));
		
		EClass calculateableReferenceParameter = EObjectHelper.createEClass(paramName, false);
		calculateableReferenceParameter.getESuperTypes().add(QMMMetaModelBuilder_Collections.typeEClasses.get(eType));
		calculateableReferenceParameter.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("CalculateableParameter"));
		calculateableReferenceParameter.getEOperations().add(validationOperation);
		QMMMetaModelBuilder_Collections.typedCalculateableParameters.put(eType, calculateableReferenceParameter);
		
		paramName = eType + "_FunctionalParameter";
		EClass functionalParameter = EObjectHelper.createEClass(paramName, false);
		functionalParameter.getESuperTypes().add(QMMMetaModelBuilder_Collections.typeEClasses.get(eType));
		functionalParameter.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("FunctionalParameter"));
		functionalParameter.getEOperations().add(EObjectHelper.createValidationOperation(EObjectHelper.writeTypedParameterValidationBodyForEClass(paramName)));
		
		eClasses.add(calculateableReferenceParameter);
		eClasses.add(functionalParameter);
			
		QMMMetaModelBuilder_Collections.typedFunctionalParameters.put(eType, functionalParameter);
					
		return eClasses;
	}

	static EReference createParameterReference(String name, String parameterType){
		EReference parameterERef = EObjectHelper.createEReference(name, QMMMetaModelBuilder_Collections.typedFunctionalParameters.get(parameterType), 1, 1, true);
		return parameterERef;
	}

}
