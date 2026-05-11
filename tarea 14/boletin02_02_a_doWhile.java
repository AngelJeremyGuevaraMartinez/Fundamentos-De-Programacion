package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class boletin02_02_a_doWhile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("introduzca un numero");
		num = Integer.parseInt(br.readLine());
			do {
			if (num > 0) {
				System.out.println("es positivo");
			} else if (num < 0) {
				System.out.println("es negativo");
			} else {
				System.out.println("es cero");
			}
			System.out.println("introduzca otro numero");
			num = Integer.parseInt(br.readLine());
		} while (num != 0);
		// TODO Auto-generated method stub

	}

}
