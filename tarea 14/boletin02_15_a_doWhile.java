package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_15_a_doWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, edad, mayor_edad, mayor_175;
		double altura, suma_edad, suma_alt, media_edad, media_altura;
		mayor_edad = 0;
		mayor_175 = 0;
		suma_edad = 0;
		suma_alt = 0;
		i = 1;
		do {
			System.out.println("Alumno " + i);
			System.out.println("Introduzca edad: ");
			edad = Integer.parseInt(br.readLine());
			System.out.println("Introduzca altura: ");
			altura = Double.parseDouble(br.readLine());
			if (edad > 18) {
				mayor_edad = mayor_edad + 1;
			}
			if (altura > 1.75) {
				mayor_175 = mayor_175 + 1;
			}
			suma_edad = suma_edad + edad;
			suma_alt = suma_alt + altura;
			i = i + 1;
		} while (i <= 5);
		media_edad = suma_edad / 5;
		media_altura = suma_alt / 5;
		System.out.println("La edad media es: " + media_edad);
		System.out.println("La altura media es: " + media_altura);
		System.out.println("Mayores de 18 años: " + mayor_edad);
		System.out.println("Mayores de 1.75 m: " + mayor_175);
		
		

	}

}
