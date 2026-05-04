import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz = new int[3][3];
        int mayor = Integer.MIN_VALUE;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = Integer.parseInt(br.readLine());
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
        }

        System.out.println("Mayor: " + mayor);
    }
}