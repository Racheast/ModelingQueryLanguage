package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcorePackage.Literals;

import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_NegatableElements {

	static EClass createDefaultNegateableElementEClass(){
		EClass negatableElementEClass = EObjectHelper.createEClass("NegatableElement", true);
		EAttribute negated = EObjectHelper.createEAttribute("negated", EcorePackage.Literals.EBOOLEAN, 1, 1, false);
		negated.setDefaultValue(new Boolean(false));
		negatableElementEClass.getEStructuralFeatures().add(negated);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("NegatableElement", negatableElementEClass);
		return negatableElementEClass;
	}

}
