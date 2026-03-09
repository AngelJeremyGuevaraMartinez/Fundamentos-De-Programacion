import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tarea_7_1_a2243330342 {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num;
		float resultado;
		System.out.print("Ingrese un número: ");
		num = Integer.parseInt(entrada.readLine());
	    resultado = num%2;
		if(resultado == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
}

	}

}
