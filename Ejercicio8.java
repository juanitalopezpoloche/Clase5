import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una lista de números separados por espacio: ");
        String entrada = scanner.nextLine();

        String[] numerosStr = entrada.split(" ");

        int[] listaNumeros = new int[numerosStr.length];

        // Convierto la entrada a un arreglo de enteros
        for (int i = 0; i < numerosStr.length; i++) {

            try {
                listaNumeros[i] = Integer.parseInt(numerosStr[i]);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida: " + numerosStr[i]);
            }

        }

        obtenerNumerosUnicos(listaNumeros);

        scanner.close();

    }

        
    public static void obtenerNumerosUnicos(int[] lista) {

        System.out.print("Los números únicos son: ");
        boolean esUnico;

        for (int i = 0; i < lista.length; i++) {
            esUnico = true;

            for (int j = 0; j < lista.length; j++) {

                if (i != j && lista[i] == lista[j]) {
                    esUnico = false;
                    break;
                }

            }

            if (esUnico) {

                System.out.print(lista[i] + " ");
                
            }
        }

        System.out.println(); // Para terminar con un salto de línea
    }

}
