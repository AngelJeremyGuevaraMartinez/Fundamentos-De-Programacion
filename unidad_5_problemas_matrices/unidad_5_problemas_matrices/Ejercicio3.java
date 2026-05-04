import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][13];

        matriz[0][6] = 1;

        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                int izq = (j - 1 >= 0) ? matriz[i - 1][j - 1] : 0;
                int der = (j + 1 < 13) ? matriz[i - 1][j + 1] : 0;
                matriz[i][j] = izq + der;
            }
        }

        // Mostrar solo triángulo
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                if (matriz[i][j] != 0) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}