package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_10_a_doWhile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, sumat = 0, i = 1;
		do {
			System.out.println("introduzca un numero");
			num = Integer.parseInt(br.readLine());
			sumat = sumat + num;
			i++;
		} while (i <= 15);
		// TODO Auto-generated method stub

	}

}
