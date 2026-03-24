
import java.util.Scanner;
public class Tarea18C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int cont = 1;
        do {
            System.out.println(valor + " x " + cont + " = " + (valor * cont));
            cont++;
        } while (cont <= 10);
    }
}
