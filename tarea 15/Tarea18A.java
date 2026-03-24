
import java.util.Scanner;
public class Tarea18A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int contador = 1;
        while (contador <= 10) {
            System.out.println(valor + " x " + contador + " = " + (valor * contador));
            contador++;
        }
    }
}
