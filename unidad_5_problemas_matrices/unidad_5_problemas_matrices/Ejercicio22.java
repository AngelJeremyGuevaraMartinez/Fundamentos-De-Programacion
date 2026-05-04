import java.io.*;

public class Ejercicio22 {

    public static void ulam(int n) {
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
        }
        System.out.println("1");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cantidad = Integer.parseInt(br.readLine());

        for (int i = 0; i < cantidad; i++) {
            int num = Integer.parseInt(br.readLine());
            ulam(num);
        }
    }
}