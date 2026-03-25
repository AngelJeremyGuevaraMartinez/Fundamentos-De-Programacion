import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ejercicio_1_10 {

    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }

    public static double calcularAreaCirculo(double radio) {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("s.- Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) throws IOException {
        char opcion;
        double radio, base, altura, resultado;

        do {
            mostrarMenu();
            opcion = lectura.readLine().charAt(0);

            switch (opcion) {
                case 'c':
                    radio = pedirdato("Ingrese el radio:");
                    resultado = calcularAreaCirculo(radio);
                    System.out.println("Área del círculo: " + resultado);
                    break;

                case 't':
                    base = pedirdato("Ingrese la base:");
                    altura = pedirdato("Ingrese la altura:");
                    resultado = calcularAreaTriangulo(base, altura);
                    System.out.println("Área del triángulo: " + resultado);
                    break;

                case 's':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

            System.out.println();

        } while (opcion != 's');
    }
}