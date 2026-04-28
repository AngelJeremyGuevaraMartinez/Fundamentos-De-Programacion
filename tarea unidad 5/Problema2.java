
public class Problema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int filas = 7;
        int columnas = 13;

        int[][] matriz = new int[filas][columnas];

        int centro = columnas / 2;

        // Colocar el primer 1
        matriz[0][centro] = 1;

        // Llenar matriz
        for (int i = 1; i < filas; i++) {
            for (int j = 1; j < columnas - 1; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j + 1];
            }
        }

        // Imprimir matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
	}

}
