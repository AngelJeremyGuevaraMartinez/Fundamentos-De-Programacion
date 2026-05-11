package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boletin02_07_b_for {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int num, suma, elementos;
			double media;
			System.out.println("introduzca un numero");
			num = Integer.parseInt(br.readLine());
			suma = 0;
			elementos = 0;
			for (; num >= 0; ) {
				suma = suma + num;
				elementos = elementos + 1;
				System.out.println("introduzca otro numero");
				num = Integer.parseInt(br.readLine());
			}
			if (elementos > 0) {
				media = (double) suma / elementos;
				System.out.println("la media es : " + media);
			} else {
				System.out.println("no se han introducido numeros positivos");
			}
		// TODO Auto-generated method stub

	}

}
