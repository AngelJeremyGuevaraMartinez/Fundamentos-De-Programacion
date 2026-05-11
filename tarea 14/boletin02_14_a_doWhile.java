package tarea14;

import java.io.BufferedReader;
import java.io.IOException;
	import java.io.InputStreamReader;


	
public class boletin02_14_a_doWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sueldo, suma, mayor_1000, i;
		suma = 0;
		mayor_1000 = 0;
		i = 1;
		do {
			System.out.println("introduzca el sueldo del trabajador " + i);
			sueldo = Integer.parseInt(br.readLine());
			suma = suma + sueldo;
			if (sueldo > 1000) {
				mayor_1000 = mayor_1000 + 1;
			}
			i = i + 1;
		} while (i <= 10);
		System.out.println("mayores de 1000 hay: " + mayor_1000);
		System.out.println("la suma es de: " + suma);

	}

}
