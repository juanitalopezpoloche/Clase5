import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    private static List<String> tareasPendientes = new ArrayList<>(); // Almaceno las tareas pendientes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n--------- GESTIÓN DE TAREAS ---------");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea completada");
            System.out.println("3. Mostrar todas las tareas pendientes");
            System.out.println("4. Acceder a una tarea específica");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:

                    System.out.print("Ingresa la tarea: ");
                    String tarea = scanner.nextLine();
                    agregarTarea(tarea);
                    break;

                case 2:

                    mostrarTareas();
                    System.out.print("Ingresa el número de la tarea a eliminar: ");
                    int indiceEliminar = scanner.nextInt() - 1;
                    eliminarTarea(indiceEliminar);
                    break;

                case 3:

                    mostrarTareas();
                    break;

                case 4:

                    mostrarTareas();
                    System.out.print("Ingresa el número de la tarea a ver: ");
                    int indiceAcceder = scanner.nextInt() - 1;
                    accederTarea(indiceAcceder);
                    break;

                case 5:

                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }

    public static void agregarTarea(String tarea) {

        tareasPendientes.add(tarea);
        System.out.println("\nTarea agregada: " + tarea);

    }


    public static void eliminarTarea(int indice) {

        if (indice >= 0 && indice < tareasPendientes.size()) {
            String tareaEliminada = tareasPendientes.remove(indice);
            System.out.println("\nTarea completada y eliminada: " + tareaEliminada);
        } else {
            System.out.println("\nÍndice inválido. No se puede eliminar la tarea.");
        }

    }


    public static void mostrarTareas() {

        if (tareasPendientes.isEmpty()) {
            System.out.println("\nNo hay tareas pendientes.");
        } else {
            System.out.println("\nTareas pendientes:");
            for (int i = 0; i < tareasPendientes.size(); i++) {
                System.out.println((i + 1) + ". " + tareasPendientes.get(i));
            }
        }

    }


    public static void accederTarea(int indice) {

        if (indice >= 0 && indice < tareasPendientes.size()) {
            System.out.println("\nTarea en la posición " + (indice + 1) + ": " + tareasPendientes.get(indice));
        } else {
            System.out.println("\nÍndice inválido. No se puede acceder a la tarea.");
        }

    }

}
