package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

public class QMMMetaModelBuilder_Collections {

	public static ArrayList<EClass> rootClasses = new ArrayList<EClass>();
	public static HashMap<String, Integer> attributeEClassNameCounter = new HashMap<String, Integer>();
	public static HashMap<String, EClass> defaultEClasses = new HashMap<String, EClass>();
	public static HashMap<String, EClass> typedAttributeEClasses = new HashMap<String, EClass>();
	public static HashMap<EClass, EAttribute> concreteAttributeEClasses = new HashMap<EClass, EAttribute>();
	public static HashMap<String,EClassifier> eClassifiersMap = new HashMap<String,EClassifier>();
	public static HashMap<String, EClass> typedEvaluationOperationArguments = new HashMap<String, EClass>();
	public static HashMap<String,EClass> typedCalculateableParameters = new HashMap<String,EClass>();
	public static HashMap<String,EClass> typedCalculateables = new HashMap<String,EClass>();
	public static HashMap<String,EClass> typedCalculateableElements = new HashMap<String,EClass>();
	public static HashMap<String, EClass> typedOperators = new HashMap<String, EClass>();
	public static HashMap<String, EClass> typedEnumerationOperators = new HashMap<String, EClass>();
	public static HashMap<String, EClass> typedExpressionOperators = new HashMap<String, EClass>();
	public static HashMap<String, EClass> typeEClasses = new HashMap<String, EClass>();
	public static HashMap<String, EClass> functionalTypes = new HashMap<String, EClass>();
	public static HashMap<String, EClass> typedFunctionalParameters = new HashMap<String, EClass>();
	public static HashMap<String, EClass> functionalOperators = new HashMap<String, EClass>();
	public static HashMap<String, Collection<EClass>> concreteFunctionalOperators = new HashMap<String, Collection<EClass>>();
	public static HashMap<String, EClass> typedArguments = new HashMap<String, EClass>();
	public static HashMap<EClassifier, EClass> concreteOrGroups = new HashMap<EClassifier, EClass>();
	public static HashMap<EClass, String> rootClassValXidationOperationBodies = new HashMap<EClass, String>();
	public static HashMap<String,EClass> typedCalculateableElementReferenceArguments = new HashMap<String,EClass>();
	public static HashMap<String,ArrayList<EClass>> countingAggregationOperators = new HashMap<String,ArrayList<EClass>>();
	public static HashMap<String,ArrayList<EClass>> calculatingAggregationOperators = new HashMap<String,ArrayList<EClass>>();
	public static HashMap<String,ArrayList<EClass>> classOperators = new HashMap<String,ArrayList<EClass>>();
	public static HashMap<EClass, String> rootClassValidationOperationBodies = new HashMap<EClass, String>();

}
