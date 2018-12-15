package org.xtext.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import qmm.RootClass
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScopeProvider
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.ECollections
import org.eclipse.emf.ecore.EClassifier
import qmm.QmmPackage
import qmm.CalculateableElement_ReferenceArgument
import qmm.Count_AggregationOperator

class MQLScopeProvider extends AbstractMQLScopeProvider implements IScopeProvider {
	override getScope(EObject context, EReference reference) {
		if (context instanceof CalculateableElement_ReferenceArgument) {
			val containingRootClass = EcoreUtil2.getContainerOfType(context, RootClass);
			val candidates = getDirectContentsOfType(containingRootClass,context.eClass.getEStructuralFeature("reference").EType)
			return Scopes.scopeFor(candidates)
		} else if (context instanceof Count_AggregationOperator) {
			val containingRootClass = EcoreUtil2.getContainerOfType(context, RootClass);
			val candidates = getDirectContentsOfType(containingRootClass, QmmPackage.eINSTANCE.countable)
			return Scopes.scopeFor(candidates)
		}
		return super.getScope(context, reference);
	}
	
	private def EList<EObject> getDirectContentsOfType(EObject eo, EClassifier type){
		var contents = new ArrayList<EObject>();
		for(EObject eo2 : eo.eContents){
			if(type.isInstance(eo2)) contents.add(eo2);
		}
		return ECollections.asEList(contents);
	}
	
}
