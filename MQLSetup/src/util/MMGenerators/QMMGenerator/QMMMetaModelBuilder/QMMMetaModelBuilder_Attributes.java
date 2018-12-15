package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcorePackage.Literals;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Attributes {

	static ArrayList<EClass> createDefaultAttributeEClasses(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		
		EClass attributeEClass = EObjectHelper.createEClass("AttributeEClass", true);
		attributeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NamedElement"));
		attributeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("NegatableElement"));  
		attributeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("Countable"));
		
		EClass regularAttributeEClass = EObjectHelper.createEClass("RegularAttributeEClass", true);
		regularAttributeEClass.getESuperTypes().add(attributeEClass);
		/*
		String body = "EClass booleanType = QmmPackage.eINSTANCE.getBoolean_Type();"  
					+ "\nEClass functionalOperatorType = QmmPackage.eINSTANCE.getFunctionalOperator();"
					+ "\nEClass bitOperatorType = QmmPackage.eINSTANCE.getBitOperator();"
					+ "\nqmm.Operator operator = (qmm.Operator)o;"
					+ "\nEList diagnosticList = new org.eclipse.emf.common.util.BasicEList();"
					+ "\n"
					+ "\nif(functionalOperatorType.isSuperTypeOf(operator.eClass())){"
					+ "\n	qmm.FunctionalOperator lastOperator = (qmm.FunctionalOperator)((qmm.FunctionalOperator)operator).getLastOperator();"
					+ "\n    	EClass lastOperatorType = (EClass)lastOperator.getType();"
					+ "\n    	if(!booleanType.isSuperTypeOf(lastOperatorType)){"
					+ "\n			String errorMessage = \"Operator \" + lastOperator.eClass().getName() + \" of attribute \" + this.eClass().getName() + \" is of type \" + lastOperatorType.getName() + \", but must be (a subtype) of type \" + booleanType.getName() + \".\";"
					+ "\n    		diagnosticList.add(new org.eclipse.emf.common.util.BasicDiagnostic(org.eclipse.emf.common.util.Diagnostic.ERROR, qmm.util.QmmValidator.DIAGNOSTIC_SOURCE,qmm.util.QmmValidator.OBJECT_FUNCTIONAL_PARAMETER__VALIDATE, errorMessage,new Object[] { this }));"
					+ "\n    	}"	
					+ "\n}else if(bitOperatorType.isSuperTypeOf(operator.eClass())){"
					+ "\n    for(qmm.Operator op : (EList<qmm.Operator>)operator.eGet(operator.eClass().getEStructuralFeature(\"connects\"))){"
					+ "\n    	diagnosticList.addAll(validateCheckExpression(op));"
					+ "\n    }"
					+ "\n}"
					+ "\nreturn diagnosticList;";
		*/	
		
		EAnnotation genModelAnnotation = EObjectHelper.createGenModelAnnotation(EClassMethodBodies.REGULAR_ATTRIBUTE_ECLASS_VALIDATECHECKEXPRESSION_BODY);
		EOperation validateCheckExpression = EObjectHelper.createEOperation("validateCheckExpression", EcorePackage.Literals.EE_LIST, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation)));
		validateCheckExpression.getEParameters().add(EObjectHelper.createEParameter("o", EcorePackage.Literals.EJAVA_OBJECT));
		regularAttributeEClass.getEOperations().add(validateCheckExpression);
		
		EClass enumerationAttributeEClass = EObjectHelper.createEClass("EnumerationAttributeEClass", true);
		enumerationAttributeEClass.getESuperTypes().add(attributeEClass);
		
		QMMMetaModelBuilder_Collections.defaultEClasses.put("AttributeEClass", attributeEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("RegularAttributeEClass", regularAttributeEClass);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("EnumerationAttributeEClass", enumerationAttributeEClass);
		eClasses.add(attributeEClass);
		eClasses.add(regularAttributeEClass);
		eClasses.add(enumerationAttributeEClass);
		return eClasses;
	}

	static void assignTypedOperatorToAttributeEClass(String eType){
		EClass typedAttributeEClass = QMMMetaModelBuilder_Collections.typedAttributeEClasses.get(eType);
		String eReferenceName="operator";
		if(!EObjectHelper.containsEStructuralFeature(typedAttributeEClass, eReferenceName)){
			EReference operatorERef = EObjectHelper.createEReference(eReferenceName, QMMMetaModelBuilder_Collections.typedExpressionOperators.get(eType), 0, 1, true); //Add the typed operatorERef to the corresponding typed AttributeEClass
			typedAttributeEClass.getEStructuralFeatures().add(operatorERef);
		}
	}

	static EClass createTypedRegularAttributeEClass(String eType){
		EClass typedAttributeEClass = EObjectHelper.createEClass(eType + "_AttributeEClass", true);
		typedAttributeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("RegularAttributeEClass"));
		typedAttributeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedCalculateableElements.get(eType));
		/*
		String body	= "if(diagnostic!=null){"
				+ "\n    if(this.operator != null){"
				+ "\n    	EList<org.eclipse.emf.common.util.BasicDiagnostic> diagnosticList = validateCheckExpression(this.operator);"
				+ "\n    	for(int i=0; i<diagnosticList.size(); i++){"
				+ "\n    		diagnostic.add((org.eclipse.emf.common.util.BasicDiagnostic)diagnosticList.get(i));"
				+ "\n    	}"
				+ "\n    }"
				+ "\n}"
				+ "\nreturn true;";
		*/
		typedAttributeEClass.getEOperations().add(EObjectHelper.createValidationOperation(EClassMethodBodies.TYPED_REGULAR_ATTRIBUTE_ECLASS_VALIDATIONOPERATION_BODY));
		QMMMetaModelBuilder_Collections.typedAttributeEClasses.put(eType, typedAttributeEClass);
		return typedAttributeEClass;
	}

	static EClass createTypedEnumerationAttributeEClass(String eType){
		EClass typedAttributeEClass = EObjectHelper.createEClass(eType + "_AttributeEClass", true);
		typedAttributeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.defaultEClasses.get("EnumerationAttributeEClass"));
		typedAttributeEClass.getEStructuralFeatures().add(EObjectHelper.createEReference("operator", QMMMetaModelBuilder_Collections.typedEnumerationOperators.get(eType), 0, 1, true));		
		QMMMetaModelBuilder_Collections.typedAttributeEClasses.put(eType, typedAttributeEClass);
		return typedAttributeEClass;
	}

	static EClass createConcreteTypedAttributeEClass(EClass ec, EAttribute ea){
		EClass concreteTypedAttributeEClass = EObjectHelper.createEClass(ec.getName() + "_" + ea.getName() + "_AttrEClass", false);
		concreteTypedAttributeEClass.getESuperTypes().add(QMMMetaModelBuilder_Collections.typedAttributeEClasses.get(ea.getEType().getName()));
		EReference eAttributeRef = EObjectHelper.createEReference(ea.getName() + "_AttrEClass", concreteTypedAttributeEClass, 0, ea.getUpperBound(), true);
		ec.getEStructuralFeatures().add(eAttributeRef);
		return concreteTypedAttributeEClass;
	}

}
