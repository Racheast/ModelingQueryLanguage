package org.xtext.ui.util;

import java.io.File;
import java.io.IOException;
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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomainModelTransformer {
	
	public static void launch(String inModelPath) throws SAXException, IOException, ParserConfigurationException, TransformerException{
		System.out.println("DomainModelTransformer: Transforming " + inModelPath + " to a QRMM model... ");
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		docBuilderFactory.setNamespaceAware(true);
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document document = docBuilder.parse(new File(inModelPath));		
		NodeList nodeList = document.getElementsByTagName("*");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element)node;
				
				if(element.getNodeName().startsWith(Constants.DMM_NsPrefix + ":")){
					String newName = Constants.QRMM_NAME.toLowerCase() + ":" + element.getNodeName().substring(element.getNodeName().indexOf(':') + 1);
					document.renameNode(element, "", newName);
				}
								
				NamedNodeMap attributes = element.getAttributes();
					
				Node xmlns = attributes.getNamedItem("xmlns:" + Constants.DMM_NsPrefix);
				if(xmlns!=null){ 
					xmlns.setNodeValue(Constants.QRMM_NsURI);
					element.removeAttribute("xmlns:" + Constants.DMM_NsPrefix);
					element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + Constants.QRMM_NAME.toLowerCase(), Constants.QRMM_NsURI);
				}
				
				Node xsitype = attributes.getNamedItem("xsi:type");
				if(xsitype != null){
					if(xsitype.getNodeValue().startsWith(Constants.DMM_NsPrefix + ":")){
						String newValue = Constants.QRMM_NAME.toLowerCase() + ":" + xsitype.getNodeValue().substring(xsitype.getNodeValue().indexOf(':') + 1);
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
