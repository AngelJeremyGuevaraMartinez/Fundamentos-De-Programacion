package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_12_a_while {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int factorial, num, i;
		System.out.println("introduzca un numero");
		num = Integer.parseInt(br.readLine());
		factorial = 1;
		i = num;
		while (i > 0) {
			factorial = factorial * i;
			i = i - 1;
			
		}
			System.out.println("el factorial de " + num + " es: " + factorial);
			
		// TODO Auto-generated method stub

	}

}
