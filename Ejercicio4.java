import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número de correos electrónicos a verificar: ");
        int numeroDeCorreos = scanner.nextInt();
        scanner.nextLine();
        
        List<String> listaCorreos = new ArrayList<>();

        System.out.println("Introduce los correos electrónicos:");

        for (int i = 0; i < numeroDeCorreos; i++) {

            System.out.print("Correo #" + (i + 1) + ": ");
            String correo = scanner.nextLine();

            listaCorreos.add(correo);

        }

        verificarCorreoDuplicados(listaCorreos);

        scanner.close();
    }
    
    public static void verificarCorreoDuplicados(List<String> correos) {

        Set<String> correosUnicos = new HashSet<>();
        List<String> duplicados = new ArrayList<>();

        for (String correo : correos) {

            if (!correosUnicos.add(correo)) { /// Si el correo no se agrega, es porque ya estaba
                duplicados.add(correo);
            }

        }

        if (duplicados.isEmpty()) {

            System.out.println("No se encontraron correos electrónicos duplicados.");

        } else {

            System.out.println("Correos electrónicos duplicados encontrados:");

            for (String duplicado : duplicados) {
                System.out.println(duplicado);
            }

        }

    }
    
}
