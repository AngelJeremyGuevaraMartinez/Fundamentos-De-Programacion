package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_09_a_doWhile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 100;
		do {
			System.out.println(i);
			i -= 7;
		} while (i >= 0);
		
		// TODO Auto-generated method stub

	}

}
