package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import util.MMGenerators.QMMGenerator.CSVReader;
import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Operators {

	static ArrayList<EClass> createDefaultOperatorEClasses(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		
		EClass operator = EObjectHelper.createEClass("Operator", true);
		
		EClass enumerationOperator = EObjectHelper.createEClass("EnumerationOperator", true);
		enumerationOperator.getESuperTypes().add(operator);
		
		EClass expressionOperator = EObjectHelper.createEClass("ExpressionOperator", true);
		expressionOperator.getESuperTypes().add(operator);
		
		EClass bitOperator = EObjectHelper.createEClass("BitOperator", true);
		bitOperator.getESuperTypes().add(expressionOperator);
		bitOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NegatableElement"));
		
		EClass functionalOperator = EObjectHelper.createEClass("FunctionalOperator", true);
		functionalOperator.getESuperTypes().add(expressionOperator);
	
		functionalOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("TypedElement"));
		
		/*
		String body = "qmm.FunctionalOperator operator = this;"
			+ "\nwhile(operator.eGet(operator.eClass().getEStructuralFeature(\"operator\")) != null){"
			+ "\n    operator = (qmm.FunctionalOperator) operator.eGet(operator.eClass().getEStructuralFeature(\"operator\"));"
			+ "\n}"
			+ "\nreturn operator;";
		*/
		EAnnotation genModelAnnotation = EObjectHelper.createGenModelAnnotation(EClassMethodBodies.FUNCTIONAL_OPERATOR_GETLASTOPERATOR_BODY);
		EOperation getLastOperator = EObjectHelper.createEOperation("getLastOperator", EcorePackage.Literals.EJAVA_OBJECT, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation)));
		functionalOperator.getEOperations().add(getLastOperator);	
		
		EClass evaluationOperator = EObjectHelper.createEClass("EvaluationOperator", true);
		evaluationOperator.getESuperTypes().add(operator);
		
		EClass evaluationFunctionalOperator = EObjectHelper.createEClass("EvaluationFunctionalOperator", true);
		evaluationFunctionalOperator.getESuperTypes().add(evaluationOperator);
		evaluationFunctionalOperator.getESuperTypes().add(functionalOperator);
		
		EClass evaluationBitOperator = EObjectHelper.createEClass("EvaluationBitOperator", true);
		evaluationBitOperator.getESuperTypes().add(evaluationOperator);
		evaluationBitOperator.getESuperTypes().add(bitOperator);
		EReference operatorERef = EObjectHelper.createEReference("connects", evaluationOperator, 2, -1, true);
		evaluationBitOperator.getEStructuralFeatures().add(operatorERef);
		
		EClass andOperator = EObjectHelper.createEClass("And_EvaluationBitOperator", false);
		andOperator.getESuperTypes().add(evaluationBitOperator);
		EAnnotation and_annotation = EObjectHelper.createGenModelAnnotation("return \"&&\";");
		EOperation getLiteral_AND = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(and_annotation)));
		andOperator.getEOperations().add(getLiteral_AND);
		
		EClass orOperator = EObjectHelper.createEClass("Or_EvaluationBitOperator", false);
		orOperator.getESuperTypes().add(evaluationBitOperator);
		EAnnotation or_annotation = EObjectHelper.createGenModelAnnotation("return \"||\";");
		EOperation getLiteral_OR = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(or_annotation)));
		orOperator.getEOperations().add(getLiteral_OR);
		
		EClass classOperator = EObjectHelper.createEClass("ClassOperator", true);
		classOperator.getESuperTypes().add(evaluationFunctionalOperator);
		
		eClasses.addAll(QMMMetaModelBuilder_Calculateables.updateTypedCalculateables("Integer"));
		
		EClass aggregationOperator = EObjectHelper.createEClass("AggregationOperator", true);
		aggregationOperator.getESuperTypes().add(evaluationFunctionalOperator);
		aggregationOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedCalculateables.get("Integer"));
		
		EClass countingOperator = EObjectHelper.createEClass("CountingAggregationOperator", true);
		EReference countingParamERef = EObjectHelper.createEReference("countable", QMMMetaModelBuilder_Collections.defaultEClasses.get("CountableReferenceParameter"), 1, 1, true);
		countingOperator.getESuperTypes().add(aggregationOperator);
		countingOperator.getEStructuralFeatures().add(countingParamERef);
		countingOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(new ArrayList<EReference>(Arrays.asList(countingParamERef))));
		
		EClass calculatingOperator = EObjectHelper.createEClass("CalculatingAggregationOperator", true);
		calculatingOperator.getESuperTypes().add(aggregationOperator);
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Operator", operator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("ExpressionOperator", expressionOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("EnumerationOperator", enumerationOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("BitOperator", bitOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("FunctionalOperator", functionalOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("ClassOperator", classOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("AggregationOperator", aggregationOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("EvaluationOperator", evaluationOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("EvaluationFunctionalOperator", evaluationFunctionalOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("And_EvaluationBitOperator", andOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Or_EvaluationBitOperator", orOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("CountingAggregationOperator", countingOperator);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("CalculatingAggregationOperator", calculatingOperator);
		
		eClasses.add(operator);
		eClasses.add(expressionOperator);
		eClasses.add(enumerationOperator);
		eClasses.add(bitOperator);
		eClasses.add(functionalOperator);
		eClasses.add(classOperator);
		eClasses.add(evaluationOperator);
		eClasses.add(evaluationFunctionalOperator);
		eClasses.add(aggregationOperator);
		eClasses.add(evaluationBitOperator);
		eClasses.add(andOperator);
		eClasses.add(orOperator);
		eClasses.add(countingOperator);
		eClasses.add(calculatingOperator);
		
		return eClasses;
	}

	static ArrayList<EClass> createCountingAggregationOperators(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		ArrayList<EClass> integerList = new ArrayList<EClass>();
		
		
		EClass countAggregationOperator = EObjectHelper.createEClass("Count_AggregationOperator", false);
		countAggregationOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("CountingAggregationOperator"));
		EAnnotation annotation = EObjectHelper.createGenModelAnnotation("return \"count\";");
		EOperation getLiteral = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(annotation)));
		countAggregationOperator.getEOperations().add(getLiteral);
		countAggregationOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedEvaluationOperationArguments.get("Integer"));
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("functionalType", "Integer");
		infoAnnotation.getDetails().put("literal", "count");
		countAggregationOperator.getEAnnotations().add(infoAnnotation);
		
		integerList.add(countAggregationOperator);
		QMMMetaModelBuilder_Collections.countingAggregationOperators.put("Integer",integerList);
		eClasses.add(countAggregationOperator);
		
		return eClasses;
	}

	static ArrayList<EClass> createCalculatingAggregationOperators(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		ArrayList<EClass> integerList = new ArrayList<EClass>();
		/*
		EClass sumAggregationOperator = EObjectHelper.createEClass("Sum_AggregationOperator", false);
		sumAggregationOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.defaultEClasses.get("CalculatingAggregationOperator"));
		EAnnotation annotationSum = EObjectHelper.createGenModelAnnotation("return \"sum\";");
		EOperation getLiteralSum = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(annotationSum)));
		sumAggregationOperator.getEOperations().add(getLiteralSum);
		sumAggregationOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.typedEvaluationOperationArguments.get("Integer"));
		EReference paramERefSum = EObjectHelper.createEReference("calculateable", QMMMetaModelBuilderCollections.typedCalculateableParameters.get("Integer"), 1, 1, true);  //9.11.18: new approach
		sumAggregationOperator.getEStructuralFeatures().add(paramERefSum);
		sumAggregationOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(new ArrayList<EReference>(Arrays.asList(paramERefSum))));
		EAnnotation infoAnnotationSum = EObjectHelper.createEAnnotation("information");
		infoAnnotationSum.getDetails().put("functionalType", "Integer");
		infoAnnotationSum.getDetails().put("literal", "sum");
		sumAggregationOperator.getEAnnotations().add(infoAnnotationSum);
		*/
		
		EClass sumAggregationOperator = EObjectHelper.createCalculatingOperator("Sum_AggregationOperator", "sum", "Integer", "Integer");
		integerList.add(sumAggregationOperator);
		
		/*
		EClass minAggregationOperator = EObjectHelper.createEClass("Min_AggregationOperator", false);
		minAggregationOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.defaultEClasses.get("CalculatingAggregationOperator"));
		EAnnotation annotationMin = EObjectHelper.createGenModelAnnotation("return \"min\";");
		EOperation getLiteralMin = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(annotationMin)));
		minAggregationOperator.getEOperations().add(getLiteralMin);
		minAggregationOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.typedEvaluationOperationArguments.get("Integer"));
		EReference paramERefMin = EObjectHelper.createEReference("calculateable", QMMMetaModelBuilderCollections.typedCalculateableParameters.get("Integer"), 1, 1, true);
		minAggregationOperator.getEStructuralFeatures().add(paramERefMin);
		minAggregationOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(new ArrayList<EReference>(Arrays.asList(paramERefMin))));
		EAnnotation infoAnnotationMin = EcoreUtil.copy(infoAnnotationSum);
		infoAnnotationMin.getDetails().put("literal", "min");
		minAggregationOperator.getEAnnotations().add(infoAnnotationMin);
		*/
		EClass minAggregationOperator = EObjectHelper.createCalculatingOperator("Min_AggregationOperator", "min", "Integer", "Integer");
		integerList.add(minAggregationOperator);
		
		/*
		EClass maxAggregationOperator = EObjectHelper.createEClass("Max_AggregationOperator", false);
		maxAggregationOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.defaultEClasses.get("CalculatingAggregationOperator"));
		EAnnotation annotationMax = EObjectHelper.createGenModelAnnotation("return \"max\";");
		EOperation getLiteralMax = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(annotationMax)));
		maxAggregationOperator.getEOperations().add(getLiteralMax);
		maxAggregationOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.typedEvaluationOperationArguments.get("Integer"));
		EReference paramERefMax = EObjectHelper.createEReference("calculateable", QMMMetaModelBuilderCollections.typedCalculateableParameters.get("Integer"), 1, 1, true);
		maxAggregationOperator.getEStructuralFeatures().add(paramERefMax);
		maxAggregationOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(new ArrayList<EReference>(Arrays.asList(paramERefMax))));
		EAnnotation infoAnnotationMax = EcoreUtil.copy(infoAnnotationMin);
		infoAnnotationMax.getDetails().put("literal", "max");
		maxAggregationOperator.getEAnnotations().add(infoAnnotationMax);
		*/
		EClass maxAggregationOperator = EObjectHelper.createCalculatingOperator("Max_AggregationOperator", "max", "Integer", "Integer");
		integerList.add(maxAggregationOperator);
		
		QMMMetaModelBuilder_Collections.calculatingAggregationOperators.put("Integer", integerList);
		
		eClasses.addAll(integerList);
		
		return eClasses;
	}

	static ArrayList<EClass> createConcreteClassOperators(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		ArrayList<EClass> integerList = new ArrayList<EClass>();
		/*
		EClass integerParseIntOperator = EObjectHelper.createEClass("IntegerParseInt_ClassOperator", false);
		integerParseIntOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.defaultEClasses.get("ClassOperator"));
		EAnnotation annotationIntegerParseInt = EObjectHelper.createGenModelAnnotation("return \"Integer.parseInt\";");
		EOperation getLiteralIntegerParseInt = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(annotationIntegerParseInt)));
		integerParseIntOperator.getEOperations().add(getLiteralIntegerParseInt);
		integerParseIntOperator.getESuperTypes().add(QMMMetaModelBuilderCollections.typedEvaluationOperationArguments.get("Integer"));
		EReference paramERefIntegerParseInt = EObjectHelper.createEReference("calculateable", QMMMetaModelBuilderCollections.typedFunctionalParameters.get("String"), 1, 1, true);
		integerParseIntOperator.getEStructuralFeatures().add(paramERefIntegerParseInt);
		integerParseIntOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(new ArrayList<EReference>(Arrays.asList(paramERefIntegerParseInt))));
		
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("functonalType", "Integer");
		infoAnnotation.getDetails().put("literal", "Integer.parseInt");
		integerParseIntOperator.getEAnnotations().add(infoAnnotation);
		
		String body = "return true;";
		integerParseIntOperator.getEOperations().add(EObjectHelper.createValidationOperation(body));
		*/
		
		EClass integerParseIntOperator = EObjectHelper.createClassOperator("IntegerParseInt_ClassOperator", "Integer.parseInt", "Integer", "String");
		integerList.add(integerParseIntOperator);
		QMMMetaModelBuilder_Collections.classOperators.put("Integer", integerList);
		
		eClasses.addAll(integerList);
		return eClasses;
	}

	static ArrayList<EClassifier> readFunctionalOperators(){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();  
		ArrayList<String[]> lines = CSVReader.readFunctionalOperators();
		for(String[] line:lines){ 
			eClassifiers.addAll(QMMMetaModelBuilder_Types.updateExpressionTypeSystem(line[0]));
			eClassifiers.addAll(QMMMetaModelBuilder_Types.updateExpressionTypeSystem(line[1]));
			ArrayList<EReference> paramEReferences = new ArrayList<EReference>();
			
			int i=4;
			while(i < line.length){
				String s = line[i];
				String paramName = s.split(":")[0];
				String paramType = s.split(":")[1];
				eClassifiers.addAll(QMMMetaModelBuilder_Types.updateExpressionTypeSystem(paramType));
				paramEReferences.add(QMMMetaModelBuilder_Parameters.createParameterReference(paramName, paramType));
				i++;
			}
			eClassifiers.add(QMMMetaModelBuilder_Operators.createConcreteFunctionalOperator(line[2], line[3], line[0], QMMMetaModelBuilder_Collections.functionalTypes.get(line[1]), paramEReferences));
			
		}
		return eClassifiers;
	}

	static ArrayList<EClass> updateTypedOperators(String eType){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		if(QMMMetaModelBuilder_Collections.typedOperators.get(eType)==null)
			eClasses.add(QMMMetaModelBuilder_Operators.createTypedOperator(eType));
		return eClasses;
	}

	static EClass createTypedOperator(String eType){
		EClass typedOperator = EObjectHelper.createEClass(eType + "_Operator", true);
		typedOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Operator"));
		QMMMetaModelBuilder_Collections.typedOperators.put(eType, typedOperator);
		return typedOperator;
	}

	static ArrayList<EClass> updateTypedEnumerationOperators(String eType){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		if(QMMMetaModelBuilder_Collections.typedOperators.get(eType)==null)
			eClasses.addAll(updateTypedOperators(eType));
		if(QMMMetaModelBuilder_Collections.typedEnumerationOperators.get(eType)==null)	
			eClasses.add(QMMMetaModelBuilder_Operators.createTypedEnumerationOperator(eType));
		return eClasses;
	}

	static EClass createTypedEnumerationOperator(String eType){
		EClass typedEnumerationOperator = EObjectHelper.createEClass(eType + "_EnumerationOperator", false);
		typedEnumerationOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("EnumerationOperator"));
		typedEnumerationOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedOperators.get(eType));
		typedEnumerationOperator.getEStructuralFeatures().add(EObjectHelper.createEAttribute("argument", QMMMetaModelBuilder_Collections.eClassifiersMap.get(eType), 1, 1, false));
		typedEnumerationOperator.getEStructuralFeatures().add(EObjectHelper.createEReference("or", typedEnumerationOperator, 0, 1, true));
		QMMMetaModelBuilder_Collections.typedEnumerationOperators.put(eType, typedEnumerationOperator);
		return typedEnumerationOperator;
	}

	static ArrayList<EClassifier> createTypedExpressionOperators(String eType){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
			
		EClass typedExpressionOperator = EObjectHelper.createEClass(eType + "_ExpressionOperator",true);
		typedExpressionOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("ExpressionOperator"));
		typedExpressionOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedOperators.get(eType));
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("type", eType);
		typedExpressionOperator.getEAnnotations().add(infoAnnotation);
		eClassifiers.add(typedExpressionOperator);
	
		//Typed_BitOperator
		EReference connectsERef = EObjectHelper.createEReference("connects", typedExpressionOperator, 2, -1, true);
		EClass typedBitOperator = EObjectHelper.createEClass(eType + "_BitOperator", true);
		typedBitOperator.getESuperTypes().add(typedExpressionOperator);
		typedBitOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("BitOperator"));
		typedBitOperator.getEStructuralFeatures().add(connectsERef);
		typedBitOperator.getEAnnotations().add(EcoreUtil.copy(infoAnnotation));
		eClassifiers.add(typedBitOperator);
			
		EAnnotation and_annotation = EObjectHelper.createGenModelAnnotation("return \"&&\";");
		EOperation and_operation = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(and_annotation)));
		EClass typedAndOperator = EObjectHelper.createEClass(eType + "_And_BitOperator", false);
		typedAndOperator.getESuperTypes().add(typedBitOperator);
		typedAndOperator.getEOperations().add(and_operation);
		typedAndOperator.getEAnnotations().add(EcoreUtil.copy(infoAnnotation));
		eClassifiers.add(typedAndOperator);
			
		EAnnotation or_annotation = EObjectHelper.createGenModelAnnotation("return \"||\";");
		EOperation or_operation = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(or_annotation)));
		EClass typedOrOperator = EObjectHelper.createEClass(eType + "_Or_BitOperator", false);
		typedOrOperator.getESuperTypes().add(typedBitOperator);
		typedOrOperator.getEOperations().add(or_operation);
		typedOrOperator.getEAnnotations().add(EcoreUtil.copy(infoAnnotation));
		eClassifiers.add(typedOrOperator);
				
		//Typed_FunctionalOperator
		EClass typedFunctionalOperator = EObjectHelper.createEClass(eType + "_FunctionalOperator", true);
		typedFunctionalOperator.getESuperTypes().add(typedExpressionOperator);
		typedFunctionalOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("FunctionalOperator"));
		typedFunctionalOperator.getEAnnotations().add(EcoreUtil.copy(infoAnnotation));
		EReference functionalOperatorERef = EObjectHelper.createEReference("operator", typedFunctionalOperator, 0, 1, true);
		QMMMetaModelBuilder_Collections.functionalTypes.get(eType).getEStructuralFeatures().add(functionalOperatorERef);
		
		if(QMMMetaModelBuilder_Collections.functionalOperators.get(eType) == null)
			QMMMetaModelBuilder_Collections.functionalOperators.put(eType, typedFunctionalOperator);
		
		eClassifiers.add(typedFunctionalOperator);
			
		QMMMetaModelBuilder_Collections.typedExpressionOperators.put(eType, typedExpressionOperator);
		return eClassifiers;
	}

	static ArrayList<EClassifier> updateTypedExpressionOperators(String eType){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
		if(QMMMetaModelBuilder_Collections.typedExpressionOperators.get(eType)==null)
			eClassifiers.addAll(createTypedExpressionOperators(eType));
		return eClassifiers;
	}

	static EClass createConcreteFunctionalOperator(String name, String literal, String functionalOperatorType, EClass functionalType, ArrayList<EReference> parameterEReferences){
		EAnnotation annotation = EObjectHelper.createGenModelAnnotation("return \"" + literal + "\";");
		EOperation getLiteral = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(annotation)));
		
		EClass concreteFunctionalOperator = EObjectHelper.createEClass(name + "_FunctionalOperator", false);
		concreteFunctionalOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.functionalOperators.get(functionalOperatorType));  
		concreteFunctionalOperator.getESuperTypes().add(functionalType); 
		concreteFunctionalOperator.getEStructuralFeatures().addAll(parameterEReferences);
		concreteFunctionalOperator.getEOperations().add(getLiteral);
		concreteFunctionalOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(parameterEReferences));
				
		if(QMMMetaModelBuilder_Collections.concreteFunctionalOperators.get(functionalOperatorType)==null)
			QMMMetaModelBuilder_Collections.concreteFunctionalOperators.put(functionalOperatorType, new ArrayList<EClass>());
		QMMMetaModelBuilder_Collections.concreteFunctionalOperators.get(functionalOperatorType).add(concreteFunctionalOperator);
		
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("name", name);
		infoAnnotation.getDetails().put("literal", literal);
		infoAnnotation.getDetails().put("functionalOperatorType",functionalOperatorType);
		infoAnnotation.getDetails().put("functionalType",functionalType.getName());
		
		concreteFunctionalOperator.getEAnnotations().add(infoAnnotation);
		
		return concreteFunctionalOperator;
	}

}
