import java.util.Random;

public class SumaMatrices {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        Random r = new Random();

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=r.nextInt(10);
                b[i][j]=r.nextInt(10);
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println("Resultado:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }
    }
}
