package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class boletin02_05_a_for {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num,n;
		System.out.println("introduzca un nu");
		n = Integer.parseInt(br.readLine());
		System.out.println("introduzca un numero");
		num = Integer.parseInt(br.readLine());
			for (; num != n; ) {
			if (num > n) {
				System.out.println("es menor");
			} else {
				System.out.println("es mayor");
			}
			System.out.println("introduzca otro numero");
			num = Integer.parseInt(br.readLine());
		}
		
		

	}

}
