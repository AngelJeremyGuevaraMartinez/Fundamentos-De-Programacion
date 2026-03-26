
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opc = 'S';
        double sumapromedio = 0, resultado, promedio;
        int num = 0, suma, calif;
        double[] calificacion = new double[100];

        while (opc == 'S') {
            num++;
            suma = 0;

            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la calificación " + i + " del alumno " + num + ": ");
                calif = sc.nextInt();
                suma += calif;
            }

            resultado = suma / 3.0;
            calificacion[num] = resultado;

            System.out.print("¿Desea ingresar otro alumno? (S/N): ");
            opc = sc.next().toUpperCase().charAt(0);
        }

        for (int i = 1; i <= num; i++) {
            if (calificacion[i] >= 7)
                System.out.println("Alumno " + i + " calificación: " + calificacion[i] + " -> Acredita");
            else
                System.out.println("Alumno " + i + " calificación: " + calificacion[i] + " -> NO acredita");

            sumapromedio += calificacion[i];
        }

        promedio = sumapromedio / num;
        System.out.println("Promedio del grupo: " + promedio);
    }
}
