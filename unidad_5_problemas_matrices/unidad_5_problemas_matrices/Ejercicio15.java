import java.io.*;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        int f = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int[][] m = new int[f][c];

        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                m[i][j] = r.nextInt(50)-10;
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpuesta:");
        for(int i=0;i<c;i++){
            for(int j=0;j<f;j++){
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }

        if(f==c){
            int suma=0;
            for(int i=0;i<f;i++)
                if(m[i][i]%2!=0) suma+=m[i][i];
            System.out.println("Diagonal impares: "+suma);
        } else {
            int suma=0;
            for(int i=0;i<f;i++)
                for(int j=0;j<c;j++)
                    if((i==0||j==0||i==f-1||j==c-1)&& m[i][j]%7==0)
                        suma+=m[i][j];
            System.out.println("Periferia múltiplos 7: "+suma);
        }
    }
}