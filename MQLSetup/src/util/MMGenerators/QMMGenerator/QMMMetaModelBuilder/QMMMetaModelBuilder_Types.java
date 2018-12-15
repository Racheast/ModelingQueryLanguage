package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcorePackage.Literals;
import org.eclipse.emf.ecore.util.EcoreUtil;

import util.MMGenerators.QMMGenerator.CSVReader;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Types {

	static EClass createConcreteTypeEClass(String eType){
		EClass typeEClass = EObjectHelper.createEClass(eType + "_Type", true);
		typeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Type"));
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("type", eType);
		typeEClass.getEAnnotations().add(infoAnnotation);
		QMMMetaModelBuilder_Collections.typeEClasses.put(eType, typeEClass);
		return typeEClass;
	}

	static EClass createFunctionalType(String eType){
		EClass functionalType = EObjectHelper.createEClass(eType + "_FunctionalType", true);		
		functionalType.getESuperTypes().add(QMMMetaModelBuilder_Collections.typeEClasses.get(eType));
		functionalType.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("FunctionalType"));
		
		if(eType.equals("Boolean") || eType.equals(EcorePackage.Literals.EBOOLEAN.getName())){
			functionalType.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NegatableElement"));
		}
		
		QMMMetaModelBuilder_Collections.functionalTypes.put(eType, functionalType);
		return functionalType;
	}

	static EClass createDefaultTypeEClass(){
		EClass typeEClass = EObjectHelper.createEClass("Type", true);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Type", typeEClass);
		return typeEClass;
	}

	static ArrayList<EClassifier> updateTypesForType(String eType){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
		
		if(QMMMetaModelBuilder_Collections.typeEClasses.get(eType)==null)
			eClassifiers.add(createConcreteTypeEClass(eType));
		if(QMMMetaModelBuilder_Collections.functionalTypes.get(eType)==null)
			eClassifiers.add(createFunctionalType(eType));
		if(QMMMetaModelBuilder_Collections.typedFunctionalParameters.get(eType)==null)
			eClassifiers.addAll(QMMMetaModelBuilder_Parameters.createTypedParameter(eType));
	
		return eClassifiers;
	}

	static ArrayList<EClassifier> updateExpressionTypeSystem(String eType){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
		eClassifiers.addAll(QMMMetaModelBuilder_Operators.updateTypedOperators(eType));
		eClassifiers.addAll(updateTypesForType(eType));
		eClassifiers.addAll(QMMMetaModelBuilder_Calculateables.updateTypedCalculateables(eType)); 
		eClassifiers.addAll(QMMMetaModelBuilder_Arguments.updateTypedArguments(eType));
		eClassifiers.addAll(QMMMetaModelBuilder_Operators.updateTypedExpressionOperators(eType));
		return eClassifiers;
	}

	static EClass createDefaultFunctionalTypeEClass(){
		EClass functionalTypeEClass = EObjectHelper.createEClass("FunctionalType", true);
		functionalTypeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Type"));
		QMMMetaModelBuilder_Collections.defaultEClasses.put("FunctionalType", functionalTypeEClass);
		return functionalTypeEClass;
	}

	static ArrayList<EClassifier> addSuperTypeToType(String childType, String superType){		
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
		
		EClass childTypeEClass = QMMMetaModelBuilder_Collections.typeEClasses.get(childType);
		EClass superTypeEClass = QMMMetaModelBuilder_Collections.typeEClasses.get(superType);
		
		
		if(!childTypeEClass.getEAllSuperTypes().contains(superTypeEClass))
			childTypeEClass.getESuperTypes().add(superTypeEClass);
		
		EClass originalFunctionalOperator = QMMMetaModelBuilder_Collections.functionalOperators.get(childType);
		EClass inheritedFunctionalOperator = EcoreUtil.copy(QMMMetaModelBuilder_Collections.functionalOperators.get(superType));
		
		//Assign copies of all concreteFunctionalOperators of superType as children to this new inheritedFunctionalOperator
		String inheritance_prefix = superType + "_" + childType + "_";
		Collection<EClass> copiedConcreteFunctionalOperators = EcoreUtil.copyAll(QMMMetaModelBuilder_Collections.concreteFunctionalOperators.get(superType));
		for(EClass copiedConcreteFunctionalOperator:copiedConcreteFunctionalOperators){
			EClass functionalType = EObjectHelper.getFunctionalType(copiedConcreteFunctionalOperator);
			EcoreUtil.setEList(copiedConcreteFunctionalOperator.getESuperTypes(), new BasicEList());
			copiedConcreteFunctionalOperator.getESuperTypes().add(inheritedFunctionalOperator);
			copiedConcreteFunctionalOperator.getESuperTypes().add(functionalType);
			copiedConcreteFunctionalOperator.setName(inheritance_prefix + copiedConcreteFunctionalOperator.getName());
			if(!QMMMetaModelBuilder_Collections.concreteFunctionalOperators.containsKey(childType))
				QMMMetaModelBuilder_Collections.concreteFunctionalOperators.put(childType, new ArrayList<EClass>());
			QMMMetaModelBuilder_Collections.concreteFunctionalOperators.get(childType).add(copiedConcreteFunctionalOperator);
		}
		
		
		//Create newFunctionalOperator for childType with name of originalFunctionalOperator
		EClass newFuntionalOperator = EObjectHelper.createEClass(originalFunctionalOperator.getName(), true);
		
		//Add all ESuperTypes from originalFunctionalOperator to newFunctionalOperator
		newFuntionalOperator.getESuperTypes().addAll(originalFunctionalOperator.getEAllSuperTypes());
		
		//replace eReferences in FunctionalType(childType) from ->originalFunctionalOperator to ->newFunctionalOperator
		EClass functionalType = QMMMetaModelBuilder_Collections.functionalTypes.get(childType);
		
		
		EStructuralFeature operatorFeature = QMMMetaModelBuilder_Collections.functionalTypes.get(childType).getEStructuralFeature("operator");
		operatorFeature.setEType(newFuntionalOperator);
		
		//remove eSuperTypes from originalFunctionalOperator
		EcoreUtil.setEList(originalFunctionalOperator.getESuperTypes(), new BasicEList());
		
		//rename originalFunctionalOperator to "Original" + originalFunctionalOperator.getName()
		originalFunctionalOperator.setName(childType + "_Original_FunctionalOperator");
		
		//remove eSupterType from inheritedFunctionalOperator
		EcoreUtil.setEList(inheritedFunctionalOperator.getESuperTypes(), new BasicEList());
		
		//rename inheritedFunctionalOperator to "Inherited" + inheritedFunctionalOperator.getName()
		inheritedFunctionalOperator.setName("InheritedFrom_" + superType + "_to_" + childType + "_FunctionalOperator");
		
		//add newFunctionalOperator as eSuperType to originalFunctionalOperator and inheritedFunctionalOperator
		originalFunctionalOperator.getESuperTypes().add(newFuntionalOperator);
		inheritedFunctionalOperator.getESuperTypes().add(newFuntionalOperator);
		
		eClassifiers.addAll(copiedConcreteFunctionalOperators);
		eClassifiers.add(newFuntionalOperator);
		eClassifiers.add(inheritedFunctionalOperator);
		
		return eClassifiers;
		
	}

	static ArrayList<EClassifier> initTypeInfrastructure(){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();  
		ArrayList<String[]> lines = CSVReader.readTypeHierarchy();
		
		for(int i=0; i<lines.size(); i++){
			String[] line = lines.get(i);  //[0]..superClass //[1]..childClass
			eClassifiers.addAll(QMMMetaModelBuilder_Calculateables.updateTypedCalculateables(line[0]));
			eClassifiers.addAll(QMMMetaModelBuilder_Calculateables.updateTypedCalculateables(line[1]));
			eClassifiers.addAll(updateExpressionTypeSystem(line[0]));
			eClassifiers.addAll(updateExpressionTypeSystem(line[1]));
			eClassifiers.addAll(addSuperTypeToType(line[1], line[0]));			
		}
		return eClassifiers;
	}

}
