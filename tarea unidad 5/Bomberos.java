import java.util.Random;

public class Bomberos {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] cartas = new int[3][5];
        int[] voluntarios = new int[3];
        int[] colonias = new int[5];

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                cartas[i][j]=r.nextInt(500);
                voluntarios[i]+=cartas[i][j];
                colonias[j]+=cartas[i][j];
            }
        }

        for(int i=0;i<3;i++)
            System.out.println("Bombero "+i+" = "+voluntarios[i]);

        for(int j=0;j<5;j++)
            System.out.println("Colonia "+j+" = "+colonias[j]);
    }
}
