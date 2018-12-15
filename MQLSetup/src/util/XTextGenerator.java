package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.viatra.emf.mwe2integration.initializer.MWE2IntegrationInitializer;

import util.MMGenerators.QMMGenerator.QMMMetaModelBuilder.QMMMetaModelBuilder_Collections;

public class XTextGenerator {
	
	private static HashMap<EClass,Set<EClass>> rootClassSubTypes = getRootClassSubTypesMap();
	
	/*
	private static void executeMW2Workflow(){
		String location ="C:/Users/a_2th/repositories/mql/master_thesis/implementation/org.xtext.MQL/src/org/xtext/GenerateMQL.mwe2";
		MWE2IntegrationInitializer initializer = new MWE2IntegrationInitializer();
		Mwe2Runner mweRunner = initializer.initializePlainJava();
		mweRunner.run(URI.createFileURI(location), new HashMap<String, String>(), new WorkflowContextImpl());
	}
	*/
	
	public static void writeXTextFile(){
		String code = writeHeader();
		
		//Query (FindQuery,..)
		code += writeQueryPattern();
		
		//RootClasses
		code += writeRootClassSubTypes();
		code += writeRootClass();
		code += writeConcreteRootClasses();
		
		//Attributes
		code += writeConcreteAttributes();
		
		//OrGroup
		code += writeOrGroups();
		
		//arguments
		code += writeDefaultFunctionalArgumentPatterns();
		code += writePrimitiveArgumentPattern();
		code += writeTypedPrimitiveArguments();
		code += writeCalculateableElement_ReferenceArgument();
		code += writeTypedCalculateableElement_ReferenceArguments();
		code += writeEvaluationOperationArgument();
		code += writeTypedEvaluationOperationArguments();
		code +=	writeCountableReferenceArgument();
		
		//parameters
		code += writeTypedFunctionalParameters();
		code += writeCountableReferenceParameter();
		code +=	writeTypedCalculateableParameters();
		
		//operators
		code += writeTypedEnumerationOperators();
		code += writeTypedExpressionOperators();
		code += writeTypedFunctionalOperators();
		code += writeConcreteFunctionalOperators();
		code += writeDefaultEvaluationOperators();
		code += writeCountingAggregationOperators();
		code += writeCalculatingAggregationOperators();
		code += writeClassOperators();
		code += writeConreteEvaluationOperators();
		
		writeFile(code);
	}
	
	private static String writeHeader(){
		return 	"grammar org.xtext.MQL with org.eclipse.xtext.common.Terminals"
				+ "\nimport \"/QMM/model/QMM.ecore\""
				+ "\nimport \"http://www.eclipse.org/emf/2002/Ecore\" as ecore"
				+ "\nimport \"http://www.eclipse.org/emf/2003/XMLType\" as type"
				+ "\n\n";
	}
	
	private static String writeQueryPattern(){
		
		String code = 	"Query returns Query:"
					+	"\n		FindQuery"
					+	"\n;"
					+ 	"\n"
					+	"\nFindQuery returns FindQuery:"
					+	"\n		{FindQuery}"
					+ 	"\n		'Find' where+=RootClass"
					+ 	"\n		('OR' where+=RootClass)*"
					+ 	"\n;\n\n";
		return code;
	}
	
	private static String writeRootClassSubTypes(){
		String code = "";
		for(EClass rc : rootClassSubTypes.keySet()){
			code += rc.getName() + "_Type returns " + rc.getName() + ":\n	" + rc.getName();
			Iterator<EClass> iter = rootClassSubTypes.get(rc).iterator();
			if(iter.hasNext()) code += " | ";
			while(iter.hasNext()){
				EClass rc2 = iter.next();
				code +=	rc2.getName();
				if(iter.hasNext()) code += " | ";
			}
			code += "\n;\n\n";
		}
		return code;
	}
	
	private static String writeRootClass(){
		String code = "RootClass returns RootClass:\n	";
		Iterator<EClass> iter = QMMMetaModelBuilder_Collections.rootClasses.iterator();
		while(iter.hasNext()){
			EClass rc = iter.next();
			code += rc.getName();
			if(iter.hasNext()) code += " | ";
		}
		code += "\n;\n\n";
		return code;
	}
	
	private static String writeConcreteRootClasses(){
		String code = "";
		for(EClass rc: QMMMetaModelBuilder_Collections.rootClasses){
			code 	+=	rc.getName() + " returns " + rc.getName() + ":"
					+	"\n		'" + rc.getName()+ "'(" + rc.getName() + "_empty | " + rc.getName() + "_body)"
					+	"\n;\n\n";
			
			code 	+= 	rc.getName() + "_empty returns " + rc.getName() + ":"
					+	"\n		{" + rc.getName() + "}"
					+	"\n;\n\n";
			
			
			code	+=	rc.getName() + "_body returns " + rc.getName() + ":"
					+	"\n		{" + rc.getName() + "}"  
					+	"\n		'{'"
					+ 	"\n			" + writeConcreteRootClassReferences(rc)
					+	"\n		'}'"
					+	"\n;\n\n";
		}
		return code;
	}
	
	
	
	private static String writeConcreteRootClassReferences(EClass rc){
		String multipleCardinalityRefs = writeConcreteRootClassReferences_multipleCardinality(rc);
		String code = multipleCardinalityRefs
					+ "\n			";
		
		EList<EReference> eReferences = rc.getEAllReferences();
		HashSet<EReference> orGroupAndAttributeERefs = new HashSet<EReference>();
		for(EReference eRef: eReferences){
			if(eRef.getUpperBound()==1 && (eRef.getEType().getName().contains("AttrEClass") || eRef.getEType().getName().contains("OrGroup")))
				orGroupAndAttributeERefs.add(eRef);
		}
		
		Iterator<EReference> iter = orGroupAndAttributeERefs.iterator();
		if(iter.hasNext()) code += "(";
		while(iter.hasNext()){
			EReference eRef = iter.next();
			String postfix = eRef.getEType().getName().contains("AttrEClass") ? "" : "_OrGroup";
			code += "(" + eRef.getName() + "=" + eRef.getEContainingClass().getName() + "_" + eRef.getName() + postfix + " " + multipleCardinalityRefs + ")?";//+ cardinalitySign;
			if(iter.hasNext()){ 
				code += " & ";
			}else{
				code += ")";
			}
		}
		return code;
	}
	
	private static String writeConcreteRootClassReferences_multipleCardinality(EClass rc){
		String code = "(('eval:'EvaluationOperator+=EvaluationOperator';')";  //"(('eval:'EvaluationOperator+=EvaluationOperator';')*"
		EList<EReference> eReferences = rc.getEAllReferences();
		HashSet<EReference> orGroupAndAttributeERefs = new HashSet<EReference>();
		for(EReference eRef: eReferences){
			if((eRef.getUpperBound()>1 || eRef.getUpperBound()==-1) && (eRef.getEType().getName().contains("AttrEClass") || eRef.getEType().getName().contains("OrGroup")))
				orGroupAndAttributeERefs.add(eRef);
		}
		
		Iterator<EReference> iter = orGroupAndAttributeERefs.iterator();
		while(iter.hasNext()){
			code += " | ";  // &
			EReference eRef = iter.next();
			String postfix = eRef.getEType().getName().contains("AttrEClass") ? "" : "_OrGroup";
			code += eRef.getName() + "+=" + eRef.getEContainingClass().getName() + "_" + eRef.getName() + postfix ;
		}
		code += ")*";
		return code;
	}
	
	private static String writeOrGroups(){
		String code = "";
		Iterator<EClass> iter_rc = QMMMetaModelBuilder_Collections.rootClasses.iterator();
		while(iter_rc.hasNext()){
			EClass rc = iter_rc.next();			
			EList<EReference> eRefs = rc.getEAllReferences();
			HashSet<EReference> orGroupRefs = new HashSet<EReference>();
			
			for(EReference eRef: eRefs){
				if(eRef.getEType().getName().contains("OrGroup"))
					orGroupRefs.add(eRef);
			}
			
			Iterator<EReference> iter_eRef = orGroupRefs.iterator();
			while(iter_eRef.hasNext()){
				EReference eRef = iter_eRef.next();
				String eRefName = eRef.getName();
				String patternName = rc.getName() + "_" + eRefName + "_OrGroup";
				String typeName = eRef.getEType().getName();
				String rcName = ((EClass)eRef.getEType()).getEReferences().get(0).getEType().getName();
				String rcTypeName = rcName + "_Type";
				String containmentName = "containment";//rcName.toLowerCase() + "_containment";  //commented out on 9.12.18, trying to simplify refName of OrGroups
				
				code 	+=	patternName + " returns " + typeName + ":"
						+	"\n		{" + typeName + "}"
						+	"\n		'" + eRefName + "' name=ID (negated?='!')? (transitive?='+')? (';' | ':' " + containmentName + "+=" + rcTypeName  
						+	"\n('OR' " + containmentName + "+=" + rcTypeName + ")*)" 
						+	"\n;\n\n";
			}

		}
		return code;
	}
	
	private static String writeConcreteAttributes(){
		String code = "";
		for(EClass ac: QMMMetaModelBuilder_Collections.concreteAttributeEClasses.keySet()){
			EAttribute ea = QMMMetaModelBuilder_Collections.concreteAttributeEClasses.get(ac);
			code 	+= 	ac.getName() + " returns " + ac.getName() + ":"
					+	"\n		{" + ac.getName() + "}"
					+	"\n		'" + ea.getName() + "' name=ID (negated?='!')? ";
			if(EcorePackage.Literals.EENUM.isSuperTypeOf(ea.getEType().eClass())){
				code	+=	"('=' operator=" + ac.getEStructuralFeature("operator").getEType().getName() + ")?';'";
			}else{
				if(QMMMetaModelBuilder_Collections.concreteFunctionalOperators.keySet().contains(ea.getEType().getName())){
					code 	+=	"(':' operator=" + ac.getEStructuralFeature("operator").getEType().getName() + ")?';'";//ea.getEType().getName() + "_ExpressionOperator)?";
				}
			}
			code 	+=	"\n;\n\n";
		}
		return code;
	}
	
	private static String writeDefaultFunctionalArgumentPatterns(){
		String code = 	"FunctionalArgument returns FunctionalArgument:"
					+	"\n		PrimitiveArgument | Calculateable_Argument"
					+	"\n;\n\n";
		
		code	+=	"Calculateable_Argument returns Calculateable_Argument:"
				+	"\n		CalculateableElement_ReferenceArgument | EvaluationOperation_Argument"
				+	"\n;\n\n";
		
		
		return code;
	}
	
	private static String writeEvaluationOperationArgument(){
		String code = "EvaluationOperation_Argument returns EvaluationOperation_Argument:\n		";
		Iterator<EClass> iter = collectUsedEvaluationOperationArgumentsOnly().iterator();
		while(iter.hasNext()){
			EClass arg = iter.next();
			code += arg.getName();
			if(iter.hasNext()) code += " | ";
		}
		code += "\n;\n\n";
		return code;
	}
	
	private static String writeTypedEvaluationOperationArguments(){
		String code = "";
		
		for(EClass arg: collectUsedEvaluationOperationArgumentsOnly()){
			code 	+=	arg.getName() + " returns " + arg.getName() + ":\n	";
			Iterator<EClass> iter = collectAllConcreteEvaluationOperatorsForType(arg.getEAnnotation("information").getDetails().get("functionalType")).iterator();
			while(iter.hasNext()){
				EClass op = iter.next();
				code += op.getName();
				if(iter.hasNext()) code += " | ";
			}
			code += "\n;\n\n";
		}
		
		return code;
	}
	
	private static ArrayList<EClass> collectUsedEvaluationOperationArgumentsOnly(){
		ArrayList<EClass> args = new ArrayList<EClass>();
		for(String type:  QMMMetaModelBuilder_Collections.typedEvaluationOperationArguments.keySet()){
				if(QMMMetaModelBuilder_Collections.calculatingAggregationOperators.keySet().contains(type) || QMMMetaModelBuilder_Collections.countingAggregationOperators.keySet().contains(type) || QMMMetaModelBuilder_Collections.classOperators.keySet().contains(type)){
					args.add(QMMMetaModelBuilder_Collections.typedEvaluationOperationArguments.get(type));
				}
		}
		return args;
	}
	
	private static String writeDefaultEvaluationOperators(){
		String code = 	"EvaluationOperator returns EvaluationOperator:"
					+	"\n		EvaluationBitOperator | EvaluationFunctionalOperator"
					+	"\n;\n\n";
		
		code	+=	"EvaluationBitOperator returns EvaluationBitOperator:"
				+	"\n And_EvaluationBitOperator | Or_EvaluationBitOperator"
				+	"\n;\n\n";
				
		code	+=	"And_EvaluationBitOperator returns And_EvaluationBitOperator:"
				+	"\n 'And'(negated?='!')?'('connects+=EvaluationOperator(',' connects+=EvaluationOperator)+')'"
				+	"\n;\n\n";
		
		code	+=	"Or_EvaluationBitOperator returns Or_EvaluationBitOperator:"
				+	"\n 'Or'(negated?='!')?'('connects+=EvaluationOperator(',' connects+=EvaluationOperator)+')'"
				+	"\n;\n\n";
		
		code 	+= "EvaluationFunctionalOperator returns EvaluationFunctionalOperator:"
				+	"\n		AggregationOperator | ClassOperator"
				+ 	"\n;\n\n";
		
		code 	+=	"AggregationOperator returns AggregationOperator:"
				+	"\n		CalculatingAggregationOperator | CountingAggregationOperator"
				+	"\n;\n\n";
		
		return code;
	}
	
	private static String writeCalculatingAggregationOperators(){
		String code = "CalculatingAggregationOperator returns CalculatingAggregationOperator:\n		";
		ArrayList<EClass> allCalculatingAggregationOperators = new ArrayList<EClass>();
		for(String type: QMMMetaModelBuilder_Collections.calculatingAggregationOperators.keySet()) allCalculatingAggregationOperators.addAll(QMMMetaModelBuilder_Collections.calculatingAggregationOperators.get(type));
		
		Iterator<EClass> iter = allCalculatingAggregationOperators.iterator();
		while(iter.hasNext()){
			EClass op = iter.next();
			code += op.getName();
			if(iter.hasNext()) code += " | ";
		}
		
		code += "\n;\n\n";
		
		return code;
	}
	
	private static String writeCountingAggregationOperators(){
		String code = "CountingAggregationOperator returns CountingAggregationOperator:\n		";
		ArrayList<EClass> allCountingAggregationOperators = new ArrayList<EClass>();
		for(String type: QMMMetaModelBuilder_Collections.countingAggregationOperators.keySet()) allCountingAggregationOperators.addAll(QMMMetaModelBuilder_Collections.countingAggregationOperators.get(type));
		
		Iterator<EClass> iter = allCountingAggregationOperators.iterator();
		while(iter.hasNext()){
			EClass op = iter.next();
			code += op.getName();
			if(iter.hasNext()) code += " | ";
		}
		
		code += "\n;\n\n";
		
		return code;
	}
	
	private static String writeClassOperators(){
		String code = "ClassOperator returns ClassOperator:\n		";
		ArrayList<EClass> allClassOperators = new ArrayList<EClass>();
		for(String type: QMMMetaModelBuilder_Collections.classOperators.keySet()) allClassOperators.addAll(QMMMetaModelBuilder_Collections.classOperators.get(type));
		
		Iterator<EClass> iter = allClassOperators.iterator();
		while(iter.hasNext()){
			EClass op = iter.next();
			code += op.getName();
			if(iter.hasNext()) code += " | ";
		}
		
		code += "\n;\n\n";
		
		return code;
	}
	
	private static String writeConreteEvaluationOperators(){
		String code = "";
		for(EClass op: collectAllConcreteEvaluationOperators()){
			code += writeConcreteEvaluationOperator(op);
		}
		return code;
	}
	
	private static String writeConcreteEvaluationOperator(EClass op){
		EStructuralFeature paramERef = getParameterEReference(op);
		String code	=	op.getName() + " returns " + op.getName() + ":"
				+	"\n		{" + op.getName() + "}"
				+	"\n		'" + op.getEAnnotation("information").getDetails().get("literal") + "('" + paramERef.getName() + "=" + paramERef.getEType().getName() + "')'(operator=" + op.getEStructuralFeature("operator").getEType().getName() + ")?"
				+	"\n;\n\n";
		
		return code;
	}
	
	private static EStructuralFeature getParameterEReference(EClass ec){
		Iterator<EStructuralFeature> iter = ec.getEAllStructuralFeatures().iterator();
		while(iter.hasNext()){
			EStructuralFeature temp = iter.next();
			if(temp.getEType().getName().contains("Parameter")) return temp;
		}
		return null;
	}
	
	private static ArrayList<EClass> collectAllConcreteEvaluationOperators(){
		ArrayList<EClass> concreteEvaluationOperators = new ArrayList<EClass>();
		for(String type: QMMMetaModelBuilder_Collections.typedEvaluationOperationArguments.keySet()) concreteEvaluationOperators.addAll(collectAllConcreteEvaluationOperatorsForType(type));
		return concreteEvaluationOperators;
	}
	
	private static ArrayList<EClass> collectAllConcreteEvaluationOperatorsForType(String type){
		ArrayList<EClass> concreteEvaluationOperators = new ArrayList<EClass>();
		ArrayList<EClass> temp = QMMMetaModelBuilder_Collections.countingAggregationOperators.get(type);
		if(temp!=null)concreteEvaluationOperators.addAll(temp);
		temp = QMMMetaModelBuilder_Collections.calculatingAggregationOperators.get(type);
		if(temp!=null)concreteEvaluationOperators.addAll(temp);
		temp = QMMMetaModelBuilder_Collections.classOperators.get(type);
		if(temp!=null)concreteEvaluationOperators.addAll(temp);
		return concreteEvaluationOperators;
	}
	
	private static String writePrimitiveArgumentPattern(){
		String code = "PrimitiveArgument returns PrimitiveArgument:";
		code += "\n		Integer_PrimitiveArgument | String_PrimitiveArgument";
		code += "\n;";
		code += "\n\n";
		return code;
	}
	
	private static String writeCalculateableElement_ReferenceArgument(){
		String code = "CalculateableElement_ReferenceArgument returns CalculateableElement_ReferenceArgument:\n		";
		Iterator<EClass> iter = QMMMetaModelBuilder_Collections.typedCalculateableElementReferenceArguments.values().iterator();
		while(iter.hasNext()){
			EClass arg = iter.next();
			code += arg.getName();
			if(iter.hasNext()) code += " | ";
		}
		code += "\n;\n\n";
		return code;
	}
	
	private static String writeTypedCalculateableElement_ReferenceArguments(){
		String code = "";
		Iterator<EClass> iter = QMMMetaModelBuilder_Collections.typedCalculateableElementReferenceArguments.values().iterator();
		
		while(iter.hasNext()){
			EClass arg = iter.next();
			String type = arg.getEAnnotation("information").getDetails().get("functionalType");
			code 	+=	arg.getName() + " returns " + arg.getName() + ":"
					+	"\n		{" + arg.getName() + "}"
					+	"'" + type + "Ref('reference=[" + arg.getEStructuralFeature("reference").getEType().getName() + "|ID]')'";
			
			if(QMMMetaModelBuilder_Collections.concreteFunctionalOperators.keySet().contains(type))
				code += "(operator=" + arg.getEStructuralFeature("operator").getEType().getName() + ")?";
			
			code	+=	"\n;\n\n";
		}
		
		return code;
	}
	
	private static String writeTypedPrimitiveArguments(){
		String code = "";
		
		Set<String> keySet = QMMMetaModelBuilder_Collections.typedArguments.keySet();
		String[] typeNames = keySet.toArray(new String[keySet.size()]);
		
		for(String typeName: typeNames){
			/*
			 * Deactivated Long, Float and Double since it is necessary to define own Converters.
			 * Tutorial: https://stackoverflow.com/questions/41022942/xtext-implemanting-long-double-and-float-types
			 */
			if(typeName.equals("String") || typeName.equals("Integer") /*|| typeName.equals("Long") || typeName.equals("Float") || typeName.equals("Double")*/){ 
				String operator = "";
				if(QMMMetaModelBuilder_Collections.functionalOperators.keySet().contains(typeName)) operator = " (operator=" + typeName + "_FunctionalOperator)?";
				
				code += typeName + "_PrimitiveArgument returns " + typeName + "_PrimitiveArgument:";
				code += "\n		{" + typeName + "_PrimitiveArgument}";
				code += "\n		value=" + getXtextLiteralForTypeName(typeName) + operator;
				code += "\n;\n\n";
			}
		}
		
		
		return code;
	}
	
	private static String writeTypedFunctionalOperators(){
		String code = "";
		for(String typeName: QMMMetaModelBuilder_Collections.concreteFunctionalOperators.keySet()){
			code += writeTypedFunctionalOperator(typeName,  QMMMetaModelBuilder_Collections.concreteFunctionalOperators.get(typeName));
			code += "\n\n";
		}
		return code;
	}
	
	private static String writeTypedFunctionalOperator(String typeName, Collection<EClass> concreteFunctionalOperators){
		String code = typeName + "_FunctionalOperator returns " + typeName + "_FunctionalOperator:\n		";
		Iterator<EClass> iter = concreteFunctionalOperators.iterator();
		while(iter.hasNext()){
			EClass ec = iter.next();
			code += ec.getName();
			if(iter.hasNext())
				code += " | ";
		}
		code +="\n;";
		return code;
	}
	
	private static String writeConcreteFunctionalOperators(){
		String code = "";
		for(Collection<EClass> operators: QMMMetaModelBuilder_Collections.concreteFunctionalOperators.values()){
			for(EClass operator: operators){
				String literal =  operator.getEAnnotation("information").getDetails().get("literal");
				String negated = operator.getEStructuralFeature("negated") != null ? "(negated?='!')?" : "";
				if(!literal.startsWith(".")) literal = "." + operator.getEAnnotation("information").getDetails().get("name");
				code	+= 	operator.getName() + " returns " + operator.getName() + ":"
						+	"\n		{" + operator.getName() + "}"
						+	"\n		'" + literal + "'" + negated + "'(" + writeParametersForOperator(operator) + ")'(" + writeOperatorReferenceForOperator(operator) + ")?"
						+	"\n;\n\n";
			}
		}
		return code;
	}
	
	private static String writeParametersForOperator(EClass op){
		String code = "";
		EList<EReference> eRefs = op.getEReferences();
		ArrayList<EReference> paramERefs = new ArrayList<EReference>();
		
		for(EReference eRef: eRefs){
			if(eRef.getEType().getName().contains("Parameter"))
				paramERefs.add(eRef);
		}
		
		for(int i=0; i<paramERefs.size(); i++){
			EReference eRef = paramERefs.get(i);
			code += eRef.getName() + "=" + eRef.getEType().getName();
			if(i<paramERefs.size()-1)
				code += "','";
		}
		
		if(code.length()>0)
			code = "'" + code + "'";
		
		return code;
	}
	
	private static String writeOperatorReferenceForOperator(EClass op){
		String code = "";
		for(EReference eRef:op.getEAllReferences()){
			if(eRef.getName().equals("operator"))
				code = "operator=" + eRef.getEType().getName();
		}
		return code;
	}
	
	private static String writeTypedEnumerationOperators(){
		String code = "";
		for(String typeName: QMMMetaModelBuilder_Collections.typedEnumerationOperators.keySet()){
			EClass typedEnumOp = QMMMetaModelBuilder_Collections.typedEnumerationOperators.get(typeName);
			code	+=	typedEnumOp.getName() + " returns " + typedEnumOp.getName() + ":"
					+	"\n		{" + typedEnumOp.getName() + "}"
					+	"\n		argument=" + typeName + "('or' or=" + typedEnumOp.getName() + ")?"
					+ 	"\n;\n\n";
			
			EEnum eEnum = (EEnum)QMMMetaModelBuilder_Collections.eClassifiersMap.get(typeName);
			code 	+=	"enum " + typeName + " returns " + typeName + ":\n		";
			Iterator<EEnumLiteral> iter = eEnum.getELiterals().iterator();
			while(iter.hasNext()){
				EEnumLiteral el = iter.next();
				code += el.getName() + " = '" + el.getName() + "'";
				if(iter.hasNext()) code += " | ";
			}
			code += "\n;\n\n";
		}
		return code;
	}
	
	private static String writeTypedExpressionOperators(){
		String code = "";
		for(String typeName: QMMMetaModelBuilder_Collections.concreteFunctionalOperators.keySet()){
			code 	+= 	typeName + "_ExpressionOperator returns " + typeName + "_ExpressionOperator:"
					+	"\n		(" + typeName + "_BitOperator | " + typeName + "_FunctionalOperator_Begin)"
					+	"\n;\n\n";
			
			//TypedBitOperators
			code 	+= 	typeName + "_BitOperator returns " + typeName + "_BitOperator:"
					+	"\n		(" + typeName + "_And_BitOperator | " + typeName + "_Or_BitOperator)"
					+	"\n;\n\n";
			
			code 	+=	typeName + "_And_BitOperator returns " + typeName + "_And_BitOperator:"
					+	"		{" + typeName + "_And_BitOperator}"
					+	"\n		'And'(negated?='!')?'('connects+=" + typeName + "_ExpressionOperator(',' connects+=" + typeName + "_ExpressionOperator)+')'"
					+	"\n;\n\n";
			
			code 	+=	typeName + "_Or_BitOperator returns " + typeName + "_Or_BitOperator:"
					+	"		{" + typeName + "_Or_BitOperator}"
					+	"\n		'Or'(negated?='!')?'('connects+=" + typeName + "_ExpressionOperator(',' connects+=" + typeName + "_ExpressionOperator)+')'"
					+	"\n;\n\n";
			
			//TypedFunctionalOperators
			code 	+= 	typeName + "_FunctionalOperator_Begin returns " + typeName + "_FunctionalOperator:"
					+	"\n		'self'" + typeName + "_FunctionalOperator"
					+	"\n;\n\n";
		}
		return code;
	}
	
	private static String writeTypedFunctionalParameters(){
		String code = "";
		
		for(String typeName: QMMMetaModelBuilder_Collections.typedFunctionalParameters.keySet()){
			EClass typedFunctionalParameter = QMMMetaModelBuilder_Collections.typedFunctionalParameters.get(typeName);
			code 	+= 	typedFunctionalParameter.getName() + " returns " + typedFunctionalParameter.getName() + ":"
					+	"\n		{" + typedFunctionalParameter.getName() + "}" 
					+	"\n		argument=FunctionalArgument"
					+	"\n;\n\n";
		}
		
		return code;
	}
	
	private static String writeCountableReferenceParameter(){
		String code 	= 	"CountableReferenceParameter returns CountableReferenceParameter:"
						+	"\n		{CountableReferenceParameter}"
						+	"\n		argument=Countable_ReferenceArgument"
						+	"\n;\n\n";
		return code;
	}
	
	private static String writeTypedCalculateableParameters(){
		String code = "";
		for(EClass param: QMMMetaModelBuilder_Collections.typedCalculateableParameters.values()){
			code 	+=	param.getName() + " returns " + param.getName() + ":"
					+	"\n		{" + param.getName() + "}"
					+	"\n		argument=Calculateable_Argument"
					+	"\n;\n\n";
		}
		return code;
	}
	
	private static String writeCountableReferenceArgument(){
		String code 	=	"Countable_ReferenceArgument returns Countable_ReferenceArgument:"
						+	"\n		{Countable_ReferenceArgument}"
						+	"\n		reference=[Countable|ID]"
						+	"\n;\n\n";
		return code;
	}
	
	private static void writeFile(String code){
		String filepath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().toString() + "/../org.xtext.MQL/src/org/xtext/MQL.xtext").replace("\\", "/");
		File file = new File(filepath);
	    try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file); 
		    writer.write(code);
		    writer.flush();
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String getXtextLiteralForTypeName(String typeName){
		if(typeName.equals("Integer"))
			return "INT";
		else if(typeName.equals("String"))
			return "STRING";
		else
			return null;
	}
	
	private static HashMap<EClass,Set<EClass>> getRootClassSubTypesMap(){
		 HashMap<EClass,Set<EClass>> rootClassSubTypes = new  HashMap<EClass,Set<EClass>>();
		 for(EClass rc : QMMMetaModelBuilder_Collections.rootClasses){
			 Set<EClass> subTypes = new HashSet<EClass>();
			 rootClassSubTypes.put(rc, subTypes);
			 for(EClass rc2 : QMMMetaModelBuilder_Collections.rootClasses){
				if(rc != rc2 && rc.isSuperTypeOf(rc2)) rootClassSubTypes.get(rc).add(rc2);
			 }
		 }
		 return rootClassSubTypes;
	}

}
