
import java.util.Random;

public class VectoresOrdenados {
    public static void main(String[] args) {
        int[] datos = new int[10];
        int generados = 0, num = 0;
        Random rand = new Random();

        while (num < 10) {
            int n = rand.nextInt(41);
            generados++;
            if (n > 0 && n % 2 == 0) {
                datos[num++] = n;
            }
        }

        System.out.println("Generados: " + generados);

        for (int i = 0; i < 10; i++)
            System.out.print(datos[i] + " ");

        boolean movimiento = true;
        int ciclo = 0;

        while (ciclo < 10 && movimiento) {
            movimiento = false;
            for (int i = 0; i < 9; i++) {
                if (datos[i] > datos[i+1]) {
                    int aux = datos[i];
                    datos[i] = datos[i+1];
                    datos[i+1] = aux;
                    movimiento = true;
                }
            }
            ciclo++;
        }

        System.out.println("\nOrdenado:");
        for (int i = 0; i < 10; i++)
            System.out.print(datos[i] + " ");
    }
}
