package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_20_a_while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, n;
		double sueldo, sueldo_max;
		sueldo_max = 0;
		System.out.println("Numero de sueldos: ");
		n = Integer.parseInt(br.readLine());

		i = 1;
		while (i <= n) {
			System.out.println("Introduce sueldo: ");
			sueldo = Double.parseDouble(br.readLine());

			if (sueldo > sueldo_max) {
				sueldo_max = sueldo;
			}
			i++;
		}
		System.out.println("El sueldo maximo es: " + sueldo_max);
		

	}

}
