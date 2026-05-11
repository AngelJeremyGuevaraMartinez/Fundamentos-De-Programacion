package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_13_a_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, contc, contp, contn, sumap, suman, i;
		double mediap, median;
		contc = 0;
		contp = 0;
		contn = 0;
		sumap = 0;
		suman = 0;
		for (i = 1; i <= 10; i++) {
			System.out.println("introduce un numero");
			try {
				num = Integer.parseInt(br.readLine());
				if (num == 0) {
					contc = contc + 1;
				} else {
					if (num > 0) {
						contp = contp + 1;
						sumap = sumap + num;
					} else {
						contn = contn + 1;
						suman = suman + num;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("el numero de ceros es de : " + contc);
		if (contp == 0) {
			System.out.println("no se puede hacer la media de los positivos");
		} else {
			mediap = (double) sumap / contp;
			System.out.println("media de los positivos: " + mediap);
		}
		if (contn == 0) {
			System.out.println("no se puede hacer la media de los negativos");
		} else {
			median = (double) suman / contn;
			System.out.println("media de los negativos: " + median);
		}
		

		
	}

}
