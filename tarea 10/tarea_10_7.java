
import java.util.Scanner;
public class tarea_10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		  int accion,riesgo;
		  System.out.println("Ingrese la accion (1=Permitir, 2=Descartar, 3=Aislar):");
		  accion=leer.nextInt();
		  
		  System.out.println("Ingrese el nivel de riesgo (1-10):");
		  riesgo=leer.nextInt();
		  
		  switch (accion) {
		  	case 1:
		  		if (riesgo > 7) {
		  			System.out.println("Advertencia: tráfico peligroso");
		  		} else {
		  			System.out.println("Tráfico seguro");
		  		}
		  		break;
		  	case 2:
		  		System.out.println("Paquete descartado");
		  		break;
		  	case 3:
		  		System.out.println("Paquete aislado para análisis");
		  		break;
		  	default:
		  		System.out.println("Acción no válida");
		  }

	}

}
