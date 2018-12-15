package org.xtext.generator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import qmm.AggregationOperator;
import qmm.Argument;
import qmm.AttributeEClass;
import qmm.BitOperator;
import qmm.Boolean_FunctionalType;
import qmm.CalculateableElement_ReferenceArgument;
import qmm.EvaluationFunctionalOperator;
import qmm.ExpressionOperator;
import qmm.FunctionalOperator;
import qmm.FunctionalType;
import qmm.NamedElement;
import qmm.NegatableElement;
import qmm.Operator;
import qmm.OrGroup;
import qmm.Parameter;
import qmm.PrimitiveArgument;
import qmm.Query;
import qmm.ReferenceArgument;
import qmm.RootClass;



public class Utils {
	private static int counter = 0;
	private static HashMap<RootClass, String> refLib = new HashMap<RootClass, String>();
	
	public static HashMap<EvaluationFunctionalOperator,String> evaluationOperatorRefNames = new HashMap<EvaluationFunctionalOperator,String>();
	public static HashMap<ReferenceArgument,String> referenceArgumentRefNames = new HashMap<ReferenceArgument,String>();
	
	public static HashMap<RootClass, String> initRootClassLib(Query query){
		HashMap<RootClass, String> rootClassLib = new HashMap<RootClass,String>();
		for(RootClass rc: getAllReferencedRootClassesInclSuccessors(query))
			rootClassLib.put(rc, "x" + getNextCounter());
		return rootClassLib;
	}
	
	public static HashMap<RootClass, String> initDictionary(Query query){
		HashMap<RootClass, String> dictionary = new HashMap<RootClass, String>();
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof RootClass){
				RootClass rc = (RootClass)eo;
				dictionary.put(rc, rc.eClass().getName() + System.identityHashCode(rc));
			}
		}
		
		return dictionary;
	}
	
	public static HashMap<AttributeEClass, String> initAttrLib(Query query){
		HashMap<AttributeEClass, String> attrLib = new HashMap<AttributeEClass, String>();
		for(AttributeEClass a: getAllReferencedAttributes(query)){
			String patternName = a.getName() + "_" + a.eClass().getName();
			attrLib.put(a, patternName);
		}
		return attrLib;
	}
	
	public static HashMap<OrGroup, String> initOrGroupLib(Query query){
		HashMap<OrGroup, String> orGroupLib = new HashMap<OrGroup, String>();
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof OrGroup){
				OrGroup og = (OrGroup)eo;
				orGroupLib.put(og, og.getName() + "_OrGroup");
			}
		}
		return orGroupLib;
	}
	
	public static ArrayList<OrGroup> getOrGroupsOfRootClass(RootClass rc){
		ArrayList<OrGroup> orGroups = new ArrayList<OrGroup>();
		EList<EObject> contents = rc.eContents();
		for(EObject eo: contents){
			if(eo instanceof OrGroup){
				orGroups.add((OrGroup)eo);
			}
		}
		return orGroups;
	}
	
	public static ArrayList<RootClass> getRootClassesOfOrGroup(OrGroup og){
		ArrayList<RootClass> rootClasses = new ArrayList<RootClass>();
		EList<EObject> contents = og.eContents();
		for(EObject eo: contents){
			if(eo instanceof RootClass){
				rootClasses.add((RootClass)eo);
			}
		}
		return rootClasses;
	}

	public static void initReferenceFromToLib(HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib,RootClass rc){
		HashMap<EStructuralFeature, String> hashmap = new HashMap<EStructuralFeature, String>();
		
		if(referenceFromToLib.get(rc.eClass())!=null)
			hashmap=referenceFromToLib.get(rc.eClass());
		
		for(OrGroup og : getOrGroupsOfRootClass(rc)){
			EStructuralFeature esf=og.eContainingFeature();
			String patternName = rc.eClass().getName() + "_" + esf.getName() + System.identityHashCode(esf);
			hashmap.put(esf, patternName);
			referenceFromToLib.put(rc.eClass(),hashmap);
			for(RootClass rc2: getRootClassesOfOrGroup(og)){
				initReferenceFromToLib(referenceFromToLib, rc2);
			}
		}
	}
	
	public static void initReferenceFromToLib(HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib,Query query){
		for(RootClass rc: getWhereReference(query)){
				initReferenceFromToLib(referenceFromToLib, rc);
		}
	}
	
	public static EList<RootClass> getWhereReference(Query query){
		return (EList<RootClass>)query.eGet(query.eClass().getEStructuralFeature("where"));
	}
	
	public static int getNextCounter(){
		return counter++;
	}
	
	public static List<RootClass> getAllReferencedRootClassesInclSuccessors(Query query){
		ArrayList<RootClass> rootClasses = new ArrayList<RootClass>();
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof RootClass ){
				rootClasses.add((RootClass)eo);
			}
		}
		return rootClasses;
	}
	
	public static List<AttributeEClass> getDirectReferencedAttributes(RootClass rc){
		ArrayList<AttributeEClass> attributes = new ArrayList<AttributeEClass>();
		for(EObject eo: rc.eContents()){
			if(eo instanceof AttributeEClass){
				attributes.add((AttributeEClass)eo);
			}
		}
		return attributes;
	}
	
	public static List<AttributeEClass> getAllReferencedAttributes(Query query){
		ArrayList<AttributeEClass> attributes = new ArrayList<AttributeEClass>();
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof AttributeEClass){
				attributes.add((AttributeEClass)eo);
			}
		}
		
		return attributes;
	}
	
	public static List<RootClass> getDirectReferencedRootClasses(RootClass rc){
		ArrayList<RootClass> rootClasses = new ArrayList<RootClass>();
		for(EObject eo: rc.eContents()){
			if(eo instanceof RootClass && (eo.eContainer() == null || !eo.eContainingFeature().getName().equals("successor"))){
				rootClasses.add((RootClass)eo);
			}
		}
		return rootClasses;
	}
	
	public static EList<Operator> getConnectsReferenceContents(BitOperator bo){
		return (EList<Operator>) bo.eGet(bo.eClass().getEStructuralFeature("connects"));  
	}	
	
	public static String getNegatedSymbol(FunctionalOperator fo){
		String negatedSymbol = "";
		if(fo instanceof Boolean_FunctionalType){
			Boolean_FunctionalType bfo = (Boolean_FunctionalType)fo;
			if(bfo.isNegated())
				negatedSymbol = "!";
		}
		return negatedSymbol;
	}
	
	public static EList<Parameter> getAllParameters(FunctionalOperator fo){		
		EList<Parameter> parameters = new BasicEList();
		EOperation getAllParametersOperation = findEOperationByName(fo, "getAllParameters");
		if(getAllParametersOperation!=null){
			try {
				parameters =  (EList<Parameter>)fo.eInvoke(getAllParametersOperation, null);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return parameters;
	}
	
	public static String getOperatorLiteral(Operator o){
		String literal = null;
		try {
			literal = (String)o.eInvoke(findEOperationByName(o, "getLiteral"), null);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return literal;
	}
	
	private static EOperation findEOperationByName(EObject eo, String eOperationName){
		EOperation eOperation = null;
		for(EOperation op: eo.eClass().getEAllOperations()){
			if(op.getName().equals(eOperationName))
				eOperation = op;
		}
		return eOperation;
	}
	
	public static FunctionalOperator getFunctionalOperator(FunctionalType ft){
		Object nextFo = ft.eGet(ft.eClass().getEStructuralFeature("operator"));
		if(nextFo != null){
			return (FunctionalOperator)nextFo;
		}
		return null;
	}
	
	public static String writePrimitiveArgumentValue(PrimitiveArgument pa){
		Object value = pa.eGet(pa.eClass().getEStructuralFeature("value"));
		String strValue = value.toString();
		if(value instanceof String)
			strValue = "\"" + strValue + "\"";
		else if(value instanceof Character)
			strValue = "'" + strValue + "'";
		return strValue;
	}
	
	public static HashSet<AttributeEClass> collectReferenceAttributes(ExpressionOperator operator){
		HashSet<AttributeEClass> referencedAttributes = new HashSet<AttributeEClass>();
		
		if(operator instanceof BitOperator){
			Collection<ExpressionOperator> connectedOperators = (Collection<ExpressionOperator>)operator.eGet(operator.eClass().getEStructuralFeature("connects"));
			for(ExpressionOperator connectedOperator: connectedOperators){
				referencedAttributes.addAll(collectReferenceAttributes(connectedOperator));
			}
		}else if(operator instanceof FunctionalOperator){
			FunctionalOperator functionalOperator = (FunctionalOperator)operator;
			for(Parameter p:getAllParameters(functionalOperator)){
				Argument argument = (Argument)p.eGet(p.eClass().getEStructuralFeature("argument"));
				if(argument instanceof CalculateableElement_ReferenceArgument){
					AttributeEClass referencedAttribute = (AttributeEClass)argument.eGet(argument.eClass().getEStructuralFeature("reference"));
					referencedAttributes.add(referencedAttribute);
				}
			}
			FunctionalOperator nextFo = getFunctionalOperator((FunctionalType)functionalOperator);
			if(nextFo != null)
				referencedAttributes.addAll(collectReferenceAttributes(nextFo));
		}
		return referencedAttributes;
	}
	
	public static HashMap<EvaluationFunctionalOperator,String> initEvaluationOperatorLib(Query query){
		HashMap<EvaluationFunctionalOperator,String> map = new HashMap<EvaluationFunctionalOperator,String>();
		TreeIterator<EObject> iter = query.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof EvaluationFunctionalOperator){
				EvaluationFunctionalOperator ao = (EvaluationFunctionalOperator)eo;	
				String patternName = getOperatorLiteral(ao) +  System.identityHashCode(ao);
				patternName = patternName.replace('.', '_');
				map.put(ao, patternName);
				evaluationOperatorRefNames.put(ao, "ref" + System.identityHashCode(ao));
			}
		}
		return map;
	}
	
	public static RootClass getContainingRootClass(EObject eo){
		EObject container = eo.eContainer();
		while(container != null){
			if(container instanceof RootClass)
				return (RootClass)container;
			container = container.eContainer();
		}
		return null;
	}
	
	public static HashMap<ReferenceArgument, String> initReferenceArgumentLib(HashMap<EvaluationFunctionalOperator, String> aggregationOperatorLib){
		HashMap<ReferenceArgument, String> map = new HashMap<ReferenceArgument, String>();
		
		for(EvaluationFunctionalOperator op: aggregationOperatorLib.keySet()){
			EList<Parameter> parameters = getAllParameters(op);
			for(Parameter p: parameters){
				Object arg = p.eGet(p.eClass().getEStructuralFeature("argument"));
				if(arg instanceof ReferenceArgument){	
					ReferenceArgument refArg = (ReferenceArgument) arg;
					String patternName = "argument_" + System.identityHashCode(refArg);
					referenceArgumentRefNames.put(refArg, "ref" + System.identityHashCode(refArg));
					map.put(refArg, patternName);
				}
			}
		}
		
		return map;
	}
	
	public static ArrayList<EvaluationFunctionalOperator> collectAllEvaluationFunctionalOperators(EObject eo){  //16.11.18 changed to EvaluationFunctionalOperator
		ArrayList<EvaluationFunctionalOperator> evaluationFunctionalOperators = new ArrayList<EvaluationFunctionalOperator>();
		if(eo instanceof BitOperator){
			for(Operator op:getConnectsReferenceContents((BitOperator)eo)){
				evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(op));
			}	
		}else{
			if (eo instanceof FunctionalType){
				FunctionalType ft = (FunctionalType)eo;
				if(ft instanceof FunctionalOperator){
					FunctionalOperator fo = (FunctionalOperator)ft;
					if(fo instanceof EvaluationFunctionalOperator){
						evaluationFunctionalOperators.add((EvaluationFunctionalOperator)fo);	
					}else{
						EList<Parameter> parameters = getAllParameters(fo);
						for(Parameter p: parameters){
							evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(p));
						}
					}
				}
				FunctionalOperator nextFo = getFunctionalOperator(ft);
				if(nextFo!=null){
					evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(nextFo));
				}
			}else if(eo instanceof Parameter){
				Argument arg = (Argument)eo.eGet(eo.eClass().getEStructuralFeature("argument"));
				evaluationFunctionalOperators.addAll(collectAllEvaluationFunctionalOperators(arg));
			}
		}
		
		return evaluationFunctionalOperators;
	}
	
	public static HashSet<HashSet<NamedElement>> getInequalitySetsForRootClass(RootClass rc){
		HashSet<HashSet<NamedElement>> inequalitySets = new HashSet<HashSet<NamedElement>>();
		ArrayList<NamedElement> namedElements = new ArrayList<NamedElement>();
		for(EObject eo: rc.eContents()){
			if(eo instanceof NamedElement && !(eo instanceof qmm.EnumerationAttributeEClass)){
				NamedElement n = (NamedElement)eo;
				if(!(n instanceof NegatableElement) || !((NegatableElement)n).isNegated())namedElements.add(n);
			}
		}
		return collectUniqueCombinations(namedElements);
	}
	
	public static HashSet<HashSet<NamedElement>> getInequalitySetsForAttribute(AttributeEClass attr){		
		ArrayList<NamedElement> namedElements = new ArrayList<NamedElement>();
		namedElements.add(attr);
		TreeIterator<EObject> iter = attr.eAllContents();
		while(iter.hasNext()){
			EObject eo = iter.next();
			if(eo instanceof CalculateableElement_ReferenceArgument && !(eo.eContainer().eContainer() instanceof AggregationOperator)){
				AttributeEClass attr2 = (AttributeEClass) eo.eGet(eo.eClass().getEStructuralFeature("reference"));
				if(!attr2.isNegated()){
					namedElements.add(attr2);
				}
			}
		}
		return collectUniqueCombinations(namedElements);
	}
	
	private static HashSet<HashSet<NamedElement>> collectUniqueCombinations(ArrayList<NamedElement> namedElements){
		 HashSet<HashSet<NamedElement>> uniqueCombinations = new  HashSet<HashSet<NamedElement>>();
		 for(NamedElement n1: namedElements){
			for(NamedElement n2: namedElements){
				if(n1 != n2){
					HashSet<NamedElement> pair = new HashSet<NamedElement>();
				pair.add(n1);
					pair.add(n2);
					uniqueCombinations.add(pair);
				}
			}	
		 }
		 return uniqueCombinations;
	}
}
