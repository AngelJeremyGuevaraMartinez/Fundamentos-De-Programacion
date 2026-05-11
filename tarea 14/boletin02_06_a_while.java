package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_06_a_while {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num, suma;
			suma = 0;
			do {
				System.out.println("introduzca un numero");
				num = Integer.parseInt(br.readLine());
				suma = suma + num;
			} while (num != 0);
			System.out.println("la suma de todos los numero es " + suma);
		// TODO Auto-generated method stub

	}

}
