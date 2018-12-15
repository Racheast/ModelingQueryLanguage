package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import qmm.RootClass;
import java.util.HashMap
import qmm.AttributeEClass
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import qmm.ReferenceArgument
import qmm.Argument
import qmm.PrimitiveArgument
import qmm.Operator
import qmm.BitOperator
import qmm.FunctionalOperator
import qmm.Parameter
import org.eclipse.emf.common.util.EList
import qmm.ExpressionOperator
import qmm.RegularAttributeEClass
import qmm.EnumerationAttributeEClass
import qmm.EnumerationOperator
import org.eclipse.emf.common.util.Enumerator
import qmm.impl.RegularAttributeEClassImpl
import qmm.AggregationOperator
import qmm.Countable_ReferenceArgument
import qmm.CalculateableElement_ReferenceArgument
import qmm.Calculateable_Argument
import qmm.Countable
import qmm.NamedElement
import qmm.CountingAggregationOperator
import qmm.FunctionalType
import qmm.CalculatingAggregationOperator
import qmm.CalculateableElement
import qmm.OrGroup
import org.eclipse.emf.ecore.EObject
import java.util.HashSet
import qmm.EvaluationOperator
import qmm.EvaluationOperation_Argument
import qmm.EvaluationFunctionalOperator
import qmm.ClassOperator
import qmm.Query
import qmm.String_PrimitiveArgument
import qmm.Integer_PrimitiveArgument
import qmm.TypedElement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MQLGenerator extends AbstractGenerator implements IGenerator{
	
	private static HashMap<RootClass, String> rootClassLib = new HashMap<RootClass, String>();
	private static HashMap<RootClass, String> dictionary = new  HashMap<RootClass, String>();
	private static HashMap<AttributeEClass, String> attrLib = new HashMap<AttributeEClass, String>();
	private static HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib = new HashMap<EClass, HashMap<EStructuralFeature,String>>();
	private static HashMap<EvaluationFunctionalOperator,String> evaluationOperatorLib = new HashMap<EvaluationFunctionalOperator,String>();
	private static HashMap<ReferenceArgument, String> referenceArgumentLib = new HashMap<ReferenceArgument, String>();
	private static HashMap<OrGroup, String> orGroupLib = new HashMap<OrGroup, String>();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		System.out.println("MQLGenerator: Generating Query.vql ... ")
		
		val query = resource.contents.filter(Query).get(0)		
		dictionary = Utils.initDictionary(query);
		rootClassLib = Utils.initRootClassLib(query);
		attrLib = Utils.initAttrLib(query);
		Utils.initReferenceFromToLib(referenceFromToLib,query);
		evaluationOperatorLib = Utils.initEvaluationOperatorLib(query);
		referenceArgumentLib = Utils.initReferenceArgumentLib(evaluationOperatorLib);
		orGroupLib = Utils.initOrGroupLib(query);
		try{
			fsa.generateFile("Query.vql", generateCode(query));
			System.out.println("MQLGenerator: Generation of Query.vql completed.")
		}catch(Exception e){
			System.out.println("MQLGenerator: Exception caught. Stacktrace: ...")
			e.printStackTrace
		}
	}
	
	private def dispatch String generateCode(Query query){
	'''
		package qrmm
		import "/QRMM/model/QRMM.ecore"
				
		«««WRITE STARTING PATTERN 'QUERY'»»
«writeStartingPattern(query)»
		«««WRITE SUCCESSORGROUP PATTERNS»
«««writeSuccessorGroupPatterns()»
«writeOrGroupPatterns()»
		«««WRITE ROOTCLASS (=BOND) PATTERNS»
«writeRootClassPatterns()»
		«««WRITE ATTRIBUTE PATTERNS»
		«FOR AttributeEClass a : Utils.getAllReferencedAttributes(query)»
    «writeAttributePattern(a)»
		«ENDFOR»
		«««WRITE AGGREGATIONOPERATOR PATTERNS»
«writeEvaluationOperatorPatterns»		
		«««WRITE ARGUMENT PATTERNS»
«writeArgumentPatterns()»		
		«««WRITE CONTAINS PATTERNS»
«writeContainsPatterns()»
	«««WRITE OrGroupRef PATTERNS»
	«writeOrGroupReferencePatterns()»
'''	
	}
	
	private def String writeStartingPattern(Query query){
		var code = "";
		code = "pattern query(result:SearchableElement){\n"
		val rootClasses = Utils.getWhereReference(query) as EList<RootClass>;
		for(var i=0; i<rootClasses.size; i++){
			val rc = rootClasses.get(i)
			code += "    find " + dictionary.get(rc) + "(result);\n"
			code += "}\n"
			if(i<rootClasses.size-1){
				code += "or{\n"
			}	
		}
		code += "\n"
		return code;
	}
	
	private def String writeAttributePattern(AttributeEClass attr){
		var code = "";
		if(attr instanceof RegularAttributeEClass){
			code = writeRegularAttributePattern(attr as RegularAttributeEClass);
		}else if(attr instanceof EnumerationAttributeEClass){
			code = writeEnumerationAttributePattern(attr as EnumerationAttributeEClass);
		}
		return code;
	}
	
	private def String writeRegularAttributePattern(RegularAttributeEClass attr){
		val operator = attr.eGet(attr.eClass.getEStructuralFeature("operator")) as Operator;
		val evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(operator);
		val containingFeatureName = attr.eContainingFeature.name.substring(0,attr.eContainingFeature.name.indexOf("_AttrEClass"))
		'''
		pattern «attrLib.get(attr)»(elem:«attr.eContainer.eClass.name»,«attr.name»){
			«FOR EvaluationFunctionalOperator aop:evaluationOperators»
			find «evaluationOperatorLib.get(aop)»(elem, «Utils.evaluationOperatorRefNames.get(aop)»);
			«ENDFOR»
			«attr.eContainer.eClass.name».«containingFeatureName»(elem,«attr.name»);
			«if(operator != null){writeReferences(operator as ExpressionOperator)}»
		«writeInequalityConstraints(attr)»
			«if(operator != null){writeCheckClauseForAttribute(attr)}»
		}
		
		'''
	}
	
	private def String writeEnumerationAttributePattern(EnumerationAttributeEClass attr){
		var operator = attr.eGet(attr.eClass.getEStructuralFeature("operator"));
		var enumString = "x";
		val containingFeatureName = attr.eContainingFeature.name.substring(0,attr.eContainingFeature.name.indexOf("_AttrEClass"))
		
		var code = "pattern " + attrLib.get(attr) + "(elem:" + attr.eContainer.eClass.name + "){\n";
				
		while(operator !== null){
			val enumOperator = operator as EnumerationOperator;
			val enumLiteral = enumOperator.eGet(enumOperator.eClass.getEStructuralFeature("argument")) as Enumerator;
			enumString = "::" + enumLiteral.toString;
			code += "	" + attr.eContainer.eClass.name + "." + containingFeatureName + "(elem," + enumString + ");\n}";
			operator = enumOperator.eGet(enumOperator.eClass.getEStructuralFeature("or"));
			if(operator !== null) code += "or{\n";
		}
		
		code += "\n";
		
		return code;
	}
	
	private def String writeReferences(ExpressionOperator operator){
		var code = "";
		for(AttributeEClass referencedAttribute: Utils.collectReferenceAttributes(operator)){
			val hashCode = System.identityHashCode(referencedAttribute)
			code += "find " + attrLib.get(referencedAttribute) + "(elem," + referencedAttribute.name + ");\n"
		}
		return code;
	}
	
	private def String writeCheckClauseForAttribute(AttributeEClass attr){
		var code = "check(";				
		code += writeOperator(attr.eGet(attr.eClass.getEStructuralFeature("operator")) as Operator, attr.name);
		code += ");";
		return code;
	}
	
	private def String writeOperator(Operator o, String name){
		var code = "";
		if(o instanceof BitOperator){
			val bo = o as BitOperator;
			var negated = "";
			if(bo.negated)
				negated = "!";
			code += negated+"(";
			for(var i=0; i < Utils.getConnectsReferenceContents(bo).size(); i++){  
				val o2 = Utils.getConnectsReferenceContents(bo).get(i);
				code += writeOperator(o2, name);
				if(i < Utils.getConnectsReferenceContents(bo).size-1){
					code += Utils.getOperatorLiteral(bo)
				}
			}
			code += ")";
		}if(o instanceof EvaluationFunctionalOperator){  
			val fo = o as EvaluationFunctionalOperator;
			var nextFo = Utils.getFunctionalOperator(fo as FunctionalType);
			if(nextFo!==null)	
				code += writeFunctionalOperator(nextFo,Utils.evaluationOperatorRefNames.get(fo));
		}else if(o instanceof FunctionalOperator){
			val fo = o as FunctionalOperator;
			code += writeFunctionalOperator(fo, name);  
		}
		
		return code;
	}
	
	private def String writeFunctionalOperator(FunctionalOperator fo, String prevCode ){
		var code = "(" + prevCode + ")";
		code = Utils.getNegatedSymbol(fo) + "(" + code + Utils.getOperatorLiteral(fo) + writeParameters(Utils.getAllParameters(fo)) + ")";
		val nextFo = Utils.getFunctionalOperator(fo as FunctionalType);
		if(nextFo !== null)
			code = writeFunctionalOperator(nextFo, code);
		return code;
	}
	
	private def String writeParameters(EList<Parameter> parameters){
		var code = "(";
		for(var i=0; i < parameters.size; i++){
			var p = parameters.get(i);
			val argument = p.eGet(p.eClass.getEStructuralFeature("argument")) as Argument;
			var value = "";
			if(argument instanceof PrimitiveArgument){
				value = Utils.writePrimitiveArgumentValue(argument as PrimitiveArgument);
			}else if (argument instanceof CalculateableElement_ReferenceArgument){  
				val refArg = argument as CalculateableElement_ReferenceArgument;
				val attr = refArg.eGet(refArg.eClass.getEStructuralFeature("reference")) as AttributeEClass;
				value = attr.name
			}
			else if(argument instanceof EvaluationOperation_Argument){ 
				//value = Utils.evaluationOperatorRefNames.get((argument as AggregationOperator));  //commented out on 9.12.18
				value = Utils.evaluationOperatorRefNames.get((argument as EvaluationOperator));
			}
			
			var operator = null as Object;
			if(argument.eClass.getEStructuralFeature("operator")!==null){
				operator = argument.eGet(argument.eClass.getEStructuralFeature("operator"));
				if(operator !== null){
					code += writeFunctionalOperator(operator as FunctionalOperator, value);
				}
			}
			if(operator === null){
				code += value;
			}	
			if(i < parameters.size - 1){
				code += ", ";
			}
		}
		code += ")";
		return code;
	}
		
	private def String writeAttributeReference(AttributeEClass attr){
		var negated = "";
		
		if(attr.negated)
			negated = "neg ";
		if(attr instanceof EnumerationAttributeEClass){
		'''    «negated»find «attrLib.get(attr)»(elem);
		'''
		}else if(attr instanceof RegularAttributeEClassImpl){
		'''    «negated»find «attrLib.get(attr)»(elem,«attr.name»);
		'''	
		}
	}
	
	private def String writeOrGroupReferencePatterns(){
		var code = "";
		for(OrGroup og: orGroupLib.keySet){
			var negated = "";
			var transitive = "";
			if(og.negated){
				negated = "neg ";
			}
			if(og.transitive){
				transitive = "+";
			}
			code += "pattern " + orGroupLib.get(og) + "_ref(container:" + og.eContainer.eClass.name  + ", member:" + og.eClass.EReferences.get(0).EType.name + "){\n";
			code += "    find " + orGroupLib.get(og) + "(member);\n";
			code += "    find " + referenceFromToLib.get(og.eContainer.eClass).get(og.eContainingFeature) + transitive + "(container,member);\n";
			code += "}\n\n";
		}
		return code;
	}
	
	private def String writeOrGroupPatterns(){
		var code = "";
		for(OrGroup og: orGroupLib.keySet){
			val og_type = og.eClass.EReferences.get(0).EType.name;
			code += "pattern " + orGroupLib.get(og) + "(elem:" + og_type  + "){\n"
			var rootClasses = Utils.getRootClassesOfOrGroup(og);
			if(rootClasses.size == 0){
				code += "	" + og_type + "(elem);\n}\n";
			}else{
				for(var i=0; i<rootClasses.size; i++){
					val rc = rootClasses.get(i);
							
					code += "    find " + dictionary.get(rc) + "(elem);\n"
					
					code += "}\n"
					if(i < rootClasses.size - 1){
						code += "or{\n"
					}
				}
			}
			code += "\n"	
		}
		
		return code;
	}
	
	private def String writeOrGroupReferencesForRootClass(RootClass rc){
		var code ="";
		
		val orGroups = Utils.getOrGroupsOfRootClass(rc);
		
		for(var i=0; i<orGroups.size; i++){
			val og = orGroups.get(i);
			var negated = "";
			if(og.negated)
				negated = "neg " 
			code += "    " + negated + "find " + orGroupLib.get(og) + "_ref(elem," + og.name + ");\n"
		}
		
		return code;
	}
	
	private def String writeAttributeReferencesForRootClass(RootClass rc){
		var code = "";
		for(AttributeEClass a: Utils.getDirectReferencedAttributes(rc)){
			code += writeAttributeReference(a)
		}
		return code;
	}
	
	private def String writeRootClassPatterns(){
		var code = "";
		for(RootClass rc : dictionary.keySet()){
			code += "pattern " + dictionary.get(rc) + "(elem:" + rc.eClass.name + "){\n";
			code += writeRootClassBody(rc);
			code += "}\n\n";
		}
		return code;
	}
	
	private def String writeRootClassBody(RootClass rc){
		var code = "    " + rc.eClass.name + "(elem);\n";
		code += writeAttributeReferencesForRootClass(rc);
		code += writeOrGroupReferencesForRootClass(rc); 
		code += writeInequalityConstraints(rc);
		code += writeEvaluationOperatorReferences(rc);
		return code;
	}
	
	private def String writeInequalityConstraints(EObject eo){
		var code = "";
		var inequalitySets = new HashSet<HashSet<NamedElement>>();
		
		if(eo instanceof RootClass){
			inequalitySets = Utils.getInequalitySetsForRootClass(eo as RootClass);
		}else if(eo instanceof AttributeEClass){ 
			inequalitySets = Utils.getInequalitySetsForAttribute(eo as AttributeEClass);
		}	
		
		for(var i=0; i<inequalitySets.size; i++){
			val pair = inequalitySets.get(i);
			code += "    " + pair.get(0).name + " != " + pair.get(1).name + ";\n";
		}
		return code;
	}
	
	private def String writeEvaluationOperatorReferences(RootClass rc){
		var code = "";		
		val evaluationOperators = rc.eGet(rc.eClass.getEStructuralFeature("EvaluationOperator")) as EList<EvaluationOperator>;
		for(EvaluationOperator evaluationOperator : evaluationOperators){					
			val firstLevelEvaluationFunctionalOperators = Utils.collectAllEvaluationFunctionalOperators(evaluationOperator)
			for(var j = 0; j < firstLevelEvaluationFunctionalOperators.size; j++){
				val o = firstLevelEvaluationFunctionalOperators.get(j);
				code += "    find " + evaluationOperatorLib.get(o) + "(elem, " + Utils.evaluationOperatorRefNames.get(o) + ");\n"
			}			
			code += "    check(" + writeOperator(evaluationOperator,"") + ");\n"	
		}
		return code;
	}
	
	private def String writeContainsPatterns(){
		var code = "";
		val keys = referenceFromToLib.keySet;
		for(EClass ec: keys){
			var hashMap = referenceFromToLib.get(ec);
			val keys2 = hashMap.keySet;
			for(EStructuralFeature ef: keys2){
				val patternName = hashMap.get(ef);
				code += "pattern " + patternName + "(from:" + ec.name + ", to:" + (ef.EType as EClass).EReferences.get(0).EType.name + "){\n";
				code += "    " + ec.name + "." + ef.name + "(from, to);\n"
				code += "}\n\n";
			}
		}
		return code;
	}
	
	private def String writeEvaluationOperatorPatterns(){
		var code = "";
		for(EvaluationFunctionalOperator op: evaluationOperatorLib.keySet){  	
			val containingRc = Utils.getContainingRootClass(op);
			val param = Utils.getAllParameters(op).get(0);
			val operatorLiteral = Utils.getOperatorLiteral(op);
			
			if(op instanceof AggregationOperator){
				code += "pattern " + evaluationOperatorLib.get(op) + "(elem:" + containingRc.eClass.name + ", result:java Integer){\n"
				
				if(op instanceof CountingAggregationOperator){
					val arg = param.eGet(param.eClass.getEStructuralFeature("argument")) as Countable_ReferenceArgument;	
					val countable =  arg.eGet(arg.eClass.getEStructuralFeature("reference")) as Countable;
					
					var countablePatternName = "";
					
					if(countable instanceof AttributeEClass){
						countablePatternName = attrLib.get(countable as AttributeEClass);
					}else if(countable instanceof OrGroup){
						countablePatternName = orGroupLib.get(countable as OrGroup) + "_ref";
					}
					
					code += "    result == " + operatorLiteral + " find " + countablePatternName + "(elem, " 
					code += (countable as NamedElement).name + ");\n"
				}else if(op instanceof CalculatingAggregationOperator){
					val arg = param.eGet(param.eClass.getEStructuralFeature("argument")) as Calculateable_Argument;
					code += "    result == " + operatorLiteral + " find " + referenceArgumentLib.get(arg) + "(elem, #);\n";
				}
				
				code += "}\n\n"		
			}else if(op instanceof ClassOperator){
				var typeName = (op.getType() as EClass).name
				typeName = typeName.substring(0,typeName.indexOf('_'))
				code += "pattern " + evaluationOperatorLib.get(op) + "(elem:" + containingRc.eClass.name + ", result:java " + typeName + "){\n"
				code += "    " + containingRc.eClass.name + "(elem);"  //new (9.12.18)
				//val arg = param.eGet(param.eClass.getEStructuralFeature("argument")) as Calculateable_Argument;  //original (9.12.18)
				val arg = param.eGet(param.eClass.getEStructuralFeature("argument"))
				var argString = "";
				if(arg instanceof Calculateable_Argument){
					code += "    find " + referenceArgumentLib.get(arg) + "(elem, " + Utils.referenceArgumentRefNames.get(arg as Calculateable_Argument) + ");\n";
					code += "	result == eval(" + operatorLiteral + "(" + Utils.referenceArgumentRefNames.get(arg as Calculateable_Argument) + "));\n"	
				}else if(arg instanceof String_PrimitiveArgument){
					code += "	result == eval(" + operatorLiteral + "(\"" + (arg as String_PrimitiveArgument).value + "\"));\n"	
				}else if(arg instanceof Integer_PrimitiveArgument){
					code += "	result == eval(" + operatorLiteral + "(" + (arg as Integer_PrimitiveArgument).value + "));\n"	
				}	
				
				code += "}\n\n"
			}	
			
		}
		return code;
	}
	
	private def String writeArgumentPatterns(){
		var code = "";
		for(ReferenceArgument arg : referenceArgumentLib.keySet){
			val containingRc = Utils.getContainingRootClass(arg);
			var typeName = "Object";
			/* //commented out on 9.12.18
			if(arg instanceof Calculateable_Argument){ 
				
				typeName = (arg.getType() as EClass).name
				typeName = typeName.substring(0,typeName.indexOf('_'))
				
			}
			*/
			if (arg instanceof CalculateableElement_ReferenceArgument){  
				val calculateableElement = arg.eGet(arg.eClass.getEStructuralFeature("reference")) as CalculateableElement;  
				val attr = calculateableElement as AttributeEClass;
				val operator = arg.eGet(arg.eClass.getEStructuralFeature("operator")) as FunctionalOperator;
				
		
				if(operator === null){
					typeName = (arg.getType() as EClass).name   //new approach (9.12.18)
					typeName = typeName.substring(0,typeName.indexOf('_'))   //new approach (9.12.18)
					code += "pattern " + referenceArgumentLib.get(arg) + "(elem:" + containingRc.eClass.name + ", result: java " + typeName + "){\n"  //new approach (9.12.18)
					code += "    find " + attrLib.get(attr) + "(elem, result);\n"
				}else{
					typeName = ((operator.lastOperator as TypedElement).type as EClass).name;  //new approach (9.12.18)
					typeName = typeName.substring(0,typeName.indexOf('_'));
					
					code += "pattern " + referenceArgumentLib.get(arg) + "(elem:" + containingRc.eClass.name + ", result: java " + typeName + "){\n"  //new approach (9.12.18)
					
					val evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(operator as Operator);	
					for(EvaluationFunctionalOperator aop : evaluationOperators){  
						code += "    find " + evaluationOperatorLib.get(aop) + "(elem, " + Utils.evaluationOperatorRefNames.get(aop) + ");\n"
					}
					
					code += "    find " + attrLib.get(attr) + "(elem, " + attr.name + ");\n"
					code += "    result == eval(" + writeOperator(operator as Operator,attr.name) + ");\n"
				}
				code += "}\n\n"	
			}else if(arg instanceof Calculateable_Argument){
				typeName = (arg.getType() as EClass).name   //new approach (9.12.18)
				typeName = typeName.substring(0,typeName.indexOf('_'))   //new approach (9.12.18)
				
				code += "pattern " + referenceArgumentLib.get(arg) + "(elem:" + containingRc.eClass.name + ", result: java " + typeName + "){\n"
				code += "    find " + evaluationOperatorLib.get(arg) + "(elem,result);\n"
				code += "}\n\n"
			}
		}
		return code;
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}
