package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boletin02_02_a_while {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num;
			System.out.println("introduzca un numero");
			num = Integer.parseInt(br.readLine());
				while (num != 0) {
				if (num > 0) {
					System.out.println("es positivo");
				} else {
					System.out.println("es negativo");
				}
				System.out.println("introduzca otro numero");
				num = Integer.parseInt(br.readLine());
			}
		// TODO Auto-generated method stub

	}

}
