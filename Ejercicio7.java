import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    
    static class Estudiante {
        String nombre;
        String dni;

        public Estudiante(String nombre, String dni) { // Constructor de la clase Estudiante
            this.nombre = nombre;
            this.dni = dni;
        }

        // Este método para mostrar la información del estudiante
        @Override // indica que un método sobrescribe uno de la superclase, asegurando que la firma sea correcta.
        public String toString() {
            return "Nombre: " + nombre + ", DNI: " + dni;
        }
    }

    static ArrayList<Estudiante> estudiantes = new ArrayList<>(); // Almaceno la lista de estudiantes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar todos los estudiantes");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarEstudiante(scanner);
                    break;
                case 2:
                    eliminarEstudiante(scanner);
                    break;
                case 3:
                    mostrarEstudiantes();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

        } while (opcion != 4);

        scanner.close();
    }


    public static void agregarEstudiante(Scanner scanner) {

        System.out.print("Introduce el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el DNI del estudiante: ");
        String dni = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, dni);
        estudiantes.add(estudiante);

        System.out.println("Estudiante agregado con éxito.");

    }

    public static void eliminarEstudiante(Scanner scanner) {

        System.out.print("Introduce el DNI del estudiante a eliminar: ");
        String dni = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < estudiantes.size(); i++) {

            if (estudiantes.get(i).dni.equals(dni)) {

                estudiantes.remove(i);
                System.out.println("Estudiante eliminado con éxito.");
                encontrado = true;

                break;

            }

        }

        if (!encontrado) {
            System.out.println("No se encontró un estudiante con ese DNI.");
        }

    }

    public static void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {

            System.out.println("No hay estudiantes inscritos.");

        } else {

            System.out.println("\nLista de estudiantes inscritos:");

            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }

        }
        
    }

}
