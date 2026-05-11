package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_12_a_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorial, num, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("introduzca un numero");
		factorial = 1;
		do {
			try {
				num = Integer.parseInt(br.readLine());
				i = num;
				while (i > 0) {
					factorial = factorial * i;
					i = i - 1;
				}
				System.out.println("el factorial de " + num + " es: " + factorial);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (false);

	}

}
