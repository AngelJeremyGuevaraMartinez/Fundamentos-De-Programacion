
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_12 {
    public static void main(String[] args) throws IOException {

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los primeros cien números es: " + suma);
    }
}
