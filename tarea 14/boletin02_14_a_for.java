package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_14_a_for {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sueldo, suma, mayor_1000, i;
		suma = 0;
		mayor_1000 = 0;
		for (i = 1; i <= 10; i++) {
			System.out.println("introduce un sueldo");
			sueldo = Integer.parseInt(br.readLine());
			if (sueldo > 1000) {
				mayor_1000 = mayor_1000 + 1;
				suma = suma + sueldo;
			}
		}
		System.out.println("mayores de 1000 hay: " + mayor_1000);
		System.out.println("la suma es de: " + suma);
		
		// TODO Auto-generated method stub

	}

}
