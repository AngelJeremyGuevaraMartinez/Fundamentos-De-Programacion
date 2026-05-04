import java.io.*;
import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        System.out.print("n: ");
        int n = Integer.parseInt(br.readLine());

        int[][] m = new int[n][n];
        int sumaDiag = 0;
        int suma3 = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j] = r.nextInt(13);
                System.out.print(m[i][j] + " ");
                if(i==j) sumaDiag += m[i][j];
                if(i<j && m[i][j]%3==0) suma3 += m[i][j];
            }
            System.out.println();
        }

        System.out.println("Suma diagonal = " + sumaDiag);
        System.out.println("Suma múltiplos de 3 arriba = " + suma3);
    }
}