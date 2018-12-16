package org.xtext.ui.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.api.scope.QueryScope;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import qrmm.SearchableElement;
import qrmm.impl.QrmmPackageImpl;


public class VQLLauncher {
	
	public static Collection<SearchableElement> executeQueryPattern() throws IOException {
		System.out.println("VQLLauncher: executeQueryPattern() called... ");
		final String patternFQN = "qrmm.query";
		ArrayList<SearchableElement> queryResults = new ArrayList<SearchableElement>();
		final StringBuilder results = new StringBuilder();
		Collection<? extends IPatternMatch> matches = null;
		
		ResourceSet domainModelResourceSet = new ResourceSetImpl();
		EPackage ePackage = QrmmPackageImpl.init();
		domainModelResourceSet.getPackageRegistry().put(Constants.QRMM_NsURI, ePackage);
		domainModelResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource domainModelResource = domainModelResourceSet.createResource(URI.createFileURI(Constants.TRANSFORMED_DOMAINMODEL_PATH));
		domainModelResource.load(new HashMap<>());
		domainModelResourceSet.getResources().add(domainModelResource);

		if (domainModelResource != null) {
			try {
				// get all matches of the pattern
				AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(initializeModelScope());
				
				Pattern p = null;

				EMFPatternLanguageStandaloneSetup e = new EMFPatternLanguageStandaloneSetup();
				e.createInjectorAndDoEMFRegistration();
				// Loading pattern resource from file
				ResourceSet patternResourceSet = new ResourceSetImpl();
				patternResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
				
				URI fileURI = URI.createFileURI(Constants.VQL_QUERY_PATH);
				Resource patternResource = patternResourceSet.getResource(fileURI, true);

				if (patternResource != null) {
					System.out.println("VQLLauncher: Query Resource loaded from " + Constants.VQL_QUERY_PATH);
					if (patternResource.getErrors().size() == 0 && patternResource.getContents().size() >= 1) {
						EObject topElement = patternResource.getContents().get(0);
						if (topElement instanceof PatternModel) {
							for (Pattern _p : ((PatternModel) topElement).getPatterns()) {
								if (patternFQN.equals(CorePatternLanguageHelper.getFullyQualifiedName(_p))) {
									p = _p;
									break;
								}
							}
						}
					}
				}
				if (p == null) {
					throw new RuntimeException(String.format("Pattern %s not found", patternFQN));
				}
				//Translate patterns to query specifications
				SpecificationBuilder builder = new SpecificationBuilder();

				// attempt to retrieve a registered query specification
				ViatraQueryMatcher<? extends IPatternMatch> matcher = engine.getMatcher(builder.getOrCreateSpecification(p));

				if (matcher != null) {
					System.out.println("VQLLauncher: Retrieving all matches ... ");
					matches = matcher.getAllMatches();
					
					System.out.println("VQLLauncher: " + matches.size() + " have been found.");
					for(IPatternMatch m:matches){
						System.out.println("IPatternMatch m: " + m.toString());
						queryResults.add((SearchableElement)m.get(0));
					}
					
				}

				patternResource.unload();  
				
				// Wipe the engine. After a wipe, new patterns can be rebuilt with much less overhead than complete traversal (as the base indexes will be kept).
				engine.wipe();

				// completely dispose of the engine once's it is not needed
				engine.dispose();
				domainModelResource.unload();
			} catch (ViatraQueryException e) {
				e.printStackTrace();
				results.append(e.getMessage());
			}
		
		} else {
			results.append("Resource not found");
		}
		
		return queryResults;
	}
	
	
	private static EMFScope initializeModelScope() throws IOException, ViatraQueryException {
		ResourceSet domainModelResourceSet = new ResourceSetImpl();
		EPackage ePackage = QrmmPackageImpl.init();
		domainModelResourceSet.getPackageRegistry().put(Constants.QRMM_NsURI, ePackage);
		domainModelResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource domainModelResource = domainModelResourceSet.createResource(URI.createFileURI(Constants.TRANSFORMED_DOMAINMODEL_PATH));
		domainModelResource.load(new HashMap<>());
		domainModelResourceSet.getResources().add(domainModelResource);
		return new EMFScope(domainModelResourceSet);
	}
	
	/*
	private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	*/
}
