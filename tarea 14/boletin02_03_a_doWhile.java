package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
	import java.io.InputStreamReader;
	

public class boletin02_03_a_doWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		do {
			System.out.println("introduzca un numero");
			num = Integer.parseInt(br.readLine());
			if (num != 0) {
				if (num % 2 == 0) {
					System.out.println("es par");
				} else {
					System.out.println("es impar");
				}
			}
		} while (num != 0);

	}

}
