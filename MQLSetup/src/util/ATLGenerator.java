package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class ATLGenerator {
	public static void writeATLFile() {
		String code = writeHeader();
		
		Resource ecoreResource = getEcoreResource(Constants.DMM_ECORE_FILE_PATH);
		
		code += "\n" + "\n";
		
		code += writeRules(ecoreResource);
		
		String filepath = Constants.ATL_TRANSFORMATION_FILE_PATH;
		
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
	
	private static String writeHeader(){
		String header = "-- @atlcompiler emftvm" + "\n";
		header += "-- @path " + Constants.DMM_NAME + "=" + "/MQLSetup/model/" + Constants.DMM_NAME + ".ecore" + "\n";
		header += "-- @path " + Constants.QRMM_NAME + "=" + "/" + Constants.QRMM_NAME + "/model/" + Constants.QRMM_NAME + ".ecore" + "\n";
		header += "\n";
		header += "module " + Constants.ATL_TRANSFORMATION_MODULE_NAME + ";" + "\n";
		header += "create OUT : " + Constants.QRMM_NAME + " from IN : " + Constants.DMM_NAME + ";";
		return header;
	}
	
	private static String writeRules(Resource ecoreResource){
		String code ="";
		String tab = "    ";
		EPackage ePackage = (EPackage) ecoreResource.getContents().get(0);
		TreeIterator<EObject> iter = ePackage.eAllContents();

		while (iter.hasNext()) {
			EObject eo = iter.next();
			if (eo instanceof EClass){
				EClass ec = (EClass)eo;
				
				if(ec.getESuperTypes().size() > 0){
					code += "-- @extends ";
					
					Iterator<EClass> iter2 = ec.getESuperTypes().iterator();
					while(iter2.hasNext()){
						EClass eSuperType = iter2.next();
						code += eSuperType.getName() + "2" + eSuperType.getName();
						if(iter2.hasNext()) code += ",";
					}
				}
				
				code += "\n";
				if(ec.isAbstract())
					code += "abstract ";
				
				code += "rule " + ec.getName() + "2" + ec.getName() + "{" + "\n";
				code += tab + "from" + "\n";
				code += tab + tab + "s : " + Constants.DMM_NAME + "!" + ec.getName() + "\n";
				code += tab + "to" + "\n";
				code += tab + tab + "t : " + Constants.QRMM_NAME + "!" + ec.getName() + "(" + "\n";
				String ruleContent = writeRuleContent(ec);
				if(ruleContent.length() >= 2)
					ruleContent = ruleContent.substring(0, ruleContent.length() - 2); //removing the comma after the last EReference- or EAttribute-Transformation-Rule
				code += ruleContent + "\n";
				code += tab + tab + ")" + "\n";
				code += "}" + "\n" + "\n";
			} 
		}
		return code;
	}
	
	private static String writeRuleContent(EClass ec){
		String code = "";
		String tab = "    ";
		
		TreeIterator<EObject> iter = ec.eAllContents();
		
		while (iter.hasNext()) {
			EObject eo = iter.next();
			if (eo instanceof EReference) {
				EReference er = (EReference)eo;
				if(!er.isContainer()){  
					code += tab + tab + tab + er.getName() + " <- s." + er.getName() + "," + "\n";
				}
			} else if (eo instanceof EAttribute) {
				EAttribute ea = (EAttribute)eo;
				code += tab + tab + tab + ea.getName() + " <- s." + ea.getName() + "," + "\n";
			}/* else if (eo instanceof EAnnotation){
				EAnnotation ean = (EAnnotation)eo;				
				code += tab + tab + tab + ean.getName() + " <- s." + ean.getName() + writeComma(iter) + "\n";
				
			} */
			
		}
		return code;
	}
	
	private static Resource getEcoreResource(String ecoreFilePath){
		ResourceSet resourceSet = new ResourceSetImpl();
		File ecoreFile = new File(ecoreFilePath);
		URI ecoreFileURI = URI.createFileURI(ecoreFile.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource ecoreResource = resourceSet.getResource(ecoreFileURI, true);
		return ecoreResource;
	}
	
}
