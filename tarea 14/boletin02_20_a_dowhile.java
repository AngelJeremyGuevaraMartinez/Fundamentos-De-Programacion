package tarea14;
import java.io.*;

public class boletin02_20_a_dowhile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 1, n;
        double sueldo, sueldo_max = 0;

        System.out.println("Numero de sueldos: ");
        n = Integer.parseInt(br.readLine());

        if (n > 0) {
            do {

                System.out.println("Introduce sueldo: ");
                sueldo = Double.parseDouble(br.readLine());

                if (sueldo > sueldo_max) {
                    sueldo_max = sueldo;
                }

                i++;

            } while (i <= n);
        }

        System.out.println("El sueldo maximo es: " + sueldo_max);
    }
}