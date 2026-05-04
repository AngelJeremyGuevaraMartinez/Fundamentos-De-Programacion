import java.io.*;
import java.util.Random;

public class Ejercicio21 {

    public static void meterNums(int n) {
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int columnas = n + (i * 2);
            int[] fila = new int[columnas];

            for (int j = 0; j < columnas; j++) {
                if (i % 2 == 0) {
                    fila[j] = (r.nextInt(25) * 2) + 50; // pares
                } else {
                    fila[j] = (r.nextInt(25) * 2) + 51; // impares
                }
                System.out.print(fila[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        meterNums(4);
    }
}