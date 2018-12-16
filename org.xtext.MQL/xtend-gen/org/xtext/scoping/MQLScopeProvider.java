package org.xtext.scoping;

import java.util.ArrayList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.scoping.AbstractMQLScopeProvider;
import qmm.CalculateableElement_ReferenceArgument;
import qmm.Count_AggregationOperator;
import qmm.QmmPackage;
import qmm.RootClass;

@SuppressWarnings("all")
public class MQLScopeProvider extends AbstractMQLScopeProvider implements IScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if ((context instanceof CalculateableElement_ReferenceArgument)) {
      final RootClass containingRootClass = EcoreUtil2.<RootClass>getContainerOfType(context, RootClass.class);
      final EList<EObject> candidates = this.getDirectContentsOfType(containingRootClass, ((CalculateableElement_ReferenceArgument)context).eClass().getEStructuralFeature("reference").getEType());
      return Scopes.scopeFor(candidates);
    } else {
      if ((context instanceof Count_AggregationOperator)) {
        final RootClass containingRootClass_1 = EcoreUtil2.<RootClass>getContainerOfType(context, RootClass.class);
        final EList<EObject> candidates_1 = this.getDirectContentsOfType(containingRootClass_1, QmmPackage.eINSTANCE.getCountable());
        return Scopes.scopeFor(candidates_1);
      }
    }
    return super.getScope(context, reference);
  }
  
  private EList<EObject> getDirectContentsOfType(final EObject eo, final EClassifier type) {
    ArrayList<EObject> contents = new ArrayList<EObject>();
    EList<EObject> _eContents = eo.eContents();
    for (final EObject eo2 : _eContents) {
      boolean _isInstance = type.isInstance(eo2);
      if (_isInstance) {
        contents.add(eo2);
      }
    }
    return ECollections.<EObject>asEList(contents);
  }
}
