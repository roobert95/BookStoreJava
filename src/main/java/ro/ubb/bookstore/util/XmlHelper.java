package main.java.ro.ubb.bookstore.util;

import java.io.File;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
  * Created by Bianca on 20/03/2016.
  */

class XmlHelper {
    static Document loadDocument(String fileName) {
        File inputFile = new File(fileName);
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = null;
        try {
            doc = docBuilder != null ? docBuilder.parse(inputFile) : null;
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    static void saveDocument(String fileName, Document document) {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;

        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }

        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(fileName));

        try {
            if (transformer != null) {
                transformer.transform(source, result);
            }
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}