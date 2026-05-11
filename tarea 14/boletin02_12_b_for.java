package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_12_b_for {


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int factorial, num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("introduzca un numero");
		num = Integer.parseInt(br.readLine());
				
		factorial = 1;
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("el factorial de " + num + " es: " + factorial);
		

	}

}
