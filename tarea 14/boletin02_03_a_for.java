package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class boletin02_03_a_for {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 				int num;
 				System.out.println("introduzca un numero");
 				num = Integer.parseInt(br.readLine());
 					for (; num != 0; ) {
 					if (num % 2 == 0) {
 						System.out.println("es par");
 					} else {
 						System.out.println("es impar");
 					}
 					System.out.println("introduzca otro numero");
 					num = Integer.parseInt(br.readLine());
 				}
	}

}
