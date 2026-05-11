package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_16_a_for {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for (i = 1; i <= 10; i++) {
	System.out.println("introduce un numero de 0 a 10");
	num = Integer.parseInt(br.readLine());
	if (num >= 0 && num < 10) {
		for (i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
		}
		break;
	} else {
		System.out.println("el numero introducido no es correcto");
	}
	
}
	

	}

}
