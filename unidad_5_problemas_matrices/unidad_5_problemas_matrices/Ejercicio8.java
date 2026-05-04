import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] A = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Transpuesta:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
    }
}