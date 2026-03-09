

import java.util.Scanner;
public class tarea_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);

  int ip;
  System.out.println("Ingrese la ip");
  ip=leer.nextInt();
  if (ip >= 1 && ip <= 126) {
	  System.out.println("Clase A");
  } else if (ip >= 123 && ip <= 191) {
	  System.out.println("Clase B");
  } else if (ip >= 192 && ip <= 223) {
	  System.out.println("Clase C");
  } else if (ip == 127) {
	  System.out.println("Direccion de loopback");
  } else if (ip > 223) {
	  System.out.println("Clase especial o reservada");
  }
  


	}

}
