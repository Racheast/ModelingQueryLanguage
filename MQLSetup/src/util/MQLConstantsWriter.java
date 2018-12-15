package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class MQLConstantsWriter {
	public static void writeConstantsFile(File f){
		String code	=	"package org.xtext.ui.util;"
					+	"\nimport org.eclipse.core.resources.ResourcesPlugin;"
					+	"\n"
					+	"\n/**This class was automatically generated by the MQLSetup**/"
					+	"\npublic class Constants{"
					+	"\n		/* WORKSPACE CONSTANT */"
					+	"\n		public final static String WORKSPACE_PATH = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().toString()).replace(\"\\\\\", \"/\") + \"/../../org.xtext.MQL.ui\";"	
					+	"\n"
					+	"\n		/* DMM CONSTANTS */"
					+	"\n		public final static String DMM_NsPrefix=\"" + getNsPrefix(f) + "\";"
					+	"\n		public final static String DMM_NAME = \"DMM\";"
					+	"\n		public final static String DMM_NsURI = \"/MQLSetup/model/\" + DMM_NAME + \".ecore\";"
					+	"\n		public final static String DMM_PATH = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().toString()).replace(\"\\\\\", \"/\") + \"/../..\" + DMM_NsURI;"
					+	"\n"
					+	"\n		/* QMM CONSTANTS */"
					+	"\n		public final static String QMM_NAME = \"QMM\";"
					+	"\n		public final static String QMM_NsURI = \"/\" + QMM_NAME + \"/model/\" + QMM_NAME + \".ecore\";"
					+	"\n"
					+	"\n		/* QRMM CONSTANTS */"
					+	"\n		public final static String QRMM_NAME = \"QRMM\";"
					+	"\n		public final static String QRMM_NsURI = \"/\" + QRMM_NAME + \"/model/\" + QRMM_NAME + \".ecore\";"
					+	"\n"
					+	"\n		/* ATL CONSTANTS */"
					+	"\n		public final static String ATL_TRANSFORMATION_DIR_PATH = WORKSPACE_PATH + \"/transformation/\";" 
					+	"\n		public final static String ATL_TRANSFORMATION_MODULE_NAME = DMM_NAME + \"2\" + QRMM_NAME;"
					+	"\n		public final static String TRANSFORMED_DOMAINMODEL_PATH = ATL_TRANSFORMATION_DIR_PATH + \"transformedDomainModel.xmi\";"
					+	"\n"
					+	"\n		/* VQL CONSTANT */"
					+	"\n		public final static String VQL_QUERY_PATH = WORKSPACE_PATH + \"/runtime/MQLRuntime/src-gen/Query.vql\";"
					+	"\n}";
		
		writeFile(code);
	}
	
	private static String getNsPrefix(File f){
		ResourceSet resourceSet = new ResourceSetImpl();
		URI ecoreFileURI = URI.createFileURI(f.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource originalEcoreResource = resourceSet.getResource(ecoreFileURI, true);
		EPackage dmmPackage = (EPackage) originalEcoreResource.getContents().get(0);
		return dmmPackage.getNsPrefix();
	}
	
	private static void writeFile(String code){
		//String filepath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().toString() + "/../org.xtext.MQL.ui/src/org/xtext/ui/util/Constants.java").replace("\\", "/");
		String filepath = Constants.ORG_XTEXT_MQL_UI_WORKSPACE_PATH + "/src/org/xtext/ui/util/Constants.java";
		File file = new File(filepath);
	    try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file); 
		    writer.write(code);
		    writer.flush();
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
