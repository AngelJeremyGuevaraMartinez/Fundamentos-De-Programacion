import java.io.*;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][5];
        Random rand = new Random();

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j] = rand.nextInt(801) + 100;
            }
        }

        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}