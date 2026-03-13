
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int trabajadores;
        double sueldo;
        double sueldoNuevo;
        double nomina = 0;

        System.out.println("¿Cuántos trabajadores tiene el grupo?");
        trabajadores = Integer.parseInt(br.readLine());

        while (trabajadores > 0) {

            System.out.println("¿Cuál es el sueldo actual?");
            sueldo = Double.parseDouble(br.readLine());

            if (sueldo < 1000) {
                sueldoNuevo = sueldo * 1.15;
            } else {
                sueldoNuevo = sueldo * 1.12;
            }

            nomina = nomina + sueldoNuevo;

            System.out.println("Nuevo sueldo: " + sueldoNuevo);

            trabajadores--;
        }

        System.out.println("Total de nómina: " + nomina);
    }
}
