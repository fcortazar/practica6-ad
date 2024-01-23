import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXReaderWithTry extends DefaultHandler {
    public static void main(String[] args) {
        String xmlFilePath = "ejemplo.xml";
        try {
            leerXMLConTry(xmlFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerXMLConTry(String filePath) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXReaderWithTry handler = new SAXReaderWithTry();
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
