package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class boletin02_05_a_doWhile {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// TODO Auto-generated method stub
		int num, n;
		System.out.println("introduce n");
		n = Integer.parseInt(br.readLine());
		System.out.println("introduce numero");
		num = Integer.parseInt(br.readLine());
		do {
			if (num > n) {
				System.out.println("menor");
			} else if (num < n) {
				System.out.println("mayor");
			}
			System.out.println("introduce numero");
			num = Integer.parseInt(br.readLine());
		} while (num != n);

	}

}
