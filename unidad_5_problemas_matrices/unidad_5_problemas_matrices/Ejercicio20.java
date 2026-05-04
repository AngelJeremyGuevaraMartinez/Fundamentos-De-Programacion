import java.io.*;

public class Ejercicio20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int base = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();

        int x = Integer.parseInt(a, base);
        int y = Integer.parseInt(b, base);

        int suma = x+y;

        System.out.println(Integer.toString(suma, base).toUpperCase());
    }
}