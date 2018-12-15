package util;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;

public class Constants {
	/* WORKSPACE CONSTANTS */	
	public final static String WORKSPACE_PATH = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().toString()).replace("\\", "/");
	public final static String FUNCTIONAL_OPERATORS_PATH = WORKSPACE_PATH + "/src/util/MMGenerators/QMMGenerator/FunctionalOperators.csv";
	public final static String TYPE_HIERARCHY_PATH = WORKSPACE_PATH + "/src/util/MMGenerators/QMMGenerator/TypeHierarchy.csv";

	
	/* DMM CONSTANTS */
	public final static String DMM_NAME = "DMM";
	public final static String DMM_PACKAGE_NAME = DMM_NAME.toLowerCase();
	public final static String DMM_PACKAGE_NS_PREFIX = DMM_NAME.toLowerCase();
	public final static String DMM_ECORE_FILE_PATH = WORKSPACE_PATH + "/model/" + DMM_NAME + ".ecore";  
	public final static URI DMM_GENMODEL_URI = URI.createFileURI(WORKSPACE_PATH + "/model/" + DMM_NAME + ".genmodel");  
	public final static String DMM_MODEL_PLUGIN_ID = DMM_NAME; 
	public final static String DMM_PACKAGE_NS_URI = "/MQLSetup/model/" + DMM_NAME + ".ecore";
	
	/* QMM CONSTANTS */
	public final static String QMM_NAME = "QMM";
	public final static String QMM_ECORE_FILE_PATH = WORKSPACE_PATH + "/../QMM/model/" + QMM_NAME + ".ecore";
	public final static URI QMM_GENMODEL_URI =  URI.createFileURI(WORKSPACE_PATH + "/model/" + QMM_NAME + ".genmodel");
	public final static String QMM_PACKAGE_NAME = QMM_NAME.toLowerCase();
	public final static String QMM_PACKAGE_NS_PREFIX = QMM_NAME.toLowerCase();
	public final static String QMM_PACKAGE_NS_URI = "/" + QMM_NAME + "/model/" + QMM_NAME + ".ecore";
	
	/* QRMM CONSTANTS */
	public final static String QRMM_NAME = "QRMM";
	public final static String QRMM_ECORE_FILE_PATH = WORKSPACE_PATH + "/../QRMM/model/" + QRMM_NAME + ".ecore";
	public final static URI QRMM_GENMODEL_URI =  URI.createFileURI(WORKSPACE_PATH + "/model/" + QRMM_NAME + ".genmodel");
	public final static String QRMM_PACKAGE_NAME = QRMM_NAME.toLowerCase();
	public final static String QRMM_PACKAGE_NS_PREFIX = QRMM_NAME.toLowerCase();
	public final static String QRMM_PACKAGE_NS_URI = "/" + QRMM_NAME + "/model/" + QRMM_NAME + ".ecore";
	
	/* org.xtext.MQL.ui */
	public final static String ORG_XTEXT_MQL_UI_WORKSPACE_PATH = WORKSPACE_PATH + "/../org.xtext.MQL.ui";
	public final static String ATL_TRANSFORMATION_DIR_PATH = ORG_XTEXT_MQL_UI_WORKSPACE_PATH + "/../transformation/"; 
	public final static String ATL_TRANSFORMATION_MODULE_NAME = DMM_NAME + "2" + QRMM_NAME;
	public final static String ATL_TRANSFORMATION_FILE_PATH = ATL_TRANSFORMATION_DIR_PATH + ATL_TRANSFORMATION_MODULE_NAME + ".atl";
	
	
}

