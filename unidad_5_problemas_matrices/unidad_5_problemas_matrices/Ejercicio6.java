import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Matriz A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Matriz B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j] = Integer.parseInt(br.readLine());
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Resultado:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}