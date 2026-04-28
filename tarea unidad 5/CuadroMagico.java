import java.util.Scanner;

public class CuadroMagico {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("n: ");
        n = leer.nextInt();

        if(n%2==0 || n<3){
            System.out.println("Número no válido");
            return;
        }

        int[][] arr = new int[n][n];
        int i=0,j=n/2;

        for(int num=1;num<=n*n;num++){
            arr[i][j]=num;
            int ni=(i-1+n)%n;
            int nj=(j+1)%n;

            if(arr[ni][nj]!=0) i=(i+1)%n;
            else{ i=ni; j=nj; }
        }

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++)
                System.out.print(arr[x][y]+"\t");
            System.out.println();
        }
    }
}
