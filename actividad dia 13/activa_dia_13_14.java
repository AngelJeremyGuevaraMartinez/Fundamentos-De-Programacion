
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_14 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        int sumaPar = 0;
        int sumaImpar = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Ingrese un número entero:");
            numero = Integer.parseInt(br.readLine());

            if (numero % 2 == 0) {
                sumaPar = sumaPar + numero;
            } else {
                sumaImpar = sumaImpar + numero;
            }
        }

        System.out.println("Media de pares: " + (sumaPar / 10.0));
        System.out.println("Media de impares: " + (sumaImpar / 10.0));
    }
}
