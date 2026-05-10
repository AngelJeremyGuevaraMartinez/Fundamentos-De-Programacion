import java.io.*;

public class problema_1 {

    public static void main(String args[]) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

        double base;
        double altura;
        double area;

        System.out.println("Dame la base:");
        base = Double.parseDouble(bufEntrada.readLine());

        System.out.println("Dame la altura:");
        altura = Double.parseDouble(bufEntrada.readLine());

        area = base * altura;

        System.out.println("El area es: " + area);
    }
}
