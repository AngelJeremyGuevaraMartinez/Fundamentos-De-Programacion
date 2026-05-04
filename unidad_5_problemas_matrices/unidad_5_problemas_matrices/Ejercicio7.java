import java.io.*;

public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                A[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                B[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}