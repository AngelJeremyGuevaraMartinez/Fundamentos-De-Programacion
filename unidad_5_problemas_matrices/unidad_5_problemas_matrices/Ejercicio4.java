import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        System.out.print("¿Cuántas filas?: ");
        int n = Integer.parseInt(br.readLine());

        int[][] matriz = new int[n][10];
        int[] decimales = new int[n];

        for (int i = 0; i < n; i++) {
            int columnas = rand.nextInt(10) + 1;
            int decimal = 0;

            System.out.print("Fila " + i + ": ");

            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(2);
                System.out.print(matriz[i][j]);

                decimal = decimal * 2 + matriz[i][j];
            }

            decimales[i] = decimal;
            System.out.println(" = " + decimal);
        }
    }
}