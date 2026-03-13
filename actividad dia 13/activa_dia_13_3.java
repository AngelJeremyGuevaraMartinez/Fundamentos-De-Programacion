
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        int cubo;

        System.out.println("Ingrese un número natural (0-9):");
        numero = Integer.parseInt(br.readLine());

        while (numero >= 0 && numero <= 9) {

            cubo = numero * numero * numero;

            System.out.println("El cubo del número es: " + cubo);

            System.out.println("Ingresa otro número natural:");
            numero = Integer.parseInt(br.readLine());

            if (numero < 0 || numero > 9) {
                System.out.println("El número no es natural");
            }
        }
    }
}
