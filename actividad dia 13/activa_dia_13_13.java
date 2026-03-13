
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_13 {
    public static void main(String[] args) throws IOException {

        for (int tabla = 1; tabla <= 10; tabla++) {

            for (int i = 1; i <= 10; i++) {

                int resultado = tabla * i;

                System.out.println(tabla + " x " + i + " = " + resultado);

            }

            System.out.println();
        }
    }
}
