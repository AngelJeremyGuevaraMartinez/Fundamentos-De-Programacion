package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_14_a_while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sueldo, suma, mayor_1000, i = 0;
		suma = 0;
		mayor_1000 = 0;
		while (i < 10) {
			System.out.println("introduce un sueldo");
			sueldo = Integer.parseInt(br.readLine());
			if (sueldo > 1000) {
				mayor_1000 = mayor_1000 + 1;
				suma = suma + sueldo;
			}
			i = i + 1;
		}
		System.out.println("mayores de 1000 hay: " + mayor_1000);
		System.out.println("la suma es de: " + suma);
		

	}

}
