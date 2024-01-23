import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXReaderWithExceptions extends DefaultHandler {
    public static void main(String[] args) {
        String xmlFilePath = "ejemplo.xml";
        try {
            leerXMLConExcepciones(xmlFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerXMLConExcepciones(String filePath) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXReaderWithExceptions handler = new SAXReaderWithExceptions();
        parser.parse(new File(filePath), handler);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Elemento: " + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Contenido: " + new String(ch, start, length));
    }
}
