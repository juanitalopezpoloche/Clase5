import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tArray = scanner.nextInt();
        
        int[] array = new int[tArray];
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tArray; i++) {
            array[i] = scanner.nextInt();
        }


        int sumaArray = sumaArray(array);
        System.out.println("La suma de los elementos del array es: " + sumaArray);

        int valorMaximoArray = valorMaximo(array);
        System.out.println("El valor máximo del array es: " + valorMaximoArray);

        int valorMinimoArray = valorMinimo(array);
        System.out.println("El valor mínimo del array es: " + valorMinimoArray);

        invertirArray(array);
        System.out.println("El array invertido es: " + Arrays.toString(array));

        ordenarArrayDescendente(array);
        System.out.println("El array ordenado de mayor a menor es: " + Arrays.toString(array));

        double promedio = obtenerPromedio(array);
        System.out.println("El promedio de los elementos del array es: " + promedio);

        int moda = encontrarModa(array);
        System.out.println("La moda del array es: " + moda);

        scanner.close();

    }

    public static int sumaArray(int[] array) {

        int suma = 0;

        for (int num : array) {
            suma += num;
        }

        return suma;

    }

    public static int valorMaximo(int[] array) {

        int max = array[0];

        for (int num : array) {

            if (num > max) {
                max = num;
            }

        }

        return max;

    }

    public static int valorMinimo(int[] array) {

        int min = array[0];

        for (int num : array) {

            if (num < min) {
                min = num;
            }

        }

        return min;

    }

    public static void invertirArray(int[] array) {

        int left = 0, right = array.length - 1;

        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;

        }

    }

    public static void ordenarArrayDescendente(int[] array) {

        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {

            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }

    }

    public static double obtenerPromedio(int[] array) {

        int suma = sumaArray(array);

        return (double) suma / array.length;

    }

    public static int encontrarModa(int[] array) {

        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : array) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        
        int moda = array[0];
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {

            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
            
        }

        return moda;

    }

}
