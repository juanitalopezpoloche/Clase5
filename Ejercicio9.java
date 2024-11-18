import java.util.Scanner;

public class Ejercicio9 {

    static class Cola {
        private int[] cola;      // Arreglo para representar la cola de clientes
        private int frente;      // indica el Índice del primer cliente (el que será atendido)
        private int fin;         // indica el indice donde se agregan nuevos clientes
        private int capacidad;   // indica la capacidad máxima de la cola

        
        public Cola(int capacidadMaxima) { // Constructor
            capacidad = capacidadMaxima;
            cola      = new int[capacidadMaxima];
            frente    = 0;
            fin       = 0;
        }


        public void agregarCliente(int clienteId) {

            if (fin < capacidad) {

                // Coloco al cliente en la última posición y aumento el índice de fin
                cola[fin] = clienteId;  
                fin++; 
                System.out.println("Cliente " + clienteId + " agregado a la cola.");

            } else {

                System.out.println("La cola está llena. No se puede agregar más clientes.");

            }

        }

        public void atenderCliente() {
            if (frente == fin) {

                System.out.println("No hay clientes para atender, la cola está vacía.");

            } else {

                // Elimino al primer cliente de la cola
                int clienteAtendido = cola[frente];
                frente++;
                System.out.println("Cliente " + clienteAtendido + " ha sido atendido.");

            }
        }

        public void mostrarCola() {

            if (frente == fin) {

                System.out.println("La cola está vacía.");

            } else {

                System.out.print("Clientes en la cola: ");

                for (int i = frente; i < fin; i++) {
                    System.out.print(cola[i] + " ");
                }

                System.out.println();  // Salto de línea para mejorar la legibilidad

            }

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cola cola = new Cola(5);

        while (true) {

            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver estado de la cola");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el ID del cliente: ");
                    int clienteId = scanner.nextInt();
                    cola.agregarCliente(clienteId);
                    break;

                case 2:

                    cola.atenderCliente();
                    break;

                case 3:

                    cola.mostrarCola();
                    break;

                case 4:

                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        }
    }
    
}
