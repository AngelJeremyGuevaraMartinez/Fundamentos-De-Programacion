import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class tarea_7_4_a2243330342 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 		float calf;
 		int cal1,cal2,cal3;
 		System.out.print("Ingrese la primera calificación: ");
 		cal1 = Integer.parseInt(entrada.readLine());
 		System.out.print("Ingrese la segunda calificación: ");
 			cal2 = Integer.parseInt(entrada.readLine());
 			System.out.print("Ingrese la tercera calificación: ");
 			cal3 = Integer.parseInt(entrada.readLine());
 			calf = (cal1 + cal2 + cal3)/3;
 			if(calf >= 7) {
 				System.out.println("El alumno aprobó con una calificación de: " + calf);
 			} else {
 				System.out.println("El alumno reprobó con una calificación de: " + calf);
 			}
	}

}
