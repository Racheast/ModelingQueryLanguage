package org.xtext.ui.util;

import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/*  //removed emftvm plugin dependency
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
*/
/**
 * ATLLauncher based on:
 * An off-the-shelf launcher for ATL/EMFTVM transformations
 * @author Victor Guana - guana@ualberta.ca
 * University of Alberta - SSRG Lab.
 * Edmonton, Alberta. Canada
 * Using code examples from: https://wiki.eclipse.org/ATL/EMFTVM
 */
public class ATLLauncher {
	private static final String inputMetamodelNsURI = Constants.DMM_NsURI;
	private static final String outputMetamodelNsURI = Constants.QRMM_NsURI;
	
	public static void launch(String inModelPath){		
		System.out.println("ATLLauncher: Transforming " + inModelPath + " to a QRMM model... ");
		/*
		lazyMetamodelRegistration(Constants.DMM_PATH);
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();
		 */
		
		/* Victor Guana:
		 * Load meta-models in the resource set we just created, the idea here is to make the meta-models
		 * available in the context of the execution environment, the ResourceSet is later passed to the
		 * ModuleResolver that is the actual class that will run the transformation.
		 * Notice that we use the nsUris to locate the metamodels in the package registry, we initialize them 
		 * from Ecore files that we registered lazily as shown below in e.g. registerInputMetamodel(...) 
		 */
		
		/*
		Metamodel inMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		inMetamodel.setResource(rs.getResource(URI.createURI(inputMetamodelNsURI), true));
		env.registerMetaModel(Constants.DMM_NAME, inMetamodel);
		
		Metamodel outMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		outMetamodel.setResource(rs.getResource(URI.createURI(outputMetamodelNsURI), true));
		env.registerMetaModel(Constants.QRMM_NAME, outMetamodel);
		*/
		
		/* Victor Guana:
		 * Create and register resource factories to read/parse .xmi and .emftvm files,
		 * we need an .xmi parser because our in/output models are .xmi and our transformations are
		 * compiled using the ATL-EMFTV compiler that generates .emftvm files
		 */
		
		/*
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
		
		// Load models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createFileURI(inModelPath), true));
		env.registerInputModel("IN", inModel);
		
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(Constants.TRANSFORMED_DOMAINMODEL_PATH)));
		env.registerOutputModel("OUT", outModel);
		*/
		
		/* Victor Guana:
		 * Load and run the transformation module
		 * Point at the directory your transformations are stored, the ModuleResolver will 
		 * look for the .emftvm file corresponding to the module you want to load and run
		 */
		
		/*
		ModuleResolver mr = new DefaultModuleResolver("file:///" + Constants.ATL_TRANSFORMATION_DIR_PATH, rs);
		TimingData td = new TimingData();
		env.loadModule(mr, Constants.ATL_TRANSFORMATION_MODULE_NAME);
		td.finishLoading();
		env.run(td);
		td.finish();
			
		// Save models
		try {
			System.out.println("ATLLauncher: Saving to " + Constants.TRANSFORMED_DOMAINMODEL_PATH + " ... ");
			outModel.getResource().save(Collections.emptyMap());
			System.out.println("ATLLauncher: " + Constants.TRANSFORMED_DOMAINMODEL_PATH + " saved.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	
	}
	
	/* Victor Guana:	
	 * I seriously hate relying on the eclipse facilities, and if you're not building an eclipse plugin
	 * you can't rely on eclipse's registry (let's say you're building a stand-alone tool that needs to run ATL
	 * transformation, you need to 'manually' register your metamodels) 
	 * This method does two things, it initializes an Ecore parser and then programmatically looks for
	 * the package definition on it, obtains the NsUri and registers it.
	 */
	private static String lazyMetamodelRegistration(String metamodelPath){   	
	    ResourceSet rs = new ResourceSetImpl();
	    final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
	    rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);	    
	    Resource r = rs.getResource(URI.createFileURI(metamodelPath), true);
	    EObject eObject = r.getContents().get(0);
	    
	    if (eObject instanceof EPackage) {
	    	EPackage p = (EPackage)eObject;
	        EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
	        return p.getNsURI();
	    }
	    
	    return null;
	}
	
}
