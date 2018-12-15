package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcorePackage.Literals;

import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_NamedElements {

	static EClass createDefaultNamedElementEClass(){
		EClass namedElementEClass = EObjectHelper.createEClass("NamedElement", true);
		EAttribute variableName = EObjectHelper.createEAttribute("name", EcorePackage.Literals.ESTRING, 1, 1, true);
		variableName.setLowerBound(1);
		variableName.setUpperBound(1);
		namedElementEClass.getEStructuralFeatures().add(variableName);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("NamedElement", namedElementEClass);
		return namedElementEClass;
	}

}
