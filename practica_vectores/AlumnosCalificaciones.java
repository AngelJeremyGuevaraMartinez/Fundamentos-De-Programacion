
import java.util.Scanner;

public class AlumnosCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombre = new String[5];
        int[] calificaciones = new int[15];

        int pos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre alumno " + (i+1) + ": ");
            nombre[i] = sc.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("Calificación: ");
                calificaciones[pos++] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            pos = 0;
            for (int j = 0; j < 4; j++) {
                if (nombre[j].compareTo(nombre[j+1]) > 0) {

                    String auxN = nombre[j];
                    nombre[j] = nombre[j+1];
                    nombre[j+1] = auxN;

                    int a = calificaciones[pos];
                    int b = calificaciones[pos+1];
                    int c = calificaciones[pos+2];

                    calificaciones[pos] = calificaciones[pos+3];
                    calificaciones[pos+1] = calificaciones[pos+4];
                    calificaciones[pos+2] = calificaciones[pos+5];

                    calificaciones[pos+3] = a;
                    calificaciones[pos+4] = b;
                    calificaciones[pos+5] = c;
                }
                pos += 3;
            }
        }

        pos = 0;
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            double prom = (calificaciones[pos] + calificaciones[pos+1] + calificaciones[pos+2]) / 3.0;

            System.out.println(nombre[i] + " -> " + calificaciones[pos] + ", " + calificaciones[pos+1] + ", " + calificaciones[pos+2] + " Prom: " + prom);

            suma += prom;
            pos += 3;
        }

        System.out.println("Promedio general: " + (suma / 5));
    }
}
