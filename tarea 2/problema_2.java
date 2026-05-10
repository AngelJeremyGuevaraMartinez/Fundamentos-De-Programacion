import java.io.*;

public class problema_2 {

    public static void main(String args[]) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

        int c1;
        int c2;
        int c3;
        double prom;

        System.out.println("Dame la primera calificacion:");
        c1 = Integer.parseInt(bufEntrada.readLine());

        System.out.println("Dame la segunda calificacion:");
        c2 = Integer.parseInt(bufEntrada.readLine());

        System.out.println("Dame la tercera calificacion:");
        c3 = Integer.parseInt(bufEntrada.readLine());

        prom = (c1 + c2 + c3) / 3.0;   

        System.out.println("El promedio es: " + prom);
    }
}
