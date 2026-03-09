

import java.util.Scanner;

public class tarea_10_4 {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
		 
		  int octeto1,octeto2;
		  System.out.println("Ingrese el segundo octeto:");
		  octeto1=leer.nextInt();
		  
		  System.out.println("Ingrese el tercer octeto:");
		  octeto2=leer.nextInt();
		  
		  if (octeto1 == 0) {
			  if (octeto2 == 5) {
				  System.out.println("Acceso concedido a contabilidad");
			  } else {
				  System.out.println("Acceso denegado: subred incorrecta");
			  }
		  } else {
			  if (octeto1 != 0) {
				  System.out.println("Acceso denegado: red externa");
			  }
		  }
		// TODO Auto-generated method stub

	}

}
