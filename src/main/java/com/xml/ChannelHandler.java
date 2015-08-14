package com.xml;



import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ChannelHandler extends DefaultHandler{

	private Channel channel =null;
	private Tutorial tutorial = null;
	private boolean isTutorialElement = false;
	
	public Channel getChannel(){
		return channel;
	}
	
	@Override
	public void startDocument() throws SAXException {
		channel = new Channel();		
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if(qName.equals("channel")){
			channel.setName(attributes.getValue("name"));
		}else if(qName.equals("tutorial")){
			tutorial= new Tutorial();
			isTutorialElement = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(isTutorialElement){
			String tutorialName = new String(ch,start,length).trim();
			if(tutorialName.length() != 0) {  tutorial.setName(tutorialName);  }
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("tutorial")){
			channel.addTutorial(tutorial);
		}
	}


}
