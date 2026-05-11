package tarea14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class boletin02_05_a_while {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, n;
		System.out.println("introduzca n");
		n = Integer.parseInt(br.readLine());
		System.out.println("introduzca numero");
		num = Integer.parseInt(br.readLine());
		while (num != n) {
			if (num > n) {
				System.out.println("menor");
			} else {
				System.out.println("mayor");
			}
			System.out.println("introduzca numero");
			num = Integer.parseInt(br.readLine());
		}
		// TODO Auto-generated method stub

	}

}
