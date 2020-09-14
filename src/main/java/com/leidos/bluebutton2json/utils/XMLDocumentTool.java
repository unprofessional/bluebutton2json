package com.leidos.bluebutton2json.utils;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLDocumentTool {

    public static Writer getWriterForDocument(String cdaXml) throws TransformerException, ParserConfigurationException,
            FileNotFoundException, SAXException, IOException {

        // BEGIN PARSING XML STRING AND REMOVE PROBLEMATIC SECTIONS
        // (mixed content XML is simply not supported by Jackson)
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
        InputStream targetStream = new ByteArrayInputStream(cdaXml.getBytes());
        Document doc = documentBuilder.parse(targetStream);
        NodeList documentRootNodeList = doc.getElementsByTagName("section");
        for(Node sectionNode : iterable(documentRootNodeList)) {
            if(sectionNode.getNodeType() == Node.ELEMENT_NODE) {
                Element sectionElement = (Element) sectionNode;
                NodeList textNodeList = sectionElement.getElementsByTagName("text");
                for(Node textNode : iterable(textNodeList)) {

                    /** 
                     * Somewhat Easy:
                     * We have to find some way to read each ELEMENT here and
                     * pick up the ATTRIBUTE VALUE for attribute "ID"
                     * 
                     * Somewhat Hard:
                     * then we need to store it somewhere and scan the entire document for
                     * that variable reference and replace it when found...
                     * 
                     * examples:
                     * <td ID="FUNC1">Functional Assessment</td>
                     * <text><reference value="#FUNC1" /></text>
                    */

                    if(textNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element textElement = (Element) textNode;
                        textElement.getParentNode().removeChild(textElement);
                    }
                }
            }
        }
        doc.normalize();
        Writer writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        return writer;
        
    }

    private static Iterable<Node> iterable(final NodeList nodeList) {
        return () -> new Iterator<Node>() {
    
            private int index = 0;
    
            @Override
            public boolean hasNext() {
                return index < nodeList.getLength();
            }
    
            @Override
            public Node next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                return nodeList.item(index++); 
            }
        };
    }
    
}