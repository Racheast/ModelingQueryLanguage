package util.MMGenerators.QMMGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcorePackage.Literals;

import util.MMGenerators.QMMGenerator.QMMMetaModelBuilder.QMMMetaModelBuilder_Collections;

public class EObjectHelper {
	
	public static EClass createEClass(String name, boolean isAbstract){
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(name);
		eClass.setAbstract(isAbstract);
		return eClass;
	}
	
	public static EReference createEReference(String name, EClassifier eType, int lowerBound, int upperBound, boolean isContainment){
		EReference eReference = EcoreFactory.eINSTANCE.createEReference();
		eReference.setName(name);
		eReference.setEType(eType);
		eReference.setLowerBound(lowerBound);
		eReference.setUpperBound(upperBound);
		eReference.setContainment(isContainment);
		return eReference;
	}
	
	public static EAttribute createEAttribute(String name, EClassifier eType, int lowerBound, int upperBound, boolean isID){
		EAttribute eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
		eAttribute.setName(name);
		eAttribute.setEType(eType);
		eAttribute.setLowerBound(lowerBound);
		eAttribute.setUpperBound(upperBound);
		eAttribute.setID(isID);
		return eAttribute;
	}
	
	public static EOperation createEOperation(String name, EDataType eType, int lowerBound, int upperBound, List<EAnnotation> annotations){
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		eOperation.setName(name);
		eOperation.setEType(eType);
		eOperation.setLowerBound(lowerBound);
		eOperation.setUpperBound(upperBound);
		eOperation.getEAnnotations().addAll(annotations);
		return eOperation;
	}
	
	public static EAnnotation createGenModelAnnotation(String body){
		EAnnotation genModelAnnotation = createEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
		genModelAnnotation.getDetails().put("body",body);
		return genModelAnnotation;
	}
	//literalAnnotation
	public static EAnnotation createEAnnotation(String source){
		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		eAnnotation.setSource(source);
		return eAnnotation;
	}
	
	public static EParameter createEParameter(String name, EDataType eType){
		EParameter eParameter = EcoreFactory.eINSTANCE.createEParameter();
		eParameter.setName(name);
		eParameter.setEType(eType);
		return eParameter;
	}
	
	public static EDataType createEDataType(Class c){
		EDataType eDataType = EcoreFactory.eINSTANCE.createEDataType();
		eDataType.setInstanceClass(c);
		eDataType.setInstanceClassName(c.getName());
		eDataType.setName(c.getSimpleName());
		return eDataType;
	}
	
	public static EDataType createEDataTypeForName(String typeName){
		EDataType dataType = null;
		try{
			dataType = EObjectHelper.createEDataType(Class.forName("java.lang." + typeName));
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return dataType;
	}
	
	public static Boolean containsEStructuralFeature(EClass eClass, String featureName){
		for(EStructuralFeature ef : eClass.getEStructuralFeatures()){
			if(ef.getName().equals(featureName))
				return true;
		}
		return false;
	}
	
	public static String writeTypedParameterValidationBodyForEClass(String eClassName){
		//not working properly!
		//String validateLiteral = eClassName.replaceAll("([^_])([A-Z])", "$1_$2").toUpperCase() + "__VALIDATE";
		String validateLiteral = "OBJECT_FUNCTIONAL_PARAMETER__VALIDATE";  //temp. solution
		String body = "if (diagnostic != null) {"
				+ "\n	String errorMessage = \"\";"
				+ "\n	EClass thisType = (EClass) this.getType();"
				+ "\n	if(this.argument!=null){"
				+ "\n		if (this.argument.eGet(this.argument.eClass().getEStructuralFeature(\"operator\")) != null) {"
				+ "\n			qmm.FunctionalOperator lastFunctionalOperator = (qmm.FunctionalOperator) ((qmm.FunctionalOperator) this.argument.eGet(this.argument.eClass().getEStructuralFeature(\"operator\"))).getLastOperator();"
				+ "\n			EClass lastFunctionalOperatorType = (EClass)lastFunctionalOperator.getType();"
				+ "\n			if (!thisType.isSuperTypeOf(lastFunctionalOperatorType)) {"
				+ "\n				errorMessage = \"Parameter \" + this.toString() + \": Argument of type \" + lastFunctionalOperatorType.getName() + \" is not compatible with parametertype \" + thisType.getName() + \".\";"
				+ "\n				diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator." + validateLiteral + ", errorMessage, new Object[] { this }));"
				+ "\n			}"
				+ "\n		} else {"
				+ "\n			EClass argumentType = (EClass) this.argument.getType();"
				+ "\n			if (!thisType.isSuperTypeOf(argumentType)) {"
				+ "\n				errorMessage = \"Parameter \" + this.toString() + \": Argument of type \" + argumentType.getName() + \" is not compatible with parametertype \" + thisType.getName() + \".\";"
				+ "\n				diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator." + validateLiteral + ", errorMessage, new Object[] { this }));"
				+ "\n			}"
				+ "\n		}"
				+ "\n 	}"
				+ "\n}"
				+ "\nreturn true;";
		
		return body;
	}
	
	public static EOperation createValidationOperation(String body){
		EAnnotation genModelAnnotation = createGenModelAnnotation(body);
		EParameter param1 = createEParameter("diagnostic",EcorePackage.Literals.EDIAGNOSTIC_CHAIN);
		EParameter param2 = createEParameter("context", EcorePackage.Literals.EMAP);
		EOperation eOperation = createEOperation("validate", EcorePackage.Literals.EBOOLEAN, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation)));
		eOperation.getEParameters().addAll(new ArrayList<EParameter>(Arrays.asList(param1,param2)));
		return eOperation;
	}
	
	public static EOperation createGetAllParametersOperation(ArrayList<EReference> parameterEReferences){
		String body = "EList parameterList = new org.eclipse.emf.common.util.BasicEList();";
		for(EReference eReference : parameterEReferences){
			body += "\nparameterList.add(" + eReference.getName() + ");";
		}
		body += "\nreturn parameterList;";
		EAnnotation genModelAnnotation = createGenModelAnnotation(body);
		return createEOperation("getAllParameters", EcorePackage.Literals.EE_LIST, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation)));
	}
	
	public static String writeNonTransitiveContainmendValidationBody(String containerEClassName, String referenceName, int upperBound){
		String body = 	"final int " + referenceName + "_upperBound = " + upperBound + ";"
				  	+	"\nint nr_nonTransitive_" + referenceName + " = " + 0 + ";"
				  	+	"\nif(this." + referenceName + " != null){"
				  	+	"\n		for(qmm.OrGroup og : this." + referenceName + ") if(!og.isTransitive()) nr_nonTransitive_" + referenceName + "++;"
				  	+	"\n}"
				  	+	"\nif(nr_nonTransitive_" + referenceName + " > " + referenceName + "_upperBound && " + referenceName + "_upperBound > -1) diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"" + containerEClassName + " contains \" + nr_nonTransitive_" + referenceName + " + \" non-transitive " + referenceName + ". Only \" + " + referenceName + "_upperBound + \" are allowed.\",new Object[] { this }));";
		
		return body;
	}
	
	public static boolean transformEAttributeFromETypeToJavaType(EAttribute ea){
		String typeName = ea.getEType().getName();
		
		switch (typeName) {
			case "EString":
				ea.setEType(createEDataTypeForName("String"));
				break;
			case "EBoolean":
				ea.setEType(createEDataTypeForName("Boolean"));
				break;
			case "EInt":
				ea.setEType(createEDataTypeForName("Integer"));
				break;
			case "EByte":
				ea.setEType(createEDataTypeForName("Byte"));
				break;
				
			//TODO: Implement more EType -to- java.lang.Type mappings here
				
			default:
				return false;
		}
		return true;
	}
	
	public static EClass createCalculatingOperator(String operatorName, String literal, String functionalType, String parameterType){
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("functionalType", functionalType);
		infoAnnotation.getDetails().put("literal", literal);
		
		EClass calculatingOperator = EObjectHelper.createEClass(operatorName, false);
		calculatingOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("CalculatingAggregationOperator"));
		EAnnotation literalAnnotation = EObjectHelper.createGenModelAnnotation("return \"" + literal + "\";");
		EOperation getLiteral = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(literalAnnotation)));
		calculatingOperator.getEOperations().add(getLiteral);
		calculatingOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedEvaluationOperationArguments.get(functionalType));
		EReference paramERef = EObjectHelper.createEReference("calculateable", QMMMetaModelBuilder_Collections.typedCalculateableParameters.get(parameterType), 1, 1, true); 
		calculatingOperator.getEStructuralFeatures().add(paramERef);
		calculatingOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(new ArrayList<EReference>(Arrays.asList(paramERef))));
		calculatingOperator.getEAnnotations().add(infoAnnotation);
		
		return calculatingOperator;
	}
	
	public static EClass createClassOperator(String operatorName, String literal, String functionalType, String parameterType){
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("functonalType", functionalType);
		infoAnnotation.getDetails().put("literal", literal);
		
		EClass classOperator = EObjectHelper.createEClass(operatorName, false);
		classOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("ClassOperator"));
		EAnnotation literalAnnotation = EObjectHelper.createGenModelAnnotation("return \"" + literal + "\";");
		EOperation getLiteral = EObjectHelper.createEOperation("getLiteral", EcorePackage.Literals.ESTRING, 1, 1, new ArrayList<EAnnotation>(Arrays.asList(literalAnnotation)));
		classOperator.getEOperations().add(getLiteral);
		classOperator.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedEvaluationOperationArguments.get(functionalType));
		EReference paramERefIntegerParseInt = EObjectHelper.createEReference("calculateable", QMMMetaModelBuilder_Collections.typedFunctionalParameters.get(parameterType), 1, 1, true);
		classOperator.getEStructuralFeatures().add(paramERefIntegerParseInt);
		classOperator.getEOperations().add(EObjectHelper.createGetAllParametersOperation(new ArrayList<EReference>(Arrays.asList(paramERefIntegerParseInt))));
		classOperator.getEAnnotations().add(infoAnnotation);
		
		//String body = "return true;";
		//classOperator.getEOperations().add(EObjectHelper.createValidationOperation(body));
		
		return classOperator;
	}

	public static EClass getFunctionalType(EClass ec){
		EClass functionalType = null;
		for(EClass possibleType: ec.getEAllSuperTypes()){
			if(QMMMetaModelBuilder_Collections.defaultEClasses.get("FunctionalType").isSuperTypeOf(possibleType) && !QMMMetaModelBuilder_Collections.defaultEClasses.get("FunctionalType").equals(possibleType))
					functionalType = possibleType;
		}
		return functionalType;
	}
}
