
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_6 {
    public static void main(String[] args) throws IOException {

        int numero = 0;
        int suma = 0;

        while (numero <= 100) {
            suma = suma + numero;
            numero++;
        }

        System.out.println("La suma de los primeros 100 números es: " + suma);
    }
}
