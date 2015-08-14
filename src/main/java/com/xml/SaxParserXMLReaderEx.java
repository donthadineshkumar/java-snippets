package com.xml;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class SaxParserXMLReaderEx {

	public static void main(String[] args) {
		
		try {
			XMLReader reader = (SAXParserFactory.newInstance()).newSAXParser().getXMLReader();
			ChannelHandler handler = new ChannelHandler();
			reader.setContentHandler(handler);
			
			reader.parse(new InputSource(SaxParserXMLReaderEx.class.getResourceAsStream("/Channel.xml")));
			Channel channel = handler.getChannel();
			System.out.println("Channel name "+channel.getName());
		
			Iterator<Tutorial> it = channel.getTutorials().iterator();
			while(it.hasNext()){
				System.out.println("tutorial : " +it.next().getName());
			}
			
		
		} catch (SAXException | ParserConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
