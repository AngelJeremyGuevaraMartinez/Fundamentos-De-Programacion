package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_16_a_doWhile {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		int num, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("introduce un numero de 0 a 10");
			num = Integer.parseInt(br.readLine());
		} while (num < 0 || num >= 10);
		for (i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
		}
		
	}

}

