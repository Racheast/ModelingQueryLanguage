package util.MMGenerators.QMMGenerator.QMMMetaModelBuilder;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import util.MMGenerators.QMMGenerator.EObjectHelper;

public class QMMMetaModelBuilder_Queries {

	static ArrayList<EClass> createDefaultQueryEClasses(){
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		EClass query = EObjectHelper.createEClass("Query", true);
		EClass findQuery = EObjectHelper.createEClass("FindQuery", false);
		findQuery.getESuperTypes().add(query);
		EReference rootClassERef = EObjectHelper.createEReference("where", QMMMetaModelBuilder_Collections.defaultEClasses.get("RootClass"), 1, -1, true);
		findQuery.getEStructuralFeatures().add(rootClassERef);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("Query", query);
		QMMMetaModelBuilder_Collections.defaultEClasses.put("FindQuery", findQuery);
		eClasses.add(query);
		eClasses.add(findQuery);
		return eClasses;
	}

}
