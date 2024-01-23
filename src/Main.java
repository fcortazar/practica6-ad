import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Leer XML con DOM y try/catch");
            System.out.println("2. Leer XML con DOM y excepciones en la declaración");
            System.out.println("3. Leer XML con SAX y try/catch");
            System.out.println("4. Leer XML con SAX y excepciones en la declaración");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    leerXMLConDOMTry();
                    break;
                case 2:
                    leerXMLConDOMExcepciones();
                    break;
                case 3:
                    leerXMLConSAXTry();
                    break;
                case 4:
                    leerXMLConSAXExcepciones();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }

    private static void leerXMLConDOMTry() {
        String xmlFilePath = "F:\\Repositorios GitHub\\AD\\practica6\\src\\file.xml";
        try {
            DOMReaderWithTry.leerXMLConTry(xmlFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void leerXMLConDOMExcepciones() {
        String xmlFilePath = "F:\\Repositorios GitHub\\AD\\practica6\\src\\file.xml";
        try {
            DOMReaderWithExceptions.leerXMLConExcepciones(xmlFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void leerXMLConSAXTry() {
        String xmlFilePath = "F:\\Repositorios GitHub\\AD\\practica6\\src\\file.xml";
        try {
            SAXReaderWithTry.leerXMLConTry(xmlFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void leerXMLConSAXExcepciones() {
        String xmlFilePath = "F:\\Repositorios GitHub\\AD\\practica6\\src\\file.xml";
        try {
            SAXReaderWithExceptions.leerXMLConExcepciones(xmlFilePath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
