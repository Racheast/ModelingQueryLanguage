package util.MMGenerators.QMMGenerator;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import util.Constants;
import util.MMGenerators.QMMGenerator.QMMMetaModelBuilder.QMMMetaModelBuilder;

public class QMMGenerator {
	
	public static void generateQMM(File f) throws JETException{
		createQMM(f);
		//createGenModel();  
		//generateModelCode();  
	}
	
	private static void createQMM(File f) throws JETException {
		ResourceSet resourceSet = new ResourceSetImpl();
		//File ecoreFile = new File(Constants.DMM_ECORE_FILE_PATH);
		URI ecoreFileURI = URI.createFileURI(f.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		Resource dmmEcoreResource = resourceSet.getResource(ecoreFileURI, true);
		EPackage newPackage = (EPackage) dmmEcoreResource.getContents().get(0);
		newPackage.setName(Constants.QMM_PACKAGE_NAME);
		newPackage.setNsPrefix(Constants.QMM_PACKAGE_NS_PREFIX);
		newPackage.setNsURI(Constants.QMM_PACKAGE_NS_URI); //orig
		
		newPackage.getEClassifiers().addAll(QMMMetaModelBuilder.build(newPackage));

		// Register XML Factory implementation to handle .ecore files
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());
		
		EPackage.Registry.INSTANCE.put(newPackage.getNsURI(),	newPackage);  
		
		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createFileURI(Constants.QMM_ECORE_FILE_PATH)); 
		((XMLResource) resource).setEncoding("UTF-8");

		// Add EPackage to contents list of the resource
		resource.getContents().add(newPackage);

		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void createGenModel() {		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		File ecoreFile = new File(Constants.QMM_ECORE_FILE_PATH);
		URI ecoreFileURI = URI.createFileURI(ecoreFile.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource resource = resourceSet.getResource(ecoreFileURI, true);
		EPackage ePackage = (EPackage) resource.getContents().get(0);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());

		Resource genModelResource = Resource.Factory.Registry.INSTANCE.getFactory(Constants.QMM_GENMODEL_URI)
				.createResource(Constants.QMM_GENMODEL_URI);

		genModelResource.setURI(Constants.QMM_GENMODEL_URI); 

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();

		genModelResource.getContents().add(genModel);
		genModel.setCopyrightText("This is a copyright text.");
		genModel.setForceOverwrite(true);
		genModel.setUpdateClasspath(false);			
		genModel.setOperationReflection(true);
		genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
		genModel.setContainmentProxies(true);
		genModel.setModelDirectory("/src"); //"src"
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setModelName(Constants.QMM_PACKAGE_NAME); //"qmm" 
		genModel.initialize(Collections.singleton(ePackage));

		GenPackage genPackage = (GenPackage) genModel.getGenPackages().get(0);
		genModel.setModelName(Constants.QMM_GENMODEL_URI.trimFileExtension().lastSegment());
		genPackage.setPrefix(Constants.QMM_PACKAGE_NAME);
		genModel.setModelPluginID(Constants.QMM_PACKAGE_NAME);   //"qmm"
		try {
			genModelResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			System.out.println("Error saving file: " + e);
		}

		genModel.setCanGenerate(true);
	}
	
	private static void generateModelCode() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		
		try {
			Resource genModel_resource = resourceSet.getResource(Constants.QMM_GENMODEL_URI, true);
			genModel_resource.load(null);
			
			if (genModel_resource.getContents().size() != 1) {
				System.out.println("Resource has " + genModel_resource.getContents().size() + " loaded objects");
			} else {
				GenModel genModel = (GenModel) genModel_resource.getContents().get(0);
				GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI,
						GenModelGeneratorAdapterFactory.DESCRIPTOR);
				Generator generator = new Generator();
				genModel.setCanGenerate(true); 
				generator.setInput(genModel);
				generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
						new BasicMonitor.Printing(System.out));
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
