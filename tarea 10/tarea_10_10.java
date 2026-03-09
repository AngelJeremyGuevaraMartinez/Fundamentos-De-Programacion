import java.util.Scanner;
public class tarea_10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		  int op,rango,cifra;
		  System.out.println("MENU DE HERRAMIENTAS");
		  System.out.println("1.Escanear Red");
		  System.out.println("2.Verificar Firewall");
		  System.out.println("3.Cifrar Mensaje");
		  System.out.println("4.Salir");
		  op=leer.nextInt();
		  switch (op) {
		  	case 1:
		  		System.out.println("escribe un rango	");
		  		rango=leer.nextInt();
		  		if (rango >0) {
		  			System.out.println("escaneo");
		  		} else {
		  			System.out.println("error");
		  		}
		  		break;
		  	case 2:
		  		System.out.println("Estado: Activo");
		  		break;
		  	case 3:
		  		System.out.println("ingrese cifra 1 o 2");
		  		cifra=leer.nextInt();
		  		if (cifra==1) {
		  			System.out.println("Cifrado César");
		  		} else if (cifra==2) {
		  			System.out.println( "Cifrado AES");
		  		}
		  		break;
		  	case 4:
		  		System.out.println("Cerrando sesión");
		  		break;
		  		
		  }

	}

}
