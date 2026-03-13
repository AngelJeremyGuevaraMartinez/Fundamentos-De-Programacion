
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        int resultado = 1;

        System.out.println("Ingrese un número:");
        numero = Integer.parseInt(br.readLine());

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }

        System.out.println("El factorial es: " + resultado);
    }
}
