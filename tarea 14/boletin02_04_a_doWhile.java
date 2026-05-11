package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class boletin02_04_a_doWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, contador;
		 System.out.println("introduzca un numero");
		 num = Integer.parseInt(br.readLine());
		 contador = 0;
		 do {
			 if (num > 0) {
				 contador = contador + 1;
			 }
			 System.out.println("introduzca un numero");
			 num = Integer.parseInt(br.readLine());
		 } while (num > 0);

	}

}
