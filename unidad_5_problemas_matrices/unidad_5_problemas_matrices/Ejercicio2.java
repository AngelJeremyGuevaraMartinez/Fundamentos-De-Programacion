import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import buffered	

public class Ejercicio2 {
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

        // Imprimir matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}