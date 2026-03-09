import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class tarea_7_5_a2243330342 {

	public static void main(String[] args) throws IOException  {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int ope1,ope2,op;
		float resultado;
		System.out.print("Ingrese el primer número: ");
		ope1 = Integer.parseInt(entrada.readLine());
		System.out.print("Ingrese el segundo número: ");
		ope2 = Integer.parseInt(entrada.readLine());
		System.out.println("menu de operaciones: ");
		System.out.println("1. Suma");
		System.out.println("2. multiplicación");
		System.out.println("3. división");
		op = Integer.parseInt(entrada.readLine());
		if(op==1) {
			resultado = ope1 + ope2;
			System.out.println("El resultado de la suma es: " + resultado);
		}
		else if(op==2) {
			resultado = ope1 * ope2;
			System.out.println("El resultado de la multiplicación es: " + resultado);
		}
		else if(op==3) {
			resultado = ope1 / ope2;
			System.out.println("El resultado de la división es: " + resultado);
		}
		 else {
			 System.out.println("Opción no válida");
		 }
		// TODO Auto-generated method stub

	}

}
