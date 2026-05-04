import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio5 {

    static int[][] matriz = new int[4][7];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        generar();
        imprimir();

        System.out.print("Renglón inicial: ");
        int r = Integer.parseInt(br.readLine());

        System.out.print("Columna inicial: ");
        int c = Integer.parseInt(br.readLine());

        System.out.print("¿Cuántas veces?: ");
        int n = Integer.parseInt(br.readLine());

        recorrido(r, c, n);
    }

    static void generar() {
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = rand.nextInt(90) + 10;
            }
        }
    }

    static void imprimir() {
        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void recorrido(int r, int c, int n) {
        System.out.println("Recorrido:");

        for (int i = 0; i < n; i++) {
            if (r < 4 && c < 7) {
                System.out.print(matriz[r][c] + " ");
                r++;
                c++;
            }
        }
    }
}