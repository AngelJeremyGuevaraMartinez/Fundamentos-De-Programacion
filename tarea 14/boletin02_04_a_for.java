package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_04_a_for {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num, contador;
			System.out.println("introduzca un numero");
			num = Integer.parseInt(br.readLine());
			contador = 0;
			for (; num > 0; ) {
				contador = contador + 1;
				System.out.println("introduzca un numero");
				num = Integer.parseInt(br.readLine());
			}
			System.out.println("se ha introducido : " + contador + " numeros");
		// TODO Auto-generated method stub

	}

}
