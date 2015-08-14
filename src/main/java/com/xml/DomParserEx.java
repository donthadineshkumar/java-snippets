package com.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserEx {
	public static void main(String[] args) {
		/*
		 * any class with newInstance() or getInstance() methods are abstract
		 * classes
		 */
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//Document doc =builder.parse("Person.xml");
			// / means the root - in maven, its the src/main/resources
			Document doc =builder.parse(DomParserEx.class.getResourceAsStream("/Person.xml"));
			NodeList personList =doc.getElementsByTagName("Person");
			
			for(int i=0; i< personList.getLength(); i++){
				Node p = personList.item(i);
				if(p.getNodeType() == Node.ELEMENT_NODE){
					Element person = (Element) p;
					String att = person.getAttribute("id");
					NodeList nameList = person.getChildNodes();
					for(int j=0; j< nameList.getLength(); j++){
						Node n= nameList.item(j);
						if(n.getNodeType()==Node.ELEMENT_NODE){
							Element name = (Element) n;
							System.out.println("Person "+ att + " : "+ name.getTagName()
									+"="+name.getTextContent());
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
