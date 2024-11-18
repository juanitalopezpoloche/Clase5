import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el texto:");
        String texto = scanner.nextLine();

        Map<String, Integer> frecuencia = contarPalabras(texto);
        
        mostrarFrecuencia(frecuencia);
        
        scanner.close();
    }
    

    public static Map<String, Integer> contarPalabras(String texto) {

        Map<String, Integer> frecuencia = new HashMap<>();
        
        // Convierto el texto a minúsculas
        texto = texto.toLowerCase();
        
        // Hago uso de una expresión regular para reemplazar los caracteres que no sean letras o espacios con un espacio
        texto = texto.replaceAll("[^a-záéíóúñ ]", "");
        
        String[] palabras = texto.split("\\s+");

        
        for (String palabra : palabras) {

            if (frecuencia.containsKey(palabra)) {

                frecuencia.put(palabra, frecuencia.get(palabra) + 1);

            } else {

                frecuencia.put(palabra, 1);

            }
        }
        
        return frecuencia;
    }
    
    public static void mostrarFrecuencia(Map<String, Integer> frecuencia) {

        System.out.println("\nFrecuencia de cada palabra:");
        
        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }
    }
}
