package com.sachin.domparser;

import java.io.IOException;

import javax.swing.text.html.parser.DocumentParser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import jdk.internal.org.xml.sax.SAXException;

public class Test {

	public static void main(String[] args) throws ParserConfigurationException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document document = builder.parse("emp.xml");
			Element element = document.getDocumentElement();
			System.out.println(element.getNodeName());
			NodeList list = element.getChildNodes();
			for(int i=0;i<list.getLength();i++) {
				Node node = list.item(i);
				if(node.getNodeType()==node.ELEMENT_NODE) //to avoid spaces present in xml file
				System.out.println(node.getNodeName()+"-->"+node.getNodeValue());
			}
		} catch (org.xml.sax.SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
