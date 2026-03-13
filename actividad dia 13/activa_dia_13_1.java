
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_1 {
    public static void main(String[] args) throws IOException {
        int numero = 1;
        int contador = 0;

        while (contador < 50) {
            System.out.println(numero);
            numero = numero + 2;
            contador = contador + 1;
        }
    }
}
