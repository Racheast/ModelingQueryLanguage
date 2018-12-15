package org.xtext.ui.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import qrmm.QrmmFactory;

public class DomainModelTransformer {
	
	public static void launch(String inModelPath) throws SAXException, IOException, ParserConfigurationException, TransformerException{
	//public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, TransformerException{
		//only for testing
		//final String inModelPath = "C:/Users/a_2th/repositories/mql/master_thesis/implementation/Domainmodels/007_1_PPU_CAEX300_simplified_MANIPULATED.xmi";
		System.out.println("DomainModelTransformer: Transforming " + inModelPath + " to a QRMM model... ");
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document document = docBuilder.parse(new File(inModelPath));
		
		final String qrmmPrefix = "qrmm";
		
		NodeList nodeList = document.getElementsByTagName("*");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				if(node.getNodeName().startsWith(Constants.DMM_NsPrefix + ":")){
					String newName = qrmmPrefix + ":" + node.getNodeName().substring(node.getNodeName().indexOf(':') + 1);
					document.renameNode(node, "", newName);
				}
				NamedNodeMap attributes = node.getAttributes();
				Node a = attributes.getNamedItem("xmlns:" + Constants.DMM_NsPrefix);
				if(a!=null){ 
					a.setNodeValue(Constants.QRMM_NsURI);
					document.renameNode(a, null, "xmlns:" + qrmmPrefix);
				}
				
				Node xsitype = attributes.getNamedItem("xsi:type");
				if(xsitype != null){
					if(xsitype.getNodeValue().startsWith(Constants.DMM_NsPrefix + ":")){
						String newValue = qrmmPrefix + ":" + xsitype.getNodeValue().substring(xsitype.getNodeValue().indexOf(':') + 1);
						xsitype.setNodeValue(newValue);
					}
				}
				
			}
		}
		saveDoc(document);
	}
	
	private static void saveDoc(Document doc){
		try {
			System.out.println("DomainModelTransformer: Saving to " + Constants.TRANSFORMED_DOMAINMODEL_PATH + " ... ");
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			Result output = new StreamResult(new File(Constants.TRANSFORMED_DOMAINMODEL_PATH));
			Source input = new DOMSource(doc);
			transformer.transform(input, output);
			System.out.println("DomainModelTransformer: " + Constants.TRANSFORMED_DOMAINMODEL_PATH + " saved.");
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
