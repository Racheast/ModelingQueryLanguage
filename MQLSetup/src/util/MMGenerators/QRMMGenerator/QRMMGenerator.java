package util.MMGenerators.QRMMGenerator;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import util.Constants;

public class QRMMGenerator {

	public static void generateQRMM(File f) throws JETException {
		buildQRMM(f);
		// createGenModel();
		// generateModelCode();
	}

	private static void buildQRMM(File f) throws JETException {
		ResourceSet resourceSet = new ResourceSetImpl();
		//File ecoreFile = new File(Constants.DMM_ECORE_FILE_PATH);
		URI ecoreFileURI = URI.createFileURI(f.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		Resource qmmEcoreResource = resourceSet.getResource(ecoreFileURI, true);
		EPackage newPackage = (EPackage) qmmEcoreResource.getContents().get(0);
		newPackage.setName(Constants.QRMM_PACKAGE_NAME);
		newPackage.setNsPrefix(Constants.QRMM_PACKAGE_NS_PREFIX);
		newPackage.setNsURI(Constants.QRMM_PACKAGE_NS_URI);

		EcoreFactory coreFactory = EcoreFactory.eINSTANCE;

		EClass searchableEClass = coreFactory.createEClass();
		searchableEClass.setName("SearchableElement");
		searchableEClass.setAbstract(true);

		TreeIterator<EObject> iter = newPackage.eAllContents();

		while (iter.hasNext()) {
			EObject eo = iter.next();
			if (eo instanceof EClass) {
				EClass ec = (EClass) eo;
				EList<EClass> allSuperTypes = ec.getEAllSuperTypes();
				if (!allSuperTypes.contains(searchableEClass))
					ec.getESuperTypes().add(searchableEClass);

			} else if (eo instanceof EReference) {
				((EReference) eo).setLowerBound(0);
			} else if (eo instanceof EAttribute) {
				((EAttribute) eo).setLowerBound(0);
			}

		}

		newPackage.getEClassifiers().add(searchableEClass);

		// Register XML Factory implementation to handle .ecore files
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());

		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createFileURI(Constants.QRMM_ECORE_FILE_PATH));
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
		File ecoreFile = new File(Constants.QRMM_ECORE_FILE_PATH);
		URI ecoreFileURI = URI.createFileURI(ecoreFile.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		Resource resource = resourceSet.getResource(ecoreFileURI, true);
		EPackage ePackage = (EPackage) resource.getContents().get(0);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());

		Resource genModelResource = Resource.Factory.Registry.INSTANCE.getFactory(Constants.QRMM_GENMODEL_URI)
				.createResource(Constants.QRMM_GENMODEL_URI);

		genModelResource.setURI(Constants.QRMM_GENMODEL_URI); 

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();

		genModelResource.getContents().add(genModel);
		genModel.setCopyrightText("This is a copyright text.");
		genModel.setForceOverwrite(true);
		genModel.setUpdateClasspath(true);
		genModel.setOperationReflection(true);
		genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
		genModel.setContainmentProxies(true);
		genModel.setModelDirectory("/src");
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setModelName(Constants.QRMM_PACKAGE_NAME); 
		genModel.initialize(Collections.singleton(ePackage));
		
		GenPackage genPackage = (GenPackage) genModel.getGenPackages().get(0);
		genModel.setModelName(Constants.QRMM_GENMODEL_URI.trimFileExtension().lastSegment());
		genPackage.setPrefix(Constants.QRMM_PACKAGE_NAME);
		genModel.setModelPluginID(Constants.QRMM_PACKAGE_NAME);

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
			Resource genModel_resource = resourceSet.getResource(Constants.QRMM_GENMODEL_URI, true);
			genModel_resource.load(null);

			if (genModel_resource.getContents().size() != 1) {
				System.out.println("Resource has " + genModel_resource.getContents().size() + " loaded objects");
			} else {
				GenModel genModel = (GenModel) genModel_resource.getContents().get(0);
				GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI,
						GenModelGeneratorAdapterFactory.DESCRIPTOR);
				Generator generator = new Generator();
				generator.setInput(genModel);
				genModel.setCanGenerate(true);
				generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
						new BasicMonitor.Printing(System.out));

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
