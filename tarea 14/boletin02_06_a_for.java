package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_06_a_for {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, suma;
		suma = 0;
		for (;;) {
			System.out.println("introduzca un numero");
			num = Integer.parseInt(br.readLine());
			if (num == 0) {
				break;
			}
			suma = suma + num;
		}
		System.out.println("la suma de todos los numero es " + suma);
		

	}

}
