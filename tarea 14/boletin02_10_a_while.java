package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class boletin02_10_a_while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, sumat, i;
		sumat = 0;
		for (i = 1; i <= 15; i++) {
			System.out.println("introduzca un numero");
			num = Integer.parseInt(br.readLine());
			sumat = sumat + num;
		}
		System.out.println("la suma total es de: " + sumat);
		
	}

}
