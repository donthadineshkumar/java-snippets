package com.xml;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParserEx1 {
/*
 * Reading the XML data and bindng the data to the Domain objects
 * using javax.xml.parsers.* package
 * 
 */
	public static void main(String[] args) {
		
		try {
			SAXParser parser = (SAXParserFactory.newInstance()).newSAXParser();
			ChannelHandler handler = new ChannelHandler();
			parser.parse(SaxParserEx1.class.getResourceAsStream("/Channel.xml"), handler);
			
			Channel channel = handler.getChannel();
			System.out.println("Channel name "+channel.getName());
		
			Iterator<Tutorial> it = channel.getTutorials().iterator();
			while(it.hasNext()){
				System.out.println("tutorial : " +it.next().getName());
			}
			
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
