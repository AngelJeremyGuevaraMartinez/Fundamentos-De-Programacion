import java.util.Scanner;

public class PromCalorias {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] calorias = new int[7];
        int suma = 0;

        System.out.println("Captura las calorías consumidas cada día");

        for (int i = 0; i < calorias.length; i++) {
            System.out.print("Día " + (i+1) + ": ");
            calorias[i] = leer.nextInt();
            suma += calorias[i];
        }

        System.out.println("Información en orden inverso:");
        for (int i = calorias.length - 1; i >= 0; i--) {
            System.out.print(calorias[i] + " ");
        }

        System.out.println("\nPromedio = " + (float)suma/calorias.length);
    }
}
