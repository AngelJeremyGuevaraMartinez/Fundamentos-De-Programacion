
import java.util.Scanner;

public class OperacionesMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        boolean AA = false, BB = false;
        int op;

        do {
            System.out.println("1. Matriz A");
            System.out.println("2. Matriz B");
            System.out.println("3. Suma");
            System.out.println("4. Resta");
            System.out.println("5. Multiplicacion");
            System.out.println("6. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    for (int i=0;i<2;i++)
                        for (int j=0;j<2;j++)
                            A[i][j]=sc.nextInt();
                    AA=true;
                    break;

                case 2:
                    for (int i=0;i<2;i++)
                        for (int j=0;j<2;j++)
                            B[i][j]=sc.nextInt();
                    BB=true;
                    break;

                case 3:
                    if (AA && BB) {
                        for (int i=0;i<2;i++)
                            for (int j=0;j<2;j++)
                                System.out.print((A[i][j]+B[i][j])+" ");
                    }
                    break;

                case 4:
                    if (AA && BB) {
                        for (int i=0;i<2;i++)
                            for (int j=0;j<2;j++)
                                System.out.print((A[i][j]-B[i][j])+" ");
                    }
                    break;

                case 5:
                    if (AA && BB) {
                        C[0][0]=A[0][0]*B[0][0]+A[0][1]*B[1][0];
                        C[0][1]=A[0][0]*B[0][1]+A[0][1]*B[1][1];
                        C[1][0]=A[1][0]*B[0][0]+A[1][1]*B[1][0];
                        C[1][1]=A[1][0]*B[0][1]+A[1][1]*B[1][1];

                        for (int i=0;i<2;i++){
                            for (int j=0;j<2;j++)
                                System.out.print(C[i][j]+" ");
                            System.out.println();
                        }
                    }
                    break;
            }

        } while (op != 6);
    }
}
