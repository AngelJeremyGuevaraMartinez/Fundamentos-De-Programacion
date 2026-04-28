
public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[][] matriz = new int[6][5];

        // Llenar con números aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 801) + 100; // 100 a 900
            }
        }

        // Imprimir matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
	}

}
