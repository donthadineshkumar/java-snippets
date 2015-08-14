package com.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * Extends a DefaultHandler - which has some conveneince methods
 * 
 */
public class PersonSAXHandler extends DefaultHandler{

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start document");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("End document");
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("end Element"+qName);
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println("start element");
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.println("characters "+length);
	}
	
	
		
}
