import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la dimensión de la matriz (n x n): ");

        int tMatriz = scanner.nextInt();

        int[][] matriz = new int[tMatriz][tMatriz];

        System.out.println("Introduce los elementos de la matriz:");

        for (int i = 0; i < tMatriz; i++) {

            for (int j = 0; j < tMatriz; j++) {
                System.out.print("Elemento en [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }

        }

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        rotarMatriz(matriz);

        System.out.println("\nMatriz rotada 90 grados:");
        imprimirMatriz(matriz);

        scanner.close();
    }

    public static void rotarMatriz(int[][] matriz) {

        int n = matriz.length;

        int[][] matrizRotada = new int[n][n];
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matrizRotada[j][n - 1 - i] = matriz[i][j];
            }

        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matriz[i][j] = matrizRotada[i][j];
            }

        }

    }

    public static void imprimirMatriz(int[][] matriz) {

        int n = matriz.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println();
        }

    }

}
