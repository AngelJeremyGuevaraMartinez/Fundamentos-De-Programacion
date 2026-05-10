import java.io.*;

public class problema_3 {

    public static void main(String args[]) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

        double c;
        double f;

        System.out.println("Dame los grados Celsius:");
        c = Double.parseDouble(bufEntrada.readLine());

        f = (9.0 / 5.0) * c + 32;   

        System.out.println("Los grados Celsius " + c + " son " + f + " Fahrenheit");
    }
}
