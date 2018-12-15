package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcorePackage.Literals;

import util.MMGenerators.QMMGenerator.EClassMethodBodies;
import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_RootClasses {

	static EClass createDefaultRootClass(){
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
		
		EAnnotation genModelAnnotation = EObjectHelper.createGenModelAnnotation(EClassMethodBodies.ROOTCLASS_VALIDATECHECKEXPRESSION_BODY);
		EOperation validateCheckExpression = EObjectHelper.createEOperation("validateCheckExpression", EcorePackage.Literals.EE_LIST, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation)));
		validateCheckExpression.getEParameters().add(EObjectHelper.createEParameter("o", EcorePackage.Literals.EJAVA_OBJECT));
		
		EAnnotation genModelAnnotation2 = EObjectHelper.createGenModelAnnotation(EClassMethodBodies.ROOTCLASS_VALIDATEALLCHECKEXPRESSIONS_BODY);
		EOperation validateAllCheckExpressions = EObjectHelper.createEOperation("validateAllCheckExpressions", EcorePackage.Literals.EE_LIST, 1, 1,  new ArrayList<EAnnotation>(Arrays.asList(genModelAnnotation2)));
		validateAllCheckExpressions.getEParameters().add(EObjectHelper.createEParameter("o", EcorePackage.Literals.EJAVA_OBJECT));
		
		
		EClass rootClassEClass = EObjectHelper.createEClass("RootClass", true);
		rootClassEClass.getEOperations().add(validateCheckExpression);
		rootClassEClass.getEOperations().add(validateAllCheckExpressions);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("RootClass", rootClassEClass);
		return rootClassEClass;
	}

}
