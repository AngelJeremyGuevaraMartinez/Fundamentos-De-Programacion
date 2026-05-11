package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_10_a_for {

	public static void main(String[] args)  throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num, sumat = 0;
			for (int i = 1; i <= 15; i++) {
				System.out.println("introduzca un numero");
				num = Integer.parseInt(br.readLine());
				sumat += num;
			}
			System.out.println("la suma total es de: " + sumat);
		// TODO Auto-generated method stub

	}

}
