
import java.util.Scanner;
public class Tarea19A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int cont = 0;
        while (cont < 3) {
            int cal = sc.nextInt();
            suma += cal;
            cont++;
        }
        double prom = suma / 3.0;
        if (prom >= 7) System.out.println("ACREDITADO");
        else System.out.println("NO ACREDITADO");
    }
}
