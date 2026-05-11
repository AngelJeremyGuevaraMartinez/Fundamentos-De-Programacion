package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_08_a_while {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int i = 100;
			while (i >= 0) {
				System.out.println(i);
				i -= 7;
			}
		// TODO Auto-generated method stub

	}

}
