
package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_01_a_while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, cuadrado;
		System.out.println("introduzca un numero");
		num = Integer.parseInt(br.readLine());
			while (num >= 0) {
			cuadrado = num * num;
			System.out.println(num + " es igual a " + cuadrado);
			System.out.println("introduzca otro numero");
			num = Integer.parseInt(br.readLine());
		}

	}

}
