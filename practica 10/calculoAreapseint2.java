import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class calculoAreapseint2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Mostrar menú
    public static void mostrarMenu() {
        System.out.println("c.- Calcular el area del circulo");
        System.out.println("t.- Calcular el area del triangulo");
        System.out.println("r.- Calcular el area del rectangulo");
        System.out.println("a.- Calcular el area del trapecio");
        System.out.println("s.- Salir");
        System.out.print("Elige una opcion: ");
    }

    // Pedir dato
    public static double pedirDato(String mensaje) throws IOException {
        System.out.print(mensaje);
        return Double.parseDouble(br.readLine());
    }

    // Fórmulas
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularTrapecio(double baseMayor, double baseMenor, double altura) {
        return (baseMayor + baseMenor) * altura / 2;
    }

    public static void main(String[] args) throws IOException {

        char op = ' ';

        while (op != 'S') {

            mostrarMenu();
            op = br.readLine().toUpperCase().charAt(0);

            switch (op) {
                case 'C':
                    double radio = pedirDato("Ingresa el radio del circulo: ");
                    System.out.println("Area: " + calcularAreaCirculo(radio));
                    break;

                case 'T':
                    double baseT = pedirDato("Ingresa la base del triangulo: ");
                    double alturaT = pedirDato("Ingresa la altura del triangulo: ");
                    System.out.println("Area: " + calcularAreaTriangulo(baseT, alturaT));
                    break;

                case 'R':
                    double baseR = pedirDato("Ingresa la base del rectangulo: ");
                    double alturaR = pedirDato("Ingresa la altura del rectangulo: ");
                    System.out.println("Area: " + calcularRectangulo(baseR, alturaR));
                    break;

                case 'A':
                    double baseMayor = pedirDato("Ingresa la base mayor: ");
                    double baseMenor = pedirDato("Ingresa la base menor: ");
                    double alturaA = pedirDato("Ingresa la altura: ");
                    System.out.println("Area: " + calcularTrapecio(baseMayor, baseMenor, alturaA));
                    break;

                case 'S':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

            System.out.println();
        }
    }
}