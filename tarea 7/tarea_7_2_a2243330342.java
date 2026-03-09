import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tarea_7_2_a2243330342 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("Ingrese un número: ");
		num = Integer.parseInt(entrada.readLine());
		if(num > 0) {
			System.out.println("El número es positivo");
		} else if(num < 0) {
			System.out.println("El número es negativo");
		} 

	}

}
