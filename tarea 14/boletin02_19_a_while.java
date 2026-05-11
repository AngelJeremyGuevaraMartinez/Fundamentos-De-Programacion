package tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boletin02_19_a_while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, nota, aprobados, suspensos, condicionados;
		aprobados = 0;
		suspensos = 0;
		condicionados = 0;
		i = 1;
		while (i <= 6) {
			System.out.println("Introduce nota entre 0 y 10: ");
			nota = Integer.parseInt(br.readLine());
			
			if (nota == 4) {
				condicionados = condicionados + 1;
			} else {
				if (nota >= 5) {
					aprobados = aprobados + 1;
				} else {
					suspensos = suspensos + 1;
				}
			}
			i = i + 1;
		}
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Suspensos: " + suspensos);
		System.out.println("Condicionados: " + condicionados);
		

	}

}
