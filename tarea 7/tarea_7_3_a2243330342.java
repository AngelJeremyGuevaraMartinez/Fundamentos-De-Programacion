import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tarea_7_3_a2243330342 {
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("Ingrese un número: ");
		num = Integer.parseInt(entrada.readLine());
		if (num > 0 && num <= 9) {
		System.out.println("El número es de un dígito");
		}else {
			System.out.println("El número no es de un dígito");
			
		}	
		}
	}


