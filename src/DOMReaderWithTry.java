import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMReaderWithTry {
    public static void main(String[] args) {
        String xmlFilePath = "ejemplo.xml";

        try {
            leerXMLConTry(xmlFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void leerXMLConTry(String filePath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(filePath));

        document.getDocumentElement().normalize();

        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Elemento: " + element.getNodeName());
                System.out.println("Contenido: " + element.getTextContent());
            }
        }
    }
}
