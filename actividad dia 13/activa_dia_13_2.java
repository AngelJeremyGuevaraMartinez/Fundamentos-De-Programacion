
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activa_dia_13_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double gasto = 0;
        double total = 0;

        System.out.println("Ingrese el gasto:");
        gasto = Double.parseDouble(br.readLine());

        if (gasto == 0) {
            System.out.println("No hubo gastos");
        } else {
            while (gasto != 0) {
                total = total + gasto;

                System.out.println("El total es: " + total);

                System.out.println("¿Hay más gastos? Ingresa la cantidad:");
                gasto = Double.parseDouble(br.readLine());

                if (gasto == 0) {
                    System.out.println("Ya no hay gastos");
                }
            }

            System.out.println("El total final es: " + total);
        }
    }
}
