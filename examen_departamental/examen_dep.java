import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class examen_dep {
    // Verifica que el texto no esté vacío
    public static boolean textonovacio(String text) {
        return text != null && text.length() > 0;
    }

    public static boolean validarnumero(String text) {
        if (text == null || text.length() == 0) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static double promediogeneral(int[][] calificacion, int n) {
        int i, j;
        double suma = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < 2; j++) {
                suma = suma + calificacion[i][j];
            }
        }
        return suma / (n * 2.0);
    }

    public static double promedioalumno(int[][] calificacion, int fila) {
        return (calificacion[fila][0] + calificacion[fila][1]) / 2.0;
    }

    public static double promedioasignatura(int[][] calificacion, int n, int col) {
        int i;
        double suma = 0;
        for (i = 0; i < n; i++) {
            suma = suma + calificacion[i][col];
        }
        return suma / n;
    }
    
    public static boolean validarnombre(String text) {
        if (text == null || text.length() == 0) {
            return false;
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= '0' && c <= '9') {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int calif;
        int[][] calificacion = new int[100][2];
        int i, j, n;
        String[] nombres = new String[100];
        boolean ok;
        double prom;
        String text;
        System.out.println("Ingrese el numero de alumnos:");
        do {
            text = bufEntrada.readLine();
            if (validarnumero(text)) {
                n = Integer.parseInt(text);
                if (n >= 1 && n <= 100) {
                    break;
                } else {
                    System.out.println("El numero de alumnos debe estar entre 1 y 100");
                }
            } else {
                System.out.println("Dato no valido,ingrese otra vez un dato");
            }
        } while (true);
        for (i = 0; i <= n - 1; i++) {
        	do {
        	    System.out.println("Ingrese el nombre del alumno:");
        	    nombres[i] = bufEntrada.readLine();

        	    if (!validarnombre(nombres[i])) {
        	        System.out.println("Dato no valido");
        	    }
        	} while (!validarnombre(nombres[i]));
            for (j = 0; j <= 1; j++) {
                do {
                    System.out.println("Ingrese la calificacion " + (j + 1));
                    text = bufEntrada.readLine();
                    ok = validarnumero(text);
                    if (ok) {
                        calif = Integer.parseInt(text);
                        if (calif < 1 || calif > 10) {
                            System.out.println("La calificacion debe estar entre 1 y 10");
                            ok = false;
                        } else {
                            calificacion[i][j] = calif;
                        }
                    } else {
                        System.out.println("Dato no valido");
                    }
                } while (!ok);
            }
        }
        prom = promediogeneral(calificacion, n);
        System.out.println("El promedio general del grupo es: " + prom);
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Alumno: " + nombres[i]);
            System.out.println("Calificacion 1: " + calificacion[i][0]);
            System.out.println("Calificacion 2: " + calificacion[i][1]);
            System.out.println("El promedio: " + promedioalumno(calificacion, i));
        }
        System.out.println("Promedio de la asignatura 1: " + promedioasignatura(calificacion, n, 0));
        System.out.println("Promedio de la asignatura 2: " + promedioasignatura(calificacion, n, 1));
    }
}