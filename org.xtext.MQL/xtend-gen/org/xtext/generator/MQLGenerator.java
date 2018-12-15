package org.xtext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.generator.Utils;
import qmm.AggregationOperator;
import qmm.Argument;
import qmm.AttributeEClass;
import qmm.BitOperator;
import qmm.CalculateableElement;
import qmm.CalculateableElement_ReferenceArgument;
import qmm.Calculateable_Argument;
import qmm.CalculatingAggregationOperator;
import qmm.ClassOperator;
import qmm.Countable;
import qmm.Countable_ReferenceArgument;
import qmm.CountingAggregationOperator;
import qmm.EnumerationAttributeEClass;
import qmm.EnumerationOperator;
import qmm.EvaluationFunctionalOperator;
import qmm.EvaluationOperation_Argument;
import qmm.EvaluationOperator;
import qmm.ExpressionOperator;
import qmm.FunctionalOperator;
import qmm.FunctionalType;
import qmm.Integer_PrimitiveArgument;
import qmm.NamedElement;
import qmm.Operator;
import qmm.OrGroup;
import qmm.Parameter;
import qmm.PrimitiveArgument;
import qmm.Query;
import qmm.ReferenceArgument;
import qmm.RegularAttributeEClass;
import qmm.RootClass;
import qmm.String_PrimitiveArgument;
import qmm.TypedElement;
import qmm.impl.RegularAttributeEClassImpl;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MQLGenerator extends AbstractGenerator implements IGenerator {
  private static HashMap<RootClass, String> rootClassLib = new HashMap<RootClass, String>();
  
  private static HashMap<RootClass, String> dictionary = new HashMap<RootClass, String>();
  
  private static HashMap<AttributeEClass, String> attrLib = new HashMap<AttributeEClass, String>();
  
  private static HashMap<EClass, HashMap<EStructuralFeature, String>> referenceFromToLib = new HashMap<EClass, HashMap<EStructuralFeature, String>>();
  
  private static HashMap<EvaluationFunctionalOperator, String> evaluationOperatorLib = new HashMap<EvaluationFunctionalOperator, String>();
  
  private static HashMap<ReferenceArgument, String> referenceArgumentLib = new HashMap<ReferenceArgument, String>();
  
  private static HashMap<OrGroup, String> orGroupLib = new HashMap<OrGroup, String>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    System.out.println("MQLGenerator: Generating Query.vql ... ");
    final Query query = ((Query[])Conversions.unwrapArray(Iterables.<Query>filter(resource.getContents(), Query.class), Query.class))[0];
    MQLGenerator.dictionary = Utils.initDictionary(query);
    MQLGenerator.rootClassLib = Utils.initRootClassLib(query);
    MQLGenerator.attrLib = Utils.initAttrLib(query);
    Utils.initReferenceFromToLib(MQLGenerator.referenceFromToLib, query);
    MQLGenerator.evaluationOperatorLib = Utils.initEvaluationOperatorLib(query);
    MQLGenerator.referenceArgumentLib = Utils.initReferenceArgumentLib(MQLGenerator.evaluationOperatorLib);
    MQLGenerator.orGroupLib = Utils.initOrGroupLib(query);
    try {
      fsa.generateFile("Query.vql", this.generateCode(query));
      System.out.println("MQLGenerator: Generation of Query.vql completed.");
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        System.out.println("MQLGenerator: Exception caught. Stacktrace: ...");
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private String _generateCode(final Query query) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package qrmm");
    _builder.newLine();
    _builder.append("import \"/QRMM/model/QRMM.ecore\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    String _writeStartingPattern = this.writeStartingPattern(query);
    _builder.append(_writeStartingPattern);
    _builder.newLineIfNotEmpty();
    String _writeOrGroupPatterns = this.writeOrGroupPatterns();
    _builder.append(_writeOrGroupPatterns);
    _builder.newLineIfNotEmpty();
    String _writeRootClassPatterns = this.writeRootClassPatterns();
    _builder.append(_writeRootClassPatterns);
    _builder.newLineIfNotEmpty();
    {
      List<AttributeEClass> _allReferencedAttributes = Utils.getAllReferencedAttributes(query);
      for(final AttributeEClass a : _allReferencedAttributes) {
        String _writeAttributePattern = this.writeAttributePattern(a);
        _builder.append(_writeAttributePattern);
        _builder.newLineIfNotEmpty();
      }
    }
    String _writeEvaluationOperatorPatterns = this.writeEvaluationOperatorPatterns();
    _builder.append(_writeEvaluationOperatorPatterns);
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    String _writeArgumentPatterns = this.writeArgumentPatterns();
    _builder.append(_writeArgumentPatterns);
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    String _writeContainsPatterns = this.writeContainsPatterns();
    _builder.append(_writeContainsPatterns);
    _builder.newLineIfNotEmpty();
    String _writeOrGroupReferencePatterns = this.writeOrGroupReferencePatterns();
    _builder.append(_writeOrGroupReferencePatterns);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private String writeStartingPattern(final Query query) {
    String code = "";
    code = "pattern query(result:SearchableElement){\n";
    EList<RootClass> _whereReference = Utils.getWhereReference(query);
    final EList<RootClass> rootClasses = ((EList<RootClass>) _whereReference);
    for (int i = 0; (i < rootClasses.size()); i++) {
      {
        final RootClass rc = rootClasses.get(i);
        String _code = code;
        String _get = MQLGenerator.dictionary.get(rc);
        String _plus = ("    find " + _get);
        String _plus_1 = (_plus + "(result);\n");
        code = (_code + _plus_1);
        String _code_1 = code;
        code = (_code_1 + "}\n");
        int _size = rootClasses.size();
        int _minus = (_size - 1);
        boolean _lessThan = (i < _minus);
        if (_lessThan) {
          String _code_2 = code;
          code = (_code_2 + "or{\n");
        }
      }
    }
    String _code = code;
    code = (_code + "\n");
    return code;
  }
  
  private String writeAttributePattern(final AttributeEClass attr) {
    String code = "";
    if ((attr instanceof RegularAttributeEClass)) {
      code = this.writeRegularAttributePattern(((RegularAttributeEClass) attr));
    } else {
      if ((attr instanceof EnumerationAttributeEClass)) {
        code = this.writeEnumerationAttributePattern(((EnumerationAttributeEClass) attr));
      }
    }
    return code;
  }
  
  private String writeRegularAttributePattern(final RegularAttributeEClass attr) {
    String _xblockexpression = null;
    {
      Object _eGet = attr.eGet(attr.eClass().getEStructuralFeature("operator"));
      final Operator operator = ((Operator) _eGet);
      final ArrayList<EvaluationFunctionalOperator> evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(operator);
      final String containingFeatureName = attr.eContainingFeature().getName().substring(0, attr.eContainingFeature().getName().indexOf("_AttrEClass"));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pattern ");
      String _get = MQLGenerator.attrLib.get(attr);
      _builder.append(_get);
      _builder.append("(elem:");
      String _name = attr.eContainer().eClass().getName();
      _builder.append(_name);
      _builder.append(",");
      String _name_1 = attr.getName();
      _builder.append(_name_1);
      _builder.append("){");
      _builder.newLineIfNotEmpty();
      {
        for(final EvaluationFunctionalOperator aop : evaluationOperators) {
          _builder.append("\t");
          _builder.append("find ");
          String _get_1 = MQLGenerator.evaluationOperatorLib.get(aop);
          _builder.append(_get_1, "\t");
          _builder.append("(elem, ");
          String _get_2 = Utils.evaluationOperatorRefNames.get(aop);
          _builder.append(_get_2, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      String _name_2 = attr.eContainer().eClass().getName();
      _builder.append(_name_2, "\t");
      _builder.append(".");
      _builder.append(containingFeatureName, "\t");
      _builder.append("(elem,");
      String _name_3 = attr.getName();
      _builder.append(_name_3, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(operator, null));
      if (_notEquals) {
        _xifexpression = this.writeReferences(((ExpressionOperator) operator));
      }
      _builder.append(_xifexpression, "\t");
      _builder.newLineIfNotEmpty();
      String _writeInequalityConstraints = this.writeInequalityConstraints(attr);
      _builder.append(_writeInequalityConstraints);
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _xifexpression_1 = null;
      boolean _notEquals_1 = (!Objects.equal(operator, null));
      if (_notEquals_1) {
        _xifexpression_1 = this.writeCheckClauseForAttribute(attr);
      }
      _builder.append(_xifexpression_1, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String writeEnumerationAttributePattern(final EnumerationAttributeEClass attr) {
    Object operator = attr.eGet(attr.eClass().getEStructuralFeature("operator"));
    String enumString = "x";
    final String containingFeatureName = attr.eContainingFeature().getName().substring(0, attr.eContainingFeature().getName().indexOf("_AttrEClass"));
    String _get = MQLGenerator.attrLib.get(attr);
    String _plus = ("pattern " + _get);
    String _plus_1 = (_plus + "(elem:");
    String _name = attr.eContainer().eClass().getName();
    String _plus_2 = (_plus_1 + _name);
    String code = (_plus_2 + "){\n");
    while ((operator != null)) {
      {
        final EnumerationOperator enumOperator = ((EnumerationOperator) operator);
        Object _eGet = enumOperator.eGet(enumOperator.eClass().getEStructuralFeature("argument"));
        final Enumerator enumLiteral = ((Enumerator) _eGet);
        String _string = enumLiteral.toString();
        String _plus_3 = ("::" + _string);
        enumString = _plus_3;
        String _code = code;
        String _name_1 = attr.eContainer().eClass().getName();
        String _plus_4 = ("\t" + _name_1);
        String _plus_5 = (_plus_4 + ".");
        String _plus_6 = (_plus_5 + containingFeatureName);
        String _plus_7 = (_plus_6 + "(elem,");
        String _plus_8 = (_plus_7 + enumString);
        String _plus_9 = (_plus_8 + ");\n}");
        code = (_code + _plus_9);
        operator = enumOperator.eGet(enumOperator.eClass().getEStructuralFeature("or"));
        if ((operator != null)) {
          String _code_1 = code;
          code = (_code_1 + "or{\n");
        }
      }
    }
    String _code = code;
    code = (_code + "\n");
    return code;
  }
  
  private String writeReferences(final ExpressionOperator operator) {
    String code = "";
    HashSet<AttributeEClass> _collectReferenceAttributes = Utils.collectReferenceAttributes(operator);
    for (final AttributeEClass referencedAttribute : _collectReferenceAttributes) {
      {
        final int hashCode = System.identityHashCode(referencedAttribute);
        String _code = code;
        String _get = MQLGenerator.attrLib.get(referencedAttribute);
        String _plus = ("find " + _get);
        String _plus_1 = (_plus + "(elem,");
        String _name = referencedAttribute.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + ");\n");
        code = (_code + _plus_3);
      }
    }
    return code;
  }
  
  private String writeCheckClauseForAttribute(final AttributeEClass attr) {
    String code = "check(";
    String _code = code;
    Object _eGet = attr.eGet(attr.eClass().getEStructuralFeature("operator"));
    String _writeOperator = this.writeOperator(((Operator) _eGet), attr.getName());
    code = (_code + _writeOperator);
    String _code_1 = code;
    code = (_code_1 + ");");
    return code;
  }
  
  private String writeOperator(final Operator o, final String name) {
    String code = "";
    if ((o instanceof BitOperator)) {
      final BitOperator bo = ((BitOperator) o);
      String negated = "";
      boolean _isNegated = bo.isNegated();
      if (_isNegated) {
        negated = "!";
      }
      String _code = code;
      code = (_code + (negated + "("));
      for (int i = 0; (i < Utils.getConnectsReferenceContents(bo).size()); i++) {
        {
          final Operator o2 = Utils.getConnectsReferenceContents(bo).get(i);
          String _code_1 = code;
          String _writeOperator = this.writeOperator(o2, name);
          code = (_code_1 + _writeOperator);
          int _size = Utils.getConnectsReferenceContents(bo).size();
          int _minus = (_size - 1);
          boolean _lessThan = (i < _minus);
          if (_lessThan) {
            String _code_2 = code;
            String _operatorLiteral = Utils.getOperatorLiteral(bo);
            code = (_code_2 + _operatorLiteral);
          }
        }
      }
      String _code_1 = code;
      code = (_code_1 + ")");
    }
    if ((o instanceof EvaluationFunctionalOperator)) {
      final EvaluationFunctionalOperator fo = ((EvaluationFunctionalOperator) o);
      FunctionalOperator nextFo = Utils.getFunctionalOperator(((FunctionalType) fo));
      if ((nextFo != null)) {
        String _code_2 = code;
        String _writeFunctionalOperator = this.writeFunctionalOperator(nextFo, Utils.evaluationOperatorRefNames.get(fo));
        code = (_code_2 + _writeFunctionalOperator);
      }
    } else {
      if ((o instanceof FunctionalOperator)) {
        final FunctionalOperator fo_1 = ((FunctionalOperator) o);
        String _code_3 = code;
        String _writeFunctionalOperator_1 = this.writeFunctionalOperator(fo_1, name);
        code = (_code_3 + _writeFunctionalOperator_1);
      }
    }
    return code;
  }
  
  private String writeFunctionalOperator(final FunctionalOperator fo, final String prevCode) {
    String code = (("(" + prevCode) + ")");
    String _negatedSymbol = Utils.getNegatedSymbol(fo);
    String _plus = (_negatedSymbol + "(");
    String _plus_1 = (_plus + code);
    String _operatorLiteral = Utils.getOperatorLiteral(fo);
    String _plus_2 = (_plus_1 + _operatorLiteral);
    String _writeParameters = this.writeParameters(Utils.getAllParameters(fo));
    String _plus_3 = (_plus_2 + _writeParameters);
    String _plus_4 = (_plus_3 + ")");
    code = _plus_4;
    final FunctionalOperator nextFo = Utils.getFunctionalOperator(((FunctionalType) fo));
    if ((nextFo != null)) {
      code = this.writeFunctionalOperator(nextFo, code);
    }
    return code;
  }
  
  private String writeParameters(final EList<Parameter> parameters) {
    String code = "(";
    for (int i = 0; (i < parameters.size()); i++) {
      {
        Parameter p = parameters.get(i);
        Object _eGet = p.eGet(p.eClass().getEStructuralFeature("argument"));
        final Argument argument = ((Argument) _eGet);
        String value = "";
        if ((argument instanceof PrimitiveArgument)) {
          value = Utils.writePrimitiveArgumentValue(((PrimitiveArgument) argument));
        } else {
          if ((argument instanceof CalculateableElement_ReferenceArgument)) {
            final CalculateableElement_ReferenceArgument refArg = ((CalculateableElement_ReferenceArgument) argument);
            Object _eGet_1 = refArg.eGet(refArg.eClass().getEStructuralFeature("reference"));
            final AttributeEClass attr = ((AttributeEClass) _eGet_1);
            value = attr.getName();
          } else {
            if ((argument instanceof EvaluationOperation_Argument)) {
              value = Utils.evaluationOperatorRefNames.get(((EvaluationOperator) argument));
            }
          }
        }
        Object operator = ((Object) null);
        EStructuralFeature _eStructuralFeature = argument.eClass().getEStructuralFeature("operator");
        boolean _tripleNotEquals = (_eStructuralFeature != null);
        if (_tripleNotEquals) {
          operator = argument.eGet(argument.eClass().getEStructuralFeature("operator"));
          if ((operator != null)) {
            String _code = code;
            String _writeFunctionalOperator = this.writeFunctionalOperator(((FunctionalOperator) operator), value);
            code = (_code + _writeFunctionalOperator);
          }
        }
        if ((operator == null)) {
          String _code_1 = code;
          code = (_code_1 + value);
        }
        int _size = parameters.size();
        int _minus = (_size - 1);
        boolean _lessThan = (i < _minus);
        if (_lessThan) {
          String _code_2 = code;
          code = (_code_2 + ", ");
        }
      }
    }
    String _code = code;
    code = (_code + ")");
    return code;
  }
  
  private String writeAttributeReference(final AttributeEClass attr) {
    String _xblockexpression = null;
    {
      String negated = "";
      boolean _isNegated = attr.isNegated();
      if (_isNegated) {
        negated = "neg ";
      }
      String _xifexpression = null;
      if ((attr instanceof EnumerationAttributeEClass)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("    ");
        _builder.append(negated, "    ");
        _builder.append("find ");
        String _get = MQLGenerator.attrLib.get(attr);
        _builder.append(_get, "    ");
        _builder.append("(elem);");
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder.toString();
      } else {
        String _xifexpression_1 = null;
        if ((attr instanceof RegularAttributeEClassImpl)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("    ");
          _builder_1.append(negated, "    ");
          _builder_1.append("find ");
          String _get_1 = MQLGenerator.attrLib.get(attr);
          _builder_1.append(_get_1, "    ");
          _builder_1.append("(elem,");
          String _name = ((RegularAttributeEClassImpl)attr).getName();
          _builder_1.append(_name, "    ");
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
          _xifexpression_1 = _builder_1.toString();
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String writeOrGroupReferencePatterns() {
    String code = "";
    Set<OrGroup> _keySet = MQLGenerator.orGroupLib.keySet();
    for (final OrGroup og : _keySet) {
      {
        String negated = "";
        String transitive = "";
        boolean _isNegated = og.isNegated();
        if (_isNegated) {
          negated = "neg ";
        }
        boolean _isTransitive = og.isTransitive();
        if (_isTransitive) {
          transitive = "+";
        }
        String _code = code;
        String _get = MQLGenerator.orGroupLib.get(og);
        String _plus = ("pattern " + _get);
        String _plus_1 = (_plus + "_ref(container:");
        String _name = og.eContainer().eClass().getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + ", member:");
        String _name_1 = og.eClass().getEReferences().get(0).getEType().getName();
        String _plus_4 = (_plus_3 + _name_1);
        String _plus_5 = (_plus_4 + "){\n");
        code = (_code + _plus_5);
        String _code_1 = code;
        String _get_1 = MQLGenerator.orGroupLib.get(og);
        String _plus_6 = ("    find " + _get_1);
        String _plus_7 = (_plus_6 + "(member);\n");
        code = (_code_1 + _plus_7);
        String _code_2 = code;
        String _get_2 = MQLGenerator.referenceFromToLib.get(og.eContainer().eClass()).get(og.eContainingFeature());
        String _plus_8 = ("    find " + _get_2);
        String _plus_9 = (_plus_8 + transitive);
        String _plus_10 = (_plus_9 + "(container,member);\n");
        code = (_code_2 + _plus_10);
        String _code_3 = code;
        code = (_code_3 + "}\n\n");
      }
    }
    return code;
  }
  
  private String writeOrGroupPatterns() {
    String code = "";
    Set<OrGroup> _keySet = MQLGenerator.orGroupLib.keySet();
    for (final OrGroup og : _keySet) {
      {
        final String og_type = og.eClass().getEReferences().get(0).getEType().getName();
        String _code = code;
        String _get = MQLGenerator.orGroupLib.get(og);
        String _plus = ("pattern " + _get);
        String _plus_1 = (_plus + "(elem:");
        String _plus_2 = (_plus_1 + og_type);
        String _plus_3 = (_plus_2 + "){\n");
        code = (_code + _plus_3);
        ArrayList<RootClass> rootClasses = Utils.getRootClassesOfOrGroup(og);
        int _size = rootClasses.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          String _code_1 = code;
          code = (_code_1 + (("\t" + og_type) + "(elem);\n}\n"));
        } else {
          for (int i = 0; (i < rootClasses.size()); i++) {
            {
              final RootClass rc = rootClasses.get(i);
              String _code_2 = code;
              String _get_1 = MQLGenerator.dictionary.get(rc);
              String _plus_4 = ("    find " + _get_1);
              String _plus_5 = (_plus_4 + "(elem);\n");
              code = (_code_2 + _plus_5);
              String _code_3 = code;
              code = (_code_3 + "}\n");
              int _size_1 = rootClasses.size();
              int _minus = (_size_1 - 1);
              boolean _lessThan = (i < _minus);
              if (_lessThan) {
                String _code_4 = code;
                code = (_code_4 + "or{\n");
              }
            }
          }
        }
        String _code_2 = code;
        code = (_code_2 + "\n");
      }
    }
    return code;
  }
  
  private String writeOrGroupReferencesForRootClass(final RootClass rc) {
    String code = "";
    final ArrayList<OrGroup> orGroups = Utils.getOrGroupsOfRootClass(rc);
    for (int i = 0; (i < orGroups.size()); i++) {
      {
        final OrGroup og = orGroups.get(i);
        String negated = "";
        boolean _isNegated = og.isNegated();
        if (_isNegated) {
          negated = "neg ";
        }
        String _code = code;
        String _get = MQLGenerator.orGroupLib.get(og);
        String _plus = ((("    " + negated) + "find ") + _get);
        String _plus_1 = (_plus + "_ref(elem,");
        String _name = og.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + ");\n");
        code = (_code + _plus_3);
      }
    }
    return code;
  }
  
  private String writeAttributeReferencesForRootClass(final RootClass rc) {
    String code = "";
    List<AttributeEClass> _directReferencedAttributes = Utils.getDirectReferencedAttributes(rc);
    for (final AttributeEClass a : _directReferencedAttributes) {
      String _code = code;
      String _writeAttributeReference = this.writeAttributeReference(a);
      code = (_code + _writeAttributeReference);
    }
    return code;
  }
  
  private String writeRootClassPatterns() {
    String code = "";
    Set<RootClass> _keySet = MQLGenerator.dictionary.keySet();
    for (final RootClass rc : _keySet) {
      {
        String _code = code;
        String _get = MQLGenerator.dictionary.get(rc);
        String _plus = ("pattern " + _get);
        String _plus_1 = (_plus + "(elem:");
        String _name = rc.eClass().getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + "){\n");
        code = (_code + _plus_3);
        String _code_1 = code;
        String _writeRootClassBody = this.writeRootClassBody(rc);
        code = (_code_1 + _writeRootClassBody);
        String _code_2 = code;
        code = (_code_2 + "}\n\n");
      }
    }
    return code;
  }
  
  private String writeRootClassBody(final RootClass rc) {
    String _name = rc.eClass().getName();
    String _plus = ("    " + _name);
    String code = (_plus + "(elem);\n");
    String _code = code;
    String _writeAttributeReferencesForRootClass = this.writeAttributeReferencesForRootClass(rc);
    code = (_code + _writeAttributeReferencesForRootClass);
    String _code_1 = code;
    String _writeOrGroupReferencesForRootClass = this.writeOrGroupReferencesForRootClass(rc);
    code = (_code_1 + _writeOrGroupReferencesForRootClass);
    String _code_2 = code;
    String _writeInequalityConstraints = this.writeInequalityConstraints(rc);
    code = (_code_2 + _writeInequalityConstraints);
    String _code_3 = code;
    String _writeEvaluationOperatorReferences = this.writeEvaluationOperatorReferences(rc);
    code = (_code_3 + _writeEvaluationOperatorReferences);
    return code;
  }
  
  private String writeInequalityConstraints(final EObject eo) {
    String code = "";
    HashSet<HashSet<NamedElement>> inequalitySets = new HashSet<HashSet<NamedElement>>();
    if ((eo instanceof RootClass)) {
      inequalitySets = Utils.getInequalitySetsForRootClass(((RootClass) eo));
    } else {
      if ((eo instanceof AttributeEClass)) {
        inequalitySets = Utils.getInequalitySetsForAttribute(((AttributeEClass) eo));
      }
    }
    for (int i = 0; (i < inequalitySets.size()); i++) {
      {
        final HashSet<HashSet<NamedElement>> _converted_inequalitySets = (HashSet<HashSet<NamedElement>>)inequalitySets;
        final HashSet<NamedElement> pair = ((HashSet<NamedElement>[])Conversions.unwrapArray(_converted_inequalitySets, HashSet.class))[i];
        String _code = code;
        String _name = ((NamedElement[])Conversions.unwrapArray(pair, NamedElement.class))[0].getName();
        String _plus = ("    " + _name);
        String _plus_1 = (_plus + " != ");
        String _name_1 = ((NamedElement[])Conversions.unwrapArray(pair, NamedElement.class))[1].getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + ";\n");
        code = (_code + _plus_3);
      }
    }
    return code;
  }
  
  private String writeEvaluationOperatorReferences(final RootClass rc) {
    String code = "";
    Object _eGet = rc.eGet(rc.eClass().getEStructuralFeature("EvaluationOperator"));
    final EList<EvaluationOperator> evaluationOperators = ((EList<EvaluationOperator>) _eGet);
    for (final EvaluationOperator evaluationOperator : evaluationOperators) {
      {
        final ArrayList<EvaluationFunctionalOperator> firstLevelEvaluationFunctionalOperators = Utils.collectAllEvaluationFunctionalOperators(evaluationOperator);
        for (int j = 0; (j < firstLevelEvaluationFunctionalOperators.size()); j++) {
          {
            final EvaluationFunctionalOperator o = firstLevelEvaluationFunctionalOperators.get(j);
            String _code = code;
            String _get = MQLGenerator.evaluationOperatorLib.get(o);
            String _plus = ("    find " + _get);
            String _plus_1 = (_plus + "(elem, ");
            String _get_1 = Utils.evaluationOperatorRefNames.get(o);
            String _plus_2 = (_plus_1 + _get_1);
            String _plus_3 = (_plus_2 + ");\n");
            code = (_code + _plus_3);
          }
        }
        String _code = code;
        String _writeOperator = this.writeOperator(evaluationOperator, "");
        String _plus = ("    check(" + _writeOperator);
        String _plus_1 = (_plus + ");\n");
        code = (_code + _plus_1);
      }
    }
    return code;
  }
  
  private String writeContainsPatterns() {
    String code = "";
    final Set<EClass> keys = MQLGenerator.referenceFromToLib.keySet();
    for (final EClass ec : keys) {
      {
        HashMap<EStructuralFeature, String> hashMap = MQLGenerator.referenceFromToLib.get(ec);
        final Set<EStructuralFeature> keys2 = hashMap.keySet();
        for (final EStructuralFeature ef : keys2) {
          {
            final String patternName = hashMap.get(ef);
            String _code = code;
            String _name = ec.getName();
            String _plus = ((("pattern " + patternName) + "(from:") + _name);
            String _plus_1 = (_plus + ", to:");
            EClassifier _eType = ef.getEType();
            String _name_1 = ((EClass) _eType).getEReferences().get(0).getEType().getName();
            String _plus_2 = (_plus_1 + _name_1);
            String _plus_3 = (_plus_2 + "){\n");
            code = (_code + _plus_3);
            String _code_1 = code;
            String _name_2 = ec.getName();
            String _plus_4 = ("    " + _name_2);
            String _plus_5 = (_plus_4 + ".");
            String _name_3 = ef.getName();
            String _plus_6 = (_plus_5 + _name_3);
            String _plus_7 = (_plus_6 + "(from, to);\n");
            code = (_code_1 + _plus_7);
            String _code_2 = code;
            code = (_code_2 + "}\n\n");
          }
        }
      }
    }
    return code;
  }
  
  private String writeEvaluationOperatorPatterns() {
    String code = "";
    Set<EvaluationFunctionalOperator> _keySet = MQLGenerator.evaluationOperatorLib.keySet();
    for (final EvaluationFunctionalOperator op : _keySet) {
      {
        final RootClass containingRc = Utils.getContainingRootClass(op);
        final Parameter param = Utils.getAllParameters(op).get(0);
        final String operatorLiteral = Utils.getOperatorLiteral(op);
        if ((op instanceof AggregationOperator)) {
          String _code = code;
          String _get = MQLGenerator.evaluationOperatorLib.get(op);
          String _plus = ("pattern " + _get);
          String _plus_1 = (_plus + "(elem:");
          String _name = containingRc.eClass().getName();
          String _plus_2 = (_plus_1 + _name);
          String _plus_3 = (_plus_2 + ", result:java Integer){\n");
          code = (_code + _plus_3);
          if ((op instanceof CountingAggregationOperator)) {
            Object _eGet = param.eGet(param.eClass().getEStructuralFeature("argument"));
            final Countable_ReferenceArgument arg = ((Countable_ReferenceArgument) _eGet);
            Object _eGet_1 = arg.eGet(arg.eClass().getEStructuralFeature("reference"));
            final Countable countable = ((Countable) _eGet_1);
            String countablePatternName = "";
            if ((countable instanceof AttributeEClass)) {
              countablePatternName = MQLGenerator.attrLib.get(((AttributeEClass) countable));
            } else {
              if ((countable instanceof OrGroup)) {
                String _get_1 = MQLGenerator.orGroupLib.get(((OrGroup) countable));
                String _plus_4 = (_get_1 + "_ref");
                countablePatternName = _plus_4;
              }
            }
            String _code_1 = code;
            code = (_code_1 + (((("    result == " + operatorLiteral) + " find ") + countablePatternName) + "(elem, "));
            String _code_2 = code;
            String _name_1 = ((NamedElement) countable).getName();
            String _plus_5 = (_name_1 + ");\n");
            code = (_code_2 + _plus_5);
          } else {
            if ((op instanceof CalculatingAggregationOperator)) {
              Object _eGet_2 = param.eGet(param.eClass().getEStructuralFeature("argument"));
              final Calculateable_Argument arg_1 = ((Calculateable_Argument) _eGet_2);
              String _code_3 = code;
              String _get_2 = MQLGenerator.referenceArgumentLib.get(arg_1);
              String _plus_6 = ((("    result == " + operatorLiteral) + " find ") + _get_2);
              String _plus_7 = (_plus_6 + "(elem, #);\n");
              code = (_code_3 + _plus_7);
            }
          }
          String _code_4 = code;
          code = (_code_4 + "}\n\n");
        } else {
          if ((op instanceof ClassOperator)) {
            Object _type = ((ClassOperator)op).getType();
            String typeName = ((EClass) _type).getName();
            typeName = typeName.substring(0, typeName.indexOf("_"));
            String _code_5 = code;
            String _get_3 = MQLGenerator.evaluationOperatorLib.get(op);
            String _plus_8 = ("pattern " + _get_3);
            String _plus_9 = (_plus_8 + "(elem:");
            String _name_2 = containingRc.eClass().getName();
            String _plus_10 = (_plus_9 + _name_2);
            String _plus_11 = (_plus_10 + ", result:java ");
            String _plus_12 = (_plus_11 + typeName);
            String _plus_13 = (_plus_12 + "){\n");
            code = (_code_5 + _plus_13);
            String _code_6 = code;
            String _name_3 = containingRc.eClass().getName();
            String _plus_14 = ("    " + _name_3);
            String _plus_15 = (_plus_14 + "(elem);");
            code = (_code_6 + _plus_15);
            final Object arg_2 = param.eGet(param.eClass().getEStructuralFeature("argument"));
            String argString = "";
            if ((arg_2 instanceof Calculateable_Argument)) {
              String _code_7 = code;
              String _get_4 = MQLGenerator.referenceArgumentLib.get(arg_2);
              String _plus_16 = ("    find " + _get_4);
              String _plus_17 = (_plus_16 + "(elem, ");
              String _get_5 = Utils.referenceArgumentRefNames.get(((Calculateable_Argument) arg_2));
              String _plus_18 = (_plus_17 + _get_5);
              String _plus_19 = (_plus_18 + ");\n");
              code = (_code_7 + _plus_19);
              String _code_8 = code;
              String _get_6 = Utils.referenceArgumentRefNames.get(((Calculateable_Argument) arg_2));
              String _plus_20 = ((("\tresult == eval(" + operatorLiteral) + "(") + _get_6);
              String _plus_21 = (_plus_20 + "));\n");
              code = (_code_8 + _plus_21);
            } else {
              if ((arg_2 instanceof String_PrimitiveArgument)) {
                String _code_9 = code;
                String _value = ((String_PrimitiveArgument) arg_2).getValue();
                String _plus_22 = ((("\tresult == eval(" + operatorLiteral) + "(\"") + _value);
                String _plus_23 = (_plus_22 + "\"));\n");
                code = (_code_9 + _plus_23);
              } else {
                if ((arg_2 instanceof Integer_PrimitiveArgument)) {
                  String _code_10 = code;
                  Integer _value_1 = ((Integer_PrimitiveArgument) arg_2).getValue();
                  String _plus_24 = ((("\tresult == eval(" + operatorLiteral) + "(") + _value_1);
                  String _plus_25 = (_plus_24 + "));\n");
                  code = (_code_10 + _plus_25);
                }
              }
            }
            String _code_11 = code;
            code = (_code_11 + "}\n\n");
          }
        }
      }
    }
    return code;
  }
  
  private String writeArgumentPatterns() {
    String code = "";
    Set<ReferenceArgument> _keySet = MQLGenerator.referenceArgumentLib.keySet();
    for (final ReferenceArgument arg : _keySet) {
      {
        final RootClass containingRc = Utils.getContainingRootClass(arg);
        String typeName = "Object";
        if ((arg instanceof CalculateableElement_ReferenceArgument)) {
          Object _eGet = ((CalculateableElement_ReferenceArgument)arg).eGet(((CalculateableElement_ReferenceArgument)arg).eClass().getEStructuralFeature("reference"));
          final CalculateableElement calculateableElement = ((CalculateableElement) _eGet);
          final AttributeEClass attr = ((AttributeEClass) calculateableElement);
          Object _eGet_1 = ((CalculateableElement_ReferenceArgument)arg).eGet(((CalculateableElement_ReferenceArgument)arg).eClass().getEStructuralFeature("operator"));
          final FunctionalOperator operator = ((FunctionalOperator) _eGet_1);
          if ((operator == null)) {
            Object _type = ((CalculateableElement_ReferenceArgument)arg).getType();
            typeName = ((EClass) _type).getName();
            typeName = typeName.substring(0, typeName.indexOf("_"));
            String _code = code;
            String _get = MQLGenerator.referenceArgumentLib.get(arg);
            String _plus = ("pattern " + _get);
            String _plus_1 = (_plus + "(elem:");
            String _name = containingRc.eClass().getName();
            String _plus_2 = (_plus_1 + _name);
            String _plus_3 = (_plus_2 + ", result: java ");
            String _plus_4 = (_plus_3 + typeName);
            String _plus_5 = (_plus_4 + "){\n");
            code = (_code + _plus_5);
            String _code_1 = code;
            String _get_1 = MQLGenerator.attrLib.get(attr);
            String _plus_6 = ("    find " + _get_1);
            String _plus_7 = (_plus_6 + "(elem, result);\n");
            code = (_code_1 + _plus_7);
          } else {
            Object _lastOperator = operator.getLastOperator();
            Object _type_1 = ((TypedElement) _lastOperator).getType();
            typeName = ((EClass) _type_1).getName();
            typeName = typeName.substring(0, typeName.indexOf("_"));
            String _code_2 = code;
            String _get_2 = MQLGenerator.referenceArgumentLib.get(arg);
            String _plus_8 = ("pattern " + _get_2);
            String _plus_9 = (_plus_8 + "(elem:");
            String _name_1 = containingRc.eClass().getName();
            String _plus_10 = (_plus_9 + _name_1);
            String _plus_11 = (_plus_10 + ", result: java ");
            String _plus_12 = (_plus_11 + typeName);
            String _plus_13 = (_plus_12 + "){\n");
            code = (_code_2 + _plus_13);
            final ArrayList<EvaluationFunctionalOperator> evaluationOperators = Utils.collectAllEvaluationFunctionalOperators(((Operator) operator));
            for (final EvaluationFunctionalOperator aop : evaluationOperators) {
              String _code_3 = code;
              String _get_3 = MQLGenerator.evaluationOperatorLib.get(aop);
              String _plus_14 = ("    find " + _get_3);
              String _plus_15 = (_plus_14 + "(elem, ");
              String _get_4 = Utils.evaluationOperatorRefNames.get(aop);
              String _plus_16 = (_plus_15 + _get_4);
              String _plus_17 = (_plus_16 + ");\n");
              code = (_code_3 + _plus_17);
            }
            String _code_4 = code;
            String _get_5 = MQLGenerator.attrLib.get(attr);
            String _plus_18 = ("    find " + _get_5);
            String _plus_19 = (_plus_18 + "(elem, ");
            String _name_2 = attr.getName();
            String _plus_20 = (_plus_19 + _name_2);
            String _plus_21 = (_plus_20 + ");\n");
            code = (_code_4 + _plus_21);
            String _code_5 = code;
            String _writeOperator = this.writeOperator(((Operator) operator), attr.getName());
            String _plus_22 = ("    result == eval(" + _writeOperator);
            String _plus_23 = (_plus_22 + ");\n");
            code = (_code_5 + _plus_23);
          }
          String _code_6 = code;
          code = (_code_6 + "}\n\n");
        } else {
          if ((arg instanceof Calculateable_Argument)) {
            Object _type_2 = ((Calculateable_Argument)arg).getType();
            typeName = ((EClass) _type_2).getName();
            typeName = typeName.substring(0, typeName.indexOf("_"));
            String _code_7 = code;
            String _get_6 = MQLGenerator.referenceArgumentLib.get(arg);
            String _plus_24 = ("pattern " + _get_6);
            String _plus_25 = (_plus_24 + "(elem:");
            String _name_3 = containingRc.eClass().getName();
            String _plus_26 = (_plus_25 + _name_3);
            String _plus_27 = (_plus_26 + ", result: java ");
            String _plus_28 = (_plus_27 + typeName);
            String _plus_29 = (_plus_28 + "){\n");
            code = (_code_7 + _plus_29);
            String _code_8 = code;
            String _get_7 = MQLGenerator.evaluationOperatorLib.get(arg);
            String _plus_30 = ("    find " + _get_7);
            String _plus_31 = (_plus_30 + "(elem,result);\n");
            code = (_code_8 + _plus_31);
            String _code_9 = code;
            code = (_code_9 + "}\n\n");
          }
        }
      }
    }
    return code;
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  private String generateCode(final Query query) {
    return _generateCode(query);
  }
}
