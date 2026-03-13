
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_8 {
    public static void main(String[] args) throws IOException {

        int serie = 0;
        int suma = 0;

        while (serie < 1800) {

            serie = serie + 2;
            suma = suma + serie;
            System.out.println(serie);

            serie = serie + 3;
            suma = suma + serie;
            System.out.println(serie);
        }

        System.out.println("La suma de la serie es: " + suma);
    }
}
