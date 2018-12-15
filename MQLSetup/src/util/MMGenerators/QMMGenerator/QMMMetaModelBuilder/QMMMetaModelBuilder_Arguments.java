package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Arguments {

	static ArrayList<EClassifier> createDefaultArgumentEClasses(){
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
		EClass argumentEClass = EObjectHelper.createEClass("Argument", true);
		argumentEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("TypedElement"));
		
		EClass referenceArgumentEClass = EObjectHelper.createEClass("ReferenceArgument", true);
		referenceArgumentEClass.getESuperTypes().add(argumentEClass);
		
		EClass countable_ReferenceArgumentEClass = EObjectHelper.createEClass("Countable_ReferenceArgument", false);
		EReference countableERef = EObjectHelper.createEReference("reference", QMMMetaModelBuilder_Collections.defaultEClasses.get("Countable"), 1, 1, false);
		countable_ReferenceArgumentEClass.getESuperTypes().add(referenceArgumentEClass);
		countable_ReferenceArgumentEClass.getEStructuralFeatures().add(countableERef);
		/*
		String body = "qmm.RootClass containingRootClass = null;"
				+ 	"\nqmm.RootClass referencesRootClass = null;"
				+ 	"\nqmm.Countable containingCountable = null;"
				+ 	"\n"
				+	"\nif(this.eContainer() != null && this.reference != null){"
				+ 	"\n		org.eclipse.emf.ecore.EObject eContainer = this.eContainer();"
				+ 	"\n		while(eContainer != null && !(eContainer instanceof qmm.RootClass)){"
				+ 	"\n			if(eContainer instanceof qmm.Countable){"
				+ 	"\n				containingCountable = (qmm.Countable)eContainer;"
				+ 	"\n			}"
				+ 	"\n			eContainer = eContainer.eContainer();"
				+ 	"\n		}"
				+ 	"\n		containingRootClass = (qmm.RootClass)eContainer;"
				+ 	"\n"
				+ 	"\n		eContainer = this.reference.eContainer();"
				+ 	"\n		while(eContainer != null && !(eContainer instanceof qmm.RootClass)){"
				+ 	"\n			eContainer = eContainer.eContainer();"
				+ 	"\n		}"
				+ 	"\n"
				+ 	"\n		referencesRootClass = (qmm.RootClass)eContainer;"
				+ 	"\n"
				+ 	"\n		if(containingCountable != null && containingCountable == reference){  //self-reference in expression !"
				+ 	"\n			String errorMessage = \"Self-reference in expression of \" + containingCountable + \" detected. Self-references are not allowed!\";"
				+ 	"\n			diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));"
				+ 	"\n		}"
				+ 	"\n"
				+ 	"\n		if(containingRootClass != referencesRootClass){"
				+ 	"\n			String errorMessage = \"The referenced element \" + this.reference + \" is contained by a different parent-element than the expression's parent-element. Cross-references are not supported.\";"
				+ 	"\n			diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));"
				+ 	"\n		}"
				+	"\n"
				+	"\n		if(this.reference instanceof qmm.NegatableElement && ((qmm.NegatableElement)this.reference).isNegated())diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Reference to a negated element in \" + this + \" has been detected. References to negated elements are not allowed.\",new Object[] { this }));"
				+	"\n}"
				+	"\n"
				+ 	"\nreturn true;";
		*/
		countable_ReferenceArgumentEClass.getEOperations().add(EObjectHelper.createValidationOperation(EClassMethodBodies.COUNTABLE_REFERENCE_ARGUMENT_VALIDATIONOPERATION_BODY));
		
		EClass functionalArgumentEClass = EObjectHelper.createEClass("FunctionalArgument", true);
		functionalArgumentEClass.getESuperTypes().add(argumentEClass);
		
		EClass calculateable_ArgumentEClass = EObjectHelper.createEClass("Calculateable_Argument", true);  
		calculateable_ArgumentEClass.getESuperTypes().add(referenceArgumentEClass);  
		calculateable_ArgumentEClass.getESuperTypes().add(functionalArgumentEClass);
		
		EClass calculateableElement_ReferenceArgumentEClass =  EObjectHelper.createEClass("CalculateableElement_ReferenceArgument", true);				
		calculateableElement_ReferenceArgumentEClass.getESuperTypes().add(calculateable_ArgumentEClass);
		
		EClass evaluationOperation_ArgumentEClass = EObjectHelper.createEClass("EvaluationOperation_Argument", true); 
		evaluationOperation_ArgumentEClass.getESuperTypes().add(calculateable_ArgumentEClass);
		
		EClass primitiveArgumentEClass = EObjectHelper.createEClass("PrimitiveArgument", true);
		primitiveArgumentEClass.getESuperTypes().add(functionalArgumentEClass);
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Argument", argumentEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("ReferenceArgument", referenceArgumentEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Countable_ReferenceArgument", countable_ReferenceArgumentEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Calculateable_Argument", calculateable_ArgumentEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("CalculateableElement_ReferenceArgument", calculateableElement_ReferenceArgumentEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("FunctionalArgument", functionalArgumentEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("EvaluationOperation_Argument", evaluationOperation_ArgumentEClass);  //Renamed to EvaluationOperation_Arg (16.11.18)
		QMMMetaModelBuilder_Collections.defaultEClasses.put("PrimitiveArgument", primitiveArgumentEClass);
		
		eClassifiers.add(argumentEClass);
		eClassifiers.add(referenceArgumentEClass);
		eClassifiers.add(countable_ReferenceArgumentEClass);
		eClassifiers.add(calculateable_ArgumentEClass);
		eClassifiers.add(calculateableElement_ReferenceArgumentEClass);
		eClassifiers.add(functionalArgumentEClass);
		eClassifiers.add(evaluationOperation_ArgumentEClass);
		eClassifiers.add(primitiveArgumentEClass);
		
		return eClassifiers;
	}

	static ArrayList<EClassifier> updateTypedArguments(String eType){  
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
		if(QMMMetaModelBuilder_Collections.typedArguments.get(eType)==null){
			eClassifiers.addAll(QMMMetaModelBuilder_Arguments.createTypedArguments(eType));
		}
		return eClassifiers;
	}

	static ArrayList<EClassifier> createTypedArguments(String eType){ 
		ArrayList<EClassifier> eClassifiers = new ArrayList<EClassifier>();
		if(QMMMetaModelBuilder_Collections.eClassifiersMap.get(eType)==null){  
			EDataType myDataType =  EObjectHelper.createEDataTypeForName(eType);
			QMMMetaModelBuilder_Collections.eClassifiersMap.put(eType, myDataType);
			eClassifiers.add(myDataType);
		}
		
		
		EClass typedArgument = EObjectHelper.createEClass(eType + "_Argument", true);
		typedArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("FunctionalArgument"));
		typedArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.functionalTypes.get(eType));
		QMMMetaModelBuilder_Collections.typedArguments.put(eType, typedArgument);
		eClassifiers.add(typedArgument);
		
		EClass typedPrimitiveArgument = EObjectHelper.createEClass(eType + "_PrimitiveArgument", false);
		typedPrimitiveArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedArguments.get(eType));
		typedPrimitiveArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("PrimitiveArgument"));
			
		EAttribute value = EObjectHelper.createEAttribute("value",QMMMetaModelBuilder_Collections.eClassifiersMap.get(eType),1,1,false);
		typedPrimitiveArgument.getEStructuralFeatures().add(value);
		eClassifiers.add(typedPrimitiveArgument);
			
		EClass typedEvaluationOperationArgument = EObjectHelper.createEClass(eType + "_EvaluationOperation_Argument", true);
		typedEvaluationOperationArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("EvaluationOperation_Argument"));
		typedEvaluationOperationArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedArguments.get(eType));
		EAnnotation infoAnnotation = EObjectHelper.createEAnnotation("information");
		infoAnnotation.getDetails().put("functionalType", eType);
		typedEvaluationOperationArgument.getEAnnotations().add(infoAnnotation);
		QMMMetaModelBuilder_Collections.typedEvaluationOperationArguments.put(eType, typedEvaluationOperationArgument);
		eClassifiers.add(typedEvaluationOperationArgument);
		
		if(QMMMetaModelBuilder_Collections.typedAttributeEClasses.keySet().contains(eType)){
			EClass typedCalculateableElementReferenceArgument = EObjectHelper.createEClass(eType + "_CalculateableElementReferenceArgument", false);
			typedCalculateableElementReferenceArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("CalculateableElement_ReferenceArgument"));
			typedCalculateableElementReferenceArgument.getESuperTypes().add(QMMMetaModelBuilder_Collections.functionalTypes.get(eType));
			
			typedCalculateableElementReferenceArgument.getEAnnotations().add(EcoreUtil.copy(infoAnnotation));
			QMMMetaModelBuilder_Collections.typedCalculateableElementReferenceArguments.put(eType, typedCalculateableElementReferenceArgument); 
			
			EReference calculateableElementERef = EObjectHelper.createEReference("reference", QMMMetaModelBuilder_Collections.typedCalculateableElements.get(eType), 1, 1, false);
			typedCalculateableElementReferenceArgument.getEStructuralFeatures().add(calculateableElementERef);
			
			/*
			String body = "qmm.RootClass containingRootClass = null;"
					+ 	"\nqmm.RootClass referencesRootClass = null;"
					+ 	"\nqmm.AttributeEClass containingAttributeEClass = null;"
					+ 	"\nqmm.AttributeEClass referencesAttributeEClass = null;"
					+	"\nif(this.eContainer() != null && this.reference != null){"
					+ 	"\n		org.eclipse.emf.ecore.EObject eContainer = this.eContainer();"
					+ 	"\n"
					+ 	"\n		while(eContainer != null && !(eContainer instanceof qmm.RootClass)){"
					+ 	"\n			if(eContainer instanceof qmm.AttributeEClass){"
					+ 	"\n				containingAttributeEClass = (qmm.AttributeEClass)eContainer;"
					+ 	"\n			}"
					+ 	"\n			eContainer = eContainer.eContainer();"
					+ 	"\n		}"
					+ 	"\n		containingRootClass = (qmm.RootClass)eContainer;"
					+ 	"\n"
					+ 	"\n		eContainer = this.reference.eContainer();"
					+ 	"\n		while(eContainer != null && !(eContainer instanceof qmm.RootClass)){"
					+ 	"\n			eContainer = eContainer.eContainer();"
					+ 	"\n		}"
					+ 	"\n"
					+ 	"\n		referencesRootClass = (qmm.RootClass)eContainer;"
					+ 	"\n		if(this.reference instanceof qmm.AttributeEClass) referencesAttributeEClass = (qmm.AttributeEClass)this.reference;"
					+ 	"\n"
					+ 	"\n		if(containingAttributeEClass != null && referencesAttributeEClass != null && containingAttributeEClass == referencesAttributeEClass){  //self-reference in expression !"
					+ 	"\n			String errorMessage = \"Self-reference in expression of attribute \" + containingAttributeEClass.getName() + \" detected. Self-references are not allowed!\";"
					+ 	"\n			diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));"
					+ 	"\n		}"
					+	"\n"
					+ 	"\n		if(containingRootClass != referencesRootClass){"
					+ 	"\n			String errorMessage = \"The referenced element \" + this.reference + \" is contained by a different parent-element than the expression's parent-element. Cross-references are not supported.\";"
					+ 	"\n			diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));"
					+ 	"\n		}"
					+	"\n"
					+	"\n		if(this.reference instanceof qmm.NegatableElement && ((qmm.NegatableElement)this.reference).isNegated())diagnostic.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, \"Reference to a negated element in \" + this + \" has been detected. References to negated elements are not allowed.\",new Object[] { this }));"
					+	"\n"
					+	"\n}"
					+ 	"\nreturn true;";
			*/
			
			typedCalculateableElementReferenceArgument.getEOperations().add(EObjectHelper.createValidationOperation(EClassMethodBodies.TYPED_CALCULATEABLE_ELEMENT_REFERENCE_ARGUMENT_VALIDATIONOPERATION_BODY));
			eClassifiers.add(typedCalculateableElementReferenceArgument);	
		}
		return eClassifiers;
	}

	

}
