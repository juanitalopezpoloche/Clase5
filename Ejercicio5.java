import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {
    /*
        LinkedList es una implementación de una lista doblemente enlazada en la que cada elemento (nodo) tiene referencias al siguiente y al anterior.
        Es eficiente para operaciones de inserción y eliminación en cualquier posición, pero el acceso a elementos por índice es más lento que en un ArrayList.
    */
    private static Queue<String> colaDocumentos = new LinkedList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\n===== Gestión de Cola de Documentos =====");
            System.out.println("1. Agregar documento a la cola");
            System.out.println("2. Eliminar documento actual (en impresión)");
            System.out.println("3. Mostrar todos los documentos en la cola");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del documento: ");
                    String documento = scanner.nextLine();
                    agregarDocumento(documento);
                    break;

                case 2:
                    eliminarDocumentoActual();
                    break;

                case 3:
                    mostrarDocumentos();
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }

        } while (opcion != 4);

        scanner.close();
        
    }

    public static void agregarDocumento(String documento) {

        colaDocumentos.add(documento);
        System.out.println("Documento agregado a la cola: " + documento);

    }

    public static void eliminarDocumentoActual() {

        if (!colaDocumentos.isEmpty()) {

            String documentoEliminado = colaDocumentos.poll();
            System.out.println("Documento eliminado (en impresión): " + documentoEliminado);

        } else {

            System.out.println("No hay documentos en la cola para eliminar.");

        }

    }

    public static void mostrarDocumentos() {

        if (colaDocumentos.isEmpty()) {

            System.out.println("\nNo hay documentos en la cola.");
            
        } else {

            System.out.println("\nDocumentos en la cola:");

            int i = 1;

            for (String documento : colaDocumentos) {
                System.out.println(i + ". " + documento);
                i++;
            }

        }
    }

}
