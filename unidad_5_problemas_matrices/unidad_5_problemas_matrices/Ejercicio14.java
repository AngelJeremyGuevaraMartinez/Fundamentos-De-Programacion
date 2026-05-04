import java.io.*;
import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        int f1 = Integer.parseInt(br.readLine());
        int c1 = Integer.parseInt(br.readLine());
        int f2 = Integer.parseInt(br.readLine());
        int c2 = Integer.parseInt(br.readLine());

        if(c1 != f2){
            System.out.println("No se puede multiplicar");
            return;
        }

        int[][] A = new int[f1][c1];
        int[][] B = new int[f2][c2];
        int[][] C = new int[f1][c2];

        for(int i=0;i<f1;i++)
            for(int j=0;j<c1;j++)
                A[i][j] = r.nextInt(30)-9;

        for(int i=0;i<f2;i++)
            for(int j=0;j<c2;j++)
                B[i][j] = r.nextInt(30)-9;

        for(int i=0;i<f1;i++)
            for(int j=0;j<c2;j++)
                for(int k=0;k<c1;k++)
                    C[i][j]+=A[i][k]*B[k][j];

        System.out.println("Resultado:");
        for(int i=0;i<f1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}