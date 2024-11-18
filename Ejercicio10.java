import java.util.Scanner;

public class Ejercicio10 {
    
    static String[] nombresConfiguraciones = new String[10];
    static String[] valoresConfiguraciones = new String[10];
    static int contador = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Gestión de Configuraciones ---");
            System.out.println("1. Agregar o actualizar configuración");
            System.out.println("2. Mostrar todas las configuraciones");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el nombre de la configuración: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el valor de la configuración: ");
                    String valor = scanner.nextLine();

                    agregarOActualizarConfiguracion(nombre, valor);

                    break;

                case 2:

                    mostrarConfiguraciones();
                    break;

                case 3:

                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void agregarOActualizarConfiguracion(String nombre, String valor) {

        // Reviso si la configuración ya existe, en caso de que exista actualizo el valor y si no existe agrego una nueva configuración
        for (int i = 0; i < contador; i++) {

            if (nombresConfiguraciones[i].equals(nombre)) {

                valoresConfiguraciones[i] = valor;
                System.out.println("Configuración '" + nombre + "' actualizada.");
                return;

            }

        }

        if (contador < nombresConfiguraciones.length) {

            nombresConfiguraciones[contador] = nombre;
            valoresConfiguraciones[contador] = valor;
            contador++;

            System.out.println("Configuración '" + nombre + "' agregada.");

        } else {

            System.out.println("No hay espacio para más configuraciones.");

        }
    }


    public static void mostrarConfiguraciones() {

        if (contador == 0) {

            System.out.println("No hay configuraciones almacenadas.");

        } else {

            System.out.println("Configuraciones actuales:");

            for (int i = 0; i < contador; i++) {
                System.out.println(nombresConfiguraciones[i] + ": " + valoresConfiguraciones[i]);
            }

        }

    }

}
